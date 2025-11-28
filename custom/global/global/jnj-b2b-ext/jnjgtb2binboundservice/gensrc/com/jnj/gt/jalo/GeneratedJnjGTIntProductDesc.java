/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProductDesc}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProductDesc extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntProductDesc.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnjGTIntProductDesc.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntProductDesc.productDesc</code> attribute **/
	public static final String PRODUCTDESC = "productDesc";
	/** Qualifier of the <code>JnjGTIntProductDesc.languageCode</code> attribute **/
	public static final String LANGUAGECODE = "languageCode";
	/** Qualifier of the <code>JnjGTIntProductDesc.languageName</code> attribute **/
	public static final String LANGUAGENAME = "languageName";
	/** Qualifier of the <code>JnjGTIntProductDesc.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntProductDesc.regionCode</code> attribute **/
	public static final String REGIONCODE = "regionCode";
	/** Qualifier of the <code>JnjGTIntProductDesc.salesOrgCompCde</code> attribute **/
	public static final String SALESORGCOMPCDE = "salesOrgCompCde";
	/** Qualifier of the <code>JnjGTIntProductDesc.salesOrgDivision</code> attribute **/
	public static final String SALESORGDIVISION = "salesOrgDivision";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTDESC, AttributeMode.INITIAL);
		tmp.put(LANGUAGECODE, AttributeMode.INITIAL);
		tmp.put(LANGUAGENAME, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(REGIONCODE, AttributeMode.INITIAL);
		tmp.put(SALESORGCOMPCDE, AttributeMode.INITIAL);
		tmp.put(SALESORGDIVISION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.languageCode</code> attribute.
	 * @return the languageCode
	 */
	public String getLanguageCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LANGUAGECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.languageCode</code> attribute.
	 * @return the languageCode
	 */
	public String getLanguageCode()
	{
		return getLanguageCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.languageCode</code> attribute. 
	 * @param value the languageCode
	 */
	public void setLanguageCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LANGUAGECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.languageCode</code> attribute. 
	 * @param value the languageCode
	 */
	public void setLanguageCode(final String value)
	{
		setLanguageCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.languageName</code> attribute.
	 * @return the languageName
	 */
	public String getLanguageName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LANGUAGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.languageName</code> attribute.
	 * @return the languageName
	 */
	public String getLanguageName()
	{
		return getLanguageName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.languageName</code> attribute. 
	 * @param value the languageName
	 */
	public void setLanguageName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LANGUAGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.languageName</code> attribute. 
	 * @param value the languageName
	 */
	public void setLanguageName(final String value)
	{
		setLanguageName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.productDesc</code> attribute.
	 * @return the productDesc
	 */
	public String getProductDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.productDesc</code> attribute.
	 * @return the productDesc
	 */
	public String getProductDesc()
	{
		return getProductDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.productDesc</code> attribute. 
	 * @param value the productDesc
	 */
	public void setProductDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.productDesc</code> attribute. 
	 * @param value the productDesc
	 */
	public void setProductDesc(final String value)
	{
		setProductDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode()
	{
		return getRegionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final String value)
	{
		setRegionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.salesOrgCompCde</code> attribute.
	 * @return the salesOrgCompCde
	 */
	public String getSalesOrgCompCde(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGCOMPCDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.salesOrgCompCde</code> attribute.
	 * @return the salesOrgCompCde
	 */
	public String getSalesOrgCompCde()
	{
		return getSalesOrgCompCde( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.salesOrgCompCde</code> attribute. 
	 * @param value the salesOrgCompCde
	 */
	public void setSalesOrgCompCde(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGCOMPCDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.salesOrgCompCde</code> attribute. 
	 * @param value the salesOrgCompCde
	 */
	public void setSalesOrgCompCde(final String value)
	{
		setSalesOrgCompCde( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.salesOrgDivision</code> attribute.
	 * @return the salesOrgDivision
	 */
	public String getSalesOrgDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.salesOrgDivision</code> attribute.
	 * @return the salesOrgDivision
	 */
	public String getSalesOrgDivision()
	{
		return getSalesOrgDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.salesOrgDivision</code> attribute. 
	 * @param value the salesOrgDivision
	 */
	public void setSalesOrgDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.salesOrgDivision</code> attribute. 
	 * @param value the salesOrgDivision
	 */
	public void setSalesOrgDivision(final String value)
	{
		setSalesOrgDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductDesc.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductDesc.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
}
