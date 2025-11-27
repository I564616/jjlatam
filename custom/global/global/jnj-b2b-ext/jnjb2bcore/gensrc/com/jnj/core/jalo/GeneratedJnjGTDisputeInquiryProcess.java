/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTDisputeInquiryProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTDisputeInquiryProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute **/
	public static final String DISPUTEORDER = "disputeOrder";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.accountNumber</code> attribute **/
	public static final String ACCOUNTNUMBER = "accountNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.purchaseOrderNumber</code> attribute **/
	public static final String PURCHASEORDERNUMBER = "purchaseOrderNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.phoneNumber</code> attribute **/
	public static final String PHONENUMBER = "phoneNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.invoiceNumber</code> attribute **/
	public static final String INVOICENUMBER = "invoiceNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.totalDisputedAmount</code> attribute **/
	public static final String TOTALDISPUTEDAMOUNT = "totalDisputedAmount";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.expectedPrice</code> attribute **/
	public static final String EXPECTEDPRICE = "expectedPrice";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.contractNumber</code> attribute **/
	public static final String CONTRACTNUMBER = "contractNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.shortShippedProductCode</code> attribute **/
	public static final String SHORTSHIPPEDPRODUCTCODE = "shortShippedProductCode";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.shortShippedOrderedQuantity</code> attribute **/
	public static final String SHORTSHIPPEDORDEREDQUANTITY = "shortShippedOrderedQuantity";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.shortShippedReceivedQuantity</code> attribute **/
	public static final String SHORTSHIPPEDRECEIVEDQUANTITY = "shortShippedReceivedQuantity";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.overShippedProductCode</code> attribute **/
	public static final String OVERSHIPPEDPRODUCTCODE = "overShippedProductCode";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.overShippedOrderedQuantity</code> attribute **/
	public static final String OVERSHIPPEDORDEREDQUANTITY = "overShippedOrderedQuantity";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.overShippedReceivedQuantity</code> attribute **/
	public static final String OVERSHIPPEDRECEIVEDQUANTITY = "overShippedReceivedQuantity";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute **/
	public static final String REPLACEMENTREQUIRED = "replacementRequired";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.lotNumbers</code> attribute **/
	public static final String LOTNUMBERS = "lotNumbers";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute **/
	public static final String KEEPPRODUCTSSHIPPED = "keepProductsShipped";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.newPurchaseOrderNumber</code> attribute **/
	public static final String NEWPURCHASEORDERNUMBER = "newPurchaseOrderNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.disputedFees</code> attribute **/
	public static final String DISPUTEDFEES = "disputedFees";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.correctPurchaseOrderNumber</code> attribute **/
	public static final String CORRECTPURCHASEORDERNUMBER = "correctPurchaseOrderNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.shipToAddress</code> attribute **/
	public static final String SHIPTOADDRESS = "shipToAddress";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.correctAddress</code> attribute **/
	public static final String CORRECTADDRESS = "correctAddress";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndlotInfo</code> attribute **/
	public static final String PRODUCTSANDLOTINFO = "productsAndlotInfo";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndQuantity</code> attribute **/
	public static final String PRODUCTSANDQUANTITY = "productsAndQuantity";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute **/
	public static final String CERTIFICATEATTACHED = "certificateAttached";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.createdFileName</code> attribute **/
	public static final String CREATEDFILENAME = "createdFileName";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.disputeItemNumber</code> attribute **/
	public static final String DISPUTEITEMNUMBER = "disputeItemNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.disputeType</code> attribute **/
	public static final String DISPUTETYPE = "disputeType";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.orderCode</code> attribute **/
	public static final String ORDERCODE = "orderCode";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityPrice</code> attribute **/
	public static final String PRODUCTSANDQUANTITYPRICE = "productsAndQuantityPrice";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndDisputedPrice</code> attribute **/
	public static final String PRODUCTSANDDISPUTEDPRICE = "productsAndDisputedPrice";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndCorrectPrice</code> attribute **/
	public static final String PRODUCTSANDCORRECTPRICE = "productsAndCorrectPrice";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndContractNumber</code> attribute **/
	public static final String PRODUCTSANDCONTRACTNUMBER = "productsAndContractNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumber</code> attribute **/
	public static final String PRODUCTSANDINVOICENUMBER = "productsAndInvoiceNumber";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrdered</code> attribute **/
	public static final String PRODUCTSANDQUANTITYORDERED = "productsAndQuantityOrdered";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productAndQtyReceived</code> attribute **/
	public static final String PRODUCTANDQTYRECEIVED = "productAndQtyReceived";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productAndReplacement</code> attribute **/
	public static final String PRODUCTANDREPLACEMENT = "productAndReplacement";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberShort</code> attribute **/
	public static final String PRODUCTSANDINVOICENUMBERSHORT = "productsAndInvoiceNumberShort";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrderedOver</code> attribute **/
	public static final String PRODUCTSANDQUANTITYORDEREDOVER = "productsAndQuantityOrderedOver";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityRecievedOver</code> attribute **/
	public static final String PRODUCTSANDQUANTITYRECIEVEDOVER = "productsAndQuantityRecievedOver";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndLotNumbers</code> attribute **/
	public static final String PRODUCTSANDLOTNUMBERS = "productsAndLotNumbers";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberOver</code> attribute **/
	public static final String PRODUCTSANDINVOICENUMBEROVER = "productsAndInvoiceNumberOver";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.quantityUom</code> attribute **/
	public static final String QUANTITYUOM = "quantityUom";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.contractNum</code> attribute **/
	public static final String CONTRACTNUM = "contractNum";
	/** Qualifier of the <code>JnjGTDisputeInquiryProcess.disputeInvoiceNumber</code> attribute **/
	public static final String DISPUTEINVOICENUMBER = "disputeInvoiceNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISPUTEORDER, AttributeMode.INITIAL);
		tmp.put(ACCOUNTNUMBER, AttributeMode.INITIAL);
		tmp.put(PURCHASEORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(PHONENUMBER, AttributeMode.INITIAL);
		tmp.put(INVOICENUMBER, AttributeMode.INITIAL);
		tmp.put(TOTALDISPUTEDAMOUNT, AttributeMode.INITIAL);
		tmp.put(EXPECTEDPRICE, AttributeMode.INITIAL);
		tmp.put(CONTRACTNUMBER, AttributeMode.INITIAL);
		tmp.put(SHORTSHIPPEDPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(SHORTSHIPPEDORDEREDQUANTITY, AttributeMode.INITIAL);
		tmp.put(SHORTSHIPPEDRECEIVEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(OVERSHIPPEDPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(OVERSHIPPEDORDEREDQUANTITY, AttributeMode.INITIAL);
		tmp.put(OVERSHIPPEDRECEIVEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(REPLACEMENTREQUIRED, AttributeMode.INITIAL);
		tmp.put(LOTNUMBERS, AttributeMode.INITIAL);
		tmp.put(KEEPPRODUCTSSHIPPED, AttributeMode.INITIAL);
		tmp.put(NEWPURCHASEORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(DISPUTEDFEES, AttributeMode.INITIAL);
		tmp.put(CORRECTPURCHASEORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SHIPTOADDRESS, AttributeMode.INITIAL);
		tmp.put(CORRECTADDRESS, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDLOTINFO, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDQUANTITY, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEATTACHED, AttributeMode.INITIAL);
		tmp.put(CREATEDFILENAME, AttributeMode.INITIAL);
		tmp.put(DISPUTEITEMNUMBER, AttributeMode.INITIAL);
		tmp.put(DISPUTETYPE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(ORDERCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDQUANTITYPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDDISPUTEDPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDCORRECTPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDCONTRACTNUMBER, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDINVOICENUMBER, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDQUANTITYORDERED, AttributeMode.INITIAL);
		tmp.put(PRODUCTANDQTYRECEIVED, AttributeMode.INITIAL);
		tmp.put(PRODUCTANDREPLACEMENT, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDINVOICENUMBERSHORT, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDQUANTITYORDEREDOVER, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDQUANTITYRECIEVEDOVER, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDLOTNUMBERS, AttributeMode.INITIAL);
		tmp.put(PRODUCTSANDINVOICENUMBEROVER, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(QUANTITYUOM, AttributeMode.INITIAL);
		tmp.put(CONTRACTNUM, AttributeMode.INITIAL);
		tmp.put(DISPUTEINVOICENUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber()
	{
		return getAccountNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final String value)
	{
		setAccountNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute.
	 * @return the certificateAttached
	 */
	public Boolean isCertificateAttached(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CERTIFICATEATTACHED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute.
	 * @return the certificateAttached
	 */
	public Boolean isCertificateAttached()
	{
		return isCertificateAttached( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @return the certificateAttached
	 */
	public boolean isCertificateAttachedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCertificateAttached( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @return the certificateAttached
	 */
	public boolean isCertificateAttachedAsPrimitive()
	{
		return isCertificateAttachedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @param value the certificateAttached
	 */
	public void setCertificateAttached(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CERTIFICATEATTACHED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @param value the certificateAttached
	 */
	public void setCertificateAttached(final Boolean value)
	{
		setCertificateAttached( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @param value the certificateAttached
	 */
	public void setCertificateAttached(final SessionContext ctx, final boolean value)
	{
		setCertificateAttached( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.certificateAttached</code> attribute. 
	 * @param value the certificateAttached
	 */
	public void setCertificateAttached(final boolean value)
	{
		setCertificateAttached( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum()
	{
		return getContractNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final String value)
	{
		setContractNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.contractNumber</code> attribute.
	 * @return the contractNumber
	 */
	public String getContractNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.contractNumber</code> attribute.
	 * @return the contractNumber
	 */
	public String getContractNumber()
	{
		return getContractNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.contractNumber</code> attribute. 
	 * @param value the contractNumber
	 */
	public void setContractNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.contractNumber</code> attribute. 
	 * @param value the contractNumber
	 */
	public void setContractNumber(final String value)
	{
		setContractNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.correctAddress</code> attribute.
	 * @return the correctAddress
	 */
	public Address getCorrectAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, CORRECTADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.correctAddress</code> attribute.
	 * @return the correctAddress
	 */
	public Address getCorrectAddress()
	{
		return getCorrectAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.correctAddress</code> attribute. 
	 * @param value the correctAddress
	 */
	public void setCorrectAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, CORRECTADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.correctAddress</code> attribute. 
	 * @param value the correctAddress
	 */
	public void setCorrectAddress(final Address value)
	{
		setCorrectAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.correctPurchaseOrderNumber</code> attribute.
	 * @return the correctPurchaseOrderNumber
	 */
	public String getCorrectPurchaseOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORRECTPURCHASEORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.correctPurchaseOrderNumber</code> attribute.
	 * @return the correctPurchaseOrderNumber
	 */
	public String getCorrectPurchaseOrderNumber()
	{
		return getCorrectPurchaseOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.correctPurchaseOrderNumber</code> attribute. 
	 * @param value the correctPurchaseOrderNumber
	 */
	public void setCorrectPurchaseOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORRECTPURCHASEORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.correctPurchaseOrderNumber</code> attribute. 
	 * @param value the correctPurchaseOrderNumber
	 */
	public void setCorrectPurchaseOrderNumber(final String value)
	{
		setCorrectPurchaseOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.createdFileName</code> attribute.
	 * @return the createdFileName
	 */
	public String getCreatedFileName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREATEDFILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.createdFileName</code> attribute.
	 * @return the createdFileName
	 */
	public String getCreatedFileName()
	{
		return getCreatedFileName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.createdFileName</code> attribute. 
	 * @param value the createdFileName
	 */
	public void setCreatedFileName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREATEDFILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.createdFileName</code> attribute. 
	 * @param value the createdFileName
	 */
	public void setCreatedFileName(final String value)
	{
		setCreatedFileName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputedFees</code> attribute.
	 * @return the disputedFees
	 */
	public List<String> getDisputedFees(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, DISPUTEDFEES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputedFees</code> attribute.
	 * @return the disputedFees
	 */
	public List<String> getDisputedFees()
	{
		return getDisputedFees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputedFees</code> attribute. 
	 * @param value the disputedFees
	 */
	public void setDisputedFees(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, DISPUTEDFEES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputedFees</code> attribute. 
	 * @param value the disputedFees
	 */
	public void setDisputedFees(final List<String> value)
	{
		setDisputedFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeInvoiceNumber</code> attribute.
	 * @return the disputeInvoiceNumber
	 */
	public String getDisputeInvoiceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPUTEINVOICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeInvoiceNumber</code> attribute.
	 * @return the disputeInvoiceNumber
	 */
	public String getDisputeInvoiceNumber()
	{
		return getDisputeInvoiceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeInvoiceNumber</code> attribute. 
	 * @param value the disputeInvoiceNumber
	 */
	public void setDisputeInvoiceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPUTEINVOICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeInvoiceNumber</code> attribute. 
	 * @param value the disputeInvoiceNumber
	 */
	public void setDisputeInvoiceNumber(final String value)
	{
		setDisputeInvoiceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeItemNumber</code> attribute.
	 * @return the disputeItemNumber
	 */
	public String getDisputeItemNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPUTEITEMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeItemNumber</code> attribute.
	 * @return the disputeItemNumber
	 */
	public String getDisputeItemNumber()
	{
		return getDisputeItemNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeItemNumber</code> attribute. 
	 * @param value the disputeItemNumber
	 */
	public void setDisputeItemNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPUTEITEMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeItemNumber</code> attribute. 
	 * @param value the disputeItemNumber
	 */
	public void setDisputeItemNumber(final String value)
	{
		setDisputeItemNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute.
	 * @return the disputeOrder
	 */
	public Boolean isDisputeOrder(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPUTEORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute.
	 * @return the disputeOrder
	 */
	public Boolean isDisputeOrder()
	{
		return isDisputeOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @return the disputeOrder
	 */
	public boolean isDisputeOrderAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisputeOrder( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @return the disputeOrder
	 */
	public boolean isDisputeOrderAsPrimitive()
	{
		return isDisputeOrderAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @param value the disputeOrder
	 */
	public void setDisputeOrder(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPUTEORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @param value the disputeOrder
	 */
	public void setDisputeOrder(final Boolean value)
	{
		setDisputeOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @param value the disputeOrder
	 */
	public void setDisputeOrder(final SessionContext ctx, final boolean value)
	{
		setDisputeOrder( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeOrder</code> attribute. 
	 * @param value the disputeOrder
	 */
	public void setDisputeOrder(final boolean value)
	{
		setDisputeOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeType</code> attribute.
	 * @return the disputeType
	 */
	public String getDisputeType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPUTETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.disputeType</code> attribute.
	 * @return the disputeType
	 */
	public String getDisputeType()
	{
		return getDisputeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeType</code> attribute. 
	 * @param value the disputeType
	 */
	public void setDisputeType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPUTETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.disputeType</code> attribute. 
	 * @param value the disputeType
	 */
	public void setDisputeType(final String value)
	{
		setDisputeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.expectedPrice</code> attribute.
	 * @return the expectedPrice
	 */
	public String getExpectedPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXPECTEDPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.expectedPrice</code> attribute.
	 * @return the expectedPrice
	 */
	public String getExpectedPrice()
	{
		return getExpectedPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.expectedPrice</code> attribute. 
	 * @param value the expectedPrice
	 */
	public void setExpectedPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXPECTEDPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.expectedPrice</code> attribute. 
	 * @param value the expectedPrice
	 */
	public void setExpectedPrice(final String value)
	{
		setExpectedPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public List<String> getInvoiceNumber(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, INVOICENUMBER);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public List<String> getInvoiceNumber()
	{
		return getInvoiceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, INVOICENUMBER,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final List<String> value)
	{
		setInvoiceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute.
	 * @return the keepProductsShipped
	 */
	public Boolean isKeepProductsShipped(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, KEEPPRODUCTSSHIPPED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute.
	 * @return the keepProductsShipped
	 */
	public Boolean isKeepProductsShipped()
	{
		return isKeepProductsShipped( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @return the keepProductsShipped
	 */
	public boolean isKeepProductsShippedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isKeepProductsShipped( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @return the keepProductsShipped
	 */
	public boolean isKeepProductsShippedAsPrimitive()
	{
		return isKeepProductsShippedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @param value the keepProductsShipped
	 */
	public void setKeepProductsShipped(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, KEEPPRODUCTSSHIPPED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @param value the keepProductsShipped
	 */
	public void setKeepProductsShipped(final Boolean value)
	{
		setKeepProductsShipped( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @param value the keepProductsShipped
	 */
	public void setKeepProductsShipped(final SessionContext ctx, final boolean value)
	{
		setKeepProductsShipped( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.keepProductsShipped</code> attribute. 
	 * @param value the keepProductsShipped
	 */
	public void setKeepProductsShipped(final boolean value)
	{
		setKeepProductsShipped( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.lotNumbers</code> attribute.
	 * @return the lotNumbers
	 */
	public List<String> getLotNumbers(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, LOTNUMBERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.lotNumbers</code> attribute.
	 * @return the lotNumbers
	 */
	public List<String> getLotNumbers()
	{
		return getLotNumbers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.lotNumbers</code> attribute. 
	 * @param value the lotNumbers
	 */
	public void setLotNumbers(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, LOTNUMBERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.lotNumbers</code> attribute. 
	 * @param value the lotNumbers
	 */
	public void setLotNumbers(final List<String> value)
	{
		setLotNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.newPurchaseOrderNumber</code> attribute.
	 * @return the newPurchaseOrderNumber
	 */
	public String getNewPurchaseOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NEWPURCHASEORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.newPurchaseOrderNumber</code> attribute.
	 * @return the newPurchaseOrderNumber
	 */
	public String getNewPurchaseOrderNumber()
	{
		return getNewPurchaseOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.newPurchaseOrderNumber</code> attribute. 
	 * @param value the newPurchaseOrderNumber
	 */
	public void setNewPurchaseOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NEWPURCHASEORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.newPurchaseOrderNumber</code> attribute. 
	 * @param value the newPurchaseOrderNumber
	 */
	public void setNewPurchaseOrderNumber(final String value)
	{
		setNewPurchaseOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.orderCode</code> attribute.
	 * @return the orderCode
	 */
	public String getOrderCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.orderCode</code> attribute.
	 * @return the orderCode
	 */
	public String getOrderCode()
	{
		return getOrderCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.orderCode</code> attribute. 
	 * @param value the orderCode
	 */
	public void setOrderCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.orderCode</code> attribute. 
	 * @param value the orderCode
	 */
	public void setOrderCode(final String value)
	{
		setOrderCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedOrderedQuantity</code> attribute.
	 * @return the overShippedOrderedQuantity
	 */
	public String getOverShippedOrderedQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERSHIPPEDORDEREDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedOrderedQuantity</code> attribute.
	 * @return the overShippedOrderedQuantity
	 */
	public String getOverShippedOrderedQuantity()
	{
		return getOverShippedOrderedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedOrderedQuantity</code> attribute. 
	 * @param value the overShippedOrderedQuantity
	 */
	public void setOverShippedOrderedQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERSHIPPEDORDEREDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedOrderedQuantity</code> attribute. 
	 * @param value the overShippedOrderedQuantity
	 */
	public void setOverShippedOrderedQuantity(final String value)
	{
		setOverShippedOrderedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedProductCode</code> attribute.
	 * @return the overShippedProductCode
	 */
	public String getOverShippedProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERSHIPPEDPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedProductCode</code> attribute.
	 * @return the overShippedProductCode
	 */
	public String getOverShippedProductCode()
	{
		return getOverShippedProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedProductCode</code> attribute. 
	 * @param value the overShippedProductCode
	 */
	public void setOverShippedProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERSHIPPEDPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedProductCode</code> attribute. 
	 * @param value the overShippedProductCode
	 */
	public void setOverShippedProductCode(final String value)
	{
		setOverShippedProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedReceivedQuantity</code> attribute.
	 * @return the overShippedReceivedQuantity
	 */
	public String getOverShippedReceivedQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERSHIPPEDRECEIVEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.overShippedReceivedQuantity</code> attribute.
	 * @return the overShippedReceivedQuantity
	 */
	public String getOverShippedReceivedQuantity()
	{
		return getOverShippedReceivedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedReceivedQuantity</code> attribute. 
	 * @param value the overShippedReceivedQuantity
	 */
	public void setOverShippedReceivedQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERSHIPPEDRECEIVEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.overShippedReceivedQuantity</code> attribute. 
	 * @param value the overShippedReceivedQuantity
	 */
	public void setOverShippedReceivedQuantity(final String value)
	{
		setOverShippedReceivedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return getPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productAndQtyReceived</code> attribute.
	 * @return the productAndQtyReceived
	 */
	public Map<String,List<String>> getAllProductAndQtyReceived(final SessionContext ctx)
	{
		Map<String,List<String>> map = (Map<String,List<String>>)getProperty( ctx, PRODUCTANDQTYRECEIVED);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productAndQtyReceived</code> attribute.
	 * @return the productAndQtyReceived
	 */
	public Map<String,List<String>> getAllProductAndQtyReceived()
	{
		return getAllProductAndQtyReceived( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productAndQtyReceived</code> attribute. 
	 * @param value the productAndQtyReceived
	 */
	public void setAllProductAndQtyReceived(final SessionContext ctx, final Map<String,List<String>> value)
	{
		setProperty(ctx, PRODUCTANDQTYRECEIVED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productAndQtyReceived</code> attribute. 
	 * @param value the productAndQtyReceived
	 */
	public void setAllProductAndQtyReceived(final Map<String,List<String>> value)
	{
		setAllProductAndQtyReceived( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productAndReplacement</code> attribute.
	 * @return the productAndReplacement
	 */
	public Map<String,String> getAllProductAndReplacement(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTANDREPLACEMENT);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productAndReplacement</code> attribute.
	 * @return the productAndReplacement
	 */
	public Map<String,String> getAllProductAndReplacement()
	{
		return getAllProductAndReplacement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productAndReplacement</code> attribute. 
	 * @param value the productAndReplacement
	 */
	public void setAllProductAndReplacement(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTANDREPLACEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productAndReplacement</code> attribute. 
	 * @param value the productAndReplacement
	 */
	public void setAllProductAndReplacement(final Map<String,String> value)
	{
		setAllProductAndReplacement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndContractNumber</code> attribute.
	 * @return the productsAndContractNumber
	 */
	public Map<String,String> getAllProductsAndContractNumber(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDCONTRACTNUMBER);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndContractNumber</code> attribute.
	 * @return the productsAndContractNumber
	 */
	public Map<String,String> getAllProductsAndContractNumber()
	{
		return getAllProductsAndContractNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndContractNumber</code> attribute. 
	 * @param value the productsAndContractNumber
	 */
	public void setAllProductsAndContractNumber(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDCONTRACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndContractNumber</code> attribute. 
	 * @param value the productsAndContractNumber
	 */
	public void setAllProductsAndContractNumber(final Map<String,String> value)
	{
		setAllProductsAndContractNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndCorrectPrice</code> attribute.
	 * @return the productsAndCorrectPrice
	 */
	public Map<String,String> getAllProductsAndCorrectPrice(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDCORRECTPRICE);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndCorrectPrice</code> attribute.
	 * @return the productsAndCorrectPrice
	 */
	public Map<String,String> getAllProductsAndCorrectPrice()
	{
		return getAllProductsAndCorrectPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndCorrectPrice</code> attribute. 
	 * @param value the productsAndCorrectPrice
	 */
	public void setAllProductsAndCorrectPrice(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDCORRECTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndCorrectPrice</code> attribute. 
	 * @param value the productsAndCorrectPrice
	 */
	public void setAllProductsAndCorrectPrice(final Map<String,String> value)
	{
		setAllProductsAndCorrectPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndDisputedPrice</code> attribute.
	 * @return the productsAndDisputedPrice
	 */
	public Map<String,String> getAllProductsAndDisputedPrice(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDDISPUTEDPRICE);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndDisputedPrice</code> attribute.
	 * @return the productsAndDisputedPrice
	 */
	public Map<String,String> getAllProductsAndDisputedPrice()
	{
		return getAllProductsAndDisputedPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndDisputedPrice</code> attribute. 
	 * @param value the productsAndDisputedPrice
	 */
	public void setAllProductsAndDisputedPrice(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDDISPUTEDPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndDisputedPrice</code> attribute. 
	 * @param value the productsAndDisputedPrice
	 */
	public void setAllProductsAndDisputedPrice(final Map<String,String> value)
	{
		setAllProductsAndDisputedPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumber</code> attribute.
	 * @return the productsAndInvoiceNumber
	 */
	public Map<String,String> getAllProductsAndInvoiceNumber(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDINVOICENUMBER);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumber</code> attribute.
	 * @return the productsAndInvoiceNumber
	 */
	public Map<String,String> getAllProductsAndInvoiceNumber()
	{
		return getAllProductsAndInvoiceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumber</code> attribute. 
	 * @param value the productsAndInvoiceNumber
	 */
	public void setAllProductsAndInvoiceNumber(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDINVOICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumber</code> attribute. 
	 * @param value the productsAndInvoiceNumber
	 */
	public void setAllProductsAndInvoiceNumber(final Map<String,String> value)
	{
		setAllProductsAndInvoiceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberOver</code> attribute.
	 * @return the productsAndInvoiceNumberOver
	 */
	public Map<String,String> getAllProductsAndInvoiceNumberOver(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDINVOICENUMBEROVER);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberOver</code> attribute.
	 * @return the productsAndInvoiceNumberOver
	 */
	public Map<String,String> getAllProductsAndInvoiceNumberOver()
	{
		return getAllProductsAndInvoiceNumberOver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberOver</code> attribute. 
	 * @param value the productsAndInvoiceNumberOver
	 */
	public void setAllProductsAndInvoiceNumberOver(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDINVOICENUMBEROVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberOver</code> attribute. 
	 * @param value the productsAndInvoiceNumberOver
	 */
	public void setAllProductsAndInvoiceNumberOver(final Map<String,String> value)
	{
		setAllProductsAndInvoiceNumberOver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberShort</code> attribute.
	 * @return the productsAndInvoiceNumberShort
	 */
	public Map<String,String> getAllProductsAndInvoiceNumberShort(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDINVOICENUMBERSHORT);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberShort</code> attribute.
	 * @return the productsAndInvoiceNumberShort
	 */
	public Map<String,String> getAllProductsAndInvoiceNumberShort()
	{
		return getAllProductsAndInvoiceNumberShort( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberShort</code> attribute. 
	 * @param value the productsAndInvoiceNumberShort
	 */
	public void setAllProductsAndInvoiceNumberShort(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDINVOICENUMBERSHORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndInvoiceNumberShort</code> attribute. 
	 * @param value the productsAndInvoiceNumberShort
	 */
	public void setAllProductsAndInvoiceNumberShort(final Map<String,String> value)
	{
		setAllProductsAndInvoiceNumberShort( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndlotInfo</code> attribute.
	 * @return the productsAndlotInfo
	 */
	public Map<String,List<String>> getAllProductsAndlotInfo(final SessionContext ctx)
	{
		Map<String,List<String>> map = (Map<String,List<String>>)getProperty( ctx, PRODUCTSANDLOTINFO);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndlotInfo</code> attribute.
	 * @return the productsAndlotInfo
	 */
	public Map<String,List<String>> getAllProductsAndlotInfo()
	{
		return getAllProductsAndlotInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndlotInfo</code> attribute. 
	 * @param value the productsAndlotInfo
	 */
	public void setAllProductsAndlotInfo(final SessionContext ctx, final Map<String,List<String>> value)
	{
		setProperty(ctx, PRODUCTSANDLOTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndlotInfo</code> attribute. 
	 * @param value the productsAndlotInfo
	 */
	public void setAllProductsAndlotInfo(final Map<String,List<String>> value)
	{
		setAllProductsAndlotInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndLotNumbers</code> attribute.
	 * @return the productsAndLotNumbers
	 */
	public Map<String,String> getAllProductsAndLotNumbers(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDLOTNUMBERS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndLotNumbers</code> attribute.
	 * @return the productsAndLotNumbers
	 */
	public Map<String,String> getAllProductsAndLotNumbers()
	{
		return getAllProductsAndLotNumbers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndLotNumbers</code> attribute. 
	 * @param value the productsAndLotNumbers
	 */
	public void setAllProductsAndLotNumbers(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDLOTNUMBERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndLotNumbers</code> attribute. 
	 * @param value the productsAndLotNumbers
	 */
	public void setAllProductsAndLotNumbers(final Map<String,String> value)
	{
		setAllProductsAndLotNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantity</code> attribute.
	 * @return the productsAndQuantity
	 */
	public Map<String,String> getAllProductsAndQuantity(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDQUANTITY);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantity</code> attribute.
	 * @return the productsAndQuantity
	 */
	public Map<String,String> getAllProductsAndQuantity()
	{
		return getAllProductsAndQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantity</code> attribute. 
	 * @param value the productsAndQuantity
	 */
	public void setAllProductsAndQuantity(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantity</code> attribute. 
	 * @param value the productsAndQuantity
	 */
	public void setAllProductsAndQuantity(final Map<String,String> value)
	{
		setAllProductsAndQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrdered</code> attribute.
	 * @return the productsAndQuantityOrdered
	 */
	public Map<String,String> getAllProductsAndQuantityOrdered(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDQUANTITYORDERED);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrdered</code> attribute.
	 * @return the productsAndQuantityOrdered
	 */
	public Map<String,String> getAllProductsAndQuantityOrdered()
	{
		return getAllProductsAndQuantityOrdered( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrdered</code> attribute. 
	 * @param value the productsAndQuantityOrdered
	 */
	public void setAllProductsAndQuantityOrdered(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDQUANTITYORDERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrdered</code> attribute. 
	 * @param value the productsAndQuantityOrdered
	 */
	public void setAllProductsAndQuantityOrdered(final Map<String,String> value)
	{
		setAllProductsAndQuantityOrdered( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrderedOver</code> attribute.
	 * @return the productsAndQuantityOrderedOver
	 */
	public Map<String,String> getAllProductsAndQuantityOrderedOver(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PRODUCTSANDQUANTITYORDEREDOVER);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrderedOver</code> attribute.
	 * @return the productsAndQuantityOrderedOver
	 */
	public Map<String,String> getAllProductsAndQuantityOrderedOver()
	{
		return getAllProductsAndQuantityOrderedOver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrderedOver</code> attribute. 
	 * @param value the productsAndQuantityOrderedOver
	 */
	public void setAllProductsAndQuantityOrderedOver(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PRODUCTSANDQUANTITYORDEREDOVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityOrderedOver</code> attribute. 
	 * @param value the productsAndQuantityOrderedOver
	 */
	public void setAllProductsAndQuantityOrderedOver(final Map<String,String> value)
	{
		setAllProductsAndQuantityOrderedOver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityPrice</code> attribute.
	 * @return the productsAndQuantityPrice
	 */
	public Map<String,List<String>> getAllProductsAndQuantityPrice(final SessionContext ctx)
	{
		Map<String,List<String>> map = (Map<String,List<String>>)getProperty( ctx, PRODUCTSANDQUANTITYPRICE);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityPrice</code> attribute.
	 * @return the productsAndQuantityPrice
	 */
	public Map<String,List<String>> getAllProductsAndQuantityPrice()
	{
		return getAllProductsAndQuantityPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityPrice</code> attribute. 
	 * @param value the productsAndQuantityPrice
	 */
	public void setAllProductsAndQuantityPrice(final SessionContext ctx, final Map<String,List<String>> value)
	{
		setProperty(ctx, PRODUCTSANDQUANTITYPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityPrice</code> attribute. 
	 * @param value the productsAndQuantityPrice
	 */
	public void setAllProductsAndQuantityPrice(final Map<String,List<String>> value)
	{
		setAllProductsAndQuantityPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityRecievedOver</code> attribute.
	 * @return the productsAndQuantityRecievedOver
	 */
	public Map<String,List<String>> getAllProductsAndQuantityRecievedOver(final SessionContext ctx)
	{
		Map<String,List<String>> map = (Map<String,List<String>>)getProperty( ctx, PRODUCTSANDQUANTITYRECIEVEDOVER);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityRecievedOver</code> attribute.
	 * @return the productsAndQuantityRecievedOver
	 */
	public Map<String,List<String>> getAllProductsAndQuantityRecievedOver()
	{
		return getAllProductsAndQuantityRecievedOver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityRecievedOver</code> attribute. 
	 * @param value the productsAndQuantityRecievedOver
	 */
	public void setAllProductsAndQuantityRecievedOver(final SessionContext ctx, final Map<String,List<String>> value)
	{
		setProperty(ctx, PRODUCTSANDQUANTITYRECIEVEDOVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.productsAndQuantityRecievedOver</code> attribute. 
	 * @param value the productsAndQuantityRecievedOver
	 */
	public void setAllProductsAndQuantityRecievedOver(final Map<String,List<String>> value)
	{
		setAllProductsAndQuantityRecievedOver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.purchaseOrderNumber</code> attribute.
	 * @return the purchaseOrderNumber
	 */
	public String getPurchaseOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PURCHASEORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.purchaseOrderNumber</code> attribute.
	 * @return the purchaseOrderNumber
	 */
	public String getPurchaseOrderNumber()
	{
		return getPurchaseOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.purchaseOrderNumber</code> attribute. 
	 * @param value the purchaseOrderNumber
	 */
	public void setPurchaseOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PURCHASEORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.purchaseOrderNumber</code> attribute. 
	 * @param value the purchaseOrderNumber
	 */
	public void setPurchaseOrderNumber(final String value)
	{
		setPurchaseOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.quantityUom</code> attribute.
	 * @return the quantityUom
	 */
	public String getQuantityUom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUANTITYUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.quantityUom</code> attribute.
	 * @return the quantityUom
	 */
	public String getQuantityUom()
	{
		return getQuantityUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.quantityUom</code> attribute. 
	 * @param value the quantityUom
	 */
	public void setQuantityUom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUANTITYUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.quantityUom</code> attribute. 
	 * @param value the quantityUom
	 */
	public void setQuantityUom(final String value)
	{
		setQuantityUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute.
	 * @return the replacementRequired
	 */
	public Boolean isReplacementRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REPLACEMENTREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute.
	 * @return the replacementRequired
	 */
	public Boolean isReplacementRequired()
	{
		return isReplacementRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @return the replacementRequired
	 */
	public boolean isReplacementRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReplacementRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @return the replacementRequired
	 */
	public boolean isReplacementRequiredAsPrimitive()
	{
		return isReplacementRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @param value the replacementRequired
	 */
	public void setReplacementRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REPLACEMENTREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @param value the replacementRequired
	 */
	public void setReplacementRequired(final Boolean value)
	{
		setReplacementRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @param value the replacementRequired
	 */
	public void setReplacementRequired(final SessionContext ctx, final boolean value)
	{
		setReplacementRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.replacementRequired</code> attribute. 
	 * @param value the replacementRequired
	 */
	public void setReplacementRequired(final boolean value)
	{
		setReplacementRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, SHIPTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress()
	{
		return getShipToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, SHIPTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final Address value)
	{
		setShipToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedOrderedQuantity</code> attribute.
	 * @return the shortShippedOrderedQuantity
	 */
	public String getShortShippedOrderedQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTSHIPPEDORDEREDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedOrderedQuantity</code> attribute.
	 * @return the shortShippedOrderedQuantity
	 */
	public String getShortShippedOrderedQuantity()
	{
		return getShortShippedOrderedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedOrderedQuantity</code> attribute. 
	 * @param value the shortShippedOrderedQuantity
	 */
	public void setShortShippedOrderedQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTSHIPPEDORDEREDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedOrderedQuantity</code> attribute. 
	 * @param value the shortShippedOrderedQuantity
	 */
	public void setShortShippedOrderedQuantity(final String value)
	{
		setShortShippedOrderedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedProductCode</code> attribute.
	 * @return the shortShippedProductCode
	 */
	public String getShortShippedProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTSHIPPEDPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedProductCode</code> attribute.
	 * @return the shortShippedProductCode
	 */
	public String getShortShippedProductCode()
	{
		return getShortShippedProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedProductCode</code> attribute. 
	 * @param value the shortShippedProductCode
	 */
	public void setShortShippedProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTSHIPPEDPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedProductCode</code> attribute. 
	 * @param value the shortShippedProductCode
	 */
	public void setShortShippedProductCode(final String value)
	{
		setShortShippedProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedReceivedQuantity</code> attribute.
	 * @return the shortShippedReceivedQuantity
	 */
	public String getShortShippedReceivedQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTSHIPPEDRECEIVEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.shortShippedReceivedQuantity</code> attribute.
	 * @return the shortShippedReceivedQuantity
	 */
	public String getShortShippedReceivedQuantity()
	{
		return getShortShippedReceivedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedReceivedQuantity</code> attribute. 
	 * @param value the shortShippedReceivedQuantity
	 */
	public void setShortShippedReceivedQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTSHIPPEDRECEIVEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.shortShippedReceivedQuantity</code> attribute. 
	 * @param value the shortShippedReceivedQuantity
	 */
	public void setShortShippedReceivedQuantity(final String value)
	{
		setShortShippedReceivedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.totalDisputedAmount</code> attribute.
	 * @return the totalDisputedAmount
	 */
	public String getTotalDisputedAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALDISPUTEDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTDisputeInquiryProcess.totalDisputedAmount</code> attribute.
	 * @return the totalDisputedAmount
	 */
	public String getTotalDisputedAmount()
	{
		return getTotalDisputedAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.totalDisputedAmount</code> attribute. 
	 * @param value the totalDisputedAmount
	 */
	public void setTotalDisputedAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALDISPUTEDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTDisputeInquiryProcess.totalDisputedAmount</code> attribute. 
	 * @param value the totalDisputedAmount
	 */
	public void setTotalDisputedAmount(final String value)
	{
		setTotalDisputedAmount( getSession().getSessionContext(), value );
	}
	
}
