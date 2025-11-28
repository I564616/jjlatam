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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess ContactUsProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedContactUsProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>ContactUsProcess.toEmailAddress</code> attribute **/
	public static final String TOEMAILADDRESS = "toEmailAddress";
	/** Qualifier of the <code>ContactUsProcess.emailBody</code> attribute **/
	public static final String EMAILBODY = "emailBody";
	/** Qualifier of the <code>ContactUsProcess.emailSubject</code> attribute **/
	public static final String EMAILSUBJECT = "emailSubject";
	/** Qualifier of the <code>ContactUsProcess.emailOrderId</code> attribute **/
	public static final String EMAILORDERID = "emailOrderId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TOEMAILADDRESS, AttributeMode.INITIAL);
		tmp.put(EMAILBODY, AttributeMode.INITIAL);
		tmp.put(EMAILSUBJECT, AttributeMode.INITIAL);
		tmp.put(EMAILORDERID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailBody</code> attribute.
	 * @return the emailBody
	 */
	public String getEmailBody(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILBODY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailBody</code> attribute.
	 * @return the emailBody
	 */
	public String getEmailBody()
	{
		return getEmailBody( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailBody</code> attribute. 
	 * @param value the emailBody
	 */
	public void setEmailBody(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILBODY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailBody</code> attribute. 
	 * @param value the emailBody
	 */
	public void setEmailBody(final String value)
	{
		setEmailBody( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailOrderId</code> attribute.
	 * @return the emailOrderId
	 */
	public String getEmailOrderId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailOrderId</code> attribute.
	 * @return the emailOrderId
	 */
	public String getEmailOrderId()
	{
		return getEmailOrderId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailOrderId</code> attribute. 
	 * @param value the emailOrderId
	 */
	public void setEmailOrderId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILORDERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailOrderId</code> attribute. 
	 * @param value the emailOrderId
	 */
	public void setEmailOrderId(final String value)
	{
		setEmailOrderId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailSubject</code> attribute.
	 * @return the emailSubject
	 */
	public String getEmailSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILSUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.emailSubject</code> attribute.
	 * @return the emailSubject
	 */
	public String getEmailSubject()
	{
		return getEmailSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailSubject</code> attribute. 
	 * @param value the emailSubject
	 */
	public void setEmailSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILSUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.emailSubject</code> attribute. 
	 * @param value the emailSubject
	 */
	public void setEmailSubject(final String value)
	{
		setEmailSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.toEmailAddress</code> attribute.
	 * @return the toEmailAddress
	 */
	public String getToEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOEMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactUsProcess.toEmailAddress</code> attribute.
	 * @return the toEmailAddress
	 */
	public String getToEmailAddress()
	{
		return getToEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.toEmailAddress</code> attribute. 
	 * @param value the toEmailAddress
	 */
	public void setToEmailAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOEMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactUsProcess.toEmailAddress</code> attribute. 
	 * @param value the toEmailAddress
	 */
	public void setToEmailAddress(final String value)
	{
		setToEmailAddress( getSession().getSessionContext(), value );
	}
	
}
