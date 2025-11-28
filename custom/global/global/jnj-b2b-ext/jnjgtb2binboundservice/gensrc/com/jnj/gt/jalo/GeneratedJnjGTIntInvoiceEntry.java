/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntInvoiceEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntInvoiceEntry extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.lineNum</code> attribute **/
	public static final String LINENUM = "lineNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.highLvlItemNum</code> attribute **/
	public static final String HIGHLVLITEMNUM = "highLvlItemNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.netTotalValue</code> attribute **/
	public static final String NETTOTALVALUE = "netTotalValue";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.productDivison</code> attribute **/
	public static final String PRODUCTDIVISON = "productDivison";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.plant</code> attribute **/
	public static final String PLANT = "plant";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.subTotal1</code> attribute **/
	public static final String SUBTOTAL1 = "subTotal1";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.subTotal2</code> attribute **/
	public static final String SUBTOTAL2 = "subTotal2";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.subTotal3</code> attribute **/
	public static final String SUBTOTAL3 = "subTotal3";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.subTotal4</code> attribute **/
	public static final String SUBTOTAL4 = "subTotal4";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.orderNum</code> attribute **/
	public static final String ORDERNUM = "orderNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.salesUOM</code> attribute **/
	public static final String SALESUOM = "salesUOM";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.deliveryNum</code> attribute **/
	public static final String DELIVERYNUM = "deliveryNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.originalInvoiceNum</code> attribute **/
	public static final String ORIGINALINVOICENUM = "originalInvoiceNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.netValuePerUnit</code> attribute **/
	public static final String NETVALUEPERUNIT = "netValuePerUnit";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.carrierCode</code> attribute **/
	public static final String CARRIERCODE = "carrierCode";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.gtin</code> attribute **/
	public static final String GTIN = "gtin";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.orderedGtin</code> attribute **/
	public static final String ORDEREDGTIN = "orderedGtin";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.shipDate</code> attribute **/
	public static final String SHIPDATE = "shipDate";
	/** Qualifier of the <code>JnjGTIntInvoiceEntry.taxValue</code> attribute **/
	public static final String TAXVALUE = "taxValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(LINENUM, AttributeMode.INITIAL);
		tmp.put(HIGHLVLITEMNUM, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(NETTOTALVALUE, AttributeMode.INITIAL);
		tmp.put(PRODUCTDIVISON, AttributeMode.INITIAL);
		tmp.put(PLANT, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL1, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL2, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL3, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL4, AttributeMode.INITIAL);
		tmp.put(ORDERNUM, AttributeMode.INITIAL);
		tmp.put(SALESUOM, AttributeMode.INITIAL);
		tmp.put(DELIVERYNUM, AttributeMode.INITIAL);
		tmp.put(ORIGINALINVOICENUM, AttributeMode.INITIAL);
		tmp.put(NETVALUEPERUNIT, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(CARRIERCODE, AttributeMode.INITIAL);
		tmp.put(GTIN, AttributeMode.INITIAL);
		tmp.put(ORDEREDGTIN, AttributeMode.INITIAL);
		tmp.put(SHIPDATE, AttributeMode.INITIAL);
		tmp.put(TAXVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.carrierCode</code> attribute.
	 * @return the carrierCode
	 */
	public String getCarrierCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.carrierCode</code> attribute.
	 * @return the carrierCode
	 */
	public String getCarrierCode()
	{
		return getCarrierCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.carrierCode</code> attribute. 
	 * @param value the carrierCode
	 */
	public void setCarrierCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.carrierCode</code> attribute. 
	 * @param value the carrierCode
	 */
	public void setCarrierCode(final String value)
	{
		setCarrierCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum()
	{
		return getDeliveryNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final String value)
	{
		setDeliveryNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin()
	{
		return getGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final String value)
	{
		setGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.highLvlItemNum</code> attribute.
	 * @return the highLvlItemNum
	 */
	public String getHighLvlItemNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HIGHLVLITEMNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.highLvlItemNum</code> attribute.
	 * @return the highLvlItemNum
	 */
	public String getHighLvlItemNum()
	{
		return getHighLvlItemNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.highLvlItemNum</code> attribute. 
	 * @param value the highLvlItemNum
	 */
	public void setHighLvlItemNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HIGHLVLITEMNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.highLvlItemNum</code> attribute. 
	 * @param value the highLvlItemNum
	 */
	public void setHighLvlItemNum(final String value)
	{
		setHighLvlItemNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public String getLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public String getLineNum()
	{
		return getLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final String value)
	{
		setLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.netTotalValue</code> attribute.
	 * @return the netTotalValue
	 */
	public String getNetTotalValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETTOTALVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.netTotalValue</code> attribute.
	 * @return the netTotalValue
	 */
	public String getNetTotalValue()
	{
		return getNetTotalValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.netTotalValue</code> attribute. 
	 * @param value the netTotalValue
	 */
	public void setNetTotalValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETTOTALVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.netTotalValue</code> attribute. 
	 * @param value the netTotalValue
	 */
	public void setNetTotalValue(final String value)
	{
		setNetTotalValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.netValuePerUnit</code> attribute.
	 * @return the netValuePerUnit
	 */
	public String getNetValuePerUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETVALUEPERUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.netValuePerUnit</code> attribute.
	 * @return the netValuePerUnit
	 */
	public String getNetValuePerUnit()
	{
		return getNetValuePerUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.netValuePerUnit</code> attribute. 
	 * @param value the netValuePerUnit
	 */
	public void setNetValuePerUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETVALUEPERUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.netValuePerUnit</code> attribute. 
	 * @param value the netValuePerUnit
	 */
	public void setNetValuePerUnit(final String value)
	{
		setNetValuePerUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.orderedGtin</code> attribute.
	 * @return the orderedGtin
	 */
	public String getOrderedGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDEREDGTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.orderedGtin</code> attribute.
	 * @return the orderedGtin
	 */
	public String getOrderedGtin()
	{
		return getOrderedGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.orderedGtin</code> attribute. 
	 * @param value the orderedGtin
	 */
	public void setOrderedGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDEREDGTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.orderedGtin</code> attribute. 
	 * @param value the orderedGtin
	 */
	public void setOrderedGtin(final String value)
	{
		setOrderedGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.orderNum</code> attribute.
	 * @return the orderNum
	 */
	public String getOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.orderNum</code> attribute.
	 * @return the orderNum
	 */
	public String getOrderNum()
	{
		return getOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.orderNum</code> attribute. 
	 * @param value the orderNum
	 */
	public void setOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.orderNum</code> attribute. 
	 * @param value the orderNum
	 */
	public void setOrderNum(final String value)
	{
		setOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.originalInvoiceNum</code> attribute.
	 * @return the originalInvoiceNum
	 */
	public String getOriginalInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORIGINALINVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.originalInvoiceNum</code> attribute.
	 * @return the originalInvoiceNum
	 */
	public String getOriginalInvoiceNum()
	{
		return getOriginalInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.originalInvoiceNum</code> attribute. 
	 * @param value the originalInvoiceNum
	 */
	public void setOriginalInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORIGINALINVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.originalInvoiceNum</code> attribute. 
	 * @param value the originalInvoiceNum
	 */
	public void setOriginalInvoiceNum(final String value)
	{
		setOriginalInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant()
	{
		return getPlant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final String value)
	{
		setPlant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.product</code> attribute.
	 * @return the product
	 */
	public String getProduct(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.product</code> attribute.
	 * @return the product
	 */
	public String getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final String value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.productDivison</code> attribute.
	 * @return the productDivison
	 */
	public String getProductDivison(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.productDivison</code> attribute.
	 * @return the productDivison
	 */
	public String getProductDivison()
	{
		return getProductDivison( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.productDivison</code> attribute. 
	 * @param value the productDivison
	 */
	public void setProductDivison(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDIVISON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.productDivison</code> attribute. 
	 * @param value the productDivison
	 */
	public void setProductDivison(final String value)
	{
		setProductDivison( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public String getQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public String getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final String value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.salesUOM</code> attribute.
	 * @return the salesUOM
	 */
	public String getSalesUOM(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.salesUOM</code> attribute.
	 * @return the salesUOM
	 */
	public String getSalesUOM()
	{
		return getSalesUOM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM
	 */
	public void setSalesUOM(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM
	 */
	public void setSalesUOM(final String value)
	{
		setSalesUOM( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate()
	{
		return getShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final Date value)
	{
		setShipDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1()
	{
		return getSubTotal1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final String value)
	{
		setSubTotal1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2()
	{
		return getSubTotal2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final String value)
	{
		setSubTotal2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3()
	{
		return getSubTotal3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final String value)
	{
		setSubTotal3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4()
	{
		return getSubTotal4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final String value)
	{
		setSubTotal4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.taxValue</code> attribute.
	 * @return the taxValue
	 */
	public String getTaxValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntry.taxValue</code> attribute.
	 * @return the taxValue
	 */
	public String getTaxValue()
	{
		return getTaxValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.taxValue</code> attribute. 
	 * @param value the taxValue
	 */
	public void setTaxValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntry.taxValue</code> attribute. 
	 * @param value the taxValue
	 */
	public void setTaxValue(final String value)
	{
		setTaxValue( getSession().getSessionContext(), value );
	}
	
}
