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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTProfilePasswordExpireEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTProfilePasswordExpireEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTProfilePasswordExpireEmailProcess.jnjGTPasswordExpireEmailDetails</code> attribute **/
	public static final String JNJGTPASSWORDEXPIREEMAILDETAILS = "jnjGTPasswordExpireEmailDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJGTPASSWORDEXPIREEMAILDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProfilePasswordExpireEmailProcess.jnjGTPasswordExpireEmailDetails</code> attribute.
	 * @return the jnjGTPasswordExpireEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTPasswordExpireEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJGTPASSWORDEXPIREEMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProfilePasswordExpireEmailProcess.jnjGTPasswordExpireEmailDetails</code> attribute.
	 * @return the jnjGTPasswordExpireEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjGTPasswordExpireEmailDetails()
	{
		return getAllJnjGTPasswordExpireEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProfilePasswordExpireEmailProcess.jnjGTPasswordExpireEmailDetails</code> attribute. 
	 * @param value the jnjGTPasswordExpireEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTPasswordExpireEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJGTPASSWORDEXPIREEMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProfilePasswordExpireEmailProcess.jnjGTPasswordExpireEmailDetails</code> attribute. 
	 * @param value the jnjGTPasswordExpireEmailDetails - This attribute contains fields of the registration Form requried for the email.
	 */
	public void setAllJnjGTPasswordExpireEmailDetails(final Map<String,String> value)
	{
		setAllJnjGTPasswordExpireEmailDetails( getSession().getSessionContext(), value );
	}
	
}
