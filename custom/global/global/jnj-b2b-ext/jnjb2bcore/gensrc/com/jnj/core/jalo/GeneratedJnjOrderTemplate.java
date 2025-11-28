/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2bCustomer;
import com.jnj.core.jalo.JnjTemplateEntry;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjOrderTemplate}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjOrderTemplate extends GenericItem
{
	/** Qualifier of the <code>JnjOrderTemplate.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnjOrderTemplate.entryList</code> attribute **/
	public static final String ENTRYLIST = "entryList";
	/** Qualifier of the <code>JnjOrderTemplate.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjOrderTemplate.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjOrderTemplate.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjOrderTemplate.orderType</code> attribute **/
	public static final String ORDERTYPE = "orderType";
	/** Qualifier of the <code>JnjOrderTemplate.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>JnjOrderTemplate.addressId</code> attribute **/
	public static final String ADDRESSID = "addressId";
	/** Qualifier of the <code>JnjOrderTemplate.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>JnjOrderTemplate.shareStatus</code> attribute **/
	public static final String SHARESTATUS = "shareStatus";
	/** Qualifier of the <code>JnjOrderTemplate.visibleTo</code> attribute **/
	public static final String VISIBLETO = "visibleTo";
	/** Qualifier of the <code>JnjOrderTemplate.templateNumber</code> attribute **/
	public static final String TEMPLATENUMBER = "templateNumber";
	/** Qualifier of the <code>JnjOrderTemplate.unit</code> attribute **/
	public static final String UNIT = "unit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n UNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjOrderTemplate> UNITHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjOrderTemplate>(
	Jnjb2bCoreConstants.TC.JNJORDERTEMPLATE,
	false,
	"unit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(ENTRYLIST, AttributeMode.INITIAL);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(ORDERTYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESSID, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(SHARESTATUS, AttributeMode.INITIAL);
		tmp.put(VISIBLETO, AttributeMode.INITIAL);
		tmp.put(TEMPLATENUMBER, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.addressId</code> attribute.
	 * @return the addressId
	 */
	public String getAddressId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.addressId</code> attribute.
	 * @return the addressId
	 */
	public String getAddressId()
	{
		return getAddressId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.addressId</code> attribute. 
	 * @param value the addressId
	 */
	public void setAddressId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.addressId</code> attribute. 
	 * @param value the addressId
	 */
	public void setAddressId(final String value)
	{
		setAddressId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.author</code> attribute.
	 * @return the author
	 */
	public JnJB2bCustomer getAuthor(final SessionContext ctx)
	{
		return (JnJB2bCustomer)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.author</code> attribute.
	 * @return the author
	 */
	public JnJB2bCustomer getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final JnJB2bCustomer value)
	{
		setProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final JnJB2bCustomer value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		UNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.entryList</code> attribute.
	 * @return the entryList
	 */
	public List<JnjTemplateEntry> getEntryList(final SessionContext ctx)
	{
		List<JnjTemplateEntry> coll = (List<JnjTemplateEntry>)getProperty( ctx, ENTRYLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.entryList</code> attribute.
	 * @return the entryList
	 */
	public List<JnjTemplateEntry> getEntryList()
	{
		return getEntryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.entryList</code> attribute. 
	 * @param value the entryList
	 */
	public void setEntryList(final SessionContext ctx, final List<JnjTemplateEntry> value)
	{
		setProperty(ctx, ENTRYLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.entryList</code> attribute. 
	 * @param value the entryList
	 */
	public void setEntryList(final List<JnjTemplateEntry> value)
	{
		setEntryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType()
	{
		return getOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final String value)
	{
		setOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.shareStatus</code> attribute.
	 * @return the shareStatus
	 */
	public EnumerationValue getShareStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SHARESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.shareStatus</code> attribute.
	 * @return the shareStatus
	 */
	public EnumerationValue getShareStatus()
	{
		return getShareStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.shareStatus</code> attribute. 
	 * @param value the shareStatus
	 */
	public void setShareStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SHARESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.shareStatus</code> attribute. 
	 * @param value the shareStatus
	 */
	public void setShareStatus(final EnumerationValue value)
	{
		setShareStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.templateNumber</code> attribute.
	 * @return the templateNumber - This holds the value of ELMO/Gateway template number/hybris generated unique code.
	 */
	public String getTemplateNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEMPLATENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.templateNumber</code> attribute.
	 * @return the templateNumber - This holds the value of ELMO/Gateway template number/hybris generated unique code.
	 */
	public String getTemplateNumber()
	{
		return getTemplateNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.templateNumber</code> attribute. 
	 * @param value the templateNumber - This holds the value of ELMO/Gateway template number/hybris generated unique code.
	 */
	public void setTemplateNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEMPLATENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.templateNumber</code> attribute. 
	 * @param value the templateNumber - This holds the value of ELMO/Gateway template number/hybris generated unique code.
	 */
	public void setTemplateNumber(final String value)
	{
		setTemplateNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.unit</code> attribute.
	 * @return the unit
	 */
	public B2BUnit getUnit(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.unit</code> attribute.
	 * @return the unit
	 */
	public B2BUnit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final B2BUnit value)
	{
		UNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final B2BUnit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.visibleTo</code> attribute.
	 * @return the visibleTo
	 */
	public Principal getVisibleTo(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, VISIBLETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderTemplate.visibleTo</code> attribute.
	 * @return the visibleTo
	 */
	public Principal getVisibleTo()
	{
		return getVisibleTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.visibleTo</code> attribute. 
	 * @param value the visibleTo
	 */
	public void setVisibleTo(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, VISIBLETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderTemplate.visibleTo</code> attribute. 
	 * @param value the visibleTo
	 */
	public void setVisibleTo(final Principal value)
	{
		setVisibleTo( getSession().getSessionContext(), value );
	}
	
}
