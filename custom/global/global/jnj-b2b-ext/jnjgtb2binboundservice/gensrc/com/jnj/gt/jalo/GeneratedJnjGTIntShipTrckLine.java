/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntShipTrckLine JnjGTIntShipTrckLine}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntShipTrckLine extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntShipTrckLine.sapOrderNum</code> attribute **/
	public static final String SAPORDERNUM = "sapOrderNum";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.deliveryNum</code> attribute **/
	public static final String DELIVERYNUM = "deliveryNum";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.deliveryQty</code> attribute **/
	public static final String DELIVERYQTY = "deliveryQty";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.sapOrderLineNum</code> attribute **/
	public static final String SAPORDERLINENUM = "sapOrderLineNum";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.trackingNum</code> attribute **/
	public static final String TRACKINGNUM = "trackingNum";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.deliveryLineNum</code> attribute **/
	public static final String DELIVERYLINENUM = "deliveryLineNum";
	/** Qualifier of the <code>JnjGTIntShipTrckLine.correlationId</code> attribute **/
	public static final String CORRELATIONID = "correlationId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SAPORDERNUM, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(DELIVERYNUM, AttributeMode.INITIAL);
		tmp.put(DELIVERYQTY, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUM, AttributeMode.INITIAL);
		tmp.put(TRACKINGNUM, AttributeMode.INITIAL);
		tmp.put(DELIVERYLINENUM, AttributeMode.INITIAL);
		tmp.put(CORRELATIONID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORRELATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.correlationId</code> attribute.
	 * @return the correlationId
	 */
	public String getCorrelationId()
	{
		return getCorrelationId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORRELATIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.correlationId</code> attribute. 
	 * @param value the correlationId
	 */
	public void setCorrelationId(final String value)
	{
		setCorrelationId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryLineNum</code> attribute.
	 * @return the deliveryLineNum
	 */
	public String getDeliveryLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYLINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryLineNum</code> attribute.
	 * @return the deliveryLineNum
	 */
	public String getDeliveryLineNum()
	{
		return getDeliveryLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryLineNum</code> attribute. 
	 * @param value the deliveryLineNum
	 */
	public void setDeliveryLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYLINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryLineNum</code> attribute. 
	 * @param value the deliveryLineNum
	 */
	public void setDeliveryLineNum(final String value)
	{
		setDeliveryLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryNum</code> attribute.
	 * @return the deliveryNum
	 */
	public String getDeliveryNum()
	{
		return getDeliveryNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryNum</code> attribute. 
	 * @param value the deliveryNum
	 */
	public void setDeliveryNum(final String value)
	{
		setDeliveryNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryQty</code> attribute.
	 * @return the deliveryQty
	 */
	public String getDeliveryQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.deliveryQty</code> attribute.
	 * @return the deliveryQty
	 */
	public String getDeliveryQty()
	{
		return getDeliveryQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryQty</code> attribute. 
	 * @param value the deliveryQty
	 */
	public void setDeliveryQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.deliveryQty</code> attribute. 
	 * @param value the deliveryQty
	 */
	public void setDeliveryQty(final String value)
	{
		setDeliveryQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sapOrderLineNum</code> attribute.
	 * @return the sapOrderLineNum
	 */
	public String getSapOrderLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sapOrderLineNum</code> attribute.
	 * @return the sapOrderLineNum
	 */
	public String getSapOrderLineNum()
	{
		return getSapOrderLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sapOrderLineNum</code> attribute. 
	 * @param value the sapOrderLineNum
	 */
	public void setSapOrderLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sapOrderLineNum</code> attribute. 
	 * @param value the sapOrderLineNum
	 */
	public void setSapOrderLineNum(final String value)
	{
		setSapOrderLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sapOrderNum</code> attribute.
	 * @return the sapOrderNum
	 */
	public String getSapOrderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sapOrderNum</code> attribute.
	 * @return the sapOrderNum
	 */
	public String getSapOrderNum()
	{
		return getSapOrderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sapOrderNum</code> attribute. 
	 * @param value the sapOrderNum
	 */
	public void setSapOrderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sapOrderNum</code> attribute. 
	 * @param value the sapOrderNum
	 */
	public void setSapOrderNum(final String value)
	{
		setSapOrderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntShipTrckLine.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum()
	{
		return getTrackingNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntShipTrckLine.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final String value)
	{
		setTrackingNum( getSession().getSessionContext(), value );
	}
	
}
