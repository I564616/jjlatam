/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJInvoiceEntry;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJInvoiceOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJInvoiceOrder extends GenericItem
{
	/** Qualifier of the <code>JnJInvoiceOrder.invDocNo</code> attribute **/
	public static final String INVDOCNO = "invDocNo";
	/** Qualifier of the <code>JnJInvoiceOrder.billType</code> attribute **/
	public static final String BILLTYPE = "billType";
	/** Qualifier of the <code>JnJInvoiceOrder.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>JnJInvoiceOrder.creationDate</code> attribute **/
	public static final String CREATIONDATE = "creationDate";
	/** Qualifier of the <code>JnJInvoiceOrder.soldTo</code> attribute **/
	public static final String SOLDTO = "soldTo";
	/** Qualifier of the <code>JnJInvoiceOrder.payer</code> attribute **/
	public static final String PAYER = "payer";
	/** Qualifier of the <code>JnJInvoiceOrder.poNumber</code> attribute **/
	public static final String PONUMBER = "poNumber";
	/** Qualifier of the <code>JnJInvoiceOrder.region</code> attribute **/
	public static final String REGION = "region";
	/** Qualifier of the <code>JnJInvoiceOrder.nfYear</code> attribute **/
	public static final String NFYEAR = "nfYear";
	/** Qualifier of the <code>JnJInvoiceOrder.nfMonth</code> attribute **/
	public static final String NFMONTH = "nfMonth";
	/** Qualifier of the <code>JnJInvoiceOrder.stcd</code> attribute **/
	public static final String STCD = "stcd";
	/** Qualifier of the <code>JnJInvoiceOrder.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>JnJInvoiceOrder.series</code> attribute **/
	public static final String SERIES = "series";
	/** Qualifier of the <code>JnJInvoiceOrder.nfNumber</code> attribute **/
	public static final String NFNUMBER = "nfNumber";
	/** Qualifier of the <code>JnJInvoiceOrder.docNumber</code> attribute **/
	public static final String DOCNUMBER = "docNumber";
	/** Qualifier of the <code>JnJInvoiceOrder.cdv</code> attribute **/
	public static final String CDV = "cdv";
	/** Qualifier of the <code>JnJInvoiceOrder.billingDoc</code> attribute **/
	public static final String BILLINGDOC = "billingDoc";
	/** Qualifier of the <code>JnJInvoiceOrder.cancelledDocNo</code> attribute **/
	public static final String CANCELLEDDOCNO = "cancelledDocNo";
	/** Qualifier of the <code>JnJInvoiceOrder.entries</code> attribute **/
	public static final String ENTRIES = "entries";
	/** Qualifier of the <code>JnJInvoiceOrder.salesOrder</code> attribute **/
	public static final String SALESORDER = "salesOrder";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INVDOCNO, AttributeMode.INITIAL);
		tmp.put(BILLTYPE, AttributeMode.INITIAL);
		tmp.put(NETVALUE, AttributeMode.INITIAL);
		tmp.put(CREATIONDATE, AttributeMode.INITIAL);
		tmp.put(SOLDTO, AttributeMode.INITIAL);
		tmp.put(PAYER, AttributeMode.INITIAL);
		tmp.put(PONUMBER, AttributeMode.INITIAL);
		tmp.put(REGION, AttributeMode.INITIAL);
		tmp.put(NFYEAR, AttributeMode.INITIAL);
		tmp.put(NFMONTH, AttributeMode.INITIAL);
		tmp.put(STCD, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(SERIES, AttributeMode.INITIAL);
		tmp.put(NFNUMBER, AttributeMode.INITIAL);
		tmp.put(DOCNUMBER, AttributeMode.INITIAL);
		tmp.put(CDV, AttributeMode.INITIAL);
		tmp.put(BILLINGDOC, AttributeMode.INITIAL);
		tmp.put(CANCELLEDDOCNO, AttributeMode.INITIAL);
		tmp.put(ENTRIES, AttributeMode.INITIAL);
		tmp.put(SALESORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.billingDoc</code> attribute.
	 * @return the billingDoc
	 */
	public String getBillingDoc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLINGDOC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.billingDoc</code> attribute.
	 * @return the billingDoc
	 */
	public String getBillingDoc()
	{
		return getBillingDoc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.billingDoc</code> attribute. 
	 * @param value the billingDoc
	 */
	public void setBillingDoc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLINGDOC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.billingDoc</code> attribute. 
	 * @param value the billingDoc
	 */
	public void setBillingDoc(final String value)
	{
		setBillingDoc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.billType</code> attribute.
	 * @return the billType
	 */
	public String getBillType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.billType</code> attribute.
	 * @return the billType
	 */
	public String getBillType()
	{
		return getBillType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.billType</code> attribute. 
	 * @param value the billType
	 */
	public void setBillType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.billType</code> attribute. 
	 * @param value the billType
	 */
	public void setBillType(final String value)
	{
		setBillType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.cancelledDocNo</code> attribute.
	 * @return the cancelledDocNo
	 */
	public String getCancelledDocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CANCELLEDDOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.cancelledDocNo</code> attribute.
	 * @return the cancelledDocNo
	 */
	public String getCancelledDocNo()
	{
		return getCancelledDocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.cancelledDocNo</code> attribute. 
	 * @param value the cancelledDocNo
	 */
	public void setCancelledDocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CANCELLEDDOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.cancelledDocNo</code> attribute. 
	 * @param value the cancelledDocNo
	 */
	public void setCancelledDocNo(final String value)
	{
		setCancelledDocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.cdv</code> attribute.
	 * @return the cdv
	 */
	public String getCdv(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CDV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.cdv</code> attribute.
	 * @return the cdv
	 */
	public String getCdv()
	{
		return getCdv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.cdv</code> attribute. 
	 * @param value the cdv
	 */
	public void setCdv(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CDV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.cdv</code> attribute. 
	 * @param value the cdv
	 */
	public void setCdv(final String value)
	{
		setCdv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public Date getCreationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.creationDate</code> attribute.
	 * @return the creationDate
	 */
	public Date getCreationDate()
	{
		return getCreationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CREATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.creationDate</code> attribute. 
	 * @param value the creationDate
	 */
	public void setCreationDate(final Date value)
	{
		setCreationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.docNumber</code> attribute.
	 * @return the docNumber
	 */
	public String getDocNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.docNumber</code> attribute.
	 * @return the docNumber
	 */
	public String getDocNumber()
	{
		return getDocNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.docNumber</code> attribute. 
	 * @param value the docNumber
	 */
	public void setDocNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.docNumber</code> attribute. 
	 * @param value the docNumber
	 */
	public void setDocNumber(final String value)
	{
		setDocNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.entries</code> attribute.
	 * @return the entries
	 */
	public List<JnJInvoiceEntry> getEntries(final SessionContext ctx)
	{
		List<JnJInvoiceEntry> coll = (List<JnJInvoiceEntry>)getProperty( ctx, ENTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.entries</code> attribute.
	 * @return the entries
	 */
	public List<JnJInvoiceEntry> getEntries()
	{
		return getEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final SessionContext ctx, final List<JnJInvoiceEntry> value)
	{
		setProperty(ctx, ENTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final List<JnJInvoiceEntry> value)
	{
		setEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.invDocNo</code> attribute.
	 * @return the invDocNo
	 */
	public String getInvDocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVDOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.invDocNo</code> attribute.
	 * @return the invDocNo
	 */
	public String getInvDocNo()
	{
		return getInvDocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.invDocNo</code> attribute. 
	 * @param value the invDocNo
	 */
	public void setInvDocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVDOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.invDocNo</code> attribute. 
	 * @param value the invDocNo
	 */
	public void setInvDocNo(final String value)
	{
		setInvDocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.model</code> attribute.
	 * @return the model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.model</code> attribute.
	 * @return the model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.netValue</code> attribute.
	 * @return the netValue
	 */
	public Double getNetValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.netValue</code> attribute.
	 * @return the netValue
	 */
	public Double getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @return the netValue
	 */
	public double getNetValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @return the netValue
	 */
	public double getNetValueAsPrimitive()
	{
		return getNetValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final Double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final SessionContext ctx, final double value)
	{
		setNetValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.netValue</code> attribute. 
	 * @param value the netValue
	 */
	public void setNetValue(final double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfMonth</code> attribute.
	 * @return the nfMonth
	 */
	public String getNfMonth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NFMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfMonth</code> attribute.
	 * @return the nfMonth
	 */
	public String getNfMonth()
	{
		return getNfMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfMonth</code> attribute. 
	 * @param value the nfMonth
	 */
	public void setNfMonth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NFMONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfMonth</code> attribute. 
	 * @param value the nfMonth
	 */
	public void setNfMonth(final String value)
	{
		setNfMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfNumber</code> attribute.
	 * @return the nfNumber
	 */
	public String getNfNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NFNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfNumber</code> attribute.
	 * @return the nfNumber
	 */
	public String getNfNumber()
	{
		return getNfNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfNumber</code> attribute. 
	 * @param value the nfNumber
	 */
	public void setNfNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NFNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfNumber</code> attribute. 
	 * @param value the nfNumber
	 */
	public void setNfNumber(final String value)
	{
		setNfNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfYear</code> attribute.
	 * @return the nfYear
	 */
	public String getNfYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NFYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.nfYear</code> attribute.
	 * @return the nfYear
	 */
	public String getNfYear()
	{
		return getNfYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfYear</code> attribute. 
	 * @param value the nfYear
	 */
	public void setNfYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NFYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.nfYear</code> attribute. 
	 * @param value the nfYear
	 */
	public void setNfYear(final String value)
	{
		setNfYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.payer</code> attribute.
	 * @return the payer
	 */
	public String getPayer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.payer</code> attribute.
	 * @return the payer
	 */
	public String getPayer()
	{
		return getPayer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.payer</code> attribute. 
	 * @param value the payer
	 */
	public void setPayer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.payer</code> attribute. 
	 * @param value the payer
	 */
	public void setPayer(final String value)
	{
		setPayer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.poNumber</code> attribute.
	 * @return the poNumber
	 */
	public String getPoNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.poNumber</code> attribute.
	 * @return the poNumber
	 */
	public String getPoNumber()
	{
		return getPoNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.poNumber</code> attribute. 
	 * @param value the poNumber
	 */
	public void setPoNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.poNumber</code> attribute. 
	 * @param value the poNumber
	 */
	public void setPoNumber(final String value)
	{
		setPoNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.region</code> attribute.
	 * @return the region
	 */
	public String getRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.region</code> attribute.
	 * @return the region
	 */
	public String getRegion()
	{
		return getRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.region</code> attribute. 
	 * @param value the region
	 */
	public void setRegion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.region</code> attribute. 
	 * @param value the region
	 */
	public void setRegion(final String value)
	{
		setRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.salesOrder</code> attribute.
	 * @return the salesOrder
	 */
	public String getSalesOrder(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.salesOrder</code> attribute.
	 * @return the salesOrder
	 */
	public String getSalesOrder()
	{
		return getSalesOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.salesOrder</code> attribute. 
	 * @param value the salesOrder
	 */
	public void setSalesOrder(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.salesOrder</code> attribute. 
	 * @param value the salesOrder
	 */
	public void setSalesOrder(final String value)
	{
		setSalesOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.series</code> attribute.
	 * @return the series
	 */
	public String getSeries(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.series</code> attribute.
	 * @return the series
	 */
	public String getSeries()
	{
		return getSeries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.series</code> attribute. 
	 * @param value the series
	 */
	public void setSeries(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.series</code> attribute. 
	 * @param value the series
	 */
	public void setSeries(final String value)
	{
		setSeries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.soldTo</code> attribute.
	 * @return the soldTo
	 */
	public B2BUnit getSoldTo(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, SOLDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.soldTo</code> attribute.
	 * @return the soldTo
	 */
	public B2BUnit getSoldTo()
	{
		return getSoldTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.soldTo</code> attribute. 
	 * @param value the soldTo
	 */
	public void setSoldTo(final SessionContext ctx, final B2BUnit value)
	{
		setProperty(ctx, SOLDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.soldTo</code> attribute. 
	 * @param value the soldTo
	 */
	public void setSoldTo(final B2BUnit value)
	{
		setSoldTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.stcd</code> attribute.
	 * @return the stcd
	 */
	public String getStcd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceOrder.stcd</code> attribute.
	 * @return the stcd
	 */
	public String getStcd()
	{
		return getStcd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.stcd</code> attribute. 
	 * @param value the stcd
	 */
	public void setStcd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceOrder.stcd</code> attribute. 
	 * @param value the stcd
	 */
	public void setStcd(final String value)
	{
		setStcd( getSession().getSessionContext(), value );
	}
	
}
