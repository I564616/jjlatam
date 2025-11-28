/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrdLinePriceLocal}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrdLinePriceLocal extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.sapOrderLineNumber</code> attribute **/
	public static final String SAPORDERLINENUMBER = "sapOrderLineNumber";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionType</code> attribute **/
	public static final String PRICINGCONDITIONTYPE = "pricingConditionType";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionName</code> attribute **/
	public static final String PRICINGCONDITIONNAME = "pricingConditionName";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.unitPrice</code> attribute **/
	public static final String UNITPRICE = "unitPrice";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.currencyForUp</code> attribute **/
	public static final String CURRENCYFORUP = "currencyForUp";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.currencyForCv</code> attribute **/
	public static final String CURRENCYFORCV = "currencyForCv";
	/** Qualifier of the <code>JnjGTIntOrdLinePriceLocal.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUMBER, AttributeMode.INITIAL);
		tmp.put(PRICINGCONDITIONTYPE, AttributeMode.INITIAL);
		tmp.put(PRICINGCONDITIONNAME, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(UNITPRICE, AttributeMode.INITIAL);
		tmp.put(CURRENCYFORUP, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCYFORCV, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final String value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currencyForCv</code> attribute.
	 * @return the currencyForCv
	 */
	public String getCurrencyForCv(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCYFORCV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currencyForCv</code> attribute.
	 * @return the currencyForCv
	 */
	public String getCurrencyForCv()
	{
		return getCurrencyForCv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currencyForCv</code> attribute. 
	 * @param value the currencyForCv
	 */
	public void setCurrencyForCv(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCYFORCV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currencyForCv</code> attribute. 
	 * @param value the currencyForCv
	 */
	public void setCurrencyForCv(final String value)
	{
		setCurrencyForCv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currencyForUp</code> attribute.
	 * @return the currencyForUp
	 */
	public String getCurrencyForUp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCYFORUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.currencyForUp</code> attribute.
	 * @return the currencyForUp
	 */
	public String getCurrencyForUp()
	{
		return getCurrencyForUp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currencyForUp</code> attribute. 
	 * @param value the currencyForUp
	 */
	public void setCurrencyForUp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCYFORUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.currencyForUp</code> attribute. 
	 * @param value the currencyForUp
	 */
	public void setCurrencyForUp(final String value)
	{
		setCurrencyForUp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionName</code> attribute.
	 * @return the pricingConditionName
	 */
	public String getPricingConditionName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICINGCONDITIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionName</code> attribute.
	 * @return the pricingConditionName
	 */
	public String getPricingConditionName()
	{
		return getPricingConditionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionName</code> attribute. 
	 * @param value the pricingConditionName
	 */
	public void setPricingConditionName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICINGCONDITIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionName</code> attribute. 
	 * @param value the pricingConditionName
	 */
	public void setPricingConditionName(final String value)
	{
		setPricingConditionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionType</code> attribute.
	 * @return the pricingConditionType
	 */
	public String getPricingConditionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICINGCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionType</code> attribute.
	 * @return the pricingConditionType
	 */
	public String getPricingConditionType()
	{
		return getPricingConditionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionType</code> attribute. 
	 * @param value the pricingConditionType
	 */
	public void setPricingConditionType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICINGCONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.pricingConditionType</code> attribute. 
	 * @param value the pricingConditionType
	 */
	public void setPricingConditionType(final String value)
	{
		setPricingConditionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber()
	{
		return getSapOrderLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final String value)
	{
		setSapOrderLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public String getUnitPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNITPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public String getUnitPrice()
	{
		return getUnitPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNITPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final String value)
	{
		setUnitPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.value</code> attribute.
	 * @return the value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLinePriceLocal.value</code> attribute.
	 * @return the value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLinePriceLocal.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
