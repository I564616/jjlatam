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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTCutNotificationEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTCutNotificationEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTCutNotificationEmailProcess.jnjGTCutNotificationEmailDetails</code> attribute **/
	public static final String JNJGTCUTNOTIFICATIONEMAILDETAILS = "jnjGTCutNotificationEmailDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTCUTNOTIFICATIONEMAILDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCutNotificationEmailProcess.jnjGTCutNotificationEmailDetails</code> attribute.
	 * @return the jnjGTCutNotificationEmailDetails - This attribute contains fields requried for the cut notification email.
	 */
	public Map<String,String> getAllJnjGTCutNotificationEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTCUTNOTIFICATIONEMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCutNotificationEmailProcess.jnjGTCutNotificationEmailDetails</code> attribute.
	 * @return the jnjGTCutNotificationEmailDetails - This attribute contains fields requried for the cut notification email.
	 */
	public Map<String,String> getAllJnjGTCutNotificationEmailDetails()
	{
		return getAllJnjGTCutNotificationEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCutNotificationEmailProcess.jnjGTCutNotificationEmailDetails</code> attribute. 
	 * @param value the jnjGTCutNotificationEmailDetails - This attribute contains fields requried for the cut notification email.
	 */
	public void setAllJnjGTCutNotificationEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTCUTNOTIFICATIONEMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCutNotificationEmailProcess.jnjGTCutNotificationEmailDetails</code> attribute. 
	 * @param value the jnjGTCutNotificationEmailDetails - This attribute contains fields requried for the cut notification email.
	 */
	public void setAllJnjGTCutNotificationEmailDetails(final Map<String,String> value)
	{
		setAllJnjGTCutNotificationEmailDetails( getSession().getSessionContext(), value );
	}
	
}
