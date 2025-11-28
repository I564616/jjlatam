/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjReadOperationDashboard;
import com.jnj.core.jalo.JnjWriteOperationDashboard;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjInterfaceNotificationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjInterfaceNotificationProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjInterfaceNotificationProcess.readDashboardRecords</code> attribute **/
	public static final String READDASHBOARDRECORDS = "readDashboardRecords";
	/** Qualifier of the <code>JnjInterfaceNotificationProcess.writeDashboardRecords</code> attribute **/
	public static final String WRITEDASHBOARDRECORDS = "writeDashboardRecords";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(READDASHBOARDRECORDS, AttributeMode.INITIAL);
		tmp.put(WRITEDASHBOARDRECORDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceNotificationProcess.readDashboardRecords</code> attribute.
	 * @return the readDashboardRecords - Collection of the Read Dashboard records.
	 */
	public Set<JnjReadOperationDashboard> getReadDashboardRecords(final SessionContext ctx)
	{
		Set<JnjReadOperationDashboard> coll = (Set<JnjReadOperationDashboard>)getProperty( ctx, READDASHBOARDRECORDS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceNotificationProcess.readDashboardRecords</code> attribute.
	 * @return the readDashboardRecords - Collection of the Read Dashboard records.
	 */
	public Set<JnjReadOperationDashboard> getReadDashboardRecords()
	{
		return getReadDashboardRecords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceNotificationProcess.readDashboardRecords</code> attribute. 
	 * @param value the readDashboardRecords - Collection of the Read Dashboard records.
	 */
	public void setReadDashboardRecords(final SessionContext ctx, final Set<JnjReadOperationDashboard> value)
	{
		setProperty(ctx, READDASHBOARDRECORDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceNotificationProcess.readDashboardRecords</code> attribute. 
	 * @param value the readDashboardRecords - Collection of the Read Dashboard records.
	 */
	public void setReadDashboardRecords(final Set<JnjReadOperationDashboard> value)
	{
		setReadDashboardRecords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceNotificationProcess.writeDashboardRecords</code> attribute.
	 * @return the writeDashboardRecords - Collection of the write Dashboard records.
	 */
	public Set<JnjWriteOperationDashboard> getWriteDashboardRecords(final SessionContext ctx)
	{
		Set<JnjWriteOperationDashboard> coll = (Set<JnjWriteOperationDashboard>)getProperty( ctx, WRITEDASHBOARDRECORDS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceNotificationProcess.writeDashboardRecords</code> attribute.
	 * @return the writeDashboardRecords - Collection of the write Dashboard records.
	 */
	public Set<JnjWriteOperationDashboard> getWriteDashboardRecords()
	{
		return getWriteDashboardRecords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceNotificationProcess.writeDashboardRecords</code> attribute. 
	 * @param value the writeDashboardRecords - Collection of the write Dashboard records.
	 */
	public void setWriteDashboardRecords(final SessionContext ctx, final Set<JnjWriteOperationDashboard> value)
	{
		setProperty(ctx, WRITEDASHBOARDRECORDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceNotificationProcess.writeDashboardRecords</code> attribute. 
	 * @param value the writeDashboardRecords - Collection of the write Dashboard records.
	 */
	public void setWriteDashboardRecords(final Set<JnjWriteOperationDashboard> value)
	{
		setWriteDashboardRecords( getSession().getSessionContext(), value );
	}
	
}
