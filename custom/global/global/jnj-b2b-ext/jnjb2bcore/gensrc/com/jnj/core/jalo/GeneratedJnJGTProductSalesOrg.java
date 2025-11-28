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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTProductSalesOrg}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTProductSalesOrg extends GenericItem
{
	/** Qualifier of the <code>JnJGTProductSalesOrg.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnJGTProductSalesOrg.materialNum</code> attribute **/
	public static final String MATERIALNUM = "materialNum";
	/** Qualifier of the <code>JnJGTProductSalesOrg.salesOrgCode</code> attribute **/
	public static final String SALESORGCODE = "salesOrgCode";
	/** Qualifier of the <code>JnJGTProductSalesOrg.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>JnJGTProductSalesOrg.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for JnjGTProduct2JnJGTProductSalesOrg from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_SRC_ORDERED = "relation.JnjGTProduct2JnJGTProductSalesOrg.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_TGT_ORDERED = "relation.JnjGTProduct2JnJGTProductSalesOrg.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnJGTProductSalesOrg from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED = "relation.JnjGTProduct2JnJGTProductSalesOrg.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(MATERIALNUM, AttributeMode.INITIAL);
		tmp.put(SALESORGCODE, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.materialNum</code> attribute.
	 * @return the materialNum
	 */
	public String getMaterialNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.materialNum</code> attribute.
	 * @return the materialNum
	 */
	public String getMaterialNum()
	{
		return getMaterialNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.materialNum</code> attribute. 
	 * @param value the materialNum
	 */
	public void setMaterialNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.materialNum</code> attribute. 
	 * @param value the materialNum
	 */
	public void setMaterialNum(final String value)
	{
		setMaterialNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.products</code> attribute.
	 * @return the products
	 */
	public Set<JnJProduct> getProducts(final SessionContext ctx)
	{
		final List<JnJProduct> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			"JnJProduct",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJProduct>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.products</code> attribute.
	 * @return the products
	 */
	public Set<JnJProduct> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			"JnJProduct",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Set<JnJProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Set<JnJProduct> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final JnJProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final JnJProduct value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final JnJProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTSALESORG,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTSALESORG_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final JnJProduct value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductSalesOrg.salesOrgCode</code> attribute.
	 * @return the salesOrgCode
	 */
	public String getSalesOrgCode()
	{
		return getSalesOrgCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductSalesOrg.salesOrgCode</code> attribute. 
	 * @param value the salesOrgCode
	 */
	public void setSalesOrgCode(final String value)
	{
		setSalesOrgCode( getSession().getSessionContext(), value );
	}
	
}
