/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntShipTrckHdr JnjGTIntShipTrckHdr}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntShipTrckHdr extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.deliveryNum</code> attribute **/
	public static final String DELIVERYNUM = "deliveryNum";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.bolNum</code> attribute **/
	public static final String BOLNUM = "bolNum";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.carrierScacCde</code> attribute **/
	public static final String CARRIERSCACCDE = "carrierScacCde";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.actualShipDate</code> attribute **/
	public static final String ACTUALSHIPDATE = "actualShipDate";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.actualShipTime</code> attribute **/
	public static final String ACTUALSHIPTIME = "actualShipTime";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.containerId</code> attribute **/
	public static final String CONTAINERID = "containerId";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.trackingNum</code> attribute **/
	public static final String TRACKINGNUM = "trackingNum";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.sapOrderNum</code> attribute **/
	public static final String SAPORDERNUM = "sapOrderNum";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.correlationId</code> attribute **/
	public static final String CORRELATIONID = "correlationId";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.carrierScacName</code> attribute **/
	public static final String CARRIERSCACNAME = "carrierScacName";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.actualDeliveryDate</code> attribute **/
	public static final String ACTUALDELIVERYDATE = "actualDeliveryDate";
	/** Qualifier of the <code>JnjGTIntShipTrckHdr.actualDeliveryTime</code> attribute **/
	public static final String ACTUALDELIVERYTIME = "actualDeliveryTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DELIVERYNUM, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(BOLNUM, AttributeMode.INITIAL);
		tmp.put(CARRIERSCACCDE, AttributeMode.INITIAL);
		tmp.put(ACTUALSHIPDATE, AttributeMode.INITIAL);
		tmp.put(ACTUALSHIPTIME, AttributeMode.INITIAL);
		tmp.put(CONTAINERID, AttributeMode.INITIAL);
		tmp.put(TRACKINGNUM, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUM, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualDeliveryDate</code> attribute.
	 * @return the actualDeliveryDate
	 */
	public String getActualDeliveryDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualDeliveryDate</code> attribute.
	 * @return the actualDeliveryDate
	 */
	public String getActualDeliveryDate()
	{
		return getActualDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualDeliveryDate</code> attribute. 
	 * @param value the actualDeliveryDate
	 */
	public void setActualDeliveryDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALDELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualDeliveryDate</code> attribute. 
	 * @param value the actualDeliveryDate
	 */
	public void setActualDeliveryDate(final String value)
	{
		setActualDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualDeliveryTime</code> attribute.
	 * @return the actualDeliveryTime
	 */
	public String getActualDeliveryTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALDELIVERYTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualDeliveryTime</code> attribute.
	 * @return the actualDeliveryTime
	 */
	public String getActualDeliveryTime()
	{
		return getActualDeliveryTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualDeliveryTime</code> attribute. 
	 * @param value the actualDeliveryTime
	 */
	public void setActualDeliveryTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALDELIVERYTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualDeliveryTime</code> attribute. 
	 * @param value the actualDeliveryTime
	 */
	public void setActualDeliveryTime(final String value)
	{
		setActualDeliveryTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualShipDate</code> attribute.
	 * @return the actualShipDate
	 */
	public String getActualShipDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALSHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualShipDate</code> attribute.
	 * @return the actualShipDate
	 */
	public String getActualShipDate()
	{
		return getActualShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualShipDate</code> attribute. 
	 * @param value the actualShipDate
	 */
	public void setActualShipDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALSHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualShipDate</code> attribute. 
	 * @param value the actualShipDate
	 */
	public void setActualShipDate(final String value)
	{
		setActualShipDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualShipTime</code> attribute.
	 * @return the actualShipTime
	 */
	public String getActualShipTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTUALSHIPTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.actualShipTime</code> attribute.
	 * @return the actualShipTime
	 */
	public String getActualShipTime()
	{
		return getActualShipTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualShipTime</code> attribute. 
	 * @param value the actualShipTime
	 */
	public void setActualShipTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTUALSHIPTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.actualShipTime</code> attribute. 
	 * @param value the actualShipTime
	 */
	public void setActualShipTime(final String value)
	{
		setActualShipTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.bolNum</code> attribute.
	 * @return the bolNum
	 */
	public String getBolNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOLNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.bolNum</code> attribute.
	 * @return the bolNum
	 */
	public String getBolNum()
	{
		return getBolNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.bolNum</code> attribute. 
	 * @param value the bolNum
	 */
	public void setBolNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOLNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.bolNum</code> attribute. 
	 * @param value the bolNum
	 */
	public void setBolNum(final String value)
	{
		setBolNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.carrierScacCde</code> attribute.
	 * @return the carrierScacCde
	 */
	public String getCarrierScacCde(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERSCACCDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.carrierScacCde</code> attribute.
	 * @return the carrierScacCde
	 */
	public String getCarrierScacCde()
	{
		return getCarrierScacCde( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.carrierScacCde</code> attribute. 
	 * @param value the carrierScacCde
	 */
	public void setCarrierScacCde(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERSCACCDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.carrierScacCde</code> attribute. 
	 * @param value the carrierScacCde
	 */
	public void setCarrierScacCde(final String value)
	{
		setCarrierScacCde( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.carrierScacName</code> attribute.
	 * @return the carrierScacName
	 */
	public String getCarrierScacName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARRIERSCACNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.carrierScacName</code> attribute.
	 * @return the carrierScacName
	 */
	public String getCarrierScacName()
	{
		return getCarrierScacName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.carrierScacName</code> attribute. 
	 * @param value the carrierScacName
	 */
	public void setCarrierScacName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARRIERSCACNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.carrierScacName</code> attribute. 
	 * @param value the carrierScacName
	 */
	public void setCarrierScacName(final String value)
	{
		setCarrierScacName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.containerId</code> attribute.
	 * @return the containerId
	 */
	public String getContainerId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTAINERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.containerId</code> attribute.
	 * @return the containerId
	 */
	public String getContainerId()
	{
		return getContainerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.containerId</code> attribute. 
	 * @param value the containerId
	 */
	public void setContainerId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTAINERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.containerId</code> attribute. 
	 * @param value the containerId
	 */
	public void setContainerId(final String value)
	{
		setContainerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORRELATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId()
	{
		return getCorrelationId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORRELATIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final String value)
	{
		setCorrelationId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum()
	{
		return getDeliveryNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final String value)
	{
		setDeliveryNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.sapOrderNum</code> attribute.
	 * @return the sapOrderNum
	 */
	public String getSapOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.sapOrderNum</code> attribute.
	 * @return the sapOrderNum
	 */
	public String getSapOrderNum()
	{
		return getSapOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.sapOrderNum</code> attribute. 
	 * @param value the sapOrderNum
	 */
	public void setSapOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.sapOrderNum</code> attribute. 
	 * @param value the sapOrderNum
	 */
	public void setSapOrderNum(final String value)
	{
		setSapOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckHdr.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum()
	{
		return getTrackingNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckHdr.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final String value)
	{
		setTrackingNum( getSession().getSessionContext(), value );
	}
	
}
