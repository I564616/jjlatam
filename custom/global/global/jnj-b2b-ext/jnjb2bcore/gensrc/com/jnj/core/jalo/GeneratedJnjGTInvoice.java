/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import com.jnj.core.jalo.JnjGTInvoiceEntry;
import com.jnj.core.jalo.JnjGTInvoicePrice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTInvoice}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTInvoice extends GenericItem
{
	/** Qualifier of the <code>JnjGTInvoice.invoiceDocNum</code> attribute **/
	public static final String INVOICEDOCNUM = "invoiceDocNum";
	/** Qualifier of the <code>JnjGTInvoice.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTInvoice.salesOrgDistChannel</code> attribute **/
	public static final String SALESORGDISTCHANNEL = "salesOrgDistChannel";
	/** Qualifier of the <code>JnjGTInvoice.salesOrgDivCode</code> attribute **/
	public static final String SALESORGDIVCODE = "salesOrgDivCode";
	/** Qualifier of the <code>JnjGTInvoice.billingType</code> attribute **/
	public static final String BILLINGTYPE = "billingType";
	/** Qualifier of the <code>JnjGTInvoice.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>JnjGTInvoice.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>JnjGTInvoice.billingDate</code> attribute **/
	public static final String BILLINGDATE = "billingDate";
	/** Qualifier of the <code>JnjGTInvoice.payerAccNum</code> attribute **/
	public static final String PAYERACCNUM = "payerAccNum";
	/** Qualifier of the <code>JnjGTInvoice.soldToAccNum</code> attribute **/
	public static final String SOLDTOACCNUM = "soldToAccNum";
	/** Qualifier of the <code>JnjGTInvoice.poOrderNum</code> attribute **/
	public static final String POORDERNUM = "poOrderNum";
	/** Qualifier of the <code>JnjGTInvoice.taxAmt</code> attribute **/
	public static final String TAXAMT = "taxAmt";
	/** Qualifier of the <code>JnjGTInvoice.shipToAccNum</code> attribute **/
	public static final String SHIPTOACCNUM = "shipToAccNum";
	/** Qualifier of the <code>JnjGTInvoice.billToAccNum</code> attribute **/
	public static final String BILLTOACCNUM = "billToAccNum";
	/** Qualifier of the <code>JnjGTInvoice.shipToAddress</code> attribute **/
	public static final String SHIPTOADDRESS = "shipToAddress";
	/** Qualifier of the <code>JnjGTInvoice.shipToPONum</code> attribute **/
	public static final String SHIPTOPONUM = "shipToPONum";
	/** Qualifier of the <code>JnjGTInvoice.payerAccGLN</code> attribute **/
	public static final String PAYERACCGLN = "payerAccGLN";
	/** Qualifier of the <code>JnjGTInvoice.soldToAccGLN</code> attribute **/
	public static final String SOLDTOACCGLN = "soldToAccGLN";
	/** Qualifier of the <code>JnjGTInvoice.billToAccGLN</code> attribute **/
	public static final String BILLTOACCGLN = "billToAccGLN";
	/** Qualifier of the <code>JnjGTInvoice.shipToAccGLN</code> attribute **/
	public static final String SHIPTOACCGLN = "shipToAccGLN";
	/** Qualifier of the <code>JnjGTInvoice.headerPriceValue</code> attribute **/
	public static final String HEADERPRICEVALUE = "headerPriceValue";
	/** Qualifier of the <code>JnjGTInvoice.conditionType</code> attribute **/
	public static final String CONDITIONTYPE = "conditionType";
	/** Qualifier of the <code>JnjGTInvoice.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTInvoice.carrier</code> attribute **/
	public static final String CARRIER = "carrier";
	/** Qualifier of the <code>JnjGTInvoice.subTotalPrice</code> attribute **/
	public static final String SUBTOTALPRICE = "subTotalPrice";
	/** Qualifier of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute **/
	public static final String ADJUSTEDRATEALLOWANCE = "adjustedRateAllowance";
	/** Qualifier of the <code>JnjGTInvoice.totalFees</code> attribute **/
	public static final String TOTALFEES = "totalFees";
	/** Qualifier of the <code>JnjGTInvoice.totalFreightFees</code> attribute **/
	public static final String TOTALFREIGHTFEES = "totalFreightFees";
	/** Qualifier of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute **/
	public static final String TOTALHSAPROMOTION = "totalHsaPromotion";
	/** Qualifier of the <code>JnjGTInvoice.otherCharges</code> attribute **/
	public static final String OTHERCHARGES = "otherCharges";
	/** Qualifier of the <code>JnjGTInvoice.totalDropShipFee</code> attribute **/
	public static final String TOTALDROPSHIPFEE = "totalDropShipFee";
	/** Qualifier of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute **/
	public static final String TOTALMINIMUMORDERFEE = "totalminimumOrderFee";
	/** Qualifier of the <code>JnjGTInvoice.totalTax</code> attribute **/
	public static final String TOTALTAX = "totalTax";
	/** Qualifier of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute **/
	public static final String INVOICETOTALAMOUNT = "invoiceTotalAmount";
	/** Qualifier of the <code>JnjGTInvoice.totalManualFee</code> attribute **/
	public static final String TOTALMANUALFEE = "totalManualFee";
	/** Qualifier of the <code>JnjGTInvoice.totalExpediteFee</code> attribute **/
	public static final String TOTALEXPEDITEFEE = "totalExpediteFee";
	/** Qualifier of the <code>JnjGTInvoice.paidAmount</code> attribute **/
	public static final String PAIDAMOUNT = "paidAmount";
	/** Qualifier of the <code>JnjGTInvoice.openAmount</code> attribute **/
	public static final String OPENAMOUNT = "openAmount";
	/** Qualifier of the <code>JnjGTInvoice.invoiceDueDate</code> attribute **/
	public static final String INVOICEDUEDATE = "invoiceDueDate";
	/** Qualifier of the <code>JnjGTInvoice.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnjGTInvoice.receiptNumber</code> attribute **/
	public static final String RECEIPTNUMBER = "receiptNumber";
	/** Qualifier of the <code>JnjGTInvoice.entries</code> attribute **/
	public static final String ENTRIES = "entries";
	/** Qualifier of the <code>JnjGTInvoice.prices</code> attribute **/
	public static final String PRICES = "prices";
	/** Qualifier of the <code>JnjGTInvoice.order</code> attribute **/
	public static final String ORDER = "order";
	/**
	* {@link OneToManyHandler} for handling 1:n ENTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTInvoiceEntry> ENTRIESHANDLER = new OneToManyHandler<JnjGTInvoiceEntry>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICEENTRY,
	false,
	"invoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRICES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTInvoicePrice> PRICESHANDLER = new OneToManyHandler<JnjGTInvoicePrice>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICEPRICE,
	false,
	"invoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTInvoice> ORDERHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTInvoice>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICE,
	false,
	"order",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INVOICEDOCNUM, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(SALESORGDISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(SALESORGDIVCODE, AttributeMode.INITIAL);
		tmp.put(BILLINGTYPE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(NETVALUE, AttributeMode.INITIAL);
		tmp.put(BILLINGDATE, AttributeMode.INITIAL);
		tmp.put(PAYERACCNUM, AttributeMode.INITIAL);
		tmp.put(SOLDTOACCNUM, AttributeMode.INITIAL);
		tmp.put(POORDERNUM, AttributeMode.INITIAL);
		tmp.put(TAXAMT, AttributeMode.INITIAL);
		tmp.put(SHIPTOACCNUM, AttributeMode.INITIAL);
		tmp.put(BILLTOACCNUM, AttributeMode.INITIAL);
		tmp.put(SHIPTOADDRESS, AttributeMode.INITIAL);
		tmp.put(SHIPTOPONUM, AttributeMode.INITIAL);
		tmp.put(PAYERACCGLN, AttributeMode.INITIAL);
		tmp.put(SOLDTOACCGLN, AttributeMode.INITIAL);
		tmp.put(BILLTOACCGLN, AttributeMode.INITIAL);
		tmp.put(SHIPTOACCGLN, AttributeMode.INITIAL);
		tmp.put(HEADERPRICEVALUE, AttributeMode.INITIAL);
		tmp.put(CONDITIONTYPE, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(CARRIER, AttributeMode.INITIAL);
		tmp.put(SUBTOTALPRICE, AttributeMode.INITIAL);
		tmp.put(ADJUSTEDRATEALLOWANCE, AttributeMode.INITIAL);
		tmp.put(TOTALFEES, AttributeMode.INITIAL);
		tmp.put(TOTALFREIGHTFEES, AttributeMode.INITIAL);
		tmp.put(TOTALHSAPROMOTION, AttributeMode.INITIAL);
		tmp.put(OTHERCHARGES, AttributeMode.INITIAL);
		tmp.put(TOTALDROPSHIPFEE, AttributeMode.INITIAL);
		tmp.put(TOTALMINIMUMORDERFEE, AttributeMode.INITIAL);
		tmp.put(TOTALTAX, AttributeMode.INITIAL);
		tmp.put(INVOICETOTALAMOUNT, AttributeMode.INITIAL);
		tmp.put(TOTALMANUALFEE, AttributeMode.INITIAL);
		tmp.put(TOTALEXPEDITEFEE, AttributeMode.INITIAL);
		tmp.put(PAIDAMOUNT, AttributeMode.INITIAL);
		tmp.put(OPENAMOUNT, AttributeMode.INITIAL);
		tmp.put(INVOICEDUEDATE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(RECEIPTNUMBER, AttributeMode.INITIAL);
		tmp.put(ORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute.
	 * @return the adjustedRateAllowance
	 */
	public Double getAdjustedRateAllowance(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ADJUSTEDRATEALLOWANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute.
	 * @return the adjustedRateAllowance
	 */
	public Double getAdjustedRateAllowance()
	{
		return getAdjustedRateAllowance( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @return the adjustedRateAllowance
	 */
	public double getAdjustedRateAllowanceAsPrimitive(final SessionContext ctx)
	{
		Double value = getAdjustedRateAllowance( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @return the adjustedRateAllowance
	 */
	public double getAdjustedRateAllowanceAsPrimitive()
	{
		return getAdjustedRateAllowanceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @param value the adjustedRateAllowance
	 */
	public void setAdjustedRateAllowance(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ADJUSTEDRATEALLOWANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @param value the adjustedRateAllowance
	 */
	public void setAdjustedRateAllowance(final Double value)
	{
		setAdjustedRateAllowance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @param value the adjustedRateAllowance
	 */
	public void setAdjustedRateAllowance(final SessionContext ctx, final double value)
	{
		setAdjustedRateAllowance( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.adjustedRateAllowance</code> attribute. 
	 * @param value the adjustedRateAllowance
	 */
	public void setAdjustedRateAllowance(final double value)
	{
		setAdjustedRateAllowance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billingDate</code> attribute.
	 * @return the billingDate
	 */
	public Date getBillingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BILLINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billingDate</code> attribute.
	 * @return the billingDate
	 */
	public Date getBillingDate()
	{
		return getBillingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billingDate</code> attribute. 
	 * @param value the billingDate
	 */
	public void setBillingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BILLINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billingDate</code> attribute. 
	 * @param value the billingDate
	 */
	public void setBillingDate(final Date value)
	{
		setBillingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billingType</code> attribute.
	 * @return the billingType
	 */
	public String getBillingType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billingType</code> attribute.
	 * @return the billingType
	 */
	public String getBillingType()
	{
		return getBillingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billingType</code> attribute. 
	 * @param value the billingType
	 */
	public void setBillingType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billingType</code> attribute. 
	 * @param value the billingType
	 */
	public void setBillingType(final String value)
	{
		setBillingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billToAccGLN</code> attribute.
	 * @return the billToAccGLN
	 */
	public String getBillToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billToAccGLN</code> attribute.
	 * @return the billToAccGLN
	 */
	public String getBillToAccGLN()
	{
		return getBillToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billToAccGLN</code> attribute. 
	 * @param value the billToAccGLN
	 */
	public void setBillToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billToAccGLN</code> attribute. 
	 * @param value the billToAccGLN
	 */
	public void setBillToAccGLN(final String value)
	{
		setBillToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billToAccNum</code> attribute.
	 * @return the billToAccNum
	 */
	public String getBillToAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.billToAccNum</code> attribute.
	 * @return the billToAccNum
	 */
	public String getBillToAccNum()
	{
		return getBillToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billToAccNum</code> attribute. 
	 * @param value the billToAccNum
	 */
	public void setBillToAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.billToAccNum</code> attribute. 
	 * @param value the billToAccNum
	 */
	public void setBillToAccNum(final String value)
	{
		setBillToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.carrier</code> attribute.
	 * @return the carrier
	 */
	public String getCarrier(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.carrier</code> attribute.
	 * @return the carrier
	 */
	public String getCarrier()
	{
		return getCarrier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.carrier</code> attribute. 
	 * @param value the carrier
	 */
	public void setCarrier(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.carrier</code> attribute. 
	 * @param value the carrier
	 */
	public void setCarrier(final String value)
	{
		setCarrier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.conditionType</code> attribute.
	 * @return the conditionType
	 */
	public String getConditionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.conditionType</code> attribute.
	 * @return the conditionType
	 */
	public String getConditionType()
	{
		return getConditionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.conditionType</code> attribute. 
	 * @param value the conditionType
	 */
	public void setConditionType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.conditionType</code> attribute. 
	 * @param value the conditionType
	 */
	public void setConditionType(final String value)
	{
		setConditionType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.entries</code> attribute.
	 * @return the entries
	 */
	public Collection<JnjGTInvoiceEntry> getEntries(final SessionContext ctx)
	{
		return ENTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.entries</code> attribute.
	 * @return the entries
	 */
	public Collection<JnjGTInvoiceEntry> getEntries()
	{
		return getEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final SessionContext ctx, final Collection<JnjGTInvoiceEntry> value)
	{
		ENTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final Collection<JnjGTInvoiceEntry> value)
	{
		setEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entries. 
	 * @param value the item to add to entries
	 */
	public void addToEntries(final SessionContext ctx, final JnjGTInvoiceEntry value)
	{
		ENTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entries. 
	 * @param value the item to add to entries
	 */
	public void addToEntries(final JnjGTInvoiceEntry value)
	{
		addToEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entries. 
	 * @param value the item to remove from entries
	 */
	public void removeFromEntries(final SessionContext ctx, final JnjGTInvoiceEntry value)
	{
		ENTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entries. 
	 * @param value the item to remove from entries
	 */
	public void removeFromEntries(final JnjGTInvoiceEntry value)
	{
		removeFromEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.headerPriceValue</code> attribute.
	 * @return the headerPriceValue
	 */
	public String getHeaderPriceValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADERPRICEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.headerPriceValue</code> attribute.
	 * @return the headerPriceValue
	 */
	public String getHeaderPriceValue()
	{
		return getHeaderPriceValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.headerPriceValue</code> attribute. 
	 * @param value the headerPriceValue
	 */
	public void setHeaderPriceValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADERPRICEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.headerPriceValue</code> attribute. 
	 * @param value the headerPriceValue
	 */
	public void setHeaderPriceValue(final String value)
	{
		setHeaderPriceValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceDocNum</code> attribute.
	 * @return the invoiceDocNum
	 */
	public String getInvoiceDocNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICEDOCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceDocNum</code> attribute.
	 * @return the invoiceDocNum
	 */
	public String getInvoiceDocNum()
	{
		return getInvoiceDocNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceDocNum</code> attribute. 
	 * @param value the invoiceDocNum
	 */
	public void setInvoiceDocNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICEDOCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceDocNum</code> attribute. 
	 * @param value the invoiceDocNum
	 */
	public void setInvoiceDocNum(final String value)
	{
		setInvoiceDocNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceDueDate</code> attribute.
	 * @return the invoiceDueDate
	 */
	public Date getInvoiceDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, INVOICEDUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceDueDate</code> attribute.
	 * @return the invoiceDueDate
	 */
	public Date getInvoiceDueDate()
	{
		return getInvoiceDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceDueDate</code> attribute. 
	 * @param value the invoiceDueDate
	 */
	public void setInvoiceDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, INVOICEDUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceDueDate</code> attribute. 
	 * @param value the invoiceDueDate
	 */
	public void setInvoiceDueDate(final Date value)
	{
		setInvoiceDueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute.
	 * @return the invoiceTotalAmount
	 */
	public Double getInvoiceTotalAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INVOICETOTALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute.
	 * @return the invoiceTotalAmount
	 */
	public Double getInvoiceTotalAmount()
	{
		return getInvoiceTotalAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @return the invoiceTotalAmount
	 */
	public double getInvoiceTotalAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getInvoiceTotalAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @return the invoiceTotalAmount
	 */
	public double getInvoiceTotalAmountAsPrimitive()
	{
		return getInvoiceTotalAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @param value the invoiceTotalAmount
	 */
	public void setInvoiceTotalAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INVOICETOTALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @param value the invoiceTotalAmount
	 */
	public void setInvoiceTotalAmount(final Double value)
	{
		setInvoiceTotalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @param value the invoiceTotalAmount
	 */
	public void setInvoiceTotalAmount(final SessionContext ctx, final double value)
	{
		setInvoiceTotalAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.invoiceTotalAmount</code> attribute. 
	 * @param value the invoiceTotalAmount
	 */
	public void setInvoiceTotalAmount(final double value)
	{
		setInvoiceTotalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final String value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.openAmount</code> attribute.
	 * @return the openAmount
	 */
	public String getOpenAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OPENAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.openAmount</code> attribute.
	 * @return the openAmount
	 */
	public String getOpenAmount()
	{
		return getOpenAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.openAmount</code> attribute. 
	 * @param value the openAmount
	 */
	public void setOpenAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OPENAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.openAmount</code> attribute. 
	 * @param value the openAmount
	 */
	public void setOpenAmount(final String value)
	{
		setOpenAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final SessionContext ctx, final Order value)
	{
		ORDERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final Order value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.otherCharges</code> attribute.
	 * @return the otherCharges
	 */
	public Double getOtherCharges(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, OTHERCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.otherCharges</code> attribute.
	 * @return the otherCharges
	 */
	public Double getOtherCharges()
	{
		return getOtherCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @return the otherCharges
	 */
	public double getOtherChargesAsPrimitive(final SessionContext ctx)
	{
		Double value = getOtherCharges( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @return the otherCharges
	 */
	public double getOtherChargesAsPrimitive()
	{
		return getOtherChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @param value the otherCharges
	 */
	public void setOtherCharges(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, OTHERCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @param value the otherCharges
	 */
	public void setOtherCharges(final Double value)
	{
		setOtherCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @param value the otherCharges
	 */
	public void setOtherCharges(final SessionContext ctx, final double value)
	{
		setOtherCharges( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.otherCharges</code> attribute. 
	 * @param value the otherCharges
	 */
	public void setOtherCharges(final double value)
	{
		setOtherCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.paidAmount</code> attribute.
	 * @return the paidAmount
	 */
	public String getPaidAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAIDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.paidAmount</code> attribute.
	 * @return the paidAmount
	 */
	public String getPaidAmount()
	{
		return getPaidAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.paidAmount</code> attribute. 
	 * @param value the paidAmount
	 */
	public void setPaidAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAIDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.paidAmount</code> attribute. 
	 * @param value the paidAmount
	 */
	public void setPaidAmount(final String value)
	{
		setPaidAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.payerAccGLN</code> attribute.
	 * @return the payerAccGLN
	 */
	public String getPayerAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYERACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.payerAccGLN</code> attribute.
	 * @return the payerAccGLN
	 */
	public String getPayerAccGLN()
	{
		return getPayerAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.payerAccGLN</code> attribute. 
	 * @param value the payerAccGLN
	 */
	public void setPayerAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYERACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.payerAccGLN</code> attribute. 
	 * @param value the payerAccGLN
	 */
	public void setPayerAccGLN(final String value)
	{
		setPayerAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.payerAccNum</code> attribute.
	 * @return the payerAccNum
	 */
	public String getPayerAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYERACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.payerAccNum</code> attribute.
	 * @return the payerAccNum
	 */
	public String getPayerAccNum()
	{
		return getPayerAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.payerAccNum</code> attribute. 
	 * @param value the payerAccNum
	 */
	public void setPayerAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYERACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.payerAccNum</code> attribute. 
	 * @param value the payerAccNum
	 */
	public void setPayerAccNum(final String value)
	{
		setPayerAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.poOrderNum</code> attribute.
	 * @return the poOrderNum
	 */
	public String getPoOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.poOrderNum</code> attribute.
	 * @return the poOrderNum
	 */
	public String getPoOrderNum()
	{
		return getPoOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.poOrderNum</code> attribute. 
	 * @param value the poOrderNum
	 */
	public void setPoOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.poOrderNum</code> attribute. 
	 * @param value the poOrderNum
	 */
	public void setPoOrderNum(final String value)
	{
		setPoOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.prices</code> attribute.
	 * @return the prices
	 */
	public Collection<JnjGTInvoicePrice> getPrices(final SessionContext ctx)
	{
		return PRICESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.prices</code> attribute.
	 * @return the prices
	 */
	public Collection<JnjGTInvoicePrice> getPrices()
	{
		return getPrices( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.prices</code> attribute. 
	 * @param value the prices
	 */
	public void setPrices(final SessionContext ctx, final Collection<JnjGTInvoicePrice> value)
	{
		PRICESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.prices</code> attribute. 
	 * @param value the prices
	 */
	public void setPrices(final Collection<JnjGTInvoicePrice> value)
	{
		setPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prices. 
	 * @param value the item to add to prices
	 */
	public void addToPrices(final SessionContext ctx, final JnjGTInvoicePrice value)
	{
		PRICESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prices. 
	 * @param value the item to add to prices
	 */
	public void addToPrices(final JnjGTInvoicePrice value)
	{
		addToPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prices. 
	 * @param value the item to remove from prices
	 */
	public void removeFromPrices(final SessionContext ctx, final JnjGTInvoicePrice value)
	{
		PRICESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prices. 
	 * @param value the item to remove from prices
	 */
	public void removeFromPrices(final JnjGTInvoicePrice value)
	{
		removeFromPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.receiptNumber</code> attribute.
	 * @return the receiptNumber
	 */
	public String getReceiptNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECEIPTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.receiptNumber</code> attribute.
	 * @return the receiptNumber
	 */
	public String getReceiptNumber()
	{
		return getReceiptNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.receiptNumber</code> attribute. 
	 * @param value the receiptNumber
	 */
	public void setReceiptNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECEIPTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.receiptNumber</code> attribute. 
	 * @param value the receiptNumber
	 */
	public void setReceiptNumber(final String value)
	{
		setReceiptNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrgDistChannel</code> attribute.
	 * @return the salesOrgDistChannel
	 */
	public String getSalesOrgDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrgDistChannel</code> attribute.
	 * @return the salesOrgDistChannel
	 */
	public String getSalesOrgDistChannel()
	{
		return getSalesOrgDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrgDistChannel</code> attribute. 
	 * @param value the salesOrgDistChannel
	 */
	public void setSalesOrgDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrgDistChannel</code> attribute. 
	 * @param value the salesOrgDistChannel
	 */
	public void setSalesOrgDistChannel(final String value)
	{
		setSalesOrgDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrgDivCode</code> attribute.
	 * @return the salesOrgDivCode
	 */
	public String getSalesOrgDivCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.salesOrgDivCode</code> attribute.
	 * @return the salesOrgDivCode
	 */
	public String getSalesOrgDivCode()
	{
		return getSalesOrgDivCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrgDivCode</code> attribute. 
	 * @param value the salesOrgDivCode
	 */
	public void setSalesOrgDivCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.salesOrgDivCode</code> attribute. 
	 * @param value the salesOrgDivCode
	 */
	public void setSalesOrgDivCode(final String value)
	{
		setSalesOrgDivCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAccGLN</code> attribute.
	 * @return the shipToAccGLN
	 */
	public String getShipToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAccGLN</code> attribute.
	 * @return the shipToAccGLN
	 */
	public String getShipToAccGLN()
	{
		return getShipToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAccGLN</code> attribute. 
	 * @param value the shipToAccGLN
	 */
	public void setShipToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAccGLN</code> attribute. 
	 * @param value the shipToAccGLN
	 */
	public void setShipToAccGLN(final String value)
	{
		setShipToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAccNum</code> attribute.
	 * @return the shipToAccNum
	 */
	public String getShipToAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAccNum</code> attribute.
	 * @return the shipToAccNum
	 */
	public String getShipToAccNum()
	{
		return getShipToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAccNum</code> attribute. 
	 * @param value the shipToAccNum
	 */
	public void setShipToAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAccNum</code> attribute. 
	 * @param value the shipToAccNum
	 */
	public void setShipToAccNum(final String value)
	{
		setShipToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, SHIPTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress()
	{
		return getShipToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, SHIPTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final Address value)
	{
		setShipToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToPONum</code> attribute.
	 * @return the shipToPONum
	 */
	public String getShipToPONum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOPONUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.shipToPONum</code> attribute.
	 * @return the shipToPONum
	 */
	public String getShipToPONum()
	{
		return getShipToPONum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToPONum</code> attribute. 
	 * @param value the shipToPONum
	 */
	public void setShipToPONum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOPONUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.shipToPONum</code> attribute. 
	 * @param value the shipToPONum
	 */
	public void setShipToPONum(final String value)
	{
		setShipToPONum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.soldToAccGLN</code> attribute.
	 * @return the soldToAccGLN
	 */
	public String getSoldToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.soldToAccGLN</code> attribute.
	 * @return the soldToAccGLN
	 */
	public String getSoldToAccGLN()
	{
		return getSoldToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.soldToAccGLN</code> attribute. 
	 * @param value the soldToAccGLN
	 */
	public void setSoldToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.soldToAccGLN</code> attribute. 
	 * @param value the soldToAccGLN
	 */
	public void setSoldToAccGLN(final String value)
	{
		setSoldToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.soldToAccNum</code> attribute.
	 * @return the soldToAccNum
	 */
	public JnJB2BUnit getSoldToAccNum(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, SOLDTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.soldToAccNum</code> attribute.
	 * @return the soldToAccNum
	 */
	public JnJB2BUnit getSoldToAccNum()
	{
		return getSoldToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.soldToAccNum</code> attribute. 
	 * @param value the soldToAccNum
	 */
	public void setSoldToAccNum(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, SOLDTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.soldToAccNum</code> attribute. 
	 * @param value the soldToAccNum
	 */
	public void setSoldToAccNum(final JnJB2BUnit value)
	{
		setSoldToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.subTotalPrice</code> attribute.
	 * @return the subTotalPrice
	 */
	public Double getSubTotalPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SUBTOTALPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.subTotalPrice</code> attribute.
	 * @return the subTotalPrice
	 */
	public Double getSubTotalPrice()
	{
		return getSubTotalPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @return the subTotalPrice
	 */
	public double getSubTotalPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getSubTotalPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @return the subTotalPrice
	 */
	public double getSubTotalPriceAsPrimitive()
	{
		return getSubTotalPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @param value the subTotalPrice
	 */
	public void setSubTotalPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SUBTOTALPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @param value the subTotalPrice
	 */
	public void setSubTotalPrice(final Double value)
	{
		setSubTotalPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @param value the subTotalPrice
	 */
	public void setSubTotalPrice(final SessionContext ctx, final double value)
	{
		setSubTotalPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.subTotalPrice</code> attribute. 
	 * @param value the subTotalPrice
	 */
	public void setSubTotalPrice(final double value)
	{
		setSubTotalPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt()
	{
		return getTaxAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final String value)
	{
		setTaxAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute.
	 * @return the totalDropShipFee
	 */
	public Double getTotalDropShipFee(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALDROPSHIPFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute.
	 * @return the totalDropShipFee
	 */
	public Double getTotalDropShipFee()
	{
		return getTotalDropShipFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @return the totalDropShipFee
	 */
	public double getTotalDropShipFeeAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalDropShipFee( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @return the totalDropShipFee
	 */
	public double getTotalDropShipFeeAsPrimitive()
	{
		return getTotalDropShipFeeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALDROPSHIPFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final Double value)
	{
		setTotalDropShipFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final SessionContext ctx, final double value)
	{
		setTotalDropShipFee( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final double value)
	{
		setTotalDropShipFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute.
	 * @return the totalExpediteFee
	 */
	public Double getTotalExpediteFee(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALEXPEDITEFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute.
	 * @return the totalExpediteFee
	 */
	public Double getTotalExpediteFee()
	{
		return getTotalExpediteFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @return the totalExpediteFee
	 */
	public double getTotalExpediteFeeAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalExpediteFee( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @return the totalExpediteFee
	 */
	public double getTotalExpediteFeeAsPrimitive()
	{
		return getTotalExpediteFeeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @param value the totalExpediteFee
	 */
	public void setTotalExpediteFee(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALEXPEDITEFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @param value the totalExpediteFee
	 */
	public void setTotalExpediteFee(final Double value)
	{
		setTotalExpediteFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @param value the totalExpediteFee
	 */
	public void setTotalExpediteFee(final SessionContext ctx, final double value)
	{
		setTotalExpediteFee( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalExpediteFee</code> attribute. 
	 * @param value the totalExpediteFee
	 */
	public void setTotalExpediteFee(final double value)
	{
		setTotalExpediteFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees()
	{
		return getTotalFees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalFees( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive()
	{
		return getTotalFeesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final Double value)
	{
		setTotalFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final double value)
	{
		setTotalFees( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final double value)
	{
		setTotalFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFreightFees</code> attribute.
	 * @return the totalFreightFees
	 */
	public Double getTotalFreightFees(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALFREIGHTFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFreightFees</code> attribute.
	 * @return the totalFreightFees
	 */
	public Double getTotalFreightFees()
	{
		return getTotalFreightFees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @return the totalFreightFees
	 */
	public double getTotalFreightFeesAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalFreightFees( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @return the totalFreightFees
	 */
	public double getTotalFreightFeesAsPrimitive()
	{
		return getTotalFreightFeesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALFREIGHTFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final Double value)
	{
		setTotalFreightFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final SessionContext ctx, final double value)
	{
		setTotalFreightFees( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final double value)
	{
		setTotalFreightFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute.
	 * @return the totalHsaPromotion
	 */
	public Double getTotalHsaPromotion(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALHSAPROMOTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute.
	 * @return the totalHsaPromotion
	 */
	public Double getTotalHsaPromotion()
	{
		return getTotalHsaPromotion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @return the totalHsaPromotion
	 */
	public double getTotalHsaPromotionAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalHsaPromotion( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @return the totalHsaPromotion
	 */
	public double getTotalHsaPromotionAsPrimitive()
	{
		return getTotalHsaPromotionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALHSAPROMOTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final Double value)
	{
		setTotalHsaPromotion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final SessionContext ctx, final double value)
	{
		setTotalHsaPromotion( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final double value)
	{
		setTotalHsaPromotion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalManualFee</code> attribute.
	 * @return the totalManualFee
	 */
	public Double getTotalManualFee(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALMANUALFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalManualFee</code> attribute.
	 * @return the totalManualFee
	 */
	public Double getTotalManualFee()
	{
		return getTotalManualFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @return the totalManualFee
	 */
	public double getTotalManualFeeAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalManualFee( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @return the totalManualFee
	 */
	public double getTotalManualFeeAsPrimitive()
	{
		return getTotalManualFeeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @param value the totalManualFee
	 */
	public void setTotalManualFee(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALMANUALFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @param value the totalManualFee
	 */
	public void setTotalManualFee(final Double value)
	{
		setTotalManualFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @param value the totalManualFee
	 */
	public void setTotalManualFee(final SessionContext ctx, final double value)
	{
		setTotalManualFee( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalManualFee</code> attribute. 
	 * @param value the totalManualFee
	 */
	public void setTotalManualFee(final double value)
	{
		setTotalManualFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute.
	 * @return the totalminimumOrderFee
	 */
	public Double getTotalminimumOrderFee(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALMINIMUMORDERFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute.
	 * @return the totalminimumOrderFee
	 */
	public Double getTotalminimumOrderFee()
	{
		return getTotalminimumOrderFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @return the totalminimumOrderFee
	 */
	public double getTotalminimumOrderFeeAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalminimumOrderFee( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @return the totalminimumOrderFee
	 */
	public double getTotalminimumOrderFeeAsPrimitive()
	{
		return getTotalminimumOrderFeeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALMINIMUMORDERFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final Double value)
	{
		setTotalminimumOrderFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final SessionContext ctx, final double value)
	{
		setTotalminimumOrderFee( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final double value)
	{
		setTotalminimumOrderFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalTax</code> attribute.
	 * @return the totalTax
	 */
	public Double getTotalTax(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALTAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalTax</code> attribute.
	 * @return the totalTax
	 */
	public Double getTotalTax()
	{
		return getTotalTax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @return the totalTax
	 */
	public double getTotalTaxAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalTax( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @return the totalTax
	 */
	public double getTotalTaxAsPrimitive()
	{
		return getTotalTaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @param value the totalTax
	 */
	public void setTotalTax(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALTAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @param value the totalTax
	 */
	public void setTotalTax(final Double value)
	{
		setTotalTax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @param value the totalTax
	 */
	public void setTotalTax(final SessionContext ctx, final double value)
	{
		setTotalTax( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoice.totalTax</code> attribute. 
	 * @param value the totalTax
	 */
	public void setTotalTax(final double value)
	{
		setTotalTax( getSession().getSessionContext(), value );
	}
	
}
