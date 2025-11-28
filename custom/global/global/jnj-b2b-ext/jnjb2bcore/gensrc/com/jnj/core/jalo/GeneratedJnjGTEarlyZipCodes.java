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
import de.hybris.platform.jalo.c2l.Region;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTEarlyZipCodes}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTEarlyZipCodes extends GenericItem
{
	/** Qualifier of the <code>JnjGTEarlyZipCodes.areaName</code> attribute **/
	public static final String AREANAME = "areaName";
	/** Qualifier of the <code>JnjGTEarlyZipCodes.stateCode</code> attribute **/
	public static final String STATECODE = "stateCode";
	/** Qualifier of the <code>JnjGTEarlyZipCodes.zipCode</code> attribute **/
	public static final String ZIPCODE = "zipCode";
	/** Qualifier of the <code>JnjGTEarlyZipCodes.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute **/
	public static final String ISUPDATED = "isUpdated";
	/** Qualifier of the <code>JnjGTEarlyZipCodes.courier</code> attribute **/
	public static final String COURIER = "courier";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AREANAME, AttributeMode.INITIAL);
		tmp.put(STATECODE, AttributeMode.INITIAL);
		tmp.put(ZIPCODE, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(ISUPDATED, AttributeMode.INITIAL);
		tmp.put(COURIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.areaName</code> attribute.
	 * @return the areaName
	 */
	public String getAreaName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AREANAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.areaName</code> attribute.
	 * @return the areaName
	 */
	public String getAreaName()
	{
		return getAreaName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.areaName</code> attribute. 
	 * @param value the areaName
	 */
	public void setAreaName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AREANAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.areaName</code> attribute. 
	 * @param value the areaName
	 */
	public void setAreaName(final String value)
	{
		setAreaName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.courier</code> attribute.
	 * @return the courier
	 */
	public String getCourier(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COURIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.courier</code> attribute.
	 * @return the courier
	 */
	public String getCourier()
	{
		return getCourier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.courier</code> attribute. 
	 * @param value the courier
	 */
	public void setCourier(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COURIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.courier</code> attribute. 
	 * @param value the courier
	 */
	public void setCourier(final String value)
	{
		setCourier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute.
	 * @return the isUpdated
	 */
	public Boolean isIsUpdated(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISUPDATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute.
	 * @return the isUpdated
	 */
	public Boolean isIsUpdated()
	{
		return isIsUpdated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @return the isUpdated
	 */
	public boolean isIsUpdatedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsUpdated( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @return the isUpdated
	 */
	public boolean isIsUpdatedAsPrimitive()
	{
		return isIsUpdatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @param value the isUpdated
	 */
	public void setIsUpdated(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISUPDATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @param value the isUpdated
	 */
	public void setIsUpdated(final Boolean value)
	{
		setIsUpdated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @param value the isUpdated
	 */
	public void setIsUpdated(final SessionContext ctx, final boolean value)
	{
		setIsUpdated( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.isUpdated</code> attribute. 
	 * @param value the isUpdated
	 */
	public void setIsUpdated(final boolean value)
	{
		setIsUpdated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.stateCode</code> attribute.
	 * @return the stateCode
	 */
	public Region getStateCode(final SessionContext ctx)
	{
		return (Region)getProperty( ctx, STATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.stateCode</code> attribute.
	 * @return the stateCode
	 */
	public Region getStateCode()
	{
		return getStateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.stateCode</code> attribute. 
	 * @param value the stateCode
	 */
	public void setStateCode(final SessionContext ctx, final Region value)
	{
		setProperty(ctx, STATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.stateCode</code> attribute. 
	 * @param value the stateCode
	 */
	public void setStateCode(final Region value)
	{
		setStateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.time</code> attribute.
	 * @return the time
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.time</code> attribute.
	 * @return the time
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ZIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTEarlyZipCodes.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode()
	{
		return getZipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTEarlyZipCodes.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final String value)
	{
		setZipCode( getSession().getSessionContext(), value );
	}
	
}
