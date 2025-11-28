/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob JnjOrderLineItemCancelEmailTiggerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjOrderLineItemCancelEmailTiggerCronJob extends CronJob
{
	/** Qualifier of the <code>JnjOrderLineItemCancelEmailTiggerCronJob.lastOrderLineItemCancelTime</code> attribute **/
	public static final String LASTORDERLINEITEMCANCELTIME = "lastOrderLineItemCancelTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTORDERLINEITEMCANCELTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderLineItemCancelEmailTiggerCronJob.lastOrderLineItemCancelTime</code> attribute.
	 * @return the lastOrderLineItemCancelTime - Last Order Lime item cancel time
	 */
	public Date getLastOrderLineItemCancelTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTORDERLINEITEMCANCELTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderLineItemCancelEmailTiggerCronJob.lastOrderLineItemCancelTime</code> attribute.
	 * @return the lastOrderLineItemCancelTime - Last Order Lime item cancel time
	 */
	public Date getLastOrderLineItemCancelTime()
	{
		return getLastOrderLineItemCancelTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderLineItemCancelEmailTiggerCronJob.lastOrderLineItemCancelTime</code> attribute. 
	 * @param value the lastOrderLineItemCancelTime - Last Order Lime item cancel time
	 */
	public void setLastOrderLineItemCancelTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTORDERLINEITEMCANCELTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderLineItemCancelEmailTiggerCronJob.lastOrderLineItemCancelTime</code> attribute. 
	 * @param value the lastOrderLineItemCancelTime - Last Order Lime item cancel time
	 */
	public void setLastOrderLineItemCancelTime(final Date value)
	{
		setLastOrderLineItemCancelTime( getSession().getSessionContext(), value );
	}
	
}
