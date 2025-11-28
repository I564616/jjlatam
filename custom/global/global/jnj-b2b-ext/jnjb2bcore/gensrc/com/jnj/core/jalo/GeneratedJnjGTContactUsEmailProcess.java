/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTContactUsEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTContactUsEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.logoURL</code> attribute **/
	public static final String LOGOURL = "logoURL";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.portalName</code> attribute **/
	public static final String PORTALNAME = "portalName";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.userName</code> attribute **/
	public static final String USERNAME = "userName";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.toEmailID</code> attribute **/
	public static final String TOEMAILID = "toEmailID";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.fromEmailID</code> attribute **/
	public static final String FROMEMAILID = "fromEmailID";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.emailSubject</code> attribute **/
	public static final String EMAILSUBJECT = "emailSubject";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute **/
	public static final String DETAILISSUE = "detailIssue";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.orderID</code> attribute **/
	public static final String ORDERID = "orderID";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.productID</code> attribute **/
	public static final String PRODUCTID = "productID";
	/** Qualifier of the <code>JnjGTContactUsEmailProcess.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOGOURL, AttributeMode.INITIAL);
		tmp.put(PORTALNAME, AttributeMode.INITIAL);
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(TOEMAILID, AttributeMode.INITIAL);
		tmp.put(FROMEMAILID, AttributeMode.INITIAL);
		tmp.put(EMAILSUBJECT, AttributeMode.INITIAL);
		tmp.put(DETAILISSUE, AttributeMode.INITIAL);
		tmp.put(ORDERID, AttributeMode.INITIAL);
		tmp.put(PRODUCTID, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.contactNumber</code> attribute.
	 * @return the contactNumber - Attribute contains phome number of the user.
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.contactNumber</code> attribute.
	 * @return the contactNumber - Attribute contains phome number of the user.
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.contactNumber</code> attribute. 
	 * @param value the contactNumber - Attribute contains phome number of the user.
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.contactNumber</code> attribute. 
	 * @param value the contactNumber - Attribute contains phome number of the user.
	 */
	public void setContactNumber(final String value)
	{
		setContactNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute.
	 * @return the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public String getDetailIssue(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjGTContactUsEmailProcess.getDetailIssue requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DETAILISSUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute.
	 * @return the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public String getDetailIssue()
	{
		return getDetailIssue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @return the localized detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public Map<Language,String> getAllDetailIssue(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DETAILISSUE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @return the localized detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public Map<Language,String> getAllDetailIssue()
	{
		return getAllDetailIssue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @param value the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public void setDetailIssue(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjGTContactUsEmailProcess.setDetailIssue requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DETAILISSUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @param value the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public void setDetailIssue(final String value)
	{
		setDetailIssue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @param value the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public void setAllDetailIssue(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DETAILISSUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.detailIssue</code> attribute. 
	 * @param value the detailIssue - Attribute contains details of the issue which customer has entered.
	 */
	public void setAllDetailIssue(final Map<Language,String> value)
	{
		setAllDetailIssue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.emailSubject</code> attribute.
	 * @return the emailSubject - Attribute contains subject of email that is used in this process.
	 */
	public String getEmailSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILSUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.emailSubject</code> attribute.
	 * @return the emailSubject - Attribute contains subject of email that is used in this process.
	 */
	public String getEmailSubject()
	{
		return getEmailSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.emailSubject</code> attribute. 
	 * @param value the emailSubject - Attribute contains subject of email that is used in this process.
	 */
	public void setEmailSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILSUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.emailSubject</code> attribute. 
	 * @param value the emailSubject - Attribute contains subject of email that is used in this process.
	 */
	public void setEmailSubject(final String value)
	{
		setEmailSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.fromEmailID</code> attribute.
	 * @return the fromEmailID - Attribute contains fromEmail id that is used in this process.
	 */
	public String getFromEmailID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMEMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.fromEmailID</code> attribute.
	 * @return the fromEmailID - Attribute contains fromEmail id that is used in this process.
	 */
	public String getFromEmailID()
	{
		return getFromEmailID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.fromEmailID</code> attribute. 
	 * @param value the fromEmailID - Attribute contains fromEmail id that is used in this process.
	 */
	public void setFromEmailID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMEMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.fromEmailID</code> attribute. 
	 * @param value the fromEmailID - Attribute contains fromEmail id that is used in this process.
	 */
	public void setFromEmailID(final String value)
	{
		setFromEmailID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.logoURL</code> attribute.
	 * @return the logoURL - Attribute contains URL of JnJ logo.
	 */
	public String getLogoURL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGOURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.logoURL</code> attribute.
	 * @return the logoURL - Attribute contains URL of JnJ logo.
	 */
	public String getLogoURL()
	{
		return getLogoURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.logoURL</code> attribute. 
	 * @param value the logoURL - Attribute contains URL of JnJ logo.
	 */
	public void setLogoURL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGOURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.logoURL</code> attribute. 
	 * @param value the logoURL - Attribute contains URL of JnJ logo.
	 */
	public void setLogoURL(final String value)
	{
		setLogoURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.orderID</code> attribute.
	 * @return the orderID - Attribute contains order id that is used in this process.
	 */
	public String getOrderID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.orderID</code> attribute.
	 * @return the orderID - Attribute contains order id that is used in this process.
	 */
	public String getOrderID()
	{
		return getOrderID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.orderID</code> attribute. 
	 * @param value the orderID - Attribute contains order id that is used in this process.
	 */
	public void setOrderID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.orderID</code> attribute. 
	 * @param value the orderID - Attribute contains order id that is used in this process.
	 */
	public void setOrderID(final String value)
	{
		setOrderID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal name.
	 */
	public String getPortalName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.portalName</code> attribute.
	 * @return the portalName - Attribute contains portal name.
	 */
	public String getPortalName()
	{
		return getPortalName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal name.
	 */
	public void setPortalName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.portalName</code> attribute. 
	 * @param value the portalName - Attribute contains portal name.
	 */
	public void setPortalName(final String value)
	{
		setPortalName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.productID</code> attribute.
	 * @return the productID - Attribute contains product id that is used in this process.
	 */
	public String getProductID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.productID</code> attribute.
	 * @return the productID - Attribute contains product id that is used in this process.
	 */
	public String getProductID()
	{
		return getProductID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.productID</code> attribute. 
	 * @param value the productID - Attribute contains product id that is used in this process.
	 */
	public void setProductID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.productID</code> attribute. 
	 * @param value the productID - Attribute contains product id that is used in this process.
	 */
	public void setProductID(final String value)
	{
		setProductID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.toEmailID</code> attribute.
	 * @return the toEmailID - Attribute contains toEmail id that is used in this process.
	 */
	public String getToEmailID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOEMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.toEmailID</code> attribute.
	 * @return the toEmailID - Attribute contains toEmail id that is used in this process.
	 */
	public String getToEmailID()
	{
		return getToEmailID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.toEmailID</code> attribute. 
	 * @param value the toEmailID - Attribute contains toEmail id that is used in this process.
	 */
	public void setToEmailID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOEMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.toEmailID</code> attribute. 
	 * @param value the toEmailID - Attribute contains toEmail id that is used in this process.
	 */
	public void setToEmailID(final String value)
	{
		setToEmailID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.userName</code> attribute.
	 * @return the userName - Attribute contains name of consumer.
	 */
	public String getUserName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTContactUsEmailProcess.userName</code> attribute.
	 * @return the userName - Attribute contains name of consumer.
	 */
	public String getUserName()
	{
		return getUserName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.userName</code> attribute. 
	 * @param value the userName - Attribute contains name of consumer.
	 */
	public void setUserName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTContactUsEmailProcess.userName</code> attribute. 
	 * @param value the userName - Attribute contains name of consumer.
	 */
	public void setUserName(final String value)
	{
		setUserName( getSession().getSessionContext(), value );
	}
	
}
