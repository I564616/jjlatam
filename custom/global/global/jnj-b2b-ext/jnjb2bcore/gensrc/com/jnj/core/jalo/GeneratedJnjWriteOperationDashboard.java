/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjWriteOperationDashboard}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjWriteOperationDashboard extends GenericItem
{
	/** Qualifier of the <code>JnjWriteOperationDashboard.interfaceName</code> attribute **/
	public static final String INTERFACENAME = "interfaceName";
	/** Qualifier of the <code>JnjWriteOperationDashboard.fileName</code> attribute **/
	public static final String FILENAME = "fileName";
	/** Qualifier of the <code>JnjWriteOperationDashboard.idocNumber</code> attribute **/
	public static final String IDOCNUMBER = "idocNumber";
	/** Qualifier of the <code>JnjWriteOperationDashboard.errorMessage</code> attribute **/
	public static final String ERRORMESSAGE = "errorMessage";
	/** Qualifier of the <code>JnjWriteOperationDashboard.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute **/
	public static final String EMAILNOTIFICATIONSENT = "emailNotificationSent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INTERFACENAME, AttributeMode.INITIAL);
		tmp.put(FILENAME, AttributeMode.INITIAL);
		tmp.put(IDOCNUMBER, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute.
	 * @return the emailNotificationSent
	 */
	public Boolean isEmailNotificationSent(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILNOTIFICATIONSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute.
	 * @return the emailNotificationSent
	 */
	public Boolean isEmailNotificationSent()
	{
		return isEmailNotificationSent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @return the emailNotificationSent
	 */
	public boolean isEmailNotificationSentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailNotificationSent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @return the emailNotificationSent
	 */
	public boolean isEmailNotificationSentAsPrimitive()
	{
		return isEmailNotificationSentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILNOTIFICATIONSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final Boolean value)
	{
		setEmailNotificationSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final SessionContext ctx, final boolean value)
	{
		setEmailNotificationSent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.emailNotificationSent</code> attribute. 
	 * @param value the emailNotificationSent
	 */
	public void setEmailNotificationSent(final boolean value)
	{
		setEmailNotificationSent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.errorMessage</code> attribute.
	 * @return the errorMessage
	 */
	public String getErrorMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ERRORMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.errorMessage</code> attribute.
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return getErrorMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.errorMessage</code> attribute. 
	 * @param value the errorMessage
	 */
	public void setErrorMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ERRORMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.errorMessage</code> attribute. 
	 * @param value the errorMessage
	 */
	public void setErrorMessage(final String value)
	{
		setErrorMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName()
	{
		return getFileName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		setFileName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.idocNumber</code> attribute.
	 * @return the idocNumber
	 */
	public String getIdocNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IDOCNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.idocNumber</code> attribute.
	 * @return the idocNumber
	 */
	public String getIdocNumber()
	{
		return getIdocNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.idocNumber</code> attribute. 
	 * @param value the idocNumber
	 */
	public void setIdocNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IDOCNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.idocNumber</code> attribute. 
	 * @param value the idocNumber
	 */
	public void setIdocNumber(final String value)
	{
		setIdocNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.interfaceName</code> attribute.
	 * @return the interfaceName
	 */
	public String getInterfaceName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERFACENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjWriteOperationDashboard.interfaceName</code> attribute.
	 * @return the interfaceName
	 */
	public String getInterfaceName()
	{
		return getInterfaceName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.interfaceName</code> attribute. 
	 * @param value the interfaceName
	 */
	public void setInterfaceName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERFACENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjWriteOperationDashboard.interfaceName</code> attribute. 
	 * @param value the interfaceName
	 */
	public void setInterfaceName(final String value)
	{
		setInterfaceName( getSession().getSessionContext(), value );
	}
	
}
