/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import com.jnj.core.jalo.JnjGTTerritoryDivison;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTTerritoryDivCustRel}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTTerritoryDivCustRel extends GenericItem
{
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.target</code> attribute **/
	public static final String TARGET = "target";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.effectiveDate</code> attribute **/
	public static final String EFFECTIVEDATE = "effectiveDate";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute **/
	public static final String INVALIDATED = "invalidated";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.uniqueCustomer</code> attribute **/
	public static final String UNIQUECUSTOMER = "uniqueCustomer";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute **/
	public static final String PRIMARYSALESREP = "primarySalesRep";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.wwid</code> attribute **/
	public static final String WWID = "wwid";
	/** Qualifier of the <code>JnjGTTerritoryDivCustRel.orgTypeCd</code> attribute **/
	public static final String ORGTYPECD = "orgTypeCd";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(TARGET, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(INVALIDATED, AttributeMode.INITIAL);
		tmp.put(UNIQUECUSTOMER, AttributeMode.INITIAL);
		tmp.put(PRIMARYSALESREP, AttributeMode.INITIAL);
		tmp.put(WWID, AttributeMode.INITIAL);
		tmp.put(ORGTYPECD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.effectiveDate</code> attribute.
	 * @return the effectiveDate - Start Date of relationship
	 */
	public Date getEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.effectiveDate</code> attribute.
	 * @return the effectiveDate - Start Date of relationship
	 */
	public Date getEffectiveDate()
	{
		return getEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.effectiveDate</code> attribute. 
	 * @param value the effectiveDate - Start Date of relationship
	 */
	public void setEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.effectiveDate</code> attribute. 
	 * @param value the effectiveDate - Start Date of relationship
	 */
	public void setEffectiveDate(final Date value)
	{
		setEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.endDate</code> attribute.
	 * @return the endDate - End Date of relationship
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.endDate</code> attribute.
	 * @return the endDate - End Date of relationship
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.endDate</code> attribute. 
	 * @param value the endDate - End Date of relationship
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.endDate</code> attribute. 
	 * @param value the endDate - End Date of relationship
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute.
	 * @return the invalidated - Denotes the validity of relation
	 */
	public Boolean isInvalidated(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INVALIDATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute.
	 * @return the invalidated - Denotes the validity of relation
	 */
	public Boolean isInvalidated()
	{
		return isInvalidated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @return the invalidated - Denotes the validity of relation
	 */
	public boolean isInvalidatedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInvalidated( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @return the invalidated - Denotes the validity of relation
	 */
	public boolean isInvalidatedAsPrimitive()
	{
		return isInvalidatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INVALIDATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final Boolean value)
	{
		setInvalidated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final SessionContext ctx, final boolean value)
	{
		setInvalidated( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final boolean value)
	{
		setInvalidated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.orgTypeCd</code> attribute.
	 * @return the orgTypeCd - Denotes the Division Type Code
	 */
	public String getOrgTypeCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGTYPECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.orgTypeCd</code> attribute.
	 * @return the orgTypeCd - Denotes the Division Type Code
	 */
	public String getOrgTypeCd()
	{
		return getOrgTypeCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd - Denotes the Division Type Code
	 */
	public void setOrgTypeCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGTYPECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd - Denotes the Division Type Code
	 */
	public void setOrgTypeCd(final String value)
	{
		setOrgTypeCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute.
	 * @return the primarySalesRep - Denotes the validity of relation
	 */
	public Boolean isPrimarySalesRep(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PRIMARYSALESREP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute.
	 * @return the primarySalesRep - Denotes the validity of relation
	 */
	public Boolean isPrimarySalesRep()
	{
		return isPrimarySalesRep( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @return the primarySalesRep - Denotes the validity of relation
	 */
	public boolean isPrimarySalesRepAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPrimarySalesRep( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @return the primarySalesRep - Denotes the validity of relation
	 */
	public boolean isPrimarySalesRepAsPrimitive()
	{
		return isPrimarySalesRepAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @param value the primarySalesRep - Denotes the validity of relation
	 */
	public void setPrimarySalesRep(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PRIMARYSALESREP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @param value the primarySalesRep - Denotes the validity of relation
	 */
	public void setPrimarySalesRep(final Boolean value)
	{
		setPrimarySalesRep( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @param value the primarySalesRep - Denotes the validity of relation
	 */
	public void setPrimarySalesRep(final SessionContext ctx, final boolean value)
	{
		setPrimarySalesRep( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.primarySalesRep</code> attribute. 
	 * @param value the primarySalesRep - Denotes the validity of relation
	 */
	public void setPrimarySalesRep(final boolean value)
	{
		setPrimarySalesRep( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.source</code> attribute.
	 * @return the source - Territory Division Model
	 */
	public JnjGTTerritoryDivison getSource(final SessionContext ctx)
	{
		return (JnjGTTerritoryDivison)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.source</code> attribute.
	 * @return the source - Territory Division Model
	 */
	public JnjGTTerritoryDivison getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.source</code> attribute. 
	 * @param value the source - Territory Division Model
	 */
	public void setSource(final SessionContext ctx, final JnjGTTerritoryDivison value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.source</code> attribute. 
	 * @param value the source - Territory Division Model
	 */
	public void setSource(final JnjGTTerritoryDivison value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.target</code> attribute.
	 * @return the target - B2bUnit/User Model
	 */
	public Principal getTarget(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, TARGET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.target</code> attribute.
	 * @return the target - B2bUnit/User Model
	 */
	public Principal getTarget()
	{
		return getTarget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.target</code> attribute. 
	 * @param value the target - B2bUnit/User Model
	 */
	public void setTarget(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, TARGET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.target</code> attribute. 
	 * @param value the target - B2bUnit/User Model
	 */
	public void setTarget(final Principal value)
	{
		setTarget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.uniqueCustomer</code> attribute.
	 * @return the uniqueCustomer - Denotes the validity of relation
	 */
	public JnJB2BUnit getUniqueCustomer(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, UNIQUECUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.uniqueCustomer</code> attribute.
	 * @return the uniqueCustomer - Denotes the validity of relation
	 */
	public JnJB2BUnit getUniqueCustomer()
	{
		return getUniqueCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.uniqueCustomer</code> attribute. 
	 * @param value the uniqueCustomer - Denotes the validity of relation
	 */
	public void setUniqueCustomer(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, UNIQUECUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.uniqueCustomer</code> attribute. 
	 * @param value the uniqueCustomer - Denotes the validity of relation
	 */
	public void setUniqueCustomer(final JnJB2BUnit value)
	{
		setUniqueCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.wwid</code> attribute.
	 * @return the wwid - Denotes the validity of relation
	 */
	public String getWwid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivCustRel.wwid</code> attribute.
	 * @return the wwid - Denotes the validity of relation
	 */
	public String getWwid()
	{
		return getWwid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.wwid</code> attribute. 
	 * @param value the wwid - Denotes the validity of relation
	 */
	public void setWwid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivCustRel.wwid</code> attribute. 
	 * @param value the wwid - Denotes the validity of relation
	 */
	public void setWwid(final String value)
	{
		setWwid( getSession().getSessionContext(), value );
	}
	
}
