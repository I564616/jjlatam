/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.gt.pac.aera.jalo;

import com.gt.pac.aera.constants.Jnjgtb2bpacConstants;
import com.gt.pac.aera.jalo.JnjPacHiveEntry;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Jnjgtb2bpacManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjgtb2bpacManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n JNJPACHIVEENTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjPacHiveEntry> JNJPACHIVEENTRYORDERENTRYRELATIONJNJPACHIVEENTRIESHANDLER = new OneToManyHandler<JnjPacHiveEntry>(
	Jnjgtb2bpacConstants.TC.JNJPACHIVEENTRY,
	false,
	"orderEntry",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public JnjPacHiveEntry createJnjPacHiveEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bpacConstants.TC.JNJPACHIVEENTRY );
			return (JnjPacHiveEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPacHiveEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPacHiveEntry createJnjPacHiveEntry(final Map attributeValues)
	{
		return createJnjPacHiveEntry( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Jnjgtb2bpacConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.jnjPacHiveEntries</code> attribute.
	 * @return the jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public Collection<JnjPacHiveEntry> getJnjPacHiveEntries(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return JNJPACHIVEENTRYORDERENTRYRELATIONJNJPACHIVEENTRIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.jnjPacHiveEntries</code> attribute.
	 * @return the jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public Collection<JnjPacHiveEntry> getJnjPacHiveEntries(final AbstractOrderEntry item)
	{
		return getJnjPacHiveEntries( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.jnjPacHiveEntries</code> attribute. 
	 * @param value the jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void setJnjPacHiveEntries(final SessionContext ctx, final AbstractOrderEntry item, final Collection<JnjPacHiveEntry> value)
	{
		JNJPACHIVEENTRYORDERENTRYRELATIONJNJPACHIVEENTRIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.jnjPacHiveEntries</code> attribute. 
	 * @param value the jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void setJnjPacHiveEntries(final AbstractOrderEntry item, final Collection<JnjPacHiveEntry> value)
	{
		setJnjPacHiveEntries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjPacHiveEntries. 
	 * @param value the item to add to jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void addToJnjPacHiveEntries(final SessionContext ctx, final AbstractOrderEntry item, final JnjPacHiveEntry value)
	{
		JNJPACHIVEENTRYORDERENTRYRELATIONJNJPACHIVEENTRIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjPacHiveEntries. 
	 * @param value the item to add to jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void addToJnjPacHiveEntries(final AbstractOrderEntry item, final JnjPacHiveEntry value)
	{
		addToJnjPacHiveEntries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjPacHiveEntries. 
	 * @param value the item to remove from jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void removeFromJnjPacHiveEntries(final SessionContext ctx, final AbstractOrderEntry item, final JnjPacHiveEntry value)
	{
		JNJPACHIVEENTRYORDERENTRYRELATIONJNJPACHIVEENTRIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjPacHiveEntries. 
	 * @param value the item to remove from jnjPacHiveEntries - JnJ PAC HIVE records with estimated delivery dates for this order entry.
	 */
	public void removeFromJnjPacHiveEntries(final AbstractOrderEntry item, final JnjPacHiveEntry value)
	{
		removeFromJnjPacHiveEntries( getSession().getSessionContext(), item, value );
	}
	
}
