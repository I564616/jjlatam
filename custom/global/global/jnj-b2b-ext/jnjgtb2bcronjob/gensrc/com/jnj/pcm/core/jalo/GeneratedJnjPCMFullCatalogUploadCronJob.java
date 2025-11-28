/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.pcm.core.jalo;

import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.pcm.core.jalo.JnjPCMFullCatalogUploadCronJob JnjPCMFullCatalogUploadCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMFullCatalogUploadCronJob extends CronJob
{
	/** Qualifier of the <code>JnjPCMFullCatalogUploadCronJob.processedCountries</code> attribute **/
	public static final String PROCESSEDCOUNTRIES = "processedCountries";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PROCESSEDCOUNTRIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMFullCatalogUploadCronJob.processedCountries</code> attribute.
	 * @return the processedCountries
	 */
	public EnumerationValue getProcessedCountries(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PROCESSEDCOUNTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMFullCatalogUploadCronJob.processedCountries</code> attribute.
	 * @return the processedCountries
	 */
	public EnumerationValue getProcessedCountries()
	{
		return getProcessedCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMFullCatalogUploadCronJob.processedCountries</code> attribute. 
	 * @param value the processedCountries
	 */
	public void setProcessedCountries(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PROCESSEDCOUNTRIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMFullCatalogUploadCronJob.processedCountries</code> attribute. 
	 * @param value the processedCountries
	 */
	public void setProcessedCountries(final EnumerationValue value)
	{
		setProcessedCountries( getSession().getSessionContext(), value );
	}
	
}
