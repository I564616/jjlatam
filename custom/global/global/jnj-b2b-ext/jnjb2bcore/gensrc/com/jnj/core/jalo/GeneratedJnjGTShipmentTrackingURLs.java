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
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTShipmentTrackingURLs}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShipmentTrackingURLs extends GenericItem
{
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.freightCarrCode</code> attribute **/
	public static final String FREIGHTCARRCODE = "freightCarrCode";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.freightCarrName</code> attribute **/
	public static final String FREIGHTCARRNAME = "freightCarrName";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.freightCarrURL</code> attribute **/
	public static final String FREIGHTCARRURL = "freightCarrURL";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.trackingName</code> attribute **/
	public static final String TRACKINGNAME = "trackingName";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.trackingTypeCode</code> attribute **/
	public static final String TRACKINGTYPECODE = "trackingTypeCode";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.param1Name</code> attribute **/
	public static final String PARAM1NAME = "param1Name";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.param1TypeCode</code> attribute **/
	public static final String PARAM1TYPECODE = "param1TypeCode";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.param2Name</code> attribute **/
	public static final String PARAM2NAME = "param2Name";
	/** Qualifier of the <code>JnjGTShipmentTrackingURLs.param2TypeCode</code> attribute **/
	public static final String PARAM2TYPECODE = "param2TypeCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FREIGHTCARRCODE, AttributeMode.INITIAL);
		tmp.put(FREIGHTCARRNAME, AttributeMode.INITIAL);
		tmp.put(FREIGHTCARRURL, AttributeMode.INITIAL);
		tmp.put(TRACKINGNAME, AttributeMode.INITIAL);
		tmp.put(TRACKINGTYPECODE, AttributeMode.INITIAL);
		tmp.put(PARAM1NAME, AttributeMode.INITIAL);
		tmp.put(PARAM1TYPECODE, AttributeMode.INITIAL);
		tmp.put(PARAM2NAME, AttributeMode.INITIAL);
		tmp.put(PARAM2TYPECODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrCode</code> attribute.
	 * @return the freightCarrCode - Frieght Carrier Company Code
	 */
	public String getFreightCarrCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FREIGHTCARRCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrCode</code> attribute.
	 * @return the freightCarrCode - Frieght Carrier Company Code
	 */
	public String getFreightCarrCode()
	{
		return getFreightCarrCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrCode</code> attribute. 
	 * @param value the freightCarrCode - Frieght Carrier Company Code
	 */
	public void setFreightCarrCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FREIGHTCARRCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrCode</code> attribute. 
	 * @param value the freightCarrCode - Frieght Carrier Company Code
	 */
	public void setFreightCarrCode(final String value)
	{
		setFreightCarrCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrName</code> attribute.
	 * @return the freightCarrName - Name of Frieght Carrier Company
	 */
	public String getFreightCarrName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FREIGHTCARRNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrName</code> attribute.
	 * @return the freightCarrName - Name of Frieght Carrier Company
	 */
	public String getFreightCarrName()
	{
		return getFreightCarrName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrName</code> attribute. 
	 * @param value the freightCarrName - Name of Frieght Carrier Company
	 */
	public void setFreightCarrName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FREIGHTCARRNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrName</code> attribute. 
	 * @param value the freightCarrName - Name of Frieght Carrier Company
	 */
	public void setFreightCarrName(final String value)
	{
		setFreightCarrName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrURL</code> attribute.
	 * @return the freightCarrURL - URL for status check
	 */
	public String getFreightCarrURL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FREIGHTCARRURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.freightCarrURL</code> attribute.
	 * @return the freightCarrURL - URL for status check
	 */
	public String getFreightCarrURL()
	{
		return getFreightCarrURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrURL</code> attribute. 
	 * @param value the freightCarrURL - URL for status check
	 */
	public void setFreightCarrURL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FREIGHTCARRURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.freightCarrURL</code> attribute. 
	 * @param value the freightCarrURL - URL for status check
	 */
	public void setFreightCarrURL(final String value)
	{
		setFreightCarrURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param1Name</code> attribute.
	 * @return the param1Name - param one name
	 */
	public String getParam1Name(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARAM1NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param1Name</code> attribute.
	 * @return the param1Name - param one name
	 */
	public String getParam1Name()
	{
		return getParam1Name( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param1Name</code> attribute. 
	 * @param value the param1Name - param one name
	 */
	public void setParam1Name(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARAM1NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param1Name</code> attribute. 
	 * @param value the param1Name - param one name
	 */
	public void setParam1Name(final String value)
	{
		setParam1Name( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param1TypeCode</code> attribute.
	 * @return the param1TypeCode - param one type code
	 */
	public String getParam1TypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARAM1TYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param1TypeCode</code> attribute.
	 * @return the param1TypeCode - param one type code
	 */
	public String getParam1TypeCode()
	{
		return getParam1TypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param1TypeCode</code> attribute. 
	 * @param value the param1TypeCode - param one type code
	 */
	public void setParam1TypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARAM1TYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param1TypeCode</code> attribute. 
	 * @param value the param1TypeCode - param one type code
	 */
	public void setParam1TypeCode(final String value)
	{
		setParam1TypeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param2Name</code> attribute.
	 * @return the param2Name - param second name
	 */
	public String getParam2Name(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARAM2NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param2Name</code> attribute.
	 * @return the param2Name - param second name
	 */
	public String getParam2Name()
	{
		return getParam2Name( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param2Name</code> attribute. 
	 * @param value the param2Name - param second name
	 */
	public void setParam2Name(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARAM2NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param2Name</code> attribute. 
	 * @param value the param2Name - param second name
	 */
	public void setParam2Name(final String value)
	{
		setParam2Name( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param2TypeCode</code> attribute.
	 * @return the param2TypeCode - param second type code
	 */
	public String getParam2TypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARAM2TYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.param2TypeCode</code> attribute.
	 * @return the param2TypeCode - param second type code
	 */
	public String getParam2TypeCode()
	{
		return getParam2TypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param2TypeCode</code> attribute. 
	 * @param value the param2TypeCode - param second type code
	 */
	public void setParam2TypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARAM2TYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.param2TypeCode</code> attribute. 
	 * @param value the param2TypeCode - param second type code
	 */
	public void setParam2TypeCode(final String value)
	{
		setParam2TypeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.trackingName</code> attribute.
	 * @return the trackingName - params for tracking name
	 */
	public String getTrackingName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.trackingName</code> attribute.
	 * @return the trackingName - params for tracking name
	 */
	public String getTrackingName()
	{
		return getTrackingName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.trackingName</code> attribute. 
	 * @param value the trackingName - params for tracking name
	 */
	public void setTrackingName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.trackingName</code> attribute. 
	 * @param value the trackingName - params for tracking name
	 */
	public void setTrackingName(final String value)
	{
		setTrackingName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.trackingTypeCode</code> attribute.
	 * @return the trackingTypeCode - params for tracking type code
	 */
	public String getTrackingTypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGTYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentTrackingURLs.trackingTypeCode</code> attribute.
	 * @return the trackingTypeCode - params for tracking type code
	 */
	public String getTrackingTypeCode()
	{
		return getTrackingTypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.trackingTypeCode</code> attribute. 
	 * @param value the trackingTypeCode - params for tracking type code
	 */
	public void setTrackingTypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGTYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentTrackingURLs.trackingTypeCode</code> attribute. 
	 * @param value the trackingTypeCode - params for tracking type code
	 */
	public void setTrackingTypeCode(final String value)
	{
		setTrackingTypeCode( getSession().getSessionContext(), value );
	}
	
}
