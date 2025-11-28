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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjIndirectCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjIndirectCustomer extends GenericItem
{
	/** Qualifier of the <code>JnjIndirectCustomer.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjIndirectCustomer.indirectCustomer</code> attribute **/
	public static final String INDIRECTCUSTOMER = "indirectCustomer";
	/** Qualifier of the <code>JnjIndirectCustomer.indirectCustomerName</code> attribute **/
	public static final String INDIRECTCUSTOMERNAME = "indirectCustomerName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(INDIRECTCUSTOMER, AttributeMode.INITIAL);
		tmp.put(INDIRECTCUSTOMERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDIRECTCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer()
	{
		return getIndirectCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDIRECTCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final String value)
	{
		setIndirectCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.indirectCustomerName</code> attribute.
	 * @return the indirectCustomerName
	 */
	public String getIndirectCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDIRECTCUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIndirectCustomer.indirectCustomerName</code> attribute.
	 * @return the indirectCustomerName
	 */
	public String getIndirectCustomerName()
	{
		return getIndirectCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.indirectCustomerName</code> attribute. 
	 * @param value the indirectCustomerName
	 */
	public void setIndirectCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDIRECTCUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIndirectCustomer.indirectCustomerName</code> attribute. 
	 * @param value the indirectCustomerName
	 */
	public void setIndirectCustomerName(final String value)
	{
		setIndirectCustomerName( getSession().getSessionContext(), value );
	}
	
}
