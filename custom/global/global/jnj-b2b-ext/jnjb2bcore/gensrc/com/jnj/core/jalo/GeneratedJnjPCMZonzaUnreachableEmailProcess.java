/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMZonzaUnreachableEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMZonzaUnreachableEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMZonzaUnreachableEmailProcess.errorCode</code> attribute **/
	public static final String ERRORCODE = "errorCode";
	/** Qualifier of the <code>JnjPCMZonzaUnreachableEmailProcess.stackTrace</code> attribute **/
	public static final String STACKTRACE = "stackTrace";
	/** Qualifier of the <code>JnjPCMZonzaUnreachableEmailProcess.error</code> attribute **/
	public static final String ERROR = "error";
	/** Qualifier of the <code>JnjPCMZonzaUnreachableEmailProcess.reason</code> attribute **/
	public static final String REASON = "reason";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ERRORCODE, AttributeMode.INITIAL);
		tmp.put(STACKTRACE, AttributeMode.INITIAL);
		tmp.put(ERROR, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.error</code> attribute.
	 * @return the error - This attribute contains the error that occured.
	 */
	public String getError(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ERROR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.error</code> attribute.
	 * @return the error - This attribute contains the error that occured.
	 */
	public String getError()
	{
		return getError( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.error</code> attribute. 
	 * @param value the error - This attribute contains the error that occured.
	 */
	public void setError(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ERROR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.error</code> attribute. 
	 * @param value the error - This attribute contains the error that occured.
	 */
	public void setError(final String value)
	{
		setError( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.errorCode</code> attribute.
	 * @return the errorCode - This attribute contains the error code of the error that occured.
	 */
	public String getErrorCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ERRORCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.errorCode</code> attribute.
	 * @return the errorCode - This attribute contains the error code of the error that occured.
	 */
	public String getErrorCode()
	{
		return getErrorCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.errorCode</code> attribute. 
	 * @param value the errorCode - This attribute contains the error code of the error that occured.
	 */
	public void setErrorCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ERRORCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.errorCode</code> attribute. 
	 * @param value the errorCode - This attribute contains the error code of the error that occured.
	 */
	public void setErrorCode(final String value)
	{
		setErrorCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.reason</code> attribute.
	 * @return the reason - This attribute contains the reason for the error that occured.
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.reason</code> attribute.
	 * @return the reason - This attribute contains the reason for the error that occured.
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.reason</code> attribute. 
	 * @param value the reason - This attribute contains the reason for the error that occured.
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.reason</code> attribute. 
	 * @param value the reason - This attribute contains the reason for the error that occured.
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.stackTrace</code> attribute.
	 * @return the stackTrace - This attribute contains the stack trace of the error that occured.
	 */
	public String getStackTrace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STACKTRACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMZonzaUnreachableEmailProcess.stackTrace</code> attribute.
	 * @return the stackTrace - This attribute contains the stack trace of the error that occured.
	 */
	public String getStackTrace()
	{
		return getStackTrace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.stackTrace</code> attribute. 
	 * @param value the stackTrace - This attribute contains the stack trace of the error that occured.
	 */
	public void setStackTrace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STACKTRACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMZonzaUnreachableEmailProcess.stackTrace</code> attribute. 
	 * @param value the stackTrace - This attribute contains the stack trace of the error that occured.
	 */
	public void setStackTrace(final String value)
	{
		setStackTrace( getSession().getSessionContext(), value );
	}
	
}
