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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProduct extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntProduct.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnjGTIntProduct.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTIntProduct.materialNum</code> attribute **/
	public static final String MATERIALNUM = "materialNum";
	/** Qualifier of the <code>JnjGTIntProduct.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>JnjGTIntProduct.productModCode</code> attribute **/
	public static final String PRODUCTMODCODE = "productModCode";
	/** Qualifier of the <code>JnjGTIntProduct.productStatus</code> attribute **/
	public static final String PRODUCTSTATUS = "productStatus";
	/** Qualifier of the <code>JnjGTIntProduct.minorProdGrpCd</code> attribute **/
	public static final String MINORPRODGRPCD = "minorProdGrpCd";
	/** Qualifier of the <code>JnjGTIntProduct.ghexInd</code> attribute **/
	public static final String GHEXIND = "ghexInd";
	/** Qualifier of the <code>JnjGTIntProduct.hazmatCode</code> attribute **/
	public static final String HAZMATCODE = "hazmatCode";
	/** Qualifier of the <code>JnjGTIntProduct.francMjrPrdGrpCd</code> attribute **/
	public static final String FRANCMJRPRDGRPCD = "francMjrPrdGrpCd";
	/** Qualifier of the <code>JnjGTIntProduct.salesOrgCode</code> attribute **/
	public static final String SALESORGCODE = "salesOrgCode";
	/** Qualifier of the <code>JnjGTIntProduct.legacyProductCode</code> attribute **/
	public static final String LEGACYPRODUCTCODE = "legacyProductCode";
	/** Qualifier of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute **/
	public static final String JNJPORTALIND = "jnjPortalInd";
	/** Qualifier of the <code>JnjGTIntProduct.franchiseCode</code> attribute **/
	public static final String FRANCHISECODE = "franchiseCode";
	/** Qualifier of the <code>JnjGTIntProduct.franchiseName</code> attribute **/
	public static final String FRANCHISENAME = "franchiseName";
	/** Qualifier of the <code>JnjGTIntProduct.categoryCode</code> attribute **/
	public static final String CATEGORYCODE = "categoryCode";
	/** Qualifier of the <code>JnjGTIntProduct.categoryName</code> attribute **/
	public static final String CATEGORYNAME = "categoryName";
	/** Qualifier of the <code>JnjGTIntProduct.brandCode</code> attribute **/
	public static final String BRANDCODE = "brandCode";
	/** Qualifier of the <code>JnjGTIntProduct.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	/** Qualifier of the <code>JnjGTIntProduct.subBrandCode</code> attribute **/
	public static final String SUBBRANDCODE = "subBrandCode";
	/** Qualifier of the <code>JnjGTIntProduct.subBrandName</code> attribute **/
	public static final String SUBBRANDNAME = "subBrandName";
	/** Qualifier of the <code>JnjGTIntProduct.functionNameCd</code> attribute **/
	public static final String FUNCTIONNAMECD = "functionNameCd";
	/** Qualifier of the <code>JnjGTIntProduct.functionName</code> attribute **/
	public static final String FUNCTIONNAME = "functionName";
	/** Qualifier of the <code>JnjGTIntProduct.mfgCompCode</code> attribute **/
	public static final String MFGCOMPCODE = "mfgCompCode";
	/** Qualifier of the <code>JnjGTIntProduct.deaRegInd</code> attribute **/
	public static final String DEAREGIND = "deaRegInd";
	/** Qualifier of the <code>JnjGTIntProduct.firstShipEffectDate</code> attribute **/
	public static final String FIRSTSHIPEFFECTDATE = "firstShipEffectDate";
	/** Qualifier of the <code>JnjGTIntProduct.publishInd</code> attribute **/
	public static final String PUBLISHIND = "publishInd";
	/** Qualifier of the <code>JnjGTIntProduct.materialBaseNum</code> attribute **/
	public static final String MATERIALBASENUM = "materialBaseNum";
	/** Qualifier of the <code>JnjGTIntProduct.baseUom</code> attribute **/
	public static final String BASEUOM = "baseUom";
	/** Qualifier of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute **/
	public static final String USAOTCREADYIND = "usaOtcReadyInd";
	/** Qualifier of the <code>JnjGTIntProduct.eCatalogDesciption</code> attribute **/
	public static final String ECATALOGDESCIPTION = "eCatalogDesciption";
	/** Qualifier of the <code>JnjGTIntProduct.eCatalogLongDesciption</code> attribute **/
	public static final String ECATALOGLONGDESCIPTION = "eCatalogLongDesciption";
	/** Qualifier of the <code>JnjGTIntProduct.newProductStartDate</code> attribute **/
	public static final String NEWPRODUCTSTARTDATE = "newProductStartDate";
	/** Qualifier of the <code>JnjGTIntProduct.materialStatusEffectDate</code> attribute **/
	public static final String MATERIALSTATUSEFFECTDATE = "materialStatusEffectDate";
	/** Qualifier of the <code>JnjGTIntProduct.kitInd</code> attribute **/
	public static final String KITIND = "kitInd";
	/** Qualifier of the <code>JnjGTIntProduct.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	/** Qualifier of the <code>JnjGTIntProduct.globalBusinessUnit</code> attribute **/
	public static final String GLOBALBUSINESSUNIT = "globalBusinessUnit";
	/** Qualifier of the <code>JnjGTIntProduct.globalProductCode</code> attribute **/
	public static final String GLOBALPRODUCTCODE = "globalProductCode";
	/** Qualifier of the <code>JnjGTIntProduct.netContent</code> attribute **/
	public static final String NETCONTENT = "netContent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(MATERIALNUM, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTMODCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSTATUS, AttributeMode.INITIAL);
		tmp.put(MINORPRODGRPCD, AttributeMode.INITIAL);
		tmp.put(GHEXIND, AttributeMode.INITIAL);
		tmp.put(HAZMATCODE, AttributeMode.INITIAL);
		tmp.put(FRANCMJRPRDGRPCD, AttributeMode.INITIAL);
		tmp.put(SALESORGCODE, AttributeMode.INITIAL);
		tmp.put(LEGACYPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(JNJPORTALIND, AttributeMode.INITIAL);
		tmp.put(FRANCHISECODE, AttributeMode.INITIAL);
		tmp.put(FRANCHISENAME, AttributeMode.INITIAL);
		tmp.put(CATEGORYCODE, AttributeMode.INITIAL);
		tmp.put(CATEGORYNAME, AttributeMode.INITIAL);
		tmp.put(BRANDCODE, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		tmp.put(SUBBRANDCODE, AttributeMode.INITIAL);
		tmp.put(SUBBRANDNAME, AttributeMode.INITIAL);
		tmp.put(FUNCTIONNAMECD, AttributeMode.INITIAL);
		tmp.put(FUNCTIONNAME, AttributeMode.INITIAL);
		tmp.put(MFGCOMPCODE, AttributeMode.INITIAL);
		tmp.put(DEAREGIND, AttributeMode.INITIAL);
		tmp.put(FIRSTSHIPEFFECTDATE, AttributeMode.INITIAL);
		tmp.put(PUBLISHIND, AttributeMode.INITIAL);
		tmp.put(MATERIALBASENUM, AttributeMode.INITIAL);
		tmp.put(BASEUOM, AttributeMode.INITIAL);
		tmp.put(USAOTCREADYIND, AttributeMode.INITIAL);
		tmp.put(ECATALOGDESCIPTION, AttributeMode.INITIAL);
		tmp.put(ECATALOGLONGDESCIPTION, AttributeMode.INITIAL);
		tmp.put(NEWPRODUCTSTARTDATE, AttributeMode.INITIAL);
		tmp.put(MATERIALSTATUSEFFECTDATE, AttributeMode.INITIAL);
		tmp.put(KITIND, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(GLOBALBUSINESSUNIT, AttributeMode.INITIAL);
		tmp.put(GLOBALPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(NETCONTENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.baseUom</code> attribute.
	 * @return the baseUom
	 */
	public String getBaseUom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BASEUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.baseUom</code> attribute.
	 * @return the baseUom
	 */
	public String getBaseUom()
	{
		return getBaseUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.baseUom</code> attribute. 
	 * @param value the baseUom
	 */
	public void setBaseUom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BASEUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.baseUom</code> attribute. 
	 * @param value the baseUom
	 */
	public void setBaseUom(final String value)
	{
		setBaseUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.brandCode</code> attribute.
	 * @return the brandCode
	 */
	public String getBrandCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANDCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.brandCode</code> attribute.
	 * @return the brandCode
	 */
	public String getBrandCode()
	{
		return getBrandCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.brandCode</code> attribute. 
	 * @param value the brandCode
	 */
	public void setBrandCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANDCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.brandCode</code> attribute. 
	 * @param value the brandCode
	 */
	public void setBrandCode(final String value)
	{
		setBrandCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.categoryCode</code> attribute.
	 * @return the categoryCode
	 */
	public String getCategoryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.categoryCode</code> attribute.
	 * @return the categoryCode
	 */
	public String getCategoryCode()
	{
		return getCategoryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.categoryCode</code> attribute. 
	 * @param value the categoryCode
	 */
	public void setCategoryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.categoryCode</code> attribute. 
	 * @param value the categoryCode
	 */
	public void setCategoryCode(final String value)
	{
		setCategoryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public String getCategoryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public String getCategoryName()
	{
		return getCategoryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final String value)
	{
		setCategoryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.deaRegInd</code> attribute.
	 * @return the deaRegInd
	 */
	public String getDeaRegInd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEAREGIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.deaRegInd</code> attribute.
	 * @return the deaRegInd
	 */
	public String getDeaRegInd()
	{
		return getDeaRegInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEAREGIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final String value)
	{
		setDeaRegInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.eCatalogDesciption</code> attribute.
	 * @return the eCatalogDesciption
	 */
	public String getECatalogDesciption(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ECATALOGDESCIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.eCatalogDesciption</code> attribute.
	 * @return the eCatalogDesciption
	 */
	public String getECatalogDesciption()
	{
		return getECatalogDesciption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.eCatalogDesciption</code> attribute. 
	 * @param value the eCatalogDesciption
	 */
	public void setECatalogDesciption(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ECATALOGDESCIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.eCatalogDesciption</code> attribute. 
	 * @param value the eCatalogDesciption
	 */
	public void setECatalogDesciption(final String value)
	{
		setECatalogDesciption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.eCatalogLongDesciption</code> attribute.
	 * @return the eCatalogLongDesciption
	 */
	public String getECatalogLongDesciption(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ECATALOGLONGDESCIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.eCatalogLongDesciption</code> attribute.
	 * @return the eCatalogLongDesciption
	 */
	public String getECatalogLongDesciption()
	{
		return getECatalogLongDesciption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.eCatalogLongDesciption</code> attribute. 
	 * @param value the eCatalogLongDesciption
	 */
	public void setECatalogLongDesciption(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ECATALOGLONGDESCIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.eCatalogLongDesciption</code> attribute. 
	 * @param value the eCatalogLongDesciption
	 */
	public void setECatalogLongDesciption(final String value)
	{
		setECatalogLongDesciption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.firstShipEffectDate</code> attribute.
	 * @return the firstShipEffectDate
	 */
	public Date getFirstShipEffectDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FIRSTSHIPEFFECTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.firstShipEffectDate</code> attribute.
	 * @return the firstShipEffectDate
	 */
	public Date getFirstShipEffectDate()
	{
		return getFirstShipEffectDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.firstShipEffectDate</code> attribute. 
	 * @param value the firstShipEffectDate
	 */
	public void setFirstShipEffectDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FIRSTSHIPEFFECTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.firstShipEffectDate</code> attribute. 
	 * @param value the firstShipEffectDate
	 */
	public void setFirstShipEffectDate(final Date value)
	{
		setFirstShipEffectDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.franchiseCode</code> attribute.
	 * @return the franchiseCode
	 */
	public String getFranchiseCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANCHISECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.franchiseCode</code> attribute.
	 * @return the franchiseCode
	 */
	public String getFranchiseCode()
	{
		return getFranchiseCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.franchiseCode</code> attribute. 
	 * @param value the franchiseCode
	 */
	public void setFranchiseCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANCHISECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.franchiseCode</code> attribute. 
	 * @param value the franchiseCode
	 */
	public void setFranchiseCode(final String value)
	{
		setFranchiseCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.franchiseName</code> attribute.
	 * @return the franchiseName
	 */
	public String getFranchiseName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANCHISENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.franchiseName</code> attribute.
	 * @return the franchiseName
	 */
	public String getFranchiseName()
	{
		return getFranchiseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.franchiseName</code> attribute. 
	 * @param value the franchiseName
	 */
	public void setFranchiseName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANCHISENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.franchiseName</code> attribute. 
	 * @param value the franchiseName
	 */
	public void setFranchiseName(final String value)
	{
		setFranchiseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.francMjrPrdGrpCd</code> attribute.
	 * @return the francMjrPrdGrpCd
	 */
	public String getFrancMjrPrdGrpCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANCMJRPRDGRPCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.francMjrPrdGrpCd</code> attribute.
	 * @return the francMjrPrdGrpCd
	 */
	public String getFrancMjrPrdGrpCd()
	{
		return getFrancMjrPrdGrpCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.francMjrPrdGrpCd</code> attribute. 
	 * @param value the francMjrPrdGrpCd
	 */
	public void setFrancMjrPrdGrpCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANCMJRPRDGRPCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.francMjrPrdGrpCd</code> attribute. 
	 * @param value the francMjrPrdGrpCd
	 */
	public void setFrancMjrPrdGrpCd(final String value)
	{
		setFrancMjrPrdGrpCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.functionName</code> attribute.
	 * @return the functionName
	 */
	public String getFunctionName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUNCTIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.functionName</code> attribute.
	 * @return the functionName
	 */
	public String getFunctionName()
	{
		return getFunctionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.functionName</code> attribute. 
	 * @param value the functionName
	 */
	public void setFunctionName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUNCTIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.functionName</code> attribute. 
	 * @param value the functionName
	 */
	public void setFunctionName(final String value)
	{
		setFunctionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.functionNameCd</code> attribute.
	 * @return the functionNameCd
	 */
	public String getFunctionNameCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUNCTIONNAMECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.functionNameCd</code> attribute.
	 * @return the functionNameCd
	 */
	public String getFunctionNameCd()
	{
		return getFunctionNameCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.functionNameCd</code> attribute. 
	 * @param value the functionNameCd
	 */
	public void setFunctionNameCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUNCTIONNAMECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.functionNameCd</code> attribute. 
	 * @param value the functionNameCd
	 */
	public void setFunctionNameCd(final String value)
	{
		setFunctionNameCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.ghexInd</code> attribute.
	 * @return the ghexInd
	 */
	public Boolean isGhexInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GHEXIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.ghexInd</code> attribute.
	 * @return the ghexInd
	 */
	public Boolean isGhexInd()
	{
		return isGhexInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @return the ghexInd
	 */
	public boolean isGhexIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGhexInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @return the ghexInd
	 */
	public boolean isGhexIndAsPrimitive()
	{
		return isGhexIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GHEXIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final Boolean value)
	{
		setGhexInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final SessionContext ctx, final boolean value)
	{
		setGhexInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final boolean value)
	{
		setGhexInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.globalBusinessUnit</code> attribute.
	 * @return the globalBusinessUnit
	 */
	public String getGlobalBusinessUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALBUSINESSUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.globalBusinessUnit</code> attribute.
	 * @return the globalBusinessUnit
	 */
	public String getGlobalBusinessUnit()
	{
		return getGlobalBusinessUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.globalBusinessUnit</code> attribute. 
	 * @param value the globalBusinessUnit
	 */
	public void setGlobalBusinessUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALBUSINESSUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.globalBusinessUnit</code> attribute. 
	 * @param value the globalBusinessUnit
	 */
	public void setGlobalBusinessUnit(final String value)
	{
		setGlobalBusinessUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.globalProductCode</code> attribute.
	 * @return the globalProductCode
	 */
	public String getGlobalProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.globalProductCode</code> attribute.
	 * @return the globalProductCode
	 */
	public String getGlobalProductCode()
	{
		return getGlobalProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.globalProductCode</code> attribute. 
	 * @param value the globalProductCode
	 */
	public void setGlobalProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.globalProductCode</code> attribute. 
	 * @param value the globalProductCode
	 */
	public void setGlobalProductCode(final String value)
	{
		setGlobalProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.hazmatCode</code> attribute.
	 * @return the hazmatCode
	 */
	public String getHazmatCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HAZMATCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.hazmatCode</code> attribute.
	 * @return the hazmatCode
	 */
	public String getHazmatCode()
	{
		return getHazmatCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.hazmatCode</code> attribute. 
	 * @param value the hazmatCode
	 */
	public void setHazmatCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HAZMATCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.hazmatCode</code> attribute. 
	 * @param value the hazmatCode
	 */
	public void setHazmatCode(final String value)
	{
		setHazmatCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute.
	 * @return the jnjPortalInd
	 */
	public Boolean isJnjPortalInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, JNJPORTALIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute.
	 * @return the jnjPortalInd
	 */
	public Boolean isJnjPortalInd()
	{
		return isJnjPortalInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @return the jnjPortalInd
	 */
	public boolean isJnjPortalIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isJnjPortalInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @return the jnjPortalInd
	 */
	public boolean isJnjPortalIndAsPrimitive()
	{
		return isJnjPortalIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, JNJPORTALIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final Boolean value)
	{
		setJnjPortalInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final SessionContext ctx, final boolean value)
	{
		setJnjPortalInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final boolean value)
	{
		setJnjPortalInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.kitInd</code> attribute.
	 * @return the kitInd
	 */
	public Boolean isKitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, KITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.kitInd</code> attribute.
	 * @return the kitInd
	 */
	public Boolean isKitInd()
	{
		return isKitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @return the kitInd
	 */
	public boolean isKitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isKitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @return the kitInd
	 */
	public boolean isKitIndAsPrimitive()
	{
		return isKitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @param value the kitInd
	 */
	public void setKitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, KITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @param value the kitInd
	 */
	public void setKitInd(final Boolean value)
	{
		setKitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @param value the kitInd
	 */
	public void setKitInd(final SessionContext ctx, final boolean value)
	{
		setKitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.kitInd</code> attribute. 
	 * @param value the kitInd
	 */
	public void setKitInd(final boolean value)
	{
		setKitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.legacyProductCode</code> attribute.
	 * @return the legacyProductCode
	 */
	public String getLegacyProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEGACYPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.legacyProductCode</code> attribute.
	 * @return the legacyProductCode
	 */
	public String getLegacyProductCode()
	{
		return getLegacyProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.legacyProductCode</code> attribute. 
	 * @param value the legacyProductCode
	 */
	public void setLegacyProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEGACYPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.legacyProductCode</code> attribute. 
	 * @param value the legacyProductCode
	 */
	public void setLegacyProductCode(final String value)
	{
		setLegacyProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialBaseNum</code> attribute.
	 * @return the materialBaseNum
	 */
	public String getMaterialBaseNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALBASENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialBaseNum</code> attribute.
	 * @return the materialBaseNum
	 */
	public String getMaterialBaseNum()
	{
		return getMaterialBaseNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialBaseNum</code> attribute. 
	 * @param value the materialBaseNum
	 */
	public void setMaterialBaseNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALBASENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialBaseNum</code> attribute. 
	 * @param value the materialBaseNum
	 */
	public void setMaterialBaseNum(final String value)
	{
		setMaterialBaseNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialNum</code> attribute.
	 * @return the materialNum
	 */
	public String getMaterialNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialNum</code> attribute.
	 * @return the materialNum
	 */
	public String getMaterialNum()
	{
		return getMaterialNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialNum</code> attribute. 
	 * @param value the materialNum
	 */
	public void setMaterialNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialNum</code> attribute. 
	 * @param value the materialNum
	 */
	public void setMaterialNum(final String value)
	{
		setMaterialNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialStatusEffectDate</code> attribute.
	 * @return the materialStatusEffectDate
	 */
	public Date getMaterialStatusEffectDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MATERIALSTATUSEFFECTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.materialStatusEffectDate</code> attribute.
	 * @return the materialStatusEffectDate
	 */
	public Date getMaterialStatusEffectDate()
	{
		return getMaterialStatusEffectDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialStatusEffectDate</code> attribute. 
	 * @param value the materialStatusEffectDate
	 */
	public void setMaterialStatusEffectDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MATERIALSTATUSEFFECTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.materialStatusEffectDate</code> attribute. 
	 * @param value the materialStatusEffectDate
	 */
	public void setMaterialStatusEffectDate(final Date value)
	{
		setMaterialStatusEffectDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.mfgCompCode</code> attribute.
	 * @return the mfgCompCode
	 */
	public String getMfgCompCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFGCOMPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.mfgCompCode</code> attribute.
	 * @return the mfgCompCode
	 */
	public String getMfgCompCode()
	{
		return getMfgCompCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.mfgCompCode</code> attribute. 
	 * @param value the mfgCompCode
	 */
	public void setMfgCompCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFGCOMPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.mfgCompCode</code> attribute. 
	 * @param value the mfgCompCode
	 */
	public void setMfgCompCode(final String value)
	{
		setMfgCompCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.minorProdGrpCd</code> attribute.
	 * @return the minorProdGrpCd
	 */
	public String getMinorProdGrpCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MINORPRODGRPCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.minorProdGrpCd</code> attribute.
	 * @return the minorProdGrpCd
	 */
	public String getMinorProdGrpCd()
	{
		return getMinorProdGrpCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.minorProdGrpCd</code> attribute. 
	 * @param value the minorProdGrpCd
	 */
	public void setMinorProdGrpCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MINORPRODGRPCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.minorProdGrpCd</code> attribute. 
	 * @param value the minorProdGrpCd
	 */
	public void setMinorProdGrpCd(final String value)
	{
		setMinorProdGrpCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.netContent</code> attribute.
	 * @return the netContent
	 */
	public String getNetContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETCONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.netContent</code> attribute.
	 * @return the netContent
	 */
	public String getNetContent()
	{
		return getNetContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.netContent</code> attribute. 
	 * @param value the netContent
	 */
	public void setNetContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETCONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.netContent</code> attribute. 
	 * @param value the netContent
	 */
	public void setNetContent(final String value)
	{
		setNetContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.newProductStartDate</code> attribute.
	 * @return the newProductStartDate
	 */
	public Date getNewProductStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, NEWPRODUCTSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.newProductStartDate</code> attribute.
	 * @return the newProductStartDate
	 */
	public Date getNewProductStartDate()
	{
		return getNewProductStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.newProductStartDate</code> attribute. 
	 * @param value the newProductStartDate
	 */
	public void setNewProductStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, NEWPRODUCTSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.newProductStartDate</code> attribute. 
	 * @param value the newProductStartDate
	 */
	public void setNewProductStartDate(final Date value)
	{
		setNewProductStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productModCode</code> attribute.
	 * @return the productModCode
	 */
	public String getProductModCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTMODCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productModCode</code> attribute.
	 * @return the productModCode
	 */
	public String getProductModCode()
	{
		return getProductModCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productModCode</code> attribute. 
	 * @param value the productModCode
	 */
	public void setProductModCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTMODCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productModCode</code> attribute. 
	 * @param value the productModCode
	 */
	public void setProductModCode(final String value)
	{
		setProductModCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productStatus</code> attribute.
	 * @return the productStatus
	 */
	public String getProductStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.productStatus</code> attribute.
	 * @return the productStatus
	 */
	public String getProductStatus()
	{
		return getProductStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productStatus</code> attribute. 
	 * @param value the productStatus
	 */
	public void setProductStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.productStatus</code> attribute. 
	 * @param value the productStatus
	 */
	public void setProductStatus(final String value)
	{
		setProductStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.publishInd</code> attribute.
	 * @return the publishInd
	 */
	public Boolean isPublishInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PUBLISHIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.publishInd</code> attribute.
	 * @return the publishInd
	 */
	public Boolean isPublishInd()
	{
		return isPublishInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @return the publishInd
	 */
	public boolean isPublishIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPublishInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @return the publishInd
	 */
	public boolean isPublishIndAsPrimitive()
	{
		return isPublishIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PUBLISHIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final Boolean value)
	{
		setPublishInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final SessionContext ctx, final boolean value)
	{
		setPublishInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final boolean value)
	{
		setPublishInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public String getRecordTimeStamp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public String getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final String value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode()
	{
		return getSalesOrgCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final String value)
	{
		setSalesOrgCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.subBrandCode</code> attribute.
	 * @return the subBrandCode
	 */
	public String getSubBrandCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBBRANDCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.subBrandCode</code> attribute.
	 * @return the subBrandCode
	 */
	public String getSubBrandCode()
	{
		return getSubBrandCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.subBrandCode</code> attribute. 
	 * @param value the subBrandCode
	 */
	public void setSubBrandCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBBRANDCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.subBrandCode</code> attribute. 
	 * @param value the subBrandCode
	 */
	public void setSubBrandCode(final String value)
	{
		setSubBrandCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.subBrandName</code> attribute.
	 * @return the subBrandName
	 */
	public String getSubBrandName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.subBrandName</code> attribute.
	 * @return the subBrandName
	 */
	public String getSubBrandName()
	{
		return getSubBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.subBrandName</code> attribute. 
	 * @param value the subBrandName
	 */
	public void setSubBrandName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.subBrandName</code> attribute. 
	 * @param value the subBrandName
	 */
	public void setSubBrandName(final String value)
	{
		setSubBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute.
	 * @return the usaOtcReadyInd
	 */
	public Boolean isUsaOtcReadyInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, USAOTCREADYIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute.
	 * @return the usaOtcReadyInd
	 */
	public Boolean isUsaOtcReadyInd()
	{
		return isUsaOtcReadyInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @return the usaOtcReadyInd
	 */
	public boolean isUsaOtcReadyIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUsaOtcReadyInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @return the usaOtcReadyInd
	 */
	public boolean isUsaOtcReadyIndAsPrimitive()
	{
		return isUsaOtcReadyIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @param value the usaOtcReadyInd
	 */
	public void setUsaOtcReadyInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, USAOTCREADYIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @param value the usaOtcReadyInd
	 */
	public void setUsaOtcReadyInd(final Boolean value)
	{
		setUsaOtcReadyInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @param value the usaOtcReadyInd
	 */
	public void setUsaOtcReadyInd(final SessionContext ctx, final boolean value)
	{
		setUsaOtcReadyInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProduct.usaOtcReadyInd</code> attribute. 
	 * @param value the usaOtcReadyInd
	 */
	public void setUsaOtcReadyInd(final boolean value)
	{
		setUsaOtcReadyInd( getSession().getSessionContext(), value );
	}
	
}
