/*
 * Copyright: Copyright © 2019
 * This file contains trade secrets of Johnson & Johnson. No part may be reproduced or transmitted in any
 * form by any means or for any purpose without the express written permission of Johnson & Johnson.
 */
package com.jnj.b2b.storefront.security.filters;

import org.apache.commons.httpclient.HttpsURL;
import org.apache.http.client.utils.URIBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class JnJRedirectFilter extends GenericFilterBean {

    private static final Logger LOG = Logger.getLogger(JnJRedirectFilter.class);
    private static final String HTTP = "http";
    private static final String HTTPS = "https";

    private Integer securePort;
    private boolean redirectionEnabled;

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        if (this.mustRedirect(request)) {
            this.redirectToHttps((HttpServletRequest) request, (HttpServletResponse) response);
        }
        chain.doFilter(request, response);
    }

    private boolean mustRedirect(final ServletRequest request) {
        return this.redirectionEnabled && HTTP.equals(request.getScheme());
    }

    private void redirectToHttps(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        final String url = request.getRequestURL().toString();

        try {
            final String secureUrl = this.createSecureUrl(url);
            LOG.debug("HTTP access found! Redirecting to secure URL: " + secureUrl);
            response.sendRedirect(secureUrl);
        } catch (final URISyntaxException e) {
            LOG.error("Cannot parse url " + url, e);
        }
    }

    private String createSecureUrl(final String url) throws URISyntaxException {
        final URIBuilder builder = new URIBuilder(url);
        builder.setScheme(HTTPS);
        this.configurePort(builder);
        return builder.toString();
    }

    private void configurePort(final URIBuilder builder) {
        if (Objects.isNull(this.securePort)) {
            builder.setPort(HttpsURL.DEFAULT_PORT);
        } else {
            builder.setPort(this.securePort);
        }
    }

    @Required
    public void setSecurePort(final String securePort) {
        try {
            this.securePort = Integer.valueOf(securePort);
        } catch(final NumberFormatException e) {
            LOG.error("Invalid value for property 'redirect.to.https.port'.", e);
        }
    }

    @Required
    public void setRedirectionEnabled(final String redirectionEnabled) {
        this.redirectionEnabled = Boolean.valueOf(redirectionEnabled);
    }

}