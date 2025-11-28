/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderLine}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderLine extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrderLine.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrderLine.sapOrderLineNumber</code> attribute **/
	public static final String SAPORDERLINENUMBER = "sapOrderLineNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.materialNumber</code> attribute **/
	public static final String MATERIALNUMBER = "materialNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.salesUom</code> attribute **/
	public static final String SALESUOM = "salesUom";
	/** Qualifier of the <code>JnjGTIntOrderLine.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnjGTIntOrderLine.unitPrice</code> attribute **/
	public static final String UNITPRICE = "unitPrice";
	/** Qualifier of the <code>JnjGTIntOrderLine.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>JnjGTIntOrderLine.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>JnjGTIntOrderLine.overAllStatus</code> attribute **/
	public static final String OVERALLSTATUS = "overAllStatus";
	/** Qualifier of the <code>JnjGTIntOrderLine.deliveryStatus</code> attribute **/
	public static final String DELIVERYSTATUS = "deliveryStatus";
	/** Qualifier of the <code>JnjGTIntOrderLine.invoiceStatus</code> attribute **/
	public static final String INVOICESTATUS = "invoiceStatus";
	/** Qualifier of the <code>JnjGTIntOrderLine.reasonForRejection</code> attribute **/
	public static final String REASONFORREJECTION = "reasonForRejection";
	/** Qualifier of the <code>JnjGTIntOrderLine.plant</code> attribute **/
	public static final String PLANT = "plant";
	/** Qualifier of the <code>JnjGTIntOrderLine.plantName</code> attribute **/
	public static final String PLANTNAME = "plantName";
	/** Qualifier of the <code>JnjGTIntOrderLine.itemCategory</code> attribute **/
	public static final String ITEMCATEGORY = "itemCategory";
	/** Qualifier of the <code>JnjGTIntOrderLine.highLevelItemNumber</code> attribute **/
	public static final String HIGHLEVELITEMNUMBER = "highLevelItemNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.taxAmt</code> attribute **/
	public static final String TAXAMT = "taxAmt";
	/** Qualifier of the <code>JnjGTIntOrderLine.materialEntered</code> attribute **/
	public static final String MATERIALENTERED = "materialEntered";
	/** Qualifier of the <code>JnjGTIntOrderLine.batchNumber</code> attribute **/
	public static final String BATCHNUMBER = "batchNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.productDivision</code> attribute **/
	public static final String PRODUCTDIVISION = "productDivision";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal1</code> attribute **/
	public static final String SUBTOTAL1 = "subTotal1";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal2</code> attribute **/
	public static final String SUBTOTAL2 = "subTotal2";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal3</code> attribute **/
	public static final String SUBTOTAL3 = "subTotal3";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal4</code> attribute **/
	public static final String SUBTOTAL4 = "subTotal4";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal5</code> attribute **/
	public static final String SUBTOTAL5 = "subTotal5";
	/** Qualifier of the <code>JnjGTIntOrderLine.subTotal6</code> attribute **/
	public static final String SUBTOTAL6 = "subTotal6";
	/** Qualifier of the <code>JnjGTIntOrderLine.route</code> attribute **/
	public static final String ROUTE = "route";
	/** Qualifier of the <code>JnjGTIntOrderLine.returnInvNumber</code> attribute **/
	public static final String RETURNINVNUMBER = "returnInvNumber";
	/** Qualifier of the <code>JnjGTIntOrderLine.gtin</code> attribute **/
	public static final String GTIN = "gtin";
	/** Qualifier of the <code>JnjGTIntOrderLine.gtinEntered</code> attribute **/
	public static final String GTINENTERED = "gtinEntered";
	/** Qualifier of the <code>JnjGTIntOrderLine.contractNum</code> attribute **/
	public static final String CONTRACTNUM = "contractNum";
	/** Qualifier of the <code>JnjGTIntOrderLine.priceOverrideReasonCd</code> attribute **/
	public static final String PRICEOVERRIDEREASONCD = "priceOverrideReasonCd";
	/** Qualifier of the <code>JnjGTIntOrderLine.approverNameCd</code> attribute **/
	public static final String APPROVERNAMECD = "approverNameCd";
	/** Qualifier of the <code>JnjGTIntOrderLine.shipToCustNum</code> attribute **/
	public static final String SHIPTOCUSTNUM = "shipToCustNum";
	/** Qualifier of the <code>JnjGTIntOrderLine.consumerLineStatus</code> attribute **/
	public static final String CONSUMERLINESTATUS = "consumerLineStatus";
	/** Qualifier of the <code>JnjGTIntOrderLine.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUMBER, AttributeMode.INITIAL);
		tmp.put(MATERIALNUMBER, AttributeMode.INITIAL);
		tmp.put(SALESUOM, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(UNITPRICE, AttributeMode.INITIAL);
		tmp.put(NETVALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(OVERALLSTATUS, AttributeMode.INITIAL);
		tmp.put(DELIVERYSTATUS, AttributeMode.INITIAL);
		tmp.put(INVOICESTATUS, AttributeMode.INITIAL);
		tmp.put(REASONFORREJECTION, AttributeMode.INITIAL);
		tmp.put(PLANT, AttributeMode.INITIAL);
		tmp.put(PLANTNAME, AttributeMode.INITIAL);
		tmp.put(ITEMCATEGORY, AttributeMode.INITIAL);
		tmp.put(HIGHLEVELITEMNUMBER, AttributeMode.INITIAL);
		tmp.put(TAXAMT, AttributeMode.INITIAL);
		tmp.put(MATERIALENTERED, AttributeMode.INITIAL);
		tmp.put(BATCHNUMBER, AttributeMode.INITIAL);
		tmp.put(PRODUCTDIVISION, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL1, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL2, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL3, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL4, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL5, AttributeMode.INITIAL);
		tmp.put(SUBTOTAL6, AttributeMode.INITIAL);
		tmp.put(ROUTE, AttributeMode.INITIAL);
		tmp.put(RETURNINVNUMBER, AttributeMode.INITIAL);
		tmp.put(GTIN, AttributeMode.INITIAL);
		tmp.put(GTINENTERED, AttributeMode.INITIAL);
		tmp.put(CONTRACTNUM, AttributeMode.INITIAL);
		tmp.put(PRICEOVERRIDEREASONCD, AttributeMode.INITIAL);
		tmp.put(APPROVERNAMECD, AttributeMode.INITIAL);
		tmp.put(SHIPTOCUSTNUM, AttributeMode.INITIAL);
		tmp.put(CONSUMERLINESTATUS, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.approverNameCd</code> attribute.
	 * @return the approverNameCd
	 */
	public String getApproverNameCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, APPROVERNAMECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.approverNameCd</code> attribute.
	 * @return the approverNameCd
	 */
	public String getApproverNameCd()
	{
		return getApproverNameCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.approverNameCd</code> attribute. 
	 * @param value the approverNameCd
	 */
	public void setApproverNameCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, APPROVERNAMECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.approverNameCd</code> attribute. 
	 * @param value the approverNameCd
	 */
	public void setApproverNameCd(final String value)
	{
		setApproverNameCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.batchNumber</code> attribute.
	 * @return the batchNumber
	 */
	public String getBatchNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BATCHNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.batchNumber</code> attribute.
	 * @return the batchNumber
	 */
	public String getBatchNumber()
	{
		return getBatchNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.batchNumber</code> attribute. 
	 * @param value the batchNumber
	 */
	public void setBatchNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BATCHNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.batchNumber</code> attribute. 
	 * @param value the batchNumber
	 */
	public void setBatchNumber(final String value)
	{
		setBatchNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.consumerLineStatus</code> attribute.
	 * @return the consumerLineStatus
	 */
	public EnumerationValue getConsumerLineStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONSUMERLINESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.consumerLineStatus</code> attribute.
	 * @return the consumerLineStatus
	 */
	public EnumerationValue getConsumerLineStatus()
	{
		return getConsumerLineStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.consumerLineStatus</code> attribute. 
	 * @param value the consumerLineStatus
	 */
	public void setConsumerLineStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONSUMERLINESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.consumerLineStatus</code> attribute. 
	 * @param value the consumerLineStatus
	 */
	public void setConsumerLineStatus(final EnumerationValue value)
	{
		setConsumerLineStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum()
	{
		return getContractNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final String value)
	{
		setContractNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final String value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus()
	{
		return getDeliveryStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final String value)
	{
		setDeliveryStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin()
	{
		return getGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final String value)
	{
		setGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.gtinEntered</code> attribute.
	 * @return the gtinEntered
	 */
	public String getGtinEntered(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTINENTERED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.gtinEntered</code> attribute.
	 * @return the gtinEntered
	 */
	public String getGtinEntered()
	{
		return getGtinEntered( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.gtinEntered</code> attribute. 
	 * @param value the gtinEntered
	 */
	public void setGtinEntered(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTINENTERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.gtinEntered</code> attribute. 
	 * @param value the gtinEntered
	 */
	public void setGtinEntered(final String value)
	{
		setGtinEntered( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.highLevelItemNumber</code> attribute.
	 * @return the highLevelItemNumber
	 */
	public String getHighLevelItemNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HIGHLEVELITEMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.highLevelItemNumber</code> attribute.
	 * @return the highLevelItemNumber
	 */
	public String getHighLevelItemNumber()
	{
		return getHighLevelItemNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.highLevelItemNumber</code> attribute. 
	 * @param value the highLevelItemNumber
	 */
	public void setHighLevelItemNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HIGHLEVELITEMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.highLevelItemNumber</code> attribute. 
	 * @param value the highLevelItemNumber
	 */
	public void setHighLevelItemNumber(final String value)
	{
		setHighLevelItemNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus()
	{
		return getInvoiceStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final String value)
	{
		setInvoiceStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.itemCategory</code> attribute.
	 * @return the itemCategory
	 */
	public String getItemCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.itemCategory</code> attribute.
	 * @return the itemCategory
	 */
	public String getItemCategory()
	{
		return getItemCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.itemCategory</code> attribute. 
	 * @param value the itemCategory
	 */
	public void setItemCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.itemCategory</code> attribute. 
	 * @param value the itemCategory
	 */
	public void setItemCategory(final String value)
	{
		setItemCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.materialEntered</code> attribute.
	 * @return the materialEntered
	 */
	public String getMaterialEntered(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALENTERED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.materialEntered</code> attribute.
	 * @return the materialEntered
	 */
	public String getMaterialEntered()
	{
		return getMaterialEntered( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.materialEntered</code> attribute. 
	 * @param value the materialEntered
	 */
	public void setMaterialEntered(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALENTERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.materialEntered</code> attribute. 
	 * @param value the materialEntered
	 */
	public void setMaterialEntered(final String value)
	{
		setMaterialEntered( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.materialNumber</code> attribute.
	 * @return the materialNumber
	 */
	public String getMaterialNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.materialNumber</code> attribute.
	 * @return the materialNumber
	 */
	public String getMaterialNumber()
	{
		return getMaterialNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.materialNumber</code> attribute. 
	 * @param value the materialNumber
	 */
	public void setMaterialNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.materialNumber</code> attribute. 
	 * @param value the materialNumber
	 */
	public void setMaterialNumber(final String value)
	{
		setMaterialNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final String value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERALLSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus()
	{
		return getOverAllStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERALLSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final String value)
	{
		setOverAllStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant()
	{
		return getPlant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final String value)
	{
		setPlant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.plantName</code> attribute.
	 * @return the plantName
	 */
	public String getPlantName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.plantName</code> attribute.
	 * @return the plantName
	 */
	public String getPlantName()
	{
		return getPlantName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.plantName</code> attribute. 
	 * @param value the plantName
	 */
	public void setPlantName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.plantName</code> attribute. 
	 * @param value the plantName
	 */
	public void setPlantName(final String value)
	{
		setPlantName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.priceOverrideReasonCd</code> attribute.
	 * @return the priceOverrideReasonCd
	 */
	public String getPriceOverrideReasonCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEOVERRIDEREASONCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.priceOverrideReasonCd</code> attribute.
	 * @return the priceOverrideReasonCd
	 */
	public String getPriceOverrideReasonCd()
	{
		return getPriceOverrideReasonCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.priceOverrideReasonCd</code> attribute. 
	 * @param value the priceOverrideReasonCd
	 */
	public void setPriceOverrideReasonCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEOVERRIDEREASONCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.priceOverrideReasonCd</code> attribute. 
	 * @param value the priceOverrideReasonCd
	 */
	public void setPriceOverrideReasonCd(final String value)
	{
		setPriceOverrideReasonCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.productDivision</code> attribute.
	 * @return the productDivision
	 */
	public String getProductDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.productDivision</code> attribute.
	 * @return the productDivision
	 */
	public String getProductDivision()
	{
		return getProductDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.productDivision</code> attribute. 
	 * @param value the productDivision
	 */
	public void setProductDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.productDivision</code> attribute. 
	 * @param value the productDivision
	 */
	public void setProductDivision(final String value)
	{
		setProductDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.qty</code> attribute.
	 * @return the qty
	 */
	public String getQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.qty</code> attribute.
	 * @return the qty
	 */
	public String getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final String value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASONFORREJECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection()
	{
		return getReasonForRejection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASONFORREJECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final String value)
	{
		setReasonForRejection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.returnInvNumber</code> attribute.
	 * @return the returnInvNumber
	 */
	public String getReturnInvNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RETURNINVNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.returnInvNumber</code> attribute.
	 * @return the returnInvNumber
	 */
	public String getReturnInvNumber()
	{
		return getReturnInvNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.returnInvNumber</code> attribute. 
	 * @param value the returnInvNumber
	 */
	public void setReturnInvNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RETURNINVNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.returnInvNumber</code> attribute. 
	 * @param value the returnInvNumber
	 */
	public void setReturnInvNumber(final String value)
	{
		setReturnInvNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.route</code> attribute.
	 * @return the route
	 */
	public String getRoute(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.route</code> attribute.
	 * @return the route
	 */
	public String getRoute()
	{
		return getRoute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final String value)
	{
		setRoute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.salesUom</code> attribute.
	 * @return the salesUom
	 */
	public String getSalesUom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.salesUom</code> attribute.
	 * @return the salesUom
	 */
	public String getSalesUom()
	{
		return getSalesUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.salesUom</code> attribute. 
	 * @param value the salesUom
	 */
	public void setSalesUom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.salesUom</code> attribute. 
	 * @param value the salesUom
	 */
	public void setSalesUom(final String value)
	{
		setSalesUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber()
	{
		return getSapOrderLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final String value)
	{
		setSapOrderLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.shipToCustNum</code> attribute.
	 * @return the shipToCustNum
	 */
	public String getShipToCustNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOCUSTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.shipToCustNum</code> attribute.
	 * @return the shipToCustNum
	 */
	public String getShipToCustNum()
	{
		return getShipToCustNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.shipToCustNum</code> attribute. 
	 * @param value the shipToCustNum
	 */
	public void setShipToCustNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOCUSTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.shipToCustNum</code> attribute. 
	 * @param value the shipToCustNum
	 */
	public void setShipToCustNum(final String value)
	{
		setShipToCustNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal1</code> attribute.
	 * @return the subTotal1
	 */
	public String getSubTotal1()
	{
		return getSubTotal1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal1</code> attribute. 
	 * @param value the subTotal1
	 */
	public void setSubTotal1(final String value)
	{
		setSubTotal1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal2</code> attribute.
	 * @return the subTotal2
	 */
	public String getSubTotal2()
	{
		return getSubTotal2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal2</code> attribute. 
	 * @param value the subTotal2
	 */
	public void setSubTotal2(final String value)
	{
		setSubTotal2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal3</code> attribute.
	 * @return the subTotal3
	 */
	public String getSubTotal3()
	{
		return getSubTotal3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal3</code> attribute. 
	 * @param value the subTotal3
	 */
	public void setSubTotal3(final String value)
	{
		setSubTotal3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal4</code> attribute.
	 * @return the subTotal4
	 */
	public String getSubTotal4()
	{
		return getSubTotal4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal4</code> attribute. 
	 * @param value the subTotal4
	 */
	public void setSubTotal4(final String value)
	{
		setSubTotal4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal5</code> attribute.
	 * @return the subTotal5
	 */
	public String getSubTotal5(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL5);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal5</code> attribute.
	 * @return the subTotal5
	 */
	public String getSubTotal5()
	{
		return getSubTotal5( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal5</code> attribute. 
	 * @param value the subTotal5
	 */
	public void setSubTotal5(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL5,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal5</code> attribute. 
	 * @param value the subTotal5
	 */
	public void setSubTotal5(final String value)
	{
		setSubTotal5( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal6</code> attribute.
	 * @return the subTotal6
	 */
	public String getSubTotal6(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTOTAL6);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.subTotal6</code> attribute.
	 * @return the subTotal6
	 */
	public String getSubTotal6()
	{
		return getSubTotal6( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal6</code> attribute. 
	 * @param value the subTotal6
	 */
	public void setSubTotal6(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTOTAL6,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.subTotal6</code> attribute. 
	 * @param value the subTotal6
	 */
	public void setSubTotal6(final String value)
	{
		setSubTotal6( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt()
	{
		return getTaxAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final String value)
	{
		setTaxAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public String getUnitPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNITPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLine.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public String getUnitPrice()
	{
		return getUnitPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNITPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLine.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final String value)
	{
		setUnitPrice( getSession().getSessionContext(), value );
	}
	
}
