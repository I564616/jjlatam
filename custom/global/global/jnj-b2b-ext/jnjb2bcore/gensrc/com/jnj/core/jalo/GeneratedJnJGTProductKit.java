/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTProductKit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTProductKit extends GenericItem
{
	/** Qualifier of the <code>JnJGTProductKit.featureCode</code> attribute **/
	public static final String FEATURECODE = "featureCode";
	/** Qualifier of the <code>JnJGTProductKit.featureName</code> attribute **/
	public static final String FEATURENAME = "featureName";
	/** Qualifier of the <code>JnJGTProductKit.featureQty</code> attribute **/
	public static final String FEATUREQTY = "featureQty";
	/** Qualifier of the <code>JnJGTProductKit.componentQty</code> attribute **/
	public static final String COMPONENTQTY = "componentQty";
	/** Qualifier of the <code>JnJGTProductKit.componentCode</code> attribute **/
	public static final String COMPONENTCODE = "componentCode";
	/** Qualifier of the <code>JnJGTProductKit.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnJGTProductKit.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Relation ordering override parameter constants for JnjGTProduct2JnjGTProductKit from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_SRC_ORDERED = "relation.JnjGTProduct2JnjGTProductKit.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_TGT_ORDERED = "relation.JnjGTProduct2JnjGTProductKit.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnjGTProductKit from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED = "relation.JnjGTProduct2JnjGTProductKit.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FEATURECODE, AttributeMode.INITIAL);
		tmp.put(FEATURENAME, AttributeMode.INITIAL);
		tmp.put(FEATUREQTY, AttributeMode.INITIAL);
		tmp.put(COMPONENTQTY, AttributeMode.INITIAL);
		tmp.put(COMPONENTCODE, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentCode</code> attribute.
	 * @return the componentCode
	 */
	public String getComponentCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPONENTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentCode</code> attribute.
	 * @return the componentCode
	 */
	public String getComponentCode()
	{
		return getComponentCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentCode</code> attribute. 
	 * @param value the componentCode
	 */
	public void setComponentCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPONENTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentCode</code> attribute. 
	 * @param value the componentCode
	 */
	public void setComponentCode(final String value)
	{
		setComponentCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentQty</code> attribute.
	 * @return the componentQty
	 */
	public Double getComponentQty(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPONENTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentQty</code> attribute.
	 * @return the componentQty
	 */
	public Double getComponentQty()
	{
		return getComponentQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @return the componentQty
	 */
	public double getComponentQtyAsPrimitive(final SessionContext ctx)
	{
		Double value = getComponentQty( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @return the componentQty
	 */
	public double getComponentQtyAsPrimitive()
	{
		return getComponentQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPONENTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final Double value)
	{
		setComponentQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final SessionContext ctx, final double value)
	{
		setComponentQty( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final double value)
	{
		setComponentQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureCode</code> attribute.
	 * @return the featureCode
	 */
	public String getFeatureCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FEATURECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureCode</code> attribute.
	 * @return the featureCode
	 */
	public String getFeatureCode()
	{
		return getFeatureCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureCode</code> attribute. 
	 * @param value the featureCode
	 */
	public void setFeatureCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FEATURECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureCode</code> attribute. 
	 * @param value the featureCode
	 */
	public void setFeatureCode(final String value)
	{
		setFeatureCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureName</code> attribute.
	 * @return the featureName
	 */
	public String getFeatureName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FEATURENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureName</code> attribute.
	 * @return the featureName
	 */
	public String getFeatureName()
	{
		return getFeatureName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureName</code> attribute. 
	 * @param value the featureName
	 */
	public void setFeatureName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FEATURENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureName</code> attribute. 
	 * @param value the featureName
	 */
	public void setFeatureName(final String value)
	{
		setFeatureName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureQty</code> attribute.
	 * @return the featureQty
	 */
	public Integer getFeatureQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FEATUREQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureQty</code> attribute.
	 * @return the featureQty
	 */
	public Integer getFeatureQty()
	{
		return getFeatureQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @return the featureQty
	 */
	public int getFeatureQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFeatureQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @return the featureQty
	 */
	public int getFeatureQtyAsPrimitive()
	{
		return getFeatureQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @param value the featureQty
	 */
	public void setFeatureQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FEATUREQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @param value the featureQty
	 */
	public void setFeatureQty(final Integer value)
	{
		setFeatureQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @param value the featureQty
	 */
	public void setFeatureQty(final SessionContext ctx, final int value)
	{
		setFeatureQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.featureQty</code> attribute. 
	 * @param value the featureQty
	 */
	public void setFeatureQty(final int value)
	{
		setFeatureQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("JnJProduct");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.product</code> attribute.
	 * @return the product
	 */
	public Set<JnJProduct> getProduct(final SessionContext ctx)
	{
		final List<JnJProduct> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			"JnJProduct",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJProduct>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductKit.product</code> attribute.
	 * @return the product
	 */
	public Set<JnJProduct> getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	public long getProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			"JnJProduct",
			null
		);
	}
	
	public long getProductCount()
	{
		return getProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Set<JnJProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductKit.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Set<JnJProduct> value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final SessionContext ctx, final JnJProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final JnJProduct value)
	{
		addToProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final SessionContext ctx, final JnJProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTKIT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTKIT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final JnJProduct value)
	{
		removeFromProduct( getSession().getSessionContext(), value );
	}
	
}
