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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjRegistrationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjRegistrationProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjRegistrationProcess.jnjCustomerFormMap</code> attribute **/
	public static final String JNJCUSTOMERFORMMAP = "jnjCustomerFormMap";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJCUSTOMERFORMMAP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjRegistrationProcess.jnjCustomerFormMap</code> attribute.
	 * @return the jnjCustomerFormMap - Attribute contains attributes of the Registered Customer  that is used in this process.
	 */
	public Map<String,Object> getAllJnjCustomerFormMap(final SessionContext ctx)
	{
		Map<String,Object> map = (Map<String,Object>)getProperty( ctx, JNJCUSTOMERFORMMAP);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjRegistrationProcess.jnjCustomerFormMap</code> attribute.
	 * @return the jnjCustomerFormMap - Attribute contains attributes of the Registered Customer  that is used in this process.
	 */
	public Map<String,Object> getAllJnjCustomerFormMap()
	{
		return getAllJnjCustomerFormMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjRegistrationProcess.jnjCustomerFormMap</code> attribute. 
	 * @param value the jnjCustomerFormMap - Attribute contains attributes of the Registered Customer  that is used in this process.
	 */
	public void setAllJnjCustomerFormMap(final SessionContext ctx, final Map<String,Object> value)
	{
		setProperty(ctx, JNJCUSTOMERFORMMAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjRegistrationProcess.jnjCustomerFormMap</code> attribute. 
	 * @param value the jnjCustomerFormMap - Attribute contains attributes of the Registered Customer  that is used in this process.
	 */
	public void setAllJnjCustomerFormMap(final Map<String,Object> value)
	{
		setAllJnjCustomerFormMap( getSession().getSessionContext(), value );
	}
	
}
