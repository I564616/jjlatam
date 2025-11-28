/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMRequestAccountEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMRequestAccountEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMRequestAccountEmailProcess.jnjPCMRequestAccountDetails</code> attribute **/
	public static final String JNJPCMREQUESTACCOUNTDETAILS = "jnjPCMRequestAccountDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJPCMREQUESTACCOUNTDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMRequestAccountEmailProcess.jnjPCMRequestAccountDetails</code> attribute.
	 * @return the jnjPCMRequestAccountDetails - This attribute contains fields of the PCM registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjPCMRequestAccountDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJPCMREQUESTACCOUNTDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMRequestAccountEmailProcess.jnjPCMRequestAccountDetails</code> attribute.
	 * @return the jnjPCMRequestAccountDetails - This attribute contains fields of the PCM registration Form requried for the email.
	 */
	public Map<String,String> getAllJnjPCMRequestAccountDetails()
	{
		return getAllJnjPCMRequestAccountDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMRequestAccountEmailProcess.jnjPCMRequestAccountDetails</code> attribute. 
	 * @param value the jnjPCMRequestAccountDetails - This attribute contains fields of the PCM registration Form requried for the email.
	 */
	public void setAllJnjPCMRequestAccountDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJPCMREQUESTACCOUNTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMRequestAccountEmailProcess.jnjPCMRequestAccountDetails</code> attribute. 
	 * @param value the jnjPCMRequestAccountDetails - This attribute contains fields of the PCM registration Form requried for the email.
	 */
	public void setAllJnjPCMRequestAccountDetails(final Map<String,String> value)
	{
		setAllJnjPCMRequestAccountDetails( getSession().getSessionContext(), value );
	}
	
}
