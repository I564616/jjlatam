/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTTerritoryDivison;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTTerritoryDivAddresses}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTTerritoryDivAddresses extends GenericItem
{
	/** Qualifier of the <code>JnjGTTerritoryDivAddresses.addressCode</code> attribute **/
	public static final String ADDRESSCODE = "addressCode";
	/** Qualifier of the <code>JnjGTTerritoryDivAddresses.jnjGTTerritoryDivison</code> attribute **/
	public static final String JNJGTTERRITORYDIVISON = "jnjGTTerritoryDivison";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JNJGTTERRITORYDIVISON's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTTerritoryDivAddresses> JNJGTTERRITORYDIVISONHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTTerritoryDivAddresses>(
	Jnjb2bCoreConstants.TC.JNJGTTERRITORYDIVADDRESSES,
	false,
	"jnjGTTerritoryDivison",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ADDRESSCODE, AttributeMode.INITIAL);
		tmp.put(JNJGTTERRITORYDIVISON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivAddresses.addressCode</code> attribute.
	 * @return the addressCode - Address code corresponding to the Ship to number from Terriroty Feed.
	 */
	public String getAddressCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivAddresses.addressCode</code> attribute.
	 * @return the addressCode - Address code corresponding to the Ship to number from Terriroty Feed.
	 */
	public String getAddressCode()
	{
		return getAddressCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivAddresses.addressCode</code> attribute. 
	 * @param value the addressCode - Address code corresponding to the Ship to number from Terriroty Feed.
	 */
	public void setAddressCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivAddresses.addressCode</code> attribute. 
	 * @param value the addressCode - Address code corresponding to the Ship to number from Terriroty Feed.
	 */
	public void setAddressCode(final String value)
	{
		setAddressCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		JNJGTTERRITORYDIVISONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivAddresses.jnjGTTerritoryDivison</code> attribute.
	 * @return the jnjGTTerritoryDivison
	 */
	public JnjGTTerritoryDivison getJnjGTTerritoryDivison(final SessionContext ctx)
	{
		return (JnjGTTerritoryDivison)getProperty( ctx, JNJGTTERRITORYDIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivAddresses.jnjGTTerritoryDivison</code> attribute.
	 * @return the jnjGTTerritoryDivison
	 */
	public JnjGTTerritoryDivison getJnjGTTerritoryDivison()
	{
		return getJnjGTTerritoryDivison( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivAddresses.jnjGTTerritoryDivison</code> attribute. 
	 * @param value the jnjGTTerritoryDivison
	 */
	public void setJnjGTTerritoryDivison(final SessionContext ctx, final JnjGTTerritoryDivison value)
	{
		JNJGTTERRITORYDIVISONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivAddresses.jnjGTTerritoryDivison</code> attribute. 
	 * @param value the jnjGTTerritoryDivison
	 */
	public void setJnjGTTerritoryDivison(final JnjGTTerritoryDivison value)
	{
		setJnjGTTerritoryDivison( getSession().getSessionContext(), value );
	}
	
}
