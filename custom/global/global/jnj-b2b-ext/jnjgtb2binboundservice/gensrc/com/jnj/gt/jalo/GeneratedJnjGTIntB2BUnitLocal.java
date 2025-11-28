/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntB2BUnitLocal JnjGTIntB2BUnitLocal}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntB2BUnitLocal extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntB2BUnitLocal.customerNumber</code> attribute **/
	public static final String CUSTOMERNUMBER = "customerNumber";
	/** Qualifier of the <code>JnjGTIntB2BUnitLocal.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnjGTIntB2BUnitLocal.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntB2BUnitLocal.priceBook</code> attribute **/
	public static final String PRICEBOOK = "priceBook";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(PRICEBOOK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber()
	{
		return getCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final String value)
	{
		setCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEBOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook()
	{
		return getPriceBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEBOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final String value)
	{
		setPriceBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnitLocal.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnitLocal.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
