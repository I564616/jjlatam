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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntListPriceAmt}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntListPriceAmt extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntListPriceAmt.currencyCode</code> attribute **/
	public static final String CURRENCYCODE = "currencyCode";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.srcSysId</code> attribute **/
	public static final String SRCSYSID = "srcSysId";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.listPriceID</code> attribute **/
	public static final String LISTPRICEID = "listPriceID";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.priceUomCode</code> attribute **/
	public static final String PRICEUOMCODE = "priceUomCode";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute **/
	public static final String LISTPRICEAMT = "listPriceAmt";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute **/
	public static final String DELETEINDICATOR = "deleteIndicator";
	/** Qualifier of the <code>JnjGTIntListPriceAmt.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCYCODE, AttributeMode.INITIAL);
		tmp.put(SRCSYSID, AttributeMode.INITIAL);
		tmp.put(LISTPRICEID, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(PRICEUOMCODE, AttributeMode.INITIAL);
		tmp.put(LISTPRICEAMT, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(DELETEINDICATOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.currencyCode</code> attribute.
	 * @return the currencyCode
	 */
	public String getCurrencyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.currencyCode</code> attribute.
	 * @return the currencyCode
	 */
	public String getCurrencyCode()
	{
		return getCurrencyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.currencyCode</code> attribute. 
	 * @param value the currencyCode
	 */
	public void setCurrencyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.currencyCode</code> attribute. 
	 * @param value the currencyCode
	 */
	public void setCurrencyCode(final String value)
	{
		setCurrencyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute.
	 * @return the deleteIndicator
	 */
	public Boolean isDeleteIndicator(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELETEINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute.
	 * @return the deleteIndicator
	 */
	public Boolean isDeleteIndicator()
	{
		return isDeleteIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @return the deleteIndicator
	 */
	public boolean isDeleteIndicatorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeleteIndicator( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @return the deleteIndicator
	 */
	public boolean isDeleteIndicatorAsPrimitive()
	{
		return isDeleteIndicatorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @param value the deleteIndicator
	 */
	public void setDeleteIndicator(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELETEINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @param value the deleteIndicator
	 */
	public void setDeleteIndicator(final Boolean value)
	{
		setDeleteIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @param value the deleteIndicator
	 */
	public void setDeleteIndicator(final SessionContext ctx, final boolean value)
	{
		setDeleteIndicator( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.deleteIndicator</code> attribute. 
	 * @param value the deleteIndicator
	 */
	public void setDeleteIndicator(final boolean value)
	{
		setDeleteIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute.
	 * @return the listPriceAmt
	 */
	public Double getListPriceAmt(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LISTPRICEAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute.
	 * @return the listPriceAmt
	 */
	public Double getListPriceAmt()
	{
		return getListPriceAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @return the listPriceAmt
	 */
	public double getListPriceAmtAsPrimitive(final SessionContext ctx)
	{
		Double value = getListPriceAmt( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @return the listPriceAmt
	 */
	public double getListPriceAmtAsPrimitive()
	{
		return getListPriceAmtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @param value the listPriceAmt
	 */
	public void setListPriceAmt(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LISTPRICEAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @param value the listPriceAmt
	 */
	public void setListPriceAmt(final Double value)
	{
		setListPriceAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @param value the listPriceAmt
	 */
	public void setListPriceAmt(final SessionContext ctx, final double value)
	{
		setListPriceAmt( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceAmt</code> attribute. 
	 * @param value the listPriceAmt
	 */
	public void setListPriceAmt(final double value)
	{
		setListPriceAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceID</code> attribute.
	 * @return the listPriceID
	 */
	public String getListPriceID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LISTPRICEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.listPriceID</code> attribute.
	 * @return the listPriceID
	 */
	public String getListPriceID()
	{
		return getListPriceID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceID</code> attribute. 
	 * @param value the listPriceID
	 */
	public void setListPriceID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LISTPRICEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.listPriceID</code> attribute. 
	 * @param value the listPriceID
	 */
	public void setListPriceID(final String value)
	{
		setListPriceID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.priceUomCode</code> attribute.
	 * @return the priceUomCode
	 */
	public String getPriceUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.priceUomCode</code> attribute.
	 * @return the priceUomCode
	 */
	public String getPriceUomCode()
	{
		return getPriceUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.priceUomCode</code> attribute. 
	 * @param value the priceUomCode
	 */
	public void setPriceUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.priceUomCode</code> attribute. 
	 * @param value the priceUomCode
	 */
	public void setPriceUomCode(final String value)
	{
		setPriceUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPriceAmt.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId()
	{
		return getSrcSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPriceAmt.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final String value)
	{
		setSrcSysId( getSession().getSessionContext(), value );
	}
	
}
