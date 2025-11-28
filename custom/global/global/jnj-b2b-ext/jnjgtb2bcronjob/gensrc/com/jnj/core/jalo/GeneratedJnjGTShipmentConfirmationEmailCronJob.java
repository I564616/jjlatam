/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnjGTShipmentConfirmationEmailCronJob JnjGTShipmentConfirmationEmailCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShipmentConfirmationEmailCronJob extends CronJob
{
	/** Qualifier of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute **/
	public static final String MAXEMAILATTEMPTS = "maxEmailAttempts";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MAXEMAILATTEMPTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute.
	 * @return the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public Integer getMaxEmailAttempts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXEMAILATTEMPTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute.
	 * @return the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public Integer getMaxEmailAttempts()
	{
		return getMaxEmailAttempts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @return the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public int getMaxEmailAttemptsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxEmailAttempts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @return the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public int getMaxEmailAttemptsAsPrimitive()
	{
		return getMaxEmailAttemptsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @param value the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public void setMaxEmailAttempts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXEMAILATTEMPTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @param value the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public void setMaxEmailAttempts(final Integer value)
	{
		setMaxEmailAttempts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @param value the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public void setMaxEmailAttempts(final SessionContext ctx, final int value)
	{
		setMaxEmailAttempts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailCronJob.maxEmailAttempts</code> attribute. 
	 * @param value the maxEmailAttempts - This parameter limits the number of attempts the cronjob will try to send the email
	 */
	public void setMaxEmailAttempts(final int value)
	{
		setMaxEmailAttempts( getSession().getSessionContext(), value );
	}
	
}
