/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import com.jnj.core.jalo.JnJGTProductKit;
import com.jnj.core.jalo.JnJGTProductSalesOrg;
import com.jnj.core.jalo.JnJGTProductUnitLocal;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjGTProductCpscDetail;
import com.jnj.core.jalo.JnjGTProductPlant;
import com.jnj.core.jalo.JnjGTProductReg;
import com.jnj.core.jalo.JnjUomConversion;
import com.jnj.core.jalo.ProductDocuments;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product JnJProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJProduct extends Product
{
	/** Qualifier of the <code>JnJProduct.numeratorSUOM</code> attribute **/
	public static final String NUMERATORSUOM = "numeratorSUOM";
	/** Qualifier of the <code>JnJProduct.sector</code> attribute **/
	public static final String SECTOR = "sector";
	/** Qualifier of the <code>JnJProduct.materialType</code> attribute **/
	public static final String MATERIALTYPE = "materialType";
	/** Qualifier of the <code>JnJProduct.numeratorDUOM</code> attribute **/
	public static final String NUMERATORDUOM = "numeratorDUOM";
	/** Qualifier of the <code>JnJProduct.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnJProduct.disContinue</code> attribute **/
	public static final String DISCONTINUE = "disContinue";
	/** Qualifier of the <code>JnJProduct.ecommerceFlag</code> attribute **/
	public static final String ECOMMERCEFLAG = "ecommerceFlag";
	/** Qualifier of the <code>JnJProduct.baseUnitOfMeasure</code> attribute **/
	public static final String BASEUNITOFMEASURE = "baseUnitOfMeasure";
	/** Qualifier of the <code>JnJProduct.originCountry</code> attribute **/
	public static final String ORIGINCOUNTRY = "originCountry";
	/** Qualifier of the <code>JnJProduct.deliveryUnitOfMeasure</code> attribute **/
	public static final String DELIVERYUNITOFMEASURE = "deliveryUnitOfMeasure";
	/** Qualifier of the <code>JnJProduct.coldChainProduct</code> attribute **/
	public static final String COLDCHAINPRODUCT = "coldChainProduct";
	/** Qualifier of the <code>JnJProduct.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>JnJProduct.width</code> attribute **/
	public static final String WIDTH = "width";
	/** Qualifier of the <code>JnJProduct.length</code> attribute **/
	public static final String LENGTH = "length";
	/** Qualifier of the <code>JnJProduct.unitDimension</code> attribute **/
	public static final String UNITDIMENSION = "unitDimension";
	/** Qualifier of the <code>JnJProduct.medicalSpecialty</code> attribute **/
	public static final String MEDICALSPECIALTY = "medicalSpecialty";
	/** Qualifier of the <code>JnJProduct.shippingWeight</code> attribute **/
	public static final String SHIPPINGWEIGHT = "shippingWeight";
	/** Qualifier of the <code>JnJProduct.stockingType</code> attribute **/
	public static final String STOCKINGTYPE = "stockingType";
	/** Qualifier of the <code>JnJProduct.uomDetails</code> attribute **/
	public static final String UOMDETAILS = "uomDetails";
	/** Qualifier of the <code>JnJProduct.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnJProduct.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	/** Qualifier of the <code>JnJProduct.productStatusCode</code> attribute **/
	public static final String PRODUCTSTATUSCODE = "productStatusCode";
	/** Qualifier of the <code>JnJProduct.ghexInd</code> attribute **/
	public static final String GHEXIND = "ghexInd";
	/** Qualifier of the <code>JnJProduct.hazmatCode</code> attribute **/
	public static final String HAZMATCODE = "hazmatCode";
	/** Qualifier of the <code>JnJProduct.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>JnJProduct.salesOrgCode</code> attribute **/
	public static final String SALESORGCODE = "salesOrgCode";
	/** Qualifier of the <code>JnJProduct.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>JnJProduct.jnjPortalInd</code> attribute **/
	public static final String JNJPORTALIND = "jnjPortalInd";
	/** Qualifier of the <code>JnJProduct.deaRegInd</code> attribute **/
	public static final String DEAREGIND = "deaRegInd";
	/** Qualifier of the <code>JnJProduct.materialBaseProduct</code> attribute **/
	public static final String MATERIALBASEPRODUCT = "materialBaseProduct";
	/** Qualifier of the <code>JnJProduct.regionCode</code> attribute **/
	public static final String REGIONCODE = "regionCode";
	/** Qualifier of the <code>JnJProduct.batchMgmt</code> attribute **/
	public static final String BATCHMGMT = "batchMgmt";
	/** Qualifier of the <code>JnJProduct.dChainStatusEffectiveDate</code> attribute **/
	public static final String DCHAINSTATUSEFFECTIVEDATE = "dChainStatusEffectiveDate";
	/** Qualifier of the <code>JnJProduct.productExpiryDate</code> attribute **/
	public static final String PRODUCTEXPIRYDATE = "productExpiryDate";
	/** Qualifier of the <code>JnJProduct.franchiseName</code> attribute **/
	public static final String FRANCHISENAME = "franchiseName";
	/** Qualifier of the <code>JnJProduct.oldProductCode</code> attribute **/
	public static final String OLDPRODUCTCODE = "oldProductCode";
	/** Qualifier of the <code>JnJProduct.assemblyCountry</code> attribute **/
	public static final String ASSEMBLYCOUNTRY = "assemblyCountry";
	/** Qualifier of the <code>JnJProduct.upcCode</code> attribute **/
	public static final String UPCCODE = "upcCode";
	/** Qualifier of the <code>JnJProduct.availableInd</code> attribute **/
	public static final String AVAILABLEIND = "availableInd";
	/** Qualifier of the <code>JnJProduct.ingredient</code> attribute **/
	public static final String INGREDIENT = "ingredient";
	/** Qualifier of the <code>JnJProduct.modStatus</code> attribute **/
	public static final String MODSTATUS = "modStatus";
	/** Qualifier of the <code>JnJProduct.publishInd</code> attribute **/
	public static final String PUBLISHIND = "publishInd";
	/** Qualifier of the <code>JnJProduct.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	/** Qualifier of the <code>JnJProduct.firstShipEffectDate</code> attribute **/
	public static final String FIRSTSHIPEFFECTDATE = "firstShipEffectDate";
	/** Qualifier of the <code>JnJProduct.newProductStartDate</code> attribute **/
	public static final String NEWPRODUCTSTARTDATE = "newProductStartDate";
	/** Qualifier of the <code>JnJProduct.firstLevelCategory</code> attribute **/
	public static final String FIRSTLEVELCATEGORY = "firstLevelCategory";
	/** Qualifier of the <code>JnJProduct.secondLevelCategory</code> attribute **/
	public static final String SECONDLEVELCATEGORY = "secondLevelCategory";
	/** Qualifier of the <code>JnJProduct.modCode</code> attribute **/
	public static final String MODCODE = "modCode";
	/** Qualifier of the <code>JnJProduct.backOrderedDate</code> attribute **/
	public static final String BACKORDEREDDATE = "backOrderedDate";
	/** Qualifier of the <code>JnJProduct.additionalComments</code> attribute **/
	public static final String ADDITIONALCOMMENTS = "additionalComments";
	/** Qualifier of the <code>JnJProduct.bfs</code> attribute **/
	public static final String BFS = "bfs";
	/** Qualifier of the <code>JnJProduct.bfsDescription</code> attribute **/
	public static final String BFSDESCRIPTION = "bfsDescription";
	/** Qualifier of the <code>JnJProduct.indication</code> attribute **/
	public static final String INDICATION = "indication";
	/** Qualifier of the <code>JnJProduct.warning</code> attribute **/
	public static final String WARNING = "warning";
	/** Qualifier of the <code>JnJProduct.direction</code> attribute **/
	public static final String DIRECTION = "direction";
	/** Qualifier of the <code>JnJProduct.artworkApprovalDate</code> attribute **/
	public static final String ARTWORKAPPROVALDATE = "artworkApprovalDate";
	/** Qualifier of the <code>JnJProduct.artworkApprovalCrr</code> attribute **/
	public static final String ARTWORKAPPROVALCRR = "artworkApprovalCrr";
	/** Qualifier of the <code>JnJProduct.rmcNo</code> attribute **/
	public static final String RMCNO = "rmcNo";
	/** Qualifier of the <code>JnJProduct.longBullet</code> attribute **/
	public static final String LONGBULLET = "longBullet";
	/** Qualifier of the <code>JnJProduct.shortBullets</code> attribute **/
	public static final String SHORTBULLETS = "shortBullets";
	/** Qualifier of the <code>JnJProduct.copyApprovalReference</code> attribute **/
	public static final String COPYAPPROVALREFERENCE = "copyApprovalReference";
	/** Qualifier of the <code>JnJProduct.copyApprovalDate</code> attribute **/
	public static final String COPYAPPROVALDATE = "copyApprovalDate";
	/** Qualifier of the <code>JnJProduct.imageLastUpdateDate</code> attribute **/
	public static final String IMAGELASTUPDATEDATE = "imageLastUpdateDate";
	/** Qualifier of the <code>JnJProduct.netContent</code> attribute **/
	public static final String NETCONTENT = "netContent";
	/** Qualifier of the <code>JnJProduct.globalBusinessUnit</code> attribute **/
	public static final String GLOBALBUSINESSUNIT = "globalBusinessUnit";
	/** Qualifier of the <code>JnJProduct.zonzaMainImage</code> attribute **/
	public static final String ZONZAMAINIMAGE = "zonzaMainImage";
	/** Qualifier of the <code>JnJProduct.imageAvailableInd</code> attribute **/
	public static final String IMAGEAVAILABLEIND = "imageAvailableInd";
	/** Qualifier of the <code>JnJProduct.persistedCompletenessIndicator</code> attribute **/
	public static final String PERSISTEDCOMPLETENESSINDICATOR = "persistedCompletenessIndicator";
	/** Qualifier of the <code>JnJProduct.shortOverview</code> attribute **/
	public static final String SHORTOVERVIEW = "shortOverview";
	/** Qualifier of the <code>JnJProduct.productDocumentlist</code> attribute **/
	public static final String PRODUCTDOCUMENTLIST = "productDocumentlist";
	/** Qualifier of the <code>JnJProduct.aboutTheBrand</code> attribute **/
	public static final String ABOUTTHEBRAND = "aboutTheBrand";
	/** Qualifier of the <code>JnJProduct.productDesc2</code> attribute **/
	public static final String PRODUCTDESC2 = "productDesc2";
	/** Qualifier of the <code>JnJProduct.kitInd</code> attribute **/
	public static final String KITIND = "kitInd";
	/** Qualifier of the <code>JnJProduct.globalProductCode</code> attribute **/
	public static final String GLOBALPRODUCTCODE = "globalProductCode";
	/** Qualifier of the <code>JnJProduct.materialBaseNum</code> attribute **/
	public static final String MATERIALBASENUM = "materialBaseNum";
	/** Qualifier of the <code>JnJProduct.materialStatusEffectDate</code> attribute **/
	public static final String MATERIALSTATUSEFFECTDATE = "materialStatusEffectDate";
	/** Qualifier of the <code>JnJProduct.mdmDescription</code> attribute **/
	public static final String MDMDESCRIPTION = "mdmDescription";
	/** Qualifier of the <code>JnJProduct.francMjrPrdGrpCd</code> attribute **/
	public static final String FRANCMJRPRDGRPCD = "francMjrPrdGrpCd";
	/** Qualifier of the <code>JnJProduct.pcmModStatus</code> attribute **/
	public static final String PCMMODSTATUS = "pcmModStatus";
	/** Qualifier of the <code>JnJProduct.pcmInd</code> attribute **/
	public static final String PCMIND = "pcmInd";
	/** Qualifier of the <code>JnJProduct.productStatus</code> attribute **/
	public static final String PRODUCTSTATUS = "productStatus";
	/** Qualifier of the <code>JnJProduct.invalidInPrcieList</code> attribute **/
	public static final String INVALIDINPRCIELIST = "invalidInPrcieList";
	/** Qualifier of the <code>JnJProduct.tempPublisInd</code> attribute **/
	public static final String TEMPPUBLISIND = "tempPublisInd";
	/** Qualifier of the <code>JnJProduct.inFieldInd</code> attribute **/
	public static final String INFIELDIND = "inFieldInd";
	/** Qualifier of the <code>JnJProduct.productImagesInPNG</code> attribute **/
	public static final String PRODUCTIMAGESINPNG = "productImagesInPNG";
	/** Qualifier of the <code>JnJProduct.productImagesInJPEG</code> attribute **/
	public static final String PRODUCTIMAGESINJPEG = "productImagesInJPEG";
	/** Qualifier of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute **/
	public static final String IMAGENEEDSTOBECONVERTED = "imageNeedsToBeConverted";
	/** Qualifier of the <code>JnJProduct.nameText</code> attribute **/
	public static final String NAMETEXT = "nameText";
	/** Qualifier of the <code>JnJProduct.descriptionText</code> attribute **/
	public static final String DESCRIPTIONTEXT = "descriptionText";
	/** Qualifier of the <code>JnJProduct.summaryText</code> attribute **/
	public static final String SUMMARYTEXT = "summaryText";
	/** Qualifier of the <code>JnJProduct.shortBulletsText</code> attribute **/
	public static final String SHORTBULLETSTEXT = "shortBulletsText";
	/** Qualifier of the <code>JnJProduct.longBulletText</code> attribute **/
	public static final String LONGBULLETTEXT = "longBulletText";
	/** Qualifier of the <code>JnJProduct.directionText</code> attribute **/
	public static final String DIRECTIONTEXT = "directionText";
	/** Qualifier of the <code>JnJProduct.warningText</code> attribute **/
	public static final String WARNINGTEXT = "warningText";
	/** Qualifier of the <code>JnJProduct.indicationText</code> attribute **/
	public static final String INDICATIONTEXT = "indicationText";
	/** Qualifier of the <code>JnJProduct.ingredientText</code> attribute **/
	public static final String INGREDIENTTEXT = "ingredientText";
	/** Qualifier of the <code>JnJProduct.catalogId</code> attribute **/
	public static final String CATALOGID = "catalogId";
	/** Qualifier of the <code>JnJProduct.kitType</code> attribute **/
	public static final String KITTYPE = "kitType";
	/** Qualifier of the <code>JnJProduct.kitSubType</code> attribute **/
	public static final String KITSUBTYPE = "kitSubType";
	/** Qualifier of the <code>JnJProduct.countries</code> attribute **/
	public static final String COUNTRIES = "countries";
	/** Relation ordering override parameter constants for Product2Countries from ((jnjb2bcore))*/
	protected static String PRODUCT2COUNTRIES_SRC_ORDERED = "relation.Product2Countries.source.ordered";
	protected static String PRODUCT2COUNTRIES_TGT_ORDERED = "relation.Product2Countries.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Countries from ((jnjb2bcore))*/
	protected static String PRODUCT2COUNTRIES_MARKMODIFIED = "relation.Product2Countries.markmodified";
	/** Qualifier of the <code>JnJProduct.includedUnits</code> attribute **/
	public static final String INCLUDEDUNITS = "includedUnits";
	/** Relation ordering override parameter constants for JnjB2bUnitToIncludedProducts from ((jnjb2bcore))*/
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_SRC_ORDERED = "relation.JnjB2bUnitToIncludedProducts.source.ordered";
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_TGT_ORDERED = "relation.JnjB2bUnitToIncludedProducts.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjB2bUnitToIncludedProducts from ((jnjb2bcore))*/
	protected static String JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED = "relation.JnjB2bUnitToIncludedProducts.markmodified";
	/** Qualifier of the <code>JnJProduct.productSalesOrg</code> attribute **/
	public static final String PRODUCTSALESORG = "productSalesOrg";
	/** Relation ordering override parameter constants for JnjGTProduct2JnJGTProductSalesOrg from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_SRC_ORDERED = "relation.JnjGTProduct2JnJGTProductSalesOrg.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_TGT_ORDERED = "relation.JnjGTProduct2JnJGTProductSalesOrg.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnJGTProductSalesOrg from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED = "relation.JnjGTProduct2JnJGTProductSalesOrg.markmodified";
	/** Qualifier of the <code>JnJProduct.productKits</code> attribute **/
	public static final String PRODUCTKITS = "productKits";
	/** Relation ordering override parameter constants for JnjGTProduct2JnjGTProductKit from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_SRC_ORDERED = "relation.JnjGTProduct2JnjGTProductKit.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_TGT_ORDERED = "relation.JnjGTProduct2JnjGTProductKit.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnjGTProductKit from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED = "relation.JnjGTProduct2JnjGTProductKit.markmodified";
	/** Qualifier of the <code>JnJProduct.productPlants</code> attribute **/
	public static final String PRODUCTPLANTS = "productPlants";
	/** Relation ordering override parameter constants for JnjGTProduct2JnjGTProductPlant from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_SRC_ORDERED = "relation.JnjGTProduct2JnjGTProductPlant.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_TGT_ORDERED = "relation.JnjGTProduct2JnjGTProductPlant.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnjGTProductPlant from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED = "relation.JnjGTProduct2JnjGTProductPlant.markmodified";
	/** Qualifier of the <code>JnJProduct.jnjGTProductReg</code> attribute **/
	public static final String JNJGTPRODUCTREG = "jnjGTProductReg";
	/** Qualifier of the <code>JnJProduct.jnjGTProductUnitLocal</code> attribute **/
	public static final String JNJGTPRODUCTUNITLOCAL = "jnjGTProductUnitLocal";
	/** Qualifier of the <code>JnJProduct.cpsiDetails</code> attribute **/
	public static final String CPSIDETAILS = "cpsiDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n JNJGTPRODUCTREG's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTProductReg> JNJGTPRODUCTREGHANDLER = new OneToManyHandler<JnjGTProductReg>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTREG,
	false,
	"jnJProduct",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n JNJGTPRODUCTUNITLOCAL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnJGTProductUnitLocal> JNJGTPRODUCTUNITLOCALHANDLER = new OneToManyHandler<JnJGTProductUnitLocal>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTUNITLOCAL,
	false,
	"jnJProduct",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CPSIDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTProductCpscDetail> CPSIDETAILSHANDLER = new OneToManyHandler<JnjGTProductCpscDetail>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTCPSCDETAIL,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NUMERATORSUOM, AttributeMode.INITIAL);
		tmp.put(SECTOR, AttributeMode.INITIAL);
		tmp.put(MATERIALTYPE, AttributeMode.INITIAL);
		tmp.put(NUMERATORDUOM, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(DISCONTINUE, AttributeMode.INITIAL);
		tmp.put(ECOMMERCEFLAG, AttributeMode.INITIAL);
		tmp.put(BASEUNITOFMEASURE, AttributeMode.INITIAL);
		tmp.put(ORIGINCOUNTRY, AttributeMode.INITIAL);
		tmp.put(DELIVERYUNITOFMEASURE, AttributeMode.INITIAL);
		tmp.put(COLDCHAINPRODUCT, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(WIDTH, AttributeMode.INITIAL);
		tmp.put(LENGTH, AttributeMode.INITIAL);
		tmp.put(UNITDIMENSION, AttributeMode.INITIAL);
		tmp.put(MEDICALSPECIALTY, AttributeMode.INITIAL);
		tmp.put(SHIPPINGWEIGHT, AttributeMode.INITIAL);
		tmp.put(STOCKINGTYPE, AttributeMode.INITIAL);
		tmp.put(UOMDETAILS, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(PRODUCTSTATUSCODE, AttributeMode.INITIAL);
		tmp.put(GHEXIND, AttributeMode.INITIAL);
		tmp.put(HAZMATCODE, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(SALESORGCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(JNJPORTALIND, AttributeMode.INITIAL);
		tmp.put(DEAREGIND, AttributeMode.INITIAL);
		tmp.put(MATERIALBASEPRODUCT, AttributeMode.INITIAL);
		tmp.put(REGIONCODE, AttributeMode.INITIAL);
		tmp.put(BATCHMGMT, AttributeMode.INITIAL);
		tmp.put(DCHAINSTATUSEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(PRODUCTEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(FRANCHISENAME, AttributeMode.INITIAL);
		tmp.put(OLDPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(ASSEMBLYCOUNTRY, AttributeMode.INITIAL);
		tmp.put(UPCCODE, AttributeMode.INITIAL);
		tmp.put(AVAILABLEIND, AttributeMode.INITIAL);
		tmp.put(INGREDIENT, AttributeMode.INITIAL);
		tmp.put(MODSTATUS, AttributeMode.INITIAL);
		tmp.put(PUBLISHIND, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		tmp.put(FIRSTSHIPEFFECTDATE, AttributeMode.INITIAL);
		tmp.put(NEWPRODUCTSTARTDATE, AttributeMode.INITIAL);
		tmp.put(FIRSTLEVELCATEGORY, AttributeMode.INITIAL);
		tmp.put(SECONDLEVELCATEGORY, AttributeMode.INITIAL);
		tmp.put(MODCODE, AttributeMode.INITIAL);
		tmp.put(BACKORDEREDDATE, AttributeMode.INITIAL);
		tmp.put(ADDITIONALCOMMENTS, AttributeMode.INITIAL);
		tmp.put(BFS, AttributeMode.INITIAL);
		tmp.put(BFSDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(INDICATION, AttributeMode.INITIAL);
		tmp.put(WARNING, AttributeMode.INITIAL);
		tmp.put(DIRECTION, AttributeMode.INITIAL);
		tmp.put(ARTWORKAPPROVALDATE, AttributeMode.INITIAL);
		tmp.put(ARTWORKAPPROVALCRR, AttributeMode.INITIAL);
		tmp.put(RMCNO, AttributeMode.INITIAL);
		tmp.put(LONGBULLET, AttributeMode.INITIAL);
		tmp.put(SHORTBULLETS, AttributeMode.INITIAL);
		tmp.put(COPYAPPROVALREFERENCE, AttributeMode.INITIAL);
		tmp.put(COPYAPPROVALDATE, AttributeMode.INITIAL);
		tmp.put(IMAGELASTUPDATEDATE, AttributeMode.INITIAL);
		tmp.put(NETCONTENT, AttributeMode.INITIAL);
		tmp.put(GLOBALBUSINESSUNIT, AttributeMode.INITIAL);
		tmp.put(ZONZAMAINIMAGE, AttributeMode.INITIAL);
		tmp.put(IMAGEAVAILABLEIND, AttributeMode.INITIAL);
		tmp.put(PERSISTEDCOMPLETENESSINDICATOR, AttributeMode.INITIAL);
		tmp.put(SHORTOVERVIEW, AttributeMode.INITIAL);
		tmp.put(PRODUCTDOCUMENTLIST, AttributeMode.INITIAL);
		tmp.put(ABOUTTHEBRAND, AttributeMode.INITIAL);
		tmp.put(PRODUCTDESC2, AttributeMode.INITIAL);
		tmp.put(KITIND, AttributeMode.INITIAL);
		tmp.put(GLOBALPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(MATERIALBASENUM, AttributeMode.INITIAL);
		tmp.put(MATERIALSTATUSEFFECTDATE, AttributeMode.INITIAL);
		tmp.put(MDMDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FRANCMJRPRDGRPCD, AttributeMode.INITIAL);
		tmp.put(PCMMODSTATUS, AttributeMode.INITIAL);
		tmp.put(PCMIND, AttributeMode.INITIAL);
		tmp.put(PRODUCTSTATUS, AttributeMode.INITIAL);
		tmp.put(INVALIDINPRCIELIST, AttributeMode.INITIAL);
		tmp.put(TEMPPUBLISIND, AttributeMode.INITIAL);
		tmp.put(INFIELDIND, AttributeMode.INITIAL);
		tmp.put(PRODUCTIMAGESINPNG, AttributeMode.INITIAL);
		tmp.put(PRODUCTIMAGESINJPEG, AttributeMode.INITIAL);
		tmp.put(IMAGENEEDSTOBECONVERTED, AttributeMode.INITIAL);
		tmp.put(NAMETEXT, AttributeMode.INITIAL);
		tmp.put(DESCRIPTIONTEXT, AttributeMode.INITIAL);
		tmp.put(SUMMARYTEXT, AttributeMode.INITIAL);
		tmp.put(SHORTBULLETSTEXT, AttributeMode.INITIAL);
		tmp.put(LONGBULLETTEXT, AttributeMode.INITIAL);
		tmp.put(DIRECTIONTEXT, AttributeMode.INITIAL);
		tmp.put(WARNINGTEXT, AttributeMode.INITIAL);
		tmp.put(INDICATIONTEXT, AttributeMode.INITIAL);
		tmp.put(INGREDIENTTEXT, AttributeMode.INITIAL);
		tmp.put(CATALOGID, AttributeMode.INITIAL);
		tmp.put(KITTYPE, AttributeMode.INITIAL);
		tmp.put(KITSUBTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.aboutTheBrand</code> attribute.
	 * @return the aboutTheBrand
	 */
	public String getAboutTheBrand(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getAboutTheBrand requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ABOUTTHEBRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.aboutTheBrand</code> attribute.
	 * @return the aboutTheBrand
	 */
	public String getAboutTheBrand()
	{
		return getAboutTheBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @return the localized aboutTheBrand
	 */
	public Map<Language,String> getAllAboutTheBrand(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ABOUTTHEBRAND,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @return the localized aboutTheBrand
	 */
	public Map<Language,String> getAllAboutTheBrand()
	{
		return getAllAboutTheBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @param value the aboutTheBrand
	 */
	public void setAboutTheBrand(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setAboutTheBrand requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ABOUTTHEBRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @param value the aboutTheBrand
	 */
	public void setAboutTheBrand(final String value)
	{
		setAboutTheBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @param value the aboutTheBrand
	 */
	public void setAllAboutTheBrand(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ABOUTTHEBRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.aboutTheBrand</code> attribute. 
	 * @param value the aboutTheBrand
	 */
	public void setAllAboutTheBrand(final Map<Language,String> value)
	{
		setAllAboutTheBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.additionalComments</code> attribute.
	 * @return the additionalComments
	 */
	public String getAdditionalComments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDITIONALCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.additionalComments</code> attribute.
	 * @return the additionalComments
	 */
	public String getAdditionalComments()
	{
		return getAdditionalComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.additionalComments</code> attribute. 
	 * @param value the additionalComments
	 */
	public void setAdditionalComments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDITIONALCOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.additionalComments</code> attribute. 
	 * @param value the additionalComments
	 */
	public void setAdditionalComments(final String value)
	{
		setAdditionalComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.artworkApprovalCrr</code> attribute.
	 * @return the artworkApprovalCrr - This attribute is part of PCM and represents ARTWORK APPROVAL CRR #
	 */
	public String getArtworkApprovalCrr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ARTWORKAPPROVALCRR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.artworkApprovalCrr</code> attribute.
	 * @return the artworkApprovalCrr - This attribute is part of PCM and represents ARTWORK APPROVAL CRR #
	 */
	public String getArtworkApprovalCrr()
	{
		return getArtworkApprovalCrr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.artworkApprovalCrr</code> attribute. 
	 * @param value the artworkApprovalCrr - This attribute is part of PCM and represents ARTWORK APPROVAL CRR #
	 */
	public void setArtworkApprovalCrr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ARTWORKAPPROVALCRR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.artworkApprovalCrr</code> attribute. 
	 * @param value the artworkApprovalCrr - This attribute is part of PCM and represents ARTWORK APPROVAL CRR #
	 */
	public void setArtworkApprovalCrr(final String value)
	{
		setArtworkApprovalCrr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.artworkApprovalDate</code> attribute.
	 * @return the artworkApprovalDate - This attribute is part of PCM Labeling Attributes
	 */
	public Date getArtworkApprovalDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARTWORKAPPROVALDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.artworkApprovalDate</code> attribute.
	 * @return the artworkApprovalDate - This attribute is part of PCM Labeling Attributes
	 */
	public Date getArtworkApprovalDate()
	{
		return getArtworkApprovalDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.artworkApprovalDate</code> attribute. 
	 * @param value the artworkApprovalDate - This attribute is part of PCM Labeling Attributes
	 */
	public void setArtworkApprovalDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ARTWORKAPPROVALDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.artworkApprovalDate</code> attribute. 
	 * @param value the artworkApprovalDate - This attribute is part of PCM Labeling Attributes
	 */
	public void setArtworkApprovalDate(final Date value)
	{
		setArtworkApprovalDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.assemblyCountry</code> attribute.
	 * @return the assemblyCountry
	 */
	public Country getAssemblyCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, ASSEMBLYCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.assemblyCountry</code> attribute.
	 * @return the assemblyCountry
	 */
	public Country getAssemblyCountry()
	{
		return getAssemblyCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.assemblyCountry</code> attribute. 
	 * @param value the assemblyCountry
	 */
	public void setAssemblyCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, ASSEMBLYCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.assemblyCountry</code> attribute. 
	 * @param value the assemblyCountry
	 */
	public void setAssemblyCountry(final Country value)
	{
		setAssemblyCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.availableInd</code> attribute.
	 * @return the availableInd
	 */
	public Boolean isAvailableInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AVAILABLEIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.availableInd</code> attribute.
	 * @return the availableInd
	 */
	public Boolean isAvailableInd()
	{
		return isAvailableInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @return the availableInd
	 */
	public boolean isAvailableIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAvailableInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @return the availableInd
	 */
	public boolean isAvailableIndAsPrimitive()
	{
		return isAvailableIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @param value the availableInd
	 */
	public void setAvailableInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AVAILABLEIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @param value the availableInd
	 */
	public void setAvailableInd(final Boolean value)
	{
		setAvailableInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @param value the availableInd
	 */
	public void setAvailableInd(final SessionContext ctx, final boolean value)
	{
		setAvailableInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.availableInd</code> attribute. 
	 * @param value the availableInd
	 */
	public void setAvailableInd(final boolean value)
	{
		setAvailableInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.backOrderedDate</code> attribute.
	 * @return the backOrderedDate
	 */
	public Date getBackOrderedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BACKORDEREDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.backOrderedDate</code> attribute.
	 * @return the backOrderedDate
	 */
	public Date getBackOrderedDate()
	{
		return getBackOrderedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.backOrderedDate</code> attribute. 
	 * @param value the backOrderedDate
	 */
	public void setBackOrderedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BACKORDEREDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.backOrderedDate</code> attribute. 
	 * @param value the backOrderedDate
	 */
	public void setBackOrderedDate(final Date value)
	{
		setBackOrderedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.baseUnitOfMeasure</code> attribute.
	 * @return the baseUnitOfMeasure
	 */
	public Unit getBaseUnitOfMeasure(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, BASEUNITOFMEASURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.baseUnitOfMeasure</code> attribute.
	 * @return the baseUnitOfMeasure
	 */
	public Unit getBaseUnitOfMeasure()
	{
		return getBaseUnitOfMeasure( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.baseUnitOfMeasure</code> attribute. 
	 * @param value the baseUnitOfMeasure
	 */
	public void setBaseUnitOfMeasure(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, BASEUNITOFMEASURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.baseUnitOfMeasure</code> attribute. 
	 * @param value the baseUnitOfMeasure
	 */
	public void setBaseUnitOfMeasure(final Unit value)
	{
		setBaseUnitOfMeasure( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public Boolean isBatchMgmt(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BATCHMGMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public Boolean isBatchMgmt()
	{
		return isBatchMgmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @return the batchMgmt
	 */
	public boolean isBatchMgmtAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBatchMgmt( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @return the batchMgmt
	 */
	public boolean isBatchMgmtAsPrimitive()
	{
		return isBatchMgmtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BATCHMGMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final Boolean value)
	{
		setBatchMgmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final SessionContext ctx, final boolean value)
	{
		setBatchMgmt( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final boolean value)
	{
		setBatchMgmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.bfs</code> attribute.
	 * @return the bfs - This item is for MDD depuy products
	 */
	public String getBfs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BFS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.bfs</code> attribute.
	 * @return the bfs - This item is for MDD depuy products
	 */
	public String getBfs()
	{
		return getBfs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.bfs</code> attribute. 
	 * @param value the bfs - This item is for MDD depuy products
	 */
	public void setBfs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BFS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.bfs</code> attribute. 
	 * @param value the bfs - This item is for MDD depuy products
	 */
	public void setBfs(final String value)
	{
		setBfs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.bfsDescription</code> attribute.
	 * @return the bfsDescription - This item is for MDD depuy products
	 */
	public String getBfsDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BFSDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.bfsDescription</code> attribute.
	 * @return the bfsDescription - This item is for MDD depuy products
	 */
	public String getBfsDescription()
	{
		return getBfsDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.bfsDescription</code> attribute. 
	 * @param value the bfsDescription - This item is for MDD depuy products
	 */
	public void setBfsDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BFSDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.bfsDescription</code> attribute. 
	 * @param value the bfsDescription - This item is for MDD depuy products
	 */
	public void setBfsDescription(final String value)
	{
		setBfsDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.catalogId</code> attribute.
	 * @return the catalogId - This is the Catalog ID for each Product.
	 */
	public String getCatalogId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATALOGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.catalogId</code> attribute.
	 * @return the catalogId - This is the Catalog ID for each Product.
	 */
	public String getCatalogId()
	{
		return getCatalogId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.catalogId</code> attribute. 
	 * @param value the catalogId - This is the Catalog ID for each Product.
	 */
	public void setCatalogId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATALOGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.catalogId</code> attribute. 
	 * @param value the catalogId - This is the Catalog ID for each Product.
	 */
	public void setCatalogId(final String value)
	{
		setCatalogId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.coldChainProduct</code> attribute.
	 * @return the coldChainProduct
	 */
	public Boolean isColdChainProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COLDCHAINPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.coldChainProduct</code> attribute.
	 * @return the coldChainProduct
	 */
	public Boolean isColdChainProduct()
	{
		return isColdChainProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @return the coldChainProduct
	 */
	public boolean isColdChainProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isColdChainProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @return the coldChainProduct
	 */
	public boolean isColdChainProductAsPrimitive()
	{
		return isColdChainProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @param value the coldChainProduct
	 */
	public void setColdChainProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COLDCHAINPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @param value the coldChainProduct
	 */
	public void setColdChainProduct(final Boolean value)
	{
		setColdChainProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @param value the coldChainProduct
	 */
	public void setColdChainProduct(final SessionContext ctx, final boolean value)
	{
		setColdChainProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.coldChainProduct</code> attribute. 
	 * @param value the coldChainProduct
	 */
	public void setColdChainProduct(final boolean value)
	{
		setColdChainProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.copyApprovalDate</code> attribute.
	 * @return the copyApprovalDate - This attribute is part of PCM Rich Content Attributes
	 */
	public Date getCopyApprovalDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, COPYAPPROVALDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.copyApprovalDate</code> attribute.
	 * @return the copyApprovalDate - This attribute is part of PCM Rich Content Attributes
	 */
	public Date getCopyApprovalDate()
	{
		return getCopyApprovalDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.copyApprovalDate</code> attribute. 
	 * @param value the copyApprovalDate - This attribute is part of PCM Rich Content Attributes
	 */
	public void setCopyApprovalDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, COPYAPPROVALDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.copyApprovalDate</code> attribute. 
	 * @param value the copyApprovalDate - This attribute is part of PCM Rich Content Attributes
	 */
	public void setCopyApprovalDate(final Date value)
	{
		setCopyApprovalDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.copyApprovalReference</code> attribute.
	 * @return the copyApprovalReference - This attribute is part of PCM Rich Content Attributes
	 */
	public String getCopyApprovalReference(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPYAPPROVALREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.copyApprovalReference</code> attribute.
	 * @return the copyApprovalReference - This attribute is part of PCM Rich Content Attributes
	 */
	public String getCopyApprovalReference()
	{
		return getCopyApprovalReference( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.copyApprovalReference</code> attribute. 
	 * @param value the copyApprovalReference - This attribute is part of PCM Rich Content Attributes
	 */
	public void setCopyApprovalReference(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPYAPPROVALREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.copyApprovalReference</code> attribute. 
	 * @param value the copyApprovalReference - This attribute is part of PCM Rich Content Attributes
	 */
	public void setCopyApprovalReference(final String value)
	{
		setCopyApprovalReference( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.countries</code> attribute.
	 * @return the countries
	 */
	public Collection<Country> getCountries(final SessionContext ctx)
	{
		final List<Country> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			"Country",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.countries</code> attribute.
	 * @return the countries
	 */
	public Collection<Country> getCountries()
	{
		return getCountries( getSession().getSessionContext() );
	}
	
	public long getCountriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			"Country",
			null
		);
	}
	
	public long getCountriesCount()
	{
		return getCountriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final SessionContext ctx, final Collection<Country> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final Collection<Country> value)
	{
		setCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final SessionContext ctx, final Country value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final Country value)
	{
		addToCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final SessionContext ctx, final Country value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final Country value)
	{
		removeFromCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.cpsiDetails</code> attribute.
	 * @return the cpsiDetails
	 */
	public Set<JnjGTProductCpscDetail> getCpsiDetails(final SessionContext ctx)
	{
		return (Set<JnjGTProductCpscDetail>)CPSIDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.cpsiDetails</code> attribute.
	 * @return the cpsiDetails
	 */
	public Set<JnjGTProductCpscDetail> getCpsiDetails()
	{
		return getCpsiDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.cpsiDetails</code> attribute. 
	 * @param value the cpsiDetails
	 */
	public void setCpsiDetails(final SessionContext ctx, final Set<JnjGTProductCpscDetail> value)
	{
		CPSIDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.cpsiDetails</code> attribute. 
	 * @param value the cpsiDetails
	 */
	public void setCpsiDetails(final Set<JnjGTProductCpscDetail> value)
	{
		setCpsiDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cpsiDetails. 
	 * @param value the item to add to cpsiDetails
	 */
	public void addToCpsiDetails(final SessionContext ctx, final JnjGTProductCpscDetail value)
	{
		CPSIDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cpsiDetails. 
	 * @param value the item to add to cpsiDetails
	 */
	public void addToCpsiDetails(final JnjGTProductCpscDetail value)
	{
		addToCpsiDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cpsiDetails. 
	 * @param value the item to remove from cpsiDetails
	 */
	public void removeFromCpsiDetails(final SessionContext ctx, final JnjGTProductCpscDetail value)
	{
		CPSIDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cpsiDetails. 
	 * @param value the item to remove from cpsiDetails
	 */
	public void removeFromCpsiDetails(final JnjGTProductCpscDetail value)
	{
		removeFromCpsiDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.dChainStatusEffectiveDate</code> attribute.
	 * @return the dChainStatusEffectiveDate
	 */
	public Date getDChainStatusEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DCHAINSTATUSEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.dChainStatusEffectiveDate</code> attribute.
	 * @return the dChainStatusEffectiveDate
	 */
	public Date getDChainStatusEffectiveDate()
	{
		return getDChainStatusEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.dChainStatusEffectiveDate</code> attribute. 
	 * @param value the dChainStatusEffectiveDate
	 */
	public void setDChainStatusEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DCHAINSTATUSEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.dChainStatusEffectiveDate</code> attribute. 
	 * @param value the dChainStatusEffectiveDate
	 */
	public void setDChainStatusEffectiveDate(final Date value)
	{
		setDChainStatusEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deaRegInd</code> attribute.
	 * @return the deaRegInd
	 */
	public Boolean isDeaRegInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEAREGIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deaRegInd</code> attribute.
	 * @return the deaRegInd
	 */
	public Boolean isDeaRegInd()
	{
		return isDeaRegInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @return the deaRegInd
	 */
	public boolean isDeaRegIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeaRegInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @return the deaRegInd
	 */
	public boolean isDeaRegIndAsPrimitive()
	{
		return isDeaRegIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEAREGIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final Boolean value)
	{
		setDeaRegInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final SessionContext ctx, final boolean value)
	{
		setDeaRegInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deaRegInd</code> attribute. 
	 * @param value the deaRegInd
	 */
	public void setDeaRegInd(final boolean value)
	{
		setDeaRegInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deliveryUnitOfMeasure</code> attribute.
	 * @return the deliveryUnitOfMeasure
	 */
	public Unit getDeliveryUnitOfMeasure(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, DELIVERYUNITOFMEASURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.deliveryUnitOfMeasure</code> attribute.
	 * @return the deliveryUnitOfMeasure
	 */
	public Unit getDeliveryUnitOfMeasure()
	{
		return getDeliveryUnitOfMeasure( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deliveryUnitOfMeasure</code> attribute. 
	 * @param value the deliveryUnitOfMeasure
	 */
	public void setDeliveryUnitOfMeasure(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, DELIVERYUNITOFMEASURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.deliveryUnitOfMeasure</code> attribute. 
	 * @param value the deliveryUnitOfMeasure
	 */
	public void setDeliveryUnitOfMeasure(final Unit value)
	{
		setDeliveryUnitOfMeasure( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.descriptionText</code> attribute.
	 * @return the descriptionText
	 */
	public String getDescriptionText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getDescriptionText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTIONTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.descriptionText</code> attribute.
	 * @return the descriptionText
	 */
	public String getDescriptionText()
	{
		return getDescriptionText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @return the localized descriptionText
	 */
	public Map<Language,String> getAllDescriptionText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTIONTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @return the localized descriptionText
	 */
	public Map<Language,String> getAllDescriptionText()
	{
		return getAllDescriptionText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @param value the descriptionText
	 */
	public void setDescriptionText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setDescriptionText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @param value the descriptionText
	 */
	public void setDescriptionText(final String value)
	{
		setDescriptionText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @param value the descriptionText
	 */
	public void setAllDescriptionText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.descriptionText</code> attribute. 
	 * @param value the descriptionText
	 */
	public void setAllDescriptionText(final Map<Language,String> value)
	{
		setAllDescriptionText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.direction</code> attribute.
	 * @return the direction - This attribute is part of PCM Labeling Attributes
	 */
	public String getDirection(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getDirection requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DIRECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.direction</code> attribute.
	 * @return the direction - This attribute is part of PCM Labeling Attributes
	 */
	public String getDirection()
	{
		return getDirection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.direction</code> attribute. 
	 * @return the localized direction - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllDirection(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DIRECTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.direction</code> attribute. 
	 * @return the localized direction - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllDirection()
	{
		return getAllDirection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.direction</code> attribute. 
	 * @param value the direction - This attribute is part of PCM Labeling Attributes
	 */
	public void setDirection(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setDirection requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DIRECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.direction</code> attribute. 
	 * @param value the direction - This attribute is part of PCM Labeling Attributes
	 */
	public void setDirection(final String value)
	{
		setDirection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.direction</code> attribute. 
	 * @param value the direction - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllDirection(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DIRECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.direction</code> attribute. 
	 * @param value the direction - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllDirection(final Map<Language,String> value)
	{
		setAllDirection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.directionText</code> attribute.
	 * @return the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public String getDirectionText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getDirectionText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DIRECTIONTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.directionText</code> attribute.
	 * @return the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public String getDirectionText()
	{
		return getDirectionText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.directionText</code> attribute. 
	 * @return the localized directionText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllDirectionText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DIRECTIONTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.directionText</code> attribute. 
	 * @return the localized directionText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllDirectionText()
	{
		return getAllDirectionText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.directionText</code> attribute. 
	 * @param value the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public void setDirectionText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setDirectionText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DIRECTIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.directionText</code> attribute. 
	 * @param value the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public void setDirectionText(final String value)
	{
		setDirectionText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.directionText</code> attribute. 
	 * @param value the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllDirectionText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DIRECTIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.directionText</code> attribute. 
	 * @param value the directionText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllDirectionText(final Map<Language,String> value)
	{
		setAllDirectionText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.disContinue</code> attribute.
	 * @return the disContinue
	 */
	public Boolean isDisContinue(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISCONTINUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.disContinue</code> attribute.
	 * @return the disContinue
	 */
	public Boolean isDisContinue()
	{
		return isDisContinue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @return the disContinue
	 */
	public boolean isDisContinueAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisContinue( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @return the disContinue
	 */
	public boolean isDisContinueAsPrimitive()
	{
		return isDisContinueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @param value the disContinue
	 */
	public void setDisContinue(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISCONTINUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @param value the disContinue
	 */
	public void setDisContinue(final Boolean value)
	{
		setDisContinue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @param value the disContinue
	 */
	public void setDisContinue(final SessionContext ctx, final boolean value)
	{
		setDisContinue( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.disContinue</code> attribute. 
	 * @param value the disContinue
	 */
	public void setDisContinue(final boolean value)
	{
		setDisContinue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ecommerceFlag</code> attribute.
	 * @return the ecommerceFlag
	 */
	public Boolean isEcommerceFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ECOMMERCEFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ecommerceFlag</code> attribute.
	 * @return the ecommerceFlag
	 */
	public Boolean isEcommerceFlag()
	{
		return isEcommerceFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @return the ecommerceFlag
	 */
	public boolean isEcommerceFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEcommerceFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @return the ecommerceFlag
	 */
	public boolean isEcommerceFlagAsPrimitive()
	{
		return isEcommerceFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @param value the ecommerceFlag
	 */
	public void setEcommerceFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ECOMMERCEFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @param value the ecommerceFlag
	 */
	public void setEcommerceFlag(final Boolean value)
	{
		setEcommerceFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @param value the ecommerceFlag
	 */
	public void setEcommerceFlag(final SessionContext ctx, final boolean value)
	{
		setEcommerceFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ecommerceFlag</code> attribute. 
	 * @param value the ecommerceFlag
	 */
	public void setEcommerceFlag(final boolean value)
	{
		setEcommerceFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.firstLevelCategory</code> attribute.
	 * @return the firstLevelCategory
	 */
	public String getFirstLevelCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTLEVELCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.firstLevelCategory</code> attribute.
	 * @return the firstLevelCategory
	 */
	public String getFirstLevelCategory()
	{
		return getFirstLevelCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.firstLevelCategory</code> attribute. 
	 * @param value the firstLevelCategory
	 */
	public void setFirstLevelCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTLEVELCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.firstLevelCategory</code> attribute. 
	 * @param value the firstLevelCategory
	 */
	public void setFirstLevelCategory(final String value)
	{
		setFirstLevelCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.firstShipEffectDate</code> attribute.
	 * @return the firstShipEffectDate
	 */
	public Date getFirstShipEffectDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FIRSTSHIPEFFECTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.firstShipEffectDate</code> attribute.
	 * @return the firstShipEffectDate
	 */
	public Date getFirstShipEffectDate()
	{
		return getFirstShipEffectDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.firstShipEffectDate</code> attribute. 
	 * @param value the firstShipEffectDate
	 */
	public void setFirstShipEffectDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FIRSTSHIPEFFECTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.firstShipEffectDate</code> attribute. 
	 * @param value the firstShipEffectDate
	 */
	public void setFirstShipEffectDate(final Date value)
	{
		setFirstShipEffectDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.franchiseName</code> attribute.
	 * @return the franchiseName
	 */
	public String getFranchiseName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANCHISENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.franchiseName</code> attribute.
	 * @return the franchiseName
	 */
	public String getFranchiseName()
	{
		return getFranchiseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.franchiseName</code> attribute. 
	 * @param value the franchiseName
	 */
	public void setFranchiseName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANCHISENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.franchiseName</code> attribute. 
	 * @param value the franchiseName
	 */
	public void setFranchiseName(final String value)
	{
		setFranchiseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.francMjrPrdGrpCd</code> attribute.
	 * @return the francMjrPrdGrpCd - A higher level grouping of products.  This will be defined by the Operating Company. Applicable only for MDD products.
	 */
	public String getFrancMjrPrdGrpCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANCMJRPRDGRPCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.francMjrPrdGrpCd</code> attribute.
	 * @return the francMjrPrdGrpCd - A higher level grouping of products.  This will be defined by the Operating Company. Applicable only for MDD products.
	 */
	public String getFrancMjrPrdGrpCd()
	{
		return getFrancMjrPrdGrpCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.francMjrPrdGrpCd</code> attribute. 
	 * @param value the francMjrPrdGrpCd - A higher level grouping of products.  This will be defined by the Operating Company. Applicable only for MDD products.
	 */
	public void setFrancMjrPrdGrpCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANCMJRPRDGRPCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.francMjrPrdGrpCd</code> attribute. 
	 * @param value the francMjrPrdGrpCd - A higher level grouping of products.  This will be defined by the Operating Company. Applicable only for MDD products.
	 */
	public void setFrancMjrPrdGrpCd(final String value)
	{
		setFrancMjrPrdGrpCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ghexInd</code> attribute.
	 * @return the ghexInd
	 */
	public Boolean isGhexInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GHEXIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ghexInd</code> attribute.
	 * @return the ghexInd
	 */
	public Boolean isGhexInd()
	{
		return isGhexInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @return the ghexInd
	 */
	public boolean isGhexIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGhexInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @return the ghexInd
	 */
	public boolean isGhexIndAsPrimitive()
	{
		return isGhexIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GHEXIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final Boolean value)
	{
		setGhexInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final SessionContext ctx, final boolean value)
	{
		setGhexInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ghexInd</code> attribute. 
	 * @param value the ghexInd
	 */
	public void setGhexInd(final boolean value)
	{
		setGhexInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.globalBusinessUnit</code> attribute.
	 * @return the globalBusinessUnit - This attribute is part of MDM Attributes for PCM
	 */
	public String getGlobalBusinessUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALBUSINESSUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.globalBusinessUnit</code> attribute.
	 * @return the globalBusinessUnit - This attribute is part of MDM Attributes for PCM
	 */
	public String getGlobalBusinessUnit()
	{
		return getGlobalBusinessUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.globalBusinessUnit</code> attribute. 
	 * @param value the globalBusinessUnit - This attribute is part of MDM Attributes for PCM
	 */
	public void setGlobalBusinessUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALBUSINESSUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.globalBusinessUnit</code> attribute. 
	 * @param value the globalBusinessUnit - This attribute is part of MDM Attributes for PCM
	 */
	public void setGlobalBusinessUnit(final String value)
	{
		setGlobalBusinessUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.globalProductCode</code> attribute.
	 * @return the globalProductCode - This attribute is part of PCM MDM attribute
	 */
	public String getGlobalProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.globalProductCode</code> attribute.
	 * @return the globalProductCode - This attribute is part of PCM MDM attribute
	 */
	public String getGlobalProductCode()
	{
		return getGlobalProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.globalProductCode</code> attribute. 
	 * @param value the globalProductCode - This attribute is part of PCM MDM attribute
	 */
	public void setGlobalProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.globalProductCode</code> attribute. 
	 * @param value the globalProductCode - This attribute is part of PCM MDM attribute
	 */
	public void setGlobalProductCode(final String value)
	{
		setGlobalProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.hazmatCode</code> attribute.
	 * @return the hazmatCode
	 */
	public String getHazmatCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HAZMATCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.hazmatCode</code> attribute.
	 * @return the hazmatCode
	 */
	public String getHazmatCode()
	{
		return getHazmatCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.hazmatCode</code> attribute. 
	 * @param value the hazmatCode
	 */
	public void setHazmatCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HAZMATCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.hazmatCode</code> attribute. 
	 * @param value the hazmatCode
	 */
	public void setHazmatCode(final String value)
	{
		setHazmatCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.height</code> attribute.
	 * @return the height
	 */
	public Double getHeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.height</code> attribute.
	 * @return the height
	 */
	public Double getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.height</code> attribute. 
	 * @return the height
	 */
	public double getHeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getHeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.height</code> attribute. 
	 * @return the height
	 */
	public double getHeightAsPrimitive()
	{
		return getHeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final Double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final double value)
	{
		setHeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageAvailableInd</code> attribute.
	 * @return the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public Integer getImageAvailableInd(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IMAGEAVAILABLEIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageAvailableInd</code> attribute.
	 * @return the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public Integer getImageAvailableInd()
	{
		return getImageAvailableInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @return the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public int getImageAvailableIndAsPrimitive(final SessionContext ctx)
	{
		Integer value = getImageAvailableInd( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @return the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public int getImageAvailableIndAsPrimitive()
	{
		return getImageAvailableIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @param value the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public void setImageAvailableInd(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IMAGEAVAILABLEIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @param value the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public void setImageAvailableInd(final Integer value)
	{
		setImageAvailableInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @param value the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public void setImageAvailableInd(final SessionContext ctx, final int value)
	{
		setImageAvailableInd( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageAvailableInd</code> attribute. 
	 * @param value the imageAvailableInd - Number of images that are viewable for the specified product.
	 */
	public void setImageAvailableInd(final int value)
	{
		setImageAvailableInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageLastUpdateDate</code> attribute.
	 * @return the imageLastUpdateDate - This attribute is part of PCM Imagery Attributes
	 */
	public Date getImageLastUpdateDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, IMAGELASTUPDATEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageLastUpdateDate</code> attribute.
	 * @return the imageLastUpdateDate - This attribute is part of PCM Imagery Attributes
	 */
	public Date getImageLastUpdateDate()
	{
		return getImageLastUpdateDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageLastUpdateDate</code> attribute. 
	 * @param value the imageLastUpdateDate - This attribute is part of PCM Imagery Attributes
	 */
	public void setImageLastUpdateDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, IMAGELASTUPDATEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageLastUpdateDate</code> attribute. 
	 * @param value the imageLastUpdateDate - This attribute is part of PCM Imagery Attributes
	 */
	public void setImageLastUpdateDate(final Date value)
	{
		setImageLastUpdateDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute.
	 * @return the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public Boolean isImageNeedsToBeConverted(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, IMAGENEEDSTOBECONVERTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute.
	 * @return the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public Boolean isImageNeedsToBeConverted()
	{
		return isImageNeedsToBeConverted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @return the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public boolean isImageNeedsToBeConvertedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isImageNeedsToBeConverted( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @return the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public boolean isImageNeedsToBeConvertedAsPrimitive()
	{
		return isImageNeedsToBeConvertedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @param value the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public void setImageNeedsToBeConverted(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, IMAGENEEDSTOBECONVERTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @param value the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public void setImageNeedsToBeConverted(final Boolean value)
	{
		setImageNeedsToBeConverted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @param value the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public void setImageNeedsToBeConverted(final SessionContext ctx, final boolean value)
	{
		setImageNeedsToBeConverted( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.imageNeedsToBeConverted</code> attribute. 
	 * @param value the imageNeedsToBeConverted - Flag to indicate if images needs to be converted for product
	 */
	public void setImageNeedsToBeConverted(final boolean value)
	{
		setImageNeedsToBeConverted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.includedUnits</code> attribute.
	 * @return the includedUnits
	 */
	public Set<JnJB2BUnit> getIncludedUnits(final SessionContext ctx)
	{
		final List<JnJB2BUnit> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			"JnJB2BUnit",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJB2BUnit>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.includedUnits</code> attribute.
	 * @return the includedUnits
	 */
	public Set<JnJB2BUnit> getIncludedUnits()
	{
		return getIncludedUnits( getSession().getSessionContext() );
	}
	
	public long getIncludedUnitsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			"JnJB2BUnit",
			null
		);
	}
	
	public long getIncludedUnitsCount()
	{
		return getIncludedUnitsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.includedUnits</code> attribute. 
	 * @param value the includedUnits
	 */
	public void setIncludedUnits(final SessionContext ctx, final Set<JnJB2BUnit> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.includedUnits</code> attribute. 
	 * @param value the includedUnits
	 */
	public void setIncludedUnits(final Set<JnJB2BUnit> value)
	{
		setIncludedUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedUnits. 
	 * @param value the item to add to includedUnits
	 */
	public void addToIncludedUnits(final SessionContext ctx, final JnJB2BUnit value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedUnits. 
	 * @param value the item to add to includedUnits
	 */
	public void addToIncludedUnits(final JnJB2BUnit value)
	{
		addToIncludedUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedUnits. 
	 * @param value the item to remove from includedUnits
	 */
	public void removeFromIncludedUnits(final SessionContext ctx, final JnJB2BUnit value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJB2BUNITTOINCLUDEDPRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedUnits. 
	 * @param value the item to remove from includedUnits
	 */
	public void removeFromIncludedUnits(final JnJB2BUnit value)
	{
		removeFromIncludedUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indication</code> attribute.
	 * @return the indication - This attribute is part of PCM Labeling Attributes
	 */
	public String getIndication(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getIndication requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INDICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indication</code> attribute.
	 * @return the indication - This attribute is part of PCM Labeling Attributes
	 */
	public String getIndication()
	{
		return getIndication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indication</code> attribute. 
	 * @return the localized indication - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllIndication(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INDICATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indication</code> attribute. 
	 * @return the localized indication - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllIndication()
	{
		return getAllIndication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indication</code> attribute. 
	 * @param value the indication - This attribute is part of PCM Labeling Attributes
	 */
	public void setIndication(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setIndication requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INDICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indication</code> attribute. 
	 * @param value the indication - This attribute is part of PCM Labeling Attributes
	 */
	public void setIndication(final String value)
	{
		setIndication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indication</code> attribute. 
	 * @param value the indication - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllIndication(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INDICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indication</code> attribute. 
	 * @param value the indication - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllIndication(final Map<Language,String> value)
	{
		setAllIndication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indicationText</code> attribute.
	 * @return the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public String getIndicationText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getIndicationText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INDICATIONTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indicationText</code> attribute.
	 * @return the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public String getIndicationText()
	{
		return getIndicationText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @return the localized indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllIndicationText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INDICATIONTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @return the localized indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllIndicationText()
	{
		return getAllIndicationText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @param value the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public void setIndicationText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setIndicationText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INDICATIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @param value the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public void setIndicationText(final String value)
	{
		setIndicationText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @param value the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllIndicationText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INDICATIONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.indicationText</code> attribute. 
	 * @param value the indicationText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllIndicationText(final Map<Language,String> value)
	{
		setAllIndicationText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.inFieldInd</code> attribute.
	 * @return the inFieldInd
	 */
	public Boolean isInFieldInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INFIELDIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.inFieldInd</code> attribute.
	 * @return the inFieldInd
	 */
	public Boolean isInFieldInd()
	{
		return isInFieldInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @return the inFieldInd
	 */
	public boolean isInFieldIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInFieldInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @return the inFieldInd
	 */
	public boolean isInFieldIndAsPrimitive()
	{
		return isInFieldIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INFIELDIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final Boolean value)
	{
		setInFieldInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final SessionContext ctx, final boolean value)
	{
		setInFieldInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final boolean value)
	{
		setInFieldInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredient</code> attribute.
	 * @return the ingredient
	 */
	public String getIngredient(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getIngredient requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INGREDIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredient</code> attribute.
	 * @return the ingredient
	 */
	public String getIngredient()
	{
		return getIngredient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @return the localized ingredient
	 */
	public Map<Language,String> getAllIngredient(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INGREDIENT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @return the localized ingredient
	 */
	public Map<Language,String> getAllIngredient()
	{
		return getAllIngredient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setIngredient(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setIngredient requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INGREDIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setIngredient(final String value)
	{
		setIngredient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setAllIngredient(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INGREDIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setAllIngredient(final Map<Language,String> value)
	{
		setAllIngredient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredientText</code> attribute.
	 * @return the ingredientText
	 */
	public String getIngredientText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getIngredientText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INGREDIENTTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredientText</code> attribute.
	 * @return the ingredientText
	 */
	public String getIngredientText()
	{
		return getIngredientText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @return the localized ingredientText
	 */
	public Map<Language,String> getAllIngredientText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INGREDIENTTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @return the localized ingredientText
	 */
	public Map<Language,String> getAllIngredientText()
	{
		return getAllIngredientText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @param value the ingredientText
	 */
	public void setIngredientText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setIngredientText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INGREDIENTTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @param value the ingredientText
	 */
	public void setIngredientText(final String value)
	{
		setIngredientText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @param value the ingredientText
	 */
	public void setAllIngredientText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INGREDIENTTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.ingredientText</code> attribute. 
	 * @param value the ingredientText
	 */
	public void setAllIngredientText(final Map<Language,String> value)
	{
		setAllIngredientText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.invalidInPrcieList</code> attribute.
	 * @return the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public Boolean isInvalidInPrcieList(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INVALIDINPRCIELIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.invalidInPrcieList</code> attribute.
	 * @return the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public Boolean isInvalidInPrcieList()
	{
		return isInvalidInPrcieList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @return the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public boolean isInvalidInPrcieListAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInvalidInPrcieList( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @return the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public boolean isInvalidInPrcieListAsPrimitive()
	{
		return isInvalidInPrcieListAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @param value the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public void setInvalidInPrcieList(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INVALIDINPRCIELIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @param value the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public void setInvalidInPrcieList(final Boolean value)
	{
		setInvalidInPrcieList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @param value the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public void setInvalidInPrcieList(final SessionContext ctx, final boolean value)
	{
		setInvalidInPrcieList( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.invalidInPrcieList</code> attribute. 
	 * @param value the invalidInPrcieList - This field is used by PCM Admin to enable and disable the product for PCM site.
	 */
	public void setInvalidInPrcieList(final boolean value)
	{
		setInvalidInPrcieList( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Country");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("JnJB2BUnit");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJB2BUNITTOINCLUDEDPRODUCTS_MARKMODIFIED);
		}
		ComposedType relationSecondEnd2 = TypeManager.getInstance().getComposedType("JnJGTProductSalesOrg");
		if(relationSecondEnd2.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED);
		}
		ComposedType relationSecondEnd3 = TypeManager.getInstance().getComposedType("JnjGTProductKit");
		if(relationSecondEnd3.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED);
		}
		ComposedType relationSecondEnd4 = TypeManager.getInstance().getComposedType("JnjGTProductPlant");
		if(relationSecondEnd4.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjGTProductReg</code> attribute.
	 * @return the jnjGTProductReg
	 */
	public Set<JnjGTProductReg> getJnjGTProductReg(final SessionContext ctx)
	{
		return (Set<JnjGTProductReg>)JNJGTPRODUCTREGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjGTProductReg</code> attribute.
	 * @return the jnjGTProductReg
	 */
	public Set<JnjGTProductReg> getJnjGTProductReg()
	{
		return getJnjGTProductReg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjGTProductReg</code> attribute. 
	 * @param value the jnjGTProductReg
	 */
	public void setJnjGTProductReg(final SessionContext ctx, final Set<JnjGTProductReg> value)
	{
		JNJGTPRODUCTREGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjGTProductReg</code> attribute. 
	 * @param value the jnjGTProductReg
	 */
	public void setJnjGTProductReg(final Set<JnjGTProductReg> value)
	{
		setJnjGTProductReg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjGTProductReg. 
	 * @param value the item to add to jnjGTProductReg
	 */
	public void addToJnjGTProductReg(final SessionContext ctx, final JnjGTProductReg value)
	{
		JNJGTPRODUCTREGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjGTProductReg. 
	 * @param value the item to add to jnjGTProductReg
	 */
	public void addToJnjGTProductReg(final JnjGTProductReg value)
	{
		addToJnjGTProductReg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjGTProductReg. 
	 * @param value the item to remove from jnjGTProductReg
	 */
	public void removeFromJnjGTProductReg(final SessionContext ctx, final JnjGTProductReg value)
	{
		JNJGTPRODUCTREGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjGTProductReg. 
	 * @param value the item to remove from jnjGTProductReg
	 */
	public void removeFromJnjGTProductReg(final JnjGTProductReg value)
	{
		removeFromJnjGTProductReg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjGTProductUnitLocal</code> attribute.
	 * @return the jnjGTProductUnitLocal
	 */
	public Set<JnJGTProductUnitLocal> getJnjGTProductUnitLocal(final SessionContext ctx)
	{
		return (Set<JnJGTProductUnitLocal>)JNJGTPRODUCTUNITLOCALHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjGTProductUnitLocal</code> attribute.
	 * @return the jnjGTProductUnitLocal
	 */
	public Set<JnJGTProductUnitLocal> getJnjGTProductUnitLocal()
	{
		return getJnjGTProductUnitLocal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjGTProductUnitLocal</code> attribute. 
	 * @param value the jnjGTProductUnitLocal
	 */
	public void setJnjGTProductUnitLocal(final SessionContext ctx, final Set<JnJGTProductUnitLocal> value)
	{
		JNJGTPRODUCTUNITLOCALHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjGTProductUnitLocal</code> attribute. 
	 * @param value the jnjGTProductUnitLocal
	 */
	public void setJnjGTProductUnitLocal(final Set<JnJGTProductUnitLocal> value)
	{
		setJnjGTProductUnitLocal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjGTProductUnitLocal. 
	 * @param value the item to add to jnjGTProductUnitLocal
	 */
	public void addToJnjGTProductUnitLocal(final SessionContext ctx, final JnJGTProductUnitLocal value)
	{
		JNJGTPRODUCTUNITLOCALHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to jnjGTProductUnitLocal. 
	 * @param value the item to add to jnjGTProductUnitLocal
	 */
	public void addToJnjGTProductUnitLocal(final JnJGTProductUnitLocal value)
	{
		addToJnjGTProductUnitLocal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjGTProductUnitLocal. 
	 * @param value the item to remove from jnjGTProductUnitLocal
	 */
	public void removeFromJnjGTProductUnitLocal(final SessionContext ctx, final JnJGTProductUnitLocal value)
	{
		JNJGTPRODUCTUNITLOCALHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from jnjGTProductUnitLocal. 
	 * @param value the item to remove from jnjGTProductUnitLocal
	 */
	public void removeFromJnjGTProductUnitLocal(final JnJGTProductUnitLocal value)
	{
		removeFromJnjGTProductUnitLocal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjPortalInd</code> attribute.
	 * @return the jnjPortalInd
	 */
	public Boolean isJnjPortalInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, JNJPORTALIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjPortalInd</code> attribute.
	 * @return the jnjPortalInd
	 */
	public Boolean isJnjPortalInd()
	{
		return isJnjPortalInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @return the jnjPortalInd
	 */
	public boolean isJnjPortalIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isJnjPortalInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @return the jnjPortalInd
	 */
	public boolean isJnjPortalIndAsPrimitive()
	{
		return isJnjPortalIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, JNJPORTALIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final Boolean value)
	{
		setJnjPortalInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final SessionContext ctx, final boolean value)
	{
		setJnjPortalInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.jnjPortalInd</code> attribute. 
	 * @param value the jnjPortalInd
	 */
	public void setJnjPortalInd(final boolean value)
	{
		setJnjPortalInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitInd</code> attribute.
	 * @return the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public Boolean isKitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, KITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitInd</code> attribute.
	 * @return the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public Boolean isKitInd()
	{
		return isKitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @return the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public boolean isKitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isKitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @return the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public boolean isKitIndAsPrimitive()
	{
		return isKitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @param value the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public void setKitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, KITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @param value the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public void setKitInd(final Boolean value)
	{
		setKitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @param value the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public void setKitInd(final SessionContext ctx, final boolean value)
	{
		setKitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitInd</code> attribute. 
	 * @param value the kitInd - Kit Indicator is part of PCM MDM attribute
	 */
	public void setKitInd(final boolean value)
	{
		setKitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitSubType</code> attribute.
	 * @return the kitSubType - This specifies the KIT Sub Type for KIT Product.
	 */
	public EnumerationValue getKitSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, KITSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitSubType</code> attribute.
	 * @return the kitSubType - This specifies the KIT Sub Type for KIT Product.
	 */
	public EnumerationValue getKitSubType()
	{
		return getKitSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitSubType</code> attribute. 
	 * @param value the kitSubType - This specifies the KIT Sub Type for KIT Product.
	 */
	public void setKitSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, KITSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitSubType</code> attribute. 
	 * @param value the kitSubType - This specifies the KIT Sub Type for KIT Product.
	 */
	public void setKitSubType(final EnumerationValue value)
	{
		setKitSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitType</code> attribute.
	 * @return the kitType - This specifies the KIT Type for KIT Product.
	 */
	public EnumerationValue getKitType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, KITTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.kitType</code> attribute.
	 * @return the kitType - This specifies the KIT Type for KIT Product.
	 */
	public EnumerationValue getKitType()
	{
		return getKitType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitType</code> attribute. 
	 * @param value the kitType - This specifies the KIT Type for KIT Product.
	 */
	public void setKitType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, KITTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.kitType</code> attribute. 
	 * @param value the kitType - This specifies the KIT Type for KIT Product.
	 */
	public void setKitType(final EnumerationValue value)
	{
		setKitType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.length</code> attribute.
	 * @return the length
	 */
	public Double getLength(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.length</code> attribute.
	 * @return the length
	 */
	public Double getLength()
	{
		return getLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.length</code> attribute. 
	 * @return the length
	 */
	public double getLengthAsPrimitive(final SessionContext ctx)
	{
		Double value = getLength( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.length</code> attribute. 
	 * @return the length
	 */
	public double getLengthAsPrimitive()
	{
		return getLengthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final Double value)
	{
		setLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final SessionContext ctx, final double value)
	{
		setLength( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final double value)
	{
		setLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBullet</code> attribute.
	 * @return the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public String getLongBullet(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getLongBullet requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LONGBULLET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBullet</code> attribute.
	 * @return the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public String getLongBullet()
	{
		return getLongBullet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @return the localized longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllLongBullet(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LONGBULLET,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @return the localized longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllLongBullet()
	{
		return getAllLongBullet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @param value the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public void setLongBullet(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setLongBullet requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LONGBULLET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @param value the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public void setLongBullet(final String value)
	{
		setLongBullet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @param value the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllLongBullet(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LONGBULLET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBullet</code> attribute. 
	 * @param value the longBullet - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllLongBullet(final Map<Language,String> value)
	{
		setAllLongBullet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBulletText</code> attribute.
	 * @return the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public String getLongBulletText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getLongBulletText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LONGBULLETTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBulletText</code> attribute.
	 * @return the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public String getLongBulletText()
	{
		return getLongBulletText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @return the localized longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllLongBulletText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LONGBULLETTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @return the localized longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllLongBulletText()
	{
		return getAllLongBulletText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @param value the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setLongBulletText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setLongBulletText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LONGBULLETTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @param value the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setLongBulletText(final String value)
	{
		setLongBulletText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @param value the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllLongBulletText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LONGBULLETTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.longBulletText</code> attribute. 
	 * @param value the longBulletText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllLongBulletText(final Map<Language,String> value)
	{
		setAllLongBulletText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialBaseNum</code> attribute.
	 * @return the materialBaseNum - This attribute is part of PCM MDM attribute
	 */
	public String getMaterialBaseNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALBASENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialBaseNum</code> attribute.
	 * @return the materialBaseNum - This attribute is part of PCM MDM attribute
	 */
	public String getMaterialBaseNum()
	{
		return getMaterialBaseNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialBaseNum</code> attribute. 
	 * @param value the materialBaseNum - This attribute is part of PCM MDM attribute
	 */
	public void setMaterialBaseNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALBASENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialBaseNum</code> attribute. 
	 * @param value the materialBaseNum - This attribute is part of PCM MDM attribute
	 */
	public void setMaterialBaseNum(final String value)
	{
		setMaterialBaseNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialBaseProduct</code> attribute.
	 * @return the materialBaseProduct
	 */
	public JnJProduct getMaterialBaseProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, MATERIALBASEPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialBaseProduct</code> attribute.
	 * @return the materialBaseProduct
	 */
	public JnJProduct getMaterialBaseProduct()
	{
		return getMaterialBaseProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialBaseProduct</code> attribute. 
	 * @param value the materialBaseProduct
	 */
	public void setMaterialBaseProduct(final SessionContext ctx, final JnJProduct value)
	{
		setProperty(ctx, MATERIALBASEPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialBaseProduct</code> attribute. 
	 * @param value the materialBaseProduct
	 */
	public void setMaterialBaseProduct(final JnJProduct value)
	{
		setMaterialBaseProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialStatusEffectDate</code> attribute.
	 * @return the materialStatusEffectDate - This attribute is part of PCM MDM attribute, Products.Cross Distribution Channel Status Validity Date
	 */
	public Date getMaterialStatusEffectDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MATERIALSTATUSEFFECTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialStatusEffectDate</code> attribute.
	 * @return the materialStatusEffectDate - This attribute is part of PCM MDM attribute, Products.Cross Distribution Channel Status Validity Date
	 */
	public Date getMaterialStatusEffectDate()
	{
		return getMaterialStatusEffectDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialStatusEffectDate</code> attribute. 
	 * @param value the materialStatusEffectDate - This attribute is part of PCM MDM attribute, Products.Cross Distribution Channel Status Validity Date
	 */
	public void setMaterialStatusEffectDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MATERIALSTATUSEFFECTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialStatusEffectDate</code> attribute. 
	 * @param value the materialStatusEffectDate - This attribute is part of PCM MDM attribute, Products.Cross Distribution Channel Status Validity Date
	 */
	public void setMaterialStatusEffectDate(final Date value)
	{
		setMaterialStatusEffectDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialType</code> attribute.
	 * @return the materialType
	 */
	public String getMaterialType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.materialType</code> attribute.
	 * @return the materialType
	 */
	public String getMaterialType()
	{
		return getMaterialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialType</code> attribute. 
	 * @param value the materialType
	 */
	public void setMaterialType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.materialType</code> attribute. 
	 * @param value the materialType
	 */
	public void setMaterialType(final String value)
	{
		setMaterialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.mdmDescription</code> attribute.
	 * @return the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public String getMdmDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getMdmDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MDMDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.mdmDescription</code> attribute.
	 * @return the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public String getMdmDescription()
	{
		return getMdmDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @return the localized mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public Map<Language,String> getAllMdmDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MDMDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @return the localized mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public Map<Language,String> getAllMdmDescription()
	{
		return getAllMdmDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @param value the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public void setMdmDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setMdmDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MDMDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @param value the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public void setMdmDescription(final String value)
	{
		setMdmDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @param value the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public void setAllMdmDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MDMDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.mdmDescription</code> attribute. 
	 * @param value the mdmDescription - This attribute is part of PCM MDM attribute, defines name of the product
	 */
	public void setAllMdmDescription(final Map<Language,String> value)
	{
		setAllMdmDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.medicalSpecialty</code> attribute.
	 * @return the medicalSpecialty
	 */
	public List<String> getMedicalSpecialty(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, MEDICALSPECIALTY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.medicalSpecialty</code> attribute.
	 * @return the medicalSpecialty
	 */
	public List<String> getMedicalSpecialty()
	{
		return getMedicalSpecialty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.medicalSpecialty</code> attribute. 
	 * @param value the medicalSpecialty
	 */
	public void setMedicalSpecialty(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, MEDICALSPECIALTY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.medicalSpecialty</code> attribute. 
	 * @param value the medicalSpecialty
	 */
	public void setMedicalSpecialty(final List<String> value)
	{
		setMedicalSpecialty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.modCode</code> attribute.
	 * @return the modCode
	 */
	public String getModCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.modCode</code> attribute.
	 * @return the modCode
	 */
	public String getModCode()
	{
		return getModCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.modCode</code> attribute. 
	 * @param value the modCode
	 */
	public void setModCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.modCode</code> attribute. 
	 * @param value the modCode
	 */
	public void setModCode(final String value)
	{
		setModCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.modStatus</code> attribute.
	 * @return the modStatus - This field stores the actual status of the product such as active, inactive and not applicable.
	 */
	public EnumerationValue getModStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.modStatus</code> attribute.
	 * @return the modStatus - This field stores the actual status of the product such as active, inactive and not applicable.
	 */
	public EnumerationValue getModStatus()
	{
		return getModStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.modStatus</code> attribute. 
	 * @param value the modStatus - This field stores the actual status of the product such as active, inactive and not applicable.
	 */
	public void setModStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.modStatus</code> attribute. 
	 * @param value the modStatus - This field stores the actual status of the product such as active, inactive and not applicable.
	 */
	public void setModStatus(final EnumerationValue value)
	{
		setModStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.nameText</code> attribute.
	 * @return the nameText
	 */
	public String getNameText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getNameText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAMETEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.nameText</code> attribute.
	 * @return the nameText
	 */
	public String getNameText()
	{
		return getNameText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.nameText</code> attribute. 
	 * @return the localized nameText
	 */
	public Map<Language,String> getAllNameText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAMETEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.nameText</code> attribute. 
	 * @return the localized nameText
	 */
	public Map<Language,String> getAllNameText()
	{
		return getAllNameText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.nameText</code> attribute. 
	 * @param value the nameText
	 */
	public void setNameText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setNameText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAMETEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.nameText</code> attribute. 
	 * @param value the nameText
	 */
	public void setNameText(final String value)
	{
		setNameText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.nameText</code> attribute. 
	 * @param value the nameText
	 */
	public void setAllNameText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAMETEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.nameText</code> attribute. 
	 * @param value the nameText
	 */
	public void setAllNameText(final Map<Language,String> value)
	{
		setAllNameText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.netContent</code> attribute.
	 * @return the netContent - This attribute is part of MDM Attributes for PCM
	 */
	public String getNetContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETCONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.netContent</code> attribute.
	 * @return the netContent - This attribute is part of MDM Attributes for PCM
	 */
	public String getNetContent()
	{
		return getNetContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.netContent</code> attribute. 
	 * @param value the netContent - This attribute is part of MDM Attributes for PCM
	 */
	public void setNetContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETCONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.netContent</code> attribute. 
	 * @param value the netContent - This attribute is part of MDM Attributes for PCM
	 */
	public void setNetContent(final String value)
	{
		setNetContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.newProductStartDate</code> attribute.
	 * @return the newProductStartDate
	 */
	public Date getNewProductStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, NEWPRODUCTSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.newProductStartDate</code> attribute.
	 * @return the newProductStartDate
	 */
	public Date getNewProductStartDate()
	{
		return getNewProductStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.newProductStartDate</code> attribute. 
	 * @param value the newProductStartDate
	 */
	public void setNewProductStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, NEWPRODUCTSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.newProductStartDate</code> attribute. 
	 * @param value the newProductStartDate
	 */
	public void setNewProductStartDate(final Date value)
	{
		setNewProductStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.numeratorDUOM</code> attribute.
	 * @return the numeratorDUOM
	 */
	public String getNumeratorDUOM(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMERATORDUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.numeratorDUOM</code> attribute.
	 * @return the numeratorDUOM
	 */
	public String getNumeratorDUOM()
	{
		return getNumeratorDUOM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.numeratorDUOM</code> attribute. 
	 * @param value the numeratorDUOM
	 */
	public void setNumeratorDUOM(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMERATORDUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.numeratorDUOM</code> attribute. 
	 * @param value the numeratorDUOM
	 */
	public void setNumeratorDUOM(final String value)
	{
		setNumeratorDUOM( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.numeratorSUOM</code> attribute.
	 * @return the numeratorSUOM
	 */
	public String getNumeratorSUOM(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMERATORSUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.numeratorSUOM</code> attribute.
	 * @return the numeratorSUOM
	 */
	public String getNumeratorSUOM()
	{
		return getNumeratorSUOM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.numeratorSUOM</code> attribute. 
	 * @param value the numeratorSUOM
	 */
	public void setNumeratorSUOM(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMERATORSUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.numeratorSUOM</code> attribute. 
	 * @param value the numeratorSUOM
	 */
	public void setNumeratorSUOM(final String value)
	{
		setNumeratorSUOM( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.oldProductCode</code> attribute.
	 * @return the oldProductCode
	 */
	public String getOldProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OLDPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.oldProductCode</code> attribute.
	 * @return the oldProductCode
	 */
	public String getOldProductCode()
	{
		return getOldProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.oldProductCode</code> attribute. 
	 * @param value the oldProductCode
	 */
	public void setOldProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OLDPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.oldProductCode</code> attribute. 
	 * @param value the oldProductCode
	 */
	public void setOldProductCode(final String value)
	{
		setOldProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.originCountry</code> attribute.
	 * @return the originCountry
	 */
	public Country getOriginCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, ORIGINCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.originCountry</code> attribute.
	 * @return the originCountry
	 */
	public Country getOriginCountry()
	{
		return getOriginCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.originCountry</code> attribute. 
	 * @param value the originCountry
	 */
	public void setOriginCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, ORIGINCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.originCountry</code> attribute. 
	 * @param value the originCountry
	 */
	public void setOriginCountry(final Country value)
	{
		setOriginCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmInd</code> attribute.
	 * @return the pcmInd
	 */
	public Boolean isPcmInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PCMIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmInd</code> attribute.
	 * @return the pcmInd
	 */
	public Boolean isPcmInd()
	{
		return isPcmInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @return the pcmInd
	 */
	public boolean isPcmIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPcmInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @return the pcmInd
	 */
	public boolean isPcmIndAsPrimitive()
	{
		return isPcmIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @param value the pcmInd
	 */
	public void setPcmInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PCMIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @param value the pcmInd
	 */
	public void setPcmInd(final Boolean value)
	{
		setPcmInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @param value the pcmInd
	 */
	public void setPcmInd(final SessionContext ctx, final boolean value)
	{
		setPcmInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmInd</code> attribute. 
	 * @param value the pcmInd
	 */
	public void setPcmInd(final boolean value)
	{
		setPcmInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmModStatus</code> attribute.
	 * @return the pcmModStatus - This field stores the actual status of the pcm product such as active, discontinued and not applicable.
	 */
	public EnumerationValue getPcmModStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PCMMODSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.pcmModStatus</code> attribute.
	 * @return the pcmModStatus - This field stores the actual status of the pcm product such as active, discontinued and not applicable.
	 */
	public EnumerationValue getPcmModStatus()
	{
		return getPcmModStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmModStatus</code> attribute. 
	 * @param value the pcmModStatus - This field stores the actual status of the pcm product such as active, discontinued and not applicable.
	 */
	public void setPcmModStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PCMMODSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.pcmModStatus</code> attribute. 
	 * @param value the pcmModStatus - This field stores the actual status of the pcm product such as active, discontinued and not applicable.
	 */
	public void setPcmModStatus(final EnumerationValue value)
	{
		setPcmModStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.persistedCompletenessIndicator</code> attribute.
	 * @return the persistedCompletenessIndicator - This variable is used to store the value of the completeness indicator in a persisted attribute,so it can be used in exports, etc.
	 */
	public String getPersistedCompletenessIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERSISTEDCOMPLETENESSINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.persistedCompletenessIndicator</code> attribute.
	 * @return the persistedCompletenessIndicator - This variable is used to store the value of the completeness indicator in a persisted attribute,so it can be used in exports, etc.
	 */
	public String getPersistedCompletenessIndicator()
	{
		return getPersistedCompletenessIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.persistedCompletenessIndicator</code> attribute. 
	 * @param value the persistedCompletenessIndicator - This variable is used to store the value of the completeness indicator in a persisted attribute,so it can be used in exports, etc.
	 */
	public void setPersistedCompletenessIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERSISTEDCOMPLETENESSINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.persistedCompletenessIndicator</code> attribute. 
	 * @param value the persistedCompletenessIndicator - This variable is used to store the value of the completeness indicator in a persisted attribute,so it can be used in exports, etc.
	 */
	public void setPersistedCompletenessIndicator(final String value)
	{
		setPersistedCompletenessIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDesc2</code> attribute.
	 * @return the productDesc2 - Product Description 2 for EMEA
	 */
	public String getProductDesc2(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getProductDesc2 requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRODUCTDESC2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDesc2</code> attribute.
	 * @return the productDesc2 - Product Description 2 for EMEA
	 */
	public String getProductDesc2()
	{
		return getProductDesc2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @return the localized productDesc2 - Product Description 2 for EMEA
	 */
	public Map<Language,String> getAllProductDesc2(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRODUCTDESC2,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @return the localized productDesc2 - Product Description 2 for EMEA
	 */
	public Map<Language,String> getAllProductDesc2()
	{
		return getAllProductDesc2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @param value the productDesc2 - Product Description 2 for EMEA
	 */
	public void setProductDesc2(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setProductDesc2 requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRODUCTDESC2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @param value the productDesc2 - Product Description 2 for EMEA
	 */
	public void setProductDesc2(final String value)
	{
		setProductDesc2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @param value the productDesc2 - Product Description 2 for EMEA
	 */
	public void setAllProductDesc2(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRODUCTDESC2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDesc2</code> attribute. 
	 * @param value the productDesc2 - Product Description 2 for EMEA
	 */
	public void setAllProductDesc2(final Map<Language,String> value)
	{
		setAllProductDesc2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDocumentlist</code> attribute.
	 * @return the productDocumentlist - Product additional information details
	 */
	public List<ProductDocuments> getProductDocumentlist(final SessionContext ctx)
	{
		List<ProductDocuments> coll = (List<ProductDocuments>)getProperty( ctx, PRODUCTDOCUMENTLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productDocumentlist</code> attribute.
	 * @return the productDocumentlist - Product additional information details
	 */
	public List<ProductDocuments> getProductDocumentlist()
	{
		return getProductDocumentlist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDocumentlist</code> attribute. 
	 * @param value the productDocumentlist - Product additional information details
	 */
	public void setProductDocumentlist(final SessionContext ctx, final List<ProductDocuments> value)
	{
		setProperty(ctx, PRODUCTDOCUMENTLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productDocumentlist</code> attribute. 
	 * @param value the productDocumentlist - Product additional information details
	 */
	public void setProductDocumentlist(final List<ProductDocuments> value)
	{
		setProductDocumentlist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productExpiryDate</code> attribute.
	 * @return the productExpiryDate
	 */
	public Date getProductExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PRODUCTEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productExpiryDate</code> attribute.
	 * @return the productExpiryDate
	 */
	public Date getProductExpiryDate()
	{
		return getProductExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productExpiryDate</code> attribute. 
	 * @param value the productExpiryDate
	 */
	public void setProductExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PRODUCTEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productExpiryDate</code> attribute. 
	 * @param value the productExpiryDate
	 */
	public void setProductExpiryDate(final Date value)
	{
		setProductExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productImagesInJPEG</code> attribute.
	 * @return the productImagesInJPEG - Product Images in Jpeg format
	 */
	public List<Media> getProductImagesInJPEG(final SessionContext ctx)
	{
		List<Media> coll = (List<Media>)getProperty( ctx, PRODUCTIMAGESINJPEG);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productImagesInJPEG</code> attribute.
	 * @return the productImagesInJPEG - Product Images in Jpeg format
	 */
	public List<Media> getProductImagesInJPEG()
	{
		return getProductImagesInJPEG( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productImagesInJPEG</code> attribute. 
	 * @param value the productImagesInJPEG - Product Images in Jpeg format
	 */
	public void setProductImagesInJPEG(final SessionContext ctx, final List<Media> value)
	{
		setProperty(ctx, PRODUCTIMAGESINJPEG,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productImagesInJPEG</code> attribute. 
	 * @param value the productImagesInJPEG - Product Images in Jpeg format
	 */
	public void setProductImagesInJPEG(final List<Media> value)
	{
		setProductImagesInJPEG( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productImagesInPNG</code> attribute.
	 * @return the productImagesInPNG - Product Images in png format
	 */
	public List<Media> getProductImagesInPNG(final SessionContext ctx)
	{
		List<Media> coll = (List<Media>)getProperty( ctx, PRODUCTIMAGESINPNG);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productImagesInPNG</code> attribute.
	 * @return the productImagesInPNG - Product Images in png format
	 */
	public List<Media> getProductImagesInPNG()
	{
		return getProductImagesInPNG( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productImagesInPNG</code> attribute. 
	 * @param value the productImagesInPNG - Product Images in png format
	 */
	public void setProductImagesInPNG(final SessionContext ctx, final List<Media> value)
	{
		setProperty(ctx, PRODUCTIMAGESINPNG,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productImagesInPNG</code> attribute. 
	 * @param value the productImagesInPNG - Product Images in png format
	 */
	public void setProductImagesInPNG(final List<Media> value)
	{
		setProductImagesInPNG( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productKits</code> attribute.
	 * @return the productKits
	 */
	public Set<JnJGTProductKit> getProductKits(final SessionContext ctx)
	{
		final List<JnJGTProductKit> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			"JnJGTProductKit",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJGTProductKit>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productKits</code> attribute.
	 * @return the productKits
	 */
	public Set<JnJGTProductKit> getProductKits()
	{
		return getProductKits( getSession().getSessionContext() );
	}
	
	public long getProductKitsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			"JnJGTProductKit",
			null
		);
	}
	
	public long getProductKitsCount()
	{
		return getProductKitsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productKits</code> attribute. 
	 * @param value the productKits
	 */
	public void setProductKits(final SessionContext ctx, final Set<JnJGTProductKit> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productKits</code> attribute. 
	 * @param value the productKits
	 */
	public void setProductKits(final Set<JnJGTProductKit> value)
	{
		setProductKits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productKits. 
	 * @param value the item to add to productKits
	 */
	public void addToProductKits(final SessionContext ctx, final JnJGTProductKit value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productKits. 
	 * @param value the item to add to productKits
	 */
	public void addToProductKits(final JnJGTProductKit value)
	{
		addToProductKits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productKits. 
	 * @param value the item to remove from productKits
	 */
	public void removeFromProductKits(final SessionContext ctx, final JnJGTProductKit value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productKits. 
	 * @param value the item to remove from productKits
	 */
	public void removeFromProductKits(final JnJGTProductKit value)
	{
		removeFromProductKits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productPlants</code> attribute.
	 * @return the productPlants
	 */
	public Set<JnjGTProductPlant> getProductPlants(final SessionContext ctx)
	{
		final List<JnjGTProductPlant> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			"JnjGTProductPlant",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnjGTProductPlant>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productPlants</code> attribute.
	 * @return the productPlants
	 */
	public Set<JnjGTProductPlant> getProductPlants()
	{
		return getProductPlants( getSession().getSessionContext() );
	}
	
	public long getProductPlantsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			"JnjGTProductPlant",
			null
		);
	}
	
	public long getProductPlantsCount()
	{
		return getProductPlantsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productPlants</code> attribute. 
	 * @param value the productPlants
	 */
	public void setProductPlants(final SessionContext ctx, final Set<JnjGTProductPlant> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productPlants</code> attribute. 
	 * @param value the productPlants
	 */
	public void setProductPlants(final Set<JnjGTProductPlant> value)
	{
		setProductPlants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productPlants. 
	 * @param value the item to add to productPlants
	 */
	public void addToProductPlants(final SessionContext ctx, final JnjGTProductPlant value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productPlants. 
	 * @param value the item to add to productPlants
	 */
	public void addToProductPlants(final JnjGTProductPlant value)
	{
		addToProductPlants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productPlants. 
	 * @param value the item to remove from productPlants
	 */
	public void removeFromProductPlants(final SessionContext ctx, final JnjGTProductPlant value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productPlants. 
	 * @param value the item to remove from productPlants
	 */
	public void removeFromProductPlants(final JnjGTProductPlant value)
	{
		removeFromProductPlants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productSalesOrg</code> attribute.
	 * @return the productSalesOrg
	 */
	public Set<JnJGTProductSalesOrg> getProductSalesOrg(final SessionContext ctx)
	{
		final List<JnJGTProductSalesOrg> items = getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			"JnJGTProductSalesOrg",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJGTProductSalesOrg>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productSalesOrg</code> attribute.
	 * @return the productSalesOrg
	 */
	public Set<JnJGTProductSalesOrg> getProductSalesOrg()
	{
		return getProductSalesOrg( getSession().getSessionContext() );
	}
	
	public long getProductSalesOrgCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			"JnJGTProductSalesOrg",
			null
		);
	}
	
	public long getProductSalesOrgCount()
	{
		return getProductSalesOrgCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productSalesOrg</code> attribute. 
	 * @param value the productSalesOrg
	 */
	public void setProductSalesOrg(final SessionContext ctx, final Set<JnJGTProductSalesOrg> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productSalesOrg</code> attribute. 
	 * @param value the productSalesOrg
	 */
	public void setProductSalesOrg(final Set<JnJGTProductSalesOrg> value)
	{
		setProductSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productSalesOrg. 
	 * @param value the item to add to productSalesOrg
	 */
	public void addToProductSalesOrg(final SessionContext ctx, final JnJGTProductSalesOrg value)
	{
		addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productSalesOrg. 
	 * @param value the item to add to productSalesOrg
	 */
	public void addToProductSalesOrg(final JnJGTProductSalesOrg value)
	{
		addToProductSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productSalesOrg. 
	 * @param value the item to remove from productSalesOrg
	 */
	public void removeFromProductSalesOrg(final SessionContext ctx, final JnJGTProductSalesOrg value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productSalesOrg. 
	 * @param value the item to remove from productSalesOrg
	 */
	public void removeFromProductSalesOrg(final JnJGTProductSalesOrg value)
	{
		removeFromProductSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productStatus</code> attribute.
	 * @return the productStatus - This field is just used to display value in product cockpit, this stores the product status of the pcm product with values active or discontinued.
	 */
	public EnumerationValue getProductStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productStatus</code> attribute.
	 * @return the productStatus - This field is just used to display value in product cockpit, this stores the product status of the pcm product with values active or discontinued.
	 */
	public EnumerationValue getProductStatus()
	{
		return getProductStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productStatus</code> attribute. 
	 * @param value the productStatus - This field is just used to display value in product cockpit, this stores the product status of the pcm product with values active or discontinued.
	 */
	public void setProductStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productStatus</code> attribute. 
	 * @param value the productStatus - This field is just used to display value in product cockpit, this stores the product status of the pcm product with values active or discontinued.
	 */
	public void setProductStatus(final EnumerationValue value)
	{
		setProductStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productStatusCode</code> attribute.
	 * @return the productStatusCode
	 */
	public String getProductStatusCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSTATUSCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.productStatusCode</code> attribute.
	 * @return the productStatusCode
	 */
	public String getProductStatusCode()
	{
		return getProductStatusCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productStatusCode</code> attribute. 
	 * @param value the productStatusCode
	 */
	public void setProductStatusCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSTATUSCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.productStatusCode</code> attribute. 
	 * @param value the productStatusCode
	 */
	public void setProductStatusCode(final String value)
	{
		setProductStatusCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.publishInd</code> attribute.
	 * @return the publishInd
	 */
	public Boolean isPublishInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PUBLISHIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.publishInd</code> attribute.
	 * @return the publishInd
	 */
	public Boolean isPublishInd()
	{
		return isPublishInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @return the publishInd
	 */
	public boolean isPublishIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPublishInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @return the publishInd
	 */
	public boolean isPublishIndAsPrimitive()
	{
		return isPublishIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PUBLISHIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final Boolean value)
	{
		setPublishInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final SessionContext ctx, final boolean value)
	{
		setPublishInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.publishInd</code> attribute. 
	 * @param value the publishInd
	 */
	public void setPublishInd(final boolean value)
	{
		setPublishInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp - This attribute is part of MDM Attributes and represents Last Update Date for PCM
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp - This attribute is part of MDM Attributes and represents Last Update Date for PCM
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp - This attribute is part of MDM Attributes and represents Last Update Date for PCM
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp - This attribute is part of MDM Attributes and represents Last Update Date for PCM
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode()
	{
		return getRegionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final String value)
	{
		setRegionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.rmcNo</code> attribute.
	 * @return the rmcNo - This attribute is part of PCM and represents RMC NO. /VERSION
	 */
	public String getRmcNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RMCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.rmcNo</code> attribute.
	 * @return the rmcNo - This attribute is part of PCM and represents RMC NO. /VERSION
	 */
	public String getRmcNo()
	{
		return getRmcNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.rmcNo</code> attribute. 
	 * @param value the rmcNo - This attribute is part of PCM and represents RMC NO. /VERSION
	 */
	public void setRmcNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RMCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.rmcNo</code> attribute. 
	 * @param value the rmcNo - This attribute is part of PCM and represents RMC NO. /VERSION
	 */
	public void setRmcNo(final String value)
	{
		setRmcNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public Set<String> getSalesOrg(final SessionContext ctx)
	{
		Set<String> coll = (Set<String>)getProperty( ctx, SALESORG);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public Set<String> getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final Set<String> value)
	{
		setProperty(ctx, SALESORG,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final Set<String> value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode()
	{
		return getSalesOrgCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final String value)
	{
		setSalesOrgCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.secondLevelCategory</code> attribute.
	 * @return the secondLevelCategory
	 */
	public String getSecondLevelCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECONDLEVELCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.secondLevelCategory</code> attribute.
	 * @return the secondLevelCategory
	 */
	public String getSecondLevelCategory()
	{
		return getSecondLevelCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.secondLevelCategory</code> attribute. 
	 * @param value the secondLevelCategory
	 */
	public void setSecondLevelCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECONDLEVELCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.secondLevelCategory</code> attribute. 
	 * @param value the secondLevelCategory
	 */
	public void setSecondLevelCategory(final String value)
	{
		setSecondLevelCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector()
	{
		return getSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final String value)
	{
		setSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shippingWeight</code> attribute.
	 * @return the shippingWeight
	 */
	public String getShippingWeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPPINGWEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shippingWeight</code> attribute.
	 * @return the shippingWeight
	 */
	public String getShippingWeight()
	{
		return getShippingWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shippingWeight</code> attribute. 
	 * @param value the shippingWeight
	 */
	public void setShippingWeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPPINGWEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shippingWeight</code> attribute. 
	 * @param value the shippingWeight
	 */
	public void setShippingWeight(final String value)
	{
		setShippingWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBullets</code> attribute.
	 * @return the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public String getShortBullets(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getShortBullets requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHORTBULLETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBullets</code> attribute.
	 * @return the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public String getShortBullets()
	{
		return getShortBullets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @return the localized shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllShortBullets(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHORTBULLETS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @return the localized shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllShortBullets()
	{
		return getAllShortBullets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @param value the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public void setShortBullets(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setShortBullets requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHORTBULLETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @param value the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public void setShortBullets(final String value)
	{
		setShortBullets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @param value the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllShortBullets(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHORTBULLETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBullets</code> attribute. 
	 * @param value the shortBullets - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllShortBullets(final Map<Language,String> value)
	{
		setAllShortBullets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBulletsText</code> attribute.
	 * @return the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public String getShortBulletsText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getShortBulletsText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHORTBULLETSTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBulletsText</code> attribute.
	 * @return the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public String getShortBulletsText()
	{
		return getShortBulletsText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @return the localized shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllShortBulletsText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHORTBULLETSTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @return the localized shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public Map<Language,String> getAllShortBulletsText()
	{
		return getAllShortBulletsText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @param value the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setShortBulletsText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setShortBulletsText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHORTBULLETSTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @param value the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setShortBulletsText(final String value)
	{
		setShortBulletsText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @param value the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllShortBulletsText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHORTBULLETSTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortBulletsText</code> attribute. 
	 * @param value the shortBulletsText - This attribute is part of PCM Rich Content Attributes
	 */
	public void setAllShortBulletsText(final Map<Language,String> value)
	{
		setAllShortBulletsText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortOverview</code> attribute.
	 * @return the shortOverview
	 */
	public String getShortOverview(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getShortOverview requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHORTOVERVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortOverview</code> attribute.
	 * @return the shortOverview
	 */
	public String getShortOverview()
	{
		return getShortOverview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @return the localized shortOverview
	 */
	public Map<Language,String> getAllShortOverview(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHORTOVERVIEW,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @return the localized shortOverview
	 */
	public Map<Language,String> getAllShortOverview()
	{
		return getAllShortOverview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @param value the shortOverview
	 */
	public void setShortOverview(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setShortOverview requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHORTOVERVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @param value the shortOverview
	 */
	public void setShortOverview(final String value)
	{
		setShortOverview( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @param value the shortOverview
	 */
	public void setAllShortOverview(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHORTOVERVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.shortOverview</code> attribute. 
	 * @param value the shortOverview
	 */
	public void setAllShortOverview(final Map<Language,String> value)
	{
		setAllShortOverview( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.sourceSystemId</code> attribute.
	 * @return the sourceSystemId - This attribute is part of MDM Attributes and represents Country Sold In for PCM
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.sourceSystemId</code> attribute.
	 * @return the sourceSystemId - This attribute is part of MDM Attributes and represents Country Sold In for PCM
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId - This attribute is part of MDM Attributes and represents Country Sold In for PCM
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId - This attribute is part of MDM Attributes and represents Country Sold In for PCM
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.stockingType</code> attribute.
	 * @return the stockingType
	 */
	public String getStockingType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STOCKINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.stockingType</code> attribute.
	 * @return the stockingType
	 */
	public String getStockingType()
	{
		return getStockingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.stockingType</code> attribute. 
	 * @param value the stockingType
	 */
	public void setStockingType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STOCKINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.stockingType</code> attribute. 
	 * @param value the stockingType
	 */
	public void setStockingType(final String value)
	{
		setStockingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.summaryText</code> attribute.
	 * @return the summaryText - Additional text attribute that holds localized brief description.
	 */
	public String getSummaryText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getSummaryText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SUMMARYTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.summaryText</code> attribute.
	 * @return the summaryText - Additional text attribute that holds localized brief description.
	 */
	public String getSummaryText()
	{
		return getSummaryText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @return the localized summaryText - Additional text attribute that holds localized brief description.
	 */
	public Map<Language,String> getAllSummaryText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SUMMARYTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @return the localized summaryText - Additional text attribute that holds localized brief description.
	 */
	public Map<Language,String> getAllSummaryText()
	{
		return getAllSummaryText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @param value the summaryText - Additional text attribute that holds localized brief description.
	 */
	public void setSummaryText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setSummaryText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SUMMARYTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @param value the summaryText - Additional text attribute that holds localized brief description.
	 */
	public void setSummaryText(final String value)
	{
		setSummaryText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @param value the summaryText - Additional text attribute that holds localized brief description.
	 */
	public void setAllSummaryText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SUMMARYTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.summaryText</code> attribute. 
	 * @param value the summaryText - Additional text attribute that holds localized brief description.
	 */
	public void setAllSummaryText(final Map<Language,String> value)
	{
		setAllSummaryText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.tempPublisInd</code> attribute.
	 * @return the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public Boolean isTempPublisInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TEMPPUBLISIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.tempPublisInd</code> attribute.
	 * @return the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public Boolean isTempPublisInd()
	{
		return isTempPublisInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @return the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public boolean isTempPublisIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTempPublisInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @return the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public boolean isTempPublisIndAsPrimitive()
	{
		return isTempPublisIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @param value the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public void setTempPublisInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TEMPPUBLISIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @param value the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public void setTempPublisInd(final Boolean value)
	{
		setTempPublisInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @param value the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public void setTempPublisInd(final SessionContext ctx, final boolean value)
	{
		setTempPublisInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.tempPublisInd</code> attribute. 
	 * @param value the tempPublisInd - This field is used for US PCM product to figure out any product with its mod products contains the Publish Ind as true to make their respective products publish indicator value as true.
	 */
	public void setTempPublisInd(final boolean value)
	{
		setTempPublisInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.unitDimension</code> attribute.
	 * @return the unitDimension
	 */
	public Unit getUnitDimension(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNITDIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.unitDimension</code> attribute.
	 * @return the unitDimension
	 */
	public Unit getUnitDimension()
	{
		return getUnitDimension( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.unitDimension</code> attribute. 
	 * @param value the unitDimension
	 */
	public void setUnitDimension(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNITDIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.unitDimension</code> attribute. 
	 * @param value the unitDimension
	 */
	public void setUnitDimension(final Unit value)
	{
		setUnitDimension( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.uomDetails</code> attribute.
	 * @return the uomDetails
	 */
	public List<JnjUomConversion> getUomDetails(final SessionContext ctx)
	{
		List<JnjUomConversion> coll = (List<JnjUomConversion>)getProperty( ctx, UOMDETAILS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.uomDetails</code> attribute.
	 * @return the uomDetails
	 */
	public List<JnjUomConversion> getUomDetails()
	{
		return getUomDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.uomDetails</code> attribute. 
	 * @param value the uomDetails
	 */
	public void setUomDetails(final SessionContext ctx, final List<JnjUomConversion> value)
	{
		setProperty(ctx, UOMDETAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.uomDetails</code> attribute. 
	 * @param value the uomDetails
	 */
	public void setUomDetails(final List<JnjUomConversion> value)
	{
		setUomDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode()
	{
		return getUpcCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final String value)
	{
		setUpcCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warning</code> attribute.
	 * @return the warning - This attribute is part of PCM Labeling Attributes
	 */
	public String getWarning(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getWarning requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, WARNING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warning</code> attribute.
	 * @return the warning - This attribute is part of PCM Labeling Attributes
	 */
	public String getWarning()
	{
		return getWarning( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warning</code> attribute. 
	 * @return the localized warning - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllWarning(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,WARNING,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warning</code> attribute. 
	 * @return the localized warning - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllWarning()
	{
		return getAllWarning( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warning</code> attribute. 
	 * @param value the warning - This attribute is part of PCM Labeling Attributes
	 */
	public void setWarning(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setWarning requires a session language", 0 );
		}
		setLocalizedProperty(ctx, WARNING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warning</code> attribute. 
	 * @param value the warning - This attribute is part of PCM Labeling Attributes
	 */
	public void setWarning(final String value)
	{
		setWarning( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warning</code> attribute. 
	 * @param value the warning - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllWarning(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,WARNING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warning</code> attribute. 
	 * @param value the warning - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllWarning(final Map<Language,String> value)
	{
		setAllWarning( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warningText</code> attribute.
	 * @return the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public String getWarningText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.getWarningText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, WARNINGTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warningText</code> attribute.
	 * @return the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public String getWarningText()
	{
		return getWarningText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warningText</code> attribute. 
	 * @return the localized warningText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllWarningText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,WARNINGTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.warningText</code> attribute. 
	 * @return the localized warningText - This attribute is part of PCM Labeling Attributes
	 */
	public Map<Language,String> getAllWarningText()
	{
		return getAllWarningText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warningText</code> attribute. 
	 * @param value the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public void setWarningText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnJProduct.setWarningText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, WARNINGTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warningText</code> attribute. 
	 * @param value the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public void setWarningText(final String value)
	{
		setWarningText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warningText</code> attribute. 
	 * @param value the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllWarningText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,WARNINGTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.warningText</code> attribute. 
	 * @param value the warningText - This attribute is part of PCM Labeling Attributes
	 */
	public void setAllWarningText(final Map<Language,String> value)
	{
		setAllWarningText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.width</code> attribute.
	 * @return the width
	 */
	public Double getWidth(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WIDTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.width</code> attribute.
	 * @return the width
	 */
	public Double getWidth()
	{
		return getWidth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.width</code> attribute. 
	 * @return the width
	 */
	public double getWidthAsPrimitive(final SessionContext ctx)
	{
		Double value = getWidth( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.width</code> attribute. 
	 * @return the width
	 */
	public double getWidthAsPrimitive()
	{
		return getWidthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, WIDTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final Double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final SessionContext ctx, final double value)
	{
		setWidth( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.zonzaMainImage</code> attribute.
	 * @return the zonzaMainImage - Main Image from Zonza
	 */
	public Media getZonzaMainImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, ZONZAMAINIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJProduct.zonzaMainImage</code> attribute.
	 * @return the zonzaMainImage - Main Image from Zonza
	 */
	public Media getZonzaMainImage()
	{
		return getZonzaMainImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.zonzaMainImage</code> attribute. 
	 * @param value the zonzaMainImage - Main Image from Zonza
	 */
	public void setZonzaMainImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, ZONZAMAINIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJProduct.zonzaMainImage</code> attribute. 
	 * @param value the zonzaMainImage - Main Image from Zonza
	 */
	public void setZonzaMainImage(final Media value)
	{
		setZonzaMainImage( getSession().getSessionContext(), value );
	}
	
}
