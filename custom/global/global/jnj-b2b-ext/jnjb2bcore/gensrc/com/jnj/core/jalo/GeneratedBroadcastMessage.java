/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.ClassOfTradeGroup;
import com.jnj.core.jalo.JnJB2BUnit;
import de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent BroadcastMessage}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBroadcastMessage extends CMSParagraphComponent
{
	/** Qualifier of the <code>BroadcastMessage.allMDDAccounts</code> attribute **/
	public static final String ALLMDDACCOUNTS = "allMDDAccounts";
	/** Qualifier of the <code>BroadcastMessage.allConsumerAccounts</code> attribute **/
	public static final String ALLCONSUMERACCOUNTS = "allConsumerAccounts";
	/** Qualifier of the <code>BroadcastMessage.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>BroadcastMessage.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>BroadcastMessage.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>BroadcastMessage.messageLevel</code> attribute **/
	public static final String MESSAGELEVEL = "messageLevel";
	/** Qualifier of the <code>BroadcastMessage.accounts</code> attribute **/
	public static final String ACCOUNTS = "accounts";
	/** Relation ordering override parameter constants for BcastMsgToUnitRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOUNITRELATION_SRC_ORDERED = "relation.BcastMsgToUnitRelation.source.ordered";
	protected static String BCASTMSGTOUNITRELATION_TGT_ORDERED = "relation.BcastMsgToUnitRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BcastMsgToUnitRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOUNITRELATION_MARKMODIFIED = "relation.BcastMsgToUnitRelation.markmodified";
	/** Qualifier of the <code>BroadcastMessage.classOfTradeGroups</code> attribute **/
	public static final String CLASSOFTRADEGROUPS = "classOfTradeGroups";
	/** Relation ordering override parameter constants for BcastMsgToCTGrpRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOCTGRPRELATION_SRC_ORDERED = "relation.BcastMsgToCTGrpRelation.source.ordered";
	protected static String BCASTMSGTOCTGRPRELATION_TGT_ORDERED = "relation.BcastMsgToCTGrpRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BcastMsgToCTGrpRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOCTGRPRELATION_MARKMODIFIED = "relation.BcastMsgToCTGrpRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSParagraphComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ALLMDDACCOUNTS, AttributeMode.INITIAL);
		tmp.put(ALLCONSUMERACCOUNTS, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		tmp.put(MESSAGELEVEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.accounts</code> attribute.
	 * @return the accounts
	 */
	public Collection<JnJB2BUnit> getAccounts(final SessionContext ctx)
	{
		final List<JnJB2BUnit> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			"JnJB2BUnit",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.accounts</code> attribute.
	 * @return the accounts
	 */
	public Collection<JnJB2BUnit> getAccounts()
	{
		return getAccounts( getSession().getSessionContext() );
	}
	
	public long getAccountsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			"JnJB2BUnit",
			null
		);
	}
	
	public long getAccountsCount()
	{
		return getAccountsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.accounts</code> attribute. 
	 * @param value the accounts
	 */
	public void setAccounts(final SessionContext ctx, final Collection<JnJB2BUnit> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.accounts</code> attribute. 
	 * @param value the accounts
	 */
	public void setAccounts(final Collection<JnJB2BUnit> value)
	{
		setAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accounts. 
	 * @param value the item to add to accounts
	 */
	public void addToAccounts(final SessionContext ctx, final JnJB2BUnit value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accounts. 
	 * @param value the item to add to accounts
	 */
	public void addToAccounts(final JnJB2BUnit value)
	{
		addToAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accounts. 
	 * @param value the item to remove from accounts
	 */
	public void removeFromAccounts(final SessionContext ctx, final JnJB2BUnit value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOUNITRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accounts. 
	 * @param value the item to remove from accounts
	 */
	public void removeFromAccounts(final JnJB2BUnit value)
	{
		removeFromAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute.
	 * @return the allConsumerAccounts
	 */
	public Boolean isAllConsumerAccounts(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLCONSUMERACCOUNTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute.
	 * @return the allConsumerAccounts
	 */
	public Boolean isAllConsumerAccounts()
	{
		return isAllConsumerAccounts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @return the allConsumerAccounts
	 */
	public boolean isAllConsumerAccountsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllConsumerAccounts( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @return the allConsumerAccounts
	 */
	public boolean isAllConsumerAccountsAsPrimitive()
	{
		return isAllConsumerAccountsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @param value the allConsumerAccounts
	 */
	public void setAllConsumerAccounts(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLCONSUMERACCOUNTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @param value the allConsumerAccounts
	 */
	public void setAllConsumerAccounts(final Boolean value)
	{
		setAllConsumerAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @param value the allConsumerAccounts
	 */
	public void setAllConsumerAccounts(final SessionContext ctx, final boolean value)
	{
		setAllConsumerAccounts( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allConsumerAccounts</code> attribute. 
	 * @param value the allConsumerAccounts
	 */
	public void setAllConsumerAccounts(final boolean value)
	{
		setAllConsumerAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allMDDAccounts</code> attribute.
	 * @return the allMDDAccounts
	 */
	public Boolean isAllMDDAccounts(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLMDDACCOUNTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allMDDAccounts</code> attribute.
	 * @return the allMDDAccounts
	 */
	public Boolean isAllMDDAccounts()
	{
		return isAllMDDAccounts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @return the allMDDAccounts
	 */
	public boolean isAllMDDAccountsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllMDDAccounts( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @return the allMDDAccounts
	 */
	public boolean isAllMDDAccountsAsPrimitive()
	{
		return isAllMDDAccountsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @param value the allMDDAccounts
	 */
	public void setAllMDDAccounts(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLMDDACCOUNTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @param value the allMDDAccounts
	 */
	public void setAllMDDAccounts(final Boolean value)
	{
		setAllMDDAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @param value the allMDDAccounts
	 */
	public void setAllMDDAccounts(final SessionContext ctx, final boolean value)
	{
		setAllMDDAccounts( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.allMDDAccounts</code> attribute. 
	 * @param value the allMDDAccounts
	 */
	public void setAllMDDAccounts(final boolean value)
	{
		setAllMDDAccounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.classOfTradeGroups</code> attribute.
	 * @return the classOfTradeGroups
	 */
	public Collection<ClassOfTradeGroup> getClassOfTradeGroups(final SessionContext ctx)
	{
		final List<ClassOfTradeGroup> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			"ClassOfTradeGroup",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.classOfTradeGroups</code> attribute.
	 * @return the classOfTradeGroups
	 */
	public Collection<ClassOfTradeGroup> getClassOfTradeGroups()
	{
		return getClassOfTradeGroups( getSession().getSessionContext() );
	}
	
	public long getClassOfTradeGroupsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			"ClassOfTradeGroup",
			null
		);
	}
	
	public long getClassOfTradeGroupsCount()
	{
		return getClassOfTradeGroupsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.classOfTradeGroups</code> attribute. 
	 * @param value the classOfTradeGroups
	 */
	public void setClassOfTradeGroups(final SessionContext ctx, final Collection<ClassOfTradeGroup> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.classOfTradeGroups</code> attribute. 
	 * @param value the classOfTradeGroups
	 */
	public void setClassOfTradeGroups(final Collection<ClassOfTradeGroup> value)
	{
		setClassOfTradeGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to classOfTradeGroups. 
	 * @param value the item to add to classOfTradeGroups
	 */
	public void addToClassOfTradeGroups(final SessionContext ctx, final ClassOfTradeGroup value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to classOfTradeGroups. 
	 * @param value the item to add to classOfTradeGroups
	 */
	public void addToClassOfTradeGroups(final ClassOfTradeGroup value)
	{
		addToClassOfTradeGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from classOfTradeGroups. 
	 * @param value the item to remove from classOfTradeGroups
	 */
	public void removeFromClassOfTradeGroups(final SessionContext ctx, final ClassOfTradeGroup value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from classOfTradeGroups. 
	 * @param value the item to remove from classOfTradeGroups
	 */
	public void removeFromClassOfTradeGroups(final ClassOfTradeGroup value)
	{
		removeFromClassOfTradeGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(BCASTMSGTOUNITRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("ClassOfTradeGroup");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.messageLevel</code> attribute.
	 * @return the messageLevel
	 */
	public EnumerationValue getMessageLevel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MESSAGELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.messageLevel</code> attribute.
	 * @return the messageLevel
	 */
	public EnumerationValue getMessageLevel()
	{
		return getMessageLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.messageLevel</code> attribute. 
	 * @param value the messageLevel
	 */
	public void setMessageLevel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MESSAGELEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.messageLevel</code> attribute. 
	 * @param value the messageLevel
	 */
	public void setMessageLevel(final EnumerationValue value)
	{
		setMessageLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.priority</code> attribute.
	 * @return the priority
	 */
	public Integer getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPriority( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @return the priority
	 */
	public int getPriorityAsPrimitive()
	{
		return getPriorityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final Integer value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final int value)
	{
		setPriority( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final int value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BroadcastMessage.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BroadcastMessage.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
}
