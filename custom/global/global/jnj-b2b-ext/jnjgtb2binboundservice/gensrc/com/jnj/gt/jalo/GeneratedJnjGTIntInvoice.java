/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntInvoice}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntInvoice extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntInvoice.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntInvoice.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntInvoice.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	/** Qualifier of the <code>JnjGTIntInvoice.invoiceDocNum</code> attribute **/
	public static final String INVOICEDOCNUM = "invoiceDocNum";
	/** Qualifier of the <code>JnjGTIntInvoice.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTIntInvoice.salesOrgDistChannel</code> attribute **/
	public static final String SALESORGDISTCHANNEL = "salesOrgDistChannel";
	/** Qualifier of the <code>JnjGTIntInvoice.salesOrgDivCode</code> attribute **/
	public static final String SALESORGDIVCODE = "salesOrgDivCode";
	/** Qualifier of the <code>JnjGTIntInvoice.billingType</code> attribute **/
	public static final String BILLINGTYPE = "billingType";
	/** Qualifier of the <code>JnjGTIntInvoice.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>JnjGTIntInvoice.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>JnjGTIntInvoice.billingDate</code> attribute **/
	public static final String BILLINGDATE = "billingDate";
	/** Qualifier of the <code>JnjGTIntInvoice.payerAccNum</code> attribute **/
	public static final String PAYERACCNUM = "payerAccNum";
	/** Qualifier of the <code>JnjGTIntInvoice.soldToAccNum</code> attribute **/
	public static final String SOLDTOACCNUM = "soldToAccNum";
	/** Qualifier of the <code>JnjGTIntInvoice.poOrderNum</code> attribute **/
	public static final String POORDERNUM = "poOrderNum";
	/** Qualifier of the <code>JnjGTIntInvoice.taxAmt</code> attribute **/
	public static final String TAXAMT = "taxAmt";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToAccNum</code> attribute **/
	public static final String SHIPTOACCNUM = "shipToAccNum";
	/** Qualifier of the <code>JnjGTIntInvoice.billToAccNum</code> attribute **/
	public static final String BILLTOACCNUM = "billToAccNum";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToName1</code> attribute **/
	public static final String SHIPTONAME1 = "shipToName1";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToName2</code> attribute **/
	public static final String SHIPTONAME2 = "shipToName2";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToName3</code> attribute **/
	public static final String SHIPTONAME3 = "shipToName3";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToName4</code> attribute **/
	public static final String SHIPTONAME4 = "shipToName4";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToStreet1</code> attribute **/
	public static final String SHIPTOSTREET1 = "shipToStreet1";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToStreet2</code> attribute **/
	public static final String SHIPTOSTREET2 = "shipToStreet2";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToStreet3</code> attribute **/
	public static final String SHIPTOSTREET3 = "shipToStreet3";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToCity</code> attribute **/
	public static final String SHIPTOCITY = "shipToCity";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToState</code> attribute **/
	public static final String SHIPTOSTATE = "shipToState";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToPostal</code> attribute **/
	public static final String SHIPTOPOSTAL = "shipToPostal";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToCountry</code> attribute **/
	public static final String SHIPTOCOUNTRY = "shipToCountry";
	/** Qualifier of the <code>JnjGTIntInvoice.ORDER_SOURCE</code> attribute **/
	public static final String ORDER_SOURCE = "ORDER_SOURCE";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToPONum</code> attribute **/
	public static final String SHIPTOPONUM = "shipToPONum";
	/** Qualifier of the <code>JnjGTIntInvoice.payerAccGLN</code> attribute **/
	public static final String PAYERACCGLN = "payerAccGLN";
	/** Qualifier of the <code>JnjGTIntInvoice.soldToAccGLN</code> attribute **/
	public static final String SOLDTOACCGLN = "soldToAccGLN";
	/** Qualifier of the <code>JnjGTIntInvoice.billToAccGLN</code> attribute **/
	public static final String BILLTOACCGLN = "billToAccGLN";
	/** Qualifier of the <code>JnjGTIntInvoice.shipToAccGLN</code> attribute **/
	public static final String SHIPTOACCGLN = "shipToAccGLN";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
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
		tmp.put(SHIPTONAME1, AttributeMode.INITIAL);
		tmp.put(SHIPTONAME2, AttributeMode.INITIAL);
		tmp.put(SHIPTONAME3, AttributeMode.INITIAL);
		tmp.put(SHIPTONAME4, AttributeMode.INITIAL);
		tmp.put(SHIPTOSTREET1, AttributeMode.INITIAL);
		tmp.put(SHIPTOSTREET2, AttributeMode.INITIAL);
		tmp.put(SHIPTOSTREET3, AttributeMode.INITIAL);
		tmp.put(SHIPTOCITY, AttributeMode.INITIAL);
		tmp.put(SHIPTOSTATE, AttributeMode.INITIAL);
		tmp.put(SHIPTOPOSTAL, AttributeMode.INITIAL);
		tmp.put(SHIPTOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(ORDER_SOURCE, AttributeMode.INITIAL);
		tmp.put(SHIPTOPONUM, AttributeMode.INITIAL);
		tmp.put(PAYERACCGLN, AttributeMode.INITIAL);
		tmp.put(SOLDTOACCGLN, AttributeMode.INITIAL);
		tmp.put(BILLTOACCGLN, AttributeMode.INITIAL);
		tmp.put(SHIPTOACCGLN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billingDate</code> attribute.
	 * @return the billingDate
	 */
	public Date getBillingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BILLINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billingDate</code> attribute.
	 * @return the billingDate
	 */
	public Date getBillingDate()
	{
		return getBillingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billingDate</code> attribute. 
	 * @param value the billingDate
	 */
	public void setBillingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BILLINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billingDate</code> attribute. 
	 * @param value the billingDate
	 */
	public void setBillingDate(final Date value)
	{
		setBillingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billingType</code> attribute.
	 * @return the billingType
	 */
	public String getBillingType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billingType</code> attribute.
	 * @return the billingType
	 */
	public String getBillingType()
	{
		return getBillingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billingType</code> attribute. 
	 * @param value the billingType
	 */
	public void setBillingType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billingType</code> attribute. 
	 * @param value the billingType
	 */
	public void setBillingType(final String value)
	{
		setBillingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billToAccGLN</code> attribute.
	 * @return the billToAccGLN
	 */
	public String getBillToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billToAccGLN</code> attribute.
	 * @return the billToAccGLN
	 */
	public String getBillToAccGLN()
	{
		return getBillToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billToAccGLN</code> attribute. 
	 * @param value the billToAccGLN
	 */
	public void setBillToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billToAccGLN</code> attribute. 
	 * @param value the billToAccGLN
	 */
	public void setBillToAccGLN(final String value)
	{
		setBillToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billToAccNum</code> attribute.
	 * @return the billToAccNum
	 */
	public String getBillToAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.billToAccNum</code> attribute.
	 * @return the billToAccNum
	 */
	public String getBillToAccNum()
	{
		return getBillToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billToAccNum</code> attribute. 
	 * @param value the billToAccNum
	 */
	public void setBillToAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.billToAccNum</code> attribute. 
	 * @param value the billToAccNum
	 */
	public void setBillToAccNum(final String value)
	{
		setBillToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final String value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.invoiceDocNum</code> attribute.
	 * @return the invoiceDocNum
	 */
	public String getInvoiceDocNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICEDOCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.invoiceDocNum</code> attribute.
	 * @return the invoiceDocNum
	 */
	public String getInvoiceDocNum()
	{
		return getInvoiceDocNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.invoiceDocNum</code> attribute. 
	 * @param value the invoiceDocNum
	 */
	public void setInvoiceDocNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICEDOCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.invoiceDocNum</code> attribute. 
	 * @param value the invoiceDocNum
	 */
	public void setInvoiceDocNum(final String value)
	{
		setInvoiceDocNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.netValue</code> attribute.
	 * @return the netValue
	 */
	public String getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final String value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.ORDER_SOURCE</code> attribute.
	 * @return the ORDER_SOURCE
	 */
	public String getORDER_SOURCE(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDER_SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.ORDER_SOURCE</code> attribute.
	 * @return the ORDER_SOURCE
	 */
	public String getORDER_SOURCE()
	{
		return getORDER_SOURCE( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.ORDER_SOURCE</code> attribute. 
	 * @param value the ORDER_SOURCE
	 */
	public void setORDER_SOURCE(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDER_SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.ORDER_SOURCE</code> attribute. 
	 * @param value the ORDER_SOURCE
	 */
	public void setORDER_SOURCE(final String value)
	{
		setORDER_SOURCE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.payerAccGLN</code> attribute.
	 * @return the payerAccGLN
	 */
	public String getPayerAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYERACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.payerAccGLN</code> attribute.
	 * @return the payerAccGLN
	 */
	public String getPayerAccGLN()
	{
		return getPayerAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.payerAccGLN</code> attribute. 
	 * @param value the payerAccGLN
	 */
	public void setPayerAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYERACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.payerAccGLN</code> attribute. 
	 * @param value the payerAccGLN
	 */
	public void setPayerAccGLN(final String value)
	{
		setPayerAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.payerAccNum</code> attribute.
	 * @return the payerAccNum
	 */
	public String getPayerAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYERACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.payerAccNum</code> attribute.
	 * @return the payerAccNum
	 */
	public String getPayerAccNum()
	{
		return getPayerAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.payerAccNum</code> attribute. 
	 * @param value the payerAccNum
	 */
	public void setPayerAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYERACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.payerAccNum</code> attribute. 
	 * @param value the payerAccNum
	 */
	public void setPayerAccNum(final String value)
	{
		setPayerAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.poOrderNum</code> attribute.
	 * @return the poOrderNum
	 */
	public String getPoOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.poOrderNum</code> attribute.
	 * @return the poOrderNum
	 */
	public String getPoOrderNum()
	{
		return getPoOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.poOrderNum</code> attribute. 
	 * @param value the poOrderNum
	 */
	public void setPoOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.poOrderNum</code> attribute. 
	 * @param value the poOrderNum
	 */
	public void setPoOrderNum(final String value)
	{
		setPoOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrgDistChannel</code> attribute.
	 * @return the salesOrgDistChannel
	 */
	public String getSalesOrgDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrgDistChannel</code> attribute.
	 * @return the salesOrgDistChannel
	 */
	public String getSalesOrgDistChannel()
	{
		return getSalesOrgDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrgDistChannel</code> attribute. 
	 * @param value the salesOrgDistChannel
	 */
	public void setSalesOrgDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrgDistChannel</code> attribute. 
	 * @param value the salesOrgDistChannel
	 */
	public void setSalesOrgDistChannel(final String value)
	{
		setSalesOrgDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrgDivCode</code> attribute.
	 * @return the salesOrgDivCode
	 */
	public String getSalesOrgDivCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.salesOrgDivCode</code> attribute.
	 * @return the salesOrgDivCode
	 */
	public String getSalesOrgDivCode()
	{
		return getSalesOrgDivCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrgDivCode</code> attribute. 
	 * @param value the salesOrgDivCode
	 */
	public void setSalesOrgDivCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.salesOrgDivCode</code> attribute. 
	 * @param value the salesOrgDivCode
	 */
	public void setSalesOrgDivCode(final String value)
	{
		setSalesOrgDivCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToAccGLN</code> attribute.
	 * @return the shipToAccGLN
	 */
	public String getShipToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToAccGLN</code> attribute.
	 * @return the shipToAccGLN
	 */
	public String getShipToAccGLN()
	{
		return getShipToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToAccGLN</code> attribute. 
	 * @param value the shipToAccGLN
	 */
	public void setShipToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToAccGLN</code> attribute. 
	 * @param value the shipToAccGLN
	 */
	public void setShipToAccGLN(final String value)
	{
		setShipToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToAccNum</code> attribute.
	 * @return the shipToAccNum
	 */
	public String getShipToAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToAccNum</code> attribute.
	 * @return the shipToAccNum
	 */
	public String getShipToAccNum()
	{
		return getShipToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToAccNum</code> attribute. 
	 * @param value the shipToAccNum
	 */
	public void setShipToAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToAccNum</code> attribute. 
	 * @param value the shipToAccNum
	 */
	public void setShipToAccNum(final String value)
	{
		setShipToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToCity</code> attribute.
	 * @return the shipToCity
	 */
	public String getShipToCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToCity</code> attribute.
	 * @return the shipToCity
	 */
	public String getShipToCity()
	{
		return getShipToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToCity</code> attribute. 
	 * @param value the shipToCity
	 */
	public void setShipToCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToCity</code> attribute. 
	 * @param value the shipToCity
	 */
	public void setShipToCity(final String value)
	{
		setShipToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToCountry</code> attribute.
	 * @return the shipToCountry
	 */
	public String getShipToCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToCountry</code> attribute.
	 * @return the shipToCountry
	 */
	public String getShipToCountry()
	{
		return getShipToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToCountry</code> attribute. 
	 * @param value the shipToCountry
	 */
	public void setShipToCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToCountry</code> attribute. 
	 * @param value the shipToCountry
	 */
	public void setShipToCountry(final String value)
	{
		setShipToCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName1</code> attribute.
	 * @return the shipToName1
	 */
	public String getShipToName1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONAME1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName1</code> attribute.
	 * @return the shipToName1
	 */
	public String getShipToName1()
	{
		return getShipToName1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName1</code> attribute. 
	 * @param value the shipToName1
	 */
	public void setShipToName1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONAME1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName1</code> attribute. 
	 * @param value the shipToName1
	 */
	public void setShipToName1(final String value)
	{
		setShipToName1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName2</code> attribute.
	 * @return the shipToName2
	 */
	public String getShipToName2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName2</code> attribute.
	 * @return the shipToName2
	 */
	public String getShipToName2()
	{
		return getShipToName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName2</code> attribute. 
	 * @param value the shipToName2
	 */
	public void setShipToName2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName2</code> attribute. 
	 * @param value the shipToName2
	 */
	public void setShipToName2(final String value)
	{
		setShipToName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName3</code> attribute.
	 * @return the shipToName3
	 */
	public String getShipToName3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONAME3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName3</code> attribute.
	 * @return the shipToName3
	 */
	public String getShipToName3()
	{
		return getShipToName3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName3</code> attribute. 
	 * @param value the shipToName3
	 */
	public void setShipToName3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONAME3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName3</code> attribute. 
	 * @param value the shipToName3
	 */
	public void setShipToName3(final String value)
	{
		setShipToName3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName4</code> attribute.
	 * @return the shipToName4
	 */
	public String getShipToName4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONAME4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToName4</code> attribute.
	 * @return the shipToName4
	 */
	public String getShipToName4()
	{
		return getShipToName4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName4</code> attribute. 
	 * @param value the shipToName4
	 */
	public void setShipToName4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONAME4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToName4</code> attribute. 
	 * @param value the shipToName4
	 */
	public void setShipToName4(final String value)
	{
		setShipToName4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToPONum</code> attribute.
	 * @return the shipToPONum
	 */
	public String getShipToPONum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOPONUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToPONum</code> attribute.
	 * @return the shipToPONum
	 */
	public String getShipToPONum()
	{
		return getShipToPONum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToPONum</code> attribute. 
	 * @param value the shipToPONum
	 */
	public void setShipToPONum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOPONUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToPONum</code> attribute. 
	 * @param value the shipToPONum
	 */
	public void setShipToPONum(final String value)
	{
		setShipToPONum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToPostal</code> attribute.
	 * @return the shipToPostal
	 */
	public String getShipToPostal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOPOSTAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToPostal</code> attribute.
	 * @return the shipToPostal
	 */
	public String getShipToPostal()
	{
		return getShipToPostal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToPostal</code> attribute. 
	 * @param value the shipToPostal
	 */
	public void setShipToPostal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOPOSTAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToPostal</code> attribute. 
	 * @param value the shipToPostal
	 */
	public void setShipToPostal(final String value)
	{
		setShipToPostal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToState</code> attribute.
	 * @return the shipToState
	 */
	public String getShipToState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToState</code> attribute.
	 * @return the shipToState
	 */
	public String getShipToState()
	{
		return getShipToState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToState</code> attribute. 
	 * @param value the shipToState
	 */
	public void setShipToState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToState</code> attribute. 
	 * @param value the shipToState
	 */
	public void setShipToState(final String value)
	{
		setShipToState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet1</code> attribute.
	 * @return the shipToStreet1
	 */
	public String getShipToStreet1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOSTREET1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet1</code> attribute.
	 * @return the shipToStreet1
	 */
	public String getShipToStreet1()
	{
		return getShipToStreet1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet1</code> attribute. 
	 * @param value the shipToStreet1
	 */
	public void setShipToStreet1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOSTREET1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet1</code> attribute. 
	 * @param value the shipToStreet1
	 */
	public void setShipToStreet1(final String value)
	{
		setShipToStreet1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet2</code> attribute.
	 * @return the shipToStreet2
	 */
	public String getShipToStreet2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOSTREET2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet2</code> attribute.
	 * @return the shipToStreet2
	 */
	public String getShipToStreet2()
	{
		return getShipToStreet2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet2</code> attribute. 
	 * @param value the shipToStreet2
	 */
	public void setShipToStreet2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOSTREET2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet2</code> attribute. 
	 * @param value the shipToStreet2
	 */
	public void setShipToStreet2(final String value)
	{
		setShipToStreet2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet3</code> attribute.
	 * @return the shipToStreet3
	 */
	public String getShipToStreet3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOSTREET3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.shipToStreet3</code> attribute.
	 * @return the shipToStreet3
	 */
	public String getShipToStreet3()
	{
		return getShipToStreet3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet3</code> attribute. 
	 * @param value the shipToStreet3
	 */
	public void setShipToStreet3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOSTREET3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.shipToStreet3</code> attribute. 
	 * @param value the shipToStreet3
	 */
	public void setShipToStreet3(final String value)
	{
		setShipToStreet3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.soldToAccGLN</code> attribute.
	 * @return the soldToAccGLN
	 */
	public String getSoldToAccGLN(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTOACCGLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.soldToAccGLN</code> attribute.
	 * @return the soldToAccGLN
	 */
	public String getSoldToAccGLN()
	{
		return getSoldToAccGLN( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.soldToAccGLN</code> attribute. 
	 * @param value the soldToAccGLN
	 */
	public void setSoldToAccGLN(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTOACCGLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.soldToAccGLN</code> attribute. 
	 * @param value the soldToAccGLN
	 */
	public void setSoldToAccGLN(final String value)
	{
		setSoldToAccGLN( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.soldToAccNum</code> attribute.
	 * @return the soldToAccNum
	 */
	public String getSoldToAccNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTOACCNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.soldToAccNum</code> attribute.
	 * @return the soldToAccNum
	 */
	public String getSoldToAccNum()
	{
		return getSoldToAccNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.soldToAccNum</code> attribute. 
	 * @param value the soldToAccNum
	 */
	public void setSoldToAccNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTOACCNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.soldToAccNum</code> attribute. 
	 * @param value the soldToAccNum
	 */
	public void setSoldToAccNum(final String value)
	{
		setSoldToAccNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoice.taxAmt</code> attribute.
	 * @return the taxAmt
	 */
	public String getTaxAmt()
	{
		return getTaxAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoice.taxAmt</code> attribute. 
	 * @param value the taxAmt
	 */
	public void setTaxAmt(final String value)
	{
		setTaxAmt( getSession().getSessionContext(), value );
	}
	
}
