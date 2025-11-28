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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProductLotMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProductLotMaster extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntProductLotMaster.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.lotNumber</code> attribute **/
	public static final String LOTNUMBER = "lotNumber";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.companyCode</code> attribute **/
	public static final String COMPANYCODE = "companyCode";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.expirationDate</code> attribute **/
	public static final String EXPIRATIONDATE = "expirationDate";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.vendorBatch</code> attribute **/
	public static final String VENDORBATCH = "vendorBatch";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.srcSysId</code> attribute **/
	public static final String SRCSYSID = "srcSysId";
	/** Qualifier of the <code>JnjGTIntProductLotMaster.division</code> attribute **/
	public static final String DIVISION = "division";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(LOTNUMBER, AttributeMode.INITIAL);
		tmp.put(COMPANYCODE, AttributeMode.INITIAL);
		tmp.put(EXPIRATIONDATE, AttributeMode.INITIAL);
		tmp.put(VENDORBATCH, AttributeMode.INITIAL);
		tmp.put(SRCSYSID, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.companyCode</code> attribute.
	 * @return the companyCode
	 */
	public String getCompanyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.companyCode</code> attribute.
	 * @return the companyCode
	 */
	public String getCompanyCode()
	{
		return getCompanyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.companyCode</code> attribute. 
	 * @param value the companyCode
	 */
	public void setCompanyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.companyCode</code> attribute. 
	 * @param value the companyCode
	 */
	public void setCompanyCode(final String value)
	{
		setCompanyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate()
	{
		return getExpirationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final Date value)
	{
		setExpirationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return getLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final String value)
	{
		setLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.srcSysId</code> attribute.
	 * @return the srcSysId
	 */
	public String getSrcSysId()
	{
		return getSrcSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.srcSysId</code> attribute. 
	 * @param value the srcSysId
	 */
	public void setSrcSysId(final String value)
	{
		setSrcSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VENDORBATCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductLotMaster.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch()
	{
		return getVendorBatch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VENDORBATCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductLotMaster.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final String value)
	{
		setVendorBatch( getSession().getSessionContext(), value );
	}
	
}
