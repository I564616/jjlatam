/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.BroadcastMessage;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.UserGroup ClassOfTradeGroup}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedClassOfTradeGroup extends UserGroup
{
	/** Qualifier of the <code>ClassOfTradeGroup.broarcastMessages4group</code> attribute **/
	public static final String BROARCASTMESSAGES4GROUP = "broarcastMessages4group";
	/** Relation ordering override parameter constants for BcastMsgToCTGrpRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOCTGRPRELATION_SRC_ORDERED = "relation.BcastMsgToCTGrpRelation.source.ordered";
	protected static String BCASTMSGTOCTGRPRELATION_TGT_ORDERED = "relation.BcastMsgToCTGrpRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BcastMsgToCTGrpRelation from ((jnjb2bcore))*/
	protected static String BCASTMSGTOCTGRPRELATION_MARKMODIFIED = "relation.BcastMsgToCTGrpRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserGroup.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassOfTradeGroup.broarcastMessages4group</code> attribute.
	 * @return the broarcastMessages4group
	 */
	public Collection<BroadcastMessage> getBroarcastMessages4group(final SessionContext ctx)
	{
		final List<BroadcastMessage> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			"BroadcastMessage",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassOfTradeGroup.broarcastMessages4group</code> attribute.
	 * @return the broarcastMessages4group
	 */
	public Collection<BroadcastMessage> getBroarcastMessages4group()
	{
		return getBroarcastMessages4group( getSession().getSessionContext() );
	}
	
	public long getBroarcastMessages4groupCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			"BroadcastMessage",
			null
		);
	}
	
	public long getBroarcastMessages4groupCount()
	{
		return getBroarcastMessages4groupCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassOfTradeGroup.broarcastMessages4group</code> attribute. 
	 * @param value the broarcastMessages4group
	 */
	public void setBroarcastMessages4group(final SessionContext ctx, final Collection<BroadcastMessage> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassOfTradeGroup.broarcastMessages4group</code> attribute. 
	 * @param value the broarcastMessages4group
	 */
	public void setBroarcastMessages4group(final Collection<BroadcastMessage> value)
	{
		setBroarcastMessages4group( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to broarcastMessages4group. 
	 * @param value the item to add to broarcastMessages4group
	 */
	public void addToBroarcastMessages4group(final SessionContext ctx, final BroadcastMessage value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to broarcastMessages4group. 
	 * @param value the item to add to broarcastMessages4group
	 */
	public void addToBroarcastMessages4group(final BroadcastMessage value)
	{
		addToBroarcastMessages4group( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from broarcastMessages4group. 
	 * @param value the item to remove from broarcastMessages4group
	 */
	public void removeFromBroarcastMessages4group(final SessionContext ctx, final BroadcastMessage value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BCASTMSGTOCTGRPRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from broarcastMessages4group. 
	 * @param value the item to remove from broarcastMessages4group
	 */
	public void removeFromBroarcastMessages4group(final BroadcastMessage value)
	{
		removeFromBroarcastMessages4group( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("BroadcastMessage");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BCASTMSGTOCTGRPRELATION_MARKMODIFIED);
		}
		return true;
	}
	
}
