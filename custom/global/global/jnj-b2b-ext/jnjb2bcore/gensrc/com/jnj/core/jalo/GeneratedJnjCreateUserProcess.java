/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjCreateUserProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjCreateUserProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjCreateUserProcess.password</code> attribute **/
	public static final String PASSWORD = "password";
	/** Qualifier of the <code>JnjCreateUserProcess.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjCreateUserProcess.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjCreateUserProcess.emailID</code> attribute **/
	public static final String EMAILID = "emailID";
	/** Qualifier of the <code>JnjCreateUserProcess.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>JnjCreateUserProcess.mobile</code> attribute **/
	public static final String MOBILE = "mobile";
	/** Qualifier of the <code>JnjCreateUserProcess.roles</code> attribute **/
	public static final String ROLES = "roles";
	/** Qualifier of the <code>JnjCreateUserProcess.rolesLength</code> attribute **/
	public static final String ROLESLENGTH = "rolesLength";
	/** Qualifier of the <code>JnjCreateUserProcess.emailNotification</code> attribute **/
	public static final String EMAILNOTIFICATION = "emailNotification";
	/** Qualifier of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute **/
	public static final String REGISTRATIONEMAILSENT = "registrationEmailSent";
	/** Qualifier of the <code>JnjCreateUserProcess.portalName</code> attribute **/
	public static final String PORTALNAME = "portalName";
	/** Qualifier of the <code>JnjCreateUserProcess.adminUser</code> attribute **/
	public static final String ADMINUSER = "adminUser";
	/** Qualifier of the <code>JnjCreateUserProcess.loginUrl</code> attribute **/
	public static final String LOGINURL = "loginUrl";
	/** Qualifier of the <code>JnjCreateUserProcess.logoUrl</code> attribute **/
	public static final String LOGOURL = "logoUrl";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSWORD, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(MOBILE, AttributeMode.INITIAL);
		tmp.put(ROLES, AttributeMode.INITIAL);
		tmp.put(ROLESLENGTH, AttributeMode.INITIAL);
		tmp.put(EMAILNOTIFICATION, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONEMAILSENT, AttributeMode.INITIAL);
		tmp.put(PORTALNAME, AttributeMode.INITIAL);
		tmp.put(ADMINUSER, AttributeMode.INITIAL);
		tmp.put(LOGINURL, AttributeMode.INITIAL);
		tmp.put(LOGOURL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.adminUser</code> attribute.
	 * @return the adminUser - Attribute contains userAdmin.
	 */
	public String getAdminUser(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADMINUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.adminUser</code> attribute.
	 * @return the adminUser - Attribute contains userAdmin.
	 */
	public String getAdminUser()
	{
		return getAdminUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.adminUser</code> attribute. 
	 * @param value the adminUser - Attribute contains userAdmin.
	 */
	public void setAdminUser(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADMINUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.adminUser</code> attribute. 
	 * @param value the adminUser - Attribute contains userAdmin.
	 */
	public void setAdminUser(final String value)
	{
		setAdminUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.emailID</code> attribute.
	 * @return the emailID - Attribute contains email id that is used in this process.
	 */
	public String getEmailID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.emailID</code> attribute.
	 * @return the emailID - Attribute contains email id that is used in this process.
	 */
	public String getEmailID()
	{
		return getEmailID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.emailID</code> attribute. 
	 * @param value the emailID - Attribute contains email id that is used in this process.
	 */
	public void setEmailID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.emailID</code> attribute. 
	 * @param value the emailID - Attribute contains email id that is used in this process.
	 */
	public void setEmailID(final String value)
	{
		setEmailID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.emailNotification</code> attribute.
	 * @return the emailNotification - Attribute contains email Notification that is used in this process.
	 */
	public String getEmailNotification(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILNOTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.emailNotification</code> attribute.
	 * @return the emailNotification - Attribute contains email Notification that is used in this process.
	 */
	public String getEmailNotification()
	{
		return getEmailNotification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.emailNotification</code> attribute. 
	 * @param value the emailNotification - Attribute contains email Notification that is used in this process.
	 */
	public void setEmailNotification(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILNOTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.emailNotification</code> attribute. 
	 * @param value the emailNotification - Attribute contains email Notification that is used in this process.
	 */
	public void setEmailNotification(final String value)
	{
		setEmailNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.firstName</code> attribute.
	 * @return the firstName - Attribute contains first name that is used in this process.
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.firstName</code> attribute.
	 * @return the firstName - Attribute contains first name that is used in this process.
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.firstName</code> attribute. 
	 * @param value the firstName - Attribute contains first name that is used in this process.
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.firstName</code> attribute. 
	 * @param value the firstName - Attribute contains first name that is used in this process.
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.lastName</code> attribute.
	 * @return the lastName - Attribute contains last name that is used in this process.
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.lastName</code> attribute.
	 * @return the lastName - Attribute contains last name that is used in this process.
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.lastName</code> attribute. 
	 * @param value the lastName - Attribute contains last name that is used in this process.
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.lastName</code> attribute. 
	 * @param value the lastName - Attribute contains last name that is used in this process.
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.loginUrl</code> attribute.
	 * @return the loginUrl - Attribute contains portal login url.
	 */
	public String getLoginUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGINURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.loginUrl</code> attribute.
	 * @return the loginUrl - Attribute contains portal login url.
	 */
	public String getLoginUrl()
	{
		return getLoginUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.loginUrl</code> attribute. 
	 * @param value the loginUrl - Attribute contains portal login url.
	 */
	public void setLoginUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGINURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.loginUrl</code> attribute. 
	 * @param value the loginUrl - Attribute contains portal login url.
	 */
	public void setLoginUrl(final String value)
	{
		setLoginUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.logoUrl</code> attribute.
	 * @return the logoUrl - Attribute contains portal logo url.
	 */
	public String getLogoUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGOURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.logoUrl</code> attribute.
	 * @return the logoUrl - Attribute contains portal logo url.
	 */
	public String getLogoUrl()
	{
		return getLogoUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.logoUrl</code> attribute. 
	 * @param value the logoUrl - Attribute contains portal logo url.
	 */
	public void setLogoUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGOURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.logoUrl</code> attribute. 
	 * @param value the logoUrl - Attribute contains portal logo url.
	 */
	public void setLogoUrl(final String value)
	{
		setLogoUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.mobile</code> attribute.
	 * @return the mobile - Attribute contains monile number that is used in this process.
	 */
	public String getMobile(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.mobile</code> attribute.
	 * @return the mobile - Attribute contains monile number that is used in this process.
	 */
	public String getMobile()
	{
		return getMobile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.mobile</code> attribute. 
	 * @param value the mobile - Attribute contains monile number that is used in this process.
	 */
	public void setMobile(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.mobile</code> attribute. 
	 * @param value the mobile - Attribute contains monile number that is used in this process.
	 */
	public void setMobile(final String value)
	{
		setMobile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.password</code> attribute.
	 * @return the password - Attribute contains password that is used in this process.
	 */
	public String getPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.password</code> attribute.
	 * @return the password - Attribute contains password that is used in this process.
	 */
	public String getPassword()
	{
		return getPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.password</code> attribute. 
	 * @param value the password - Attribute contains password that is used in this process.
	 */
	public void setPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.password</code> attribute. 
	 * @param value the password - Attribute contains password that is used in this process.
	 */
	public void setPassword(final String value)
	{
		setPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.phone</code> attribute.
	 * @return the phone - Attribute contains phone number that is used in this process.
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.phone</code> attribute.
	 * @return the phone - Attribute contains phone number that is used in this process.
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.phone</code> attribute. 
	 * @param value the phone - Attribute contains phone number that is used in this process.
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.phone</code> attribute. 
	 * @param value the phone - Attribute contains phone number that is used in this process.
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal Name.
	 */
	public String getPortalName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal Name.
	 */
	public String getPortalName()
	{
		return getPortalName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal Name.
	 */
	public void setPortalName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal Name.
	 */
	public void setPortalName(final String value)
	{
		setPortalName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute.
	 * @return the registrationEmailSent - Attribute contains registration Email flag
	 */
	public Boolean isRegistrationEmailSent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REGISTRATIONEMAILSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute.
	 * @return the registrationEmailSent - Attribute contains registration Email flag
	 */
	public Boolean isRegistrationEmailSent()
	{
		return isRegistrationEmailSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @return the registrationEmailSent - Attribute contains registration Email flag
	 */
	public boolean isRegistrationEmailSentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRegistrationEmailSent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @return the registrationEmailSent - Attribute contains registration Email flag
	 */
	public boolean isRegistrationEmailSentAsPrimitive()
	{
		return isRegistrationEmailSentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent - Attribute contains registration Email flag
	 */
	public void setRegistrationEmailSent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REGISTRATIONEMAILSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent - Attribute contains registration Email flag
	 */
	public void setRegistrationEmailSent(final Boolean value)
	{
		setRegistrationEmailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent - Attribute contains registration Email flag
	 */
	public void setRegistrationEmailSent(final SessionContext ctx, final boolean value)
	{
		setRegistrationEmailSent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.registrationEmailSent</code> attribute. 
	 * @param value the registrationEmailSent - Attribute contains registration Email flag
	 */
	public void setRegistrationEmailSent(final boolean value)
	{
		setRegistrationEmailSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.roles</code> attribute.
	 * @return the roles - Attribute contains list of roles that is used in this process.
	 */
	public List<String> getRoles(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, ROLES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.roles</code> attribute.
	 * @return the roles - Attribute contains list of roles that is used in this process.
	 */
	public List<String> getRoles()
	{
		return getRoles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.roles</code> attribute. 
	 * @param value the roles - Attribute contains list of roles that is used in this process.
	 */
	public void setRoles(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, ROLES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.roles</code> attribute. 
	 * @param value the roles - Attribute contains list of roles that is used in this process.
	 */
	public void setRoles(final List<String> value)
	{
		setRoles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.rolesLength</code> attribute.
	 * @return the rolesLength - Attribute contains length of list of roles that is used in this process.
	 */
	public String getRolesLength(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROLESLENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjCreateUserProcess.rolesLength</code> attribute.
	 * @return the rolesLength - Attribute contains length of list of roles that is used in this process.
	 */
	public String getRolesLength()
	{
		return getRolesLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.rolesLength</code> attribute. 
	 * @param value the rolesLength - Attribute contains length of list of roles that is used in this process.
	 */
	public void setRolesLength(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROLESLENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjCreateUserProcess.rolesLength</code> attribute. 
	 * @param value the rolesLength - Attribute contains length of list of roles that is used in this process.
	 */
	public void setRolesLength(final String value)
	{
		setRolesLength( getSession().getSessionContext(), value );
	}
	
}
