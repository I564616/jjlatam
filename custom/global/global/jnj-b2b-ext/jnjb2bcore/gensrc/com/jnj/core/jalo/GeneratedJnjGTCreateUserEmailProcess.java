/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTCreateUserEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTCreateUserEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTCreateUserEmailProcess.jnjGTCreateUserEmailDetails</code> attribute **/
	public static final String JNJGTCREATEUSEREMAILDETAILS = "jnjGTCreateUserEmailDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTCREATEUSEREMAILDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreateUserEmailProcess.jnjGTCreateUserEmailDetails</code> attribute.
	 * @return the jnjGTCreateUserEmailDetails - This attribute contains fields of the user information requried for the email.
	 */
	public Map<String,String> getAllJnjGTCreateUserEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTCREATEUSEREMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreateUserEmailProcess.jnjGTCreateUserEmailDetails</code> attribute.
	 * @return the jnjGTCreateUserEmailDetails - This attribute contains fields of the user information requried for the email.
	 */
	public Map<String,String> getAllJnjGTCreateUserEmailDetails()
	{
		return getAllJnjGTCreateUserEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreateUserEmailProcess.jnjGTCreateUserEmailDetails</code> attribute. 
	 * @param value the jnjGTCreateUserEmailDetails - This attribute contains fields of the user information requried for the email.
	 */
	public void setAllJnjGTCreateUserEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTCREATEUSEREMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreateUserEmailProcess.jnjGTCreateUserEmailDetails</code> attribute. 
	 * @param value the jnjGTCreateUserEmailDetails - This attribute contains fields of the user information requried for the email.
	 */
	public void setAllJnjGTCreateUserEmailDetails(final Map<String,String> value)
	{
		setAllJnjGTCreateUserEmailDetails( getSession().getSessionContext(), value );
	}
	
}
