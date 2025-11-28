/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.BroadcastMessage;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjGTSalesOrgCustomer;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnJB2BUnit JnJB2BUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJB2BUnit extends B2BUnit
{
	/** Qualifier of the <code>JnJB2BUnit.indicator</code> attribute **/
	public static final String INDICATOR = "indicator";
	/** Qualifier of the <code>JnJB2BUnit.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnJB2BUnit.shortCustName</code> attribute **/
	public static final String SHORTCUSTNAME = "shortCustName";
	/** Qualifier of the <code>JnJB2BUnit.tradeCodeName</code> attribute **/
	public static final String TRADECODENAME = "tradeCodeName";
	/** Qualifier of the <code>JnJB2BUnit.salesRepLocNo</code> attribute **/
	public static final String SALESREPLOCNO = "salesRepLocNo";
	/** Qualifier of the <code>JnJB2BUnit.globalLocNo</code> attribute **/
	public static final String GLOBALLOCNO = "globalLocNo";
	/** Qualifier of the <code>JnJB2BUnit.mddDivision</code> attribute **/
	public static final String MDDDIVISION = "mddDivision";
	/** Qualifier of the <code>JnJB2BUnit.parentGroup</code> attribute **/
	public static final String PARENTGROUP = "parentGroup";
	/** Qualifier of the <code>JnJB2BUnit.dropShipAddresses</code> attribute **/
	public static final String DROPSHIPADDRESSES = "dropShipAddresses";
	/** Qualifier of the <code>JnJB2BUnit.classOfTrade</code> attribute **/
	public static final String CLASSOFTRADE = "classOfTrade";
	/** Qualifier of the <code>JnJB2BUnit.isProcessed</code> attribute **/
	public static final String ISPROCESSED = "isProcessed";
	/** Qualifier of the <code>JnJB2BUnit.customerGroup</code> attribute **/
	public static final String CUSTOMERGROUP = "customerGroup";
	/** Qualifier of the <code>JnJB2BUnit.noCharge</code> attribute **/
	public static final String NOCHARGE = "noCharge";
	/** Qualifier of the <code>JnJB2BUnit.restrictedCategories</code> attribute **/
	public static final String RESTRICTEDCATEGORIES = "restrictedCategories";
	/** Relation ordering override parameter constants for CustomerEligibilityRelation from ((jnjb2bcore))*/
	protected static String CUSTOMERELIGIBILITYRELATION_SRC_ORDERED = "relation.CustomerEligibilityRelation.source.ordered";
	protected static String CUSTOMERELIGIBILITYRELATION_TGT_ORDERED = "relation.CustomerEligibilityRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerEligibilityRelation from ((jnjb2bcore))*/
	protected static String CUSTOMERELIGIBILITYRELATION_MARKMODIFIED = "relation.CustomerEligibilityRelation.markmodified";
	/** Qualifier of the <code>JnJB2BUnit.includedProducts</code> attribute **/
	public static final String INCLUDEDPRODUCTS = "includedProducts";
	/** Relation ordering override parameter constants for JnjB2bUnitToIncludedProducts from ((jnjb2bcore))*/
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_SRC_ORDERED = "relation.JnjB2bUnitToIncludedProducts.source.ordered";
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_TGT_ORDERED = "relation.JnjB2bUnitToIncludedProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjB2bUnitToIncludedProducts from ((jnjb2bcore))*/
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED = "relation.JnjB2bUnitToIncludedProducts.markmodified";
	/** Qualifier of the <code>JnJB2BUnit.salesOrgCustomers</code> attribute **/
	public static final String SALESORGCUSTOMERS = "salesOrgCustomers";
	/** Relation ordering override parameter constants for JnjSalesOrgCustomerRelation from ((jnjb2bcore))*/
	protected static String JNJSALESORGCUSTOMERRELATION_SRC_ORDERED = "relation.JnjSalesOrgCustomerRelation.source.ordered";
	protected static String JNJSALESORGCUSTOMERRELATION_TGT_ORDERED = "relation.JnjSalesOrgCustomerRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjSalesOrgCustomerRelation from ((jnjb2bcore))*/
	protected static String JNJSALESORGCUSTOMERRELATION_MARKMODIFIED = "relation.JnjSalesOrgCustomerRelation.markmodified";
	/** Qualifier of the <code>JnJB2BUnit.broarcastMessages4Accout</code> attribute **/
	public static final String BROARCASTMESSAGES4ACCOUT = "broarcastMessages4Accout";
	/** Relation ordering override parameter constants for BcastMsgToUnitRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOUNITRELATION_SRC_ORDERED = "relation.BcastMsgToUnitRelation.source.ordered";
	protected static String BCASTMSGTOUNITRELATION_TGT_ORDERED = "relation.BcastMsgToUnitRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BcastMsgToUnitRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOUNITRELATION_MARKMODIFIED = "relation.BcastMsgToUnitRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(B2BUnit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INDICATOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(SHORTCUSTNAME, AttributeMode.INITIAL);
		tmp.put(TRADECODENAME, AttributeMode.INITIAL);
		tmp.put(SALESREPLOCNO, AttributeMode.INITIAL);
		tmp.put(GLOBALLOCNO, AttributeMode.INITIAL);
		tmp.put(MDDDIVISION, AttributeMode.INITIAL);
		tmp.put(PARENTGROUP, AttributeMode.INITIAL);
		tmp.put(DROPSHIPADDRESSES, AttributeMode.INITIAL);
		tmp.put(CLASSOFTRADE, AttributeMode.INITIAL);
		tmp.put(ISPROCESSED, AttributeMode.INITIAL);
		tmp.put(CUSTOMERGROUP, AttributeMode.INITIAL);
		tmp.put(NOCHARGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.broarcastMessages4Accout</code> attribute.
	 * @return the broarcastMessages4Accout
	 */
	public Collection<BroadcastMessage> getBroarcastMessages4Accout(final SessionContext ctx)
	{
		final List<BroadcastMessage> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			"BroadcastMessage",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.broarcastMessages4Accout</code> attribute.
	 * @return the broarcastMessages4Accout
	 */
	public Collection<BroadcastMessage> getBroarcastMessages4Accout()
	{
		return getBroarcastMessages4Accout( getSession().getSessionContext() );
	}
	
	public long getBroarcastMessages4AccoutCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			"BroadcastMessage",
			null
		);
	}
	
	public long getBroarcastMessages4AccoutCount()
	{
		return getBroarcastMessages4AccoutCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.broarcastMessages4Accout</code> attribute. 
	 * @param value the broarcastMessages4Accout
	 */
	public void setBroarcastMessages4Accout(final SessionContext ctx, final Collection<BroadcastMessage> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.broarcastMessages4Accout</code> attribute. 
	 * @param value the broarcastMessages4Accout
	 */
	public void setBroarcastMessages4Accout(final Collection<BroadcastMessage> value)
	{
		setBroarcastMessages4Accout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to broarcastMessages4Accout. 
	 * @param value the item to add to broarcastMessages4Accout
	 */
	public void addToBroarcastMessages4Accout(final SessionContext ctx, final BroadcastMessage value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to broarcastMessages4Accout. 
	 * @param value the item to add to broarcastMessages4Accout
	 */
	public void addToBroarcastMessages4Accout(final BroadcastMessage value)
	{
		addToBroarcastMessages4Accout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from broarcastMessages4Accout. 
	 * @param value the item to remove from broarcastMessages4Accout
	 */
	public void removeFromBroarcastMessages4Accout(final SessionContext ctx, final BroadcastMessage value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from broarcastMessages4Accout. 
	 * @param value the item to remove from broarcastMessages4Accout
	 */
	public void removeFromBroarcastMessages4Accout(final BroadcastMessage value)
	{
		removeFromBroarcastMessages4Accout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.classOfTrade</code> attribute.
	 * @return the classOfTrade
	 */
	public String getClassOfTrade(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLASSOFTRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.classOfTrade</code> attribute.
	 * @return the classOfTrade
	 */
	public String getClassOfTrade()
	{
		return getClassOfTrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.classOfTrade</code> attribute. 
	 * @param value the classOfTrade
	 */
	public void setClassOfTrade(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLASSOFTRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.classOfTrade</code> attribute. 
	 * @param value the classOfTrade
	 */
	public void setClassOfTrade(final String value)
	{
		setClassOfTrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup()
	{
		return getCustomerGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final String value)
	{
		setCustomerGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.dropShipAddresses</code> attribute.
	 * @return the dropShipAddresses
	 */
	public Set<Address> getDropShipAddresses(final SessionContext ctx)
	{
		Set<Address> coll = (Set<Address>)getProperty( ctx, DROPSHIPADDRESSES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.dropShipAddresses</code> attribute.
	 * @return the dropShipAddresses
	 */
	public Set<Address> getDropShipAddresses()
	{
		return getDropShipAddresses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.dropShipAddresses</code> attribute. 
	 * @param value the dropShipAddresses
	 */
	public void setDropShipAddresses(final SessionContext ctx, final Set<Address> value)
	{
		setProperty(ctx, DROPSHIPADDRESSES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.dropShipAddresses</code> attribute. 
	 * @param value the dropShipAddresses
	 */
	public void setDropShipAddresses(final Set<Address> value)
	{
		setDropShipAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALLOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo()
	{
		return getGlobalLocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALLOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final String value)
	{
		setGlobalLocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.includedProducts</code> attribute.
	 * @return the includedProducts
	 */
	public Set<JnJProduct> getIncludedProducts(final SessionContext ctx)
	{
		final List<JnJProduct> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			"JnJProduct",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJProduct>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.includedProducts</code> attribute.
	 * @return the includedProducts
	 */
	public Set<JnJProduct> getIncludedProducts()
	{
		return getIncludedProducts( getSession().getSessionContext() );
	}
	
	public long getIncludedProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			"JnJProduct",
			null
		);
	}
	
	public long getIncludedProductsCount()
	{
		return getIncludedProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.includedProducts</code> attribute. 
	 * @param value the includedProducts
	 */
	public void setIncludedProducts(final SessionContext ctx, final Set<JnJProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.includedProducts</code> attribute. 
	 * @param value the includedProducts
	 */
	public void setIncludedProducts(final Set<JnJProduct> value)
	{
		setIncludedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedProducts. 
	 * @param value the item to add to includedProducts
	 */
	public void addToIncludedProducts(final SessionContext ctx, final JnJProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedProducts. 
	 * @param value the item to add to includedProducts
	 */
	public void addToIncludedProducts(final JnJProduct value)
	{
		addToIncludedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedProducts. 
	 * @param value the item to remove from includedProducts
	 */
	public void removeFromIncludedProducts(final SessionContext ctx, final JnJProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedProducts. 
	 * @param value the item to remove from includedProducts
	 */
	public void removeFromIncludedProducts(final JnJProduct value)
	{
		removeFromIncludedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator()
	{
		return getIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final String value)
	{
		setIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Category");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("JnJProduct");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED);
		}
		ComposedType relationSecondEnd2 = TypeManager.getInstance().getComposedType("JnjGTSalesOrgCustomer");
		if(relationSecondEnd2.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd3 = TypeManager.getInstance().getComposedType("BroadcastMessage");
		if(relationSecondEnd3.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.isProcessed</code> attribute.
	 * @return the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public Boolean isIsProcessed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISPROCESSED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.isProcessed</code> attribute.
	 * @return the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public Boolean isIsProcessed()
	{
		return isIsProcessed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @return the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public boolean isIsProcessedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsProcessed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @return the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public boolean isIsProcessedAsPrimitive()
	{
		return isIsProcessedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @param value the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public void setIsProcessed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISPROCESSED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @param value the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public void setIsProcessed(final Boolean value)
	{
		setIsProcessed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @param value the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public void setIsProcessed(final SessionContext ctx, final boolean value)
	{
		setIsProcessed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.isProcessed</code> attribute. 
	 * @param value the isProcessed - This field is used to track those records which will be uploaded on daily basis through Product Exclusion Feed.
	 */
	public void setIsProcessed(final boolean value)
	{
		setIsProcessed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.mddDivision</code> attribute.
	 * @return the mddDivision
	 */
	public String getMddDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MDDDIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.mddDivision</code> attribute.
	 * @return the mddDivision
	 */
	public String getMddDivision()
	{
		return getMddDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.mddDivision</code> attribute. 
	 * @param value the mddDivision
	 */
	public void setMddDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MDDDIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.mddDivision</code> attribute. 
	 * @param value the mddDivision
	 */
	public void setMddDivision(final String value)
	{
		setMddDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.noCharge</code> attribute.
	 * @return the noCharge - This will holds No Charge Flag for Account
	 */
	public Boolean isNoCharge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NOCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.noCharge</code> attribute.
	 * @return the noCharge - This will holds No Charge Flag for Account
	 */
	public Boolean isNoCharge()
	{
		return isNoCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @return the noCharge - This will holds No Charge Flag for Account
	 */
	public boolean isNoChargeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNoCharge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @return the noCharge - This will holds No Charge Flag for Account
	 */
	public boolean isNoChargeAsPrimitive()
	{
		return isNoChargeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag for Account
	 */
	public void setNoCharge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NOCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag for Account
	 */
	public void setNoCharge(final Boolean value)
	{
		setNoCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag for Account
	 */
	public void setNoCharge(final SessionContext ctx, final boolean value)
	{
		setNoCharge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag for Account
	 */
	public void setNoCharge(final boolean value)
	{
		setNoCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.parentGroup</code> attribute.
	 * @return the parentGroup
	 */
	public String getParentGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.parentGroup</code> attribute.
	 * @return the parentGroup
	 */
	public String getParentGroup()
	{
		return getParentGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.parentGroup</code> attribute. 
	 * @param value the parentGroup
	 */
	public void setParentGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.parentGroup</code> attribute. 
	 * @param value the parentGroup
	 */
	public void setParentGroup(final String value)
	{
		setParentGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.restrictedCategories</code> attribute.
	 * @return the restrictedCategories
	 */
	public Set<Category> getRestrictedCategories(final SessionContext ctx)
	{
		final List<Category> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			"Category",
			null,
			false,
			false
		);
		return new LinkedHashSet<Category>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.restrictedCategories</code> attribute.
	 * @return the restrictedCategories
	 */
	public Set<Category> getRestrictedCategories()
	{
		return getRestrictedCategories( getSession().getSessionContext() );
	}
	
	public long getRestrictedCategoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			"Category",
			null
		);
	}
	
	public long getRestrictedCategoriesCount()
	{
		return getRestrictedCategoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.restrictedCategories</code> attribute. 
	 * @param value the restrictedCategories
	 */
	public void setRestrictedCategories(final SessionContext ctx, final Set<Category> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.restrictedCategories</code> attribute. 
	 * @param value the restrictedCategories
	 */
	public void setRestrictedCategories(final Set<Category> value)
	{
		setRestrictedCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to restrictedCategories. 
	 * @param value the item to add to restrictedCategories
	 */
	public void addToRestrictedCategories(final SessionContext ctx, final Category value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to restrictedCategories. 
	 * @param value the item to add to restrictedCategories
	 */
	public void addToRestrictedCategories(final Category value)
	{
		addToRestrictedCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from restrictedCategories. 
	 * @param value the item to remove from restrictedCategories
	 */
	public void removeFromRestrictedCategories(final SessionContext ctx, final Category value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from restrictedCategories. 
	 * @param value the item to remove from restrictedCategories
	 */
	public void removeFromRestrictedCategories(final Category value)
	{
		removeFromRestrictedCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.salesOrgCustomers</code> attribute.
	 * @return the salesOrgCustomers
	 */
	public Set<JnjGTSalesOrgCustomer> getSalesOrgCustomers(final SessionContext ctx)
	{
		final List<JnjGTSalesOrgCustomer> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			"JnjGTSalesOrgCustomer",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnjGTSalesOrgCustomer>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.salesOrgCustomers</code> attribute.
	 * @return the salesOrgCustomers
	 */
	public Set<JnjGTSalesOrgCustomer> getSalesOrgCustomers()
	{
		return getSalesOrgCustomers( getSession().getSessionContext() );
	}
	
	public long getSalesOrgCustomersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			"JnjGTSalesOrgCustomer",
			null
		);
	}
	
	public long getSalesOrgCustomersCount()
	{
		return getSalesOrgCustomersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.salesOrgCustomers</code> attribute. 
	 * @param value the salesOrgCustomers
	 */
	public void setSalesOrgCustomers(final SessionContext ctx, final Set<JnjGTSalesOrgCustomer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.salesOrgCustomers</code> attribute. 
	 * @param value the salesOrgCustomers
	 */
	public void setSalesOrgCustomers(final Set<JnjGTSalesOrgCustomer> value)
	{
		setSalesOrgCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOrgCustomers. 
	 * @param value the item to add to salesOrgCustomers
	 */
	public void addToSalesOrgCustomers(final SessionContext ctx, final JnjGTSalesOrgCustomer value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOrgCustomers. 
	 * @param value the item to add to salesOrgCustomers
	 */
	public void addToSalesOrgCustomers(final JnjGTSalesOrgCustomer value)
	{
		addToSalesOrgCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOrgCustomers. 
	 * @param value the item to remove from salesOrgCustomers
	 */
	public void removeFromSalesOrgCustomers(final SessionContext ctx, final JnjGTSalesOrgCustomer value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJSALESORGCUSTOMERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJSALESORGCUSTOMERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOrgCustomers. 
	 * @param value the item to remove from salesOrgCustomers
	 */
	public void removeFromSalesOrgCustomers(final JnjGTSalesOrgCustomer value)
	{
		removeFromSalesOrgCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.salesRepLocNo</code> attribute.
	 * @return the salesRepLocNo
	 */
	public String getSalesRepLocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESREPLOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.salesRepLocNo</code> attribute.
	 * @return the salesRepLocNo
	 */
	public String getSalesRepLocNo()
	{
		return getSalesRepLocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.salesRepLocNo</code> attribute. 
	 * @param value the salesRepLocNo
	 */
	public void setSalesRepLocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESREPLOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.salesRepLocNo</code> attribute. 
	 * @param value the salesRepLocNo
	 */
	public void setSalesRepLocNo(final String value)
	{
		setSalesRepLocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.shortCustName</code> attribute.
	 * @return the shortCustName
	 */
	public String getShortCustName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTCUSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.shortCustName</code> attribute.
	 * @return the shortCustName
	 */
	public String getShortCustName()
	{
		return getShortCustName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.shortCustName</code> attribute. 
	 * @param value the shortCustName
	 */
	public void setShortCustName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTCUSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.shortCustName</code> attribute. 
	 * @param value the shortCustName
	 */
	public void setShortCustName(final String value)
	{
		setShortCustName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.tradeCodeName</code> attribute.
	 * @return the tradeCodeName
	 */
	public String getTradeCodeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRADECODENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2BUnit.tradeCodeName</code> attribute.
	 * @return the tradeCodeName
	 */
	public String getTradeCodeName()
	{
		return getTradeCodeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.tradeCodeName</code> attribute. 
	 * @param value the tradeCodeName
	 */
	public void setTradeCodeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRADECODENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2BUnit.tradeCodeName</code> attribute. 
	 * @param value the tradeCodeName
	 */
	public void setTradeCodeName(final String value)
	{
		setTradeCodeName( getSession().getSessionContext(), value );
	}
	
}
