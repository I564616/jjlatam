/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.jalo.process;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Order;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.JnjSynchronizeOrdersProcess JnjSynchronizeOrdersProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjSynchronizeOrdersProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjSynchronizeOrdersProcess.synchronizedOrder</code> attribute **/
	public static final String SYNCHRONIZEDORDER = "synchronizedOrder";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SYNCHRONIZEDORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSynchronizeOrdersProcess.synchronizedOrder</code> attribute.
	 * @return the synchronizedOrder
	 */
	public Order getSynchronizedOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, SYNCHRONIZEDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSynchronizeOrdersProcess.synchronizedOrder</code> attribute.
	 * @return the synchronizedOrder
	 */
	public Order getSynchronizedOrder()
	{
		return getSynchronizedOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSynchronizeOrdersProcess.synchronizedOrder</code> attribute. 
	 * @param value the synchronizedOrder
	 */
	public void setSynchronizedOrder(final SessionContext ctx, final Order value)
	{
		setProperty(ctx, SYNCHRONIZEDORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSynchronizeOrdersProcess.synchronizedOrder</code> attribute. 
	 * @param value the synchronizedOrder
	 */
	public void setSynchronizedOrder(final Order value)
	{
		setSynchronizedOrder( getSession().getSessionContext(), value );
	}
	
}
