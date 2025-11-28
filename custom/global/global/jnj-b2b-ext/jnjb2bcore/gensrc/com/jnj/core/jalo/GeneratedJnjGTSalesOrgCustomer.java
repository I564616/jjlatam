/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTSalesOrgCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTSalesOrgCustomer extends GenericItem
{
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.userPriceGroup</code> attribute **/
	public static final String USERPRICEGROUP = "userPriceGroup";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.customerGroup</code> attribute **/
	public static final String CUSTOMERGROUP = "customerGroup";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTSalesOrgCustomer.b2BUnits</code> attribute **/
	public static final String B2BUNITS = "b2BUnits";
	/** Relation ordering override parameter constants for JnjSalesOrgCustomerRelation from ((jnjb2bcore))*/
	protected static String JNJSALESORGCUSTOMERRELATION_SRC_ORDERED = "relation.JnjSalesOrgCustomerRelation.source.ordered";
	protected static String JNJSALESORGCUSTOMERRELATION_TGT_ORDERED = "relation.JnjSalesOrgCustomerRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjSalesOrgCustomerRelation from ((jnjb2bcore))*/
	protected static String JNJSALESORGCUSTOMERRELATION_MARKMODIFIED = "relation.JnjSalesOrgCustomerRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(USERPRICEGROUP, AttributeMode.INITIAL);
		tmp.put(CUSTOMERGROUP, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.b2BUnits</code> attribute.
	 * @return the b2BUnits
	 */
	public Set<JnJB2BUnit> getB2BUnits(final SessionContext ctx)
	{
		final List<JnJB2BUnit> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			"JnJB2BUnit",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJB2BUnit>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.b2BUnits</code> attribute.
	 * @return the b2BUnits
	 */
	public Set<JnJB2BUnit> getB2BUnits()
	{
		return getB2BUnits( getSession().getSessionContext() );
	}
	
	public long getB2BUnitsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			"JnJB2BUnit",
			null
		);
	}
	
	public long getB2BUnitsCount()
	{
		return getB2BUnitsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.b2BUnits</code> attribute. 
	 * @param value the b2BUnits
	 */
	public void setB2BUnits(final SessionContext ctx, final Set<JnJB2BUnit> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.b2BUnits</code> attribute. 
	 * @param value the b2BUnits
	 */
	public void setB2BUnits(final Set<JnJB2BUnit> value)
	{
		setB2BUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to b2BUnits. 
	 * @param value the item to add to b2BUnits
	 */
	public void addToB2BUnits(final SessionContext ctx, final JnJB2BUnit value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to b2BUnits. 
	 * @param value the item to add to b2BUnits
	 */
	public void addToB2BUnits(final JnJB2BUnit value)
	{
		addToB2BUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from b2BUnits. 
	 * @param value the item to remove from b2BUnits
	 */
	public void removeFromB2BUnits(final SessionContext ctx, final JnJB2BUnit value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from b2BUnits. 
	 * @param value the item to remove from b2BUnits
	 */
	public void removeFromB2BUnits(final JnJB2BUnit value)
	{
		removeFromB2BUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup()
	{
		return getCustomerGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final String value)
	{
		setCustomerGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final String value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("JnJB2BUnit");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.userPriceGroup</code> attribute.
	 * @return the userPriceGroup
	 */
	public EnumerationValue getUserPriceGroup(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, USERPRICEGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSalesOrgCustomer.userPriceGroup</code> attribute.
	 * @return the userPriceGroup
	 */
	public EnumerationValue getUserPriceGroup()
	{
		return getUserPriceGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.userPriceGroup</code> attribute. 
	 * @param value the userPriceGroup
	 */
	public void setUserPriceGroup(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, USERPRICEGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSalesOrgCustomer.userPriceGroup</code> attribute. 
	 * @param value the userPriceGroup
	 */
	public void setUserPriceGroup(final EnumerationValue value)
	{
		setUserPriceGroup( getSession().getSessionContext(), value );
	}
	
}
