/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTProductLot}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTProductLot extends GenericItem
{
	/** Qualifier of the <code>JnjGTProductLot.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>JnjGTProductLot.lotNumber</code> attribute **/
	public static final String LOTNUMBER = "lotNumber";
	/** Qualifier of the <code>JnjGTProductLot.companyCode</code> attribute **/
	public static final String COMPANYCODE = "companyCode";
	/** Qualifier of the <code>JnjGTProductLot.expirationDate</code> attribute **/
	public static final String EXPIRATIONDATE = "expirationDate";
	/** Qualifier of the <code>JnjGTProductLot.vendorBatch</code> attribute **/
	public static final String VENDORBATCH = "vendorBatch";
	/** Qualifier of the <code>JnjGTProductLot.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(LOTNUMBER, AttributeMode.INITIAL);
		tmp.put(COMPANYCODE, AttributeMode.INITIAL);
		tmp.put(EXPIRATIONDATE, AttributeMode.INITIAL);
		tmp.put(VENDORBATCH, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.companyCode</code> attribute.
	 * @return the companyCode
	 */
	public String getCompanyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.companyCode</code> attribute.
	 * @return the companyCode
	 */
	public String getCompanyCode()
	{
		return getCompanyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.companyCode</code> attribute. 
	 * @param value the companyCode
	 */
	public void setCompanyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.companyCode</code> attribute. 
	 * @param value the companyCode
	 */
	public void setCompanyCode(final String value)
	{
		setCompanyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.expirationDate</code> attribute.
	 * @return the expirationDate
	 */
	public Date getExpirationDate()
	{
		return getExpirationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.expirationDate</code> attribute. 
	 * @param value the expirationDate
	 */
	public void setExpirationDate(final Date value)
	{
		setExpirationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return getLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final String value)
	{
		setLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VENDORBATCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductLot.vendorBatch</code> attribute.
	 * @return the vendorBatch
	 */
	public String getVendorBatch()
	{
		return getVendorBatch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VENDORBATCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductLot.vendorBatch</code> attribute. 
	 * @param value the vendorBatch
	 */
	public void setVendorBatch(final String value)
	{
		setVendorBatch( getSession().getSessionContext(), value );
	}
	
}
