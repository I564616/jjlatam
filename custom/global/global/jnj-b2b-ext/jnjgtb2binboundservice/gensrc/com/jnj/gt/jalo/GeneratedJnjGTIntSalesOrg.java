/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntSalesOrg JnjGTIntSalesOrg}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntSalesOrg extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntSalesOrg.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntSalesOrg.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTIntSalesOrg.customerNumber</code> attribute **/
	public static final String CUSTOMERNUMBER = "customerNumber";
	/** Qualifier of the <code>JnjGTIntSalesOrg.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnjGTIntSalesOrg.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>JnjGTIntSalesOrg.customerGroup</code> attribute **/
	public static final String CUSTOMERGROUP = "customerGroup";
	/** Qualifier of the <code>JnjGTIntSalesOrg.priceList</code> attribute **/
	public static final String PRICELIST = "priceList";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(CUSTOMERGROUP, AttributeMode.INITIAL);
		tmp.put(PRICELIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup()
	{
		return getCustomerGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final String value)
	{
		setCustomerGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber()
	{
		return getCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final String value)
	{
		setCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.priceList</code> attribute.
	 * @return the priceList
	 */
	public String getPriceList(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICELIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.priceList</code> attribute.
	 * @return the priceList
	 */
	public String getPriceList()
	{
		return getPriceList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.priceList</code> attribute. 
	 * @param value the priceList
	 */
	public void setPriceList(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICELIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.priceList</code> attribute. 
	 * @param value the priceList
	 */
	public void setPriceList(final String value)
	{
		setPriceList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesOrg.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesOrg.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
