/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.CompanyInfo;
import com.jnj.core.jalo.JnJB2BUnit;
import com.jnj.core.jalo.OldPassword;
import com.jnj.core.jalo.SecretQuestionsAndAnswers;
import de.hybris.platform.b2b.jalo.B2BCustomer;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.b2b.jalo.B2BCustomer JnJB2bCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJB2bCustomer extends B2BCustomer
{
	/** Qualifier of the <code>JnJB2bCustomer.customerName</code> attribute **/
	public static final String CUSTOMERNAME = "customerName";
	/** Qualifier of the <code>JnJB2bCustomer.emailNotification</code> attribute **/
	public static final String EMAILNOTIFICATION = "emailNotification";
	/** Qualifier of the <code>JnJB2bCustomer.customerType</code> attribute **/
	public static final String CUSTOMERTYPE = "customerType";
	/** Qualifier of the <code>JnJB2bCustomer.preferredMobileNumber</code> attribute **/
	public static final String PREFERREDMOBILENUMBER = "preferredMobileNumber";
	/** Qualifier of the <code>JnJB2bCustomer.passwordChangeDate</code> attribute **/
	public static final String PASSWORDCHANGEDATE = "passwordChangeDate";
	/** Qualifier of the <code>JnJB2bCustomer.showChangeAccount</code> attribute **/
	public static final String SHOWCHANGEACCOUNT = "showChangeAccount";
	/** Qualifier of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute **/
	public static final String REGISTRATIONEMAILSENT = "registrationEmailSent";
	/** Qualifier of the <code>JnJB2bCustomer.creatorB2BUnit</code> attribute **/
	public static final String CREATORB2BUNIT = "creatorB2BUnit";
	/** Qualifier of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute **/
	public static final String LEGALNOTICEVERSION = "legalNoticeVersion";
	/** Qualifier of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute **/
	public static final String PRIVACYPOLICYVERSION = "privacyPolicyVersion";
	/** Qualifier of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute **/
	public static final String MAILSENTFORINTERVAL = "mailSentForInterval";
	/** Qualifier of the <code>JnJB2bCustomer.secretQuestionsAndAnswersList</code> attribute **/
	public static final String SECRETQUESTIONSANDANSWERSLIST = "secretQuestionsAndAnswersList";
	/** Qualifier of the <code>JnJB2bCustomer.forcefulExpired</code> attribute **/
	public static final String FORCEFULEXPIRED = "forcefulExpired";
	/** Qualifier of the <code>JnJB2bCustomer.mddSector</code> attribute **/
	public static final String MDDSECTOR = "mddSector";
	/** Qualifier of the <code>JnJB2bCustomer.consumerSector</code> attribute **/
	public static final String CONSUMERSECTOR = "consumerSector";
	/** Qualifier of the <code>JnJB2bCustomer.pharmaSector</code> attribute **/
	public static final String PHARMASECTOR = "pharmaSector";
	/** Qualifier of the <code>JnJB2bCustomer.sourceId</code> attribute **/
	public static final String SOURCEID = "sourceId";
	/** Qualifier of the <code>JnJB2bCustomer.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnJB2bCustomer.emailPreferences</code> attribute **/
	public static final String EMAILPREFERENCES = "emailPreferences";
	/** Qualifier of the <code>JnJB2bCustomer.smsPreferences</code> attribute **/
	public static final String SMSPREFERENCES = "smsPreferences";
	/** Qualifier of the <code>JnJB2bCustomer.backorderEmailType</code> attribute **/
	public static final String BACKORDEREMAILTYPE = "backorderEmailType";
	/** Qualifier of the <code>JnJB2bCustomer.lastMailSent</code> attribute **/
	public static final String LASTMAILSENT = "lastMailSent";
	/** Qualifier of the <code>JnJB2bCustomer.shippedOrderEmailType</code> attribute **/
	public static final String SHIPPEDORDEREMAILTYPE = "shippedOrderEmailType";
	/** Qualifier of the <code>JnJB2bCustomer.lastShippedOrderMailSent</code> attribute **/
	public static final String LASTSHIPPEDORDERMAILSENT = "lastShippedOrderMailSent";
	/** Qualifier of the <code>JnJB2bCustomer.unknownAccount</code> attribute **/
	public static final String UNKNOWNACCOUNT = "unknownAccount";
	/** Qualifier of the <code>JnJB2bCustomer.territoryDiv</code> attribute **/
	public static final String TERRITORYDIV = "territoryDiv";
	/** Qualifier of the <code>JnJB2bCustomer.divison</code> attribute **/
	public static final String DIVISON = "divison";
	/** Qualifier of the <code>JnJB2bCustomer.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>JnJB2bCustomer.companyInformation</code> attribute **/
	public static final String COMPANYINFORMATION = "companyInformation";
	/** Qualifier of the <code>JnJB2bCustomer.registrationDate</code> attribute **/
	public static final String REGISTRATIONDATE = "registrationDate";
	/** Qualifier of the <code>JnJB2bCustomer.userType</code> attribute **/
	public static final String USERTYPE = "userType";
	/** Qualifier of the <code>JnJB2bCustomer.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnJB2bCustomer.companyName</code> attribute **/
	public static final String COMPANYNAME = "companyName";
	/** Qualifier of the <code>JnJB2bCustomer.superVisorName</code> attribute **/
	public static final String SUPERVISORNAME = "superVisorName";
	/** Qualifier of the <code>JnJB2bCustomer.superVisorEmail</code> attribute **/
	public static final String SUPERVISOREMAIL = "superVisorEmail";
	/** Qualifier of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute **/
	public static final String AUTHORIZEDBUYER = "authorizedBuyer";
	/** Qualifier of the <code>JnJB2bCustomer.superVisorNumber</code> attribute **/
	public static final String SUPERVISORNUMBER = "superVisorNumber";
	/** Qualifier of the <code>JnJB2bCustomer.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnJB2bCustomer.gateWayAccessCode</code> attribute **/
	public static final String GATEWAYACCESSCODE = "gateWayAccessCode";
	/** Qualifier of the <code>JnJB2bCustomer.wwid</code> attribute **/
	public static final String WWID = "wwid";
	/** Qualifier of the <code>JnJB2bCustomer.currentB2BUnit</code> attribute **/
	public static final String CURRENTB2BUNIT = "currentB2BUnit";
	/** Qualifier of the <code>JnJB2bCustomer.surveyEnabled</code> attribute **/
	public static final String SURVEYENABLED = "surveyEnabled";
	/** Qualifier of the <code>JnJB2bCustomer.passwordExpireToken</code> attribute **/
	public static final String PASSWORDEXPIRETOKEN = "passwordExpireToken";
	/** Qualifier of the <code>JnJB2bCustomer.csrNotes</code> attribute **/
	public static final String CSRNOTES = "csrNotes";
	/** Qualifier of the <code>JnJB2bCustomer.noCharge</code> attribute **/
	public static final String NOCHARGE = "noCharge";
	/** Qualifier of the <code>JnJB2bCustomer.accessBy</code> attribute **/
	public static final String ACCESSBY = "accessBy";
	/** Qualifier of the <code>JnJB2bCustomer.currentCountry</code> attribute **/
	public static final String CURRENTCOUNTRY = "currentCountry";
	/** Qualifier of the <code>JnJB2bCustomer.associatedCountries</code> attribute **/
	public static final String ASSOCIATEDCOUNTRIES = "associatedCountries";
	/** Qualifier of the <code>JnJB2bCustomer.gatewayUserId</code> attribute **/
	public static final String GATEWAYUSERID = "gatewayUserId";
	/** Qualifier of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute **/
	public static final String REQUESTACCOUNTINDICATOR = "requestAccountIndicator";
	/** Qualifier of the <code>JnJB2bCustomer.bulkUploaded</code> attribute **/
	public static final String BULKUPLOADED = "bulkUploaded";
	/** Qualifier of the <code>JnJB2bCustomer.generateToken</code> attribute **/
	public static final String GENERATETOKEN = "generateToken";
	/** Qualifier of the <code>JnJB2bCustomer.resetPasswordUrl</code> attribute **/
	public static final String RESETPASSWORDURL = "resetPasswordUrl";
	/** Qualifier of the <code>JnJB2bCustomer.sendActivationMail</code> attribute **/
	public static final String SENDACTIVATIONMAIL = "sendActivationMail";
	/** Qualifier of the <code>JnJB2bCustomer.defaultShipToAddressIdMap</code> attribute **/
	public static final String DEFAULTSHIPTOADDRESSIDMAP = "defaultShipToAddressIdMap";
	/** Qualifier of the <code>JnJB2bCustomer.defaultBillToAddressIdMap</code> attribute **/
	public static final String DEFAULTBILLTOADDRESSIDMAP = "defaultBillToAddressIdMap";
	/** Qualifier of the <code>JnJB2bCustomer.isResetPassword</code> attribute **/
	public static final String ISRESETPASSWORD = "isResetPassword";
	/** Qualifier of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute **/
	public static final String CONSIGNMENTENTRYORDER = "consignmentEntryOrder";
	/** Qualifier of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute **/
	public static final String FINANCIALANALYSISENABLE = "financialAnalysisEnable";
	/** Qualifier of the <code>JnJB2bCustomer.invoiceEmailPrefType</code> attribute **/
	public static final String INVOICEEMAILPREFTYPE = "invoiceEmailPrefType";
	/** Qualifier of the <code>JnJB2bCustomer.deliveryNoteEmailPrefType</code> attribute **/
	public static final String DELIVERYNOTEEMAILPREFTYPE = "deliveryNoteEmailPrefType";
	/** Qualifier of the <code>JnJB2bCustomer.ssoLogin</code> attribute **/
	public static final String SSOLOGIN = "ssoLogin";
	/** Qualifier of the <code>JnJB2bCustomer.defaultOrderType</code> attribute **/
	public static final String DEFAULTORDERTYPE = "defaultOrderType";
	/** Qualifier of the <code>JnJB2bCustomer.allowedFranchise</code> attribute **/
	public static final String ALLOWEDFRANCHISE = "allowedFranchise";
	/** Qualifier of the <code>JnJB2bCustomer.oldPasswords</code> attribute **/
	public static final String OLDPASSWORDS = "oldPasswords";
	/**
	* {@link OneToManyHandler} for handling 1:n OLDPASSWORDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OldPassword> OLDPASSWORDSHANDLER = new OneToManyHandler<OldPassword>(
	Jnjb2bCoreConstants.TC.OLDPASSWORD,
	false,
	"jnjCustomer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(B2BCustomer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CUSTOMERNAME, AttributeMode.INITIAL);
		tmp.put(EMAILNOTIFICATION, AttributeMode.INITIAL);
		tmp.put(CUSTOMERTYPE, AttributeMode.INITIAL);
		tmp.put(PREFERREDMOBILENUMBER, AttributeMode.INITIAL);
		tmp.put(PASSWORDCHANGEDATE, AttributeMode.INITIAL);
		tmp.put(SHOWCHANGEACCOUNT, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONEMAILSENT, AttributeMode.INITIAL);
		tmp.put(CREATORB2BUNIT, AttributeMode.INITIAL);
		tmp.put(LEGALNOTICEVERSION, AttributeMode.INITIAL);
		tmp.put(PRIVACYPOLICYVERSION, AttributeMode.INITIAL);
		tmp.put(MAILSENTFORINTERVAL, AttributeMode.INITIAL);
		tmp.put(SECRETQUESTIONSANDANSWERSLIST, AttributeMode.INITIAL);
		tmp.put(FORCEFULEXPIRED, AttributeMode.INITIAL);
		tmp.put(MDDSECTOR, AttributeMode.INITIAL);
		tmp.put(CONSUMERSECTOR, AttributeMode.INITIAL);
		tmp.put(PHARMASECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCEID, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(EMAILPREFERENCES, AttributeMode.INITIAL);
		tmp.put(SMSPREFERENCES, AttributeMode.INITIAL);
		tmp.put(BACKORDEREMAILTYPE, AttributeMode.INITIAL);
		tmp.put(LASTMAILSENT, AttributeMode.INITIAL);
		tmp.put(SHIPPEDORDEREMAILTYPE, AttributeMode.INITIAL);
		tmp.put(LASTSHIPPEDORDERMAILSENT, AttributeMode.INITIAL);
		tmp.put(UNKNOWNACCOUNT, AttributeMode.INITIAL);
		tmp.put(TERRITORYDIV, AttributeMode.INITIAL);
		tmp.put(DIVISON, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(COMPANYINFORMATION, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONDATE, AttributeMode.INITIAL);
		tmp.put(USERTYPE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(COMPANYNAME, AttributeMode.INITIAL);
		tmp.put(SUPERVISORNAME, AttributeMode.INITIAL);
		tmp.put(SUPERVISOREMAIL, AttributeMode.INITIAL);
		tmp.put(AUTHORIZEDBUYER, AttributeMode.INITIAL);
		tmp.put(SUPERVISORNUMBER, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(GATEWAYACCESSCODE, AttributeMode.INITIAL);
		tmp.put(WWID, AttributeMode.INITIAL);
		tmp.put(CURRENTB2BUNIT, AttributeMode.INITIAL);
		tmp.put(SURVEYENABLED, AttributeMode.INITIAL);
		tmp.put(PASSWORDEXPIRETOKEN, AttributeMode.INITIAL);
		tmp.put(CSRNOTES, AttributeMode.INITIAL);
		tmp.put(NOCHARGE, AttributeMode.INITIAL);
		tmp.put(ACCESSBY, AttributeMode.INITIAL);
		tmp.put(CURRENTCOUNTRY, AttributeMode.INITIAL);
		tmp.put(ASSOCIATEDCOUNTRIES, AttributeMode.INITIAL);
		tmp.put(GATEWAYUSERID, AttributeMode.INITIAL);
		tmp.put(REQUESTACCOUNTINDICATOR, AttributeMode.INITIAL);
		tmp.put(BULKUPLOADED, AttributeMode.INITIAL);
		tmp.put(GENERATETOKEN, AttributeMode.INITIAL);
		tmp.put(RESETPASSWORDURL, AttributeMode.INITIAL);
		tmp.put(SENDACTIVATIONMAIL, AttributeMode.INITIAL);
		tmp.put(DEFAULTSHIPTOADDRESSIDMAP, AttributeMode.INITIAL);
		tmp.put(DEFAULTBILLTOADDRESSIDMAP, AttributeMode.INITIAL);
		tmp.put(ISRESETPASSWORD, AttributeMode.INITIAL);
		tmp.put(CONSIGNMENTENTRYORDER, AttributeMode.INITIAL);
		tmp.put(FINANCIALANALYSISENABLE, AttributeMode.INITIAL);
		tmp.put(INVOICEEMAILPREFTYPE, AttributeMode.INITIAL);
		tmp.put(DELIVERYNOTEEMAILPREFTYPE, AttributeMode.INITIAL);
		tmp.put(SSOLOGIN, AttributeMode.INITIAL);
		tmp.put(DEFAULTORDERTYPE, AttributeMode.INITIAL);
		tmp.put(ALLOWEDFRANCHISE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.accessBy</code> attribute.
	 * @return the accessBy - This property holds Access by value.
	 */
	public EnumerationValue getAccessBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ACCESSBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.accessBy</code> attribute.
	 * @return the accessBy - This property holds Access by value.
	 */
	public EnumerationValue getAccessBy()
	{
		return getAccessBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.accessBy</code> attribute. 
	 * @param value the accessBy - This property holds Access by value.
	 */
	public void setAccessBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ACCESSBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.accessBy</code> attribute. 
	 * @param value the accessBy - This property holds Access by value.
	 */
	public void setAccessBy(final EnumerationValue value)
	{
		setAccessBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.allowedFranchise</code> attribute.
	 * @return the allowedFranchise - Contains the franchise to which the user has access to.
	 */
	public List<Category> getAllowedFranchise(final SessionContext ctx)
	{
		List<Category> coll = (List<Category>)getProperty( ctx, ALLOWEDFRANCHISE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.allowedFranchise</code> attribute.
	 * @return the allowedFranchise - Contains the franchise to which the user has access to.
	 */
	public List<Category> getAllowedFranchise()
	{
		return getAllowedFranchise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.allowedFranchise</code> attribute. 
	 * @param value the allowedFranchise - Contains the franchise to which the user has access to.
	 */
	public void setAllowedFranchise(final SessionContext ctx, final List<Category> value)
	{
		setProperty(ctx, ALLOWEDFRANCHISE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.allowedFranchise</code> attribute. 
	 * @param value the allowedFranchise - Contains the franchise to which the user has access to.
	 */
	public void setAllowedFranchise(final List<Category> value)
	{
		setAllowedFranchise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.associatedCountries</code> attribute.
	 * @return the associatedCountries
	 */
	public Set<Country> getAssociatedCountries(final SessionContext ctx)
	{
		Set<Country> coll = (Set<Country>)getProperty( ctx, ASSOCIATEDCOUNTRIES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.associatedCountries</code> attribute.
	 * @return the associatedCountries
	 */
	public Set<Country> getAssociatedCountries()
	{
		return getAssociatedCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.associatedCountries</code> attribute. 
	 * @param value the associatedCountries
	 */
	public void setAssociatedCountries(final SessionContext ctx, final Set<Country> value)
	{
		setProperty(ctx, ASSOCIATEDCOUNTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.associatedCountries</code> attribute. 
	 * @param value the associatedCountries
	 */
	public void setAssociatedCountries(final Set<Country> value)
	{
		setAssociatedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute.
	 * @return the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public Boolean isAuthorizedBuyer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTHORIZEDBUYER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute.
	 * @return the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public Boolean isAuthorizedBuyer()
	{
		return isAuthorizedBuyer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @return the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public boolean isAuthorizedBuyerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAuthorizedBuyer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @return the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public boolean isAuthorizedBuyerAsPrimitive()
	{
		return isAuthorizedBuyerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public void setAuthorizedBuyer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTHORIZEDBUYER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public void setAuthorizedBuyer(final Boolean value)
	{
		setAuthorizedBuyer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public void setAuthorizedBuyer(final SessionContext ctx, final boolean value)
	{
		setAuthorizedBuyer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer - This property holds 1 or 0 depending upon if the user is an authorised buyer.
	 */
	public void setAuthorizedBuyer(final boolean value)
	{
		setAuthorizedBuyer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.backorderEmailType</code> attribute.
	 * @return the backorderEmailType - This list holds all the email preferences that the user has selected
	 */
	public String getBackorderEmailType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BACKORDEREMAILTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.backorderEmailType</code> attribute.
	 * @return the backorderEmailType - This list holds all the email preferences that the user has selected
	 */
	public String getBackorderEmailType()
	{
		return getBackorderEmailType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.backorderEmailType</code> attribute. 
	 * @param value the backorderEmailType - This list holds all the email preferences that the user has selected
	 */
	public void setBackorderEmailType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BACKORDEREMAILTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.backorderEmailType</code> attribute. 
	 * @param value the backorderEmailType - This list holds all the email preferences that the user has selected
	 */
	public void setBackorderEmailType(final String value)
	{
		setBackorderEmailType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute.
	 * @return the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public Boolean isBulkUploaded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BULKUPLOADED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute.
	 * @return the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public Boolean isBulkUploaded()
	{
		return isBulkUploaded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @return the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public boolean isBulkUploadedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBulkUploaded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @return the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public boolean isBulkUploadedAsPrimitive()
	{
		return isBulkUploadedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @param value the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public void setBulkUploaded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BULKUPLOADED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @param value the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public void setBulkUploaded(final Boolean value)
	{
		setBulkUploaded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @param value the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public void setBulkUploaded(final SessionContext ctx, final boolean value)
	{
		setBulkUploaded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.bulkUploaded</code> attribute. 
	 * @param value the bulkUploaded - This will  indicate that the user has been ceated through bulk Upload
	 */
	public void setBulkUploaded(final boolean value)
	{
		setBulkUploaded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.companyInformation</code> attribute.
	 * @return the companyInformation - This will hold the information of the company as saved by the user at the time of the registration.
	 */
	public CompanyInfo getCompanyInformation(final SessionContext ctx)
	{
		return (CompanyInfo)getProperty( ctx, COMPANYINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.companyInformation</code> attribute.
	 * @return the companyInformation - This will hold the information of the company as saved by the user at the time of the registration.
	 */
	public CompanyInfo getCompanyInformation()
	{
		return getCompanyInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.companyInformation</code> attribute. 
	 * @param value the companyInformation - This will hold the information of the company as saved by the user at the time of the registration.
	 */
	public void setCompanyInformation(final SessionContext ctx, final CompanyInfo value)
	{
		setProperty(ctx, COMPANYINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.companyInformation</code> attribute. 
	 * @param value the companyInformation - This will hold the information of the company as saved by the user at the time of the registration.
	 */
	public void setCompanyInformation(final CompanyInfo value)
	{
		setCompanyInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.companyName</code> attribute.
	 * @return the companyName - This property holds company's name of the User.
	 */
	public String getCompanyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.companyName</code> attribute.
	 * @return the companyName - This property holds company's name of the User.
	 */
	public String getCompanyName()
	{
		return getCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.companyName</code> attribute. 
	 * @param value the companyName - This property holds company's name of the User.
	 */
	public void setCompanyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.companyName</code> attribute. 
	 * @param value the companyName - This property holds company's name of the User.
	 */
	public void setCompanyName(final String value)
	{
		setCompanyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute.
	 * @return the consignmentEntryOrder
	 */
	public Boolean isConsignmentEntryOrder(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CONSIGNMENTENTRYORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute.
	 * @return the consignmentEntryOrder
	 */
	public Boolean isConsignmentEntryOrder()
	{
		return isConsignmentEntryOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @return the consignmentEntryOrder
	 */
	public boolean isConsignmentEntryOrderAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isConsignmentEntryOrder( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @return the consignmentEntryOrder
	 */
	public boolean isConsignmentEntryOrderAsPrimitive()
	{
		return isConsignmentEntryOrderAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @param value the consignmentEntryOrder
	 */
	public void setConsignmentEntryOrder(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CONSIGNMENTENTRYORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @param value the consignmentEntryOrder
	 */
	public void setConsignmentEntryOrder(final Boolean value)
	{
		setConsignmentEntryOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @param value the consignmentEntryOrder
	 */
	public void setConsignmentEntryOrder(final SessionContext ctx, final boolean value)
	{
		setConsignmentEntryOrder( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consignmentEntryOrder</code> attribute. 
	 * @param value the consignmentEntryOrder
	 */
	public void setConsignmentEntryOrder(final boolean value)
	{
		setConsignmentEntryOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consumerSector</code> attribute.
	 * @return the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public Boolean isConsumerSector(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CONSUMERSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consumerSector</code> attribute.
	 * @return the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public Boolean isConsumerSector()
	{
		return isConsumerSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @return the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public boolean isConsumerSectorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isConsumerSector( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @return the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public boolean isConsumerSectorAsPrimitive()
	{
		return isConsumerSectorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @param value the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public void setConsumerSector(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CONSUMERSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @param value the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public void setConsumerSector(final Boolean value)
	{
		setConsumerSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @param value the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public void setConsumerSector(final SessionContext ctx, final boolean value)
	{
		setConsumerSector( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.consumerSector</code> attribute. 
	 * @param value the consumerSector - This flag holds true if the user is authorized for Consumer Site
	 */
	public void setConsumerSector(final boolean value)
	{
		setConsumerSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.creatorB2BUnit</code> attribute.
	 * @return the creatorB2BUnit
	 */
	public JnJB2BUnit getCreatorB2BUnit(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, CREATORB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.creatorB2BUnit</code> attribute.
	 * @return the creatorB2BUnit
	 */
	public JnJB2BUnit getCreatorB2BUnit()
	{
		return getCreatorB2BUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.creatorB2BUnit</code> attribute. 
	 * @param value the creatorB2BUnit
	 */
	public void setCreatorB2BUnit(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, CREATORB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.creatorB2BUnit</code> attribute. 
	 * @param value the creatorB2BUnit
	 */
	public void setCreatorB2BUnit(final JnJB2BUnit value)
	{
		setCreatorB2BUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.csrNotes</code> attribute.
	 * @return the csrNotes
	 */
	public String getCsrNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CSRNOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.csrNotes</code> attribute.
	 * @return the csrNotes
	 */
	public String getCsrNotes()
	{
		return getCsrNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.csrNotes</code> attribute. 
	 * @param value the csrNotes
	 */
	public void setCsrNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CSRNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.csrNotes</code> attribute. 
	 * @param value the csrNotes
	 */
	public void setCsrNotes(final String value)
	{
		setCsrNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.currentB2BUnit</code> attribute.
	 * @return the currentB2BUnit - This property holds the User's current B2B Unit.
	 */
	public JnJB2BUnit getCurrentB2BUnit(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, CURRENTB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.currentB2BUnit</code> attribute.
	 * @return the currentB2BUnit - This property holds the User's current B2B Unit.
	 */
	public JnJB2BUnit getCurrentB2BUnit()
	{
		return getCurrentB2BUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.currentB2BUnit</code> attribute. 
	 * @param value the currentB2BUnit - This property holds the User's current B2B Unit.
	 */
	public void setCurrentB2BUnit(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, CURRENTB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.currentB2BUnit</code> attribute. 
	 * @param value the currentB2BUnit - This property holds the User's current B2B Unit.
	 */
	public void setCurrentB2BUnit(final JnJB2BUnit value)
	{
		setCurrentB2BUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.currentCountry</code> attribute.
	 * @return the currentCountry
	 */
	public Country getCurrentCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, CURRENTCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.currentCountry</code> attribute.
	 * @return the currentCountry
	 */
	public Country getCurrentCountry()
	{
		return getCurrentCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.currentCountry</code> attribute. 
	 * @param value the currentCountry
	 */
	public void setCurrentCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, CURRENTCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.currentCountry</code> attribute. 
	 * @param value the currentCountry
	 */
	public void setCurrentCountry(final Country value)
	{
		setCurrentCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName()
	{
		return getCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final String value)
	{
		setCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.customerType</code> attribute.
	 * @return the customerType
	 */
	public String getCustomerType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.customerType</code> attribute.
	 * @return the customerType
	 */
	public String getCustomerType()
	{
		return getCustomerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.customerType</code> attribute. 
	 * @param value the customerType
	 */
	public void setCustomerType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.customerType</code> attribute. 
	 * @param value the customerType
	 */
	public void setCustomerType(final String value)
	{
		setCustomerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultBillToAddressIdMap</code> attribute.
	 * @return the defaultBillToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public Map<String,String> getAllDefaultBillToAddressIdMap(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, DEFAULTBILLTOADDRESSIDMAP);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultBillToAddressIdMap</code> attribute.
	 * @return the defaultBillToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public Map<String,String> getAllDefaultBillToAddressIdMap()
	{
		return getAllDefaultBillToAddressIdMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultBillToAddressIdMap</code> attribute. 
	 * @param value the defaultBillToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public void setAllDefaultBillToAddressIdMap(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, DEFAULTBILLTOADDRESSIDMAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultBillToAddressIdMap</code> attribute. 
	 * @param value the defaultBillToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public void setAllDefaultBillToAddressIdMap(final Map<String,String> value)
	{
		setAllDefaultBillToAddressIdMap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultOrderType</code> attribute.
	 * @return the defaultOrderType - This property stores the Order Type selected as default by User
	 */
	public String getDefaultOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEFAULTORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultOrderType</code> attribute.
	 * @return the defaultOrderType - This property stores the Order Type selected as default by User
	 */
	public String getDefaultOrderType()
	{
		return getDefaultOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultOrderType</code> attribute. 
	 * @param value the defaultOrderType - This property stores the Order Type selected as default by User
	 */
	public void setDefaultOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEFAULTORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultOrderType</code> attribute. 
	 * @param value the defaultOrderType - This property stores the Order Type selected as default by User
	 */
	public void setDefaultOrderType(final String value)
	{
		setDefaultOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultShipToAddressIdMap</code> attribute.
	 * @return the defaultShipToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public Map<String,String> getAllDefaultShipToAddressIdMap(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, DEFAULTSHIPTOADDRESSIDMAP);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.defaultShipToAddressIdMap</code> attribute.
	 * @return the defaultShipToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public Map<String,String> getAllDefaultShipToAddressIdMap()
	{
		return getAllDefaultShipToAddressIdMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultShipToAddressIdMap</code> attribute. 
	 * @param value the defaultShipToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public void setAllDefaultShipToAddressIdMap(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, DEFAULTSHIPTOADDRESSIDMAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.defaultShipToAddressIdMap</code> attribute. 
	 * @param value the defaultShipToAddressIdMap - This will  store default ship to address id of accounts that are associated to the user.
	 */
	public void setAllDefaultShipToAddressIdMap(final Map<String,String> value)
	{
		setAllDefaultShipToAddressIdMap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.deliveryNoteEmailPrefType</code> attribute.
	 * @return the deliveryNoteEmailPrefType - This list holds value delivery Note email preference daily/weekly
	 */
	public String getDeliveryNoteEmailPrefType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNOTEEMAILPREFTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.deliveryNoteEmailPrefType</code> attribute.
	 * @return the deliveryNoteEmailPrefType - This list holds value delivery Note email preference daily/weekly
	 */
	public String getDeliveryNoteEmailPrefType()
	{
		return getDeliveryNoteEmailPrefType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.deliveryNoteEmailPrefType</code> attribute. 
	 * @param value the deliveryNoteEmailPrefType - This list holds value delivery Note email preference daily/weekly
	 */
	public void setDeliveryNoteEmailPrefType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNOTEEMAILPREFTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.deliveryNoteEmailPrefType</code> attribute. 
	 * @param value the deliveryNoteEmailPrefType - This list holds value delivery Note email preference daily/weekly
	 */
	public void setDeliveryNoteEmailPrefType(final String value)
	{
		setDeliveryNoteEmailPrefType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.department</code> attribute.
	 * @return the department - This will hold the value of the department the user belongs to.
	 */
	public String getDepartment(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.department</code> attribute.
	 * @return the department - This will hold the value of the department the user belongs to.
	 */
	public String getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.department</code> attribute. 
	 * @param value the department - This will hold the value of the department the user belongs to.
	 */
	public void setDepartment(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.department</code> attribute. 
	 * @param value the department - This will hold the value of the department the user belongs to.
	 */
	public void setDepartment(final String value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.divison</code> attribute.
	 * @return the divison - This will hold the value of the divisions in the case of Jnj employee.
	 */
	public String getDivison(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.divison</code> attribute.
	 * @return the divison - This will hold the value of the divisions in the case of Jnj employee.
	 */
	public String getDivison()
	{
		return getDivison( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.divison</code> attribute. 
	 * @param value the divison - This will hold the value of the divisions in the case of Jnj employee.
	 */
	public void setDivison(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.divison</code> attribute. 
	 * @param value the divison - This will hold the value of the divisions in the case of Jnj employee.
	 */
	public void setDivison(final String value)
	{
		setDivison( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailNotification</code> attribute.
	 * @return the emailNotification
	 */
	public Boolean isEmailNotification(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILNOTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailNotification</code> attribute.
	 * @return the emailNotification
	 */
	public Boolean isEmailNotification()
	{
		return isEmailNotification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @return the emailNotification
	 */
	public boolean isEmailNotificationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailNotification( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @return the emailNotification
	 */
	public boolean isEmailNotificationAsPrimitive()
	{
		return isEmailNotificationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @param value the emailNotification
	 */
	public void setEmailNotification(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILNOTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @param value the emailNotification
	 */
	public void setEmailNotification(final Boolean value)
	{
		setEmailNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @param value the emailNotification
	 */
	public void setEmailNotification(final SessionContext ctx, final boolean value)
	{
		setEmailNotification( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailNotification</code> attribute. 
	 * @param value the emailNotification
	 */
	public void setEmailNotification(final boolean value)
	{
		setEmailNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailPreferences</code> attribute.
	 * @return the emailPreferences - This list holds all the email preferences that the user has selected
	 */
	public List<String> getEmailPreferences(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, EMAILPREFERENCES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.emailPreferences</code> attribute.
	 * @return the emailPreferences - This list holds all the email preferences that the user has selected
	 */
	public List<String> getEmailPreferences()
	{
		return getEmailPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailPreferences</code> attribute. 
	 * @param value the emailPreferences - This list holds all the email preferences that the user has selected
	 */
	public void setEmailPreferences(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, EMAILPREFERENCES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.emailPreferences</code> attribute. 
	 * @param value the emailPreferences - This list holds all the email preferences that the user has selected
	 */
	public void setEmailPreferences(final List<String> value)
	{
		setEmailPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute.
	 * @return the financialAnalysisEnable
	 */
	public Boolean isFinancialAnalysisEnable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FINANCIALANALYSISENABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute.
	 * @return the financialAnalysisEnable
	 */
	public Boolean isFinancialAnalysisEnable()
	{
		return isFinancialAnalysisEnable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @return the financialAnalysisEnable
	 */
	public boolean isFinancialAnalysisEnableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFinancialAnalysisEnable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @return the financialAnalysisEnable
	 */
	public boolean isFinancialAnalysisEnableAsPrimitive()
	{
		return isFinancialAnalysisEnableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @param value the financialAnalysisEnable
	 */
	public void setFinancialAnalysisEnable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FINANCIALANALYSISENABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @param value the financialAnalysisEnable
	 */
	public void setFinancialAnalysisEnable(final Boolean value)
	{
		setFinancialAnalysisEnable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @param value the financialAnalysisEnable
	 */
	public void setFinancialAnalysisEnable(final SessionContext ctx, final boolean value)
	{
		setFinancialAnalysisEnable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.financialAnalysisEnable</code> attribute. 
	 * @param value the financialAnalysisEnable
	 */
	public void setFinancialAnalysisEnable(final boolean value)
	{
		setFinancialAnalysisEnable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute.
	 * @return the forcefulExpired
	 */
	public Boolean isForcefulExpired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FORCEFULEXPIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute.
	 * @return the forcefulExpired
	 */
	public Boolean isForcefulExpired()
	{
		return isForcefulExpired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @return the forcefulExpired
	 */
	public boolean isForcefulExpiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isForcefulExpired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @return the forcefulExpired
	 */
	public boolean isForcefulExpiredAsPrimitive()
	{
		return isForcefulExpiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @param value the forcefulExpired
	 */
	public void setForcefulExpired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FORCEFULEXPIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @param value the forcefulExpired
	 */
	public void setForcefulExpired(final Boolean value)
	{
		setForcefulExpired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @param value the forcefulExpired
	 */
	public void setForcefulExpired(final SessionContext ctx, final boolean value)
	{
		setForcefulExpired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.forcefulExpired</code> attribute. 
	 * @param value the forcefulExpired
	 */
	public void setForcefulExpired(final boolean value)
	{
		setForcefulExpired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.gateWayAccessCode</code> attribute.
	 * @return the gateWayAccessCode - This property holds company's name of the User.
	 */
	public String getGateWayAccessCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GATEWAYACCESSCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.gateWayAccessCode</code> attribute.
	 * @return the gateWayAccessCode - This property holds company's name of the User.
	 */
	public String getGateWayAccessCode()
	{
		return getGateWayAccessCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.gateWayAccessCode</code> attribute. 
	 * @param value the gateWayAccessCode - This property holds company's name of the User.
	 */
	public void setGateWayAccessCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GATEWAYACCESSCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.gateWayAccessCode</code> attribute. 
	 * @param value the gateWayAccessCode - This property holds company's name of the User.
	 */
	public void setGateWayAccessCode(final String value)
	{
		setGateWayAccessCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.gatewayUserId</code> attribute.
	 * @return the gatewayUserId - This property holds the gateway User Id coming as a part of user Migration.
	 */
	public String getGatewayUserId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GATEWAYUSERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.gatewayUserId</code> attribute.
	 * @return the gatewayUserId - This property holds the gateway User Id coming as a part of user Migration.
	 */
	public String getGatewayUserId()
	{
		return getGatewayUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.gatewayUserId</code> attribute. 
	 * @param value the gatewayUserId - This property holds the gateway User Id coming as a part of user Migration.
	 */
	public void setGatewayUserId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GATEWAYUSERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.gatewayUserId</code> attribute. 
	 * @param value the gatewayUserId - This property holds the gateway User Id coming as a part of user Migration.
	 */
	public void setGatewayUserId(final String value)
	{
		setGatewayUserId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.generateToken</code> attribute.
	 * @return the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public Boolean isGenerateToken(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GENERATETOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.generateToken</code> attribute.
	 * @return the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public Boolean isGenerateToken()
	{
		return isGenerateToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @return the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public boolean isGenerateTokenAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGenerateToken( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @return the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public boolean isGenerateTokenAsPrimitive()
	{
		return isGenerateTokenAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @param value the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public void setGenerateToken(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GENERATETOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @param value the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public void setGenerateToken(final Boolean value)
	{
		setGenerateToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @param value the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public void setGenerateToken(final SessionContext ctx, final boolean value)
	{
		setGenerateToken( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.generateToken</code> attribute. 
	 * @param value the generateToken - This will  indicate that the token has been generated for the user.
	 */
	public void setGenerateToken(final boolean value)
	{
		setGenerateToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.invoiceEmailPrefType</code> attribute.
	 * @return the invoiceEmailPrefType - This list holds value invoice email preference daily/weekly
	 */
	public String getInvoiceEmailPrefType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICEEMAILPREFTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.invoiceEmailPrefType</code> attribute.
	 * @return the invoiceEmailPrefType - This list holds value invoice email preference daily/weekly
	 */
	public String getInvoiceEmailPrefType()
	{
		return getInvoiceEmailPrefType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.invoiceEmailPrefType</code> attribute. 
	 * @param value the invoiceEmailPrefType - This list holds value invoice email preference daily/weekly
	 */
	public void setInvoiceEmailPrefType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICEEMAILPREFTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.invoiceEmailPrefType</code> attribute. 
	 * @param value the invoiceEmailPrefType - This list holds value invoice email preference daily/weekly
	 */
	public void setInvoiceEmailPrefType(final String value)
	{
		setInvoiceEmailPrefType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.isResetPassword</code> attribute.
	 * @return the isResetPassword
	 */
	public Boolean isIsResetPassword(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISRESETPASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.isResetPassword</code> attribute.
	 * @return the isResetPassword
	 */
	public Boolean isIsResetPassword()
	{
		return isIsResetPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @return the isResetPassword
	 */
	public boolean isIsResetPasswordAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsResetPassword( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @return the isResetPassword
	 */
	public boolean isIsResetPasswordAsPrimitive()
	{
		return isIsResetPasswordAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @param value the isResetPassword
	 */
	public void setIsResetPassword(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISRESETPASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @param value the isResetPassword
	 */
	public void setIsResetPassword(final Boolean value)
	{
		setIsResetPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @param value the isResetPassword
	 */
	public void setIsResetPassword(final SessionContext ctx, final boolean value)
	{
		setIsResetPassword( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.isResetPassword</code> attribute. 
	 * @param value the isResetPassword
	 */
	public void setIsResetPassword(final boolean value)
	{
		setIsResetPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.lastMailSent</code> attribute.
	 * @return the lastMailSent - This list holds all the email preferences that the user has selected
	 */
	public Date getLastMailSent(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.lastMailSent</code> attribute.
	 * @return the lastMailSent - This list holds all the email preferences that the user has selected
	 */
	public Date getLastMailSent()
	{
		return getLastMailSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.lastMailSent</code> attribute. 
	 * @param value the lastMailSent - This list holds all the email preferences that the user has selected
	 */
	public void setLastMailSent(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.lastMailSent</code> attribute. 
	 * @param value the lastMailSent - This list holds all the email preferences that the user has selected
	 */
	public void setLastMailSent(final Date value)
	{
		setLastMailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.lastShippedOrderMailSent</code> attribute.
	 * @return the lastShippedOrderMailSent - This holds the date for last shipped order email sent
	 */
	public Date getLastShippedOrderMailSent(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTSHIPPEDORDERMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.lastShippedOrderMailSent</code> attribute.
	 * @return the lastShippedOrderMailSent - This holds the date for last shipped order email sent
	 */
	public Date getLastShippedOrderMailSent()
	{
		return getLastShippedOrderMailSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.lastShippedOrderMailSent</code> attribute. 
	 * @param value the lastShippedOrderMailSent - This holds the date for last shipped order email sent
	 */
	public void setLastShippedOrderMailSent(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTSHIPPEDORDERMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.lastShippedOrderMailSent</code> attribute. 
	 * @param value the lastShippedOrderMailSent - This holds the date for last shipped order email sent
	 */
	public void setLastShippedOrderMailSent(final Date value)
	{
		setLastShippedOrderMailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute.
	 * @return the legalNoticeVersion
	 */
	public Long getLegalNoticeVersion(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, LEGALNOTICEVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute.
	 * @return the legalNoticeVersion
	 */
	public Long getLegalNoticeVersion()
	{
		return getLegalNoticeVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @return the legalNoticeVersion
	 */
	public long getLegalNoticeVersionAsPrimitive(final SessionContext ctx)
	{
		Long value = getLegalNoticeVersion( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @return the legalNoticeVersion
	 */
	public long getLegalNoticeVersionAsPrimitive()
	{
		return getLegalNoticeVersionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @param value the legalNoticeVersion
	 */
	public void setLegalNoticeVersion(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, LEGALNOTICEVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @param value the legalNoticeVersion
	 */
	public void setLegalNoticeVersion(final Long value)
	{
		setLegalNoticeVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @param value the legalNoticeVersion
	 */
	public void setLegalNoticeVersion(final SessionContext ctx, final long value)
	{
		setLegalNoticeVersion( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.legalNoticeVersion</code> attribute. 
	 * @param value the legalNoticeVersion
	 */
	public void setLegalNoticeVersion(final long value)
	{
		setLegalNoticeVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute.
	 * @return the mailSentForInterval
	 */
	public Integer getMailSentForInterval(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAILSENTFORINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute.
	 * @return the mailSentForInterval
	 */
	public Integer getMailSentForInterval()
	{
		return getMailSentForInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @return the mailSentForInterval
	 */
	public int getMailSentForIntervalAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMailSentForInterval( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @return the mailSentForInterval
	 */
	public int getMailSentForIntervalAsPrimitive()
	{
		return getMailSentForIntervalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @param value the mailSentForInterval
	 */
	public void setMailSentForInterval(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAILSENTFORINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @param value the mailSentForInterval
	 */
	public void setMailSentForInterval(final Integer value)
	{
		setMailSentForInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @param value the mailSentForInterval
	 */
	public void setMailSentForInterval(final SessionContext ctx, final int value)
	{
		setMailSentForInterval( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mailSentForInterval</code> attribute. 
	 * @param value the mailSentForInterval
	 */
	public void setMailSentForInterval(final int value)
	{
		setMailSentForInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mddSector</code> attribute.
	 * @return the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public Boolean isMddSector(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MDDSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mddSector</code> attribute.
	 * @return the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public Boolean isMddSector()
	{
		return isMddSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @return the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public boolean isMddSectorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMddSector( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @return the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public boolean isMddSectorAsPrimitive()
	{
		return isMddSectorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @param value the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public void setMddSector(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MDDSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @param value the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public void setMddSector(final Boolean value)
	{
		setMddSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @param value the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public void setMddSector(final SessionContext ctx, final boolean value)
	{
		setMddSector( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.mddSector</code> attribute. 
	 * @param value the mddSector - This flag holds true if the user is authorized for MDD Site
	 */
	public void setMddSector(final boolean value)
	{
		setMddSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.noCharge</code> attribute.
	 * @return the noCharge - This will holds No Charge Flag
	 */
	public Boolean isNoCharge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NOCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.noCharge</code> attribute.
	 * @return the noCharge - This will holds No Charge Flag
	 */
	public Boolean isNoCharge()
	{
		return isNoCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @return the noCharge - This will holds No Charge Flag
	 */
	public boolean isNoChargeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNoCharge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @return the noCharge - This will holds No Charge Flag
	 */
	public boolean isNoChargeAsPrimitive()
	{
		return isNoChargeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag
	 */
	public void setNoCharge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NOCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag
	 */
	public void setNoCharge(final Boolean value)
	{
		setNoCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag
	 */
	public void setNoCharge(final SessionContext ctx, final boolean value)
	{
		setNoCharge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.noCharge</code> attribute. 
	 * @param value the noCharge - This will holds No Charge Flag
	 */
	public void setNoCharge(final boolean value)
	{
		setNoCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.oldPasswords</code> attribute.
	 * @return the oldPasswords
	 */
	public Collection<OldPassword> getOldPasswords(final SessionContext ctx)
	{
		return OLDPASSWORDSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.oldPasswords</code> attribute.
	 * @return the oldPasswords
	 */
	public Collection<OldPassword> getOldPasswords()
	{
		return getOldPasswords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.oldPasswords</code> attribute. 
	 * @param value the oldPasswords
	 */
	public void setOldPasswords(final SessionContext ctx, final Collection<OldPassword> value)
	{
		OLDPASSWORDSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.oldPasswords</code> attribute. 
	 * @param value the oldPasswords
	 */
	public void setOldPasswords(final Collection<OldPassword> value)
	{
		setOldPasswords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to oldPasswords. 
	 * @param value the item to add to oldPasswords
	 */
	public void addToOldPasswords(final SessionContext ctx, final OldPassword value)
	{
		OLDPASSWORDSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to oldPasswords. 
	 * @param value the item to add to oldPasswords
	 */
	public void addToOldPasswords(final OldPassword value)
	{
		addToOldPasswords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from oldPasswords. 
	 * @param value the item to remove from oldPasswords
	 */
	public void removeFromOldPasswords(final SessionContext ctx, final OldPassword value)
	{
		OLDPASSWORDSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from oldPasswords. 
	 * @param value the item to remove from oldPasswords
	 */
	public void removeFromOldPasswords(final OldPassword value)
	{
		removeFromOldPasswords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.passwordChangeDate</code> attribute.
	 * @return the passwordChangeDate
	 */
	public Date getPasswordChangeDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PASSWORDCHANGEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.passwordChangeDate</code> attribute.
	 * @return the passwordChangeDate
	 */
	public Date getPasswordChangeDate()
	{
		return getPasswordChangeDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.passwordChangeDate</code> attribute. 
	 * @param value the passwordChangeDate
	 */
	public void setPasswordChangeDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PASSWORDCHANGEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.passwordChangeDate</code> attribute. 
	 * @param value the passwordChangeDate
	 */
	public void setPasswordChangeDate(final Date value)
	{
		setPasswordChangeDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.passwordExpireToken</code> attribute.
	 * @return the passwordExpireToken - This will hold true  user Password Token.
	 */
	public String getPasswordExpireToken(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORDEXPIRETOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.passwordExpireToken</code> attribute.
	 * @return the passwordExpireToken - This will hold true  user Password Token.
	 */
	public String getPasswordExpireToken()
	{
		return getPasswordExpireToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.passwordExpireToken</code> attribute. 
	 * @param value the passwordExpireToken - This will hold true  user Password Token.
	 */
	public void setPasswordExpireToken(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORDEXPIRETOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.passwordExpireToken</code> attribute. 
	 * @param value the passwordExpireToken - This will hold true  user Password Token.
	 */
	public void setPasswordExpireToken(final String value)
	{
		setPasswordExpireToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.pharmaSector</code> attribute.
	 * @return the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public Boolean isPharmaSector(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PHARMASECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.pharmaSector</code> attribute.
	 * @return the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public Boolean isPharmaSector()
	{
		return isPharmaSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @return the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public boolean isPharmaSectorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPharmaSector( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @return the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public boolean isPharmaSectorAsPrimitive()
	{
		return isPharmaSectorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @param value the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public void setPharmaSector(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PHARMASECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @param value the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public void setPharmaSector(final Boolean value)
	{
		setPharmaSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @param value the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public void setPharmaSector(final SessionContext ctx, final boolean value)
	{
		setPharmaSector( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.pharmaSector</code> attribute. 
	 * @param value the pharmaSector - This flag holds true if the user is authorized for Pharamaceutical Site
	 */
	public void setPharmaSector(final boolean value)
	{
		setPharmaSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.preferredMobileNumber</code> attribute.
	 * @return the preferredMobileNumber
	 */
	public String getPreferredMobileNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDMOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.preferredMobileNumber</code> attribute.
	 * @return the preferredMobileNumber
	 */
	public String getPreferredMobileNumber()
	{
		return getPreferredMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.preferredMobileNumber</code> attribute. 
	 * @param value the preferredMobileNumber
	 */
	public void setPreferredMobileNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDMOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.preferredMobileNumber</code> attribute. 
	 * @param value the preferredMobileNumber
	 */
	public void setPreferredMobileNumber(final String value)
	{
		setPreferredMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute.
	 * @return the privacyPolicyVersion
	 */
	public Long getPrivacyPolicyVersion(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, PRIVACYPOLICYVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute.
	 * @return the privacyPolicyVersion
	 */
	public Long getPrivacyPolicyVersion()
	{
		return getPrivacyPolicyVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @return the privacyPolicyVersion
	 */
	public long getPrivacyPolicyVersionAsPrimitive(final SessionContext ctx)
	{
		Long value = getPrivacyPolicyVersion( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @return the privacyPolicyVersion
	 */
	public long getPrivacyPolicyVersionAsPrimitive()
	{
		return getPrivacyPolicyVersionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @param value the privacyPolicyVersion
	 */
	public void setPrivacyPolicyVersion(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, PRIVACYPOLICYVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @param value the privacyPolicyVersion
	 */
	public void setPrivacyPolicyVersion(final Long value)
	{
		setPrivacyPolicyVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @param value the privacyPolicyVersion
	 */
	public void setPrivacyPolicyVersion(final SessionContext ctx, final long value)
	{
		setPrivacyPolicyVersion( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.privacyPolicyVersion</code> attribute. 
	 * @param value the privacyPolicyVersion
	 */
	public void setPrivacyPolicyVersion(final long value)
	{
		setPrivacyPolicyVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationDate</code> attribute.
	 * @return the registrationDate - This property holds the information of the Date of registration.
	 */
	public Date getRegistrationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REGISTRATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationDate</code> attribute.
	 * @return the registrationDate - This property holds the information of the Date of registration.
	 */
	public Date getRegistrationDate()
	{
		return getRegistrationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationDate</code> attribute. 
	 * @param value the registrationDate - This property holds the information of the Date of registration.
	 */
	public void setRegistrationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REGISTRATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationDate</code> attribute. 
	 * @param value the registrationDate - This property holds the information of the Date of registration.
	 */
	public void setRegistrationDate(final Date value)
	{
		setRegistrationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute.
	 * @return the registrationEmailSent
	 */
	public Boolean isRegistrationEmailSent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REGISTRATIONEMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute.
	 * @return the registrationEmailSent
	 */
	public Boolean isRegistrationEmailSent()
	{
		return isRegistrationEmailSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @return the registrationEmailSent
	 */
	public boolean isRegistrationEmailSentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRegistrationEmailSent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @return the registrationEmailSent
	 */
	public boolean isRegistrationEmailSentAsPrimitive()
	{
		return isRegistrationEmailSentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent
	 */
	public void setRegistrationEmailSent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REGISTRATIONEMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent
	 */
	public void setRegistrationEmailSent(final Boolean value)
	{
		setRegistrationEmailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent
	 */
	public void setRegistrationEmailSent(final SessionContext ctx, final boolean value)
	{
		setRegistrationEmailSent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent
	 */
	public void setRegistrationEmailSent(final boolean value)
	{
		setRegistrationEmailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute.
	 * @return the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public Boolean isRequestAccountIndicator(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REQUESTACCOUNTINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute.
	 * @return the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public Boolean isRequestAccountIndicator()
	{
		return isRequestAccountIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @return the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public boolean isRequestAccountIndicatorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRequestAccountIndicator( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @return the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public boolean isRequestAccountIndicatorAsPrimitive()
	{
		return isRequestAccountIndicatorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @param value the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public void setRequestAccountIndicator(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REQUESTACCOUNTINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @param value the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public void setRequestAccountIndicator(final Boolean value)
	{
		setRequestAccountIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @param value the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public void setRequestAccountIndicator(final SessionContext ctx, final boolean value)
	{
		setRequestAccountIndicator( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.requestAccountIndicator</code> attribute. 
	 * @param value the requestAccountIndicator - This attribute is used to check whether a PCM user has been created by a PCM CSR and an email needs to be send to them to reset password. Set To default True because it should be mandatory for a PCM user flow. Will not impact EPIC functionality.
	 */
	public void setRequestAccountIndicator(final boolean value)
	{
		setRequestAccountIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.resetPasswordUrl</code> attribute.
	 * @return the resetPasswordUrl - This will  indicate the url used by the User for resetting the password.
	 */
	public String getResetPasswordUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESETPASSWORDURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.resetPasswordUrl</code> attribute.
	 * @return the resetPasswordUrl - This will  indicate the url used by the User for resetting the password.
	 */
	public String getResetPasswordUrl()
	{
		return getResetPasswordUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.resetPasswordUrl</code> attribute. 
	 * @param value the resetPasswordUrl - This will  indicate the url used by the User for resetting the password.
	 */
	public void setResetPasswordUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESETPASSWORDURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.resetPasswordUrl</code> attribute. 
	 * @param value the resetPasswordUrl - This will  indicate the url used by the User for resetting the password.
	 */
	public void setResetPasswordUrl(final String value)
	{
		setResetPasswordUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.salesOrg</code> attribute.
	 * @return the salesOrg - This property holds SalesOrganization.
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.salesOrg</code> attribute.
	 * @return the salesOrg - This property holds SalesOrganization.
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg - This property holds SalesOrganization.
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg - This property holds SalesOrganization.
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.secretQuestionsAndAnswersList</code> attribute.
	 * @return the secretQuestionsAndAnswersList
	 */
	public List<SecretQuestionsAndAnswers> getSecretQuestionsAndAnswersList(final SessionContext ctx)
	{
		List<SecretQuestionsAndAnswers> coll = (List<SecretQuestionsAndAnswers>)getProperty( ctx, SECRETQUESTIONSANDANSWERSLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.secretQuestionsAndAnswersList</code> attribute.
	 * @return the secretQuestionsAndAnswersList
	 */
	public List<SecretQuestionsAndAnswers> getSecretQuestionsAndAnswersList()
	{
		return getSecretQuestionsAndAnswersList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.secretQuestionsAndAnswersList</code> attribute. 
	 * @param value the secretQuestionsAndAnswersList
	 */
	public void setSecretQuestionsAndAnswersList(final SessionContext ctx, final List<SecretQuestionsAndAnswers> value)
	{
		setProperty(ctx, SECRETQUESTIONSANDANSWERSLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.secretQuestionsAndAnswersList</code> attribute. 
	 * @param value the secretQuestionsAndAnswersList
	 */
	public void setSecretQuestionsAndAnswersList(final List<SecretQuestionsAndAnswers> value)
	{
		setSecretQuestionsAndAnswersList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute.
	 * @return the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public Boolean isSendActivationMail(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENDACTIVATIONMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute.
	 * @return the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public Boolean isSendActivationMail()
	{
		return isSendActivationMail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @return the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public boolean isSendActivationMailAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSendActivationMail( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @return the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public boolean isSendActivationMailAsPrimitive()
	{
		return isSendActivationMailAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @param value the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public void setSendActivationMail(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENDACTIVATIONMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @param value the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public void setSendActivationMail(final Boolean value)
	{
		setSendActivationMail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @param value the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public void setSendActivationMail(final SessionContext ctx, final boolean value)
	{
		setSendActivationMail( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sendActivationMail</code> attribute. 
	 * @param value the sendActivationMail - This will  indicate that the email has to be sent for the user.
	 */
	public void setSendActivationMail(final boolean value)
	{
		setSendActivationMail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.shippedOrderEmailType</code> attribute.
	 * @return the shippedOrderEmailType - This list holds all the email preferences that the user has selected
	 */
	public String getShippedOrderEmailType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPPEDORDEREMAILTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.shippedOrderEmailType</code> attribute.
	 * @return the shippedOrderEmailType - This list holds all the email preferences that the user has selected
	 */
	public String getShippedOrderEmailType()
	{
		return getShippedOrderEmailType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.shippedOrderEmailType</code> attribute. 
	 * @param value the shippedOrderEmailType - This list holds all the email preferences that the user has selected
	 */
	public void setShippedOrderEmailType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPPEDORDEREMAILTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.shippedOrderEmailType</code> attribute. 
	 * @param value the shippedOrderEmailType - This list holds all the email preferences that the user has selected
	 */
	public void setShippedOrderEmailType(final String value)
	{
		setShippedOrderEmailType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute.
	 * @return the showChangeAccount
	 */
	public Boolean isShowChangeAccount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWCHANGEACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute.
	 * @return the showChangeAccount
	 */
	public Boolean isShowChangeAccount()
	{
		return isShowChangeAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @return the showChangeAccount
	 */
	public boolean isShowChangeAccountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowChangeAccount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @return the showChangeAccount
	 */
	public boolean isShowChangeAccountAsPrimitive()
	{
		return isShowChangeAccountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @param value the showChangeAccount
	 */
	public void setShowChangeAccount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWCHANGEACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @param value the showChangeAccount
	 */
	public void setShowChangeAccount(final Boolean value)
	{
		setShowChangeAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @param value the showChangeAccount
	 */
	public void setShowChangeAccount(final SessionContext ctx, final boolean value)
	{
		setShowChangeAccount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.showChangeAccount</code> attribute. 
	 * @param value the showChangeAccount
	 */
	public void setShowChangeAccount(final boolean value)
	{
		setShowChangeAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.smsPreferences</code> attribute.
	 * @return the smsPreferences - This list holds all the sms preferences that the user has selected
	 */
	public List<String> getSmsPreferences(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, SMSPREFERENCES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.smsPreferences</code> attribute.
	 * @return the smsPreferences - This list holds all the sms preferences that the user has selected
	 */
	public List<String> getSmsPreferences()
	{
		return getSmsPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.smsPreferences</code> attribute. 
	 * @param value the smsPreferences - This list holds all the sms preferences that the user has selected
	 */
	public void setSmsPreferences(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, SMSPREFERENCES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.smsPreferences</code> attribute. 
	 * @param value the smsPreferences - This list holds all the sms preferences that the user has selected
	 */
	public void setSmsPreferences(final List<String> value)
	{
		setSmsPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId()
	{
		return getSourceId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final String value)
	{
		setSourceId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.ssoLogin</code> attribute.
	 * @return the ssoLogin
	 */
	public Boolean isSsoLogin(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SSOLOGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.ssoLogin</code> attribute.
	 * @return the ssoLogin
	 */
	public Boolean isSsoLogin()
	{
		return isSsoLogin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @return the ssoLogin
	 */
	public boolean isSsoLoginAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSsoLogin( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @return the ssoLogin
	 */
	public boolean isSsoLoginAsPrimitive()
	{
		return isSsoLoginAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @param value the ssoLogin
	 */
	public void setSsoLogin(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SSOLOGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @param value the ssoLogin
	 */
	public void setSsoLogin(final Boolean value)
	{
		setSsoLogin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @param value the ssoLogin
	 */
	public void setSsoLogin(final SessionContext ctx, final boolean value)
	{
		setSsoLogin( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.ssoLogin</code> attribute. 
	 * @param value the ssoLogin
	 */
	public void setSsoLogin(final boolean value)
	{
		setSsoLogin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.status</code> attribute.
	 * @return the status - This property holds the status of the User.
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.status</code> attribute.
	 * @return the status - This property holds the status of the User.
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.status</code> attribute. 
	 * @param value the status - This property holds the status of the User.
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.status</code> attribute. 
	 * @param value the status - This property holds the status of the User.
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorEmail</code> attribute.
	 * @return the superVisorEmail - This property holds email of the user's supervisor.
	 */
	public String getSuperVisorEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERVISOREMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorEmail</code> attribute.
	 * @return the superVisorEmail - This property holds email of the user's supervisor.
	 */
	public String getSuperVisorEmail()
	{
		return getSuperVisorEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorEmail</code> attribute. 
	 * @param value the superVisorEmail - This property holds email of the user's supervisor.
	 */
	public void setSuperVisorEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERVISOREMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorEmail</code> attribute. 
	 * @param value the superVisorEmail - This property holds email of the user's supervisor.
	 */
	public void setSuperVisorEmail(final String value)
	{
		setSuperVisorEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorName</code> attribute.
	 * @return the superVisorName - This property holds first name of the user's supervisor.
	 */
	public String getSuperVisorName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERVISORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorName</code> attribute.
	 * @return the superVisorName - This property holds first name of the user's supervisor.
	 */
	public String getSuperVisorName()
	{
		return getSuperVisorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorName</code> attribute. 
	 * @param value the superVisorName - This property holds first name of the user's supervisor.
	 */
	public void setSuperVisorName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERVISORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorName</code> attribute. 
	 * @param value the superVisorName - This property holds first name of the user's supervisor.
	 */
	public void setSuperVisorName(final String value)
	{
		setSuperVisorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorNumber</code> attribute.
	 * @return the superVisorNumber - This property holds company's name of the User.
	 */
	public String getSuperVisorNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERVISORNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.superVisorNumber</code> attribute.
	 * @return the superVisorNumber - This property holds company's name of the User.
	 */
	public String getSuperVisorNumber()
	{
		return getSuperVisorNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorNumber</code> attribute. 
	 * @param value the superVisorNumber - This property holds company's name of the User.
	 */
	public void setSuperVisorNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERVISORNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.superVisorNumber</code> attribute. 
	 * @param value the superVisorNumber - This property holds company's name of the User.
	 */
	public void setSuperVisorNumber(final String value)
	{
		setSuperVisorNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute.
	 * @return the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public Boolean isSurveyEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SURVEYENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute.
	 * @return the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public Boolean isSurveyEnabled()
	{
		return isSurveyEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @return the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public boolean isSurveyEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSurveyEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @return the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public boolean isSurveyEnabledAsPrimitive()
	{
		return isSurveyEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @param value the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public void setSurveyEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SURVEYENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @param value the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public void setSurveyEnabled(final Boolean value)
	{
		setSurveyEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @param value the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public void setSurveyEnabled(final SessionContext ctx, final boolean value)
	{
		setSurveyEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.surveyEnabled</code> attribute. 
	 * @param value the surveyEnabled - This will hold true if user is enabled for survey, else false.
	 */
	public void setSurveyEnabled(final boolean value)
	{
		setSurveyEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.territoryDiv</code> attribute.
	 * @return the territoryDiv - This will hold the value of the Territory divisions in the case of Jnj employee.
	 */
	public List<String> getTerritoryDiv(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, TERRITORYDIV);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.territoryDiv</code> attribute.
	 * @return the territoryDiv - This will hold the value of the Territory divisions in the case of Jnj employee.
	 */
	public List<String> getTerritoryDiv()
	{
		return getTerritoryDiv( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.territoryDiv</code> attribute. 
	 * @param value the territoryDiv - This will hold the value of the Territory divisions in the case of Jnj employee.
	 */
	public void setTerritoryDiv(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, TERRITORYDIV,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.territoryDiv</code> attribute. 
	 * @param value the territoryDiv - This will hold the value of the Territory divisions in the case of Jnj employee.
	 */
	public void setTerritoryDiv(final List<String> value)
	{
		setTerritoryDiv( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.unknownAccount</code> attribute.
	 * @return the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public Boolean isUnknownAccount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UNKNOWNACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.unknownAccount</code> attribute.
	 * @return the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public Boolean isUnknownAccount()
	{
		return isUnknownAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @return the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public boolean isUnknownAccountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUnknownAccount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @return the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public boolean isUnknownAccountAsPrimitive()
	{
		return isUnknownAccountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @param value the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public void setUnknownAccount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UNKNOWNACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @param value the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public void setUnknownAccount(final Boolean value)
	{
		setUnknownAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @param value the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public void setUnknownAccount(final SessionContext ctx, final boolean value)
	{
		setUnknownAccount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.unknownAccount</code> attribute. 
	 * @param value the unknownAccount - This will hold true / false based on user selecting the unknown account option.
	 */
	public void setUnknownAccount(final boolean value)
	{
		setUnknownAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.userType</code> attribute.
	 * @return the userType - This property holds the value of the type of User.
	 */
	public String getUserType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.userType</code> attribute.
	 * @return the userType - This property holds the value of the type of User.
	 */
	public String getUserType()
	{
		return getUserType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.userType</code> attribute. 
	 * @param value the userType - This property holds the value of the type of User.
	 */
	public void setUserType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.userType</code> attribute. 
	 * @param value the userType - This property holds the value of the type of User.
	 */
	public void setUserType(final String value)
	{
		setUserType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.wwid</code> attribute.
	 * @return the wwid - This property holds WWID of the User.
	 */
	public String getWwid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJB2bCustomer.wwid</code> attribute.
	 * @return the wwid - This property holds WWID of the User.
	 */
	public String getWwid()
	{
		return getWwid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.wwid</code> attribute. 
	 * @param value the wwid - This property holds WWID of the User.
	 */
	public void setWwid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJB2bCustomer.wwid</code> attribute. 
	 * @param value the wwid - This property holds WWID of the User.
	 */
	public void setWwid(final String value)
	{
		setWwid( getSession().getSessionContext(), value );
	}
	
}
