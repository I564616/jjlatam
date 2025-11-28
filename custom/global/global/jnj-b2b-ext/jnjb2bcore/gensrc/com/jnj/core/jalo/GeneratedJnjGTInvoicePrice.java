/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTInvoice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTInvoicePrice}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTInvoicePrice extends GenericItem
{
	/** Qualifier of the <code>JnjGTInvoicePrice.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTInvoicePrice.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTInvoicePrice.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	/** Qualifier of the <code>JnjGTInvoicePrice.headerPriceValue</code> attribute **/
	public static final String HEADERPRICEVALUE = "headerPriceValue";
	/** Qualifier of the <code>JnjGTInvoicePrice.conditionType</code> attribute **/
	public static final String CONDITIONTYPE = "conditionType";
	/** Qualifier of the <code>JnjGTInvoicePrice.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTInvoicePrice.invoice</code> attribute **/
	public static final String INVOICE = "invoice";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVOICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTInvoicePrice> INVOICEHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTInvoicePrice>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICEPRICE,
	false,
	"invoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(HEADERPRICEVALUE, AttributeMode.INITIAL);
		tmp.put(CONDITIONTYPE, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(INVOICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.conditionType</code> attribute.
	 * @return the conditionType
	 */
	public String getConditionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.conditionType</code> attribute.
	 * @return the conditionType
	 */
	public String getConditionType()
	{
		return getConditionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.conditionType</code> attribute. 
	 * @param value the conditionType
	 */
	public void setConditionType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.conditionType</code> attribute. 
	 * @param value the conditionType
	 */
	public void setConditionType(final String value)
	{
		setConditionType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INVOICEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.headerPriceValue</code> attribute.
	 * @return the headerPriceValue
	 */
	public String getHeaderPriceValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADERPRICEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.headerPriceValue</code> attribute.
	 * @return the headerPriceValue
	 */
	public String getHeaderPriceValue()
	{
		return getHeaderPriceValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.headerPriceValue</code> attribute. 
	 * @param value the headerPriceValue
	 */
	public void setHeaderPriceValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADERPRICEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.headerPriceValue</code> attribute. 
	 * @param value the headerPriceValue
	 */
	public void setHeaderPriceValue(final String value)
	{
		setHeaderPriceValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.invoice</code> attribute.
	 * @return the invoice
	 */
	public JnjGTInvoice getInvoice(final SessionContext ctx)
	{
		return (JnjGTInvoice)getProperty( ctx, INVOICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.invoice</code> attribute.
	 * @return the invoice
	 */
	public JnjGTInvoice getInvoice()
	{
		return getInvoice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.invoice</code> attribute. 
	 * @param value the invoice
	 */
	public void setInvoice(final SessionContext ctx, final JnjGTInvoice value)
	{
		INVOICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.invoice</code> attribute. 
	 * @param value the invoice
	 */
	public void setInvoice(final JnjGTInvoice value)
	{
		setInvoice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoicePrice.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoicePrice.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
