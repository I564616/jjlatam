/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.job;

import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.job.JnjGTUserResetPwdCronJob JnjGTUserResetPwdCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTUserResetPwdCronJob extends CronJob
{
	/** Qualifier of the <code>JnjGTUserResetPwdCronJob.resetPwdJobAction</code> attribute **/
	public static final String RESETPWDJOBACTION = "resetPwdJobAction";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RESETPWDJOBACTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserResetPwdCronJob.resetPwdJobAction</code> attribute.
	 * @return the resetPwdJobAction
	 */
	public EnumerationValue getResetPwdJobAction(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESETPWDJOBACTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTUserResetPwdCronJob.resetPwdJobAction</code> attribute.
	 * @return the resetPwdJobAction
	 */
	public EnumerationValue getResetPwdJobAction()
	{
		return getResetPwdJobAction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserResetPwdCronJob.resetPwdJobAction</code> attribute. 
	 * @param value the resetPwdJobAction
	 */
	public void setResetPwdJobAction(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESETPWDJOBACTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTUserResetPwdCronJob.resetPwdJobAction</code> attribute. 
	 * @param value the resetPwdJobAction
	 */
	public void setResetPwdJobAction(final EnumerationValue value)
	{
		setResetPwdJobAction( getSession().getSessionContext(), value );
	}
	
}
