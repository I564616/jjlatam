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
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTSupervisorApprovalEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTSupervisorApprovalEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTSupervisorApprovalEmailProcess.jnjGTRegistrationDetails</code> attribute **/
	public static final String JNJGTREGISTRATIONDETAILS = "jnjGTRegistrationDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTREGISTRATIONDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSupervisorApprovalEmailProcess.jnjGTRegistrationDetails</code> attribute.
	 * @return the jnjGTRegistrationDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTRegistrationDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTREGISTRATIONDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSupervisorApprovalEmailProcess.jnjGTRegistrationDetails</code> attribute.
	 * @return the jnjGTRegistrationDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTRegistrationDetails()
	{
		return getAllJnjGTRegistrationDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSupervisorApprovalEmailProcess.jnjGTRegistrationDetails</code> attribute. 
	 * @param value the jnjGTRegistrationDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTRegistrationDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTREGISTRATIONDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSupervisorApprovalEmailProcess.jnjGTRegistrationDetails</code> attribute. 
	 * @param value the jnjGTRegistrationDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTRegistrationDetails(final Map<String,String> value)
	{
		setAllJnjGTRegistrationDetails( getSession().getSessionContext(), value );
	}
	
}
