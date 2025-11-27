/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTShippingLineDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnjGTShippingDetails JnjGTShippingDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShippingDetails extends GenericItem
{
	/** Qualifier of the <code>JnjGTShippingDetails.deliveryNum</code> attribute **/
	public static final String DELIVERYNUM = "deliveryNum";
	/** Qualifier of the <code>JnjGTShippingDetails.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTShippingDetails.bolNum</code> attribute **/
	public static final String BOLNUM = "bolNum";
	/** Qualifier of the <code>JnjGTShippingDetails.carrierScacCde</code> attribute **/
	public static final String CARRIERSCACCDE = "carrierScacCde";
	/** Qualifier of the <code>JnjGTShippingDetails.actualShipDate</code> attribute **/
	public static final String ACTUALSHIPDATE = "actualShipDate";
	/** Qualifier of the <code>JnjGTShippingDetails.actualShipTime</code> attribute **/
	public static final String ACTUALSHIPTIME = "actualShipTime";
	/** Qualifier of the <code>JnjGTShippingDetails.containerId</code> attribute **/
	public static final String CONTAINERID = "containerId";
	/** Qualifier of the <code>JnjGTShippingDetails.trackingNum</code> attribute **/
	public static final String TRACKINGNUM = "trackingNum";
	/** Qualifier of the <code>JnjGTShippingDetails.correlationId</code> attribute **/
	public static final String CORRELATIONID = "correlationId";
	/** Qualifier of the <code>JnjGTShippingDetails.carrierScacName</code> attribute **/
	public static final String CARRIERSCACNAME = "carrierScacName";
	/** Qualifier of the <code>JnjGTShippingDetails.actualDeliveryDate</code> attribute **/
	public static final String ACTUALDELIVERYDATE = "actualDeliveryDate";
	/** Qualifier of the <code>JnjGTShippingDetails.actualDeliveryTime</code> attribute **/
	public static final String ACTUALDELIVERYTIME = "actualDeliveryTime";
	/** Qualifier of the <code>JnjGTShippingDetails.shippingLineDetails</code> attribute **/
	public static final String SHIPPINGLINEDETAILS = "shippingLineDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n SHIPPINGLINEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<JnjGTShippingLineDetails> SHIPPINGLINEDETAILSHANDLER = new OneToManyHandler<JnjGTShippingLineDetails>(
	Jnjb2bCoreConstants.TC.JNJGTSHIPPINGLINEDETAILS,
	false,
	"shippingDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DELIVERYNUM, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(BOLNUM, AttributeMode.INITIAL);
		tmp.put(CARRIERSCACCDE, AttributeMode.INITIAL);
		tmp.put(ACTUALSHIPDATE, AttributeMode.INITIAL);
		tmp.put(ACTUALSHIPTIME, AttributeMode.INITIAL);
		tmp.put(CONTAINERID, AttributeMode.INITIAL);
		tmp.put(TRACKINGNUM, AttributeMode.INITIAL);
		tmp.put(CORRELATIONID, AttributeMode.INITIAL);
		tmp.put(CARRIERSCACNAME, AttributeMode.INITIAL);
		tmp.put(ACTUALDELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(ACTUALDELIVERYTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualDeliveryDate</code> attribute.
	 * @return the actualDeliveryDate
	 */
	public Date getActualDeliveryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTUALDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualDeliveryDate</code> attribute.
	 * @return the actualDeliveryDate
	 */
	public Date getActualDeliveryDate()
	{
		return getActualDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualDeliveryDate</code> attribute. 
	 * @param value the actualDeliveryDate
	 */
	public void setActualDeliveryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTUALDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualDeliveryDate</code> attribute. 
	 * @param value the actualDeliveryDate
	 */
	public void setActualDeliveryDate(final Date value)
	{
		setActualDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualDeliveryTime</code> attribute.
	 * @return the actualDeliveryTime
	 */
	public String getActualDeliveryTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALDELIVERYTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualDeliveryTime</code> attribute.
	 * @return the actualDeliveryTime
	 */
	public String getActualDeliveryTime()
	{
		return getActualDeliveryTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualDeliveryTime</code> attribute. 
	 * @param value the actualDeliveryTime
	 */
	public void setActualDeliveryTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALDELIVERYTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualDeliveryTime</code> attribute. 
	 * @param value the actualDeliveryTime
	 */
	public void setActualDeliveryTime(final String value)
	{
		setActualDeliveryTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualShipDate</code> attribute.
	 * @return the actualShipDate
	 */
	public Date getActualShipDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTUALSHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualShipDate</code> attribute.
	 * @return the actualShipDate
	 */
	public Date getActualShipDate()
	{
		return getActualShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualShipDate</code> attribute. 
	 * @param value the actualShipDate
	 */
	public void setActualShipDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTUALSHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualShipDate</code> attribute. 
	 * @param value the actualShipDate
	 */
	public void setActualShipDate(final Date value)
	{
		setActualShipDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualShipTime</code> attribute.
	 * @return the actualShipTime
	 */
	public String getActualShipTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALSHIPTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.actualShipTime</code> attribute.
	 * @return the actualShipTime
	 */
	public String getActualShipTime()
	{
		return getActualShipTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualShipTime</code> attribute. 
	 * @param value the actualShipTime
	 */
	public void setActualShipTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALSHIPTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.actualShipTime</code> attribute. 
	 * @param value the actualShipTime
	 */
	public void setActualShipTime(final String value)
	{
		setActualShipTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.bolNum</code> attribute.
	 * @return the bolNum
	 */
	public String getBolNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOLNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.bolNum</code> attribute.
	 * @return the bolNum
	 */
	public String getBolNum()
	{
		return getBolNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.bolNum</code> attribute. 
	 * @param value the bolNum
	 */
	public void setBolNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOLNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.bolNum</code> attribute. 
	 * @param value the bolNum
	 */
	public void setBolNum(final String value)
	{
		setBolNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.carrierScacCde</code> attribute.
	 * @return the carrierScacCde
	 */
	public String getCarrierScacCde(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERSCACCDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.carrierScacCde</code> attribute.
	 * @return the carrierScacCde
	 */
	public String getCarrierScacCde()
	{
		return getCarrierScacCde( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.carrierScacCde</code> attribute. 
	 * @param value the carrierScacCde
	 */
	public void setCarrierScacCde(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERSCACCDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.carrierScacCde</code> attribute. 
	 * @param value the carrierScacCde
	 */
	public void setCarrierScacCde(final String value)
	{
		setCarrierScacCde( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.carrierScacName</code> attribute.
	 * @return the carrierScacName
	 */
	public String getCarrierScacName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERSCACNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.carrierScacName</code> attribute.
	 * @return the carrierScacName
	 */
	public String getCarrierScacName()
	{
		return getCarrierScacName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.carrierScacName</code> attribute. 
	 * @param value the carrierScacName
	 */
	public void setCarrierScacName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERSCACNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.carrierScacName</code> attribute. 
	 * @param value the carrierScacName
	 */
	public void setCarrierScacName(final String value)
	{
		setCarrierScacName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.containerId</code> attribute.
	 * @return the containerId
	 */
	public String getContainerId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTAINERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.containerId</code> attribute.
	 * @return the containerId
	 */
	public String getContainerId()
	{
		return getContainerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.containerId</code> attribute. 
	 * @param value the containerId
	 */
	public void setContainerId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTAINERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.containerId</code> attribute. 
	 * @param value the containerId
	 */
	public void setContainerId(final String value)
	{
		setContainerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORRELATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId()
	{
		return getCorrelationId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORRELATIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final String value)
	{
		setCorrelationId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum()
	{
		return getDeliveryNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final String value)
	{
		setDeliveryNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.shippingLineDetails</code> attribute.
	 * @return the shippingLineDetails
	 */
	public Collection<JnjGTShippingLineDetails> getShippingLineDetails(final SessionContext ctx)
	{
		return SHIPPINGLINEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.shippingLineDetails</code> attribute.
	 * @return the shippingLineDetails
	 */
	public Collection<JnjGTShippingLineDetails> getShippingLineDetails()
	{
		return getShippingLineDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.shippingLineDetails</code> attribute. 
	 * @param value the shippingLineDetails
	 */
	public void setShippingLineDetails(final SessionContext ctx, final Collection<JnjGTShippingLineDetails> value)
	{
		SHIPPINGLINEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.shippingLineDetails</code> attribute. 
	 * @param value the shippingLineDetails
	 */
	public void setShippingLineDetails(final Collection<JnjGTShippingLineDetails> value)
	{
		setShippingLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shippingLineDetails. 
	 * @param value the item to add to shippingLineDetails
	 */
	public void addToShippingLineDetails(final SessionContext ctx, final JnjGTShippingLineDetails value)
	{
		SHIPPINGLINEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shippingLineDetails. 
	 * @param value the item to add to shippingLineDetails
	 */
	public void addToShippingLineDetails(final JnjGTShippingLineDetails value)
	{
		addToShippingLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shippingLineDetails. 
	 * @param value the item to remove from shippingLineDetails
	 */
	public void removeFromShippingLineDetails(final SessionContext ctx, final JnjGTShippingLineDetails value)
	{
		SHIPPINGLINEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shippingLineDetails. 
	 * @param value the item to remove from shippingLineDetails
	 */
	public void removeFromShippingLineDetails(final JnjGTShippingLineDetails value)
	{
		removeFromShippingLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingDetails.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum()
	{
		return getTrackingNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingDetails.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final String value)
	{
		setTrackingNum( getSession().getSessionContext(), value );
	}
	
}
