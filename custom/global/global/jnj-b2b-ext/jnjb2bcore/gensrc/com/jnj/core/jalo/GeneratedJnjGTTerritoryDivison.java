/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTTerritoryDivAddresses;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.UserGroup JnjGTTerritoryDivison}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTTerritoryDivison extends UserGroup
{
	/** Qualifier of the <code>JnjGTTerritoryDivison.divCode</code> attribute **/
	public static final String DIVCODE = "divCode";
	/** Qualifier of the <code>JnjGTTerritoryDivison.territoryCode</code> attribute **/
	public static final String TERRITORYCODE = "territoryCode";
	/** Qualifier of the <code>JnjGTTerritoryDivison.effectiveDate</code> attribute **/
	public static final String EFFECTIVEDATE = "effectiveDate";
	/** Qualifier of the <code>JnjGTTerritoryDivison.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnjGTTerritoryDivison.billingAddresses</code> attribute **/
	public static final String BILLINGADDRESSES = "billingAddresses";
	/** Qualifier of the <code>JnjGTTerritoryDivison.invalidated</code> attribute **/
	public static final String INVALIDATED = "invalidated";
	/** Qualifier of the <code>JnjGTTerritoryDivison.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTTerritoryDivison.addresses</code> attribute **/
	public static final String ADDRESSES = "addresses";
	/**
	* {@link OneToManyHandler} for handling 1:n ADDRESSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTTerritoryDivAddresses> ADDRESSESHANDLER = new OneToManyHandler<JnjGTTerritoryDivAddresses>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserGroup.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DIVCODE, AttributeMode.INITIAL);
		tmp.put(TERRITORYCODE, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(BILLINGADDRESSES, AttributeMode.INITIAL);
		tmp.put(INVALIDATED, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.addresses</code> attribute.
	 * @return the addresses
	 */
	public Set<JnjGTTerritoryDivAddresses> getAddresses(final SessionContext ctx)
	{
		return (Set<JnjGTTerritoryDivAddresses>)ADDRESSESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.addresses</code> attribute.
	 * @return the addresses
	 */
	public Set<JnjGTTerritoryDivAddresses> getAddresses()
	{
		return getAddresses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final SessionContext ctx, final Set<JnjGTTerritoryDivAddresses> value)
	{
		ADDRESSESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final Set<JnjGTTerritoryDivAddresses> value)
	{
		setAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to addresses. 
	 * @param value the item to add to addresses
	 */
	public void addToAddresses(final SessionContext ctx, final JnjGTTerritoryDivAddresses value)
	{
		ADDRESSESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to addresses. 
	 * @param value the item to add to addresses
	 */
	public void addToAddresses(final JnjGTTerritoryDivAddresses value)
	{
		addToAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from addresses. 
	 * @param value the item to remove from addresses
	 */
	public void removeFromAddresses(final SessionContext ctx, final JnjGTTerritoryDivAddresses value)
	{
		ADDRESSESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from addresses. 
	 * @param value the item to remove from addresses
	 */
	public void removeFromAddresses(final JnjGTTerritoryDivAddresses value)
	{
		removeFromAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.billingAddresses</code> attribute.
	 * @return the billingAddresses - Will be used to keep valid address id for Territory-Division Mapping
	 */
	public Collection<String> getBillingAddresses(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, BILLINGADDRESSES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.billingAddresses</code> attribute.
	 * @return the billingAddresses - Will be used to keep valid address id for Territory-Division Mapping
	 */
	public Collection<String> getBillingAddresses()
	{
		return getBillingAddresses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.billingAddresses</code> attribute. 
	 * @param value the billingAddresses - Will be used to keep valid address id for Territory-Division Mapping
	 */
	public void setBillingAddresses(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, BILLINGADDRESSES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.billingAddresses</code> attribute. 
	 * @param value the billingAddresses - Will be used to keep valid address id for Territory-Division Mapping
	 */
	public void setBillingAddresses(final Collection<String> value)
	{
		setBillingAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.divCode</code> attribute.
	 * @return the divCode - Sales Division code as per the Territory(OrgId/TerritoryCode)
	 */
	public String getDivCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.divCode</code> attribute.
	 * @return the divCode - Sales Division code as per the Territory(OrgId/TerritoryCode)
	 */
	public String getDivCode()
	{
		return getDivCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.divCode</code> attribute. 
	 * @param value the divCode - Sales Division code as per the Territory(OrgId/TerritoryCode)
	 */
	public void setDivCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.divCode</code> attribute. 
	 * @param value the divCode - Sales Division code as per the Territory(OrgId/TerritoryCode)
	 */
	public void setDivCode(final String value)
	{
		setDivCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.effectiveDate</code> attribute.
	 * @return the effectiveDate - Start Date of relationship
	 */
	public Date getEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.effectiveDate</code> attribute.
	 * @return the effectiveDate - Start Date of relationship
	 */
	public Date getEffectiveDate()
	{
		return getEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.effectiveDate</code> attribute. 
	 * @param value the effectiveDate - Start Date of relationship
	 */
	public void setEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.effectiveDate</code> attribute. 
	 * @param value the effectiveDate - Start Date of relationship
	 */
	public void setEffectiveDate(final Date value)
	{
		setEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.endDate</code> attribute.
	 * @return the endDate - End Date of relationship
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.endDate</code> attribute.
	 * @return the endDate - End Date of relationship
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.endDate</code> attribute. 
	 * @param value the endDate - End Date of relationship
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.endDate</code> attribute. 
	 * @param value the endDate - End Date of relationship
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute.
	 * @return the invalidated - Denotes the validity of relation
	 */
	public Boolean isInvalidated(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INVALIDATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute.
	 * @return the invalidated - Denotes the validity of relation
	 */
	public Boolean isInvalidated()
	{
		return isInvalidated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @return the invalidated - Denotes the validity of relation
	 */
	public boolean isInvalidatedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInvalidated( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @return the invalidated - Denotes the validity of relation
	 */
	public boolean isInvalidatedAsPrimitive()
	{
		return isInvalidatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INVALIDATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final Boolean value)
	{
		setInvalidated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final SessionContext ctx, final boolean value)
	{
		setInvalidated( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.invalidated</code> attribute. 
	 * @param value the invalidated - Denotes the validity of relation
	 */
	public void setInvalidated(final boolean value)
	{
		setInvalidated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.sourceSystemId</code> attribute.
	 * @return the sourceSystemId - Denotes the source System of relation
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.sourceSystemId</code> attribute.
	 * @return the sourceSystemId - Denotes the source System of relation
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId - Denotes the source System of relation
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId - Denotes the source System of relation
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.territoryCode</code> attribute.
	 * @return the territoryCode - OrgId/TerritoryCode
	 */
	public String getTerritoryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TERRITORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivison.territoryCode</code> attribute.
	 * @return the territoryCode - OrgId/TerritoryCode
	 */
	public String getTerritoryCode()
	{
		return getTerritoryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.territoryCode</code> attribute. 
	 * @param value the territoryCode - OrgId/TerritoryCode
	 */
	public void setTerritoryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TERRITORYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivison.territoryCode</code> attribute. 
	 * @param value the territoryCode - OrgId/TerritoryCode
	 */
	public void setTerritoryCode(final String value)
	{
		setTerritoryCode( getSession().getSessionContext(), value );
	}
	
}
