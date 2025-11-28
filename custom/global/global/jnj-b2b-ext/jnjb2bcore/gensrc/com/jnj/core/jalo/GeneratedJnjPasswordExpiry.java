/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjPasswordExpiry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPasswordExpiry extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjPasswordExpiry.emailID</code> attribute **/
	public static final String EMAILID = "emailID";
	/** Qualifier of the <code>JnjPasswordExpiry.portalName</code> attribute **/
	public static final String PORTALNAME = "portalName";
	/** Qualifier of the <code>JnjPasswordExpiry.logoUrl</code> attribute **/
	public static final String LOGOURL = "logoUrl";
	/** Qualifier of the <code>JnjPasswordExpiry.securityWindow</code> attribute **/
	public static final String SECURITYWINDOW = "securityWindow";
	/** Qualifier of the <code>JnjPasswordExpiry.daysBeforePasswordExpiry</code> attribute **/
	public static final String DAYSBEFOREPASSWORDEXPIRY = "daysBeforePasswordExpiry";
	/** Qualifier of the <code>JnjPasswordExpiry.userFirstName</code> attribute **/
	public static final String USERFIRSTNAME = "userFirstName";
	/** Qualifier of the <code>JnjPasswordExpiry.userLastName</code> attribute **/
	public static final String USERLASTNAME = "userLastName";
	/** Qualifier of the <code>JnjPasswordExpiry.customerName</code> attribute **/
	public static final String CUSTOMERNAME = "customerName";
	/** Qualifier of the <code>JnjPasswordExpiry.userRoles</code> attribute **/
	public static final String USERROLES = "userRoles";
	/** Qualifier of the <code>JnjPasswordExpiry.emailNotifications</code> attribute **/
	public static final String EMAILNOTIFICATIONS = "emailNotifications";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(PORTALNAME, AttributeMode.INITIAL);
		tmp.put(LOGOURL, AttributeMode.INITIAL);
		tmp.put(SECURITYWINDOW, AttributeMode.INITIAL);
		tmp.put(DAYSBEFOREPASSWORDEXPIRY, AttributeMode.INITIAL);
		tmp.put(USERFIRSTNAME, AttributeMode.INITIAL);
		tmp.put(USERLASTNAME, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNAME, AttributeMode.INITIAL);
		tmp.put(USERROLES, AttributeMode.INITIAL);
		tmp.put(EMAILNOTIFICATIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.customerName</code> attribute.
	 * @return the customerName - Attribute contains User Last Name.
	 */
	public String getCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.customerName</code> attribute.
	 * @return the customerName - Attribute contains User Last Name.
	 */
	public String getCustomerName()
	{
		return getCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.customerName</code> attribute. 
	 * @param value the customerName - Attribute contains User Last Name.
	 */
	public void setCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.customerName</code> attribute. 
	 * @param value the customerName - Attribute contains User Last Name.
	 */
	public void setCustomerName(final String value)
	{
		setCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.daysBeforePasswordExpiry</code> attribute.
	 * @return the daysBeforePasswordExpiry - Attribute contains the no of days before password expiration for which email is being sent.
	 */
	public String getDaysBeforePasswordExpiry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYSBEFOREPASSWORDEXPIRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.daysBeforePasswordExpiry</code> attribute.
	 * @return the daysBeforePasswordExpiry - Attribute contains the no of days before password expiration for which email is being sent.
	 */
	public String getDaysBeforePasswordExpiry()
	{
		return getDaysBeforePasswordExpiry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.daysBeforePasswordExpiry</code> attribute. 
	 * @param value the daysBeforePasswordExpiry - Attribute contains the no of days before password expiration for which email is being sent.
	 */
	public void setDaysBeforePasswordExpiry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYSBEFOREPASSWORDEXPIRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.daysBeforePasswordExpiry</code> attribute. 
	 * @param value the daysBeforePasswordExpiry - Attribute contains the no of days before password expiration for which email is being sent.
	 */
	public void setDaysBeforePasswordExpiry(final String value)
	{
		setDaysBeforePasswordExpiry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailID</code> attribute.
	 * @return the emailID - Attribute contains email id that is used in this process.
	 */
	public String getEmailID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailID</code> attribute.
	 * @return the emailID - Attribute contains email id that is used in this process.
	 */
	public String getEmailID()
	{
		return getEmailID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailID</code> attribute. 
	 * @param value the emailID - Attribute contains email id that is used in this process.
	 */
	public void setEmailID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailID</code> attribute. 
	 * @param value the emailID - Attribute contains email id that is used in this process.
	 */
	public void setEmailID(final String value)
	{
		setEmailID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute.
	 * @return the emailNotifications - Attribute contains email Notification.
	 */
	public Boolean isEmailNotifications(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILNOTIFICATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute.
	 * @return the emailNotifications - Attribute contains email Notification.
	 */
	public Boolean isEmailNotifications()
	{
		return isEmailNotifications( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @return the emailNotifications - Attribute contains email Notification.
	 */
	public boolean isEmailNotificationsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailNotifications( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @return the emailNotifications - Attribute contains email Notification.
	 */
	public boolean isEmailNotificationsAsPrimitive()
	{
		return isEmailNotificationsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @param value the emailNotifications - Attribute contains email Notification.
	 */
	public void setEmailNotifications(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILNOTIFICATIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @param value the emailNotifications - Attribute contains email Notification.
	 */
	public void setEmailNotifications(final Boolean value)
	{
		setEmailNotifications( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @param value the emailNotifications - Attribute contains email Notification.
	 */
	public void setEmailNotifications(final SessionContext ctx, final boolean value)
	{
		setEmailNotifications( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.emailNotifications</code> attribute. 
	 * @param value the emailNotifications - Attribute contains email Notification.
	 */
	public void setEmailNotifications(final boolean value)
	{
		setEmailNotifications( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.logoUrl</code> attribute.
	 * @return the logoUrl - Attribute contains portal logo url.
	 */
	public String getLogoUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGOURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.logoUrl</code> attribute.
	 * @return the logoUrl - Attribute contains portal logo url.
	 */
	public String getLogoUrl()
	{
		return getLogoUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.logoUrl</code> attribute. 
	 * @param value the logoUrl - Attribute contains portal logo url.
	 */
	public void setLogoUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGOURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.logoUrl</code> attribute. 
	 * @param value the logoUrl - Attribute contains portal logo url.
	 */
	public void setLogoUrl(final String value)
	{
		setLogoUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal Name.
	 */
	public String getPortalName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal Name.
	 */
	public String getPortalName()
	{
		return getPortalName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal Name.
	 */
	public void setPortalName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal Name.
	 */
	public void setPortalName(final String value)
	{
		setPortalName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.securityWindow</code> attribute.
	 * @return the securityWindow - Attribute contains the password expiry time interval.
	 */
	public String getSecurityWindow(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECURITYWINDOW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.securityWindow</code> attribute.
	 * @return the securityWindow - Attribute contains the password expiry time interval.
	 */
	public String getSecurityWindow()
	{
		return getSecurityWindow( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.securityWindow</code> attribute. 
	 * @param value the securityWindow - Attribute contains the password expiry time interval.
	 */
	public void setSecurityWindow(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECURITYWINDOW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.securityWindow</code> attribute. 
	 * @param value the securityWindow - Attribute contains the password expiry time interval.
	 */
	public void setSecurityWindow(final String value)
	{
		setSecurityWindow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userFirstName</code> attribute.
	 * @return the userFirstName - Attribute contains User First Name.
	 */
	public String getUserFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERFIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userFirstName</code> attribute.
	 * @return the userFirstName - Attribute contains User First Name.
	 */
	public String getUserFirstName()
	{
		return getUserFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userFirstName</code> attribute. 
	 * @param value the userFirstName - Attribute contains User First Name.
	 */
	public void setUserFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERFIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userFirstName</code> attribute. 
	 * @param value the userFirstName - Attribute contains User First Name.
	 */
	public void setUserFirstName(final String value)
	{
		setUserFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userLastName</code> attribute.
	 * @return the userLastName - Attribute contains User Last Name.
	 */
	public String getUserLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERLASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userLastName</code> attribute.
	 * @return the userLastName - Attribute contains User Last Name.
	 */
	public String getUserLastName()
	{
		return getUserLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userLastName</code> attribute. 
	 * @param value the userLastName - Attribute contains User Last Name.
	 */
	public void setUserLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERLASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userLastName</code> attribute. 
	 * @param value the userLastName - Attribute contains User Last Name.
	 */
	public void setUserLastName(final String value)
	{
		setUserLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userRoles</code> attribute.
	 * @return the userRoles - Attribute contains list of roles that is used in this process.
	 */
	public String getUserRoles(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERROLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPasswordExpiry.userRoles</code> attribute.
	 * @return the userRoles - Attribute contains list of roles that is used in this process.
	 */
	public String getUserRoles()
	{
		return getUserRoles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userRoles</code> attribute. 
	 * @param value the userRoles - Attribute contains list of roles that is used in this process.
	 */
	public void setUserRoles(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERROLES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPasswordExpiry.userRoles</code> attribute. 
	 * @param value the userRoles - Attribute contains list of roles that is used in this process.
	 */
	public void setUserRoles(final String value)
	{
		setUserRoles( getSession().getSessionContext(), value );
	}
	
}
