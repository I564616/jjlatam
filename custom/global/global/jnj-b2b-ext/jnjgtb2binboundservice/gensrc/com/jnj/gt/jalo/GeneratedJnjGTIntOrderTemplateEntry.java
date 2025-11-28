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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderTemplateEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderTemplateEntry extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute **/
	public static final String LINEID = "lineid";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute **/
	public static final String ORDERLINEID = "orderLineId";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute **/
	public static final String ORDERID = "orderId";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>JnjGTIntOrderTemplateEntry.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(LINEID, AttributeMode.INITIAL);
		tmp.put(ORDERLINEID, AttributeMode.INITIAL);
		tmp.put(ORDERID, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute.
	 * @return the lineid
	 */
	public Integer getLineid(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LINEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute.
	 * @return the lineid
	 */
	public Integer getLineid()
	{
		return getLineid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @return the lineid
	 */
	public int getLineidAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLineid( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @return the lineid
	 */
	public int getLineidAsPrimitive()
	{
		return getLineidAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @param value the lineid
	 */
	public void setLineid(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LINEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @param value the lineid
	 */
	public void setLineid(final Integer value)
	{
		setLineid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @param value the lineid
	 */
	public void setLineid(final SessionContext ctx, final int value)
	{
		setLineid( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.lineid</code> attribute. 
	 * @param value the lineid
	 */
	public void setLineid(final int value)
	{
		setLineid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute.
	 * @return the orderId
	 */
	public Integer getOrderId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute.
	 * @return the orderId
	 */
	public Integer getOrderId()
	{
		return getOrderId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @return the orderId
	 */
	public int getOrderIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getOrderId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @return the orderId
	 */
	public int getOrderIdAsPrimitive()
	{
		return getOrderIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @param value the orderId
	 */
	public void setOrderId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ORDERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @param value the orderId
	 */
	public void setOrderId(final Integer value)
	{
		setOrderId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @param value the orderId
	 */
	public void setOrderId(final SessionContext ctx, final int value)
	{
		setOrderId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderId</code> attribute. 
	 * @param value the orderId
	 */
	public void setOrderId(final int value)
	{
		setOrderId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute.
	 * @return the orderLineId
	 */
	public Integer getOrderLineId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ORDERLINEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute.
	 * @return the orderLineId
	 */
	public Integer getOrderLineId()
	{
		return getOrderLineId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @return the orderLineId
	 */
	public int getOrderLineIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getOrderLineId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @return the orderLineId
	 */
	public int getOrderLineIdAsPrimitive()
	{
		return getOrderLineIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ORDERLINEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final Integer value)
	{
		setOrderLineId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final SessionContext ctx, final int value)
	{
		setOrderLineId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final int value)
	{
		setOrderLineId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.product</code> attribute.
	 * @return the product
	 */
	public String getProduct(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.product</code> attribute.
	 * @return the product
	 */
	public String getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final String value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.quantity</code> attribute.
	 * @return the quantity
	 */
	public String getQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.quantity</code> attribute.
	 * @return the quantity
	 */
	public String getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final String value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplateEntry.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplateEntry.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
}
