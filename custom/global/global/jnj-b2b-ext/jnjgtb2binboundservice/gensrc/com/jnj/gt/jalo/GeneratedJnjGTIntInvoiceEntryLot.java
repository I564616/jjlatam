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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntInvoiceEntryLot}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntInvoiceEntryLot extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.lotNum</code> attribute **/
	public static final String LOTNUM = "lotNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.lotQty</code> attribute **/
	public static final String LOTQTY = "lotQty";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.lineItemNum</code> attribute **/
	public static final String LINEITEMNUM = "lineItemNum";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.expiryDate</code> attribute **/
	public static final String EXPIRYDATE = "expiryDate";
	/** Qualifier of the <code>JnjGTIntInvoiceEntryLot.vendorBatch</code> attribute **/
	public static final String VENDORBATCH = "vendorBatch";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(LOTNUM, AttributeMode.INITIAL);
		tmp.put(LOTQTY, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(LINEITEMNUM, AttributeMode.INITIAL);
		tmp.put(EXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(VENDORBATCH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate()
	{
		return getExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final Date value)
	{
		setExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lineItemNum</code> attribute.
	 * @return the lineItemNum
	 */
	public String getLineItemNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINEITEMNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lineItemNum</code> attribute.
	 * @return the lineItemNum
	 */
	public String getLineItemNum()
	{
		return getLineItemNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lineItemNum</code> attribute. 
	 * @param value the lineItemNum
	 */
	public void setLineItemNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINEITEMNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lineItemNum</code> attribute. 
	 * @param value the lineItemNum
	 */
	public void setLineItemNum(final String value)
	{
		setLineItemNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lotNum</code> attribute.
	 * @return the lotNum
	 */
	public String getLotNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lotNum</code> attribute.
	 * @return the lotNum
	 */
	public String getLotNum()
	{
		return getLotNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lotNum</code> attribute. 
	 * @param value the lotNum
	 */
	public void setLotNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lotNum</code> attribute. 
	 * @param value the lotNum
	 */
	public void setLotNum(final String value)
	{
		setLotNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lotQty</code> attribute.
	 * @return the lotQty
	 */
	public String getLotQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.lotQty</code> attribute.
	 * @return the lotQty
	 */
	public String getLotQty()
	{
		return getLotQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lotQty</code> attribute. 
	 * @param value the lotQty
	 */
	public void setLotQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.lotQty</code> attribute. 
	 * @param value the lotQty
	 */
	public void setLotQty(final String value)
	{
		setLotQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VENDORBATCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntInvoiceEntryLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch()
	{
		return getVendorBatch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VENDORBATCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntInvoiceEntryLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final String value)
	{
		setVendorBatch( getSession().getSessionContext(), value );
	}
	
}
