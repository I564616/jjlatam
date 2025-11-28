/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJSalesOrgCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJSalesOrgCustomer extends GenericItem
{
	/** Qualifier of the <code>JnJSalesOrgCustomer.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnJSalesOrgCustomer.customerId</code> attribute **/
	public static final String CUSTOMERID = "customerId";
	/** Qualifier of the <code>JnJSalesOrgCustomer.sector</code> attribute **/
	public static final String SECTOR = "sector";
	/** Qualifier of the <code>JnJSalesOrgCustomer.salesOrgList</code> attribute **/
	public static final String SALESORGLIST = "salesOrgList";
	/** Qualifier of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute **/
	public static final String ISSALESORGCUSTOMER = "isSalesOrgCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(CUSTOMERID, AttributeMode.INITIAL);
		tmp.put(SECTOR, AttributeMode.INITIAL);
		tmp.put(SALESORGLIST, AttributeMode.INITIAL);
		tmp.put(ISSALESORGCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.customerId</code> attribute.
	 * @return the customerId
	 */
	public JnJB2BUnit getCustomerId(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.customerId</code> attribute.
	 * @return the customerId
	 */
	public JnJB2BUnit getCustomerId()
	{
		return getCustomerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, CUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final JnJB2BUnit value)
	{
		setCustomerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute.
	 * @return the isSalesOrgCustomer
	 */
	public Boolean isIsSalesOrgCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISSALESORGCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute.
	 * @return the isSalesOrgCustomer
	 */
	public Boolean isIsSalesOrgCustomer()
	{
		return isIsSalesOrgCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @return the isSalesOrgCustomer
	 */
	public boolean isIsSalesOrgCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsSalesOrgCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @return the isSalesOrgCustomer
	 */
	public boolean isIsSalesOrgCustomerAsPrimitive()
	{
		return isIsSalesOrgCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @param value the isSalesOrgCustomer
	 */
	public void setIsSalesOrgCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISSALESORGCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @param value the isSalesOrgCustomer
	 */
	public void setIsSalesOrgCustomer(final Boolean value)
	{
		setIsSalesOrgCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @param value the isSalesOrgCustomer
	 */
	public void setIsSalesOrgCustomer(final SessionContext ctx, final boolean value)
	{
		setIsSalesOrgCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.isSalesOrgCustomer</code> attribute. 
	 * @param value the isSalesOrgCustomer
	 */
	public void setIsSalesOrgCustomer(final boolean value)
	{
		setIsSalesOrgCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.salesOrgList</code> attribute.
	 * @return the salesOrgList
	 */
	public List<String> getSalesOrgList(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, SALESORGLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.salesOrgList</code> attribute.
	 * @return the salesOrgList
	 */
	public List<String> getSalesOrgList()
	{
		return getSalesOrgList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.salesOrgList</code> attribute. 
	 * @param value the salesOrgList
	 */
	public void setSalesOrgList(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, SALESORGLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.salesOrgList</code> attribute. 
	 * @param value the salesOrgList
	 */
	public void setSalesOrgList(final List<String> value)
	{
		setSalesOrgList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJSalesOrgCustomer.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector()
	{
		return getSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJSalesOrgCustomer.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final String value)
	{
		setSector( getSession().getSessionContext(), value );
	}
	
}
