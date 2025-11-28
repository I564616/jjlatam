/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjGTInvoice;
import com.jnj.core.jalo.JnjGTInvoiceEntryLot;
import com.jnj.core.jalo.JnjGTVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTInvoiceEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTInvoiceEntry extends GenericItem
{
	/** Qualifier of the <code>JnjGTInvoiceEntry.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>JnjGTInvoiceEntry.lineNum</code> attribute **/
	public static final String LINENUM = "lineNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.highLvlItemNum</code> attribute **/
	public static final String HIGHLVLITEMNUM = "highLvlItemNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnjGTInvoiceEntry.netTotalValue</code> attribute **/
	public static final String NETTOTALVALUE = "netTotalValue";
	/** Qualifier of the <code>JnjGTInvoiceEntry.productDivison</code> attribute **/
	public static final String PRODUCTDIVISON = "productDivison";
	/** Qualifier of the <code>JnjGTInvoiceEntry.plant</code> attribute **/
	public static final String PLANT = "plant";
	/** Qualifier of the <code>JnjGTInvoiceEntry.subTotal1</code> attribute **/
	public static final String SUBTOTAL1 = "subTotal1";
	/** Qualifier of the <code>JnjGTInvoiceEntry.subTotal2</code> attribute **/
	public static final String SUBTOTAL2 = "subTotal2";
	/** Qualifier of the <code>JnjGTInvoiceEntry.orderNum</code> attribute **/
	public static final String ORDERNUM = "orderNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.salesUOM</code> attribute **/
	public static final String SALESUOM = "salesUOM";
	/** Qualifier of the <code>JnjGTInvoiceEntry.deliveryNum</code> attribute **/
	public static final String DELIVERYNUM = "deliveryNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.originalInvoiceNum</code> attribute **/
	public static final String ORIGINALINVOICENUM = "originalInvoiceNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.netValuePerUnit</code> attribute **/
	public static final String NETVALUEPERUNIT = "netValuePerUnit";
	/** Qualifier of the <code>JnjGTInvoiceEntry.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTInvoiceEntry.carrierCode</code> attribute **/
	public static final String CARRIERCODE = "carrierCode";
	/** Qualifier of the <code>JnjGTInvoiceEntry.gtin</code> attribute **/
	public static final String GTIN = "gtin";
	/** Qualifier of the <code>JnjGTInvoiceEntry.orderedGtin</code> attribute **/
	public static final String ORDEREDGTIN = "orderedGtin";
	/** Qualifier of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute **/
	public static final String EXTENDEDPRICE = "extendedPrice";
	/** Qualifier of the <code>JnjGTInvoiceEntry.subTotal3</code> attribute **/
	public static final String SUBTOTAL3 = "subTotal3";
	/** Qualifier of the <code>JnjGTInvoiceEntry.subTotal4</code> attribute **/
	public static final String SUBTOTAL4 = "subTotal4";
	/** Qualifier of the <code>JnjGTInvoiceEntry.shipDate</code> attribute **/
	public static final String SHIPDATE = "shipDate";
	/** Qualifier of the <code>JnjGTInvoiceEntry.taxValue</code> attribute **/
	public static final String TAXVALUE = "taxValue";
	/** Qualifier of the <code>JnjGTInvoiceEntry.referencedVariant</code> attribute **/
	public static final String REFERENCEDVARIANT = "referencedVariant";
	/** Qualifier of the <code>JnjGTInvoiceEntry.invoice</code> attribute **/
	public static final String INVOICE = "invoice";
	/** Qualifier of the <code>JnjGTInvoiceEntry.lots</code> attribute **/
	public static final String LOTS = "lots";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVOICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTInvoiceEntry> INVOICEHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTInvoiceEntry>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICEENTRY,
	false,
	"invoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LOTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTInvoiceEntryLot> LOTSHANDLER = new OneToManyHandler<JnjGTInvoiceEntryLot>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICEENTRYLOT,
	false,
	"invoiceEntry",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(LINENUM, AttributeMode.INITIAL);
		tmp.put(HIGHLVLITEMNUM, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(NETTOTALVALUE, AttributeMode.INITIAL);
		tmp.put(PRODUCTDIVISON, AttributeMode.INITIAL);
		tmp.put(PLANT, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL1, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL2, AttributeMode.INITIAL);
		tmp.put(ORDERNUM, AttributeMode.INITIAL);
		tmp.put(SALESUOM, AttributeMode.INITIAL);
		tmp.put(DELIVERYNUM, AttributeMode.INITIAL);
		tmp.put(ORIGINALINVOICENUM, AttributeMode.INITIAL);
		tmp.put(NETVALUEPERUNIT, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(CARRIERCODE, AttributeMode.INITIAL);
		tmp.put(GTIN, AttributeMode.INITIAL);
		tmp.put(ORDEREDGTIN, AttributeMode.INITIAL);
		tmp.put(EXTENDEDPRICE, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL3, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL4, AttributeMode.INITIAL);
		tmp.put(SHIPDATE, AttributeMode.INITIAL);
		tmp.put(TAXVALUE, AttributeMode.INITIAL);
		tmp.put(REFERENCEDVARIANT, AttributeMode.INITIAL);
		tmp.put(INVOICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.carrierCode</code> attribute.
	 * @return the carrierCode
	 */
	public String getCarrierCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.carrierCode</code> attribute.
	 * @return the carrierCode
	 */
	public String getCarrierCode()
	{
		return getCarrierCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.carrierCode</code> attribute. 
	 * @param value the carrierCode
	 */
	public void setCarrierCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.carrierCode</code> attribute. 
	 * @param value the carrierCode
	 */
	public void setCarrierCode(final String value)
	{
		setCarrierCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INVOICEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum()
	{
		return getDeliveryNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final String value)
	{
		setDeliveryNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute.
	 * @return the extendedPrice
	 */
	public Double getExtendedPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, EXTENDEDPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute.
	 * @return the extendedPrice
	 */
	public Double getExtendedPrice()
	{
		return getExtendedPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @return the extendedPrice
	 */
	public double getExtendedPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getExtendedPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @return the extendedPrice
	 */
	public double getExtendedPriceAsPrimitive()
	{
		return getExtendedPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @param value the extendedPrice
	 */
	public void setExtendedPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, EXTENDEDPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @param value the extendedPrice
	 */
	public void setExtendedPrice(final Double value)
	{
		setExtendedPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @param value the extendedPrice
	 */
	public void setExtendedPrice(final SessionContext ctx, final double value)
	{
		setExtendedPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.extendedPrice</code> attribute. 
	 * @param value the extendedPrice
	 */
	public void setExtendedPrice(final double value)
	{
		setExtendedPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin()
	{
		return getGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final String value)
	{
		setGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.highLvlItemNum</code> attribute.
	 * @return the highLvlItemNum
	 */
	public String getHighLvlItemNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HIGHLVLITEMNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.highLvlItemNum</code> attribute.
	 * @return the highLvlItemNum
	 */
	public String getHighLvlItemNum()
	{
		return getHighLvlItemNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.highLvlItemNum</code> attribute. 
	 * @param value the highLvlItemNum
	 */
	public void setHighLvlItemNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HIGHLVLITEMNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.highLvlItemNum</code> attribute. 
	 * @param value the highLvlItemNum
	 */
	public void setHighLvlItemNum(final String value)
	{
		setHighLvlItemNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.invoice</code> attribute.
	 * @return the invoice
	 */
	public JnjGTInvoice getInvoice(final SessionContext ctx)
	{
		return (JnjGTInvoice)getProperty( ctx, INVOICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.invoice</code> attribute.
	 * @return the invoice
	 */
	public JnjGTInvoice getInvoice()
	{
		return getInvoice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.invoice</code> attribute. 
	 * @param value the invoice
	 */
	public void setInvoice(final SessionContext ctx, final JnjGTInvoice value)
	{
		INVOICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.invoice</code> attribute. 
	 * @param value the invoice
	 */
	public void setInvoice(final JnjGTInvoice value)
	{
		setInvoice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public String getLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public String getLineNum()
	{
		return getLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final String value)
	{
		setLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.lots</code> attribute.
	 * @return the lots
	 */
	public Collection<JnjGTInvoiceEntryLot> getLots(final SessionContext ctx)
	{
		return LOTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.lots</code> attribute.
	 * @return the lots
	 */
	public Collection<JnjGTInvoiceEntryLot> getLots()
	{
		return getLots( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.lots</code> attribute. 
	 * @param value the lots
	 */
	public void setLots(final SessionContext ctx, final Collection<JnjGTInvoiceEntryLot> value)
	{
		LOTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.lots</code> attribute. 
	 * @param value the lots
	 */
	public void setLots(final Collection<JnjGTInvoiceEntryLot> value)
	{
		setLots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lots. 
	 * @param value the item to add to lots
	 */
	public void addToLots(final SessionContext ctx, final JnjGTInvoiceEntryLot value)
	{
		LOTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lots. 
	 * @param value the item to add to lots
	 */
	public void addToLots(final JnjGTInvoiceEntryLot value)
	{
		addToLots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lots. 
	 * @param value the item to remove from lots
	 */
	public void removeFromLots(final SessionContext ctx, final JnjGTInvoiceEntryLot value)
	{
		LOTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lots. 
	 * @param value the item to remove from lots
	 */
	public void removeFromLots(final JnjGTInvoiceEntryLot value)
	{
		removeFromLots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.netTotalValue</code> attribute.
	 * @return the netTotalValue
	 */
	public String getNetTotalValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETTOTALVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.netTotalValue</code> attribute.
	 * @return the netTotalValue
	 */
	public String getNetTotalValue()
	{
		return getNetTotalValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.netTotalValue</code> attribute. 
	 * @param value the netTotalValue
	 */
	public void setNetTotalValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETTOTALVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.netTotalValue</code> attribute. 
	 * @param value the netTotalValue
	 */
	public void setNetTotalValue(final String value)
	{
		setNetTotalValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.netValuePerUnit</code> attribute.
	 * @return the netValuePerUnit
	 */
	public String getNetValuePerUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETVALUEPERUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.netValuePerUnit</code> attribute.
	 * @return the netValuePerUnit
	 */
	public String getNetValuePerUnit()
	{
		return getNetValuePerUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.netValuePerUnit</code> attribute. 
	 * @param value the netValuePerUnit
	 */
	public void setNetValuePerUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETVALUEPERUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.netValuePerUnit</code> attribute. 
	 * @param value the netValuePerUnit
	 */
	public void setNetValuePerUnit(final String value)
	{
		setNetValuePerUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.orderedGtin</code> attribute.
	 * @return the orderedGtin
	 */
	public String getOrderedGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDEREDGTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.orderedGtin</code> attribute.
	 * @return the orderedGtin
	 */
	public String getOrderedGtin()
	{
		return getOrderedGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.orderedGtin</code> attribute. 
	 * @param value the orderedGtin
	 */
	public void setOrderedGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDEREDGTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.orderedGtin</code> attribute. 
	 * @param value the orderedGtin
	 */
	public void setOrderedGtin(final String value)
	{
		setOrderedGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.orderNum</code> attribute.
	 * @return the orderNum
	 */
	public String getOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.orderNum</code> attribute.
	 * @return the orderNum
	 */
	public String getOrderNum()
	{
		return getOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.orderNum</code> attribute. 
	 * @param value the orderNum
	 */
	public void setOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.orderNum</code> attribute. 
	 * @param value the orderNum
	 */
	public void setOrderNum(final String value)
	{
		setOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.originalInvoiceNum</code> attribute.
	 * @return the originalInvoiceNum
	 */
	public String getOriginalInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORIGINALINVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.originalInvoiceNum</code> attribute.
	 * @return the originalInvoiceNum
	 */
	public String getOriginalInvoiceNum()
	{
		return getOriginalInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.originalInvoiceNum</code> attribute. 
	 * @param value the originalInvoiceNum
	 */
	public void setOriginalInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORIGINALINVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.originalInvoiceNum</code> attribute. 
	 * @param value the originalInvoiceNum
	 */
	public void setOriginalInvoiceNum(final String value)
	{
		setOriginalInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant()
	{
		return getPlant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final String value)
	{
		setPlant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final JnJProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final JnJProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.productDivison</code> attribute.
	 * @return the productDivison
	 */
	public String getProductDivison(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.productDivison</code> attribute.
	 * @return the productDivison
	 */
	public String getProductDivison()
	{
		return getProductDivison( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.productDivison</code> attribute. 
	 * @param value the productDivison
	 */
	public void setProductDivison(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDIVISON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.productDivison</code> attribute. 
	 * @param value the productDivison
	 */
	public void setProductDivison(final String value)
	{
		setProductDivison( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive(final SessionContext ctx)
	{
		Long value = getQty( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive()
	{
		return getQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final Long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final long value)
	{
		setQty( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant(final SessionContext ctx)
	{
		return (JnjGTVariantProduct)getProperty( ctx, REFERENCEDVARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant()
	{
		return getReferencedVariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final SessionContext ctx, final JnjGTVariantProduct value)
	{
		setProperty(ctx, REFERENCEDVARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final JnjGTVariantProduct value)
	{
		setReferencedVariant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.salesUOM</code> attribute.
	 * @return the salesUOM
	 */
	public Unit getSalesUOM(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, SALESUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.salesUOM</code> attribute.
	 * @return the salesUOM
	 */
	public Unit getSalesUOM()
	{
		return getSalesUOM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM
	 */
	public void setSalesUOM(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, SALESUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM
	 */
	public void setSalesUOM(final Unit value)
	{
		setSalesUOM( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate()
	{
		return getShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final Date value)
	{
		setShipDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1()
	{
		return getSubTotal1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final String value)
	{
		setSubTotal1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2()
	{
		return getSubTotal2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final String value)
	{
		setSubTotal2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3()
	{
		return getSubTotal3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final String value)
	{
		setSubTotal3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4()
	{
		return getSubTotal4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final String value)
	{
		setSubTotal4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.taxValue</code> attribute.
	 * @return the taxValue
	 */
	public String getTaxValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntry.taxValue</code> attribute.
	 * @return the taxValue
	 */
	public String getTaxValue()
	{
		return getTaxValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.taxValue</code> attribute. 
	 * @param value the taxValue
	 */
	public void setTaxValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntry.taxValue</code> attribute. 
	 * @param value the taxValue
	 */
	public void setTaxValue(final String value)
	{
		setTaxValue( getSession().getSessionContext(), value );
	}
	
}
