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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjReadOperationDashboard}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjReadOperationDashboard extends GenericItem
{
	/** Qualifier of the <code>JnjReadOperationDashboard.interfaceName</code> attribute **/
	public static final String INTERFACENAME = "interfaceName";
	/** Qualifier of the <code>JnjReadOperationDashboard.fileName</code> attribute **/
	public static final String FILENAME = "fileName";
	/** Qualifier of the <code>JnjReadOperationDashboard.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnjReadOperationDashboard.errorMessage</code> attribute **/
	public static final String ERRORMESSAGE = "errorMessage";
	/** Qualifier of the <code>JnjReadOperationDashboard.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute **/
	public static final String EMAILNOTIFICATIONSENT = "emailNotificationSent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INTERFACENAME, AttributeMode.INITIAL);
		tmp.put(FILENAME, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ERRORMESSAGE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(EMAILNOTIFICATIONSENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute.
	 * @return the emailNotificationSent
	 */
	public Boolean isEmailNotificationSent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILNOTIFICATIONSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute.
	 * @return the emailNotificationSent
	 */
	public Boolean isEmailNotificationSent()
	{
		return isEmailNotificationSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @return the emailNotificationSent
	 */
	public boolean isEmailNotificationSentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailNotificationSent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @return the emailNotificationSent
	 */
	public boolean isEmailNotificationSentAsPrimitive()
	{
		return isEmailNotificationSentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILNOTIFICATIONSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final Boolean value)
	{
		setEmailNotificationSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final SessionContext ctx, final boolean value)
	{
		setEmailNotificationSent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final boolean value)
	{
		setEmailNotificationSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.errorMessage</code> attribute.
	 * @return the errorMessage
	 */
	public String getErrorMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ERRORMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.errorMessage</code> attribute.
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return getErrorMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.errorMessage</code> attribute. 
	 * @param value the errorMessage
	 */
	public void setErrorMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ERRORMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.errorMessage</code> attribute. 
	 * @param value the errorMessage
	 */
	public void setErrorMessage(final String value)
	{
		setErrorMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName()
	{
		return getFileName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		setFileName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.interfaceName</code> attribute.
	 * @return the interfaceName
	 */
	public String getInterfaceName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERFACENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.interfaceName</code> attribute.
	 * @return the interfaceName
	 */
	public String getInterfaceName()
	{
		return getInterfaceName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.interfaceName</code> attribute. 
	 * @param value the interfaceName
	 */
	public void setInterfaceName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERFACENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.interfaceName</code> attribute. 
	 * @param value the interfaceName
	 */
	public void setInterfaceName(final String value)
	{
		setInterfaceName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjReadOperationDashboard.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjReadOperationDashboard.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
