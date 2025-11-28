/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjIntegrationCronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnjIntegrationRSACronJob JnjIntegrationRSACronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjIntegrationRSACronJob extends JnjIntegrationCronJob
{
	/** Qualifier of the <code>JnjIntegrationRSACronJob.lastSuccessFulRecordProcessTime</code> attribute **/
	public static final String LASTSUCCESSFULRECORDPROCESSTIME = "lastSuccessFulRecordProcessTime";
	/** Qualifier of the <code>JnjIntegrationRSACronJob.businessSectors</code> attribute **/
	public static final String BUSINESSSECTORS = "businessSectors";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjIntegrationCronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTSUCCESSFULRECORDPROCESSTIME, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTORS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationRSACronJob.businessSectors</code> attribute.
	 * @return the businessSectors
	 */
	public Set<String> getBusinessSectors(final SessionContext ctx)
	{
		Set<String> coll = (Set<String>)getProperty( ctx, BUSINESSSECTORS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationRSACronJob.businessSectors</code> attribute.
	 * @return the businessSectors
	 */
	public Set<String> getBusinessSectors()
	{
		return getBusinessSectors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationRSACronJob.businessSectors</code> attribute. 
	 * @param value the businessSectors
	 */
	public void setBusinessSectors(final SessionContext ctx, final Set<String> value)
	{
		setProperty(ctx, BUSINESSSECTORS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationRSACronJob.businessSectors</code> attribute. 
	 * @param value the businessSectors
	 */
	public void setBusinessSectors(final Set<String> value)
	{
		setBusinessSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationRSACronJob.lastSuccessFulRecordProcessTime</code> attribute.
	 * @return the lastSuccessFulRecordProcessTime - Last SuccessFul Record Process Time stamp.
	 */
	public Date getLastSuccessFulRecordProcessTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTSUCCESSFULRECORDPROCESSTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationRSACronJob.lastSuccessFulRecordProcessTime</code> attribute.
	 * @return the lastSuccessFulRecordProcessTime - Last SuccessFul Record Process Time stamp.
	 */
	public Date getLastSuccessFulRecordProcessTime()
	{
		return getLastSuccessFulRecordProcessTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationRSACronJob.lastSuccessFulRecordProcessTime</code> attribute. 
	 * @param value the lastSuccessFulRecordProcessTime - Last SuccessFul Record Process Time stamp.
	 */
	public void setLastSuccessFulRecordProcessTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTSUCCESSFULRECORDPROCESSTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationRSACronJob.lastSuccessFulRecordProcessTime</code> attribute. 
	 * @param value the lastSuccessFulRecordProcessTime - Last SuccessFul Record Process Time stamp.
	 */
	public void setLastSuccessFulRecordProcessTime(final Date value)
	{
		setLastSuccessFulRecordProcessTime( getSession().getSessionContext(), value );
	}
	
}
