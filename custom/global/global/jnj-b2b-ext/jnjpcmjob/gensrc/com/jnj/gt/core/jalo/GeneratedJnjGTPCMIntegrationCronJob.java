/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.core.jalo;

import com.jnj.gt.pcm.integration.constants.JnjpcmjobConstants;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.core.jalo.JnjGTPCMIntegrationCronJob JnjGTPCMIntegrationCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTPCMIntegrationCronJob extends CronJob
{
	/** Qualifier of the <code>JnjGTPCMIntegrationCronJob.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>JnjGTPCMIntegrationCronJob.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	/** Qualifier of the <code>JnjGTPCMIntegrationCronJob.sector</code> attribute **/
	public static final String SECTOR = "sector";
	/** Qualifier of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute **/
	public static final String ISREGIONJOB = "isRegionJob";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		tmp.put(SECTOR, AttributeMode.INITIAL);
		tmp.put(ISREGIONJOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final String value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute.
	 * @return the isRegionJob
	 */
	public Boolean isIsRegionJob(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISREGIONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute.
	 * @return the isRegionJob
	 */
	public Boolean isIsRegionJob()
	{
		return isIsRegionJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @return the isRegionJob
	 */
	public boolean isIsRegionJobAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsRegionJob( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @return the isRegionJob
	 */
	public boolean isIsRegionJobAsPrimitive()
	{
		return isIsRegionJobAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @param value the isRegionJob
	 */
	public void setIsRegionJob(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISREGIONJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @param value the isRegionJob
	 */
	public void setIsRegionJob(final Boolean value)
	{
		setIsRegionJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @param value the isRegionJob
	 */
	public void setIsRegionJob(final SessionContext ctx, final boolean value)
	{
		setIsRegionJob( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.isRegionJob</code> attribute. 
	 * @param value the isRegionJob
	 */
	public void setIsRegionJob(final boolean value)
	{
		setIsRegionJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTPCMIntegrationCronJob.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector()
	{
		return getSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTPCMIntegrationCronJob.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final String value)
	{
		setSector( getSession().getSessionContext(), value );
	}
	
}
