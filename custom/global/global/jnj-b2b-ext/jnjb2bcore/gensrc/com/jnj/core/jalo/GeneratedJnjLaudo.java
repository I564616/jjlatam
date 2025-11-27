/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjLaudo}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjLaudo extends GenericItem
{
	/** Qualifier of the <code>JnjLaudo.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>JnjLaudo.laudoNumber</code> attribute **/
	public static final String LAUDONUMBER = "laudoNumber";
	/** Qualifier of the <code>JnjLaudo.fileMedia</code> attribute **/
	public static final String FILEMEDIA = "fileMedia";
	/** Qualifier of the <code>JnjLaudo.writeStatus</code> attribute **/
	public static final String WRITESTATUS = "writeStatus";
	/** Qualifier of the <code>JnjLaudo.readStatus</code> attribute **/
	public static final String READSTATUS = "readStatus";
	/** Qualifier of the <code>JnjLaudo.expirationDate</code> attribute **/
	public static final String EXPIRATIONDATE = "expirationDate";
	/** Qualifier of the <code>JnjLaudo.fileName</code> attribute **/
	public static final String FILENAME = "fileName";
	/** Qualifier of the <code>JnjLaudo.country</code> attribute **/
	public static final String COUNTRY = "country";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(LAUDONUMBER, AttributeMode.INITIAL);
		tmp.put(FILEMEDIA, AttributeMode.INITIAL);
		tmp.put(WRITESTATUS, AttributeMode.INITIAL);
		tmp.put(READSTATUS, AttributeMode.INITIAL);
		tmp.put(EXPIRATIONDATE, AttributeMode.INITIAL);
		tmp.put(FILENAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate()
	{
		return getExpirationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final Date value)
	{
		setExpirationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileMedia</code> attribute.
	 * @return the fileMedia
	 */
	public Media getFileMedia(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjLaudo.getFileMedia requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, FILEMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileMedia</code> attribute.
	 * @return the fileMedia
	 */
	public Media getFileMedia()
	{
		return getFileMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @return the localized fileMedia
	 */
	public Map<Language,Media> getAllFileMedia(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,FILEMEDIA,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @return the localized fileMedia
	 */
	public Map<Language,Media> getAllFileMedia()
	{
		return getAllFileMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @param value the fileMedia
	 */
	public void setFileMedia(final SessionContext ctx, final Media value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjLaudo.setFileMedia requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FILEMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @param value the fileMedia
	 */
	public void setFileMedia(final Media value)
	{
		setFileMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @param value the fileMedia
	 */
	public void setAllFileMedia(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,FILEMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileMedia</code> attribute. 
	 * @param value the fileMedia
	 */
	public void setAllFileMedia(final Map<Language,Media> value)
	{
		setAllFileMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName()
	{
		return getFileName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		setFileName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.laudoNumber</code> attribute.
	 * @return the laudoNumber
	 */
	public String getLaudoNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LAUDONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.laudoNumber</code> attribute.
	 * @return the laudoNumber
	 */
	public String getLaudoNumber()
	{
		return getLaudoNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.laudoNumber</code> attribute. 
	 * @param value the laudoNumber
	 */
	public void setLaudoNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LAUDONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.laudoNumber</code> attribute. 
	 * @param value the laudoNumber
	 */
	public void setLaudoNumber(final String value)
	{
		setLaudoNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.readStatus</code> attribute.
	 * @return the readStatus
	 */
	public Boolean isReadStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, READSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.readStatus</code> attribute.
	 * @return the readStatus
	 */
	public Boolean isReadStatus()
	{
		return isReadStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @return the readStatus
	 */
	public boolean isReadStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReadStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @return the readStatus
	 */
	public boolean isReadStatusAsPrimitive()
	{
		return isReadStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @param value the readStatus
	 */
	public void setReadStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, READSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @param value the readStatus
	 */
	public void setReadStatus(final Boolean value)
	{
		setReadStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @param value the readStatus
	 */
	public void setReadStatus(final SessionContext ctx, final boolean value)
	{
		setReadStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.readStatus</code> attribute. 
	 * @param value the readStatus
	 */
	public void setReadStatus(final boolean value)
	{
		setReadStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.writeStatus</code> attribute.
	 * @return the writeStatus
	 */
	public Boolean isWriteStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WRITESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.writeStatus</code> attribute.
	 * @return the writeStatus
	 */
	public Boolean isWriteStatus()
	{
		return isWriteStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @return the writeStatus
	 */
	public boolean isWriteStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWriteStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @return the writeStatus
	 */
	public boolean isWriteStatusAsPrimitive()
	{
		return isWriteStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @param value the writeStatus
	 */
	public void setWriteStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WRITESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @param value the writeStatus
	 */
	public void setWriteStatus(final Boolean value)
	{
		setWriteStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @param value the writeStatus
	 */
	public void setWriteStatus(final SessionContext ctx, final boolean value)
	{
		setWriteStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjLaudo.writeStatus</code> attribute. 
	 * @param value the writeStatus
	 */
	public void setWriteStatus(final boolean value)
	{
		setWriteStatus( getSession().getSessionContext(), value );
	}
	
}
