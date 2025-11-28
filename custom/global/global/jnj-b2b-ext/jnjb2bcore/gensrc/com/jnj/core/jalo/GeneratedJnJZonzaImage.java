/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJZonzaImage}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJZonzaImage extends GenericItem
{
	/** Qualifier of the <code>JnJZonzaImage.upc</code> attribute **/
	public static final String UPC = "upc";
	/** Qualifier of the <code>JnJZonzaImage.mainImageAssetUrl</code> attribute **/
	public static final String MAINIMAGEASSETURL = "mainImageAssetUrl";
	/** Qualifier of the <code>JnJZonzaImage.assetUrl</code> attribute **/
	public static final String ASSETURL = "assetUrl";
	/** Qualifier of the <code>JnJZonzaImage.leadCountry</code> attribute **/
	public static final String LEADCOUNTRY = "leadCountry";
	/** Qualifier of the <code>JnJZonzaImage.supportingImagesUrl</code> attribute **/
	public static final String SUPPORTINGIMAGESURL = "supportingImagesUrl";
	/** Qualifier of the <code>JnJZonzaImage.isMainImage</code> attribute **/
	public static final String ISMAINIMAGE = "isMainImage";
	/** Qualifier of the <code>JnJZonzaImage.retryCount</code> attribute **/
	public static final String RETRYCOUNT = "retryCount";
	/** Qualifier of the <code>JnJZonzaImage.status</code> attribute **/
	public static final String STATUS = "status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UPC, AttributeMode.INITIAL);
		tmp.put(MAINIMAGEASSETURL, AttributeMode.INITIAL);
		tmp.put(ASSETURL, AttributeMode.INITIAL);
		tmp.put(LEADCOUNTRY, AttributeMode.INITIAL);
		tmp.put(SUPPORTINGIMAGESURL, AttributeMode.INITIAL);
		tmp.put(ISMAINIMAGE, AttributeMode.INITIAL);
		tmp.put(RETRYCOUNT, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.assetUrl</code> attribute.
	 * @return the assetUrl
	 */
	public String getAssetUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSETURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.assetUrl</code> attribute.
	 * @return the assetUrl
	 */
	public String getAssetUrl()
	{
		return getAssetUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.assetUrl</code> attribute. 
	 * @param value the assetUrl
	 */
	public void setAssetUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSETURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.assetUrl</code> attribute. 
	 * @param value the assetUrl
	 */
	public void setAssetUrl(final String value)
	{
		setAssetUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.isMainImage</code> attribute.
	 * @return the isMainImage
	 */
	public Boolean isIsMainImage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISMAINIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.isMainImage</code> attribute.
	 * @return the isMainImage
	 */
	public Boolean isIsMainImage()
	{
		return isIsMainImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @return the isMainImage
	 */
	public boolean isIsMainImageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsMainImage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @return the isMainImage
	 */
	public boolean isIsMainImageAsPrimitive()
	{
		return isIsMainImageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @param value the isMainImage
	 */
	public void setIsMainImage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISMAINIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @param value the isMainImage
	 */
	public void setIsMainImage(final Boolean value)
	{
		setIsMainImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @param value the isMainImage
	 */
	public void setIsMainImage(final SessionContext ctx, final boolean value)
	{
		setIsMainImage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.isMainImage</code> attribute. 
	 * @param value the isMainImage
	 */
	public void setIsMainImage(final boolean value)
	{
		setIsMainImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.leadCountry</code> attribute.
	 * @return the leadCountry
	 */
	public String getLeadCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEADCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.leadCountry</code> attribute.
	 * @return the leadCountry
	 */
	public String getLeadCountry()
	{
		return getLeadCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.leadCountry</code> attribute. 
	 * @param value the leadCountry
	 */
	public void setLeadCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEADCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.leadCountry</code> attribute. 
	 * @param value the leadCountry
	 */
	public void setLeadCountry(final String value)
	{
		setLeadCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.mainImageAssetUrl</code> attribute.
	 * @return the mainImageAssetUrl
	 */
	public String getMainImageAssetUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAINIMAGEASSETURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.mainImageAssetUrl</code> attribute.
	 * @return the mainImageAssetUrl
	 */
	public String getMainImageAssetUrl()
	{
		return getMainImageAssetUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.mainImageAssetUrl</code> attribute. 
	 * @param value the mainImageAssetUrl
	 */
	public void setMainImageAssetUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAINIMAGEASSETURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.mainImageAssetUrl</code> attribute. 
	 * @param value the mainImageAssetUrl
	 */
	public void setMainImageAssetUrl(final String value)
	{
		setMainImageAssetUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.retryCount</code> attribute.
	 * @return the retryCount
	 */
	public Integer getRetryCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETRYCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.retryCount</code> attribute.
	 * @return the retryCount
	 */
	public Integer getRetryCount()
	{
		return getRetryCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @return the retryCount
	 */
	public int getRetryCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRetryCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @return the retryCount
	 */
	public int getRetryCountAsPrimitive()
	{
		return getRetryCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @param value the retryCount
	 */
	public void setRetryCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETRYCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @param value the retryCount
	 */
	public void setRetryCount(final Integer value)
	{
		setRetryCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @param value the retryCount
	 */
	public void setRetryCount(final SessionContext ctx, final int value)
	{
		setRetryCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.retryCount</code> attribute. 
	 * @param value the retryCount
	 */
	public void setRetryCount(final int value)
	{
		setRetryCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.supportingImagesUrl</code> attribute.
	 * @return the supportingImagesUrl
	 */
	public String getSupportingImagesUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPORTINGIMAGESURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.supportingImagesUrl</code> attribute.
	 * @return the supportingImagesUrl
	 */
	public String getSupportingImagesUrl()
	{
		return getSupportingImagesUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.supportingImagesUrl</code> attribute. 
	 * @param value the supportingImagesUrl
	 */
	public void setSupportingImagesUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPORTINGIMAGESURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.supportingImagesUrl</code> attribute. 
	 * @param value the supportingImagesUrl
	 */
	public void setSupportingImagesUrl(final String value)
	{
		setSupportingImagesUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.upc</code> attribute.
	 * @return the upc
	 */
	public String getUpc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJZonzaImage.upc</code> attribute.
	 * @return the upc
	 */
	public String getUpc()
	{
		return getUpc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.upc</code> attribute. 
	 * @param value the upc
	 */
	public void setUpc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJZonzaImage.upc</code> attribute. 
	 * @param value the upc
	 */
	public void setUpc(final String value)
	{
		setUpc( getSession().getSessionContext(), value );
	}
	
}
