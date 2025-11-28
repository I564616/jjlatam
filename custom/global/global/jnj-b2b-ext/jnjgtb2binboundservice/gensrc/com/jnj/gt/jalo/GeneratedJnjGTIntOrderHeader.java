/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderHeader}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderHeader extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntOrderHeader.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrderHeader.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrderHeader.purchaseOrder</code> attribute **/
	public static final String PURCHASEORDER = "purchaseOrder";
	/** Qualifier of the <code>JnjGTIntOrderHeader.webOrderNumber</code> attribute **/
	public static final String WEBORDERNUMBER = "webOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrderHeader.orderType</code> attribute **/
	public static final String ORDERTYPE = "orderType";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipToCustomerNumber</code> attribute **/
	public static final String SHIPTOCUSTOMERNUMBER = "shipToCustomerNumber";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipToName</code> attribute **/
	public static final String SHIPTONAME = "shipToName";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipStreet1</code> attribute **/
	public static final String SHIPSTREET1 = "shipStreet1";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipStreet2</code> attribute **/
	public static final String SHIPSTREET2 = "shipStreet2";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipCity</code> attribute **/
	public static final String SHIPCITY = "shipCity";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipState</code> attribute **/
	public static final String SHIPSTATE = "shipState";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipCountry</code> attribute **/
	public static final String SHIPCOUNTRY = "shipCountry";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipPostalCode</code> attribute **/
	public static final String SHIPPOSTALCODE = "shipPostalCode";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipAttention</code> attribute **/
	public static final String SHIPATTENTION = "shipAttention";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipToGLN</code> attribute **/
	public static final String SHIPTOGLN = "shipToGLN";
	/** Qualifier of the <code>JnjGTIntOrderHeader.soldToAccount</code> attribute **/
	public static final String SOLDTOACCOUNT = "soldToAccount";
	/** Qualifier of the <code>JnjGTIntOrderHeader.billToAccount</code> attribute **/
	public static final String BILLTOACCOUNT = "billToAccount";
	/** Qualifier of the <code>JnjGTIntOrderHeader.reqDeliveryDate</code> attribute **/
	public static final String REQDELIVERYDATE = "reqDeliveryDate";
	/** Qualifier of the <code>JnjGTIntOrderHeader.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>JnjGTIntOrderHeader.totalNetValue</code> attribute **/
	public static final String TOTALNETVALUE = "totalNetValue";
	/** Qualifier of the <code>JnjGTIntOrderHeader.creationDate</code> attribute **/
	public static final String CREATIONDATE = "creationDate";
	/** Qualifier of the <code>JnjGTIntOrderHeader.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTIntOrderHeader.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>JnjGTIntOrderHeader.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnjGTIntOrderHeader.overAllStatus</code> attribute **/
	public static final String OVERALLSTATUS = "overAllStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.deliveryStatus</code> attribute **/
	public static final String DELIVERYSTATUS = "deliveryStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.rejectionStatus</code> attribute **/
	public static final String REJECTIONSTATUS = "rejectionStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.creditStatus</code> attribute **/
	public static final String CREDITSTATUS = "creditStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.orderIncompleteStatus</code> attribute **/
	public static final String ORDERINCOMPLETESTATUS = "orderIncompleteStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.invoiceStatus</code> attribute **/
	public static final String INVOICESTATUS = "invoiceStatus";
	/** Qualifier of the <code>JnjGTIntOrderHeader.deliveryBlock</code> attribute **/
	public static final String DELIVERYBLOCK = "deliveryBlock";
	/** Qualifier of the <code>JnjGTIntOrderHeader.poType</code> attribute **/
	public static final String POTYPE = "poType";
	/** Qualifier of the <code>JnjGTIntOrderHeader.orderReasonCode</code> attribute **/
	public static final String ORDERREASONCODE = "orderReasonCode";
	/** Qualifier of the <code>JnjGTIntOrderHeader.dropShipInd</code> attribute **/
	public static final String DROPSHIPIND = "dropShipInd";
	/** Qualifier of the <code>JnjGTIntOrderHeader.billBlock</code> attribute **/
	public static final String BILLBLOCK = "billBlock";
	/** Qualifier of the <code>JnjGTIntOrderHeader.priceDate</code> attribute **/
	public static final String PRICEDATE = "priceDate";
	/** Qualifier of the <code>JnjGTIntOrderHeader.creditRepCode</code> attribute **/
	public static final String CREDITREPCODE = "creditRepCode";
	/** Qualifier of the <code>JnjGTIntOrderHeader.surgeonName</code> attribute **/
	public static final String SURGEONNAME = "surgeonName";
	/** Qualifier of the <code>JnjGTIntOrderHeader.surgeonType</code> attribute **/
	public static final String SURGEONTYPE = "surgeonType";
	/** Qualifier of the <code>JnjGTIntOrderHeader.surgeryNumber</code> attribute **/
	public static final String SURGERYNUMBER = "surgeryNumber";
	/** Qualifier of the <code>JnjGTIntOrderHeader.patientName</code> attribute **/
	public static final String PATIENTNAME = "patientName";
	/** Qualifier of the <code>JnjGTIntOrderHeader.caseDate</code> attribute **/
	public static final String CASEDATE = "caseDate";
	/** Qualifier of the <code>JnjGTIntOrderHeader.retDistDebitMemo</code> attribute **/
	public static final String RETDISTDEBITMEMO = "retDistDebitMemo";
	/** Qualifier of the <code>JnjGTIntOrderHeader.classOfTrade</code> attribute **/
	public static final String CLASSOFTRADE = "classOfTrade";
	/** Qualifier of the <code>JnjGTIntOrderHeader.shipToPoNum</code> attribute **/
	public static final String SHIPTOPONUM = "shipToPoNum";
	/** Qualifier of the <code>JnjGTIntOrderHeader.refCustNum</code> attribute **/
	public static final String REFCUSTNUM = "refCustNum";
	/** Qualifier of the <code>JnjGTIntOrderHeader.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(PURCHASEORDER, AttributeMode.INITIAL);
		tmp.put(WEBORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(ORDERTYPE, AttributeMode.INITIAL);
		tmp.put(SHIPTOCUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(SHIPTONAME, AttributeMode.INITIAL);
		tmp.put(SHIPSTREET1, AttributeMode.INITIAL);
		tmp.put(SHIPSTREET2, AttributeMode.INITIAL);
		tmp.put(SHIPCITY, AttributeMode.INITIAL);
		tmp.put(SHIPSTATE, AttributeMode.INITIAL);
		tmp.put(SHIPCOUNTRY, AttributeMode.INITIAL);
		tmp.put(SHIPPOSTALCODE, AttributeMode.INITIAL);
		tmp.put(SHIPATTENTION, AttributeMode.INITIAL);
		tmp.put(SHIPTOGLN, AttributeMode.INITIAL);
		tmp.put(SOLDTOACCOUNT, AttributeMode.INITIAL);
		tmp.put(BILLTOACCOUNT, AttributeMode.INITIAL);
		tmp.put(REQDELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(TOTALNETVALUE, AttributeMode.INITIAL);
		tmp.put(CREATIONDATE, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(OVERALLSTATUS, AttributeMode.INITIAL);
		tmp.put(DELIVERYSTATUS, AttributeMode.INITIAL);
		tmp.put(REJECTIONSTATUS, AttributeMode.INITIAL);
		tmp.put(CREDITSTATUS, AttributeMode.INITIAL);
		tmp.put(ORDERINCOMPLETESTATUS, AttributeMode.INITIAL);
		tmp.put(INVOICESTATUS, AttributeMode.INITIAL);
		tmp.put(DELIVERYBLOCK, AttributeMode.INITIAL);
		tmp.put(POTYPE, AttributeMode.INITIAL);
		tmp.put(ORDERREASONCODE, AttributeMode.INITIAL);
		tmp.put(DROPSHIPIND, AttributeMode.INITIAL);
		tmp.put(BILLBLOCK, AttributeMode.INITIAL);
		tmp.put(PRICEDATE, AttributeMode.INITIAL);
		tmp.put(CREDITREPCODE, AttributeMode.INITIAL);
		tmp.put(SURGEONNAME, AttributeMode.INITIAL);
		tmp.put(SURGEONTYPE, AttributeMode.INITIAL);
		tmp.put(SURGERYNUMBER, AttributeMode.INITIAL);
		tmp.put(PATIENTNAME, AttributeMode.INITIAL);
		tmp.put(CASEDATE, AttributeMode.INITIAL);
		tmp.put(RETDISTDEBITMEMO, AttributeMode.INITIAL);
		tmp.put(CLASSOFTRADE, AttributeMode.INITIAL);
		tmp.put(SHIPTOPONUM, AttributeMode.INITIAL);
		tmp.put(REFCUSTNUM, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.billBlock</code> attribute.
	 * @return the billBlock
	 */
	public String getBillBlock(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.billBlock</code> attribute.
	 * @return the billBlock
	 */
	public String getBillBlock()
	{
		return getBillBlock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.billBlock</code> attribute. 
	 * @param value the billBlock
	 */
	public void setBillBlock(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.billBlock</code> attribute. 
	 * @param value the billBlock
	 */
	public void setBillBlock(final String value)
	{
		setBillBlock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.billToAccount</code> attribute.
	 * @return the billToAccount
	 */
	public String getBillToAccount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.billToAccount</code> attribute.
	 * @return the billToAccount
	 */
	public String getBillToAccount()
	{
		return getBillToAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.billToAccount</code> attribute. 
	 * @param value the billToAccount
	 */
	public void setBillToAccount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.billToAccount</code> attribute. 
	 * @param value the billToAccount
	 */
	public void setBillToAccount(final String value)
	{
		setBillToAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public String getCaseDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public String getCaseDate()
	{
		return getCaseDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final String value)
	{
		setCaseDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.classOfTrade</code> attribute.
	 * @return the classOfTrade
	 */
	public String getClassOfTrade(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLASSOFTRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.classOfTrade</code> attribute.
	 * @return the classOfTrade
	 */
	public String getClassOfTrade()
	{
		return getClassOfTrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.classOfTrade</code> attribute. 
	 * @param value the classOfTrade
	 */
	public void setClassOfTrade(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLASSOFTRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.classOfTrade</code> attribute. 
	 * @param value the classOfTrade
	 */
	public void setClassOfTrade(final String value)
	{
		setClassOfTrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public String getCreationDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public String getCreationDate()
	{
		return getCreationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final String value)
	{
		setCreationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creditRepCode</code> attribute.
	 * @return the creditRepCode
	 */
	public String getCreditRepCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITREPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creditRepCode</code> attribute.
	 * @return the creditRepCode
	 */
	public String getCreditRepCode()
	{
		return getCreditRepCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creditRepCode</code> attribute. 
	 * @param value the creditRepCode
	 */
	public void setCreditRepCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITREPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creditRepCode</code> attribute. 
	 * @param value the creditRepCode
	 */
	public void setCreditRepCode(final String value)
	{
		setCreditRepCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creditStatus</code> attribute.
	 * @return the creditStatus
	 */
	public String getCreditStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.creditStatus</code> attribute.
	 * @return the creditStatus
	 */
	public String getCreditStatus()
	{
		return getCreditStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creditStatus</code> attribute. 
	 * @param value the creditStatus
	 */
	public void setCreditStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.creditStatus</code> attribute. 
	 * @param value the creditStatus
	 */
	public void setCreditStatus(final String value)
	{
		setCreditStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final String value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.deliveryBlock</code> attribute.
	 * @return the deliveryBlock
	 */
	public String getDeliveryBlock(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.deliveryBlock</code> attribute.
	 * @return the deliveryBlock
	 */
	public String getDeliveryBlock()
	{
		return getDeliveryBlock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.deliveryBlock</code> attribute. 
	 * @param value the deliveryBlock
	 */
	public void setDeliveryBlock(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.deliveryBlock</code> attribute. 
	 * @param value the deliveryBlock
	 */
	public void setDeliveryBlock(final String value)
	{
		setDeliveryBlock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus()
	{
		return getDeliveryStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final String value)
	{
		setDeliveryStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final String value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.dropShipInd</code> attribute.
	 * @return the dropShipInd
	 */
	public String getDropShipInd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DROPSHIPIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.dropShipInd</code> attribute.
	 * @return the dropShipInd
	 */
	public String getDropShipInd()
	{
		return getDropShipInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.dropShipInd</code> attribute. 
	 * @param value the dropShipInd
	 */
	public void setDropShipInd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DROPSHIPIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.dropShipInd</code> attribute. 
	 * @param value the dropShipInd
	 */
	public void setDropShipInd(final String value)
	{
		setDropShipInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus()
	{
		return getInvoiceStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final String value)
	{
		setInvoiceStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderIncompleteStatus</code> attribute.
	 * @return the orderIncompleteStatus
	 */
	public String getOrderIncompleteStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERINCOMPLETESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderIncompleteStatus</code> attribute.
	 * @return the orderIncompleteStatus
	 */
	public String getOrderIncompleteStatus()
	{
		return getOrderIncompleteStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderIncompleteStatus</code> attribute. 
	 * @param value the orderIncompleteStatus
	 */
	public void setOrderIncompleteStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERINCOMPLETESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderIncompleteStatus</code> attribute. 
	 * @param value the orderIncompleteStatus
	 */
	public void setOrderIncompleteStatus(final String value)
	{
		setOrderIncompleteStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderReasonCode</code> attribute.
	 * @return the orderReasonCode
	 */
	public String getOrderReasonCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERREASONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderReasonCode</code> attribute.
	 * @return the orderReasonCode
	 */
	public String getOrderReasonCode()
	{
		return getOrderReasonCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderReasonCode</code> attribute. 
	 * @param value the orderReasonCode
	 */
	public void setOrderReasonCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERREASONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderReasonCode</code> attribute. 
	 * @param value the orderReasonCode
	 */
	public void setOrderReasonCode(final String value)
	{
		setOrderReasonCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType()
	{
		return getOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final String value)
	{
		setOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERALLSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus()
	{
		return getOverAllStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERALLSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final String value)
	{
		setOverAllStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.patientName</code> attribute.
	 * @return the patientName
	 */
	public String getPatientName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PATIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.patientName</code> attribute.
	 * @return the patientName
	 */
	public String getPatientName()
	{
		return getPatientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.patientName</code> attribute. 
	 * @param value the patientName
	 */
	public void setPatientName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PATIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.patientName</code> attribute. 
	 * @param value the patientName
	 */
	public void setPatientName(final String value)
	{
		setPatientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.poType</code> attribute.
	 * @return the poType
	 */
	public String getPoType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.poType</code> attribute.
	 * @return the poType
	 */
	public String getPoType()
	{
		return getPoType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.poType</code> attribute. 
	 * @param value the poType
	 */
	public void setPoType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.poType</code> attribute. 
	 * @param value the poType
	 */
	public void setPoType(final String value)
	{
		setPoType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.priceDate</code> attribute.
	 * @return the priceDate
	 */
	public String getPriceDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.priceDate</code> attribute.
	 * @return the priceDate
	 */
	public String getPriceDate()
	{
		return getPriceDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.priceDate</code> attribute. 
	 * @param value the priceDate
	 */
	public void setPriceDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.priceDate</code> attribute. 
	 * @param value the priceDate
	 */
	public void setPriceDate(final String value)
	{
		setPriceDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.purchaseOrder</code> attribute.
	 * @return the purchaseOrder
	 */
	public String getPurchaseOrder(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PURCHASEORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.purchaseOrder</code> attribute.
	 * @return the purchaseOrder
	 */
	public String getPurchaseOrder()
	{
		return getPurchaseOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.purchaseOrder</code> attribute. 
	 * @param value the purchaseOrder
	 */
	public void setPurchaseOrder(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PURCHASEORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.purchaseOrder</code> attribute. 
	 * @param value the purchaseOrder
	 */
	public void setPurchaseOrder(final String value)
	{
		setPurchaseOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.refCustNum</code> attribute.
	 * @return the refCustNum
	 */
	public String getRefCustNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFCUSTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.refCustNum</code> attribute.
	 * @return the refCustNum
	 */
	public String getRefCustNum()
	{
		return getRefCustNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.refCustNum</code> attribute. 
	 * @param value the refCustNum
	 */
	public void setRefCustNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFCUSTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.refCustNum</code> attribute. 
	 * @param value the refCustNum
	 */
	public void setRefCustNum(final String value)
	{
		setRefCustNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.rejectionStatus</code> attribute.
	 * @return the rejectionStatus
	 */
	public String getRejectionStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REJECTIONSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.rejectionStatus</code> attribute.
	 * @return the rejectionStatus
	 */
	public String getRejectionStatus()
	{
		return getRejectionStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.rejectionStatus</code> attribute. 
	 * @param value the rejectionStatus
	 */
	public void setRejectionStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REJECTIONSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.rejectionStatus</code> attribute. 
	 * @param value the rejectionStatus
	 */
	public void setRejectionStatus(final String value)
	{
		setRejectionStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.reqDeliveryDate</code> attribute.
	 * @return the reqDeliveryDate
	 */
	public String getReqDeliveryDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REQDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.reqDeliveryDate</code> attribute.
	 * @return the reqDeliveryDate
	 */
	public String getReqDeliveryDate()
	{
		return getReqDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.reqDeliveryDate</code> attribute. 
	 * @param value the reqDeliveryDate
	 */
	public void setReqDeliveryDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REQDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.reqDeliveryDate</code> attribute. 
	 * @param value the reqDeliveryDate
	 */
	public void setReqDeliveryDate(final String value)
	{
		setReqDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.retDistDebitMemo</code> attribute.
	 * @return the retDistDebitMemo
	 */
	public String getRetDistDebitMemo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RETDISTDEBITMEMO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.retDistDebitMemo</code> attribute.
	 * @return the retDistDebitMemo
	 */
	public String getRetDistDebitMemo()
	{
		return getRetDistDebitMemo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.retDistDebitMemo</code> attribute. 
	 * @param value the retDistDebitMemo
	 */
	public void setRetDistDebitMemo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RETDISTDEBITMEMO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.retDistDebitMemo</code> attribute. 
	 * @param value the retDistDebitMemo
	 */
	public void setRetDistDebitMemo(final String value)
	{
		setRetDistDebitMemo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipAttention</code> attribute.
	 * @return the shipAttention
	 */
	public String getShipAttention(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPATTENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipAttention</code> attribute.
	 * @return the shipAttention
	 */
	public String getShipAttention()
	{
		return getShipAttention( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipAttention</code> attribute. 
	 * @param value the shipAttention
	 */
	public void setShipAttention(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPATTENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipAttention</code> attribute. 
	 * @param value the shipAttention
	 */
	public void setShipAttention(final String value)
	{
		setShipAttention( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipCity</code> attribute.
	 * @return the shipCity
	 */
	public String getShipCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipCity</code> attribute.
	 * @return the shipCity
	 */
	public String getShipCity()
	{
		return getShipCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipCity</code> attribute. 
	 * @param value the shipCity
	 */
	public void setShipCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipCity</code> attribute. 
	 * @param value the shipCity
	 */
	public void setShipCity(final String value)
	{
		setShipCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipCountry</code> attribute.
	 * @return the shipCountry
	 */
	public String getShipCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipCountry</code> attribute.
	 * @return the shipCountry
	 */
	public String getShipCountry()
	{
		return getShipCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipCountry</code> attribute. 
	 * @param value the shipCountry
	 */
	public void setShipCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipCountry</code> attribute. 
	 * @param value the shipCountry
	 */
	public void setShipCountry(final String value)
	{
		setShipCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipPostalCode</code> attribute.
	 * @return the shipPostalCode
	 */
	public String getShipPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPPOSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipPostalCode</code> attribute.
	 * @return the shipPostalCode
	 */
	public String getShipPostalCode()
	{
		return getShipPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipPostalCode</code> attribute. 
	 * @param value the shipPostalCode
	 */
	public void setShipPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPPOSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipPostalCode</code> attribute. 
	 * @param value the shipPostalCode
	 */
	public void setShipPostalCode(final String value)
	{
		setShipPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipState</code> attribute.
	 * @return the shipState
	 */
	public String getShipState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipState</code> attribute.
	 * @return the shipState
	 */
	public String getShipState()
	{
		return getShipState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipState</code> attribute. 
	 * @param value the shipState
	 */
	public void setShipState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipState</code> attribute. 
	 * @param value the shipState
	 */
	public void setShipState(final String value)
	{
		setShipState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipStreet1</code> attribute.
	 * @return the shipStreet1
	 */
	public String getShipStreet1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPSTREET1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipStreet1</code> attribute.
	 * @return the shipStreet1
	 */
	public String getShipStreet1()
	{
		return getShipStreet1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipStreet1</code> attribute. 
	 * @param value the shipStreet1
	 */
	public void setShipStreet1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPSTREET1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipStreet1</code> attribute. 
	 * @param value the shipStreet1
	 */
	public void setShipStreet1(final String value)
	{
		setShipStreet1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipStreet2</code> attribute.
	 * @return the shipStreet2
	 */
	public String getShipStreet2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPSTREET2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipStreet2</code> attribute.
	 * @return the shipStreet2
	 */
	public String getShipStreet2()
	{
		return getShipStreet2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipStreet2</code> attribute. 
	 * @param value the shipStreet2
	 */
	public void setShipStreet2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPSTREET2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipStreet2</code> attribute. 
	 * @param value the shipStreet2
	 */
	public void setShipStreet2(final String value)
	{
		setShipStreet2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToCustomerNumber</code> attribute.
	 * @return the shipToCustomerNumber
	 */
	public String getShipToCustomerNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOCUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToCustomerNumber</code> attribute.
	 * @return the shipToCustomerNumber
	 */
	public String getShipToCustomerNumber()
	{
		return getShipToCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToCustomerNumber</code> attribute. 
	 * @param value the shipToCustomerNumber
	 */
	public void setShipToCustomerNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOCUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToCustomerNumber</code> attribute. 
	 * @param value the shipToCustomerNumber
	 */
	public void setShipToCustomerNumber(final String value)
	{
		setShipToCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToGLN</code> attribute.
	 * @return the shipToGLN
	 */
	public String getShipToGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToGLN</code> attribute.
	 * @return the shipToGLN
	 */
	public String getShipToGLN()
	{
		return getShipToGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToGLN</code> attribute. 
	 * @param value the shipToGLN
	 */
	public void setShipToGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToGLN</code> attribute. 
	 * @param value the shipToGLN
	 */
	public void setShipToGLN(final String value)
	{
		setShipToGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToName</code> attribute.
	 * @return the shipToName
	 */
	public String getShipToName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToName</code> attribute.
	 * @return the shipToName
	 */
	public String getShipToName()
	{
		return getShipToName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToName</code> attribute. 
	 * @param value the shipToName
	 */
	public void setShipToName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToName</code> attribute. 
	 * @param value the shipToName
	 */
	public void setShipToName(final String value)
	{
		setShipToName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToPoNum</code> attribute.
	 * @return the shipToPoNum
	 */
	public String getShipToPoNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOPONUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.shipToPoNum</code> attribute.
	 * @return the shipToPoNum
	 */
	public String getShipToPoNum()
	{
		return getShipToPoNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToPoNum</code> attribute. 
	 * @param value the shipToPoNum
	 */
	public void setShipToPoNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOPONUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.shipToPoNum</code> attribute. 
	 * @param value the shipToPoNum
	 */
	public void setShipToPoNum(final String value)
	{
		setShipToPoNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.soldToAccount</code> attribute.
	 * @return the soldToAccount
	 */
	public String getSoldToAccount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTOACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.soldToAccount</code> attribute.
	 * @return the soldToAccount
	 */
	public String getSoldToAccount()
	{
		return getSoldToAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.soldToAccount</code> attribute. 
	 * @param value the soldToAccount
	 */
	public void setSoldToAccount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTOACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.soldToAccount</code> attribute. 
	 * @param value the soldToAccount
	 */
	public void setSoldToAccount(final String value)
	{
		setSoldToAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeonName</code> attribute.
	 * @return the surgeonName
	 */
	public String getSurgeonName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGEONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeonName</code> attribute.
	 * @return the surgeonName
	 */
	public String getSurgeonName()
	{
		return getSurgeonName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeonName</code> attribute. 
	 * @param value the surgeonName
	 */
	public void setSurgeonName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGEONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeonName</code> attribute. 
	 * @param value the surgeonName
	 */
	public void setSurgeonName(final String value)
	{
		setSurgeonName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeonType</code> attribute.
	 * @return the surgeonType
	 */
	public String getSurgeonType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGEONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeonType</code> attribute.
	 * @return the surgeonType
	 */
	public String getSurgeonType()
	{
		return getSurgeonType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeonType</code> attribute. 
	 * @param value the surgeonType
	 */
	public void setSurgeonType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGEONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeonType</code> attribute. 
	 * @param value the surgeonType
	 */
	public void setSurgeonType(final String value)
	{
		setSurgeonType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeryNumber</code> attribute.
	 * @return the surgeryNumber
	 */
	public String getSurgeryNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGERYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.surgeryNumber</code> attribute.
	 * @return the surgeryNumber
	 */
	public String getSurgeryNumber()
	{
		return getSurgeryNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeryNumber</code> attribute. 
	 * @param value the surgeryNumber
	 */
	public void setSurgeryNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGERYNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.surgeryNumber</code> attribute. 
	 * @param value the surgeryNumber
	 */
	public void setSurgeryNumber(final String value)
	{
		setSurgeryNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.totalNetValue</code> attribute.
	 * @return the totalNetValue
	 */
	public String getTotalNetValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALNETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.totalNetValue</code> attribute.
	 * @return the totalNetValue
	 */
	public String getTotalNetValue()
	{
		return getTotalNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALNETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final String value)
	{
		setTotalNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.webOrderNumber</code> attribute.
	 * @return the webOrderNumber
	 */
	public String getWebOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEBORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderHeader.webOrderNumber</code> attribute.
	 * @return the webOrderNumber
	 */
	public String getWebOrderNumber()
	{
		return getWebOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.webOrderNumber</code> attribute. 
	 * @param value the webOrderNumber
	 */
	public void setWebOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEBORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderHeader.webOrderNumber</code> attribute. 
	 * @param value the webOrderNumber
	 */
	public void setWebOrderNumber(final String value)
	{
		setWebOrderNumber( getSession().getSessionContext(), value );
	}
	
}
