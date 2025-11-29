/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2019 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.jnj.gt.pcm.integration.util.impl;

import com.google.gson.JsonObject;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.*;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.ssl.TrustStrategy;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.client5.http.socket.ConnectionSocketFactory;
import org.apache.log4j.Logger;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jnj.gt.pcm.integration.constants.JnjpcmfacadeConstants;
import com.jnj.gt.pcm.integration.util.JnjPCMCommonFacadeUtil;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import org.apache.hc.client5.http.socket.PlainConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;

import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import javax.net.ssl.SSLContext;

import static com.google.gson.JsonParser.*;


/**
 * This class handles the util functions and common methods to connect to P360 API
 *
 */
public class DefaultJnjPCMCommonFacadeUtil implements JnjPCMCommonFacadeUtil
{
	private static final Logger LOGGER = Logger.getLogger(DefaultJnjPCMCommonFacadeUtil.class);

	private ConfigurationService configurationService;
	private CatalogVersionService catalogVersionService;

	@Override
	public String getStartDate()
	{
		String startDate;
		if (configurationService.getConfiguration()
				.getBoolean(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_BACKDATE_FLAG))
		{
			startDate = configurationService.getConfiguration()
					.getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_BACKDATE);
		}
		else
		{
			final String dateFrequency = configurationService.getConfiguration()
					.getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_FREQUENCY);
			final Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_MONTH, (-(Integer.parseInt(dateFrequency))));
			final Date dateAndTime = calendar.getTime();
			final DateFormat dateFormat = new SimpleDateFormat(JnjpcmfacadeConstants.PCMIntegration.DATE_FORMAT);
			startDate = dateFormat.format(dateAndTime);
		}

		return startDate;
	}

    @Override
    public String getAccessToken()
    {
        String accessToken = "";

        final String username = configurationService.getConfiguration()
                .getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_USERNAME);
        final String password = configurationService.getConfiguration()
                .getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_PASSWORD);
        final String clientId = configurationService.getConfiguration()
                .getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_CLIENT_ID);
        final String clientSecret = configurationService.getConfiguration()
                .getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_CLIENT_SECRET);
        final String authUrl = configurationService.getConfiguration()
                .getString(JnjpcmfacadeConstants.PCMIntegration.PCM_INTEGRATION_JOB_ACCESS_TOKEN_URL);

        try
        {
            // 1. Trust-all SSL context
            SSLContext sslContext = SSLContexts.custom()
                    .loadTrustMaterial((chain, authType) -> true)
                    .build();

            // 2. Create SSL factory for HttpClient 5
            SSLConnectionSocketFactory sslFactory =
                    new SSLConnectionSocketFactory(sslContext);

            // 3. Register http + https handling
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("https", sslFactory)
                    .register("http", PlainConnectionSocketFactory.INSTANCE)
                    .build();

            // 4. Connection manager
            PoolingHttpClientConnectionManager cm =
                    new PoolingHttpClientConnectionManager(registry);

            // 5. Build HttpClient with the connection manager
            try (CloseableHttpClient httpClient = HttpClients.custom()
                    .setConnectionManager(cm)
                    .build())
            {
                HttpPost post = new HttpPost(authUrl);
                post.setHeader("Content-Type", "application/x-www-form-urlencoded");

                List<NameValuePair> params = new ArrayList<>();
                params.add(new BasicNameValuePair("grant_type", "password"));
                params.add(new BasicNameValuePair("username", username));
                params.add(new BasicNameValuePair("password", password));
                params.add(new BasicNameValuePair("client_id", clientId));
                params.add(new BasicNameValuePair("client_secret", clientSecret));

                post.setEntity(new UrlEncodedFormEntity(params, StandardCharsets.UTF_8));

                try (CloseableHttpResponse response = httpClient.execute(post))
                {
                    String json = EntityUtils.toString(response.getEntity());
                    JsonParser parser = new JsonParser();
                    JsonElement element = parser.parse(json);
                    JsonObject obj = element.getAsJsonObject();

                    accessToken = obj.get("access_token").getAsString();
                }
            }
        }
        catch (Exception e)
        {
            LOGGER.error("Error fetching access token", e);
        }

        return accessToken;
    }


    protected SSLConnectionSocketFactory createSSLCSocketFactoryObject(final TrustStrategy trustStrategy)
	{
		SSLConnectionSocketFactory sslsf = null;
		try
		{
			final SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(trustStrategy);
			sslsf = new SSLConnectionSocketFactory(builder.build());
		}
		catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e)
		{
			LOGGER.error(e);
		}
		return sslsf;
	}


	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}

	public CatalogVersionService getCatalogVersionService()
	{
		return catalogVersionService;
	}

	public void setCatalogVersionService(final CatalogVersionService catalogVersionService)
	{
		this.catalogVersionService = catalogVersionService;
	}


}
