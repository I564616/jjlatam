/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.core.jalo;

import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.core.jalo.JnjInterfaceIntermediateCleanupCronJob JnjInterfaceIntermediateCleanupCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjInterfaceIntermediateCleanupCronJob extends CronJob
{
	/** Qualifier of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute **/
	public static final String RETENTION = "RETENTION";
	/** Qualifier of the <code>JnjInterfaceIntermediateCleanupCronJob.DATE_RETENTION</code> attribute **/
	public static final String DATE_RETENTION = "DATE_RETENTION";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RETENTION, AttributeMode.INITIAL);
		tmp.put(DATE_RETENTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.DATE_RETENTION</code> attribute.
	 * @return the DATE_RETENTION
	 */
	public Date getDATE_RETENTION(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE_RETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.DATE_RETENTION</code> attribute.
	 * @return the DATE_RETENTION
	 */
	public Date getDATE_RETENTION()
	{
		return getDATE_RETENTION( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.DATE_RETENTION</code> attribute. 
	 * @param value the DATE_RETENTION
	 */
	public void setDATE_RETENTION(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE_RETENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.DATE_RETENTION</code> attribute. 
	 * @param value the DATE_RETENTION
	 */
	public void setDATE_RETENTION(final Date value)
	{
		setDATE_RETENTION( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute.
	 * @return the RETENTION
	 */
	public Integer getRETENTION(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute.
	 * @return the RETENTION
	 */
	public Integer getRETENTION()
	{
		return getRETENTION( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @return the RETENTION
	 */
	public int getRETENTIONAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRETENTION( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @return the RETENTION
	 */
	public int getRETENTIONAsPrimitive()
	{
		return getRETENTIONAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @param value the RETENTION
	 */
	public void setRETENTION(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @param value the RETENTION
	 */
	public void setRETENTION(final Integer value)
	{
		setRETENTION( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @param value the RETENTION
	 */
	public void setRETENTION(final SessionContext ctx, final int value)
	{
		setRETENTION( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceIntermediateCleanupCronJob.RETENTION</code> attribute. 
	 * @param value the RETENTION
	 */
	public void setRETENTION(final int value)
	{
		setRETENTION( getSession().getSessionContext(), value );
	}
	
}
