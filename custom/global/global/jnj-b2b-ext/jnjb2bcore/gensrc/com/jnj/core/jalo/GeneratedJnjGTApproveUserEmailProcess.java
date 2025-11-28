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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTApproveUserEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTApproveUserEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTApproveUserEmailProcess.jnjGTApprovedUserEmailDetails</code> attribute **/
	public static final String JNJGTAPPROVEDUSEREMAILDETAILS = "jnjGTApprovedUserEmailDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTAPPROVEDUSEREMAILDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTApproveUserEmailProcess.jnjGTApprovedUserEmailDetails</code> attribute.
	 * @return the jnjGTApprovedUserEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTApprovedUserEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTAPPROVEDUSEREMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTApproveUserEmailProcess.jnjGTApprovedUserEmailDetails</code> attribute.
	 * @return the jnjGTApprovedUserEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTApprovedUserEmailDetails()
	{
		return getAllJnjGTApprovedUserEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTApproveUserEmailProcess.jnjGTApprovedUserEmailDetails</code> attribute. 
	 * @param value the jnjGTApprovedUserEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTApprovedUserEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTAPPROVEDUSEREMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTApproveUserEmailProcess.jnjGTApprovedUserEmailDetails</code> attribute. 
	 * @param value the jnjGTApprovedUserEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTApprovedUserEmailDetails(final Map<String,String> value)
	{
		setAllJnjGTApprovedUserEmailDetails( getSession().getSessionContext(), value );
	}
	
}
