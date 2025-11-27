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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTUserDisableLoginEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTUserDisableLoginEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute **/
	public static final String DAYSBEFOREDISABLE = "daysBeforeDisable";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DAYSBEFOREDISABLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute.
	 * @return the daysBeforeDisable
	 */
	public Integer getDaysBeforeDisable(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAYSBEFOREDISABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute.
	 * @return the daysBeforeDisable
	 */
	public Integer getDaysBeforeDisable()
	{
		return getDaysBeforeDisable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @return the daysBeforeDisable
	 */
	public int getDaysBeforeDisableAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDaysBeforeDisable( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @return the daysBeforeDisable
	 */
	public int getDaysBeforeDisableAsPrimitive()
	{
		return getDaysBeforeDisableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @param value the daysBeforeDisable
	 */
	public void setDaysBeforeDisable(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAYSBEFOREDISABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @param value the daysBeforeDisable
	 */
	public void setDaysBeforeDisable(final Integer value)
	{
		setDaysBeforeDisable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @param value the daysBeforeDisable
	 */
	public void setDaysBeforeDisable(final SessionContext ctx, final int value)
	{
		setDaysBeforeDisable( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserDisableLoginEmailProcess.daysBeforeDisable</code> attribute. 
	 * @param value the daysBeforeDisable
	 */
	public void setDaysBeforeDisable(final int value)
	{
		setDaysBeforeDisable( getSession().getSessionContext(), value );
	}
	
}
