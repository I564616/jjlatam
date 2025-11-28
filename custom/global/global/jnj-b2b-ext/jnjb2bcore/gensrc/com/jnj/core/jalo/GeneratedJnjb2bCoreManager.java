/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.PurchasedProductReferencesComponent;
import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.BroadcastMessage;
import com.jnj.core.jalo.CatalogComponent;
import com.jnj.core.jalo.ClassOfTradeGroup;
import com.jnj.core.jalo.CompanyInfo;
import com.jnj.core.jalo.ContactUsProcess;
import com.jnj.core.jalo.IntegrationJobDetails;
import com.jnj.core.jalo.JnJAmazonFile;
import com.jnj.core.jalo.JnJB2BUnit;
import com.jnj.core.jalo.JnJB2bCustomer;
import com.jnj.core.jalo.JnJGTAuditTrail;
import com.jnj.core.jalo.JnJGTPriceRow;
import com.jnj.core.jalo.JnJGTProductKit;
import com.jnj.core.jalo.JnJGTProductSalesOrg;
import com.jnj.core.jalo.JnJGTProductUnitLocal;
import com.jnj.core.jalo.JnJInvoiceEntry;
import com.jnj.core.jalo.JnJInvoiceOrder;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnJSalesOrgCustomer;
import com.jnj.core.jalo.JnJZonzaImage;
import com.jnj.core.jalo.JnjConfig;
import com.jnj.core.jalo.JnjContract;
import com.jnj.core.jalo.JnjContractEntry;
import com.jnj.core.jalo.JnjContractEntryPrice;
import com.jnj.core.jalo.JnjCreateUserProcess;
import com.jnj.core.jalo.JnjDeliverySchedule;
import com.jnj.core.jalo.JnjDropShipmentDetails;
import com.jnj.core.jalo.JnjEpicEmailFooterComponent;
import com.jnj.core.jalo.JnjFormProcess;
import com.jnj.core.jalo.JnjGTAddAccountEmailProcess;
import com.jnj.core.jalo.JnjGTAddExistingAccountEmailProcess;
import com.jnj.core.jalo.JnjGTApproveUserEmailProcess;
import com.jnj.core.jalo.JnjGTBackOrderEmailBusinessProcess;
import com.jnj.core.jalo.JnjGTCartOrderEmailProcess;
import com.jnj.core.jalo.JnjGTComprehensiveOrderConfirmationEmailBusinessProcess;
import com.jnj.core.jalo.JnjGTContactUsEmailProcess;
import com.jnj.core.jalo.JnjGTCpscContact;
import com.jnj.core.jalo.JnjGTCpscTestDetail;
import com.jnj.core.jalo.JnjGTCreateUserEmailProcess;
import com.jnj.core.jalo.JnjGTCreditCard;
import com.jnj.core.jalo.JnjGTCutNotificationEmailProcess;
import com.jnj.core.jalo.JnjGTDisputeInquiryProcess;
import com.jnj.core.jalo.JnjGTEarlyZipCodes;
import com.jnj.core.jalo.JnjGTExProductAttribute;
import com.jnj.core.jalo.JnjGTExportCatalogEmailProcess;
import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.core.jalo.JnjGTInvoice;
import com.jnj.core.jalo.JnjGTInvoiceEntry;
import com.jnj.core.jalo.JnjGTInvoiceEntryLot;
import com.jnj.core.jalo.JnjGTInvoicePrice;
import com.jnj.core.jalo.JnjGTOrdHdrNote;
import com.jnj.core.jalo.JnjGTOrdInboundValidationEmailProcess;
import com.jnj.core.jalo.JnjGTOrderCancelEmailProcess;
import com.jnj.core.jalo.JnjGTOrderChannel;
import com.jnj.core.jalo.JnjGTOrderShipmentEmailBusinessProcess;
import com.jnj.core.jalo.JnjGTProductCpscDetail;
import com.jnj.core.jalo.JnjGTProductLot;
import com.jnj.core.jalo.JnjGTProductPlant;
import com.jnj.core.jalo.JnjGTProductReg;
import com.jnj.core.jalo.JnjGTProfilePasswordExpireEmailProcess;
import com.jnj.core.jalo.JnjGTRegistrationConfirmationEmailProcess;
import com.jnj.core.jalo.JnjGTRejectUserEmailProcess;
import com.jnj.core.jalo.JnjGTSalesOrgCustomer;
import com.jnj.core.jalo.JnjGTShipmentConfirmationEmailBusinessProcess;
import com.jnj.core.jalo.JnjGTShipmentTrackingURLs;
import com.jnj.core.jalo.JnjGTShippingDetails;
import com.jnj.core.jalo.JnjGTShippingLineDetails;
import com.jnj.core.jalo.JnjGTShippingMethod;
import com.jnj.core.jalo.JnjGTSuccessfulRegistrationEmailProcess;
import com.jnj.core.jalo.JnjGTSupervisorApprovalEmailProcess;
import com.jnj.core.jalo.JnjGTSurgeon;
import com.jnj.core.jalo.JnjGTSurgeryInfo;
import com.jnj.core.jalo.JnjGTSurveyLinkComponent;
import com.jnj.core.jalo.JnjGTTemporaryPwdEmailProcess;
import com.jnj.core.jalo.JnjGTTerritoryDivAddresses;
import com.jnj.core.jalo.JnjGTTerritoryDivCustRel;
import com.jnj.core.jalo.JnjGTTerritoryDivProdMapping;
import com.jnj.core.jalo.JnjGTTerritoryDivison;
import com.jnj.core.jalo.JnjGTUserDisableLoginEmailProcess;
import com.jnj.core.jalo.JnjGTVariantProduct;
import com.jnj.core.jalo.JnjImtContract;
import com.jnj.core.jalo.JnjImtContractEntry;
import com.jnj.core.jalo.JnjIndirectCustomer;
import com.jnj.core.jalo.JnjIntegrationCronJob;
import com.jnj.core.jalo.JnjIntegrationRSACronJob;
import com.jnj.core.jalo.JnjInterfaceNotificationProcess;
import com.jnj.core.jalo.JnjLaudo;
import com.jnj.core.jalo.JnjLinkComponent;
import com.jnj.core.jalo.JnjNewsBannerComponent;
import com.jnj.core.jalo.JnjOrdEntStsMapping;
import com.jnj.core.jalo.JnjOrdStsMapping;
import com.jnj.core.jalo.JnjOrderCreditLimitMsg;
import com.jnj.core.jalo.JnjOrderLineItemCancelEmailTiggerCronJob;
import com.jnj.core.jalo.JnjOrderStatusNotificationProcess;
import com.jnj.core.jalo.JnjOrderTemplate;
import com.jnj.core.jalo.JnjPCMAmazonEmailProcess;
import com.jnj.core.jalo.JnjPCMEmailFooterComponent;
import com.jnj.core.jalo.JnjPCMEmailTopNavigationComponent;
import com.jnj.core.jalo.JnjPCMIncompleteActiveProductEmailProcess;
import com.jnj.core.jalo.JnjPCMMultiImageSetsFoundEmailProcess;
import com.jnj.core.jalo.JnjPCMNewProductEmailProcess;
import com.jnj.core.jalo.JnjPCMNewProductMandatoryCheckEmailProcess;
import com.jnj.core.jalo.JnjPCMProductDetailsEmailProcess;
import com.jnj.core.jalo.JnjPCMRequestAccountEmailProcess;
import com.jnj.core.jalo.JnjPCMUpdateProductMandatoryCheckEmailProcess;
import com.jnj.core.jalo.JnjPCMZonzaUnreachableEmailProcess;
import com.jnj.core.jalo.JnjParagraphComponent;
import com.jnj.core.jalo.JnjPasswordExpiry;
import com.jnj.core.jalo.JnjPasswordExpiryEmailProcess;
import com.jnj.core.jalo.JnjReadOperationDashboard;
import com.jnj.core.jalo.JnjRegistrationProcess;
import com.jnj.core.jalo.JnjReturnOrderCSRProcess;
import com.jnj.core.jalo.JnjReturnOrderUserProcess;
import com.jnj.core.jalo.JnjSalesOrgAndSplProdMap;
import com.jnj.core.jalo.JnjSyncOrderImpExImportCronJob;
import com.jnj.core.jalo.JnjSyncOrderImpExImportJob;
import com.jnj.core.jalo.JnjTemplateEntry;
import com.jnj.core.jalo.JnjUomConversion;
import com.jnj.core.jalo.JnjWriteOperationDashboard;
import com.jnj.core.jalo.OldPassword;
import com.jnj.core.jalo.ProductDocuments;
import com.jnj.core.jalo.SecretQuestionsAndAnswers;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.commerceservices.jalo.OrgUnit;
import de.hybris.platform.commerceservices.jalo.process.JnjSynchronizeOrdersProcess;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.Cart;
import de.hybris.platform.jalo.order.CartEntry;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
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
 * Generated class for type <code>Jnjb2bCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjb2bCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Product2Countries from ((jnjb2bcore))*/
	protected static String PRODUCT2COUNTRIES_SRC_ORDERED = "relation.Product2Countries.source.ordered";
	protected static String PRODUCT2COUNTRIES_TGT_ORDERED = "relation.Product2Countries.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Countries from ((jnjb2bcore))*/
	protected static String PRODUCT2COUNTRIES_MARKMODIFIED = "relation.Product2Countries.markmodified";
	/** Relation ordering override parameter constants for CustomerEligibilityRelation from ((jnjb2bcore))*/
	protected static String CUSTOMERELIGIBILITYRELATION_SRC_ORDERED = "relation.CustomerEligibilityRelation.source.ordered";
	protected static String CUSTOMERELIGIBILITYRELATION_TGT_ORDERED = "relation.CustomerEligibilityRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerEligibilityRelation from ((jnjb2bcore))*/
	protected static String CUSTOMERELIGIBILITYRELATION_MARKMODIFIED = "relation.CustomerEligibilityRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n INVOICES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTInvoice> INVOICE_ORDERRELATIONINVOICESHANDLER = new OneToManyHandler<JnjGTInvoice>(
	Jnjb2bCoreConstants.TC.JNJGTINVOICE,
	false,
	"order",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for BaseSite2LanguageRel from ((jnjb2bcore))*/
	protected static String BASESITE2LANGUAGEREL_SRC_ORDERED = "relation.BaseSite2LanguageRel.source.ordered";
	protected static String BASESITE2LANGUAGEREL_TGT_ORDERED = "relation.BaseSite2LanguageRel.target.ordered";
	/** Relation disable markmodifed parameter constants for BaseSite2LanguageRel from ((jnjb2bcore))*/
	protected static String BASESITE2LANGUAGEREL_MARKMODIFIED = "relation.BaseSite2LanguageRel.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERTEMPLATE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjOrderTemplate> B2BUNIT2ORDERTEMPLATEORDERTEMPLATEHANDLER = new OneToManyHandler<JnjOrderTemplate>(
	Jnjb2bCoreConstants.TC.JNJORDERTEMPLATE,
	false,
	"unit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CONTRACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjContract> B2BUNIT2CONTRACTRELATIONCONTRACTSHANDLER = new OneToManyHandler<JnjContract>(
	Jnjb2bCoreConstants.TC.JNJCONTRACT,
	false,
	"unit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("phoneCode", AttributeMode.INITIAL);
		tmp.put("orderDeliveryTime", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("customSequence", AttributeMode.INITIAL);
		tmp.put("displayProducts", AttributeMode.INITIAL);
		tmp.put("showProductPrice", AttributeMode.INITIAL);
		tmp.put("productPresentForTheCategory", AttributeMode.INITIAL);
		tmp.put("jnjCustomName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.category.jalo.Category", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("distributionChannel", AttributeMode.INITIAL);
		tmp.put("division", AttributeMode.INITIAL);
		tmp.put("salesOrderOverallStatus", AttributeMode.INITIAL);
		tmp.put("salesOrderDeliveryStatus", AttributeMode.INITIAL);
		tmp.put("salesOrderRejectionStatus", AttributeMode.INITIAL);
		tmp.put("salesOrderCreditStatus", AttributeMode.INITIAL);
		tmp.put("salesOrderDataCompleteness", AttributeMode.INITIAL);
		tmp.put("headerDeliveryBlock", AttributeMode.INITIAL);
		tmp.put("poType", AttributeMode.INITIAL);
		tmp.put("invoiceStatus", AttributeMode.INITIAL);
		tmp.put("payFromNumber", AttributeMode.INITIAL);
		tmp.put("riskCategory", AttributeMode.INITIAL);
		tmp.put("confirmationEmailSent", AttributeMode.INITIAL);
		tmp.put("emailSentAttempts", AttributeMode.INITIAL);
		tmp.put("orderNumber", AttributeMode.INITIAL);
		tmp.put("batchContentInd", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("completeDelivery", AttributeMode.INITIAL);
		tmp.put("contractNumber", AttributeMode.INITIAL);
		tmp.put("forbiddenSales", AttributeMode.INITIAL);
		tmp.put("sapOrderNumber", AttributeMode.INITIAL);
		tmp.put("salesOrganizationCode", AttributeMode.INITIAL);
		tmp.put("creditStatus", AttributeMode.INITIAL);
		tmp.put("deliveyBlock", AttributeMode.INITIAL);
		tmp.put("namedDeliveryDate", AttributeMode.INITIAL);
		tmp.put("requestedDeliveryDate", AttributeMode.INITIAL);
		tmp.put("totalNetValue", AttributeMode.INITIAL);
		tmp.put("totalFreightFees", AttributeMode.INITIAL);
		tmp.put("totalExpeditedFees", AttributeMode.INITIAL);
		tmp.put("totalHandlingFee", AttributeMode.INITIAL);
		tmp.put("totalDropShipFee", AttributeMode.INITIAL);
		tmp.put("totalminimumOrderFee", AttributeMode.INITIAL);
		tmp.put("totalInsurance", AttributeMode.INITIAL);
		tmp.put("totalGrossPrice", AttributeMode.INITIAL);
		tmp.put("sapValidated", AttributeMode.INITIAL);
		tmp.put("sapErrorMessages", AttributeMode.INITIAL);
		tmp.put("orderOnPAHold", AttributeMode.INITIAL);
		tmp.put("orderType", AttributeMode.INITIAL);
		tmp.put("accountNumber", AttributeMode.INITIAL);
		tmp.put("GLN", AttributeMode.INITIAL);
		tmp.put("attention", AttributeMode.INITIAL);
		tmp.put("specialText", AttributeMode.INITIAL);
		tmp.put("dropShipAccount", AttributeMode.INITIAL);
		tmp.put("thirdpartyBilling", AttributeMode.INITIAL);
		tmp.put("shipToAccount", AttributeMode.INITIAL);
		tmp.put("spineSalesRepUCN", AttributeMode.INITIAL);
		tmp.put("surgeonName", AttributeMode.INITIAL);
		tmp.put("deliveredOrderForm", AttributeMode.INITIAL);
		tmp.put("customerReferencePO", AttributeMode.INITIAL);
		tmp.put("cordisHouseAccount", AttributeMode.INITIAL);
		tmp.put("totalHsaPromotion", AttributeMode.INITIAL);
		tmp.put("surgeon", AttributeMode.INITIAL);
		tmp.put("totalmanualFee", AttributeMode.INITIAL);
		tmp.put("totalFees", AttributeMode.INITIAL);
		tmp.put("totalOtherCharge", AttributeMode.INITIAL);
		tmp.put("dealerPONum", AttributeMode.INITIAL);
		tmp.put("totalAdjRateAll", AttributeMode.INITIAL);
		tmp.put("surgeryInfo", AttributeMode.INITIAL);
		tmp.put("sapValiationSkipped", AttributeMode.INITIAL);
		tmp.put("attachedDoc", AttributeMode.INITIAL);
		tmp.put("shippingDetails", AttributeMode.INITIAL);
		tmp.put("signature", AttributeMode.INITIAL);
		tmp.put("selectedFileType", AttributeMode.INITIAL);
		tmp.put("selectedTextFormat", AttributeMode.INITIAL);
		tmp.put("selectedImageFormats", AttributeMode.INITIAL);
		tmp.put("selectedAttributes", AttributeMode.INITIAL);
		tmp.put("reasonCode", AttributeMode.INITIAL);
		tmp.put("associatedSAPOrderNum", AttributeMode.INITIAL);
		tmp.put("customShippingAddress", AttributeMode.INITIAL);
		tmp.put("containsOCDProduct", AttributeMode.INITIAL);
		tmp.put("sendOrderShipmentEmail", AttributeMode.INITIAL);
		tmp.put("shipmentEmailPreference", AttributeMode.INITIAL);
		tmp.put("poDate", AttributeMode.INITIAL);
		tmp.put("stockUser", AttributeMode.INITIAL);
		tmp.put("endUser", AttributeMode.INITIAL);
		tmp.put("returnCreatedDate", AttributeMode.INITIAL);
		tmp.put("shippingInstruction", AttributeMode.INITIAL);
		tmp.put("paymentmethod", AttributeMode.INITIAL);
		tmp.put("packingList", AttributeMode.INITIAL);
		tmp.put("carrierName", AttributeMode.INITIAL);
		tmp.put("proofOfDelivery", AttributeMode.INITIAL);
		tmp.put("tracking", AttributeMode.INITIAL);
		tmp.put("billOfLanding", AttributeMode.INITIAL);
		tmp.put("returnImages", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("indirectCustomer", AttributeMode.INITIAL);
		tmp.put("priceOverride", AttributeMode.INITIAL);
		tmp.put("priceOverrideReason", AttributeMode.INITIAL);
		tmp.put("expectedDeliveryDate", AttributeMode.INITIAL);
		tmp.put("sapOrderlineNumber", AttributeMode.INITIAL);
		tmp.put("reasonForRejection", AttributeMode.INITIAL);
		tmp.put("deliverySchedules", AttributeMode.INITIAL);
		tmp.put("salesOrg", AttributeMode.INITIAL);
		tmp.put("sapOrderType", AttributeMode.INITIAL);
		tmp.put("sapPriceUpdate", AttributeMode.INITIAL);
		tmp.put("defaultPrice", AttributeMode.INITIAL);
		tmp.put("freightcharges", AttributeMode.INITIAL);
		tmp.put("expeditedFee", AttributeMode.INITIAL);
		tmp.put("totalFees", AttributeMode.INITIAL);
		tmp.put("taxes", AttributeMode.INITIAL);
		tmp.put("freightFees", AttributeMode.INITIAL);
		tmp.put("discountsOnPrice", AttributeMode.INITIAL);
		tmp.put("grossPrice", AttributeMode.INITIAL);
		tmp.put("insurance", AttributeMode.INITIAL);
		tmp.put("handlingFee", AttributeMode.INITIAL);
		tmp.put("dropshipFee", AttributeMode.INITIAL);
		tmp.put("minimumOrderFee", AttributeMode.INITIAL);
		tmp.put("internationalFreight", AttributeMode.INITIAL);
		tmp.put("salesUOM", AttributeMode.INITIAL);
		tmp.put("shippingDate", AttributeMode.INITIAL);
		tmp.put("isProposed", AttributeMode.INITIAL);
		tmp.put("originalOrderItem", AttributeMode.INITIAL);
		tmp.put("batchNumber", AttributeMode.INITIAL);
		tmp.put("serialNumber", AttributeMode.INITIAL);
		tmp.put("contract", AttributeMode.INITIAL);
		tmp.put("lot", AttributeMode.INITIAL);
		tmp.put("status", AttributeMode.INITIAL);
		tmp.put("specialStockPartner", AttributeMode.INITIAL);
		tmp.put("pONumber", AttributeMode.INITIAL);
		tmp.put("invoiceNumber", AttributeMode.INITIAL);
		tmp.put("baseUOM", AttributeMode.INITIAL);
		tmp.put("message", AttributeMode.INITIAL);
		tmp.put("higherLevelItemNo", AttributeMode.INITIAL);
		tmp.put("itemCategory", AttributeMode.INITIAL);
		tmp.put("route", AttributeMode.INITIAL);
		tmp.put("shippingPoint", AttributeMode.INITIAL);
		tmp.put("hsaPromotion", AttributeMode.INITIAL);
		tmp.put("priceType", AttributeMode.INITIAL);
		tmp.put("unloadingPoint", AttributeMode.INITIAL);
		tmp.put("referencedVariant", AttributeMode.INITIAL);
		tmp.put("stockPartner", AttributeMode.INITIAL);
		tmp.put("priceOverrideApprover", AttributeMode.INITIAL);
		tmp.put("returnInvNumber", AttributeMode.INITIAL);
		tmp.put("contractNum", AttributeMode.INITIAL);
		tmp.put("manualFee", AttributeMode.INITIAL);
		tmp.put("holdCode", AttributeMode.INITIAL);
		tmp.put("batchNum", AttributeMode.INITIAL);
		tmp.put("expiryDate", AttributeMode.INITIAL);
		tmp.put("shipmentLoc", AttributeMode.INITIAL);
		tmp.put("approver", AttributeMode.INITIAL);
		tmp.put("plant", AttributeMode.INITIAL);
		tmp.put("selectedRoute", AttributeMode.INITIAL);
		tmp.put("billingDeliveryBlock", AttributeMode.INITIAL);
		tmp.put("custLineNumber", AttributeMode.INITIAL);
		tmp.put("substitutionReason", AttributeMode.INITIAL);
		tmp.put("netPrice", AttributeMode.INITIAL);
		tmp.put("materialNumber", AttributeMode.INITIAL);
		tmp.put("materialEntered", AttributeMode.INITIAL);
		tmp.put("cutNotificationEmailSent", AttributeMode.INITIAL);
		tmp.put("cutNotificationPreference", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("jnJAddressId", AttributeMode.INITIAL);
		tmp.put("active", AttributeMode.INITIAL);
		tmp.put("line3", AttributeMode.INITIAL);
		tmp.put("line4", AttributeMode.INITIAL);
		tmp.put("postalExtCode", AttributeMode.INITIAL);
		tmp.put("poBoxPostalCode", AttributeMode.INITIAL);
		tmp.put("payFromAddress", AttributeMode.INITIAL);
		tmp.put("countyName", AttributeMode.INITIAL);
		tmp.put("sourceSysId", AttributeMode.INITIAL);
		tmp.put("globalLocNo", AttributeMode.INITIAL);
		tmp.put("jnjGTState", AttributeMode.INITIAL);
		tmp.put("attnLine", AttributeMode.INITIAL);
		tmp.put("taxId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("validationErrorKeys", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.CartEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("linkedWithDelivered", AttributeMode.INITIAL);
		tmp.put("validationErrorKeys", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Cart", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("jnjWebSiteType", AttributeMode.INITIAL);
		tmp.put("defaultCountry", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.basecommerce.jalo.site.BaseSite", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ACCOUNTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber(final AbstractOrder item)
	{
		return getAccountNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ACCOUNTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final AbstractOrder item, final String value)
	{
		setAccountNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final Address item)
	{
		return isActive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isActive( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final Address item)
	{
		return isActiveAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Address item, final Boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Address item, final boolean value)
	{
		setActive( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Address item, final boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.approver</code> attribute.
	 * @return the approver
	 */
	public String getApprover(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.APPROVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.approver</code> attribute.
	 * @return the approver
	 */
	public String getApprover(final AbstractOrderEntry item)
	{
		return getApprover( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.approver</code> attribute. 
	 * @param value the approver
	 */
	public void setApprover(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.APPROVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.approver</code> attribute. 
	 * @param value the approver
	 */
	public void setApprover(final AbstractOrderEntry item, final String value)
	{
		setApprover( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.associatedSAPOrderNum</code> attribute.
	 * @return the associatedSAPOrderNum - This attribute is used in case of replenish order to save SAP order num of delivered order
	 */
	public String getAssociatedSAPOrderNum(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ASSOCIATEDSAPORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.associatedSAPOrderNum</code> attribute.
	 * @return the associatedSAPOrderNum - This attribute is used in case of replenish order to save SAP order num of delivered order
	 */
	public String getAssociatedSAPOrderNum(final AbstractOrder item)
	{
		return getAssociatedSAPOrderNum( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.associatedSAPOrderNum</code> attribute. 
	 * @param value the associatedSAPOrderNum - This attribute is used in case of replenish order to save SAP order num of delivered order
	 */
	public void setAssociatedSAPOrderNum(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ASSOCIATEDSAPORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.associatedSAPOrderNum</code> attribute. 
	 * @param value the associatedSAPOrderNum - This attribute is used in case of replenish order to save SAP order num of delivered order
	 */
	public void setAssociatedSAPOrderNum(final AbstractOrder item, final String value)
	{
		setAssociatedSAPOrderNum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.attachedDoc</code> attribute.
	 * @return the attachedDoc
	 */
	public Media getAttachedDoc(final SessionContext ctx, final AbstractOrder item)
	{
		return (Media)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ATTACHEDDOC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.attachedDoc</code> attribute.
	 * @return the attachedDoc
	 */
	public Media getAttachedDoc(final AbstractOrder item)
	{
		return getAttachedDoc( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.attachedDoc</code> attribute. 
	 * @param value the attachedDoc
	 */
	public void setAttachedDoc(final SessionContext ctx, final AbstractOrder item, final Media value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ATTACHEDDOC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.attachedDoc</code> attribute. 
	 * @param value the attachedDoc
	 */
	public void setAttachedDoc(final AbstractOrder item, final Media value)
	{
		setAttachedDoc( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.attention</code> attribute.
	 * @return the attention
	 */
	public String getAttention(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ATTENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.attention</code> attribute.
	 * @return the attention
	 */
	public String getAttention(final AbstractOrder item)
	{
		return getAttention( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.attention</code> attribute. 
	 * @param value the attention
	 */
	public void setAttention(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ATTENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.attention</code> attribute. 
	 * @param value the attention
	 */
	public void setAttention(final AbstractOrder item, final String value)
	{
		setAttention( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.attnLine</code> attribute.
	 * @return the attnLine
	 */
	public String getAttnLine(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.ATTNLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.attnLine</code> attribute.
	 * @return the attnLine
	 */
	public String getAttnLine(final Address item)
	{
		return getAttnLine( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.attnLine</code> attribute. 
	 * @param value the attnLine
	 */
	public void setAttnLine(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.ATTNLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.attnLine</code> attribute. 
	 * @param value the attnLine
	 */
	public void setAttnLine(final Address item, final String value)
	{
		setAttnLine( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.b2bUnitAccounts</code> attribute.
	 * @return the b2bUnitAccounts
	 */
	public Set<JnJB2BUnit> getB2bUnitAccounts(final SessionContext ctx, final Category item)
	{
		final List<JnJB2BUnit> items = item.getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			"JnJB2BUnit",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJB2BUnit>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.b2bUnitAccounts</code> attribute.
	 * @return the b2bUnitAccounts
	 */
	public Set<JnJB2BUnit> getB2bUnitAccounts(final Category item)
	{
		return getB2bUnitAccounts( getSession().getSessionContext(), item );
	}
	
	public long getB2bUnitAccountsCount(final SessionContext ctx, final Category item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			"JnJB2BUnit",
			null
		);
	}
	
	public long getB2bUnitAccountsCount(final Category item)
	{
		return getB2bUnitAccountsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.b2bUnitAccounts</code> attribute. 
	 * @param value the b2bUnitAccounts
	 */
	public void setB2bUnitAccounts(final SessionContext ctx, final Category item, final Set<JnJB2BUnit> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.b2bUnitAccounts</code> attribute. 
	 * @param value the b2bUnitAccounts
	 */
	public void setB2bUnitAccounts(final Category item, final Set<JnJB2BUnit> value)
	{
		setB2bUnitAccounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to b2bUnitAccounts. 
	 * @param value the item to add to b2bUnitAccounts
	 */
	public void addToB2bUnitAccounts(final SessionContext ctx, final Category item, final JnJB2BUnit value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to b2bUnitAccounts. 
	 * @param value the item to add to b2bUnitAccounts
	 */
	public void addToB2bUnitAccounts(final Category item, final JnJB2BUnit value)
	{
		addToB2bUnitAccounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from b2bUnitAccounts. 
	 * @param value the item to remove from b2bUnitAccounts
	 */
	public void removeFromB2bUnitAccounts(final SessionContext ctx, final Category item, final JnJB2BUnit value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.CUSTOMERELIGIBILITYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERELIGIBILITYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from b2bUnitAccounts. 
	 * @param value the item to remove from b2bUnitAccounts
	 */
	public void removeFromB2bUnitAccounts(final Category item, final JnJB2BUnit value)
	{
		removeFromB2bUnitAccounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.baseSites</code> attribute.
	 * @return the baseSites
	 */
	public Collection<BaseSite> getBaseSites(final SessionContext ctx, final Language item)
	{
		final List<BaseSite> items = item.getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			"BaseSite",
			null,
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.baseSites</code> attribute.
	 * @return the baseSites
	 */
	public Collection<BaseSite> getBaseSites(final Language item)
	{
		return getBaseSites( getSession().getSessionContext(), item );
	}
	
	public long getBaseSitesCount(final SessionContext ctx, final Language item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			"BaseSite",
			null
		);
	}
	
	public long getBaseSitesCount(final Language item)
	{
		return getBaseSitesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.baseSites</code> attribute. 
	 * @param value the baseSites
	 */
	public void setBaseSites(final SessionContext ctx, final Language item, final Collection<BaseSite> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.baseSites</code> attribute. 
	 * @param value the baseSites
	 */
	public void setBaseSites(final Language item, final Collection<BaseSite> value)
	{
		setBaseSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseSites. 
	 * @param value the item to add to baseSites
	 */
	public void addToBaseSites(final SessionContext ctx, final Language item, final BaseSite value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseSites. 
	 * @param value the item to add to baseSites
	 */
	public void addToBaseSites(final Language item, final BaseSite value)
	{
		addToBaseSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseSites. 
	 * @param value the item to remove from baseSites
	 */
	public void removeFromBaseSites(final SessionContext ctx, final Language item, final BaseSite value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseSites. 
	 * @param value the item to remove from baseSites
	 */
	public void removeFromBaseSites(final Language item, final BaseSite value)
	{
		removeFromBaseSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.baseUOM</code> attribute.
	 * @return the baseUOM - This attribute is used to store the base uom value.
	 */
	public Unit getBaseUOM(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Unit)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BASEUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.baseUOM</code> attribute.
	 * @return the baseUOM - This attribute is used to store the base uom value.
	 */
	public Unit getBaseUOM(final AbstractOrderEntry item)
	{
		return getBaseUOM( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.baseUOM</code> attribute. 
	 * @param value the baseUOM - This attribute is used to store the base uom value.
	 */
	public void setBaseUOM(final SessionContext ctx, final AbstractOrderEntry item, final Unit value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BASEUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.baseUOM</code> attribute. 
	 * @param value the baseUOM - This attribute is used to store the base uom value.
	 */
	public void setBaseUOM(final AbstractOrderEntry item, final Unit value)
	{
		setBaseUOM( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.batchContentInd</code> attribute.
	 * @return the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public Boolean isBatchContentInd(final SessionContext ctx, final Order item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.BATCHCONTENTIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.batchContentInd</code> attribute.
	 * @return the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public Boolean isBatchContentInd(final Order item)
	{
		return isBatchContentInd( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.batchContentInd</code> attribute. 
	 * @return the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public boolean isBatchContentIndAsPrimitive(final SessionContext ctx, final Order item)
	{
		Boolean value = isBatchContentInd( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.batchContentInd</code> attribute. 
	 * @return the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public boolean isBatchContentIndAsPrimitive(final Order item)
	{
		return isBatchContentIndAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.batchContentInd</code> attribute. 
	 * @param value the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public void setBatchContentInd(final SessionContext ctx, final Order item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.BATCHCONTENTIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.batchContentInd</code> attribute. 
	 * @param value the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public void setBatchContentInd(final Order item, final Boolean value)
	{
		setBatchContentInd( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.batchContentInd</code> attribute. 
	 * @param value the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public void setBatchContentInd(final SessionContext ctx, final Order item, final boolean value)
	{
		setBatchContentInd( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.batchContentInd</code> attribute. 
	 * @param value the batchContentInd - This attribute is part of PCM and indicates, whether, the download is real time or not.
	 */
	public void setBatchContentInd(final Order item, final boolean value)
	{
		setBatchContentInd( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.batchNum</code> attribute.
	 * @return the batchNum
	 */
	public String getBatchNum(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BATCHNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.batchNum</code> attribute.
	 * @return the batchNum
	 */
	public String getBatchNum(final AbstractOrderEntry item)
	{
		return getBatchNum( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.batchNum</code> attribute. 
	 * @param value the batchNum
	 */
	public void setBatchNum(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BATCHNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.batchNum</code> attribute. 
	 * @param value the batchNum
	 */
	public void setBatchNum(final AbstractOrderEntry item, final String value)
	{
		setBatchNum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.batchNumber</code> attribute.
	 * @return the batchNumber
	 */
	public String getBatchNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BATCHNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.batchNumber</code> attribute.
	 * @return the batchNumber
	 */
	public String getBatchNumber(final AbstractOrderEntry item)
	{
		return getBatchNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.batchNumber</code> attribute. 
	 * @param value the batchNumber
	 */
	public void setBatchNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BATCHNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.batchNumber</code> attribute. 
	 * @param value the batchNumber
	 */
	public void setBatchNumber(final AbstractOrderEntry item, final String value)
	{
		setBatchNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.billingDeliveryBlock</code> attribute.
	 * @return the billingDeliveryBlock - This attribute will save value from Delivered/Replenish 'CreateOrder' response
	 */
	public String getBillingDeliveryBlock(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BILLINGDELIVERYBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.billingDeliveryBlock</code> attribute.
	 * @return the billingDeliveryBlock - This attribute will save value from Delivered/Replenish 'CreateOrder' response
	 */
	public String getBillingDeliveryBlock(final AbstractOrderEntry item)
	{
		return getBillingDeliveryBlock( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.billingDeliveryBlock</code> attribute. 
	 * @param value the billingDeliveryBlock - This attribute will save value from Delivered/Replenish 'CreateOrder' response
	 */
	public void setBillingDeliveryBlock(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.BILLINGDELIVERYBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.billingDeliveryBlock</code> attribute. 
	 * @param value the billingDeliveryBlock - This attribute will save value from Delivered/Replenish 'CreateOrder' response
	 */
	public void setBillingDeliveryBlock(final AbstractOrderEntry item, final String value)
	{
		setBillingDeliveryBlock( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.billOfLanding</code> attribute.
	 * @return the billOfLanding - Bill Of Lading
	 */
	public String getBillOfLanding(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.BILLOFLANDING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.billOfLanding</code> attribute.
	 * @return the billOfLanding - Bill Of Lading
	 */
	public String getBillOfLanding(final AbstractOrder item)
	{
		return getBillOfLanding( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.billOfLanding</code> attribute. 
	 * @param value the billOfLanding - Bill Of Lading
	 */
	public void setBillOfLanding(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.BILLOFLANDING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.billOfLanding</code> attribute. 
	 * @param value the billOfLanding - Bill Of Lading
	 */
	public void setBillOfLanding(final AbstractOrder item, final String value)
	{
		setBillOfLanding( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.carrierName</code> attribute.
	 * @return the carrierName - carrierName
	 */
	public String getCarrierName(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CARRIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.carrierName</code> attribute.
	 * @return the carrierName - carrierName
	 */
	public String getCarrierName(final AbstractOrder item)
	{
		return getCarrierName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.carrierName</code> attribute. 
	 * @param value the carrierName - carrierName
	 */
	public void setCarrierName(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CARRIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.carrierName</code> attribute. 
	 * @param value the carrierName - carrierName
	 */
	public void setCarrierName(final AbstractOrder item, final String value)
	{
		setCarrierName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.completeDelivery</code> attribute.
	 * @return the completeDelivery
	 */
	public String getCompleteDelivery(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.COMPLETEDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.completeDelivery</code> attribute.
	 * @return the completeDelivery
	 */
	public String getCompleteDelivery(final AbstractOrder item)
	{
		return getCompleteDelivery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.completeDelivery</code> attribute. 
	 * @param value the completeDelivery
	 */
	public void setCompleteDelivery(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.COMPLETEDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.completeDelivery</code> attribute. 
	 * @param value the completeDelivery
	 */
	public void setCompleteDelivery(final AbstractOrder item, final String value)
	{
		setCompleteDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.confirmationEmailSent</code> attribute.
	 * @return the confirmationEmailSent
	 */
	public Boolean isConfirmationEmailSent(final SessionContext ctx, final Order item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.CONFIRMATIONEMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.confirmationEmailSent</code> attribute.
	 * @return the confirmationEmailSent
	 */
	public Boolean isConfirmationEmailSent(final Order item)
	{
		return isConfirmationEmailSent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @return the confirmationEmailSent
	 */
	public boolean isConfirmationEmailSentAsPrimitive(final SessionContext ctx, final Order item)
	{
		Boolean value = isConfirmationEmailSent( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @return the confirmationEmailSent
	 */
	public boolean isConfirmationEmailSentAsPrimitive(final Order item)
	{
		return isConfirmationEmailSentAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @param value the confirmationEmailSent
	 */
	public void setConfirmationEmailSent(final SessionContext ctx, final Order item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.CONFIRMATIONEMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @param value the confirmationEmailSent
	 */
	public void setConfirmationEmailSent(final Order item, final Boolean value)
	{
		setConfirmationEmailSent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @param value the confirmationEmailSent
	 */
	public void setConfirmationEmailSent(final SessionContext ctx, final Order item, final boolean value)
	{
		setConfirmationEmailSent( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.confirmationEmailSent</code> attribute. 
	 * @param value the confirmationEmailSent
	 */
	public void setConfirmationEmailSent(final Order item, final boolean value)
	{
		setConfirmationEmailSent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.containsOCDProduct</code> attribute.
	 * @return the containsOCDProduct
	 */
	public Boolean isContainsOCDProduct(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CONTAINSOCDPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.containsOCDProduct</code> attribute.
	 * @return the containsOCDProduct
	 */
	public Boolean isContainsOCDProduct(final AbstractOrder item)
	{
		return isContainsOCDProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @return the containsOCDProduct
	 */
	public boolean isContainsOCDProductAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isContainsOCDProduct( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @return the containsOCDProduct
	 */
	public boolean isContainsOCDProductAsPrimitive(final AbstractOrder item)
	{
		return isContainsOCDProductAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @param value the containsOCDProduct
	 */
	public void setContainsOCDProduct(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CONTAINSOCDPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @param value the containsOCDProduct
	 */
	public void setContainsOCDProduct(final AbstractOrder item, final Boolean value)
	{
		setContainsOCDProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @param value the containsOCDProduct
	 */
	public void setContainsOCDProduct(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setContainsOCDProduct( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.containsOCDProduct</code> attribute. 
	 * @param value the containsOCDProduct
	 */
	public void setContainsOCDProduct(final AbstractOrder item, final boolean value)
	{
		setContainsOCDProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.contract</code> attribute.
	 * @return the contract
	 */
	public String getContract(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CONTRACT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.contract</code> attribute.
	 * @return the contract
	 */
	public String getContract(final AbstractOrderEntry item)
	{
		return getContract( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CONTRACT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final AbstractOrderEntry item, final String value)
	{
		setContract( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CONTRACTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.contractNum</code> attribute.
	 * @return the contractNum
	 */
	public String getContractNum(final AbstractOrderEntry item)
	{
		return getContractNum( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CONTRACTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.contractNum</code> attribute. 
	 * @param value the contractNum
	 */
	public void setContractNum(final AbstractOrderEntry item, final String value)
	{
		setContractNum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.contractNumber</code> attribute.
	 * @return the contractNumber
	 */
	public String getContractNumber(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CONTRACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.contractNumber</code> attribute.
	 * @return the contractNumber
	 */
	public String getContractNumber(final AbstractOrder item)
	{
		return getContractNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.contractNumber</code> attribute. 
	 * @param value the contractNumber
	 */
	public void setContractNumber(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CONTRACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.contractNumber</code> attribute. 
	 * @param value the contractNumber
	 */
	public void setContractNumber(final AbstractOrder item, final String value)
	{
		setContractNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.contracts</code> attribute.
	 * @return the contracts
	 */
	public Collection<JnjContract> getContracts(final SessionContext ctx, final B2BUnit item)
	{
		return B2BUNIT2CONTRACTRELATIONCONTRACTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.contracts</code> attribute.
	 * @return the contracts
	 */
	public Collection<JnjContract> getContracts(final B2BUnit item)
	{
		return getContracts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.contracts</code> attribute. 
	 * @param value the contracts
	 */
	public void setContracts(final SessionContext ctx, final B2BUnit item, final Collection<JnjContract> value)
	{
		B2BUNIT2CONTRACTRELATIONCONTRACTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.contracts</code> attribute. 
	 * @param value the contracts
	 */
	public void setContracts(final B2BUnit item, final Collection<JnjContract> value)
	{
		setContracts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contracts. 
	 * @param value the item to add to contracts
	 */
	public void addToContracts(final SessionContext ctx, final B2BUnit item, final JnjContract value)
	{
		B2BUNIT2CONTRACTRELATIONCONTRACTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contracts. 
	 * @param value the item to add to contracts
	 */
	public void addToContracts(final B2BUnit item, final JnjContract value)
	{
		addToContracts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contracts. 
	 * @param value the item to remove from contracts
	 */
	public void removeFromContracts(final SessionContext ctx, final B2BUnit item, final JnjContract value)
	{
		B2BUNIT2CONTRACTRELATIONCONTRACTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contracts. 
	 * @param value the item to remove from contracts
	 */
	public void removeFromContracts(final B2BUnit item, final JnjContract value)
	{
		removeFromContracts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.cordisHouseAccount</code> attribute.
	 * @return the cordisHouseAccount
	 */
	public String getCordisHouseAccount(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CORDISHOUSEACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.cordisHouseAccount</code> attribute.
	 * @return the cordisHouseAccount
	 */
	public String getCordisHouseAccount(final AbstractOrder item)
	{
		return getCordisHouseAccount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.cordisHouseAccount</code> attribute. 
	 * @param value the cordisHouseAccount
	 */
	public void setCordisHouseAccount(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CORDISHOUSEACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.cordisHouseAccount</code> attribute. 
	 * @param value the cordisHouseAccount
	 */
	public void setCordisHouseAccount(final AbstractOrder item, final String value)
	{
		setCordisHouseAccount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.countyName</code> attribute.
	 * @return the countyName
	 */
	public String getCountyName(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.COUNTYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.countyName</code> attribute.
	 * @return the countyName
	 */
	public String getCountyName(final Address item)
	{
		return getCountyName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.countyName</code> attribute. 
	 * @param value the countyName
	 */
	public void setCountyName(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.COUNTYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.countyName</code> attribute. 
	 * @param value the countyName
	 */
	public void setCountyName(final Address item, final String value)
	{
		setCountyName( getSession().getSessionContext(), item, value );
	}
	
	public BroadcastMessage createBroadcastMessage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.BROADCASTMESSAGE );
			return (BroadcastMessage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BroadcastMessage : "+e.getMessage(), 0 );
		}
	}
	
	public BroadcastMessage createBroadcastMessage(final Map attributeValues)
	{
		return createBroadcastMessage( getSession().getSessionContext(), attributeValues );
	}
	
	public CatalogComponent createCatalogComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.CATALOGCOMPONENT );
			return (CatalogComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CatalogComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CatalogComponent createCatalogComponent(final Map attributeValues)
	{
		return createCatalogComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ClassOfTradeGroup createClassOfTradeGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.CLASSOFTRADEGROUP );
			return (ClassOfTradeGroup)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ClassOfTradeGroup : "+e.getMessage(), 0 );
		}
	}
	
	public ClassOfTradeGroup createClassOfTradeGroup(final Map attributeValues)
	{
		return createClassOfTradeGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyInfo createCompanyInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.COMPANYINFO );
			return (CompanyInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CompanyInfo : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyInfo createCompanyInfo(final Map attributeValues)
	{
		return createCompanyInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ContactUsProcess createContactUsProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.CONTACTUSPROCESS );
			return (ContactUsProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContactUsProcess : "+e.getMessage(), 0 );
		}
	}
	
	public ContactUsProcess createContactUsProcess(final Map attributeValues)
	{
		return createContactUsProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public IntegrationJobDetails createIntegrationJobDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.INTEGRATIONJOBDETAILS );
			return (IntegrationJobDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating IntegrationJobDetails : "+e.getMessage(), 0 );
		}
	}
	
	public IntegrationJobDetails createIntegrationJobDetails(final Map attributeValues)
	{
		return createIntegrationJobDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJAmazonFile createJnJAmazonFile(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJAMAZONFILE );
			return (JnJAmazonFile)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJAmazonFile : "+e.getMessage(), 0 );
		}
	}
	
	public JnJAmazonFile createJnJAmazonFile(final Map attributeValues)
	{
		return createJnJAmazonFile( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJB2bCustomer createJnJB2bCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJB2BCUSTOMER );
			return (JnJB2bCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJB2bCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public JnJB2bCustomer createJnJB2bCustomer(final Map attributeValues)
	{
		return createJnJB2bCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJB2BUnit createJnJB2BUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJB2BUNIT );
			return (JnJB2BUnit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJB2BUnit : "+e.getMessage(), 0 );
		}
	}
	
	public JnJB2BUnit createJnJB2BUnit(final Map attributeValues)
	{
		return createJnJB2BUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjConfig createJnjConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJCONFIG );
			return (JnjConfig)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjConfig : "+e.getMessage(), 0 );
		}
	}
	
	public JnjConfig createJnjConfig(final Map attributeValues)
	{
		return createJnjConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjContract createJnjContract(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJCONTRACT );
			return (JnjContract)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjContract : "+e.getMessage(), 0 );
		}
	}
	
	public JnjContract createJnjContract(final Map attributeValues)
	{
		return createJnjContract( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjContractEntry createJnjContractEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJCONTRACTENTRY );
			return (JnjContractEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjContractEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjContractEntry createJnjContractEntry(final Map attributeValues)
	{
		return createJnjContractEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjContractEntryPrice createJnjContractEntryPrice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJCONTRACTENTRYPRICE );
			return (JnjContractEntryPrice)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjContractEntryPrice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjContractEntryPrice createJnjContractEntryPrice(final Map attributeValues)
	{
		return createJnjContractEntryPrice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjCreateUserProcess createJnjCreateUserProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJCREATEUSERPROCESS );
			return (JnjCreateUserProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjCreateUserProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjCreateUserProcess createJnjCreateUserProcess(final Map attributeValues)
	{
		return createJnjCreateUserProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjDeliverySchedule createJnjDeliverySchedule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJDELIVERYSCHEDULE );
			return (JnjDeliverySchedule)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjDeliverySchedule : "+e.getMessage(), 0 );
		}
	}
	
	public JnjDeliverySchedule createJnjDeliverySchedule(final Map attributeValues)
	{
		return createJnjDeliverySchedule( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjDropShipmentDetails createJnjDropShipmentDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJDROPSHIPMENTDETAILS );
			return (JnjDropShipmentDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjDropShipmentDetails : "+e.getMessage(), 0 );
		}
	}
	
	public JnjDropShipmentDetails createJnjDropShipmentDetails(final Map attributeValues)
	{
		return createJnjDropShipmentDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjEpicEmailFooterComponent createJnjEpicEmailFooterComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJEPICEMAILFOOTERCOMPONENT );
			return (JnjEpicEmailFooterComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjEpicEmailFooterComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjEpicEmailFooterComponent createJnjEpicEmailFooterComponent(final Map attributeValues)
	{
		return createJnjEpicEmailFooterComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjFormProcess createJnjFormProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJFORMPROCESS );
			return (JnjFormProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjFormProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjFormProcess createJnjFormProcess(final Map attributeValues)
	{
		return createJnjFormProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTAddAccountEmailProcess createJnjGTAddAccountEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTADDACCOUNTEMAILPROCESS );
			return (JnjGTAddAccountEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTAddAccountEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTAddAccountEmailProcess createJnjGTAddAccountEmailProcess(final Map attributeValues)
	{
		return createJnjGTAddAccountEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTAddExistingAccountEmailProcess createJnjGTAddExistingAccountEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTADDEXISTINGACCOUNTEMAILPROCESS );
			return (JnjGTAddExistingAccountEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTAddExistingAccountEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTAddExistingAccountEmailProcess createJnjGTAddExistingAccountEmailProcess(final Map attributeValues)
	{
		return createJnjGTAddExistingAccountEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTApproveUserEmailProcess createJnjGTApproveUserEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTAPPROVEUSEREMAILPROCESS );
			return (JnjGTApproveUserEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTApproveUserEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTApproveUserEmailProcess createJnjGTApproveUserEmailProcess(final Map attributeValues)
	{
		return createJnjGTApproveUserEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTAuditTrail createJnJGTAuditTrail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTAUDITTRAIL );
			return (JnJGTAuditTrail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJGTAuditTrail : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTAuditTrail createJnJGTAuditTrail(final Map attributeValues)
	{
		return createJnJGTAuditTrail( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTBackOrderEmailBusinessProcess createJnjGTBackOrderEmailBusinessProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTBACKORDEREMAILBUSINESSPROCESS );
			return (JnjGTBackOrderEmailBusinessProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTBackOrderEmailBusinessProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTBackOrderEmailBusinessProcess createJnjGTBackOrderEmailBusinessProcess(final Map attributeValues)
	{
		return createJnjGTBackOrderEmailBusinessProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCartOrderEmailProcess createJnjGTCartOrderEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCARTORDEREMAILPROCESS );
			return (JnjGTCartOrderEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCartOrderEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCartOrderEmailProcess createJnjGTCartOrderEmailProcess(final Map attributeValues)
	{
		return createJnjGTCartOrderEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTComprehensiveOrderConfirmationEmailBusinessProcess createJnjGTComprehensiveOrderConfirmationEmailBusinessProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCOMPREHENSIVEORDERCONFIRMATIONEMAILBUSINESSPROCESS );
			return (JnjGTComprehensiveOrderConfirmationEmailBusinessProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTComprehensiveOrderConfirmationEmailBusinessProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTComprehensiveOrderConfirmationEmailBusinessProcess createJnjGTComprehensiveOrderConfirmationEmailBusinessProcess(final Map attributeValues)
	{
		return createJnjGTComprehensiveOrderConfirmationEmailBusinessProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTContactUsEmailProcess createJnjGTContactUsEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCONTACTUSEMAILPROCESS );
			return (JnjGTContactUsEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTContactUsEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTContactUsEmailProcess createJnjGTContactUsEmailProcess(final Map attributeValues)
	{
		return createJnjGTContactUsEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCpscContact createJnjGTCpscContact(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCPSCCONTACT );
			return (JnjGTCpscContact)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCpscContact : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCpscContact createJnjGTCpscContact(final Map attributeValues)
	{
		return createJnjGTCpscContact( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCpscTestDetail createJnjGTCpscTestDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCPSCTESTDETAIL );
			return (JnjGTCpscTestDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCpscTestDetail : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCpscTestDetail createJnjGTCpscTestDetail(final Map attributeValues)
	{
		return createJnjGTCpscTestDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCreateUserEmailProcess createJnjGTCreateUserEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCREATEUSEREMAILPROCESS );
			return (JnjGTCreateUserEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCreateUserEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCreateUserEmailProcess createJnjGTCreateUserEmailProcess(final Map attributeValues)
	{
		return createJnjGTCreateUserEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCreditCard createJnjGTCreditCard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCREDITCARD );
			return (JnjGTCreditCard)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCreditCard : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCreditCard createJnjGTCreditCard(final Map attributeValues)
	{
		return createJnjGTCreditCard( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTCutNotificationEmailProcess createJnjGTCutNotificationEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTCUTNOTIFICATIONEMAILPROCESS );
			return (JnjGTCutNotificationEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTCutNotificationEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTCutNotificationEmailProcess createJnjGTCutNotificationEmailProcess(final Map attributeValues)
	{
		return createJnjGTCutNotificationEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTDisputeInquiryProcess createJnjGTDisputeInquiryProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTDISPUTEINQUIRYPROCESS );
			return (JnjGTDisputeInquiryProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTDisputeInquiryProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTDisputeInquiryProcess createJnjGTDisputeInquiryProcess(final Map attributeValues)
	{
		return createJnjGTDisputeInquiryProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTEarlyZipCodes createJnjGTEarlyZipCodes(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTEARLYZIPCODES );
			return (JnjGTEarlyZipCodes)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTEarlyZipCodes : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTEarlyZipCodes createJnjGTEarlyZipCodes(final Map attributeValues)
	{
		return createJnjGTEarlyZipCodes( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTExportCatalogEmailProcess createJnjGTExportCatalogEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTEXPORTCATALOGEMAILPROCESS );
			return (JnjGTExportCatalogEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTExportCatalogEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTExportCatalogEmailProcess createJnjGTExportCatalogEmailProcess(final Map attributeValues)
	{
		return createJnjGTExportCatalogEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTExProductAttribute createJnjGTExProductAttribute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTEXPRODUCTATTRIBUTE );
			return (JnjGTExProductAttribute)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTExProductAttribute : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTExProductAttribute createJnjGTExProductAttribute(final Map attributeValues)
	{
		return createJnjGTExProductAttribute( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntermediateMaster createJnjGTIntermediateMaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTINTERMEDIATEMASTER );
			return (JnjGTIntermediateMaster)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTIntermediateMaster : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntermediateMaster createJnjGTIntermediateMaster(final Map attributeValues)
	{
		return createJnjGTIntermediateMaster( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTInvoice createJnjGTInvoice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTINVOICE );
			return (JnjGTInvoice)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTInvoice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTInvoice createJnjGTInvoice(final Map attributeValues)
	{
		return createJnjGTInvoice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTInvoiceEntry createJnjGTInvoiceEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTINVOICEENTRY );
			return (JnjGTInvoiceEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTInvoiceEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTInvoiceEntry createJnjGTInvoiceEntry(final Map attributeValues)
	{
		return createJnjGTInvoiceEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTInvoiceEntryLot createJnjGTInvoiceEntryLot(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTINVOICEENTRYLOT );
			return (JnjGTInvoiceEntryLot)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTInvoiceEntryLot : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTInvoiceEntryLot createJnjGTInvoiceEntryLot(final Map attributeValues)
	{
		return createJnjGTInvoiceEntryLot( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTInvoicePrice createJnjGTInvoicePrice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTINVOICEPRICE );
			return (JnjGTInvoicePrice)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTInvoicePrice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTInvoicePrice createJnjGTInvoicePrice(final Map attributeValues)
	{
		return createJnjGTInvoicePrice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTOrderCancelEmailProcess createJnjGTOrderCancelEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTORDERCANCELEMAILPROCESS );
			return (JnjGTOrderCancelEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTOrderCancelEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTOrderCancelEmailProcess createJnjGTOrderCancelEmailProcess(final Map attributeValues)
	{
		return createJnjGTOrderCancelEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTOrderChannel createJnjGTOrderChannel(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTORDERCHANNEL );
			return (JnjGTOrderChannel)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTOrderChannel : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTOrderChannel createJnjGTOrderChannel(final Map attributeValues)
	{
		return createJnjGTOrderChannel( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTOrderShipmentEmailBusinessProcess createJnjGTOrderShipmentEmailBusinessProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTORDERSHIPMENTEMAILBUSINESSPROCESS );
			return (JnjGTOrderShipmentEmailBusinessProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTOrderShipmentEmailBusinessProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTOrderShipmentEmailBusinessProcess createJnjGTOrderShipmentEmailBusinessProcess(final Map attributeValues)
	{
		return createJnjGTOrderShipmentEmailBusinessProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTOrdHdrNote createJnjGTOrdHdrNote(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTORDHDRNOTE );
			return (JnjGTOrdHdrNote)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTOrdHdrNote : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTOrdHdrNote createJnjGTOrdHdrNote(final Map attributeValues)
	{
		return createJnjGTOrdHdrNote( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTOrdInboundValidationEmailProcess createJnjGTOrdInboundValidationEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTORDINBOUNDVALIDATIONEMAILPROCESS );
			return (JnjGTOrdInboundValidationEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTOrdInboundValidationEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTOrdInboundValidationEmailProcess createJnjGTOrdInboundValidationEmailProcess(final Map attributeValues)
	{
		return createJnjGTOrdInboundValidationEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTPriceRow createJnJGTPriceRow(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRICEROW );
			return (JnJGTPriceRow)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJGTPriceRow : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTPriceRow createJnJGTPriceRow(final Map attributeValues)
	{
		return createJnJGTPriceRow( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTProductCpscDetail createJnjGTProductCpscDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTCPSCDETAIL );
			return (JnjGTProductCpscDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTProductCpscDetail : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTProductCpscDetail createJnjGTProductCpscDetail(final Map attributeValues)
	{
		return createJnjGTProductCpscDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTProductKit createJnJGTProductKit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTKIT );
			return (JnJGTProductKit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJGTProductKit : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTProductKit createJnJGTProductKit(final Map attributeValues)
	{
		return createJnJGTProductKit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTProductLot createJnjGTProductLot(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTLOT );
			return (JnjGTProductLot)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTProductLot : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTProductLot createJnjGTProductLot(final Map attributeValues)
	{
		return createJnjGTProductLot( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTProductPlant createJnjGTProductPlant(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTPLANT );
			return (JnjGTProductPlant)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTProductPlant : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTProductPlant createJnjGTProductPlant(final Map attributeValues)
	{
		return createJnjGTProductPlant( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTProductReg createJnjGTProductReg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTREG );
			return (JnjGTProductReg)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTProductReg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTProductReg createJnjGTProductReg(final Map attributeValues)
	{
		return createJnjGTProductReg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTProductSalesOrg createJnJGTProductSalesOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTSALESORG );
			return (JnJGTProductSalesOrg)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJGTProductSalesOrg : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTProductSalesOrg createJnJGTProductSalesOrg(final Map attributeValues)
	{
		return createJnJGTProductSalesOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTProductUnitLocal createJnJGTProductUnitLocal(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPRODUCTUNITLOCAL );
			return (JnJGTProductUnitLocal)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJGTProductUnitLocal : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTProductUnitLocal createJnJGTProductUnitLocal(final Map attributeValues)
	{
		return createJnJGTProductUnitLocal( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTProfilePasswordExpireEmailProcess createJnjGTProfilePasswordExpireEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTPROFILEPASSWORDEXPIREEMAILPROCESS );
			return (JnjGTProfilePasswordExpireEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTProfilePasswordExpireEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTProfilePasswordExpireEmailProcess createJnjGTProfilePasswordExpireEmailProcess(final Map attributeValues)
	{
		return createJnjGTProfilePasswordExpireEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTRegistrationConfirmationEmailProcess createJnjGTRegistrationConfirmationEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTREGISTRATIONCONFIRMATIONEMAILPROCESS );
			return (JnjGTRegistrationConfirmationEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTRegistrationConfirmationEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTRegistrationConfirmationEmailProcess createJnjGTRegistrationConfirmationEmailProcess(final Map attributeValues)
	{
		return createJnjGTRegistrationConfirmationEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTRejectUserEmailProcess createJnjGTRejectUserEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTREJECTUSEREMAILPROCESS );
			return (JnjGTRejectUserEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTRejectUserEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTRejectUserEmailProcess createJnjGTRejectUserEmailProcess(final Map attributeValues)
	{
		return createJnjGTRejectUserEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSalesOrgCustomer createJnjGTSalesOrgCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSALESORGCUSTOMER );
			return (JnjGTSalesOrgCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSalesOrgCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSalesOrgCustomer createJnjGTSalesOrgCustomer(final Map attributeValues)
	{
		return createJnjGTSalesOrgCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTShipmentConfirmationEmailBusinessProcess createJnjGTShipmentConfirmationEmailBusinessProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSHIPMENTCONFIRMATIONEMAILBUSINESSPROCESS );
			return (JnjGTShipmentConfirmationEmailBusinessProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShipmentConfirmationEmailBusinessProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShipmentConfirmationEmailBusinessProcess createJnjGTShipmentConfirmationEmailBusinessProcess(final Map attributeValues)
	{
		return createJnjGTShipmentConfirmationEmailBusinessProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTShipmentTrackingURLs createJnjGTShipmentTrackingURLs(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSHIPMENTTRACKINGURLS );
			return (JnjGTShipmentTrackingURLs)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShipmentTrackingURLs : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShipmentTrackingURLs createJnjGTShipmentTrackingURLs(final Map attributeValues)
	{
		return createJnjGTShipmentTrackingURLs( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTShippingDetails createJnjGTShippingDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSHIPPINGDETAILS );
			return (JnjGTShippingDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShippingDetails : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShippingDetails createJnjGTShippingDetails(final Map attributeValues)
	{
		return createJnjGTShippingDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTShippingLineDetails createJnjGTShippingLineDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSHIPPINGLINEDETAILS );
			return (JnjGTShippingLineDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShippingLineDetails : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShippingLineDetails createJnjGTShippingLineDetails(final Map attributeValues)
	{
		return createJnjGTShippingLineDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTShippingMethod createJnjGTShippingMethod(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSHIPPINGMETHOD );
			return (JnjGTShippingMethod)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShippingMethod : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShippingMethod createJnjGTShippingMethod(final Map attributeValues)
	{
		return createJnjGTShippingMethod( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSuccessfulRegistrationEmailProcess createJnjGTSuccessfulRegistrationEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSUCCESSFULREGISTRATIONEMAILPROCESS );
			return (JnjGTSuccessfulRegistrationEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSuccessfulRegistrationEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSuccessfulRegistrationEmailProcess createJnjGTSuccessfulRegistrationEmailProcess(final Map attributeValues)
	{
		return createJnjGTSuccessfulRegistrationEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSupervisorApprovalEmailProcess createJnjGTSupervisorApprovalEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSUPERVISORAPPROVALEMAILPROCESS );
			return (JnjGTSupervisorApprovalEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSupervisorApprovalEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSupervisorApprovalEmailProcess createJnjGTSupervisorApprovalEmailProcess(final Map attributeValues)
	{
		return createJnjGTSupervisorApprovalEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSurgeon createJnjGTSurgeon(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSURGEON );
			return (JnjGTSurgeon)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSurgeon : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSurgeon createJnjGTSurgeon(final Map attributeValues)
	{
		return createJnjGTSurgeon( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSurgeryInfo createJnjGTSurgeryInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSURGERYINFO );
			return (JnjGTSurgeryInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSurgeryInfo : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSurgeryInfo createJnjGTSurgeryInfo(final Map attributeValues)
	{
		return createJnjGTSurgeryInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTSurveyLinkComponent createJnjGTSurveyLinkComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTSURVEYLINKCOMPONENT );
			return (JnjGTSurveyLinkComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTSurveyLinkComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTSurveyLinkComponent createJnjGTSurveyLinkComponent(final Map attributeValues)
	{
		return createJnjGTSurveyLinkComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTemporaryPwdEmailProcess createJnjGTTemporaryPwdEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTTEMPORARYPWDEMAILPROCESS );
			return (JnjGTTemporaryPwdEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTTemporaryPwdEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTemporaryPwdEmailProcess createJnjGTTemporaryPwdEmailProcess(final Map attributeValues)
	{
		return createJnjGTTemporaryPwdEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTerritoryDivAddresses createJnjGTTerritoryDivAddresses(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTTERRITORYDIVADDRESSES );
			return (JnjGTTerritoryDivAddresses)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTTerritoryDivAddresses : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTerritoryDivAddresses createJnjGTTerritoryDivAddresses(final Map attributeValues)
	{
		return createJnjGTTerritoryDivAddresses( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTerritoryDivCustRel createJnjGTTerritoryDivCustRel(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTTERRITORYDIVCUSTREL );
			return (JnjGTTerritoryDivCustRel)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTTerritoryDivCustRel : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTerritoryDivCustRel createJnjGTTerritoryDivCustRel(final Map attributeValues)
	{
		return createJnjGTTerritoryDivCustRel( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTerritoryDivison createJnjGTTerritoryDivison(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTTERRITORYDIVISON );
			return (JnjGTTerritoryDivison)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTTerritoryDivison : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTerritoryDivison createJnjGTTerritoryDivison(final Map attributeValues)
	{
		return createJnjGTTerritoryDivison( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTerritoryDivProdMapping createJnjGTTerritoryDivProdMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTTERRITORYDIVPRODMAPPING );
			return (JnjGTTerritoryDivProdMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTTerritoryDivProdMapping : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTerritoryDivProdMapping createJnjGTTerritoryDivProdMapping(final Map attributeValues)
	{
		return createJnjGTTerritoryDivProdMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTUserDisableLoginEmailProcess createJnjGTUserDisableLoginEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTUSERDISABLELOGINEMAILPROCESS );
			return (JnjGTUserDisableLoginEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTUserDisableLoginEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTUserDisableLoginEmailProcess createJnjGTUserDisableLoginEmailProcess(final Map attributeValues)
	{
		return createJnjGTUserDisableLoginEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTVariantProduct createJnjGTVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJGTVARIANTPRODUCT );
			return (JnjGTVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTVariantProduct createJnjGTVariantProduct(final Map attributeValues)
	{
		return createJnjGTVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjImtContract createJnjImtContract(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJIMTCONTRACT );
			return (JnjImtContract)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjImtContract : "+e.getMessage(), 0 );
		}
	}
	
	public JnjImtContract createJnjImtContract(final Map attributeValues)
	{
		return createJnjImtContract( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjImtContractEntry createJnjImtContractEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJIMTCONTRACTENTRY );
			return (JnjImtContractEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjImtContractEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjImtContractEntry createJnjImtContractEntry(final Map attributeValues)
	{
		return createJnjImtContractEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjIndirectCustomer createJnjIndirectCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINDIRECTCUSTOMER );
			return (JnjIndirectCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjIndirectCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public JnjIndirectCustomer createJnjIndirectCustomer(final Map attributeValues)
	{
		return createJnjIndirectCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjIntegrationCronJob createJnjIntegrationCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINTEGRATIONCRONJOB );
			return (JnjIntegrationCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjIntegrationCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjIntegrationCronJob createJnjIntegrationCronJob(final Map attributeValues)
	{
		return createJnjIntegrationCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjIntegrationRSACronJob createJnjIntegrationRSACronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINTEGRATIONRSACRONJOB );
			return (JnjIntegrationRSACronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjIntegrationRSACronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjIntegrationRSACronJob createJnjIntegrationRSACronJob(final Map attributeValues)
	{
		return createJnjIntegrationRSACronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjInterfaceNotificationProcess createJnjInterfaceNotificationProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINTERFACENOTIFICATIONPROCESS );
			return (JnjInterfaceNotificationProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjInterfaceNotificationProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjInterfaceNotificationProcess createJnjInterfaceNotificationProcess(final Map attributeValues)
	{
		return createJnjInterfaceNotificationProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJInvoiceEntry createJnJInvoiceEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINVOICEENTRY );
			return (JnJInvoiceEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJInvoiceEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnJInvoiceEntry createJnJInvoiceEntry(final Map attributeValues)
	{
		return createJnJInvoiceEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJInvoiceOrder createJnJInvoiceOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJINVOICEORDER );
			return (JnJInvoiceOrder)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJInvoiceOrder : "+e.getMessage(), 0 );
		}
	}
	
	public JnJInvoiceOrder createJnJInvoiceOrder(final Map attributeValues)
	{
		return createJnJInvoiceOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjLaudo createJnjLaudo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJLAUDO );
			return (JnjLaudo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjLaudo : "+e.getMessage(), 0 );
		}
	}
	
	public JnjLaudo createJnjLaudo(final Map attributeValues)
	{
		return createJnjLaudo( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjLinkComponent createJnjLinkComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJLINKCOMPONENT );
			return (JnjLinkComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjLinkComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjLinkComponent createJnjLinkComponent(final Map attributeValues)
	{
		return createJnjLinkComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjNewsBannerComponent createJnjNewsBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJNEWSBANNERCOMPONENT );
			return (JnjNewsBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjNewsBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjNewsBannerComponent createJnjNewsBannerComponent(final Map attributeValues)
	{
		return createJnjNewsBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrdEntStsMapping createJnjOrdEntStsMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDENTSTSMAPPING );
			return (JnjOrdEntStsMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrdEntStsMapping : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrdEntStsMapping createJnjOrdEntStsMapping(final Map attributeValues)
	{
		return createJnjOrdEntStsMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrderCreditLimitMsg createJnjOrderCreditLimitMsg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDERCREDITLIMITMSG );
			return (JnjOrderCreditLimitMsg)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrderCreditLimitMsg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrderCreditLimitMsg createJnjOrderCreditLimitMsg(final Map attributeValues)
	{
		return createJnjOrderCreditLimitMsg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrderLineItemCancelEmailTiggerCronJob createJnjOrderLineItemCancelEmailTiggerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDERLINEITEMCANCELEMAILTIGGERCRONJOB );
			return (JnjOrderLineItemCancelEmailTiggerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrderLineItemCancelEmailTiggerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrderLineItemCancelEmailTiggerCronJob createJnjOrderLineItemCancelEmailTiggerCronJob(final Map attributeValues)
	{
		return createJnjOrderLineItemCancelEmailTiggerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrderStatusNotificationProcess createJnjOrderStatusNotificationProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDERSTATUSNOTIFICATIONPROCESS );
			return (JnjOrderStatusNotificationProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrderStatusNotificationProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrderStatusNotificationProcess createJnjOrderStatusNotificationProcess(final Map attributeValues)
	{
		return createJnjOrderStatusNotificationProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrderTemplate createJnjOrderTemplate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDERTEMPLATE );
			return (JnjOrderTemplate)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrderTemplate : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrderTemplate createJnjOrderTemplate(final Map attributeValues)
	{
		return createJnjOrderTemplate( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjOrdStsMapping createJnjOrdStsMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJORDSTSMAPPING );
			return (JnjOrdStsMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjOrdStsMapping : "+e.getMessage(), 0 );
		}
	}
	
	public JnjOrdStsMapping createJnjOrdStsMapping(final Map attributeValues)
	{
		return createJnjOrdStsMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjParagraphComponent createJnjParagraphComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPARAGRAPHCOMPONENT );
			return (JnjParagraphComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjParagraphComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjParagraphComponent createJnjParagraphComponent(final Map attributeValues)
	{
		return createJnjParagraphComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPasswordExpiry createJnjPasswordExpiry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPASSWORDEXPIRY );
			return (JnjPasswordExpiry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPasswordExpiry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPasswordExpiry createJnjPasswordExpiry(final Map attributeValues)
	{
		return createJnjPasswordExpiry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPasswordExpiryEmailProcess createJnjPasswordExpiryEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPASSWORDEXPIRYEMAILPROCESS );
			return (JnjPasswordExpiryEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPasswordExpiryEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPasswordExpiryEmailProcess createJnjPasswordExpiryEmailProcess(final Map attributeValues)
	{
		return createJnjPasswordExpiryEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMAmazonEmailProcess createJnjPCMAmazonEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMAMAZONEMAILPROCESS );
			return (JnjPCMAmazonEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMAmazonEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMAmazonEmailProcess createJnjPCMAmazonEmailProcess(final Map attributeValues)
	{
		return createJnjPCMAmazonEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMEmailFooterComponent createJnjPCMEmailFooterComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMEMAILFOOTERCOMPONENT );
			return (JnjPCMEmailFooterComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMEmailFooterComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMEmailFooterComponent createJnjPCMEmailFooterComponent(final Map attributeValues)
	{
		return createJnjPCMEmailFooterComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMEmailTopNavigationComponent createJnjPCMEmailTopNavigationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMEMAILTOPNAVIGATIONCOMPONENT );
			return (JnjPCMEmailTopNavigationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMEmailTopNavigationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMEmailTopNavigationComponent createJnjPCMEmailTopNavigationComponent(final Map attributeValues)
	{
		return createJnjPCMEmailTopNavigationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMIncompleteActiveProductEmailProcess createJnjPCMIncompleteActiveProductEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMINCOMPLETEACTIVEPRODUCTEMAILPROCESS );
			return (JnjPCMIncompleteActiveProductEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMIncompleteActiveProductEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMIncompleteActiveProductEmailProcess createJnjPCMIncompleteActiveProductEmailProcess(final Map attributeValues)
	{
		return createJnjPCMIncompleteActiveProductEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMMultiImageSetsFoundEmailProcess createJnjPCMMultiImageSetsFoundEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMMULTIIMAGESETSFOUNDEMAILPROCESS );
			return (JnjPCMMultiImageSetsFoundEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMMultiImageSetsFoundEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMMultiImageSetsFoundEmailProcess createJnjPCMMultiImageSetsFoundEmailProcess(final Map attributeValues)
	{
		return createJnjPCMMultiImageSetsFoundEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMNewProductEmailProcess createJnjPCMNewProductEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMNEWPRODUCTEMAILPROCESS );
			return (JnjPCMNewProductEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMNewProductEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMNewProductEmailProcess createJnjPCMNewProductEmailProcess(final Map attributeValues)
	{
		return createJnjPCMNewProductEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMNewProductMandatoryCheckEmailProcess createJnjPCMNewProductMandatoryCheckEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMNEWPRODUCTMANDATORYCHECKEMAILPROCESS );
			return (JnjPCMNewProductMandatoryCheckEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMNewProductMandatoryCheckEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMNewProductMandatoryCheckEmailProcess createJnjPCMNewProductMandatoryCheckEmailProcess(final Map attributeValues)
	{
		return createJnjPCMNewProductMandatoryCheckEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMProductDetailsEmailProcess createJnjPCMProductDetailsEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMPRODUCTDETAILSEMAILPROCESS );
			return (JnjPCMProductDetailsEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMProductDetailsEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMProductDetailsEmailProcess createJnjPCMProductDetailsEmailProcess(final Map attributeValues)
	{
		return createJnjPCMProductDetailsEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMRequestAccountEmailProcess createJnjPCMRequestAccountEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMREQUESTACCOUNTEMAILPROCESS );
			return (JnjPCMRequestAccountEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMRequestAccountEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMRequestAccountEmailProcess createJnjPCMRequestAccountEmailProcess(final Map attributeValues)
	{
		return createJnjPCMRequestAccountEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMUpdateProductMandatoryCheckEmailProcess createJnjPCMUpdateProductMandatoryCheckEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMUPDATEPRODUCTMANDATORYCHECKEMAILPROCESS );
			return (JnjPCMUpdateProductMandatoryCheckEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMUpdateProductMandatoryCheckEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMUpdateProductMandatoryCheckEmailProcess createJnjPCMUpdateProductMandatoryCheckEmailProcess(final Map attributeValues)
	{
		return createJnjPCMUpdateProductMandatoryCheckEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMZonzaUnreachableEmailProcess createJnjPCMZonzaUnreachableEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPCMZONZAUNREACHABLEEMAILPROCESS );
			return (JnjPCMZonzaUnreachableEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMZonzaUnreachableEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMZonzaUnreachableEmailProcess createJnjPCMZonzaUnreachableEmailProcess(final Map attributeValues)
	{
		return createJnjPCMZonzaUnreachableEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJProduct createJnJProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJPRODUCT );
			return (JnJProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJProduct : "+e.getMessage(), 0 );
		}
	}
	
	public JnJProduct createJnJProduct(final Map attributeValues)
	{
		return createJnJProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjReadOperationDashboard createJnjReadOperationDashboard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJREADOPERATIONDASHBOARD );
			return (JnjReadOperationDashboard)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjReadOperationDashboard : "+e.getMessage(), 0 );
		}
	}
	
	public JnjReadOperationDashboard createJnjReadOperationDashboard(final Map attributeValues)
	{
		return createJnjReadOperationDashboard( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjRegistrationProcess createJnjRegistrationProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJREGISTRATIONPROCESS );
			return (JnjRegistrationProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjRegistrationProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjRegistrationProcess createJnjRegistrationProcess(final Map attributeValues)
	{
		return createJnjRegistrationProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjReturnOrderCSRProcess createJnjReturnOrderCSRProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJRETURNORDERCSRPROCESS );
			return (JnjReturnOrderCSRProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjReturnOrderCSRProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjReturnOrderCSRProcess createJnjReturnOrderCSRProcess(final Map attributeValues)
	{
		return createJnjReturnOrderCSRProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjReturnOrderUserProcess createJnjReturnOrderUserProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJRETURNORDERUSERPROCESS );
			return (JnjReturnOrderUserProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjReturnOrderUserProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjReturnOrderUserProcess createJnjReturnOrderUserProcess(final Map attributeValues)
	{
		return createJnjReturnOrderUserProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjSalesOrgAndSplProdMap createJnjSalesOrgAndSplProdMap(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJSALESORGANDSPLPRODMAP );
			return (JnjSalesOrgAndSplProdMap)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjSalesOrgAndSplProdMap : "+e.getMessage(), 0 );
		}
	}
	
	public JnjSalesOrgAndSplProdMap createJnjSalesOrgAndSplProdMap(final Map attributeValues)
	{
		return createJnjSalesOrgAndSplProdMap( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJSalesOrgCustomer createJnJSalesOrgCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJSALESORGCUSTOMER );
			return (JnJSalesOrgCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJSalesOrgCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public JnJSalesOrgCustomer createJnJSalesOrgCustomer(final Map attributeValues)
	{
		return createJnJSalesOrgCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjSynchronizeOrdersProcess createJnjSynchronizeOrdersProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJSYNCHRONIZEORDERSPROCESS );
			return (JnjSynchronizeOrdersProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjSynchronizeOrdersProcess : "+e.getMessage(), 0 );
		}
	}
	
	public JnjSynchronizeOrdersProcess createJnjSynchronizeOrdersProcess(final Map attributeValues)
	{
		return createJnjSynchronizeOrdersProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjSyncOrderImpExImportCronJob createJnjSyncOrderImpExImportCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJSYNCORDERIMPEXIMPORTCRONJOB );
			return (JnjSyncOrderImpExImportCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjSyncOrderImpExImportCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjSyncOrderImpExImportCronJob createJnjSyncOrderImpExImportCronJob(final Map attributeValues)
	{
		return createJnjSyncOrderImpExImportCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjSyncOrderImpExImportJob createJnjSyncOrderImpExImportJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJSYNCORDERIMPEXIMPORTJOB );
			return (JnjSyncOrderImpExImportJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjSyncOrderImpExImportJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjSyncOrderImpExImportJob createJnjSyncOrderImpExImportJob(final Map attributeValues)
	{
		return createJnjSyncOrderImpExImportJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjTemplateEntry createJnjTemplateEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJTEMPLATEENTRY );
			return (JnjTemplateEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjTemplateEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjTemplateEntry createJnjTemplateEntry(final Map attributeValues)
	{
		return createJnjTemplateEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjUomConversion createJnjUomConversion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJUOMCONVERSION );
			return (JnjUomConversion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjUomConversion : "+e.getMessage(), 0 );
		}
	}
	
	public JnjUomConversion createJnjUomConversion(final Map attributeValues)
	{
		return createJnjUomConversion( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjWriteOperationDashboard createJnjWriteOperationDashboard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJWRITEOPERATIONDASHBOARD );
			return (JnjWriteOperationDashboard)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjWriteOperationDashboard : "+e.getMessage(), 0 );
		}
	}
	
	public JnjWriteOperationDashboard createJnjWriteOperationDashboard(final Map attributeValues)
	{
		return createJnjWriteOperationDashboard( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJZonzaImage createJnJZonzaImage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.JNJZONZAIMAGE );
			return (JnJZonzaImage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnJZonzaImage : "+e.getMessage(), 0 );
		}
	}
	
	public JnJZonzaImage createJnJZonzaImage(final Map attributeValues)
	{
		return createJnJZonzaImage( getSession().getSessionContext(), attributeValues );
	}
	
	public OldPassword createOldPassword(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.OLDPASSWORD );
			return (OldPassword)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OldPassword : "+e.getMessage(), 0 );
		}
	}
	
	public OldPassword createOldPassword(final Map attributeValues)
	{
		return createOldPassword( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductDocuments createProductDocuments(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.PRODUCTDOCUMENTS );
			return (ProductDocuments)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductDocuments : "+e.getMessage(), 0 );
		}
	}
	
	public ProductDocuments createProductDocuments(final Map attributeValues)
	{
		return createProductDocuments( getSession().getSessionContext(), attributeValues );
	}
	
	public PurchasedProductReferencesComponent createPurchasedProductReferencesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.PURCHASEDPRODUCTREFERENCESCOMPONENT );
			return (PurchasedProductReferencesComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PurchasedProductReferencesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public PurchasedProductReferencesComponent createPurchasedProductReferencesComponent(final Map attributeValues)
	{
		return createPurchasedProductReferencesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SecretQuestionsAndAnswers createSecretQuestionsAndAnswers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjb2bCoreConstants.TC.SECRETQUESTIONSANDANSWERS );
			return (SecretQuestionsAndAnswers)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecretQuestionsAndAnswers : "+e.getMessage(), 0 );
		}
	}
	
	public SecretQuestionsAndAnswers createSecretQuestionsAndAnswers(final Map attributeValues)
	{
		return createSecretQuestionsAndAnswers( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.creditStatus</code> attribute.
	 * @return the creditStatus
	 */
	public String getCreditStatus(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CREDITSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.creditStatus</code> attribute.
	 * @return the creditStatus
	 */
	public String getCreditStatus(final AbstractOrder item)
	{
		return getCreditStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.creditStatus</code> attribute. 
	 * @param value the creditStatus
	 */
	public void setCreditStatus(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CREDITSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.creditStatus</code> attribute. 
	 * @param value the creditStatus
	 */
	public void setCreditStatus(final AbstractOrder item, final String value)
	{
		setCreditStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.custLineNumber</code> attribute.
	 * @return the custLineNumber
	 */
	public String getCustLineNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUSTLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.custLineNumber</code> attribute.
	 * @return the custLineNumber
	 */
	public String getCustLineNumber(final AbstractOrderEntry item)
	{
		return getCustLineNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.custLineNumber</code> attribute. 
	 * @param value the custLineNumber
	 */
	public void setCustLineNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUSTLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.custLineNumber</code> attribute. 
	 * @param value the custLineNumber
	 */
	public void setCustLineNumber(final AbstractOrderEntry item, final String value)
	{
		setCustLineNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customerReferencePO</code> attribute.
	 * @return the customerReferencePO
	 */
	public String getCustomerReferencePO(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CUSTOMERREFERENCEPO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customerReferencePO</code> attribute.
	 * @return the customerReferencePO
	 */
	public String getCustomerReferencePO(final AbstractOrder item)
	{
		return getCustomerReferencePO( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customerReferencePO</code> attribute. 
	 * @param value the customerReferencePO
	 */
	public void setCustomerReferencePO(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CUSTOMERREFERENCEPO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customerReferencePO</code> attribute. 
	 * @param value the customerReferencePO
	 */
	public void setCustomerReferencePO(final AbstractOrder item, final String value)
	{
		setCustomerReferencePO( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.customSequence</code> attribute.
	 * @return the customSequence
	 */
	public Integer getCustomSequence(final SessionContext ctx, final Category item)
	{
		return (Integer)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Category.CUSTOMSEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.customSequence</code> attribute.
	 * @return the customSequence
	 */
	public Integer getCustomSequence(final Category item)
	{
		return getCustomSequence( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.customSequence</code> attribute. 
	 * @return the customSequence
	 */
	public int getCustomSequenceAsPrimitive(final SessionContext ctx, final Category item)
	{
		Integer value = getCustomSequence( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.customSequence</code> attribute. 
	 * @return the customSequence
	 */
	public int getCustomSequenceAsPrimitive(final Category item)
	{
		return getCustomSequenceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.customSequence</code> attribute. 
	 * @param value the customSequence
	 */
	public void setCustomSequence(final SessionContext ctx, final Category item, final Integer value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Category.CUSTOMSEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.customSequence</code> attribute. 
	 * @param value the customSequence
	 */
	public void setCustomSequence(final Category item, final Integer value)
	{
		setCustomSequence( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.customSequence</code> attribute. 
	 * @param value the customSequence
	 */
	public void setCustomSequence(final SessionContext ctx, final Category item, final int value)
	{
		setCustomSequence( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.customSequence</code> attribute. 
	 * @param value the customSequence
	 */
	public void setCustomSequence(final Category item, final int value)
	{
		setCustomSequence( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customShippingAddress</code> attribute.
	 * @return the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public Boolean isCustomShippingAddress(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CUSTOMSHIPPINGADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customShippingAddress</code> attribute.
	 * @return the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public Boolean isCustomShippingAddress(final AbstractOrder item)
	{
		return isCustomShippingAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @return the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public boolean isCustomShippingAddressAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isCustomShippingAddress( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @return the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public boolean isCustomShippingAddressAsPrimitive(final AbstractOrder item)
	{
		return isCustomShippingAddressAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @param value the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public void setCustomShippingAddress(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.CUSTOMSHIPPINGADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @param value the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public void setCustomShippingAddress(final AbstractOrder item, final Boolean value)
	{
		setCustomShippingAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @param value the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public void setCustomShippingAddress(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setCustomShippingAddress( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.customShippingAddress</code> attribute. 
	 * @param value the customShippingAddress - This attribute is used to save the value if one tome shipping address is entered
	 */
	public void setCustomShippingAddress(final AbstractOrder item, final boolean value)
	{
		setCustomShippingAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute.
	 * @return the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public Boolean isCutNotificationEmailSent(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUTNOTIFICATIONEMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute.
	 * @return the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public Boolean isCutNotificationEmailSent(final AbstractOrderEntry item)
	{
		return isCutNotificationEmailSent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @return the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public boolean isCutNotificationEmailSentAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Boolean value = isCutNotificationEmailSent( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @return the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public boolean isCutNotificationEmailSentAsPrimitive(final AbstractOrderEntry item)
	{
		return isCutNotificationEmailSentAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @param value the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public void setCutNotificationEmailSent(final SessionContext ctx, final AbstractOrderEntry item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUTNOTIFICATIONEMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @param value the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public void setCutNotificationEmailSent(final AbstractOrderEntry item, final Boolean value)
	{
		setCutNotificationEmailSent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @param value the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public void setCutNotificationEmailSent(final SessionContext ctx, final AbstractOrderEntry item, final boolean value)
	{
		setCutNotificationEmailSent( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationEmailSent</code> attribute. 
	 * @param value the cutNotificationEmailSent - This represents the flag for cut notification email. TRUE if sent, else FALSE.
	 */
	public void setCutNotificationEmailSent(final AbstractOrderEntry item, final boolean value)
	{
		setCutNotificationEmailSent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute.
	 * @return the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public Boolean isCutNotificationPreference(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUTNOTIFICATIONPREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute.
	 * @return the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public Boolean isCutNotificationPreference(final AbstractOrderEntry item)
	{
		return isCutNotificationPreference( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @return the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public boolean isCutNotificationPreferenceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Boolean value = isCutNotificationPreference( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @return the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public boolean isCutNotificationPreferenceAsPrimitive(final AbstractOrderEntry item)
	{
		return isCutNotificationPreferenceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @param value the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public void setCutNotificationPreference(final SessionContext ctx, final AbstractOrderEntry item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.CUTNOTIFICATIONPREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @param value the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public void setCutNotificationPreference(final AbstractOrderEntry item, final Boolean value)
	{
		setCutNotificationPreference( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @param value the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public void setCutNotificationPreference(final SessionContext ctx, final AbstractOrderEntry item, final boolean value)
	{
		setCutNotificationPreference( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.cutNotificationPreference</code> attribute. 
	 * @param value the cutNotificationPreference - This represents if the cut notification was enabled for the entry or not. TRUE if enabled, else FALSE.
	 */
	public void setCutNotificationPreference(final AbstractOrderEntry item, final boolean value)
	{
		setCutNotificationPreference( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dealerPONum</code> attribute.
	 * @return the dealerPONum
	 */
	public String getDealerPONum(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DEALERPONUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dealerPONum</code> attribute.
	 * @return the dealerPONum
	 */
	public String getDealerPONum(final AbstractOrder item)
	{
		return getDealerPONum( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dealerPONum</code> attribute. 
	 * @param value the dealerPONum
	 */
	public void setDealerPONum(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DEALERPONUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dealerPONum</code> attribute. 
	 * @param value the dealerPONum
	 */
	public void setDealerPONum(final AbstractOrder item, final String value)
	{
		setDealerPONum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.defaultCountry</code> attribute.
	 * @return the defaultCountry - store the default Country. Defaulted to Germany.
	 */
	public Country getDefaultCountry(final SessionContext ctx, final BaseSite item)
	{
		return (Country)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.BaseSite.DEFAULTCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.defaultCountry</code> attribute.
	 * @return the defaultCountry - store the default Country. Defaulted to Germany.
	 */
	public Country getDefaultCountry(final BaseSite item)
	{
		return getDefaultCountry( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.defaultCountry</code> attribute. 
	 * @param value the defaultCountry - store the default Country. Defaulted to Germany.
	 */
	public void setDefaultCountry(final SessionContext ctx, final BaseSite item, final Country value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.BaseSite.DEFAULTCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.defaultCountry</code> attribute. 
	 * @param value the defaultCountry - store the default Country. Defaulted to Germany.
	 */
	public void setDefaultCountry(final BaseSite item, final Country value)
	{
		setDefaultCountry( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.defaultPrice</code> attribute.
	 * @return the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public Double getDefaultPrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DEFAULTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.defaultPrice</code> attribute.
	 * @return the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public Double getDefaultPrice(final AbstractOrderEntry item)
	{
		return getDefaultPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @return the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public double getDefaultPriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getDefaultPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @return the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public double getDefaultPriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getDefaultPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @param value the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public void setDefaultPrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DEFAULTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @param value the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public void setDefaultPrice(final AbstractOrderEntry item, final Double value)
	{
		setDefaultPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @param value the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public void setDefaultPrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setDefaultPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.defaultPrice</code> attribute. 
	 * @param value the defaultPrice - This field will be updated with old value of the entry when we get the updated price from the SAP
	 */
	public void setDefaultPrice(final AbstractOrderEntry item, final double value)
	{
		setDefaultPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveredOrderForm</code> attribute.
	 * @return the deliveredOrderForm
	 */
	public Media getDeliveredOrderForm(final SessionContext ctx, final AbstractOrder item)
	{
		return (Media)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DELIVEREDORDERFORM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveredOrderForm</code> attribute.
	 * @return the deliveredOrderForm
	 */
	public Media getDeliveredOrderForm(final AbstractOrder item)
	{
		return getDeliveredOrderForm( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveredOrderForm</code> attribute. 
	 * @param value the deliveredOrderForm
	 */
	public void setDeliveredOrderForm(final SessionContext ctx, final AbstractOrder item, final Media value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DELIVEREDORDERFORM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveredOrderForm</code> attribute. 
	 * @param value the deliveredOrderForm
	 */
	public void setDeliveredOrderForm(final AbstractOrder item, final Media value)
	{
		setDeliveredOrderForm( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliverySchedules</code> attribute.
	 * @return the deliverySchedules
	 */
	public List<JnjDeliverySchedule> getDeliverySchedules(final SessionContext ctx, final AbstractOrderEntry item)
	{
		List<JnjDeliverySchedule> coll = (List<JnjDeliverySchedule>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DELIVERYSCHEDULES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliverySchedules</code> attribute.
	 * @return the deliverySchedules
	 */
	public List<JnjDeliverySchedule> getDeliverySchedules(final AbstractOrderEntry item)
	{
		return getDeliverySchedules( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.deliverySchedules</code> attribute. 
	 * @param value the deliverySchedules
	 */
	public void setDeliverySchedules(final SessionContext ctx, final AbstractOrderEntry item, final List<JnjDeliverySchedule> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DELIVERYSCHEDULES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.deliverySchedules</code> attribute. 
	 * @param value the deliverySchedules
	 */
	public void setDeliverySchedules(final AbstractOrderEntry item, final List<JnjDeliverySchedule> value)
	{
		setDeliverySchedules( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveyBlock</code> attribute.
	 * @return the deliveyBlock
	 */
	public String getDeliveyBlock(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DELIVEYBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveyBlock</code> attribute.
	 * @return the deliveyBlock
	 */
	public String getDeliveyBlock(final AbstractOrder item)
	{
		return getDeliveyBlock( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveyBlock</code> attribute. 
	 * @param value the deliveyBlock
	 */
	public void setDeliveyBlock(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DELIVEYBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveyBlock</code> attribute. 
	 * @param value the deliveyBlock
	 */
	public void setDeliveyBlock(final AbstractOrder item, final String value)
	{
		setDeliveyBlock( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute.
	 * @return the discountsOnPrice
	 */
	public Double getDiscountsOnPrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DISCOUNTSONPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute.
	 * @return the discountsOnPrice
	 */
	public Double getDiscountsOnPrice(final AbstractOrderEntry item)
	{
		return getDiscountsOnPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @return the discountsOnPrice
	 */
	public double getDiscountsOnPriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getDiscountsOnPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @return the discountsOnPrice
	 */
	public double getDiscountsOnPriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getDiscountsOnPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @param value the discountsOnPrice
	 */
	public void setDiscountsOnPrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DISCOUNTSONPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @param value the discountsOnPrice
	 */
	public void setDiscountsOnPrice(final AbstractOrderEntry item, final Double value)
	{
		setDiscountsOnPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @param value the discountsOnPrice
	 */
	public void setDiscountsOnPrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setDiscountsOnPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.discountsOnPrice</code> attribute. 
	 * @param value the discountsOnPrice
	 */
	public void setDiscountsOnPrice(final AbstractOrderEntry item, final double value)
	{
		setDiscountsOnPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.displayProducts</code> attribute.
	 * @return the displayProducts
	 */
	public Boolean isDisplayProducts(final SessionContext ctx, final Category item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Category.DISPLAYPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.displayProducts</code> attribute.
	 * @return the displayProducts
	 */
	public Boolean isDisplayProducts(final Category item)
	{
		return isDisplayProducts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.displayProducts</code> attribute. 
	 * @return the displayProducts
	 */
	public boolean isDisplayProductsAsPrimitive(final SessionContext ctx, final Category item)
	{
		Boolean value = isDisplayProducts( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.displayProducts</code> attribute. 
	 * @return the displayProducts
	 */
	public boolean isDisplayProductsAsPrimitive(final Category item)
	{
		return isDisplayProductsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.displayProducts</code> attribute. 
	 * @param value the displayProducts
	 */
	public void setDisplayProducts(final SessionContext ctx, final Category item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Category.DISPLAYPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.displayProducts</code> attribute. 
	 * @param value the displayProducts
	 */
	public void setDisplayProducts(final Category item, final Boolean value)
	{
		setDisplayProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.displayProducts</code> attribute. 
	 * @param value the displayProducts
	 */
	public void setDisplayProducts(final SessionContext ctx, final Category item, final boolean value)
	{
		setDisplayProducts( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.displayProducts</code> attribute. 
	 * @param value the displayProducts
	 */
	public void setDisplayProducts(final Category item, final boolean value)
	{
		setDisplayProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public String getDistributionChannel(final Order item)
	{
		return getDistributionChannel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final Order item, final String value)
	{
		setDistributionChannel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final Order item)
	{
		return getDivision( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final Order item, final String value)
	{
		setDivision( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dropShipAccount</code> attribute.
	 * @return the dropShipAccount
	 */
	public String getDropShipAccount(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DROPSHIPACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dropShipAccount</code> attribute.
	 * @return the dropShipAccount
	 */
	public String getDropShipAccount(final AbstractOrder item)
	{
		return getDropShipAccount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dropShipAccount</code> attribute. 
	 * @param value the dropShipAccount
	 */
	public void setDropShipAccount(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.DROPSHIPACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dropShipAccount</code> attribute. 
	 * @param value the dropShipAccount
	 */
	public void setDropShipAccount(final AbstractOrder item, final String value)
	{
		setDropShipAccount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.dropshipFee</code> attribute.
	 * @return the dropshipFee
	 */
	public Double getDropshipFee(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DROPSHIPFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.dropshipFee</code> attribute.
	 * @return the dropshipFee
	 */
	public Double getDropshipFee(final AbstractOrderEntry item)
	{
		return getDropshipFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @return the dropshipFee
	 */
	public double getDropshipFeeAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getDropshipFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @return the dropshipFee
	 */
	public double getDropshipFeeAsPrimitive(final AbstractOrderEntry item)
	{
		return getDropshipFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @param value the dropshipFee
	 */
	public void setDropshipFee(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.DROPSHIPFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @param value the dropshipFee
	 */
	public void setDropshipFee(final AbstractOrderEntry item, final Double value)
	{
		setDropshipFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @param value the dropshipFee
	 */
	public void setDropshipFee(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setDropshipFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.dropshipFee</code> attribute. 
	 * @param value the dropshipFee
	 */
	public void setDropshipFee(final AbstractOrderEntry item, final double value)
	{
		setDropshipFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.emailSentAttempts</code> attribute.
	 * @return the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public Integer getEmailSentAttempts(final SessionContext ctx, final Order item)
	{
		return (Integer)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.EMAILSENTATTEMPTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.emailSentAttempts</code> attribute.
	 * @return the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public Integer getEmailSentAttempts(final Order item)
	{
		return getEmailSentAttempts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @return the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public int getEmailSentAttemptsAsPrimitive(final SessionContext ctx, final Order item)
	{
		Integer value = getEmailSentAttempts( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @return the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public int getEmailSentAttemptsAsPrimitive(final Order item)
	{
		return getEmailSentAttemptsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @param value the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public void setEmailSentAttempts(final SessionContext ctx, final Order item, final Integer value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.EMAILSENTATTEMPTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @param value the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public void setEmailSentAttempts(final Order item, final Integer value)
	{
		setEmailSentAttempts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @param value the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public void setEmailSentAttempts(final SessionContext ctx, final Order item, final int value)
	{
		setEmailSentAttempts( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.emailSentAttempts</code> attribute. 
	 * @param value the emailSentAttempts - Number of attempts made to send email after the order is placed.
	 */
	public void setEmailSentAttempts(final Order item, final int value)
	{
		setEmailSentAttempts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.endUser</code> attribute.
	 * @return the endUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getEndUser(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ENDUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.endUser</code> attribute.
	 * @return the endUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getEndUser(final AbstractOrder item)
	{
		return getEndUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.endUser</code> attribute. 
	 * @param value the endUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setEndUser(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ENDUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.endUser</code> attribute. 
	 * @param value the endUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setEndUser(final AbstractOrder item, final String value)
	{
		setEndUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expectedDeliveryDate</code> attribute.
	 * @return the expectedDeliveryDate
	 */
	public Date getExpectedDeliveryDate(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPECTEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expectedDeliveryDate</code> attribute.
	 * @return the expectedDeliveryDate
	 */
	public Date getExpectedDeliveryDate(final AbstractOrderEntry item)
	{
		return getExpectedDeliveryDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expectedDeliveryDate</code> attribute. 
	 * @param value the expectedDeliveryDate
	 */
	public void setExpectedDeliveryDate(final SessionContext ctx, final AbstractOrderEntry item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPECTEDDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expectedDeliveryDate</code> attribute. 
	 * @param value the expectedDeliveryDate
	 */
	public void setExpectedDeliveryDate(final AbstractOrderEntry item, final Date value)
	{
		setExpectedDeliveryDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expeditedFee</code> attribute.
	 * @return the expeditedFee
	 */
	public Double getExpeditedFee(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPEDITEDFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expeditedFee</code> attribute.
	 * @return the expeditedFee
	 */
	public Double getExpeditedFee(final AbstractOrderEntry item)
	{
		return getExpeditedFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @return the expeditedFee
	 */
	public double getExpeditedFeeAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getExpeditedFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @return the expeditedFee
	 */
	public double getExpeditedFeeAsPrimitive(final AbstractOrderEntry item)
	{
		return getExpeditedFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @param value the expeditedFee
	 */
	public void setExpeditedFee(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPEDITEDFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @param value the expeditedFee
	 */
	public void setExpeditedFee(final AbstractOrderEntry item, final Double value)
	{
		setExpeditedFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @param value the expeditedFee
	 */
	public void setExpeditedFee(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setExpeditedFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expeditedFee</code> attribute. 
	 * @param value the expeditedFee
	 */
	public void setExpeditedFee(final AbstractOrderEntry item, final double value)
	{
		setExpeditedFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final AbstractOrderEntry item)
	{
		return getExpiryDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final SessionContext ctx, final AbstractOrderEntry item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.EXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final AbstractOrderEntry item, final Date value)
	{
		setExpiryDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.forbiddenSales</code> attribute.
	 * @return the forbiddenSales
	 */
	public String getForbiddenSales(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.FORBIDDENSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.forbiddenSales</code> attribute.
	 * @return the forbiddenSales
	 */
	public String getForbiddenSales(final AbstractOrder item)
	{
		return getForbiddenSales( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.forbiddenSales</code> attribute. 
	 * @param value the forbiddenSales
	 */
	public void setForbiddenSales(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.FORBIDDENSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.forbiddenSales</code> attribute. 
	 * @param value the forbiddenSales
	 */
	public void setForbiddenSales(final AbstractOrder item, final String value)
	{
		setForbiddenSales( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightcharges</code> attribute.
	 * @return the freightcharges
	 */
	public Double getFreightcharges(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.FREIGHTCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightcharges</code> attribute.
	 * @return the freightcharges
	 */
	public Double getFreightcharges(final AbstractOrderEntry item)
	{
		return getFreightcharges( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @return the freightcharges
	 */
	public double getFreightchargesAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getFreightcharges( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @return the freightcharges
	 */
	public double getFreightchargesAsPrimitive(final AbstractOrderEntry item)
	{
		return getFreightchargesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @param value the freightcharges
	 */
	public void setFreightcharges(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.FREIGHTCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @param value the freightcharges
	 */
	public void setFreightcharges(final AbstractOrderEntry item, final Double value)
	{
		setFreightcharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @param value the freightcharges
	 */
	public void setFreightcharges(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setFreightcharges( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightcharges</code> attribute. 
	 * @param value the freightcharges
	 */
	public void setFreightcharges(final AbstractOrderEntry item, final double value)
	{
		setFreightcharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightFees</code> attribute.
	 * @return the freightFees
	 */
	public Double getFreightFees(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.FREIGHTFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightFees</code> attribute.
	 * @return the freightFees
	 */
	public Double getFreightFees(final AbstractOrderEntry item)
	{
		return getFreightFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @return the freightFees
	 */
	public double getFreightFeesAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getFreightFees( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @return the freightFees
	 */
	public double getFreightFeesAsPrimitive(final AbstractOrderEntry item)
	{
		return getFreightFeesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @param value the freightFees
	 */
	public void setFreightFees(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.FREIGHTFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @param value the freightFees
	 */
	public void setFreightFees(final AbstractOrderEntry item, final Double value)
	{
		setFreightFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @param value the freightFees
	 */
	public void setFreightFees(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setFreightFees( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.freightFees</code> attribute. 
	 * @param value the freightFees
	 */
	public void setFreightFees(final AbstractOrderEntry item, final double value)
	{
		setFreightFees( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Jnjb2bCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.GLN</code> attribute.
	 * @return the GLN
	 */
	public String getGLN(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.GLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.GLN</code> attribute.
	 * @return the GLN
	 */
	public String getGLN(final AbstractOrder item)
	{
		return getGLN( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.GLN</code> attribute. 
	 * @param value the GLN
	 */
	public void setGLN(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.GLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.GLN</code> attribute. 
	 * @param value the GLN
	 */
	public void setGLN(final AbstractOrder item, final String value)
	{
		setGLN( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.GLOBALLOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo(final Address item)
	{
		return getGlobalLocNo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.GLOBALLOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final Address item, final String value)
	{
		setGlobalLocNo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.grossPrice</code> attribute.
	 * @return the grossPrice
	 */
	public Double getGrossPrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.GROSSPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.grossPrice</code> attribute.
	 * @return the grossPrice
	 */
	public Double getGrossPrice(final AbstractOrderEntry item)
	{
		return getGrossPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @return the grossPrice
	 */
	public double getGrossPriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getGrossPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @return the grossPrice
	 */
	public double getGrossPriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getGrossPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @param value the grossPrice
	 */
	public void setGrossPrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.GROSSPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @param value the grossPrice
	 */
	public void setGrossPrice(final AbstractOrderEntry item, final Double value)
	{
		setGrossPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @param value the grossPrice
	 */
	public void setGrossPrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setGrossPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.grossPrice</code> attribute. 
	 * @param value the grossPrice
	 */
	public void setGrossPrice(final AbstractOrderEntry item, final double value)
	{
		setGrossPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.handlingFee</code> attribute.
	 * @return the handlingFee
	 */
	public Double getHandlingFee(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HANDLINGFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.handlingFee</code> attribute.
	 * @return the handlingFee
	 */
	public Double getHandlingFee(final AbstractOrderEntry item)
	{
		return getHandlingFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @return the handlingFee
	 */
	public double getHandlingFeeAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getHandlingFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @return the handlingFee
	 */
	public double getHandlingFeeAsPrimitive(final AbstractOrderEntry item)
	{
		return getHandlingFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @param value the handlingFee
	 */
	public void setHandlingFee(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HANDLINGFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @param value the handlingFee
	 */
	public void setHandlingFee(final AbstractOrderEntry item, final Double value)
	{
		setHandlingFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @param value the handlingFee
	 */
	public void setHandlingFee(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setHandlingFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.handlingFee</code> attribute. 
	 * @param value the handlingFee
	 */
	public void setHandlingFee(final AbstractOrderEntry item, final double value)
	{
		setHandlingFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.headerDeliveryBlock</code> attribute.
	 * @return the headerDeliveryBlock
	 */
	public String getHeaderDeliveryBlock(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.HEADERDELIVERYBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.headerDeliveryBlock</code> attribute.
	 * @return the headerDeliveryBlock
	 */
	public String getHeaderDeliveryBlock(final Order item)
	{
		return getHeaderDeliveryBlock( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.headerDeliveryBlock</code> attribute. 
	 * @param value the headerDeliveryBlock
	 */
	public void setHeaderDeliveryBlock(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.HEADERDELIVERYBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.headerDeliveryBlock</code> attribute. 
	 * @param value the headerDeliveryBlock
	 */
	public void setHeaderDeliveryBlock(final Order item, final String value)
	{
		setHeaderDeliveryBlock( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.higherLevelItemNo</code> attribute.
	 * @return the higherLevelItemNo
	 */
	public String getHigherLevelItemNo(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HIGHERLEVELITEMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.higherLevelItemNo</code> attribute.
	 * @return the higherLevelItemNo
	 */
	public String getHigherLevelItemNo(final AbstractOrderEntry item)
	{
		return getHigherLevelItemNo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.higherLevelItemNo</code> attribute. 
	 * @param value the higherLevelItemNo
	 */
	public void setHigherLevelItemNo(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HIGHERLEVELITEMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.higherLevelItemNo</code> attribute. 
	 * @param value the higherLevelItemNo
	 */
	public void setHigherLevelItemNo(final AbstractOrderEntry item, final String value)
	{
		setHigherLevelItemNo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.holdCode</code> attribute.
	 * @return the holdCode
	 */
	public String getHoldCode(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HOLDCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.holdCode</code> attribute.
	 * @return the holdCode
	 */
	public String getHoldCode(final AbstractOrderEntry item)
	{
		return getHoldCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.holdCode</code> attribute. 
	 * @param value the holdCode
	 */
	public void setHoldCode(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HOLDCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.holdCode</code> attribute. 
	 * @param value the holdCode
	 */
	public void setHoldCode(final AbstractOrderEntry item, final String value)
	{
		setHoldCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute.
	 * @return the hsaPromotion
	 */
	public Double getHsaPromotion(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HSAPROMOTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute.
	 * @return the hsaPromotion
	 */
	public Double getHsaPromotion(final AbstractOrderEntry item)
	{
		return getHsaPromotion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @return the hsaPromotion
	 */
	public double getHsaPromotionAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getHsaPromotion( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @return the hsaPromotion
	 */
	public double getHsaPromotionAsPrimitive(final AbstractOrderEntry item)
	{
		return getHsaPromotionAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @param value the hsaPromotion
	 */
	public void setHsaPromotion(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.HSAPROMOTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @param value the hsaPromotion
	 */
	public void setHsaPromotion(final AbstractOrderEntry item, final Double value)
	{
		setHsaPromotion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @param value the hsaPromotion
	 */
	public void setHsaPromotion(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setHsaPromotion( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.hsaPromotion</code> attribute. 
	 * @param value the hsaPromotion
	 */
	public void setHsaPromotion(final AbstractOrderEntry item, final double value)
	{
		setHsaPromotion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INDIRECTCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer(final AbstractOrderEntry item)
	{
		return getIndirectCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INDIRECTCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final AbstractOrderEntry item, final String value)
	{
		setIndirectCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.insurance</code> attribute.
	 * @return the insurance
	 */
	public Double getInsurance(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INSURANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.insurance</code> attribute.
	 * @return the insurance
	 */
	public Double getInsurance(final AbstractOrderEntry item)
	{
		return getInsurance( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @return the insurance
	 */
	public double getInsuranceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getInsurance( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @return the insurance
	 */
	public double getInsuranceAsPrimitive(final AbstractOrderEntry item)
	{
		return getInsuranceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @param value the insurance
	 */
	public void setInsurance(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INSURANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @param value the insurance
	 */
	public void setInsurance(final AbstractOrderEntry item, final Double value)
	{
		setInsurance( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @param value the insurance
	 */
	public void setInsurance(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setInsurance( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.insurance</code> attribute. 
	 * @param value the insurance
	 */
	public void setInsurance(final AbstractOrderEntry item, final double value)
	{
		setInsurance( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.internationalFreight</code> attribute.
	 * @return the internationalFreight
	 */
	public Double getInternationalFreight(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INTERNATIONALFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.internationalFreight</code> attribute.
	 * @return the internationalFreight
	 */
	public Double getInternationalFreight(final AbstractOrderEntry item)
	{
		return getInternationalFreight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @return the internationalFreight
	 */
	public double getInternationalFreightAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getInternationalFreight( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @return the internationalFreight
	 */
	public double getInternationalFreightAsPrimitive(final AbstractOrderEntry item)
	{
		return getInternationalFreightAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @param value the internationalFreight
	 */
	public void setInternationalFreight(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INTERNATIONALFREIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @param value the internationalFreight
	 */
	public void setInternationalFreight(final AbstractOrderEntry item, final Double value)
	{
		setInternationalFreight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @param value the internationalFreight
	 */
	public void setInternationalFreight(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setInternationalFreight( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.internationalFreight</code> attribute. 
	 * @param value the internationalFreight
	 */
	public void setInternationalFreight(final AbstractOrderEntry item, final double value)
	{
		setInternationalFreight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INVOICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber(final AbstractOrderEntry item)
	{
		return getInvoiceNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.INVOICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final AbstractOrderEntry item, final String value)
	{
		setInvoiceNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoices</code> attribute.
	 * @return the invoices
	 */
	public Collection<JnjGTInvoice> getInvoices(final SessionContext ctx, final Order item)
	{
		return INVOICE_ORDERRELATIONINVOICESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoices</code> attribute.
	 * @return the invoices
	 */
	public Collection<JnjGTInvoice> getInvoices(final Order item)
	{
		return getInvoices( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoices</code> attribute. 
	 * @param value the invoices
	 */
	public void setInvoices(final SessionContext ctx, final Order item, final Collection<JnjGTInvoice> value)
	{
		INVOICE_ORDERRELATIONINVOICESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoices</code> attribute. 
	 * @param value the invoices
	 */
	public void setInvoices(final Order item, final Collection<JnjGTInvoice> value)
	{
		setInvoices( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to invoices. 
	 * @param value the item to add to invoices
	 */
	public void addToInvoices(final SessionContext ctx, final Order item, final JnjGTInvoice value)
	{
		INVOICE_ORDERRELATIONINVOICESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to invoices. 
	 * @param value the item to add to invoices
	 */
	public void addToInvoices(final Order item, final JnjGTInvoice value)
	{
		addToInvoices( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from invoices. 
	 * @param value the item to remove from invoices
	 */
	public void removeFromInvoices(final SessionContext ctx, final Order item, final JnjGTInvoice value)
	{
		INVOICE_ORDERRELATIONINVOICESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from invoices. 
	 * @param value the item to remove from invoices
	 */
	public void removeFromInvoices(final Order item, final JnjGTInvoice value)
	{
		removeFromInvoices( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.INVOICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus(final Order item)
	{
		return getInvoiceStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.INVOICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final Order item, final String value)
	{
		setInvoiceStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.isProposed</code> attribute.
	 * @return the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public Boolean isIsProposed(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ISPROPOSED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.isProposed</code> attribute.
	 * @return the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public Boolean isIsProposed(final AbstractOrderEntry item)
	{
		return isIsProposed( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @return the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public boolean isIsProposedAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Boolean value = isIsProposed( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @return the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public boolean isIsProposedAsPrimitive(final AbstractOrderEntry item)
	{
		return isIsProposedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @param value the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public void setIsProposed(final SessionContext ctx, final AbstractOrderEntry item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ISPROPOSED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @param value the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public void setIsProposed(final AbstractOrderEntry item, final Boolean value)
	{
		setIsProposed( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @param value the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public void setIsProposed(final SessionContext ctx, final AbstractOrderEntry item, final boolean value)
	{
		setIsProposed( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.isProposed</code> attribute. 
	 * @param value the isProposed - This field is used for figure out any product with replacement items contains.
	 */
	public void setIsProposed(final AbstractOrderEntry item, final boolean value)
	{
		setIsProposed( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.itemCategory</code> attribute.
	 * @return the itemCategory
	 */
	public String getItemCategory(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ITEMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.itemCategory</code> attribute.
	 * @return the itemCategory
	 */
	public String getItemCategory(final AbstractOrderEntry item)
	{
		return getItemCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.itemCategory</code> attribute. 
	 * @param value the itemCategory
	 */
	public void setItemCategory(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ITEMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.itemCategory</code> attribute. 
	 * @param value the itemCategory
	 */
	public void setItemCategory(final AbstractOrderEntry item, final String value)
	{
		setItemCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.jnJAddressId</code> attribute.
	 * @return the jnJAddressId
	 */
	public String getJnJAddressId(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.JNJADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.jnJAddressId</code> attribute.
	 * @return the jnJAddressId
	 */
	public String getJnJAddressId(final Address item)
	{
		return getJnJAddressId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.jnJAddressId</code> attribute. 
	 * @param value the jnJAddressId
	 */
	public void setJnJAddressId(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.JNJADDRESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.jnJAddressId</code> attribute. 
	 * @param value the jnJAddressId
	 */
	public void setJnJAddressId(final Address item, final String value)
	{
		setJnJAddressId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.jnjCustomName</code> attribute.
	 * @return the jnjCustomName
	 */
	public String getJnjCustomName(final SessionContext ctx, final Category item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Category.JNJCUSTOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.jnjCustomName</code> attribute.
	 * @return the jnjCustomName
	 */
	public String getJnjCustomName(final Category item)
	{
		return getJnjCustomName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.jnjCustomName</code> attribute. 
	 * @param value the jnjCustomName
	 */
	public void setJnjCustomName(final SessionContext ctx, final Category item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Category.JNJCUSTOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.jnjCustomName</code> attribute. 
	 * @param value the jnjCustomName
	 */
	public void setJnjCustomName(final Category item, final String value)
	{
		setJnjCustomName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.jnjGTState</code> attribute.
	 * @return the jnjGTState
	 */
	public String getJnjGTState(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.JNJGTSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.jnjGTState</code> attribute.
	 * @return the jnjGTState
	 */
	public String getJnjGTState(final Address item)
	{
		return getJnjGTState( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.jnjGTState</code> attribute. 
	 * @param value the jnjGTState
	 */
	public void setJnjGTState(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.JNJGTSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.jnjGTState</code> attribute. 
	 * @param value the jnjGTState
	 */
	public void setJnjGTState(final Address item, final String value)
	{
		setJnjGTState( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.jnjWebSiteType</code> attribute.
	 * @return the jnjWebSiteType - To idenify whether a JnJ Site is of type MDD or Consumer.
	 */
	public EnumerationValue getJnjWebSiteType(final SessionContext ctx, final BaseSite item)
	{
		return (EnumerationValue)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.BaseSite.JNJWEBSITETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.jnjWebSiteType</code> attribute.
	 * @return the jnjWebSiteType - To idenify whether a JnJ Site is of type MDD or Consumer.
	 */
	public EnumerationValue getJnjWebSiteType(final BaseSite item)
	{
		return getJnjWebSiteType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.jnjWebSiteType</code> attribute. 
	 * @param value the jnjWebSiteType - To idenify whether a JnJ Site is of type MDD or Consumer.
	 */
	public void setJnjWebSiteType(final SessionContext ctx, final BaseSite item, final EnumerationValue value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.BaseSite.JNJWEBSITETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.jnjWebSiteType</code> attribute. 
	 * @param value the jnjWebSiteType - To idenify whether a JnJ Site is of type MDD or Consumer.
	 */
	public void setJnjWebSiteType(final BaseSite item, final EnumerationValue value)
	{
		setJnjWebSiteType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.languages</code> attribute.
	 * @return the languages
	 */
	public Set<Language> getLanguages(final SessionContext ctx, final BaseSite item)
	{
		final List<Language> items = item.getLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			"Language",
			null,
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false
		);
		return new LinkedHashSet<Language>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.languages</code> attribute.
	 * @return the languages
	 */
	public Set<Language> getLanguages(final BaseSite item)
	{
		return getLanguages( getSession().getSessionContext(), item );
	}
	
	public long getLanguagesCount(final SessionContext ctx, final BaseSite item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			"Language",
			null
		);
	}
	
	public long getLanguagesCount(final BaseSite item)
	{
		return getLanguagesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.languages</code> attribute. 
	 * @param value the languages
	 */
	public void setLanguages(final SessionContext ctx, final BaseSite item, final Set<Language> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.languages</code> attribute. 
	 * @param value the languages
	 */
	public void setLanguages(final BaseSite item, final Set<Language> value)
	{
		setLanguages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to languages. 
	 * @param value the item to add to languages
	 */
	public void addToLanguages(final SessionContext ctx, final BaseSite item, final Language value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to languages. 
	 * @param value the item to add to languages
	 */
	public void addToLanguages(final BaseSite item, final Language value)
	{
		addToLanguages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from languages. 
	 * @param value the item to remove from languages
	 */
	public void removeFromLanguages(final SessionContext ctx, final BaseSite item, final Language value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			Jnjb2bCoreConstants.Relations.BASESITE2LANGUAGEREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BASESITE2LANGUAGEREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BASESITE2LANGUAGEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from languages. 
	 * @param value the item to remove from languages
	 */
	public void removeFromLanguages(final BaseSite item, final Language value)
	{
		removeFromLanguages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line3</code> attribute.
	 * @return the line3
	 */
	public String getLine3(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.LINE3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line3</code> attribute.
	 * @return the line3
	 */
	public String getLine3(final Address item)
	{
		return getLine3( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.line3</code> attribute. 
	 * @param value the line3
	 */
	public void setLine3(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.LINE3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.line3</code> attribute. 
	 * @param value the line3
	 */
	public void setLine3(final Address item, final String value)
	{
		setLine3( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line4</code> attribute.
	 * @return the line4
	 */
	public String getLine4(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.LINE4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.line4</code> attribute.
	 * @return the line4
	 */
	public String getLine4(final Address item)
	{
		return getLine4( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.line4</code> attribute. 
	 * @param value the line4
	 */
	public void setLine4(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.LINE4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.line4</code> attribute. 
	 * @param value the line4
	 */
	public void setLine4(final Address item, final String value)
	{
		setLine4( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.linkedWithDelivered</code> attribute.
	 * @return the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public Boolean isLinkedWithDelivered(final SessionContext ctx, final Cart item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Cart.LINKEDWITHDELIVERED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.linkedWithDelivered</code> attribute.
	 * @return the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public Boolean isLinkedWithDelivered(final Cart item)
	{
		return isLinkedWithDelivered( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @return the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public boolean isLinkedWithDeliveredAsPrimitive(final SessionContext ctx, final Cart item)
	{
		Boolean value = isLinkedWithDelivered( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @return the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public boolean isLinkedWithDeliveredAsPrimitive(final Cart item)
	{
		return isLinkedWithDeliveredAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @param value the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public void setLinkedWithDelivered(final SessionContext ctx, final Cart item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Cart.LINKEDWITHDELIVERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @param value the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public void setLinkedWithDelivered(final Cart item, final Boolean value)
	{
		setLinkedWithDelivered( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @param value the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public void setLinkedWithDelivered(final SessionContext ctx, final Cart item, final boolean value)
	{
		setLinkedWithDelivered( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.linkedWithDelivered</code> attribute. 
	 * @param value the linkedWithDelivered - This attribute is used in case of replenish order to check if it is linked to Delivered order
	 */
	public void setLinkedWithDelivered(final Cart item, final boolean value)
	{
		setLinkedWithDelivered( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.lot</code> attribute.
	 * @return the lot
	 */
	public String getLot(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.LOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.lot</code> attribute.
	 * @return the lot
	 */
	public String getLot(final AbstractOrderEntry item)
	{
		return getLot( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.lot</code> attribute. 
	 * @param value the lot
	 */
	public void setLot(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.LOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.lot</code> attribute. 
	 * @param value the lot
	 */
	public void setLot(final AbstractOrderEntry item, final String value)
	{
		setLot( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.manualFee</code> attribute.
	 * @return the manualFee
	 */
	public Double getManualFee(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MANUALFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.manualFee</code> attribute.
	 * @return the manualFee
	 */
	public Double getManualFee(final AbstractOrderEntry item)
	{
		return getManualFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @return the manualFee
	 */
	public double getManualFeeAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getManualFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @return the manualFee
	 */
	public double getManualFeeAsPrimitive(final AbstractOrderEntry item)
	{
		return getManualFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @param value the manualFee
	 */
	public void setManualFee(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MANUALFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @param value the manualFee
	 */
	public void setManualFee(final AbstractOrderEntry item, final Double value)
	{
		setManualFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @param value the manualFee
	 */
	public void setManualFee(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setManualFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.manualFee</code> attribute. 
	 * @param value the manualFee
	 */
	public void setManualFee(final AbstractOrderEntry item, final double value)
	{
		setManualFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.materialEntered</code> attribute.
	 * @return the materialEntered - Corresponds to the code to be displayed in replacement of 'materialNumber'.
	 */
	public String getMaterialEntered(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MATERIALENTERED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.materialEntered</code> attribute.
	 * @return the materialEntered - Corresponds to the code to be displayed in replacement of 'materialNumber'.
	 */
	public String getMaterialEntered(final AbstractOrderEntry item)
	{
		return getMaterialEntered( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.materialEntered</code> attribute. 
	 * @param value the materialEntered - Corresponds to the code to be displayed in replacement of 'materialNumber'.
	 */
	public void setMaterialEntered(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MATERIALENTERED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.materialEntered</code> attribute. 
	 * @param value the materialEntered - Corresponds to the code to be displayed in replacement of 'materialNumber'.
	 */
	public void setMaterialEntered(final AbstractOrderEntry item, final String value)
	{
		setMaterialEntered( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.materialNumber</code> attribute.
	 * @return the materialNumber - Corresponds to the product code for which product exists in other external systems but not in Hybris.
	 */
	public String getMaterialNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MATERIALNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.materialNumber</code> attribute.
	 * @return the materialNumber - Corresponds to the product code for which product exists in other external systems but not in Hybris.
	 */
	public String getMaterialNumber(final AbstractOrderEntry item)
	{
		return getMaterialNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.materialNumber</code> attribute. 
	 * @param value the materialNumber - Corresponds to the product code for which product exists in other external systems but not in Hybris.
	 */
	public void setMaterialNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MATERIALNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.materialNumber</code> attribute. 
	 * @param value the materialNumber - Corresponds to the product code for which product exists in other external systems but not in Hybris.
	 */
	public void setMaterialNumber(final AbstractOrderEntry item, final String value)
	{
		setMaterialNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final AbstractOrderEntry item)
	{
		return getMessage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final AbstractOrderEntry item, final String value)
	{
		setMessage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute.
	 * @return the minimumOrderFee
	 */
	public Double getMinimumOrderFee(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MINIMUMORDERFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute.
	 * @return the minimumOrderFee
	 */
	public Double getMinimumOrderFee(final AbstractOrderEntry item)
	{
		return getMinimumOrderFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @return the minimumOrderFee
	 */
	public double getMinimumOrderFeeAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getMinimumOrderFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @return the minimumOrderFee
	 */
	public double getMinimumOrderFeeAsPrimitive(final AbstractOrderEntry item)
	{
		return getMinimumOrderFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @param value the minimumOrderFee
	 */
	public void setMinimumOrderFee(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.MINIMUMORDERFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @param value the minimumOrderFee
	 */
	public void setMinimumOrderFee(final AbstractOrderEntry item, final Double value)
	{
		setMinimumOrderFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @param value the minimumOrderFee
	 */
	public void setMinimumOrderFee(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setMinimumOrderFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.minimumOrderFee</code> attribute. 
	 * @param value the minimumOrderFee
	 */
	public void setMinimumOrderFee(final AbstractOrderEntry item, final double value)
	{
		setMinimumOrderFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.namedDeliveryDate</code> attribute.
	 * @return the namedDeliveryDate
	 */
	public Date getNamedDeliveryDate(final SessionContext ctx, final AbstractOrder item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.NAMEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.namedDeliveryDate</code> attribute.
	 * @return the namedDeliveryDate
	 */
	public Date getNamedDeliveryDate(final AbstractOrder item)
	{
		return getNamedDeliveryDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.namedDeliveryDate</code> attribute. 
	 * @param value the namedDeliveryDate
	 */
	public void setNamedDeliveryDate(final SessionContext ctx, final AbstractOrder item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.NAMEDDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.namedDeliveryDate</code> attribute. 
	 * @param value the namedDeliveryDate
	 */
	public void setNamedDeliveryDate(final AbstractOrder item, final Date value)
	{
		setNamedDeliveryDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public Double getNetPrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.NETPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public Double getNetPrice(final AbstractOrderEntry item)
	{
		return getNetPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @return the netPrice
	 */
	public double getNetPriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getNetPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @return the netPrice
	 */
	public double getNetPriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getNetPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.NETPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final AbstractOrderEntry item, final Double value)
	{
		setNetPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setNetPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final AbstractOrderEntry item, final double value)
	{
		setNetPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.orderDeliveryTime</code> attribute.
	 * @return the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public Integer getOrderDeliveryTime(final SessionContext ctx, final Country item)
	{
		return (Integer)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Country.ORDERDELIVERYTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.orderDeliveryTime</code> attribute.
	 * @return the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public Integer getOrderDeliveryTime(final Country item)
	{
		return getOrderDeliveryTime( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @return the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public int getOrderDeliveryTimeAsPrimitive(final SessionContext ctx, final Country item)
	{
		Integer value = getOrderDeliveryTime( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @return the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public int getOrderDeliveryTimeAsPrimitive(final Country item)
	{
		return getOrderDeliveryTimeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @param value the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public void setOrderDeliveryTime(final SessionContext ctx, final Country item, final Integer value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Country.ORDERDELIVERYTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @param value the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public void setOrderDeliveryTime(final Country item, final Integer value)
	{
		setOrderDeliveryTime( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @param value the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public void setOrderDeliveryTime(final SessionContext ctx, final Country item, final int value)
	{
		setOrderDeliveryTime( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.orderDeliveryTime</code> attribute. 
	 * @param value the orderDeliveryTime - This attribute is used to define delivery days of each country
	 */
	public void setOrderDeliveryTime(final Country item, final int value)
	{
		setOrderDeliveryTime( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderNumber</code> attribute.
	 * @return the orderNumber - This attribute is used to store hybirs/SAP order code
	 */
	public String getOrderNumber(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.ORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderNumber</code> attribute.
	 * @return the orderNumber - This attribute is used to store hybirs/SAP order code
	 */
	public String getOrderNumber(final Order item)
	{
		return getOrderNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.orderNumber</code> attribute. 
	 * @param value the orderNumber - This attribute is used to store hybirs/SAP order code
	 */
	public void setOrderNumber(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.ORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.orderNumber</code> attribute. 
	 * @param value the orderNumber - This attribute is used to store hybirs/SAP order code
	 */
	public void setOrderNumber(final Order item, final String value)
	{
		setOrderNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderOnPAHold</code> attribute.
	 * @return the orderOnPAHold
	 */
	public Boolean isOrderOnPAHold(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ORDERONPAHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderOnPAHold</code> attribute.
	 * @return the orderOnPAHold
	 */
	public Boolean isOrderOnPAHold(final AbstractOrder item)
	{
		return isOrderOnPAHold( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @return the orderOnPAHold
	 */
	public boolean isOrderOnPAHoldAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isOrderOnPAHold( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @return the orderOnPAHold
	 */
	public boolean isOrderOnPAHoldAsPrimitive(final AbstractOrder item)
	{
		return isOrderOnPAHoldAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @param value the orderOnPAHold
	 */
	public void setOrderOnPAHold(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ORDERONPAHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @param value the orderOnPAHold
	 */
	public void setOrderOnPAHold(final AbstractOrder item, final Boolean value)
	{
		setOrderOnPAHold( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @param value the orderOnPAHold
	 */
	public void setOrderOnPAHold(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setOrderOnPAHold( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderOnPAHold</code> attribute. 
	 * @param value the orderOnPAHold
	 */
	public void setOrderOnPAHold(final AbstractOrder item, final boolean value)
	{
		setOrderOnPAHold( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.orderTemplate</code> attribute.
	 * @return the orderTemplate
	 */
	public Collection<JnjOrderTemplate> getOrderTemplate(final SessionContext ctx, final B2BUnit item)
	{
		return B2BUNIT2ORDERTEMPLATEORDERTEMPLATEHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.orderTemplate</code> attribute.
	 * @return the orderTemplate
	 */
	public Collection<JnjOrderTemplate> getOrderTemplate(final B2BUnit item)
	{
		return getOrderTemplate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.orderTemplate</code> attribute. 
	 * @param value the orderTemplate
	 */
	public void setOrderTemplate(final SessionContext ctx, final B2BUnit item, final Collection<JnjOrderTemplate> value)
	{
		B2BUNIT2ORDERTEMPLATEORDERTEMPLATEHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.orderTemplate</code> attribute. 
	 * @param value the orderTemplate
	 */
	public void setOrderTemplate(final B2BUnit item, final Collection<JnjOrderTemplate> value)
	{
		setOrderTemplate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTemplate. 
	 * @param value the item to add to orderTemplate
	 */
	public void addToOrderTemplate(final SessionContext ctx, final B2BUnit item, final JnjOrderTemplate value)
	{
		B2BUNIT2ORDERTEMPLATEORDERTEMPLATEHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTemplate. 
	 * @param value the item to add to orderTemplate
	 */
	public void addToOrderTemplate(final B2BUnit item, final JnjOrderTemplate value)
	{
		addToOrderTemplate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTemplate. 
	 * @param value the item to remove from orderTemplate
	 */
	public void removeFromOrderTemplate(final SessionContext ctx, final B2BUnit item, final JnjOrderTemplate value)
	{
		B2BUNIT2ORDERTEMPLATEORDERTEMPLATEHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTemplate. 
	 * @param value the item to remove from orderTemplate
	 */
	public void removeFromOrderTemplate(final B2BUnit item, final JnjOrderTemplate value)
	{
		removeFromOrderTemplate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderType</code> attribute.
	 * @return the orderType
	 */
	public EnumerationValue getOrderType(final SessionContext ctx, final AbstractOrder item)
	{
		return (EnumerationValue)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.orderType</code> attribute.
	 * @return the orderType
	 */
	public EnumerationValue getOrderType(final AbstractOrder item)
	{
		return getOrderType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final SessionContext ctx, final AbstractOrder item, final EnumerationValue value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final AbstractOrder item, final EnumerationValue value)
	{
		setOrderType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.originalOrderItem</code> attribute.
	 * @return the originalOrderItem
	 */
	public String getOriginalOrderItem(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ORIGINALORDERITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.originalOrderItem</code> attribute.
	 * @return the originalOrderItem
	 */
	public String getOriginalOrderItem(final AbstractOrderEntry item)
	{
		return getOriginalOrderItem( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.originalOrderItem</code> attribute. 
	 * @param value the originalOrderItem
	 */
	public void setOriginalOrderItem(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ORIGINALORDERITEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.originalOrderItem</code> attribute. 
	 * @param value the originalOrderItem
	 */
	public void setOriginalOrderItem(final AbstractOrderEntry item, final String value)
	{
		setOriginalOrderItem( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.packingList</code> attribute.
	 * @return the packingList - PackingList
	 */
	public String getPackingList(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PACKINGLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.packingList</code> attribute.
	 * @return the packingList - PackingList
	 */
	public String getPackingList(final AbstractOrder item)
	{
		return getPackingList( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.packingList</code> attribute. 
	 * @param value the packingList - PackingList
	 */
	public void setPackingList(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PACKINGLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.packingList</code> attribute. 
	 * @param value the packingList - PackingList
	 */
	public void setPackingList(final AbstractOrder item, final String value)
	{
		setPackingList( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.payFromAddress</code> attribute.
	 * @return the payFromAddress
	 */
	public Boolean isPayFromAddress(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.PAYFROMADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.payFromAddress</code> attribute.
	 * @return the payFromAddress
	 */
	public Boolean isPayFromAddress(final Address item)
	{
		return isPayFromAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.payFromAddress</code> attribute. 
	 * @return the payFromAddress
	 */
	public boolean isPayFromAddressAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isPayFromAddress( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.payFromAddress</code> attribute. 
	 * @return the payFromAddress
	 */
	public boolean isPayFromAddressAsPrimitive(final Address item)
	{
		return isPayFromAddressAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.PAYFROMADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final Address item, final Boolean value)
	{
		setPayFromAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final SessionContext ctx, final Address item, final boolean value)
	{
		setPayFromAddress( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final Address item, final boolean value)
	{
		setPayFromAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.payFromNumber</code> attribute.
	 * @return the payFromNumber
	 */
	public String getPayFromNumber(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.PAYFROMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.payFromNumber</code> attribute.
	 * @return the payFromNumber
	 */
	public String getPayFromNumber(final Order item)
	{
		return getPayFromNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.payFromNumber</code> attribute. 
	 * @param value the payFromNumber
	 */
	public void setPayFromNumber(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.PAYFROMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.payFromNumber</code> attribute. 
	 * @param value the payFromNumber
	 */
	public void setPayFromNumber(final Order item, final String value)
	{
		setPayFromNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentmethod</code> attribute.
	 * @return the paymentmethod - paymentmethod
	 */
	public String getPaymentmethod(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.paymentmethod</code> attribute.
	 * @return the paymentmethod - paymentmethod
	 */
	public String getPaymentmethod(final AbstractOrder item)
	{
		return getPaymentmethod( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.paymentmethod</code> attribute. 
	 * @param value the paymentmethod - paymentmethod
	 */
	public void setPaymentmethod(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PAYMENTMETHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.paymentmethod</code> attribute. 
	 * @param value the paymentmethod - paymentmethod
	 */
	public void setPaymentmethod(final AbstractOrder item, final String value)
	{
		setPaymentmethod( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.phoneCode</code> attribute.
	 * @return the phoneCode
	 */
	public String getPhoneCode(final SessionContext ctx, final Country item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Country.PHONECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.phoneCode</code> attribute.
	 * @return the phoneCode
	 */
	public String getPhoneCode(final Country item)
	{
		return getPhoneCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.phoneCode</code> attribute. 
	 * @param value the phoneCode
	 */
	public void setPhoneCode(final SessionContext ctx, final Country item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Country.PHONECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.phoneCode</code> attribute. 
	 * @param value the phoneCode
	 */
	public void setPhoneCode(final Country item, final String value)
	{
		setPhoneCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.plant</code> attribute.
	 * @return the plant
	 */
	public String getPlant(final AbstractOrderEntry item)
	{
		return getPlant( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.plant</code> attribute. 
	 * @param value the plant
	 */
	public void setPlant(final AbstractOrderEntry item, final String value)
	{
		setPlant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.poBoxPostalCode</code> attribute.
	 * @return the poBoxPostalCode
	 */
	public String getPoBoxPostalCode(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.POBOXPOSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.poBoxPostalCode</code> attribute.
	 * @return the poBoxPostalCode
	 */
	public String getPoBoxPostalCode(final Address item)
	{
		return getPoBoxPostalCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.poBoxPostalCode</code> attribute. 
	 * @param value the poBoxPostalCode
	 */
	public void setPoBoxPostalCode(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.POBOXPOSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.poBoxPostalCode</code> attribute. 
	 * @param value the poBoxPostalCode
	 */
	public void setPoBoxPostalCode(final Address item, final String value)
	{
		setPoBoxPostalCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.poDate</code> attribute.
	 * @return the poDate - Indicates the Purchase Order Date.
	 */
	public Date getPoDate(final SessionContext ctx, final AbstractOrder item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.poDate</code> attribute.
	 * @return the poDate - Indicates the Purchase Order Date.
	 */
	public Date getPoDate(final AbstractOrder item)
	{
		return getPoDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.poDate</code> attribute. 
	 * @param value the poDate - Indicates the Purchase Order Date.
	 */
	public void setPoDate(final SessionContext ctx, final AbstractOrder item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.poDate</code> attribute. 
	 * @param value the poDate - Indicates the Purchase Order Date.
	 */
	public void setPoDate(final AbstractOrder item, final Date value)
	{
		setPoDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.pONumber</code> attribute.
	 * @return the pONumber
	 */
	public String getPONumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.pONumber</code> attribute.
	 * @return the pONumber
	 */
	public String getPONumber(final AbstractOrderEntry item)
	{
		return getPONumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.pONumber</code> attribute. 
	 * @param value the pONumber
	 */
	public void setPONumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.pONumber</code> attribute. 
	 * @param value the pONumber
	 */
	public void setPONumber(final AbstractOrderEntry item, final String value)
	{
		setPONumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.postalExtCode</code> attribute.
	 * @return the postalExtCode
	 */
	public String getPostalExtCode(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.POSTALEXTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.postalExtCode</code> attribute.
	 * @return the postalExtCode
	 */
	public String getPostalExtCode(final Address item)
	{
		return getPostalExtCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.postalExtCode</code> attribute. 
	 * @param value the postalExtCode
	 */
	public void setPostalExtCode(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.POSTALEXTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.postalExtCode</code> attribute. 
	 * @param value the postalExtCode
	 */
	public void setPostalExtCode(final Address item, final String value)
	{
		setPostalExtCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.poType</code> attribute.
	 * @return the poType
	 */
	public String getPoType(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.POTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.poType</code> attribute.
	 * @return the poType
	 */
	public String getPoType(final Order item)
	{
		return getPoType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.poType</code> attribute. 
	 * @param value the poType
	 */
	public void setPoType(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.POTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.poType</code> attribute. 
	 * @param value the poType
	 */
	public void setPoType(final Order item, final String value)
	{
		setPoType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverride</code> attribute.
	 * @return the priceOverride
	 */
	public String getPriceOverride(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverride</code> attribute.
	 * @return the priceOverride
	 */
	public String getPriceOverride(final AbstractOrderEntry item)
	{
		return getPriceOverride( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverride</code> attribute. 
	 * @param value the priceOverride
	 */
	public void setPriceOverride(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverride</code> attribute. 
	 * @param value the priceOverride
	 */
	public void setPriceOverride(final AbstractOrderEntry item, final String value)
	{
		setPriceOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverrideApprover</code> attribute.
	 * @return the priceOverrideApprover
	 */
	public String getPriceOverrideApprover(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDEAPPROVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverrideApprover</code> attribute.
	 * @return the priceOverrideApprover
	 */
	public String getPriceOverrideApprover(final AbstractOrderEntry item)
	{
		return getPriceOverrideApprover( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverrideApprover</code> attribute. 
	 * @param value the priceOverrideApprover
	 */
	public void setPriceOverrideApprover(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDEAPPROVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverrideApprover</code> attribute. 
	 * @param value the priceOverrideApprover
	 */
	public void setPriceOverrideApprover(final AbstractOrderEntry item, final String value)
	{
		setPriceOverrideApprover( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverrideReason</code> attribute.
	 * @return the priceOverrideReason
	 */
	public String getPriceOverrideReason(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDEREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceOverrideReason</code> attribute.
	 * @return the priceOverrideReason
	 */
	public String getPriceOverrideReason(final AbstractOrderEntry item)
	{
		return getPriceOverrideReason( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverrideReason</code> attribute. 
	 * @param value the priceOverrideReason
	 */
	public void setPriceOverrideReason(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICEOVERRIDEREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceOverrideReason</code> attribute. 
	 * @param value the priceOverrideReason
	 */
	public void setPriceOverrideReason(final AbstractOrderEntry item, final String value)
	{
		setPriceOverrideReason( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceType</code> attribute.
	 * @return the priceType
	 */
	public String getPriceType(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.priceType</code> attribute.
	 * @return the priceType
	 */
	public String getPriceType(final AbstractOrderEntry item)
	{
		return getPriceType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceType</code> attribute. 
	 * @param value the priceType
	 */
	public void setPriceType(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.PRICETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.priceType</code> attribute. 
	 * @param value the priceType
	 */
	public void setPriceType(final AbstractOrderEntry item, final String value)
	{
		setPriceType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.productPresentForTheCategory</code> attribute.
	 * @return the productPresentForTheCategory
	 */
	public Boolean isProductPresentForTheCategory(final SessionContext ctx, final Category item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Category.PRODUCTPRESENTFORTHECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.productPresentForTheCategory</code> attribute.
	 * @return the productPresentForTheCategory
	 */
	public Boolean isProductPresentForTheCategory(final Category item)
	{
		return isProductPresentForTheCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @return the productPresentForTheCategory
	 */
	public boolean isProductPresentForTheCategoryAsPrimitive(final SessionContext ctx, final Category item)
	{
		Boolean value = isProductPresentForTheCategory( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @return the productPresentForTheCategory
	 */
	public boolean isProductPresentForTheCategoryAsPrimitive(final Category item)
	{
		return isProductPresentForTheCategoryAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @param value the productPresentForTheCategory
	 */
	public void setProductPresentForTheCategory(final SessionContext ctx, final Category item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Category.PRODUCTPRESENTFORTHECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @param value the productPresentForTheCategory
	 */
	public void setProductPresentForTheCategory(final Category item, final Boolean value)
	{
		setProductPresentForTheCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @param value the productPresentForTheCategory
	 */
	public void setProductPresentForTheCategory(final SessionContext ctx, final Category item, final boolean value)
	{
		setProductPresentForTheCategory( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.productPresentForTheCategory</code> attribute. 
	 * @param value the productPresentForTheCategory
	 */
	public void setProductPresentForTheCategory(final Category item, final boolean value)
	{
		setProductPresentForTheCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.products</code> attribute.
	 * @return the products
	 */
	public Collection<JnJProduct> getProducts(final SessionContext ctx, final Country item)
	{
		final List<JnJProduct> items = item.getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			"JnJProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.products</code> attribute.
	 * @return the products
	 */
	public Collection<JnJProduct> getProducts(final Country item)
	{
		return getProducts( getSession().getSessionContext(), item );
	}
	
	public long getProductsCount(final SessionContext ctx, final Country item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			"JnJProduct",
			null
		);
	}
	
	public long getProductsCount(final Country item)
	{
		return getProductsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Country item, final Collection<JnJProduct> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Country item, final Collection<JnJProduct> value)
	{
		setProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Country item, final JnJProduct value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Country item, final JnJProduct value)
	{
		addToProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Country item, final JnJProduct value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.PRODUCT2COUNTRIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2COUNTRIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Country item, final JnJProduct value)
	{
		removeFromProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.proofOfDelivery</code> attribute.
	 * @return the proofOfDelivery - ProofofDelivery
	 */
	public String getProofOfDelivery(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PROOFOFDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.proofOfDelivery</code> attribute.
	 * @return the proofOfDelivery - ProofofDelivery
	 */
	public String getProofOfDelivery(final AbstractOrder item)
	{
		return getProofOfDelivery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.proofOfDelivery</code> attribute. 
	 * @param value the proofOfDelivery - ProofofDelivery
	 */
	public void setProofOfDelivery(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.PROOFOFDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.proofOfDelivery</code> attribute. 
	 * @param value the proofOfDelivery - ProofofDelivery
	 */
	public void setProofOfDelivery(final AbstractOrder item, final String value)
	{
		setProofOfDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.reasonCode</code> attribute.
	 * @return the reasonCode - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getReasonCode(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.REASONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.reasonCode</code> attribute.
	 * @return the reasonCode - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getReasonCode(final AbstractOrder item)
	{
		return getReasonCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.reasonCode</code> attribute. 
	 * @param value the reasonCode - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setReasonCode(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.REASONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.reasonCode</code> attribute. 
	 * @param value the reasonCode - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setReasonCode(final AbstractOrder item, final String value)
	{
		setReasonCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.REASONFORREJECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection(final AbstractOrderEntry item)
	{
		return getReasonForRejection( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.REASONFORREJECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final AbstractOrderEntry item, final String value)
	{
		setReasonForRejection( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (JnjGTVariantProduct)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.REFERENCEDVARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant(final AbstractOrderEntry item)
	{
		return getReferencedVariant( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final SessionContext ctx, final AbstractOrderEntry item, final JnjGTVariantProduct value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.REFERENCEDVARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final AbstractOrderEntry item, final JnjGTVariantProduct value)
	{
		setReferencedVariant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.requestedDeliveryDate</code> attribute.
	 * @return the requestedDeliveryDate
	 */
	public Date getRequestedDeliveryDate(final SessionContext ctx, final AbstractOrder item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.REQUESTEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.requestedDeliveryDate</code> attribute.
	 * @return the requestedDeliveryDate
	 */
	public Date getRequestedDeliveryDate(final AbstractOrder item)
	{
		return getRequestedDeliveryDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.requestedDeliveryDate</code> attribute. 
	 * @param value the requestedDeliveryDate
	 */
	public void setRequestedDeliveryDate(final SessionContext ctx, final AbstractOrder item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.REQUESTEDDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.requestedDeliveryDate</code> attribute. 
	 * @param value the requestedDeliveryDate
	 */
	public void setRequestedDeliveryDate(final AbstractOrder item, final Date value)
	{
		setRequestedDeliveryDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.returnCreatedDate</code> attribute.
	 * @return the returnCreatedDate - This is the date on which return order is created.
	 */
	public Date getReturnCreatedDate(final SessionContext ctx, final AbstractOrder item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.RETURNCREATEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.returnCreatedDate</code> attribute.
	 * @return the returnCreatedDate - This is the date on which return order is created.
	 */
	public Date getReturnCreatedDate(final AbstractOrder item)
	{
		return getReturnCreatedDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.returnCreatedDate</code> attribute. 
	 * @param value the returnCreatedDate - This is the date on which return order is created.
	 */
	public void setReturnCreatedDate(final SessionContext ctx, final AbstractOrder item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.RETURNCREATEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.returnCreatedDate</code> attribute. 
	 * @param value the returnCreatedDate - This is the date on which return order is created.
	 */
	public void setReturnCreatedDate(final AbstractOrder item, final Date value)
	{
		setReturnCreatedDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.returnImages</code> attribute.
	 * @return the returnImages - A list of additional images return order.
	 */
	public List<Media> getReturnImages(final SessionContext ctx, final AbstractOrder item)
	{
		List<Media> coll = (List<Media>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.RETURNIMAGES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.returnImages</code> attribute.
	 * @return the returnImages - A list of additional images return order.
	 */
	public List<Media> getReturnImages(final AbstractOrder item)
	{
		return getReturnImages( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.returnImages</code> attribute. 
	 * @param value the returnImages - A list of additional images return order.
	 */
	public void setReturnImages(final SessionContext ctx, final AbstractOrder item, final List<Media> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.RETURNIMAGES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.returnImages</code> attribute. 
	 * @param value the returnImages - A list of additional images return order.
	 */
	public void setReturnImages(final AbstractOrder item, final List<Media> value)
	{
		setReturnImages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.returnInvNumber</code> attribute.
	 * @return the returnInvNumber
	 */
	public String getReturnInvNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.RETURNINVNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.returnInvNumber</code> attribute.
	 * @return the returnInvNumber
	 */
	public String getReturnInvNumber(final AbstractOrderEntry item)
	{
		return getReturnInvNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.returnInvNumber</code> attribute. 
	 * @param value the returnInvNumber
	 */
	public void setReturnInvNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.RETURNINVNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.returnInvNumber</code> attribute. 
	 * @param value the returnInvNumber
	 */
	public void setReturnInvNumber(final AbstractOrderEntry item, final String value)
	{
		setReturnInvNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.riskCategory</code> attribute.
	 * @return the riskCategory - This attribute is used to store risk category code
	 */
	public String getRiskCategory(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.RISKCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.riskCategory</code> attribute.
	 * @return the riskCategory - This attribute is used to store risk category code
	 */
	public String getRiskCategory(final Order item)
	{
		return getRiskCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.riskCategory</code> attribute. 
	 * @param value the riskCategory - This attribute is used to store risk category code
	 */
	public void setRiskCategory(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.RISKCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.riskCategory</code> attribute. 
	 * @param value the riskCategory - This attribute is used to store risk category code
	 */
	public void setRiskCategory(final Order item, final String value)
	{
		setRiskCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.route</code> attribute.
	 * @return the route
	 */
	public String getRoute(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.route</code> attribute.
	 * @return the route
	 */
	public String getRoute(final AbstractOrderEntry item)
	{
		return getRoute( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.ROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final AbstractOrderEntry item, final String value)
	{
		setRoute( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderCreditStatus</code> attribute.
	 * @return the salesOrderCreditStatus
	 */
	public String getSalesOrderCreditStatus(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERCREDITSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderCreditStatus</code> attribute.
	 * @return the salesOrderCreditStatus
	 */
	public String getSalesOrderCreditStatus(final Order item)
	{
		return getSalesOrderCreditStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderCreditStatus</code> attribute. 
	 * @param value the salesOrderCreditStatus
	 */
	public void setSalesOrderCreditStatus(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERCREDITSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderCreditStatus</code> attribute. 
	 * @param value the salesOrderCreditStatus
	 */
	public void setSalesOrderCreditStatus(final Order item, final String value)
	{
		setSalesOrderCreditStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderDataCompleteness</code> attribute.
	 * @return the salesOrderDataCompleteness
	 */
	public String getSalesOrderDataCompleteness(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERDATACOMPLETENESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderDataCompleteness</code> attribute.
	 * @return the salesOrderDataCompleteness
	 */
	public String getSalesOrderDataCompleteness(final Order item)
	{
		return getSalesOrderDataCompleteness( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderDataCompleteness</code> attribute. 
	 * @param value the salesOrderDataCompleteness
	 */
	public void setSalesOrderDataCompleteness(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERDATACOMPLETENESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderDataCompleteness</code> attribute. 
	 * @param value the salesOrderDataCompleteness
	 */
	public void setSalesOrderDataCompleteness(final Order item, final String value)
	{
		setSalesOrderDataCompleteness( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderDeliveryStatus</code> attribute.
	 * @return the salesOrderDeliveryStatus
	 */
	public String getSalesOrderDeliveryStatus(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERDELIVERYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderDeliveryStatus</code> attribute.
	 * @return the salesOrderDeliveryStatus
	 */
	public String getSalesOrderDeliveryStatus(final Order item)
	{
		return getSalesOrderDeliveryStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderDeliveryStatus</code> attribute. 
	 * @param value the salesOrderDeliveryStatus
	 */
	public void setSalesOrderDeliveryStatus(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERDELIVERYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderDeliveryStatus</code> attribute. 
	 * @param value the salesOrderDeliveryStatus
	 */
	public void setSalesOrderDeliveryStatus(final Order item, final String value)
	{
		setSalesOrderDeliveryStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderOverallStatus</code> attribute.
	 * @return the salesOrderOverallStatus
	 */
	public String getSalesOrderOverallStatus(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDEROVERALLSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderOverallStatus</code> attribute.
	 * @return the salesOrderOverallStatus
	 */
	public String getSalesOrderOverallStatus(final Order item)
	{
		return getSalesOrderOverallStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderOverallStatus</code> attribute. 
	 * @param value the salesOrderOverallStatus
	 */
	public void setSalesOrderOverallStatus(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDEROVERALLSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderOverallStatus</code> attribute. 
	 * @param value the salesOrderOverallStatus
	 */
	public void setSalesOrderOverallStatus(final Order item, final String value)
	{
		setSalesOrderOverallStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderRejectionStatus</code> attribute.
	 * @return the salesOrderRejectionStatus
	 */
	public String getSalesOrderRejectionStatus(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERREJECTIONSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesOrderRejectionStatus</code> attribute.
	 * @return the salesOrderRejectionStatus
	 */
	public String getSalesOrderRejectionStatus(final Order item)
	{
		return getSalesOrderRejectionStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderRejectionStatus</code> attribute. 
	 * @param value the salesOrderRejectionStatus
	 */
	public void setSalesOrderRejectionStatus(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Order.SALESORDERREJECTIONSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.salesOrderRejectionStatus</code> attribute. 
	 * @param value the salesOrderRejectionStatus
	 */
	public void setSalesOrderRejectionStatus(final Order item, final String value)
	{
		setSalesOrderRejectionStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final AbstractOrderEntry item)
	{
		return getSalesOrg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final AbstractOrderEntry item, final String value)
	{
		setSalesOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.salesOrganizationCode</code> attribute.
	 * @return the salesOrganizationCode
	 */
	public String getSalesOrganizationCode(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SALESORGANIZATIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.salesOrganizationCode</code> attribute.
	 * @return the salesOrganizationCode
	 */
	public String getSalesOrganizationCode(final AbstractOrder item)
	{
		return getSalesOrganizationCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.salesOrganizationCode</code> attribute. 
	 * @param value the salesOrganizationCode
	 */
	public void setSalesOrganizationCode(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SALESORGANIZATIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.salesOrganizationCode</code> attribute. 
	 * @param value the salesOrganizationCode
	 */
	public void setSalesOrganizationCode(final AbstractOrder item, final String value)
	{
		setSalesOrganizationCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesUOM</code> attribute.
	 * @return the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public Integer getSalesUOM(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Integer)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SALESUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesUOM</code> attribute.
	 * @return the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public Integer getSalesUOM(final AbstractOrderEntry item)
	{
		return getSalesUOM( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @return the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public int getSalesUOMAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Integer value = getSalesUOM( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @return the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public int getSalesUOMAsPrimitive(final AbstractOrderEntry item)
	{
		return getSalesUOMAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public void setSalesUOM(final SessionContext ctx, final AbstractOrderEntry item, final Integer value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SALESUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public void setSalesUOM(final AbstractOrderEntry item, final Integer value)
	{
		setSalesUOM( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public void setSalesUOM(final SessionContext ctx, final AbstractOrderEntry item, final int value)
	{
		setSalesUOM( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.salesUOM</code> attribute. 
	 * @param value the salesUOM - This attribute is used to validate the ordered qty is multiple of this attribute
	 */
	public void setSalesUOM(final AbstractOrderEntry item, final int value)
	{
		setSalesUOM( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapErrorMessages</code> attribute.
	 * @return the sapErrorMessages
	 */
	public List<String> getSapErrorMessages(final SessionContext ctx, final AbstractOrder item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPERRORMESSAGES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapErrorMessages</code> attribute.
	 * @return the sapErrorMessages
	 */
	public List<String> getSapErrorMessages(final AbstractOrder item)
	{
		return getSapErrorMessages( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapErrorMessages</code> attribute. 
	 * @param value the sapErrorMessages
	 */
	public void setSapErrorMessages(final SessionContext ctx, final AbstractOrder item, final List<String> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPERRORMESSAGES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapErrorMessages</code> attribute. 
	 * @param value the sapErrorMessages
	 */
	public void setSapErrorMessages(final AbstractOrder item, final List<String> value)
	{
		setSapErrorMessages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapOrderlineNumber</code> attribute.
	 * @return the sapOrderlineNumber
	 */
	public String getSapOrderlineNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapOrderlineNumber</code> attribute.
	 * @return the sapOrderlineNumber
	 */
	public String getSapOrderlineNumber(final AbstractOrderEntry item)
	{
		return getSapOrderlineNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapOrderlineNumber</code> attribute. 
	 * @param value the sapOrderlineNumber
	 */
	public void setSapOrderlineNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapOrderlineNumber</code> attribute. 
	 * @param value the sapOrderlineNumber
	 */
	public void setSapOrderlineNumber(final AbstractOrderEntry item, final String value)
	{
		setSapOrderlineNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final AbstractOrder item)
	{
		return getSapOrderNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final AbstractOrder item, final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapOrderType</code> attribute.
	 * @return the sapOrderType - Value will be ZOR or ZORD depend upon the Sales Org and Product Sector
	 */
	public String getSapOrderType(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapOrderType</code> attribute.
	 * @return the sapOrderType - Value will be ZOR or ZORD depend upon the Sales Org and Product Sector
	 */
	public String getSapOrderType(final AbstractOrderEntry item)
	{
		return getSapOrderType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapOrderType</code> attribute. 
	 * @param value the sapOrderType - Value will be ZOR or ZORD depend upon the Sales Org and Product Sector
	 */
	public void setSapOrderType(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapOrderType</code> attribute. 
	 * @param value the sapOrderType - Value will be ZOR or ZORD depend upon the Sales Org and Product Sector
	 */
	public void setSapOrderType(final AbstractOrderEntry item, final String value)
	{
		setSapOrderType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute.
	 * @return the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public Boolean isSapPriceUpdate(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPPRICEUPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute.
	 * @return the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public Boolean isSapPriceUpdate(final AbstractOrderEntry item)
	{
		return isSapPriceUpdate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @return the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public boolean isSapPriceUpdateAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Boolean value = isSapPriceUpdate( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @return the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public boolean isSapPriceUpdateAsPrimitive(final AbstractOrderEntry item)
	{
		return isSapPriceUpdateAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @param value the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public void setSapPriceUpdate(final SessionContext ctx, final AbstractOrderEntry item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SAPPRICEUPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @param value the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public void setSapPriceUpdate(final AbstractOrderEntry item, final Boolean value)
	{
		setSapPriceUpdate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @param value the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public void setSapPriceUpdate(final SessionContext ctx, final AbstractOrderEntry item, final boolean value)
	{
		setSapPriceUpdate( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPriceUpdate</code> attribute. 
	 * @param value the sapPriceUpdate - This flag will be updated as true when we get the price from the SAP
	 */
	public void setSapPriceUpdate(final AbstractOrderEntry item, final boolean value)
	{
		setSapPriceUpdate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValiationSkipped</code> attribute.
	 * @return the sapValiationSkipped
	 */
	public Boolean isSapValiationSkipped(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPVALIATIONSKIPPED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValiationSkipped</code> attribute.
	 * @return the sapValiationSkipped
	 */
	public Boolean isSapValiationSkipped(final AbstractOrder item)
	{
		return isSapValiationSkipped( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @return the sapValiationSkipped
	 */
	public boolean isSapValiationSkippedAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isSapValiationSkipped( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @return the sapValiationSkipped
	 */
	public boolean isSapValiationSkippedAsPrimitive(final AbstractOrder item)
	{
		return isSapValiationSkippedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @param value the sapValiationSkipped
	 */
	public void setSapValiationSkipped(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPVALIATIONSKIPPED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @param value the sapValiationSkipped
	 */
	public void setSapValiationSkipped(final AbstractOrder item, final Boolean value)
	{
		setSapValiationSkipped( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @param value the sapValiationSkipped
	 */
	public void setSapValiationSkipped(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setSapValiationSkipped( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValiationSkipped</code> attribute. 
	 * @param value the sapValiationSkipped
	 */
	public void setSapValiationSkipped(final AbstractOrder item, final boolean value)
	{
		setSapValiationSkipped( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValidated</code> attribute.
	 * @return the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public Boolean isSapValidated(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPVALIDATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValidated</code> attribute.
	 * @return the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public Boolean isSapValidated(final AbstractOrder item)
	{
		return isSapValidated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @return the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public boolean isSapValidatedAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isSapValidated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @return the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public boolean isSapValidatedAsPrimitive(final AbstractOrder item)
	{
		return isSapValidatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @param value the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public void setSapValidated(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SAPVALIDATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @param value the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public void setSapValidated(final AbstractOrder item, final Boolean value)
	{
		setSapValidated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @param value the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public void setSapValidated(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setSapValidated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sapValidated</code> attribute. 
	 * @param value the sapValidated - This flag will be set true once cart is validated with SAP
	 */
	public void setSapValidated(final AbstractOrder item, final boolean value)
	{
		setSapValidated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedAttributes</code> attribute.
	 * @return the selectedAttributes - This attribute is used to store "list of product attributes" selected by the user from custom export configuration Page(PCM)
	 */
	public List<String> getSelectedAttributes(final SessionContext ctx, final AbstractOrder item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDATTRIBUTES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedAttributes</code> attribute.
	 * @return the selectedAttributes - This attribute is used to store "list of product attributes" selected by the user from custom export configuration Page(PCM)
	 */
	public List<String> getSelectedAttributes(final AbstractOrder item)
	{
		return getSelectedAttributes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedAttributes</code> attribute. 
	 * @param value the selectedAttributes - This attribute is used to store "list of product attributes" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedAttributes(final SessionContext ctx, final AbstractOrder item, final List<String> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDATTRIBUTES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedAttributes</code> attribute. 
	 * @param value the selectedAttributes - This attribute is used to store "list of product attributes" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedAttributes(final AbstractOrder item, final List<String> value)
	{
		setSelectedAttributes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedFileType</code> attribute.
	 * @return the selectedFileType - This attribute is used to store "file type" selected by the user from custom export configuration Page(PCM)
	 */
	public String getSelectedFileType(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDFILETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedFileType</code> attribute.
	 * @return the selectedFileType - This attribute is used to store "file type" selected by the user from custom export configuration Page(PCM)
	 */
	public String getSelectedFileType(final AbstractOrder item)
	{
		return getSelectedFileType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedFileType</code> attribute. 
	 * @param value the selectedFileType - This attribute is used to store "file type" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedFileType(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDFILETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedFileType</code> attribute. 
	 * @param value the selectedFileType - This attribute is used to store "file type" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedFileType(final AbstractOrder item, final String value)
	{
		setSelectedFileType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedImageFormats</code> attribute.
	 * @return the selectedImageFormats - This attribute is used to store "image formats" selected by the user from custom export configuration Page(PCM)
	 */
	public List<String> getSelectedImageFormats(final SessionContext ctx, final AbstractOrder item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDIMAGEFORMATS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedImageFormats</code> attribute.
	 * @return the selectedImageFormats - This attribute is used to store "image formats" selected by the user from custom export configuration Page(PCM)
	 */
	public List<String> getSelectedImageFormats(final AbstractOrder item)
	{
		return getSelectedImageFormats( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedImageFormats</code> attribute. 
	 * @param value the selectedImageFormats - This attribute is used to store "image formats" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedImageFormats(final SessionContext ctx, final AbstractOrder item, final List<String> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDIMAGEFORMATS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedImageFormats</code> attribute. 
	 * @param value the selectedImageFormats - This attribute is used to store "image formats" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedImageFormats(final AbstractOrder item, final List<String> value)
	{
		setSelectedImageFormats( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedRoute</code> attribute.
	 * @return the selectedRoute
	 */
	public String getSelectedRoute(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SELECTEDROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedRoute</code> attribute.
	 * @return the selectedRoute
	 */
	public String getSelectedRoute(final AbstractOrderEntry item)
	{
		return getSelectedRoute( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedRoute</code> attribute. 
	 * @param value the selectedRoute
	 */
	public void setSelectedRoute(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SELECTEDROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedRoute</code> attribute. 
	 * @param value the selectedRoute
	 */
	public void setSelectedRoute(final AbstractOrderEntry item, final String value)
	{
		setSelectedRoute( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedTextFormat</code> attribute.
	 * @return the selectedTextFormat - This attribute is used to store "text format" selected by the user from custom export configuration Page(PCM)
	 */
	public String getSelectedTextFormat(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDTEXTFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.selectedTextFormat</code> attribute.
	 * @return the selectedTextFormat - This attribute is used to store "text format" selected by the user from custom export configuration Page(PCM)
	 */
	public String getSelectedTextFormat(final AbstractOrder item)
	{
		return getSelectedTextFormat( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedTextFormat</code> attribute. 
	 * @param value the selectedTextFormat - This attribute is used to store "text format" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedTextFormat(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SELECTEDTEXTFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.selectedTextFormat</code> attribute. 
	 * @param value the selectedTextFormat - This attribute is used to store "text format" selected by the user from custom export configuration Page(PCM)
	 */
	public void setSelectedTextFormat(final AbstractOrder item, final String value)
	{
		setSelectedTextFormat( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute.
	 * @return the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public Boolean isSendOrderShipmentEmail(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SENDORDERSHIPMENTEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute.
	 * @return the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public Boolean isSendOrderShipmentEmail(final AbstractOrder item)
	{
		return isSendOrderShipmentEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @return the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public boolean isSendOrderShipmentEmailAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isSendOrderShipmentEmail( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @return the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public boolean isSendOrderShipmentEmailAsPrimitive(final AbstractOrder item)
	{
		return isSendOrderShipmentEmailAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @param value the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public void setSendOrderShipmentEmail(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SENDORDERSHIPMENTEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @param value the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public void setSendOrderShipmentEmail(final AbstractOrder item, final Boolean value)
	{
		setSendOrderShipmentEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @param value the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public void setSendOrderShipmentEmail(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setSendOrderShipmentEmail( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.sendOrderShipmentEmail</code> attribute. 
	 * @param value the sendOrderShipmentEmail - Indicator if set true, respective order would be picked up for sending Shipment Email Notification.
	 */
	public void setSendOrderShipmentEmail(final AbstractOrder item, final boolean value)
	{
		setSendOrderShipmentEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.serialNumber</code> attribute.
	 * @return the serialNumber
	 */
	public String getSerialNumber(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SERIALNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.serialNumber</code> attribute.
	 * @return the serialNumber
	 */
	public String getSerialNumber(final AbstractOrderEntry item)
	{
		return getSerialNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.serialNumber</code> attribute. 
	 * @param value the serialNumber
	 */
	public void setSerialNumber(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SERIALNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.serialNumber</code> attribute. 
	 * @param value the serialNumber
	 */
	public void setSerialNumber(final AbstractOrderEntry item, final String value)
	{
		setSerialNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute.
	 * @return the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public Boolean isShipmentEmailPreference(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPMENTEMAILPREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute.
	 * @return the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public Boolean isShipmentEmailPreference(final AbstractOrder item)
	{
		return isShipmentEmailPreference( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @return the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public boolean isShipmentEmailPreferenceAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isShipmentEmailPreference( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @return the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public boolean isShipmentEmailPreferenceAsPrimitive(final AbstractOrder item)
	{
		return isShipmentEmailPreferenceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @param value the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public void setShipmentEmailPreference(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPMENTEMAILPREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @param value the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public void setShipmentEmailPreference(final AbstractOrder item, final Boolean value)
	{
		setShipmentEmailPreference( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @param value the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public void setShipmentEmailPreference(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setShipmentEmailPreference( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipmentEmailPreference</code> attribute. 
	 * @param value the shipmentEmailPreference - Indicates if the user with respect to order has opeted for Order Shipment Notification preference or not.
	 */
	public void setShipmentEmailPreference(final AbstractOrder item, final boolean value)
	{
		setShipmentEmailPreference( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shipmentLoc</code> attribute.
	 * @return the shipmentLoc
	 */
	public String getShipmentLoc(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPMENTLOC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shipmentLoc</code> attribute.
	 * @return the shipmentLoc
	 */
	public String getShipmentLoc(final AbstractOrderEntry item)
	{
		return getShipmentLoc( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shipmentLoc</code> attribute. 
	 * @param value the shipmentLoc
	 */
	public void setShipmentLoc(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPMENTLOC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shipmentLoc</code> attribute. 
	 * @param value the shipmentLoc
	 */
	public void setShipmentLoc(final AbstractOrderEntry item, final String value)
	{
		setShipmentLoc( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shippingDate</code> attribute.
	 * @return the shippingDate
	 */
	public Date getShippingDate(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Date)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPPINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shippingDate</code> attribute.
	 * @return the shippingDate
	 */
	public Date getShippingDate(final AbstractOrderEntry item)
	{
		return getShippingDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shippingDate</code> attribute. 
	 * @param value the shippingDate
	 */
	public void setShippingDate(final SessionContext ctx, final AbstractOrderEntry item, final Date value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPPINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shippingDate</code> attribute. 
	 * @param value the shippingDate
	 */
	public void setShippingDate(final AbstractOrderEntry item, final Date value)
	{
		setShippingDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shippingDetails</code> attribute.
	 * @return the shippingDetails
	 */
	public Set<JnjGTShippingDetails> getShippingDetails(final SessionContext ctx, final AbstractOrder item)
	{
		Set<JnjGTShippingDetails> coll = (Set<JnjGTShippingDetails>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPPINGDETAILS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shippingDetails</code> attribute.
	 * @return the shippingDetails
	 */
	public Set<JnjGTShippingDetails> getShippingDetails(final AbstractOrder item)
	{
		return getShippingDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shippingDetails</code> attribute. 
	 * @param value the shippingDetails
	 */
	public void setShippingDetails(final SessionContext ctx, final AbstractOrder item, final Set<JnjGTShippingDetails> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPPINGDETAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shippingDetails</code> attribute. 
	 * @param value the shippingDetails
	 */
	public void setShippingDetails(final AbstractOrder item, final Set<JnjGTShippingDetails> value)
	{
		setShippingDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shippingInstruction</code> attribute.
	 * @return the shippingInstruction - shipping instruction
	 */
	public String getShippingInstruction(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPPINGINSTRUCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shippingInstruction</code> attribute.
	 * @return the shippingInstruction - shipping instruction
	 */
	public String getShippingInstruction(final AbstractOrder item)
	{
		return getShippingInstruction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shippingInstruction</code> attribute. 
	 * @param value the shippingInstruction - shipping instruction
	 */
	public void setShippingInstruction(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPPINGINSTRUCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shippingInstruction</code> attribute. 
	 * @param value the shippingInstruction - shipping instruction
	 */
	public void setShippingInstruction(final AbstractOrder item, final String value)
	{
		setShippingInstruction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shippingPoint</code> attribute.
	 * @return the shippingPoint
	 */
	public String getShippingPoint(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPPINGPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.shippingPoint</code> attribute.
	 * @return the shippingPoint
	 */
	public String getShippingPoint(final AbstractOrderEntry item)
	{
		return getShippingPoint( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shippingPoint</code> attribute. 
	 * @param value the shippingPoint
	 */
	public void setShippingPoint(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SHIPPINGPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.shippingPoint</code> attribute. 
	 * @param value the shippingPoint
	 */
	public void setShippingPoint(final AbstractOrderEntry item, final String value)
	{
		setShippingPoint( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipToAccount</code> attribute.
	 * @return the shipToAccount
	 */
	public String getShipToAccount(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPTOACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.shipToAccount</code> attribute.
	 * @return the shipToAccount
	 */
	public String getShipToAccount(final AbstractOrder item)
	{
		return getShipToAccount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipToAccount</code> attribute. 
	 * @param value the shipToAccount
	 */
	public void setShipToAccount(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SHIPTOACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.shipToAccount</code> attribute. 
	 * @param value the shipToAccount
	 */
	public void setShipToAccount(final AbstractOrder item, final String value)
	{
		setShipToAccount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.showProductPrice</code> attribute.
	 * @return the showProductPrice
	 */
	public Boolean isShowProductPrice(final SessionContext ctx, final Category item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Category.SHOWPRODUCTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.showProductPrice</code> attribute.
	 * @return the showProductPrice
	 */
	public Boolean isShowProductPrice(final Category item)
	{
		return isShowProductPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.showProductPrice</code> attribute. 
	 * @return the showProductPrice
	 */
	public boolean isShowProductPriceAsPrimitive(final SessionContext ctx, final Category item)
	{
		Boolean value = isShowProductPrice( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.showProductPrice</code> attribute. 
	 * @return the showProductPrice
	 */
	public boolean isShowProductPriceAsPrimitive(final Category item)
	{
		return isShowProductPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.showProductPrice</code> attribute. 
	 * @param value the showProductPrice
	 */
	public void setShowProductPrice(final SessionContext ctx, final Category item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Category.SHOWPRODUCTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.showProductPrice</code> attribute. 
	 * @param value the showProductPrice
	 */
	public void setShowProductPrice(final Category item, final Boolean value)
	{
		setShowProductPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.showProductPrice</code> attribute. 
	 * @param value the showProductPrice
	 */
	public void setShowProductPrice(final SessionContext ctx, final Category item, final boolean value)
	{
		setShowProductPrice( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.showProductPrice</code> attribute. 
	 * @param value the showProductPrice
	 */
	public void setShowProductPrice(final Category item, final boolean value)
	{
		setShowProductPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.signature</code> attribute.
	 * @return the signature - This field will hold the signature for user placing the delivered order.
	 */
	public Media getSignature(final SessionContext ctx, final AbstractOrder item)
	{
		return (Media)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SIGNATURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.signature</code> attribute.
	 * @return the signature - This field will hold the signature for user placing the delivered order.
	 */
	public Media getSignature(final AbstractOrder item)
	{
		return getSignature( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.signature</code> attribute. 
	 * @param value the signature - This field will hold the signature for user placing the delivered order.
	 */
	public void setSignature(final SessionContext ctx, final AbstractOrder item, final Media value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SIGNATURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.signature</code> attribute. 
	 * @param value the signature - This field will hold the signature for user placing the delivered order.
	 */
	public void setSignature(final AbstractOrder item, final Media value)
	{
		setSignature( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final Address item)
	{
		return getSourceSysId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final Address item, final String value)
	{
		setSourceSysId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.specialStockPartner</code> attribute.
	 * @return the specialStockPartner
	 */
	public String getSpecialStockPartner(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SPECIALSTOCKPARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.specialStockPartner</code> attribute.
	 * @return the specialStockPartner
	 */
	public String getSpecialStockPartner(final AbstractOrderEntry item)
	{
		return getSpecialStockPartner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.specialStockPartner</code> attribute. 
	 * @param value the specialStockPartner
	 */
	public void setSpecialStockPartner(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SPECIALSTOCKPARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.specialStockPartner</code> attribute. 
	 * @param value the specialStockPartner
	 */
	public void setSpecialStockPartner(final AbstractOrderEntry item, final String value)
	{
		setSpecialStockPartner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.specialText</code> attribute.
	 * @return the specialText
	 */
	public String getSpecialText(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SPECIALTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.specialText</code> attribute.
	 * @return the specialText
	 */
	public String getSpecialText(final AbstractOrder item)
	{
		return getSpecialText( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.specialText</code> attribute. 
	 * @param value the specialText
	 */
	public void setSpecialText(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SPECIALTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.specialText</code> attribute. 
	 * @param value the specialText
	 */
	public void setSpecialText(final AbstractOrder item, final String value)
	{
		setSpecialText( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.spineSalesRepUCN</code> attribute.
	 * @return the spineSalesRepUCN
	 */
	public String getSpineSalesRepUCN(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SPINESALESREPUCN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.spineSalesRepUCN</code> attribute.
	 * @return the spineSalesRepUCN
	 */
	public String getSpineSalesRepUCN(final AbstractOrder item)
	{
		return getSpineSalesRepUCN( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.spineSalesRepUCN</code> attribute. 
	 * @param value the spineSalesRepUCN
	 */
	public void setSpineSalesRepUCN(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SPINESALESREPUCN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.spineSalesRepUCN</code> attribute. 
	 * @param value the spineSalesRepUCN
	 */
	public void setSpineSalesRepUCN(final AbstractOrder item, final String value)
	{
		setSpineSalesRepUCN( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final AbstractOrderEntry item)
	{
		return getStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final AbstractOrderEntry item, final String value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.stockPartner</code> attribute.
	 * @return the stockPartner
	 */
	public String getStockPartner(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.STOCKPARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.stockPartner</code> attribute.
	 * @return the stockPartner
	 */
	public String getStockPartner(final AbstractOrderEntry item)
	{
		return getStockPartner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.stockPartner</code> attribute. 
	 * @param value the stockPartner
	 */
	public void setStockPartner(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.STOCKPARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.stockPartner</code> attribute. 
	 * @param value the stockPartner
	 */
	public void setStockPartner(final AbstractOrderEntry item, final String value)
	{
		setStockPartner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.stockUser</code> attribute.
	 * @return the stockUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getStockUser(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.STOCKUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.stockUser</code> attribute.
	 * @return the stockUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public String getStockUser(final AbstractOrder item)
	{
		return getStockUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.stockUser</code> attribute. 
	 * @param value the stockUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setStockUser(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.STOCKUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.stockUser</code> attribute. 
	 * @param value the stockUser - Reason code for various order types i.e. return order, house order, no-charge Order
	 */
	public void setStockUser(final AbstractOrder item, final String value)
	{
		setStockUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.substitutionReason</code> attribute.
	 * @return the substitutionReason
	 */
	public String getSubstitutionReason(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SUBSTITUTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.substitutionReason</code> attribute.
	 * @return the substitutionReason
	 */
	public String getSubstitutionReason(final AbstractOrderEntry item)
	{
		return getSubstitutionReason( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.substitutionReason</code> attribute. 
	 * @param value the substitutionReason
	 */
	public void setSubstitutionReason(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.SUBSTITUTIONREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.substitutionReason</code> attribute. 
	 * @param value the substitutionReason
	 */
	public void setSubstitutionReason(final AbstractOrderEntry item, final String value)
	{
		setSubstitutionReason( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeon</code> attribute.
	 * @return the surgeon
	 */
	public JnjGTSurgeon getSurgeon(final SessionContext ctx, final AbstractOrder item)
	{
		return (JnjGTSurgeon)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeon</code> attribute.
	 * @return the surgeon
	 */
	public JnjGTSurgeon getSurgeon(final AbstractOrder item)
	{
		return getSurgeon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeon</code> attribute. 
	 * @param value the surgeon
	 */
	public void setSurgeon(final SessionContext ctx, final AbstractOrder item, final JnjGTSurgeon value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeon</code> attribute. 
	 * @param value the surgeon
	 */
	public void setSurgeon(final AbstractOrder item, final JnjGTSurgeon value)
	{
		setSurgeon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeonName</code> attribute.
	 * @return the surgeonName
	 */
	public String getSurgeonName(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGEONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeonName</code> attribute.
	 * @return the surgeonName
	 */
	public String getSurgeonName(final AbstractOrder item)
	{
		return getSurgeonName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeonName</code> attribute. 
	 * @param value the surgeonName
	 */
	public void setSurgeonName(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGEONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeonName</code> attribute. 
	 * @param value the surgeonName
	 */
	public void setSurgeonName(final AbstractOrder item, final String value)
	{
		setSurgeonName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeryInfo</code> attribute.
	 * @return the surgeryInfo
	 */
	public JnjGTSurgeryInfo getSurgeryInfo(final SessionContext ctx, final AbstractOrder item)
	{
		return (JnjGTSurgeryInfo)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGERYINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.surgeryInfo</code> attribute.
	 * @return the surgeryInfo
	 */
	public JnjGTSurgeryInfo getSurgeryInfo(final AbstractOrder item)
	{
		return getSurgeryInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeryInfo</code> attribute. 
	 * @param value the surgeryInfo
	 */
	public void setSurgeryInfo(final SessionContext ctx, final AbstractOrder item, final JnjGTSurgeryInfo value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.SURGERYINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.surgeryInfo</code> attribute. 
	 * @param value the surgeryInfo
	 */
	public void setSurgeryInfo(final AbstractOrder item, final JnjGTSurgeryInfo value)
	{
		setSurgeryInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxes</code> attribute.
	 * @return the taxes
	 */
	public Double getTaxes(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.TAXES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxes</code> attribute.
	 * @return the taxes
	 */
	public Double getTaxes(final AbstractOrderEntry item)
	{
		return getTaxes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @return the taxes
	 */
	public double getTaxesAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getTaxes( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @return the taxes
	 */
	public double getTaxesAsPrimitive(final AbstractOrderEntry item)
	{
		return getTaxesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.TAXES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final AbstractOrderEntry item, final Double value)
	{
		setTaxes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setTaxes( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final AbstractOrderEntry item, final double value)
	{
		setTaxes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.taxId</code> attribute.
	 * @return the taxId
	 */
	public String getTaxId(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Address.TAXID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.taxId</code> attribute.
	 * @return the taxId
	 */
	public String getTaxId(final Address item)
	{
		return getTaxId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.taxId</code> attribute. 
	 * @param value the taxId
	 */
	public void setTaxId(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Address.TAXID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.taxId</code> attribute. 
	 * @param value the taxId
	 */
	public void setTaxId(final Address item, final String value)
	{
		setTaxId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.thirdpartyBilling</code> attribute.
	 * @return the thirdpartyBilling
	 */
	public Boolean isThirdpartyBilling(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.THIRDPARTYBILLING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.thirdpartyBilling</code> attribute.
	 * @return the thirdpartyBilling
	 */
	public Boolean isThirdpartyBilling(final AbstractOrder item)
	{
		return isThirdpartyBilling( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @return the thirdpartyBilling
	 */
	public boolean isThirdpartyBillingAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isThirdpartyBilling( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @return the thirdpartyBilling
	 */
	public boolean isThirdpartyBillingAsPrimitive(final AbstractOrder item)
	{
		return isThirdpartyBillingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @param value the thirdpartyBilling
	 */
	public void setThirdpartyBilling(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.THIRDPARTYBILLING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @param value the thirdpartyBilling
	 */
	public void setThirdpartyBilling(final AbstractOrder item, final Boolean value)
	{
		setThirdpartyBilling( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @param value the thirdpartyBilling
	 */
	public void setThirdpartyBilling(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setThirdpartyBilling( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.thirdpartyBilling</code> attribute. 
	 * @param value the thirdpartyBilling
	 */
	public void setThirdpartyBilling(final AbstractOrder item, final boolean value)
	{
		setThirdpartyBilling( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalAdjRateAll</code> attribute.
	 * @return the totalAdjRateAll
	 */
	public Double getTotalAdjRateAll(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALADJRATEALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalAdjRateAll</code> attribute.
	 * @return the totalAdjRateAll
	 */
	public Double getTotalAdjRateAll(final AbstractOrder item)
	{
		return getTotalAdjRateAll( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @return the totalAdjRateAll
	 */
	public double getTotalAdjRateAllAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalAdjRateAll( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @return the totalAdjRateAll
	 */
	public double getTotalAdjRateAllAsPrimitive(final AbstractOrder item)
	{
		return getTotalAdjRateAllAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @param value the totalAdjRateAll
	 */
	public void setTotalAdjRateAll(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALADJRATEALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @param value the totalAdjRateAll
	 */
	public void setTotalAdjRateAll(final AbstractOrder item, final Double value)
	{
		setTotalAdjRateAll( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @param value the totalAdjRateAll
	 */
	public void setTotalAdjRateAll(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalAdjRateAll( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalAdjRateAll</code> attribute. 
	 * @param value the totalAdjRateAll
	 */
	public void setTotalAdjRateAll(final AbstractOrder item, final double value)
	{
		setTotalAdjRateAll( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalDropShipFee</code> attribute.
	 * @return the totalDropShipFee
	 */
	public Double getTotalDropShipFee(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALDROPSHIPFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalDropShipFee</code> attribute.
	 * @return the totalDropShipFee
	 */
	public Double getTotalDropShipFee(final AbstractOrder item)
	{
		return getTotalDropShipFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @return the totalDropShipFee
	 */
	public double getTotalDropShipFeeAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalDropShipFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @return the totalDropShipFee
	 */
	public double getTotalDropShipFeeAsPrimitive(final AbstractOrder item)
	{
		return getTotalDropShipFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALDROPSHIPFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final AbstractOrder item, final Double value)
	{
		setTotalDropShipFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalDropShipFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalDropShipFee</code> attribute. 
	 * @param value the totalDropShipFee
	 */
	public void setTotalDropShipFee(final AbstractOrder item, final double value)
	{
		setTotalDropShipFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalExpeditedFees</code> attribute.
	 * @return the totalExpeditedFees
	 */
	public Double getTotalExpeditedFees(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALEXPEDITEDFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalExpeditedFees</code> attribute.
	 * @return the totalExpeditedFees
	 */
	public Double getTotalExpeditedFees(final AbstractOrder item)
	{
		return getTotalExpeditedFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @return the totalExpeditedFees
	 */
	public double getTotalExpeditedFeesAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalExpeditedFees( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @return the totalExpeditedFees
	 */
	public double getTotalExpeditedFeesAsPrimitive(final AbstractOrder item)
	{
		return getTotalExpeditedFeesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @param value the totalExpeditedFees
	 */
	public void setTotalExpeditedFees(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALEXPEDITEDFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @param value the totalExpeditedFees
	 */
	public void setTotalExpeditedFees(final AbstractOrder item, final Double value)
	{
		setTotalExpeditedFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @param value the totalExpeditedFees
	 */
	public void setTotalExpeditedFees(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalExpeditedFees( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalExpeditedFees</code> attribute. 
	 * @param value the totalExpeditedFees
	 */
	public void setTotalExpeditedFees(final AbstractOrder item, final double value)
	{
		setTotalExpeditedFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees(final AbstractOrder item)
	{
		return getTotalFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalFees( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive(final AbstractOrder item)
	{
		return getTotalFeesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final AbstractOrder item, final Double value)
	{
		setTotalFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalFees( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final AbstractOrder item, final double value)
	{
		setTotalFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.TOTALFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalFees</code> attribute.
	 * @return the totalFees
	 */
	public Double getTotalFees(final AbstractOrderEntry item)
	{
		return getTotalFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getTotalFees( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @return the totalFees
	 */
	public double getTotalFeesAsPrimitive(final AbstractOrderEntry item)
	{
		return getTotalFeesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.TOTALFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final AbstractOrderEntry item, final Double value)
	{
		setTotalFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setTotalFees( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.totalFees</code> attribute. 
	 * @param value the totalFees
	 */
	public void setTotalFees(final AbstractOrderEntry item, final double value)
	{
		setTotalFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFreightFees</code> attribute.
	 * @return the totalFreightFees
	 */
	public Double getTotalFreightFees(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALFREIGHTFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFreightFees</code> attribute.
	 * @return the totalFreightFees
	 */
	public Double getTotalFreightFees(final AbstractOrder item)
	{
		return getTotalFreightFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @return the totalFreightFees
	 */
	public double getTotalFreightFeesAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalFreightFees( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @return the totalFreightFees
	 */
	public double getTotalFreightFeesAsPrimitive(final AbstractOrder item)
	{
		return getTotalFreightFeesAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALFREIGHTFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final AbstractOrder item, final Double value)
	{
		setTotalFreightFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalFreightFees( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalFreightFees</code> attribute. 
	 * @param value the totalFreightFees
	 */
	public void setTotalFreightFees(final AbstractOrder item, final double value)
	{
		setTotalFreightFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalGrossPrice</code> attribute.
	 * @return the totalGrossPrice
	 */
	public Double getTotalGrossPrice(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALGROSSPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalGrossPrice</code> attribute.
	 * @return the totalGrossPrice
	 */
	public Double getTotalGrossPrice(final AbstractOrder item)
	{
		return getTotalGrossPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @return the totalGrossPrice
	 */
	public double getTotalGrossPriceAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalGrossPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @return the totalGrossPrice
	 */
	public double getTotalGrossPriceAsPrimitive(final AbstractOrder item)
	{
		return getTotalGrossPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @param value the totalGrossPrice
	 */
	public void setTotalGrossPrice(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALGROSSPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @param value the totalGrossPrice
	 */
	public void setTotalGrossPrice(final AbstractOrder item, final Double value)
	{
		setTotalGrossPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @param value the totalGrossPrice
	 */
	public void setTotalGrossPrice(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalGrossPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalGrossPrice</code> attribute. 
	 * @param value the totalGrossPrice
	 */
	public void setTotalGrossPrice(final AbstractOrder item, final double value)
	{
		setTotalGrossPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHandlingFee</code> attribute.
	 * @return the totalHandlingFee
	 */
	public Double getTotalHandlingFee(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALHANDLINGFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHandlingFee</code> attribute.
	 * @return the totalHandlingFee
	 */
	public Double getTotalHandlingFee(final AbstractOrder item)
	{
		return getTotalHandlingFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @return the totalHandlingFee
	 */
	public double getTotalHandlingFeeAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalHandlingFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @return the totalHandlingFee
	 */
	public double getTotalHandlingFeeAsPrimitive(final AbstractOrder item)
	{
		return getTotalHandlingFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @param value the totalHandlingFee
	 */
	public void setTotalHandlingFee(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALHANDLINGFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @param value the totalHandlingFee
	 */
	public void setTotalHandlingFee(final AbstractOrder item, final Double value)
	{
		setTotalHandlingFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @param value the totalHandlingFee
	 */
	public void setTotalHandlingFee(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalHandlingFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHandlingFee</code> attribute. 
	 * @param value the totalHandlingFee
	 */
	public void setTotalHandlingFee(final AbstractOrder item, final double value)
	{
		setTotalHandlingFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHsaPromotion</code> attribute.
	 * @return the totalHsaPromotion
	 */
	public Double getTotalHsaPromotion(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALHSAPROMOTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHsaPromotion</code> attribute.
	 * @return the totalHsaPromotion
	 */
	public Double getTotalHsaPromotion(final AbstractOrder item)
	{
		return getTotalHsaPromotion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @return the totalHsaPromotion
	 */
	public double getTotalHsaPromotionAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalHsaPromotion( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @return the totalHsaPromotion
	 */
	public double getTotalHsaPromotionAsPrimitive(final AbstractOrder item)
	{
		return getTotalHsaPromotionAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALHSAPROMOTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final AbstractOrder item, final Double value)
	{
		setTotalHsaPromotion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalHsaPromotion( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalHsaPromotion</code> attribute. 
	 * @param value the totalHsaPromotion
	 */
	public void setTotalHsaPromotion(final AbstractOrder item, final double value)
	{
		setTotalHsaPromotion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalInsurance</code> attribute.
	 * @return the totalInsurance
	 */
	public Double getTotalInsurance(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALINSURANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalInsurance</code> attribute.
	 * @return the totalInsurance
	 */
	public Double getTotalInsurance(final AbstractOrder item)
	{
		return getTotalInsurance( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @return the totalInsurance
	 */
	public double getTotalInsuranceAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalInsurance( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @return the totalInsurance
	 */
	public double getTotalInsuranceAsPrimitive(final AbstractOrder item)
	{
		return getTotalInsuranceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @param value the totalInsurance
	 */
	public void setTotalInsurance(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALINSURANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @param value the totalInsurance
	 */
	public void setTotalInsurance(final AbstractOrder item, final Double value)
	{
		setTotalInsurance( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @param value the totalInsurance
	 */
	public void setTotalInsurance(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalInsurance( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalInsurance</code> attribute. 
	 * @param value the totalInsurance
	 */
	public void setTotalInsurance(final AbstractOrder item, final double value)
	{
		setTotalInsurance( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalmanualFee</code> attribute.
	 * @return the totalmanualFee
	 */
	public Double getTotalmanualFee(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALMANUALFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalmanualFee</code> attribute.
	 * @return the totalmanualFee
	 */
	public Double getTotalmanualFee(final AbstractOrder item)
	{
		return getTotalmanualFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @return the totalmanualFee
	 */
	public double getTotalmanualFeeAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalmanualFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @return the totalmanualFee
	 */
	public double getTotalmanualFeeAsPrimitive(final AbstractOrder item)
	{
		return getTotalmanualFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @param value the totalmanualFee
	 */
	public void setTotalmanualFee(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALMANUALFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @param value the totalmanualFee
	 */
	public void setTotalmanualFee(final AbstractOrder item, final Double value)
	{
		setTotalmanualFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @param value the totalmanualFee
	 */
	public void setTotalmanualFee(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalmanualFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalmanualFee</code> attribute. 
	 * @param value the totalmanualFee
	 */
	public void setTotalmanualFee(final AbstractOrder item, final double value)
	{
		setTotalmanualFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute.
	 * @return the totalminimumOrderFee
	 */
	public Double getTotalminimumOrderFee(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALMINIMUMORDERFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute.
	 * @return the totalminimumOrderFee
	 */
	public Double getTotalminimumOrderFee(final AbstractOrder item)
	{
		return getTotalminimumOrderFee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @return the totalminimumOrderFee
	 */
	public double getTotalminimumOrderFeeAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalminimumOrderFee( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @return the totalminimumOrderFee
	 */
	public double getTotalminimumOrderFeeAsPrimitive(final AbstractOrder item)
	{
		return getTotalminimumOrderFeeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALMINIMUMORDERFEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final AbstractOrder item, final Double value)
	{
		setTotalminimumOrderFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalminimumOrderFee( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalminimumOrderFee</code> attribute. 
	 * @param value the totalminimumOrderFee
	 */
	public void setTotalminimumOrderFee(final AbstractOrder item, final double value)
	{
		setTotalminimumOrderFee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalNetValue</code> attribute.
	 * @return the totalNetValue
	 */
	public Double getTotalNetValue(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALNETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalNetValue</code> attribute.
	 * @return the totalNetValue
	 */
	public Double getTotalNetValue(final AbstractOrder item)
	{
		return getTotalNetValue( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @return the totalNetValue
	 */
	public double getTotalNetValueAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalNetValue( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @return the totalNetValue
	 */
	public double getTotalNetValueAsPrimitive(final AbstractOrder item)
	{
		return getTotalNetValueAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALNETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final AbstractOrder item, final Double value)
	{
		setTotalNetValue( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalNetValue( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalNetValue</code> attribute. 
	 * @param value the totalNetValue
	 */
	public void setTotalNetValue(final AbstractOrder item, final double value)
	{
		setTotalNetValue( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalOtherCharge</code> attribute.
	 * @return the totalOtherCharge
	 */
	public Double getTotalOtherCharge(final SessionContext ctx, final AbstractOrder item)
	{
		return (Double)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALOTHERCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalOtherCharge</code> attribute.
	 * @return the totalOtherCharge
	 */
	public Double getTotalOtherCharge(final AbstractOrder item)
	{
		return getTotalOtherCharge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @return the totalOtherCharge
	 */
	public double getTotalOtherChargeAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Double value = getTotalOtherCharge( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @return the totalOtherCharge
	 */
	public double getTotalOtherChargeAsPrimitive(final AbstractOrder item)
	{
		return getTotalOtherChargeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @param value the totalOtherCharge
	 */
	public void setTotalOtherCharge(final SessionContext ctx, final AbstractOrder item, final Double value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TOTALOTHERCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @param value the totalOtherCharge
	 */
	public void setTotalOtherCharge(final AbstractOrder item, final Double value)
	{
		setTotalOtherCharge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @param value the totalOtherCharge
	 */
	public void setTotalOtherCharge(final SessionContext ctx, final AbstractOrder item, final double value)
	{
		setTotalOtherCharge( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.totalOtherCharge</code> attribute. 
	 * @param value the totalOtherCharge
	 */
	public void setTotalOtherCharge(final AbstractOrder item, final double value)
	{
		setTotalOtherCharge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.tracking</code> attribute.
	 * @return the tracking - tracking
	 */
	public String getTracking(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TRACKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.tracking</code> attribute.
	 * @return the tracking - tracking
	 */
	public String getTracking(final AbstractOrder item)
	{
		return getTracking( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.tracking</code> attribute. 
	 * @param value the tracking - tracking
	 */
	public void setTracking(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrder.TRACKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.tracking</code> attribute. 
	 * @param value the tracking - tracking
	 */
	public void setTracking(final AbstractOrder item, final String value)
	{
		setTracking( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.unloadingPoint</code> attribute.
	 * @return the unloadingPoint
	 */
	public String getUnloadingPoint(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.UNLOADINGPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.unloadingPoint</code> attribute.
	 * @return the unloadingPoint
	 */
	public String getUnloadingPoint(final AbstractOrderEntry item)
	{
		return getUnloadingPoint( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.unloadingPoint</code> attribute. 
	 * @param value the unloadingPoint
	 */
	public void setUnloadingPoint(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.AbstractOrderEntry.UNLOADINGPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.unloadingPoint</code> attribute. 
	 * @param value the unloadingPoint
	 */
	public void setUnloadingPoint(final AbstractOrderEntry item, final String value)
	{
		setUnloadingPoint( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartEntry.validationErrorKeys</code> attribute.
	 * @return the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public List<String> getValidationErrorKeys(final SessionContext ctx, final CartEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.CartEntry.VALIDATIONERRORKEYS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartEntry.validationErrorKeys</code> attribute.
	 * @return the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public List<String> getValidationErrorKeys(final CartEntry item)
	{
		return getValidationErrorKeys( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartEntry.validationErrorKeys</code> attribute. 
	 * @param value the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public void setValidationErrorKeys(final SessionContext ctx, final CartEntry item, final List<String> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.CartEntry.VALIDATIONERRORKEYS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartEntry.validationErrorKeys</code> attribute. 
	 * @param value the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public void setValidationErrorKeys(final CartEntry item, final List<String> value)
	{
		setValidationErrorKeys( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.validationErrorKeys</code> attribute.
	 * @return the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public List<String> getValidationErrorKeys(final SessionContext ctx, final Cart item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, Jnjb2bCoreConstants.Attributes.Cart.VALIDATIONERRORKEYS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.validationErrorKeys</code> attribute.
	 * @return the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public List<String> getValidationErrorKeys(final Cart item)
	{
		return getValidationErrorKeys( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.validationErrorKeys</code> attribute. 
	 * @param value the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public void setValidationErrorKeys(final SessionContext ctx, final Cart item, final List<String> value)
	{
		item.setProperty(ctx, Jnjb2bCoreConstants.Attributes.Cart.VALIDATIONERRORKEYS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.validationErrorKeys</code> attribute. 
	 * @param value the validationErrorKeys - This attribute is used to save the warning which are mandatory for making SAP calls
	 */
	public void setValidationErrorKeys(final Cart item, final List<String> value)
	{
		setValidationErrorKeys( getSession().getSessionContext(), item, value );
	}
	
}
