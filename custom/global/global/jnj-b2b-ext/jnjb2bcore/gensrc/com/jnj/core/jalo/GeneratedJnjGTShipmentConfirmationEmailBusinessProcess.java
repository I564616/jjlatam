/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTShipmentConfirmationEmailBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShipmentConfirmationEmailBusinessProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.shipmentConfirmationEmailData</code> attribute **/
	public static final String SHIPMENTCONFIRMATIONEMAILDATA = "shipmentConfirmationEmailData";
	/** Qualifier of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.b2bUsersList</code> attribute **/
	public static final String B2BUSERSLIST = "b2bUsersList";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHIPMENTCONFIRMATIONEMAILDATA, AttributeMode.INITIAL);
		tmp.put(B2BUSERSLIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.b2bUsersList</code> attribute.
	 * @return the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public List<String> getB2bUsersList(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, B2BUSERSLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.b2bUsersList</code> attribute.
	 * @return the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public List<String> getB2bUsersList()
	{
		return getB2bUsersList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.b2bUsersList</code> attribute. 
	 * @param value the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public void setB2bUsersList(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, B2BUSERSLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.b2bUsersList</code> attribute. 
	 * @param value the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public void setB2bUsersList(final List<String> value)
	{
		setB2bUsersList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.shipmentConfirmationEmailData</code> attribute.
	 * @return the shipmentConfirmationEmailData - List containing elements representing concatenated data for Shipment Confirmation email.
	 */
	public List<String> getShipmentConfirmationEmailData(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, SHIPMENTCONFIRMATIONEMAILDATA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.shipmentConfirmationEmailData</code> attribute.
	 * @return the shipmentConfirmationEmailData - List containing elements representing concatenated data for Shipment Confirmation email.
	 */
	public List<String> getShipmentConfirmationEmailData()
	{
		return getShipmentConfirmationEmailData( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.shipmentConfirmationEmailData</code> attribute. 
	 * @param value the shipmentConfirmationEmailData - List containing elements representing concatenated data for Shipment Confirmation email.
	 */
	public void setShipmentConfirmationEmailData(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, SHIPMENTCONFIRMATIONEMAILDATA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShipmentConfirmationEmailBusinessProcess.shipmentConfirmationEmailData</code> attribute. 
	 * @param value the shipmentConfirmationEmailData - List containing elements representing concatenated data for Shipment Confirmation email.
	 */
	public void setShipmentConfirmationEmailData(final List<String> value)
	{
		setShipmentConfirmationEmailData( getSession().getSessionContext(), value );
	}
	
}
