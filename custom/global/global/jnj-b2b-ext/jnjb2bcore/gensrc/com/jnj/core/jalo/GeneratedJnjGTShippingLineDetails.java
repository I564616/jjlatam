/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTShippingDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnjGTShippingLineDetails JnjGTShippingLineDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShippingLineDetails extends GenericItem
{
	/** Qualifier of the <code>JnjGTShippingLineDetails.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTShippingLineDetails.deliveryQty</code> attribute **/
	public static final String DELIVERYQTY = "deliveryQty";
	/** Qualifier of the <code>JnjGTShippingLineDetails.sapOrderLineNum</code> attribute **/
	public static final String SAPORDERLINENUM = "sapOrderLineNum";
	/** Qualifier of the <code>JnjGTShippingLineDetails.trackingNum</code> attribute **/
	public static final String TRACKINGNUM = "trackingNum";
	/** Qualifier of the <code>JnjGTShippingLineDetails.deliveryLineNum</code> attribute **/
	public static final String DELIVERYLINENUM = "deliveryLineNum";
	/** Qualifier of the <code>JnjGTShippingLineDetails.batchNum</code> attribute **/
	public static final String BATCHNUM = "batchNum";
	/** Qualifier of the <code>JnjGTShippingLineDetails.batchExpiryDate</code> attribute **/
	public static final String BATCHEXPIRYDATE = "batchExpiryDate";
	/** Qualifier of the <code>JnjGTShippingLineDetails.serialNum</code> attribute **/
	public static final String SERIALNUM = "serialNum";
	/** Qualifier of the <code>JnjGTShippingLineDetails.podDate</code> attribute **/
	public static final String PODDATE = "podDate";
	/** Qualifier of the <code>JnjGTShippingLineDetails.shippingDetail</code> attribute **/
	public static final String SHIPPINGDETAIL = "shippingDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHIPPINGDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTShippingLineDetails> SHIPPINGDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTShippingLineDetails>(
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
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(DELIVERYQTY, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUM, AttributeMode.INITIAL);
		tmp.put(TRACKINGNUM, AttributeMode.INITIAL);
		tmp.put(DELIVERYLINENUM, AttributeMode.INITIAL);
		tmp.put(BATCHNUM, AttributeMode.INITIAL);
		tmp.put(BATCHEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(SERIALNUM, AttributeMode.INITIAL);
		tmp.put(PODDATE, AttributeMode.INITIAL);
		tmp.put(SHIPPINGDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.batchExpiryDate</code> attribute.
	 * @return the batchExpiryDate
	 */
	public Date getBatchExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BATCHEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.batchExpiryDate</code> attribute.
	 * @return the batchExpiryDate
	 */
	public Date getBatchExpiryDate()
	{
		return getBatchExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.batchExpiryDate</code> attribute. 
	 * @param value the batchExpiryDate
	 */
	public void setBatchExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BATCHEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.batchExpiryDate</code> attribute. 
	 * @param value the batchExpiryDate
	 */
	public void setBatchExpiryDate(final Date value)
	{
		setBatchExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.batchNum</code> attribute.
	 * @return the batchNum
	 */
	public String getBatchNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BATCHNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.batchNum</code> attribute.
	 * @return the batchNum
	 */
	public String getBatchNum()
	{
		return getBatchNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.batchNum</code> attribute. 
	 * @param value the batchNum
	 */
	public void setBatchNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BATCHNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.batchNum</code> attribute. 
	 * @param value the batchNum
	 */
	public void setBatchNum(final String value)
	{
		setBatchNum( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SHIPPINGDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.deliveryLineNum</code> attribute.
	 * @return the deliveryLineNum
	 */
	public String getDeliveryLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYLINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.deliveryLineNum</code> attribute.
	 * @return the deliveryLineNum
	 */
	public String getDeliveryLineNum()
	{
		return getDeliveryLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.deliveryLineNum</code> attribute. 
	 * @param value the deliveryLineNum
	 */
	public void setDeliveryLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYLINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.deliveryLineNum</code> attribute. 
	 * @param value the deliveryLineNum
	 */
	public void setDeliveryLineNum(final String value)
	{
		setDeliveryLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.deliveryQty</code> attribute.
	 * @return the deliveryQty
	 */
	public String getDeliveryQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.deliveryQty</code> attribute.
	 * @return the deliveryQty
	 */
	public String getDeliveryQty()
	{
		return getDeliveryQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.deliveryQty</code> attribute. 
	 * @param value the deliveryQty
	 */
	public void setDeliveryQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.deliveryQty</code> attribute. 
	 * @param value the deliveryQty
	 */
	public void setDeliveryQty(final String value)
	{
		setDeliveryQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.podDate</code> attribute.
	 * @return the podDate
	 */
	public Date getPodDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PODDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.podDate</code> attribute.
	 * @return the podDate
	 */
	public Date getPodDate()
	{
		return getPodDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.podDate</code> attribute. 
	 * @param value the podDate
	 */
	public void setPodDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PODDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.podDate</code> attribute. 
	 * @param value the podDate
	 */
	public void setPodDate(final Date value)
	{
		setPodDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.sapOrderLineNum</code> attribute.
	 * @return the sapOrderLineNum
	 */
	public String getSapOrderLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.sapOrderLineNum</code> attribute.
	 * @return the sapOrderLineNum
	 */
	public String getSapOrderLineNum()
	{
		return getSapOrderLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.sapOrderLineNum</code> attribute. 
	 * @param value the sapOrderLineNum
	 */
	public void setSapOrderLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.sapOrderLineNum</code> attribute. 
	 * @param value the sapOrderLineNum
	 */
	public void setSapOrderLineNum(final String value)
	{
		setSapOrderLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.serialNum</code> attribute.
	 * @return the serialNum
	 */
	public String getSerialNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERIALNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.serialNum</code> attribute.
	 * @return the serialNum
	 */
	public String getSerialNum()
	{
		return getSerialNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.serialNum</code> attribute. 
	 * @param value the serialNum
	 */
	public void setSerialNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERIALNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.serialNum</code> attribute. 
	 * @param value the serialNum
	 */
	public void setSerialNum(final String value)
	{
		setSerialNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.shippingDetail</code> attribute.
	 * @return the shippingDetail
	 */
	public JnjGTShippingDetails getShippingDetail(final SessionContext ctx)
	{
		return (JnjGTShippingDetails)getProperty( ctx, SHIPPINGDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.shippingDetail</code> attribute.
	 * @return the shippingDetail
	 */
	public JnjGTShippingDetails getShippingDetail()
	{
		return getShippingDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.shippingDetail</code> attribute. 
	 * @param value the shippingDetail
	 */
	public void setShippingDetail(final SessionContext ctx, final JnjGTShippingDetails value)
	{
		SHIPPINGDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.shippingDetail</code> attribute. 
	 * @param value the shippingDetail
	 */
	public void setShippingDetail(final JnjGTShippingDetails value)
	{
		setShippingDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingLineDetails.trackingNum</code> attribute.
	 * @return the trackingNum
	 */
	public String getTrackingNum()
	{
		return getTrackingNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingLineDetails.trackingNum</code> attribute. 
	 * @param value the trackingNum
	 */
	public void setTrackingNum(final String value)
	{
		setTrackingNum( getSession().getSessionContext(), value );
	}
	
}
