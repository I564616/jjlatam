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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTAddExistingAccountEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTAddExistingAccountEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTAddExistingAccountEmailProcess.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>JnjGTAddExistingAccountEmailProcess.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjGTAddExistingAccountEmailProcess.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjGTAddExistingAccountEmailProcess.accountNumbers</code> attribute **/
	public static final String ACCOUNTNUMBERS = "accountNumbers";
	/** Qualifier of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute **/
	public static final String EMAILFLAG = "emailFlag";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(ACCOUNTNUMBERS, AttributeMode.INITIAL);
		tmp.put(EMAILFLAG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.accountNumbers</code> attribute.
	 * @return the accountNumbers
	 */
	public Collection<String> getAccountNumbers(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, ACCOUNTNUMBERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.accountNumbers</code> attribute.
	 * @return the accountNumbers
	 */
	public Collection<String> getAccountNumbers()
	{
		return getAccountNumbers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.accountNumbers</code> attribute. 
	 * @param value the accountNumbers
	 */
	public void setAccountNumbers(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, ACCOUNTNUMBERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.accountNumbers</code> attribute. 
	 * @param value the accountNumbers
	 */
	public void setAccountNumbers(final Collection<String> value)
	{
		setAccountNumbers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute.
	 * @return the emailFlag
	 */
	public Boolean isEmailFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute.
	 * @return the emailFlag
	 */
	public Boolean isEmailFlag()
	{
		return isEmailFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @return the emailFlag
	 */
	public boolean isEmailFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @return the emailFlag
	 */
	public boolean isEmailFlagAsPrimitive()
	{
		return isEmailFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @param value the emailFlag
	 */
	public void setEmailFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @param value the emailFlag
	 */
	public void setEmailFlag(final Boolean value)
	{
		setEmailFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @param value the emailFlag
	 */
	public void setEmailFlag(final SessionContext ctx, final boolean value)
	{
		setEmailFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.emailFlag</code> attribute. 
	 * @param value the emailFlag
	 */
	public void setEmailFlag(final boolean value)
	{
		setEmailFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddExistingAccountEmailProcess.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddExistingAccountEmailProcess.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
}
