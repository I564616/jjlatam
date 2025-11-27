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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.Order;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjOrderStatusNotificationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjOrderStatusNotificationProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.previousStatus</code> attribute **/
	public static final String PREVIOUSSTATUS = "previousStatus";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.currentStatus</code> attribute **/
	public static final String CURRENTSTATUS = "currentStatus";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.jnjOrderNumber</code> attribute **/
	public static final String JNJORDERNUMBER = "jnjOrderNumber";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.clientOrderNumber</code> attribute **/
	public static final String CLIENTORDERNUMBER = "clientOrderNumber";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.baseUrl</code> attribute **/
	public static final String BASEURL = "baseUrl";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.mediaUrl</code> attribute **/
	public static final String MEDIAURL = "mediaUrl";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute **/
	public static final String SYNCORDERNOTIFICATION = "syncOrderNotification";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.order</code> attribute **/
	public static final String ORDER = "order";
	/** Qualifier of the <code>JnjOrderStatusNotificationProcess.toEmail</code> attribute **/
	public static final String TOEMAIL = "toEmail";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PREVIOUSSTATUS, AttributeMode.INITIAL);
		tmp.put(CURRENTSTATUS, AttributeMode.INITIAL);
		tmp.put(JNJORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(CLIENTORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(BASEURL, AttributeMode.INITIAL);
		tmp.put(MEDIAURL, AttributeMode.INITIAL);
		tmp.put(SYNCORDERNOTIFICATION, AttributeMode.INITIAL);
		tmp.put(ORDER, AttributeMode.INITIAL);
		tmp.put(TOEMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.baseUrl</code> attribute.
	 * @return the baseUrl - Order Number.
	 */
	public String getBaseUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BASEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.baseUrl</code> attribute.
	 * @return the baseUrl - Order Number.
	 */
	public String getBaseUrl()
	{
		return getBaseUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.baseUrl</code> attribute. 
	 * @param value the baseUrl - Order Number.
	 */
	public void setBaseUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BASEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.baseUrl</code> attribute. 
	 * @param value the baseUrl - Order Number.
	 */
	public void setBaseUrl(final String value)
	{
		setBaseUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.clientOrderNumber</code> attribute.
	 * @return the clientOrderNumber - Order Number.
	 */
	public String getClientOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.clientOrderNumber</code> attribute.
	 * @return the clientOrderNumber - Order Number.
	 */
	public String getClientOrderNumber()
	{
		return getClientOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.clientOrderNumber</code> attribute. 
	 * @param value the clientOrderNumber - Order Number.
	 */
	public void setClientOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.clientOrderNumber</code> attribute. 
	 * @param value the clientOrderNumber - Order Number.
	 */
	public void setClientOrderNumber(final String value)
	{
		setClientOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.currentStatus</code> attribute.
	 * @return the currentStatus - Order Current status after synchronization.
	 */
	public EnumerationValue getCurrentStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CURRENTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.currentStatus</code> attribute.
	 * @return the currentStatus - Order Current status after synchronization.
	 */
	public EnumerationValue getCurrentStatus()
	{
		return getCurrentStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.currentStatus</code> attribute. 
	 * @param value the currentStatus - Order Current status after synchronization.
	 */
	public void setCurrentStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CURRENTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.currentStatus</code> attribute. 
	 * @param value the currentStatus - Order Current status after synchronization.
	 */
	public void setCurrentStatus(final EnumerationValue value)
	{
		setCurrentStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.jnjOrderNumber</code> attribute.
	 * @return the jnjOrderNumber - Order Number.
	 */
	public String getJnjOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JNJORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.jnjOrderNumber</code> attribute.
	 * @return the jnjOrderNumber - Order Number.
	 */
	public String getJnjOrderNumber()
	{
		return getJnjOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.jnjOrderNumber</code> attribute. 
	 * @param value the jnjOrderNumber - Order Number.
	 */
	public void setJnjOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JNJORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.jnjOrderNumber</code> attribute. 
	 * @param value the jnjOrderNumber - Order Number.
	 */
	public void setJnjOrderNumber(final String value)
	{
		setJnjOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.mediaUrl</code> attribute.
	 * @return the mediaUrl - Media url
	 */
	public String getMediaUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEDIAURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.mediaUrl</code> attribute.
	 * @return the mediaUrl - Media url
	 */
	public String getMediaUrl()
	{
		return getMediaUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.mediaUrl</code> attribute. 
	 * @param value the mediaUrl - Media url
	 */
	public void setMediaUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEDIAURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.mediaUrl</code> attribute. 
	 * @param value the mediaUrl - Media url
	 */
	public void setMediaUrl(final String value)
	{
		setMediaUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.order</code> attribute.
	 * @return the order - The Order Model
	 */
	public Order getOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.order</code> attribute.
	 * @return the order - The Order Model
	 */
	public Order getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.order</code> attribute. 
	 * @param value the order - The Order Model
	 */
	public void setOrder(final SessionContext ctx, final Order value)
	{
		setProperty(ctx, ORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.order</code> attribute. 
	 * @param value the order - The Order Model
	 */
	public void setOrder(final Order value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.previousStatus</code> attribute.
	 * @return the previousStatus - Order Previous Status before synchronization.
	 */
	public EnumerationValue getPreviousStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PREVIOUSSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.previousStatus</code> attribute.
	 * @return the previousStatus - Order Previous Status before synchronization.
	 */
	public EnumerationValue getPreviousStatus()
	{
		return getPreviousStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.previousStatus</code> attribute. 
	 * @param value the previousStatus - Order Previous Status before synchronization.
	 */
	public void setPreviousStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PREVIOUSSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.previousStatus</code> attribute. 
	 * @param value the previousStatus - Order Previous Status before synchronization.
	 */
	public void setPreviousStatus(final EnumerationValue value)
	{
		setPreviousStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber - Order Number.
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber - Order Number.
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber - Order Number.
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber - Order Number.
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute.
	 * @return the syncOrderNotification
	 */
	public Boolean isSyncOrderNotification(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SYNCORDERNOTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute.
	 * @return the syncOrderNotification
	 */
	public Boolean isSyncOrderNotification()
	{
		return isSyncOrderNotification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @return the syncOrderNotification
	 */
	public boolean isSyncOrderNotificationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSyncOrderNotification( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @return the syncOrderNotification
	 */
	public boolean isSyncOrderNotificationAsPrimitive()
	{
		return isSyncOrderNotificationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @param value the syncOrderNotification
	 */
	public void setSyncOrderNotification(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SYNCORDERNOTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @param value the syncOrderNotification
	 */
	public void setSyncOrderNotification(final Boolean value)
	{
		setSyncOrderNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @param value the syncOrderNotification
	 */
	public void setSyncOrderNotification(final SessionContext ctx, final boolean value)
	{
		setSyncOrderNotification( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.syncOrderNotification</code> attribute. 
	 * @param value the syncOrderNotification
	 */
	public void setSyncOrderNotification(final boolean value)
	{
		setSyncOrderNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.toEmail</code> attribute.
	 * @return the toEmail - Attribute contains toEmail id that is used in this process.
	 */
	public String getToEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrderStatusNotificationProcess.toEmail</code> attribute.
	 * @return the toEmail - Attribute contains toEmail id that is used in this process.
	 */
	public String getToEmail()
	{
		return getToEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.toEmail</code> attribute. 
	 * @param value the toEmail - Attribute contains toEmail id that is used in this process.
	 */
	public void setToEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrderStatusNotificationProcess.toEmail</code> attribute. 
	 * @param value the toEmail - Attribute contains toEmail id that is used in this process.
	 */
	public void setToEmail(final String value)
	{
		setToEmail( getSession().getSessionContext(), value );
	}
	
}
