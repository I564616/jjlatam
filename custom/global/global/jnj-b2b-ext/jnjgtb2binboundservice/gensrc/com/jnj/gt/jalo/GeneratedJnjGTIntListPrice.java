/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntListPrice}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntListPrice extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntListPrice.srcSysId</code> attribute **/
	public static final String SRCSYSID = "srcSysId";
	/** Qualifier of the <code>JnjGTIntListPrice.listPriceID</code> attribute **/
	public static final String LISTPRICEID = "listPriceID";
	/** Qualifier of the <code>JnjGTIntListPrice.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntListPrice.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>JnjGTIntListPrice.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>JnjGTIntListPrice.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnjGTIntListPrice.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntListPrice.priceTypeCode</code> attribute **/
	public static final String PRICETYPECODE = "priceTypeCode";
	/** Qualifier of the <code>JnjGTIntListPrice.priceBook</code> attribute **/
	public static final String PRICEBOOK = "priceBook";
	/** Qualifier of the <code>JnjGTIntListPrice.customerGroup</code> attribute **/
	public static final String CUSTOMERGROUP = "customerGroup";
	/** Qualifier of the <code>JnjGTIntListPrice.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>JnjGTIntListPrice.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTIntListPrice.recTimestamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SRCSYSID, AttributeMode.INITIAL);
		tmp.put(LISTPRICEID, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(PRICETYPECODE, AttributeMode.INITIAL);
		tmp.put(PRICEBOOK, AttributeMode.INITIAL);
		tmp.put(CUSTOMERGROUP, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.customerGroup</code> attribute.
	 * @return the customerGroup
	 */
	public String getCustomerGroup()
	{
		return getCustomerGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.customerGroup</code> attribute. 
	 * @param value the customerGroup
	 */
	public void setCustomerGroup(final String value)
	{
		setCustomerGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.listPriceID</code> attribute.
	 * @return the listPriceID
	 */
	public String getListPriceID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LISTPRICEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.listPriceID</code> attribute.
	 * @return the listPriceID
	 */
	public String getListPriceID()
	{
		return getListPriceID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.listPriceID</code> attribute. 
	 * @param value the listPriceID
	 */
	public void setListPriceID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LISTPRICEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.listPriceID</code> attribute. 
	 * @param value the listPriceID
	 */
	public void setListPriceID(final String value)
	{
		setListPriceID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEBOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook()
	{
		return getPriceBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEBOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final String value)
	{
		setPriceBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.priceTypeCode</code> attribute.
	 * @return the priceTypeCode
	 */
	public String getPriceTypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICETYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.priceTypeCode</code> attribute.
	 * @return the priceTypeCode
	 */
	public String getPriceTypeCode()
	{
		return getPriceTypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.priceTypeCode</code> attribute. 
	 * @param value the priceTypeCode
	 */
	public void setPriceTypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICETYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.priceTypeCode</code> attribute. 
	 * @param value the priceTypeCode
	 */
	public void setPriceTypeCode(final String value)
	{
		setPriceTypeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.recTimestamp</code> attribute.
	 * @return the recTimestamp
	 */
	public Date getRecTimestamp()
	{
		return getRecTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.recTimestamp</code> attribute. 
	 * @param value the recTimestamp
	 */
	public void setRecTimestamp(final Date value)
	{
		setRecTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId()
	{
		return getSrcSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final String value)
	{
		setSrcSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntListPrice.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntListPrice.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
