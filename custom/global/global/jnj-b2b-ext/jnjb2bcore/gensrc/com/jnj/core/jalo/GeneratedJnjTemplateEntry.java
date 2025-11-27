/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjGTVariantProduct;
import com.jnj.core.jalo.JnjOrderTemplate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjTemplateEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjTemplateEntry extends GenericItem
{
	/** Qualifier of the <code>JnjTemplateEntry.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>JnjTemplateEntry.unitPrice</code> attribute **/
	public static final String UNITPRICE = "unitPrice";
	/** Qualifier of the <code>JnjTemplateEntry.totalPrice</code> attribute **/
	public static final String TOTALPRICE = "totalPrice";
	/** Qualifier of the <code>JnjTemplateEntry.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnjTemplateEntry.orderTemplate</code> attribute **/
	public static final String ORDERTEMPLATE = "orderTemplate";
	/** Qualifier of the <code>JnjTemplateEntry.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjTemplateEntry.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjTemplateEntry.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjTemplateEntry.orderLineId</code> attribute **/
	public static final String ORDERLINEID = "orderLineId";
	/** Qualifier of the <code>JnjTemplateEntry.referencedVariant</code> attribute **/
	public static final String REFERENCEDVARIANT = "referencedVariant";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(UNITPRICE, AttributeMode.INITIAL);
		tmp.put(TOTALPRICE, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(ORDERTEMPLATE, AttributeMode.INITIAL);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(ORDERLINEID, AttributeMode.INITIAL);
		tmp.put(REFERENCEDVARIANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.orderLineId</code> attribute.
	 * @return the orderLineId
	 */
	public String getOrderLineId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERLINEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.orderLineId</code> attribute.
	 * @return the orderLineId
	 */
	public String getOrderLineId()
	{
		return getOrderLineId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERLINEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.orderLineId</code> attribute. 
	 * @param value the orderLineId
	 */
	public void setOrderLineId(final String value)
	{
		setOrderLineId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.orderTemplate</code> attribute.
	 * @return the orderTemplate
	 */
	public JnjOrderTemplate getOrderTemplate(final SessionContext ctx)
	{
		return (JnjOrderTemplate)getProperty( ctx, ORDERTEMPLATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.orderTemplate</code> attribute.
	 * @return the orderTemplate
	 */
	public JnjOrderTemplate getOrderTemplate()
	{
		return getOrderTemplate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.orderTemplate</code> attribute. 
	 * @param value the orderTemplate
	 */
	public void setOrderTemplate(final SessionContext ctx, final JnjOrderTemplate value)
	{
		setProperty(ctx, ORDERTEMPLATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.orderTemplate</code> attribute. 
	 * @param value the orderTemplate
	 */
	public void setOrderTemplate(final JnjOrderTemplate value)
	{
		setOrderTemplate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final JnJProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final JnJProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive(final SessionContext ctx)
	{
		Long value = getQty( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive()
	{
		return getQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final Long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final long value)
	{
		setQty( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant(final SessionContext ctx)
	{
		return (JnjGTVariantProduct)getProperty( ctx, REFERENCEDVARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.referencedVariant</code> attribute.
	 * @return the referencedVariant
	 */
	public JnjGTVariantProduct getReferencedVariant()
	{
		return getReferencedVariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final SessionContext ctx, final JnjGTVariantProduct value)
	{
		setProperty(ctx, REFERENCEDVARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.referencedVariant</code> attribute. 
	 * @param value the referencedVariant
	 */
	public void setReferencedVariant(final JnjGTVariantProduct value)
	{
		setReferencedVariant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.totalPrice</code> attribute.
	 * @return the totalPrice
	 */
	public Double getTotalPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.totalPrice</code> attribute.
	 * @return the totalPrice
	 */
	public Double getTotalPrice()
	{
		return getTotalPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @return the totalPrice
	 */
	public double getTotalPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @return the totalPrice
	 */
	public double getTotalPriceAsPrimitive()
	{
		return getTotalPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final Double value)
	{
		setTotalPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final SessionContext ctx, final double value)
	{
		setTotalPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.totalPrice</code> attribute. 
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final double value)
	{
		setTotalPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public Double getUnitPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, UNITPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.unitPrice</code> attribute.
	 * @return the unitPrice
	 */
	public Double getUnitPrice()
	{
		return getUnitPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @return the unitPrice
	 */
	public double getUnitPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getUnitPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @return the unitPrice
	 */
	public double getUnitPriceAsPrimitive()
	{
		return getUnitPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, UNITPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final Double value)
	{
		setUnitPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final SessionContext ctx, final double value)
	{
		setUnitPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjTemplateEntry.unitPrice</code> attribute. 
	 * @param value the unitPrice
	 */
	public void setUnitPrice(final double value)
	{
		setUnitPrice( getSession().getSessionContext(), value );
	}
	
}
