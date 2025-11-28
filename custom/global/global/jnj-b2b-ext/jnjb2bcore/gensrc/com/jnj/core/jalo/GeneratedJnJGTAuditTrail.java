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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTAuditTrail}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTAuditTrail extends GenericItem
{
	/** Qualifier of the <code>JnJGTAuditTrail.user</code> attribute **/
	public static final String USER = "user";
	/** Qualifier of the <code>JnJGTAuditTrail.systemOrProcess</code> attribute **/
	public static final String SYSTEMORPROCESS = "systemOrProcess";
	/** Qualifier of the <code>JnJGTAuditTrail.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>JnJGTAuditTrail.ipAddress</code> attribute **/
	public static final String IPADDRESS = "ipAddress";
	/** Qualifier of the <code>JnJGTAuditTrail.authorised</code> attribute **/
	public static final String AUTHORISED = "authorised";
	/** Qualifier of the <code>JnJGTAuditTrail.success</code> attribute **/
	public static final String SUCCESS = "success";
	/** Qualifier of the <code>JnJGTAuditTrail.dateTime</code> attribute **/
	public static final String DATETIME = "dateTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(USER, AttributeMode.INITIAL);
		tmp.put(SYSTEMORPROCESS, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(IPADDRESS, AttributeMode.INITIAL);
		tmp.put(AUTHORISED, AttributeMode.INITIAL);
		tmp.put(SUCCESS, AttributeMode.INITIAL);
		tmp.put(DATETIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.authorised</code> attribute.
	 * @return the authorised
	 */
	public Boolean isAuthorised(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTHORISED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.authorised</code> attribute.
	 * @return the authorised
	 */
	public Boolean isAuthorised()
	{
		return isAuthorised( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @return the authorised
	 */
	public boolean isAuthorisedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAuthorised( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @return the authorised
	 */
	public boolean isAuthorisedAsPrimitive()
	{
		return isAuthorisedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @param value the authorised
	 */
	public void setAuthorised(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTHORISED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @param value the authorised
	 */
	public void setAuthorised(final Boolean value)
	{
		setAuthorised( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @param value the authorised
	 */
	public void setAuthorised(final SessionContext ctx, final boolean value)
	{
		setAuthorised( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.authorised</code> attribute. 
	 * @param value the authorised
	 */
	public void setAuthorised(final boolean value)
	{
		setAuthorised( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.dateTime</code> attribute.
	 * @return the dateTime
	 */
	public Date getDateTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.dateTime</code> attribute.
	 * @return the dateTime
	 */
	public Date getDateTime()
	{
		return getDateTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.dateTime</code> attribute. 
	 * @param value the dateTime
	 */
	public void setDateTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.dateTime</code> attribute. 
	 * @param value the dateTime
	 */
	public void setDateTime(final Date value)
	{
		setDateTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.ipAddress</code> attribute.
	 * @return the ipAddress
	 */
	public String getIpAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IPADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.ipAddress</code> attribute.
	 * @return the ipAddress
	 */
	public String getIpAddress()
	{
		return getIpAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.ipAddress</code> attribute. 
	 * @param value the ipAddress
	 */
	public void setIpAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IPADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.ipAddress</code> attribute. 
	 * @param value the ipAddress
	 */
	public void setIpAddress(final String value)
	{
		setIpAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.success</code> attribute.
	 * @return the success
	 */
	public Boolean isSuccess(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUCCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.success</code> attribute.
	 * @return the success
	 */
	public Boolean isSuccess()
	{
		return isSuccess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @return the success
	 */
	public boolean isSuccessAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSuccess( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @return the success
	 */
	public boolean isSuccessAsPrimitive()
	{
		return isSuccessAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @param value the success
	 */
	public void setSuccess(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUCCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @param value the success
	 */
	public void setSuccess(final Boolean value)
	{
		setSuccess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @param value the success
	 */
	public void setSuccess(final SessionContext ctx, final boolean value)
	{
		setSuccess( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.success</code> attribute. 
	 * @param value the success
	 */
	public void setSuccess(final boolean value)
	{
		setSuccess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.systemOrProcess</code> attribute.
	 * @return the systemOrProcess
	 */
	public String getSystemOrProcess(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SYSTEMORPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.systemOrProcess</code> attribute.
	 * @return the systemOrProcess
	 */
	public String getSystemOrProcess()
	{
		return getSystemOrProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.systemOrProcess</code> attribute. 
	 * @param value the systemOrProcess
	 */
	public void setSystemOrProcess(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SYSTEMORPROCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.systemOrProcess</code> attribute. 
	 * @param value the systemOrProcess
	 */
	public void setSystemOrProcess(final String value)
	{
		setSystemOrProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.user</code> attribute.
	 * @return the user
	 */
	public String getUser(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTAuditTrail.user</code> attribute.
	 * @return the user
	 */
	public String getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTAuditTrail.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final String value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
}
