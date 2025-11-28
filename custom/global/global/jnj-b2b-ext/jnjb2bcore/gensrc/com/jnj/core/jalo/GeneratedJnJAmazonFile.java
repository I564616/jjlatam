/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJAmazonFile}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJAmazonFile extends GenericItem
{
	/** Qualifier of the <code>JnJAmazonFile.objectKey</code> attribute **/
	public static final String OBJECTKEY = "objectKey";
	/** Qualifier of the <code>JnJAmazonFile.uRL</code> attribute **/
	public static final String URL = "uRL";
	/** Qualifier of the <code>JnJAmazonFile.fullExport</code> attribute **/
	public static final String FULLEXPORT = "fullExport";
	/** Qualifier of the <code>JnJAmazonFile.creationDate</code> attribute **/
	public static final String CREATIONDATE = "creationDate";
	/** Qualifier of the <code>JnJAmazonFile.size</code> attribute **/
	public static final String SIZE = "size";
	/** Qualifier of the <code>JnJAmazonFile.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnJAmazonFile.catalogForCountry</code> attribute **/
	public static final String CATALOGFORCOUNTRY = "catalogForCountry";
	/** Qualifier of the <code>JnJAmazonFile.imageType</code> attribute **/
	public static final String IMAGETYPE = "imageType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OBJECTKEY, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(FULLEXPORT, AttributeMode.INITIAL);
		tmp.put(CREATIONDATE, AttributeMode.INITIAL);
		tmp.put(SIZE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(CATALOGFORCOUNTRY, AttributeMode.INITIAL);
		tmp.put(IMAGETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.catalogForCountry</code> attribute.
	 * @return the catalogForCountry - This attribute is used to store the value of the country for which the full export data is created.
	 */
	public Country getCatalogForCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, CATALOGFORCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.catalogForCountry</code> attribute.
	 * @return the catalogForCountry - This attribute is used to store the value of the country for which the full export data is created.
	 */
	public Country getCatalogForCountry()
	{
		return getCatalogForCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.catalogForCountry</code> attribute. 
	 * @param value the catalogForCountry - This attribute is used to store the value of the country for which the full export data is created.
	 */
	public void setCatalogForCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, CATALOGFORCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.catalogForCountry</code> attribute. 
	 * @param value the catalogForCountry - This attribute is used to store the value of the country for which the full export data is created.
	 */
	public void setCatalogForCountry(final Country value)
	{
		setCatalogForCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public Date getCreationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public Date getCreationDate()
	{
		return getCreationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CREATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final Date value)
	{
		setCreationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.fullExport</code> attribute.
	 * @return the fullExport
	 */
	public Boolean isFullExport(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FULLEXPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.fullExport</code> attribute.
	 * @return the fullExport
	 */
	public Boolean isFullExport()
	{
		return isFullExport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @return the fullExport
	 */
	public boolean isFullExportAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFullExport( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @return the fullExport
	 */
	public boolean isFullExportAsPrimitive()
	{
		return isFullExportAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @param value the fullExport
	 */
	public void setFullExport(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FULLEXPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @param value the fullExport
	 */
	public void setFullExport(final Boolean value)
	{
		setFullExport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @param value the fullExport
	 */
	public void setFullExport(final SessionContext ctx, final boolean value)
	{
		setFullExport( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.fullExport</code> attribute. 
	 * @param value the fullExport
	 */
	public void setFullExport(final boolean value)
	{
		setFullExport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.imageType</code> attribute.
	 * @return the imageType - This attribute is used to store the value of the type of the image format that is associated with current entry.
	 */
	public String getImageType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IMAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.imageType</code> attribute.
	 * @return the imageType - This attribute is used to store the value of the type of the image format that is associated with current entry.
	 */
	public String getImageType()
	{
		return getImageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.imageType</code> attribute. 
	 * @param value the imageType - This attribute is used to store the value of the type of the image format that is associated with current entry.
	 */
	public void setImageType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IMAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.imageType</code> attribute. 
	 * @param value the imageType - This attribute is used to store the value of the type of the image format that is associated with current entry.
	 */
	public void setImageType(final String value)
	{
		setImageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.objectKey</code> attribute.
	 * @return the objectKey
	 */
	public String getObjectKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.objectKey</code> attribute.
	 * @return the objectKey
	 */
	public String getObjectKey()
	{
		return getObjectKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.objectKey</code> attribute. 
	 * @param value the objectKey
	 */
	public void setObjectKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.objectKey</code> attribute. 
	 * @param value the objectKey
	 */
	public void setObjectKey(final String value)
	{
		setObjectKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.size</code> attribute.
	 * @return the size
	 */
	public Double getSize(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.size</code> attribute.
	 * @return the size
	 */
	public Double getSize()
	{
		return getSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @return the size
	 */
	public double getSizeAsPrimitive(final SessionContext ctx)
	{
		Double value = getSize( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @return the size
	 */
	public double getSizeAsPrimitive()
	{
		return getSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @param value the size
	 */
	public void setSize(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @param value the size
	 */
	public void setSize(final Double value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @param value the size
	 */
	public void setSize(final SessionContext ctx, final double value)
	{
		setSize( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.size</code> attribute. 
	 * @param value the size
	 */
	public void setSize(final double value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.uRL</code> attribute.
	 * @return the uRL
	 */
	public String getURL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJAmazonFile.uRL</code> attribute.
	 * @return the uRL
	 */
	public String getURL()
	{
		return getURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.uRL</code> attribute. 
	 * @param value the uRL
	 */
	public void setURL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJAmazonFile.uRL</code> attribute. 
	 * @param value the uRL
	 */
	public void setURL(final String value)
	{
		setURL( getSession().getSessionContext(), value );
	}
	
}
