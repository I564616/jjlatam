/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTRejectUserEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTRejectUserEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTRejectUserEmailProcess.jnjGTRejectUserEmailDetails</code> attribute **/
	public static final String JNJGTREJECTUSEREMAILDETAILS = "jnjGTRejectUserEmailDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTREJECTUSEREMAILDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTRejectUserEmailProcess.jnjGTRejectUserEmailDetails</code> attribute.
	 * @return the jnjGTRejectUserEmailDetails - This attribute contains fields of the registration emails for Reject user
	 */
	public Map<String,String> getAllJnjGTRejectUserEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTREJECTUSEREMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTRejectUserEmailProcess.jnjGTRejectUserEmailDetails</code> attribute.
	 * @return the jnjGTRejectUserEmailDetails - This attribute contains fields of the registration emails for Reject user
	 */
	public Map<String,String> getAllJnjGTRejectUserEmailDetails()
	{
		return getAllJnjGTRejectUserEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTRejectUserEmailProcess.jnjGTRejectUserEmailDetails</code> attribute. 
	 * @param value the jnjGTRejectUserEmailDetails - This attribute contains fields of the registration emails for Reject user
	 */
	public void setAllJnjGTRejectUserEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTREJECTUSEREMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTRejectUserEmailProcess.jnjGTRejectUserEmailDetails</code> attribute. 
	 * @param value the jnjGTRejectUserEmailDetails - This attribute contains fields of the registration emails for Reject user
	 */
	public void setAllJnjGTRejectUserEmailDetails(final Map<String,String> value)
	{
		setAllJnjGTRejectUserEmailDetails( getSession().getSessionContext(), value );
	}
	
}
