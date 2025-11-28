/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Order;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjGTComprehensiveOrderConfirmationEmailBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTComprehensiveOrderConfirmationEmailBusinessProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.b2bUsersList</code> attribute **/
	public static final String B2BUSERSLIST = "b2bUsersList";
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.orderStatus</code> attribute **/
	public static final String ORDERSTATUS = "orderStatus";
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.jnjOrderNumber</code> attribute **/
	public static final String JNJORDERNUMBER = "jnjOrderNumber";
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.order</code> attribute **/
	public static final String ORDER = "order";
	/** Qualifier of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.layManOrderChannel</code> attribute **/
	public static final String LAYMANORDERCHANNEL = "layManOrderChannel";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(B2BUSERSLIST, AttributeMode.INITIAL);
		tmp.put(ORDERSTATUS, AttributeMode.INITIAL);
		tmp.put(JNJORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(ORDER, AttributeMode.INITIAL);
		tmp.put(LAYMANORDERCHANNEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.b2bUsersList</code> attribute.
	 * @return the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public List<String> getB2bUsersList(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, B2BUSERSLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.b2bUsersList</code> attribute.
	 * @return the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public List<String> getB2bUsersList()
	{
		return getB2bUsersList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.b2bUsersList</code> attribute. 
	 * @param value the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public void setB2bUsersList(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, B2BUSERSLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.b2bUsersList</code> attribute. 
	 * @param value the b2bUsersList - List containing elements representing order confirmation details.
	 */
	public void setB2bUsersList(final List<String> value)
	{
		setB2bUsersList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.jnjOrderNumber</code> attribute.
	 * @return the jnjOrderNumber - Order Number.
	 */
	public String getJnjOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JNJORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.jnjOrderNumber</code> attribute.
	 * @return the jnjOrderNumber - Order Number.
	 */
	public String getJnjOrderNumber()
	{
		return getJnjOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.jnjOrderNumber</code> attribute. 
	 * @param value the jnjOrderNumber - Order Number.
	 */
	public void setJnjOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JNJORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.jnjOrderNumber</code> attribute. 
	 * @param value the jnjOrderNumber - Order Number.
	 */
	public void setJnjOrderNumber(final String value)
	{
		setJnjOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.layManOrderChannel</code> attribute.
	 * @return the layManOrderChannel - Order channel.
	 */
	public String getLayManOrderChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LAYMANORDERCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.layManOrderChannel</code> attribute.
	 * @return the layManOrderChannel - Order channel.
	 */
	public String getLayManOrderChannel()
	{
		return getLayManOrderChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.layManOrderChannel</code> attribute. 
	 * @param value the layManOrderChannel - Order channel.
	 */
	public void setLayManOrderChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LAYMANORDERCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.layManOrderChannel</code> attribute. 
	 * @param value the layManOrderChannel - Order channel.
	 */
	public void setLayManOrderChannel(final String value)
	{
		setLayManOrderChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.order</code> attribute.
	 * @return the order - The Order Model
	 */
	public Order getOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.order</code> attribute.
	 * @return the order - The Order Model
	 */
	public Order getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.order</code> attribute. 
	 * @param value the order - The Order Model
	 */
	public void setOrder(final SessionContext ctx, final Order value)
	{
		setProperty(ctx, ORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.order</code> attribute. 
	 * @param value the order - The Order Model
	 */
	public void setOrder(final Order value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public String getOrderStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public String getOrderStatus()
	{
		return getOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final String value)
	{
		setOrderStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber - Order Number.
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber - Order Number.
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber - Order Number.
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTComprehensiveOrderConfirmationEmailBusinessProcess.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber - Order Number.
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
}
