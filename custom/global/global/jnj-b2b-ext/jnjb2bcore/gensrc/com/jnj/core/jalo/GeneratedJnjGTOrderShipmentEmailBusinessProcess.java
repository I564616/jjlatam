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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTOrderShipmentEmailBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTOrderShipmentEmailBusinessProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderNumber</code> attribute **/
	public static final String ORDERNUMBER = "orderNumber";
	/** Qualifier of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderCode</code> attribute **/
	public static final String ORDERCODE = "orderCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(ORDERCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderCode</code> attribute.
	 * @return the orderCode - Hybris based Order Number.
	 */
	public String getOrderCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderCode</code> attribute.
	 * @return the orderCode - Hybris based Order Number.
	 */
	public String getOrderCode()
	{
		return getOrderCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderCode</code> attribute. 
	 * @param value the orderCode - Hybris based Order Number.
	 */
	public void setOrderCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderCode</code> attribute. 
	 * @param value the orderCode - Hybris based Order Number.
	 */
	public void setOrderCode(final String value)
	{
		setOrderCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderNumber</code> attribute.
	 * @return the orderNumber - SAP based Order Number.
	 */
	public String getOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderNumber</code> attribute.
	 * @return the orderNumber - SAP based Order Number.
	 */
	public String getOrderNumber()
	{
		return getOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderNumber</code> attribute. 
	 * @param value the orderNumber - SAP based Order Number.
	 */
	public void setOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderShipmentEmailBusinessProcess.orderNumber</code> attribute. 
	 * @param value the orderNumber - SAP based Order Number.
	 */
	public void setOrderNumber(final String value)
	{
		setOrderNumber( getSession().getSessionContext(), value );
	}
	
}
