/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTInvoiceEntry;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTInvoiceEntryLot}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTInvoiceEntryLot extends GenericItem
{
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.lotNum</code> attribute **/
	public static final String LOTNUM = "lotNum";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.lotQty</code> attribute **/
	public static final String LOTQTY = "lotQty";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.invoiceNum</code> attribute **/
	public static final String INVOICENUM = "invoiceNum";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.invoiceLineNum</code> attribute **/
	public static final String INVOICELINENUM = "invoiceLineNum";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.expDate</code> attribute **/
	public static final String EXPDATE = "expDate";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.vendorBatch</code> attribute **/
	public static final String VENDORBATCH = "vendorBatch";
	/** Qualifier of the <code>JnjGTInvoiceEntryLot.invoiceEntry</code> attribute **/
	public static final String INVOICEENTRY = "invoiceEntry";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVOICEENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTInvoiceEntryLot> INVOICEENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTInvoiceEntryLot>(
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
		tmp.put(LOTNUM, AttributeMode.INITIAL);
		tmp.put(LOTQTY, AttributeMode.INITIAL);
		tmp.put(INVOICENUM, AttributeMode.INITIAL);
		tmp.put(INVOICELINENUM, AttributeMode.INITIAL);
		tmp.put(EXPDATE, AttributeMode.INITIAL);
		tmp.put(VENDORBATCH, AttributeMode.INITIAL);
		tmp.put(INVOICEENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INVOICEENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.expDate</code> attribute.
	 * @return the expDate
	 */
	public Date getExpDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.expDate</code> attribute.
	 * @return the expDate
	 */
	public Date getExpDate()
	{
		return getExpDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.expDate</code> attribute. 
	 * @param value the expDate
	 */
	public void setExpDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.expDate</code> attribute. 
	 * @param value the expDate
	 */
	public void setExpDate(final Date value)
	{
		setExpDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceEntry</code> attribute.
	 * @return the invoiceEntry
	 */
	public JnjGTInvoiceEntry getInvoiceEntry(final SessionContext ctx)
	{
		return (JnjGTInvoiceEntry)getProperty( ctx, INVOICEENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceEntry</code> attribute.
	 * @return the invoiceEntry
	 */
	public JnjGTInvoiceEntry getInvoiceEntry()
	{
		return getInvoiceEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceEntry</code> attribute. 
	 * @param value the invoiceEntry
	 */
	public void setInvoiceEntry(final SessionContext ctx, final JnjGTInvoiceEntry value)
	{
		INVOICEENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceEntry</code> attribute. 
	 * @param value the invoiceEntry
	 */
	public void setInvoiceEntry(final JnjGTInvoiceEntry value)
	{
		setInvoiceEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceLineNum</code> attribute.
	 * @return the invoiceLineNum
	 */
	public String getInvoiceLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICELINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceLineNum</code> attribute.
	 * @return the invoiceLineNum
	 */
	public String getInvoiceLineNum()
	{
		return getInvoiceLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceLineNum</code> attribute. 
	 * @param value the invoiceLineNum
	 */
	public void setInvoiceLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICELINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceLineNum</code> attribute. 
	 * @param value the invoiceLineNum
	 */
	public void setInvoiceLineNum(final String value)
	{
		setInvoiceLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.invoiceNum</code> attribute.
	 * @return the invoiceNum
	 */
	public String getInvoiceNum()
	{
		return getInvoiceNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.invoiceNum</code> attribute. 
	 * @param value the invoiceNum
	 */
	public void setInvoiceNum(final String value)
	{
		setInvoiceNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.lotNum</code> attribute.
	 * @return the lotNum
	 */
	public String getLotNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.lotNum</code> attribute.
	 * @return the lotNum
	 */
	public String getLotNum()
	{
		return getLotNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.lotNum</code> attribute. 
	 * @param value the lotNum
	 */
	public void setLotNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.lotNum</code> attribute. 
	 * @param value the lotNum
	 */
	public void setLotNum(final String value)
	{
		setLotNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.lotQty</code> attribute.
	 * @return the lotQty
	 */
	public String getLotQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.lotQty</code> attribute.
	 * @return the lotQty
	 */
	public String getLotQty()
	{
		return getLotQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.lotQty</code> attribute. 
	 * @param value the lotQty
	 */
	public void setLotQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.lotQty</code> attribute. 
	 * @param value the lotQty
	 */
	public void setLotQty(final String value)
	{
		setLotQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VENDORBATCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTInvoiceEntryLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch()
	{
		return getVendorBatch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VENDORBATCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTInvoiceEntryLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final String value)
	{
		setVendorBatch( getSession().getSessionContext(), value );
	}
	
}
