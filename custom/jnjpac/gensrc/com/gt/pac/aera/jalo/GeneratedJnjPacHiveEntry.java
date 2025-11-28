/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.gt.pac.aera.jalo;

import com.gt.pac.aera.constants.Jnjgtb2bpacConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjPacHiveEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPacHiveEntry extends GenericItem
{
	/** Qualifier of the <code>JnjPacHiveEntry.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>JnjPacHiveEntry.orderType</code> attribute **/
	public static final String ORDERTYPE = "orderType";
	/** Qualifier of the <code>JnjPacHiveEntry.orderNumber</code> attribute **/
	public static final String ORDERNUMBER = "orderNumber";
	/** Qualifier of the <code>JnjPacHiveEntry.lineNumber</code> attribute **/
	public static final String LINENUMBER = "lineNumber";
	/** Qualifier of the <code>JnjPacHiveEntry.schedLineNumber</code> attribute **/
	public static final String SCHEDLINENUMBER = "schedLineNumber";
	/** Qualifier of the <code>JnjPacHiveEntry.catalogCode</code> attribute **/
	public static final String CATALOGCODE = "catalogCode";
	/** Qualifier of the <code>JnjPacHiveEntry.dataSource</code> attribute **/
	public static final String DATASOURCE = "dataSource";
	/** Qualifier of the <code>JnjPacHiveEntry.recommendedDeliveryDate</code> attribute **/
	public static final String RECOMMENDEDDELIVERYDATE = "recommendedDeliveryDate";
	/** Qualifier of the <code>JnjPacHiveEntry.convertedRecommendedDeliveryDate</code> attribute **/
	public static final String CONVERTEDRECOMMENDEDDELIVERYDATE = "convertedRecommendedDeliveryDate";
	/** Qualifier of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute **/
	public static final String CONFIRMEDQUANTITY = "confirmedQuantity";
	/** Qualifier of the <code>JnjPacHiveEntry.subFranchise</code> attribute **/
	public static final String SUBFRANCHISE = "subFranchise";
	/** Qualifier of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute **/
	public static final String REQUESTEDUNITSTOTALQUANTITY = "requestedUnitsTotalQuantity";
	/** Qualifier of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute **/
	public static final String AMOUNTPENDINGDELIVERY = "amountPendingDelivery";
	/** Qualifier of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute **/
	public static final String QUANTITYPENDINGSTOCK = "quantityPendingStock";
	/** Qualifier of the <code>JnjPacHiveEntry.orderEntry</code> attribute **/
	public static final String ORDERENTRY = "orderEntry";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDERENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjPacHiveEntry> ORDERENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjPacHiveEntry>(
	Jnjgtb2bpacConstants.TC.JNJPACHIVEENTRY,
	false,
	"orderEntry",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(ORDERTYPE, AttributeMode.INITIAL);
		tmp.put(ORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(LINENUMBER, AttributeMode.INITIAL);
		tmp.put(SCHEDLINENUMBER, AttributeMode.INITIAL);
		tmp.put(CATALOGCODE, AttributeMode.INITIAL);
		tmp.put(DATASOURCE, AttributeMode.INITIAL);
		tmp.put(RECOMMENDEDDELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(CONVERTEDRECOMMENDEDDELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(CONFIRMEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(SUBFRANCHISE, AttributeMode.INITIAL);
		tmp.put(REQUESTEDUNITSTOTALQUANTITY, AttributeMode.INITIAL);
		tmp.put(AMOUNTPENDINGDELIVERY, AttributeMode.INITIAL);
		tmp.put(QUANTITYPENDINGSTOCK, AttributeMode.INITIAL);
		tmp.put(ORDERENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute.
	 * @return the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public Double getAmountPendingDelivery(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTPENDINGDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute.
	 * @return the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public Double getAmountPendingDelivery()
	{
		return getAmountPendingDelivery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @return the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public double getAmountPendingDeliveryAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountPendingDelivery( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @return the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public double getAmountPendingDeliveryAsPrimitive()
	{
		return getAmountPendingDeliveryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @param value the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public void setAmountPendingDelivery(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTPENDINGDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @param value the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public void setAmountPendingDelivery(final Double value)
	{
		setAmountPendingDelivery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @param value the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public void setAmountPendingDelivery(final SessionContext ctx, final double value)
	{
		setAmountPendingDelivery( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.amountPendingDelivery</code> attribute. 
	 * @param value the amountPendingDelivery - The original value of "Open Order Qty" field received from AERA.
	 */
	public void setAmountPendingDelivery(final double value)
	{
		setAmountPendingDelivery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.catalogCode</code> attribute.
	 * @return the catalogCode - The original value of "catalogCode" field received from AERA.
	 */
	public String getCatalogCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATALOGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.catalogCode</code> attribute.
	 * @return the catalogCode - The original value of "catalogCode" field received from AERA.
	 */
	public String getCatalogCode()
	{
		return getCatalogCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.catalogCode</code> attribute. 
	 * @param value the catalogCode - The original value of "catalogCode" field received from AERA.
	 */
	public void setCatalogCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATALOGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.catalogCode</code> attribute. 
	 * @param value the catalogCode - The original value of "catalogCode" field received from AERA.
	 */
	public void setCatalogCode(final String value)
	{
		setCatalogCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.company</code> attribute.
	 * @return the company - The original value of "company" field received from AERA.
	 */
	public String getCompany(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.company</code> attribute.
	 * @return the company - The original value of "company" field received from AERA.
	 */
	public String getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.company</code> attribute. 
	 * @param value the company - The original value of "company" field received from AERA.
	 */
	public void setCompany(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.company</code> attribute. 
	 * @param value the company - The original value of "company" field received from AERA.
	 */
	public void setCompany(final String value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute.
	 * @return the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public Double getConfirmedQuantity(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CONFIRMEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute.
	 * @return the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public Double getConfirmedQuantity()
	{
		return getConfirmedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @return the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public double getConfirmedQuantityAsPrimitive(final SessionContext ctx)
	{
		Double value = getConfirmedQuantity( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @return the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public double getConfirmedQuantityAsPrimitive()
	{
		return getConfirmedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @param value the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public void setConfirmedQuantity(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CONFIRMEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @param value the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public void setConfirmedQuantity(final Double value)
	{
		setConfirmedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @param value the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public void setConfirmedQuantity(final SessionContext ctx, final double value)
	{
		setConfirmedQuantity( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.confirmedQuantity</code> attribute. 
	 * @param value the confirmedQuantity - The original value of "open confirmed quantity" field received from AERA.
	 */
	public void setConfirmedQuantity(final double value)
	{
		setConfirmedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.convertedRecommendedDeliveryDate</code> attribute.
	 * @return the convertedRecommendedDeliveryDate - Date created by converting the original "recommendedDeliveryDate" field received from AERA.
	 */
	public Date getConvertedRecommendedDeliveryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONVERTEDRECOMMENDEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.convertedRecommendedDeliveryDate</code> attribute.
	 * @return the convertedRecommendedDeliveryDate - Date created by converting the original "recommendedDeliveryDate" field received from AERA.
	 */
	public Date getConvertedRecommendedDeliveryDate()
	{
		return getConvertedRecommendedDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.convertedRecommendedDeliveryDate</code> attribute. 
	 * @param value the convertedRecommendedDeliveryDate - Date created by converting the original "recommendedDeliveryDate" field received from AERA.
	 */
	public void setConvertedRecommendedDeliveryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONVERTEDRECOMMENDEDDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.convertedRecommendedDeliveryDate</code> attribute. 
	 * @param value the convertedRecommendedDeliveryDate - Date created by converting the original "recommendedDeliveryDate" field received from AERA.
	 */
	public void setConvertedRecommendedDeliveryDate(final Date value)
	{
		setConvertedRecommendedDeliveryDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.dataSource</code> attribute.
	 * @return the dataSource - The original value of "dataSource" field received from AERA.
	 */
	public String getDataSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATASOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.dataSource</code> attribute.
	 * @return the dataSource - The original value of "dataSource" field received from AERA.
	 */
	public String getDataSource()
	{
		return getDataSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.dataSource</code> attribute. 
	 * @param value the dataSource - The original value of "dataSource" field received from AERA.
	 */
	public void setDataSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DATASOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.dataSource</code> attribute. 
	 * @param value the dataSource - The original value of "dataSource" field received from AERA.
	 */
	public void setDataSource(final String value)
	{
		setDataSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.lineNumber</code> attribute.
	 * @return the lineNumber - The original value of "lineNumber" field received from AERA.
	 */
	public String getLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.lineNumber</code> attribute.
	 * @return the lineNumber - The original value of "lineNumber" field received from AERA.
	 */
	public String getLineNumber()
	{
		return getLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.lineNumber</code> attribute. 
	 * @param value the lineNumber - The original value of "lineNumber" field received from AERA.
	 */
	public void setLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.lineNumber</code> attribute. 
	 * @param value the lineNumber - The original value of "lineNumber" field received from AERA.
	 */
	public void setLineNumber(final String value)
	{
		setLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderEntry</code> attribute.
	 * @return the orderEntry - Link to the order entry associated with this PAC HIVE record.
	 */
	public AbstractOrderEntry getOrderEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, ORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderEntry</code> attribute.
	 * @return the orderEntry - Link to the order entry associated with this PAC HIVE record.
	 */
	public AbstractOrderEntry getOrderEntry()
	{
		return getOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderEntry</code> attribute. 
	 * @param value the orderEntry - Link to the order entry associated with this PAC HIVE record.
	 */
	public void setOrderEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		ORDERENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderEntry</code> attribute. 
	 * @param value the orderEntry - Link to the order entry associated with this PAC HIVE record.
	 */
	public void setOrderEntry(final AbstractOrderEntry value)
	{
		setOrderEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderNumber</code> attribute.
	 * @return the orderNumber - The original value of "orderNumber" field received from AERA.
	 */
	public String getOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderNumber</code> attribute.
	 * @return the orderNumber - The original value of "orderNumber" field received from AERA.
	 */
	public String getOrderNumber()
	{
		return getOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderNumber</code> attribute. 
	 * @param value the orderNumber - The original value of "orderNumber" field received from AERA.
	 */
	public void setOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderNumber</code> attribute. 
	 * @param value the orderNumber - The original value of "orderNumber" field received from AERA.
	 */
	public void setOrderNumber(final String value)
	{
		setOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderType</code> attribute.
	 * @return the orderType - The original value of "orderType" field received from AERA.
	 */
	public String getOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.orderType</code> attribute.
	 * @return the orderType - The original value of "orderType" field received from AERA.
	 */
	public String getOrderType()
	{
		return getOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderType</code> attribute. 
	 * @param value the orderType - The original value of "orderType" field received from AERA.
	 */
	public void setOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.orderType</code> attribute. 
	 * @param value the orderType - The original value of "orderType" field received from AERA.
	 */
	public void setOrderType(final String value)
	{
		setOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute.
	 * @return the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public Double getQuantityPendingStock(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, QUANTITYPENDINGSTOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute.
	 * @return the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public Double getQuantityPendingStock()
	{
		return getQuantityPendingStock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @return the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public double getQuantityPendingStockAsPrimitive(final SessionContext ctx)
	{
		Double value = getQuantityPendingStock( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @return the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public double getQuantityPendingStockAsPrimitive()
	{
		return getQuantityPendingStockAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @param value the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public void setQuantityPendingStock(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, QUANTITYPENDINGSTOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @param value the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public void setQuantityPendingStock(final Double value)
	{
		setQuantityPendingStock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @param value the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public void setQuantityPendingStock(final SessionContext ctx, final double value)
	{
		setQuantityPendingStock( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.quantityPendingStock</code> attribute. 
	 * @param value the quantityPendingStock - The original value of "Current Bo Qty" field received from AERA.
	 */
	public void setQuantityPendingStock(final double value)
	{
		setQuantityPendingStock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.recommendedDeliveryDate</code> attribute.
	 * @return the recommendedDeliveryDate - The original value of "recommendedDeliveryDate" field received from AERA.
	 */
	public String getRecommendedDeliveryDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECOMMENDEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.recommendedDeliveryDate</code> attribute.
	 * @return the recommendedDeliveryDate - The original value of "recommendedDeliveryDate" field received from AERA.
	 */
	public String getRecommendedDeliveryDate()
	{
		return getRecommendedDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.recommendedDeliveryDate</code> attribute. 
	 * @param value the recommendedDeliveryDate - The original value of "recommendedDeliveryDate" field received from AERA.
	 */
	public void setRecommendedDeliveryDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECOMMENDEDDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.recommendedDeliveryDate</code> attribute. 
	 * @param value the recommendedDeliveryDate - The original value of "recommendedDeliveryDate" field received from AERA.
	 */
	public void setRecommendedDeliveryDate(final String value)
	{
		setRecommendedDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute.
	 * @return the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public Double getRequestedUnitsTotalQuantity(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, REQUESTEDUNITSTOTALQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute.
	 * @return the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public Double getRequestedUnitsTotalQuantity()
	{
		return getRequestedUnitsTotalQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @return the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public double getRequestedUnitsTotalQuantityAsPrimitive(final SessionContext ctx)
	{
		Double value = getRequestedUnitsTotalQuantity( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @return the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public double getRequestedUnitsTotalQuantityAsPrimitive()
	{
		return getRequestedUnitsTotalQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @param value the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public void setRequestedUnitsTotalQuantity(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, REQUESTEDUNITSTOTALQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @param value the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public void setRequestedUnitsTotalQuantity(final Double value)
	{
		setRequestedUnitsTotalQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @param value the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public void setRequestedUnitsTotalQuantity(final SessionContext ctx, final double value)
	{
		setRequestedUnitsTotalQuantity( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.requestedUnitsTotalQuantity</code> attribute. 
	 * @param value the requestedUnitsTotalQuantity - The original value of "Order Qty Sales Units" field received from AERA.
	 */
	public void setRequestedUnitsTotalQuantity(final double value)
	{
		setRequestedUnitsTotalQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.schedLineNumber</code> attribute.
	 * @return the schedLineNumber - The original value of "schedLineNumber" field received from AERA.
	 */
	public String getSchedLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCHEDLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.schedLineNumber</code> attribute.
	 * @return the schedLineNumber - The original value of "schedLineNumber" field received from AERA.
	 */
	public String getSchedLineNumber()
	{
		return getSchedLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.schedLineNumber</code> attribute. 
	 * @param value the schedLineNumber - The original value of "schedLineNumber" field received from AERA.
	 */
	public void setSchedLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCHEDLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.schedLineNumber</code> attribute. 
	 * @param value the schedLineNumber - The original value of "schedLineNumber" field received from AERA.
	 */
	public void setSchedLineNumber(final String value)
	{
		setSchedLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.subFranchise</code> attribute.
	 * @return the subFranchise - The original value of "Jnj Subfranchise Description Harmonized" field received from AERA.
	 */
	public String getSubFranchise(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBFRANCHISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPacHiveEntry.subFranchise</code> attribute.
	 * @return the subFranchise - The original value of "Jnj Subfranchise Description Harmonized" field received from AERA.
	 */
	public String getSubFranchise()
	{
		return getSubFranchise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.subFranchise</code> attribute. 
	 * @param value the subFranchise - The original value of "Jnj Subfranchise Description Harmonized" field received from AERA.
	 */
	public void setSubFranchise(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBFRANCHISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPacHiveEntry.subFranchise</code> attribute. 
	 * @param value the subFranchise - The original value of "Jnj Subfranchise Description Harmonized" field received from AERA.
	 */
	public void setSubFranchise(final String value)
	{
		setSubFranchise( getSession().getSessionContext(), value );
	}
	
}
