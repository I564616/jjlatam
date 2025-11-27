/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTProductPlant}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTProductPlant extends GenericItem
{
	/** Qualifier of the <code>JnjGTProductPlant.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnjGTProductPlant.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjGTProductPlant.batchMgmt</code> attribute **/
	public static final String BATCHMGMT = "batchMgmt";
	/** Qualifier of the <code>JnjGTProductPlant.prodPlnt</code> attribute **/
	public static final String PRODPLNT = "prodPlnt";
	/** Qualifier of the <code>JnjGTProductPlant.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for JnjGTProduct2JnjGTProductPlant from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_SRC_ORDERED = "relation.JnjGTProduct2JnjGTProductPlant.source.ordered";
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_TGT_ORDERED = "relation.JnjGTProduct2JnjGTProductPlant.target.ordered";
	/** Relation disable markmodifed parameter constants for JnjGTProduct2JnjGTProductPlant from ((jnjb2bcore))*/
	protected static String JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED = "relation.JnjGTProduct2JnjGTProductPlant.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(BATCHMGMT, AttributeMode.INITIAL);
		tmp.put(PRODPLNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public String getBatchMgmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BATCHMGMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public String getBatchMgmt()
	{
		return getBatchMgmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BATCHMGMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final String value)
	{
		setBatchMgmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.prodPlnt</code> attribute.
	 * @return the prodPlnt
	 */
	public String getProdPlnt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODPLNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.prodPlnt</code> attribute.
	 * @return the prodPlnt
	 */
	public String getProdPlnt()
	{
		return getProdPlnt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.prodPlnt</code> attribute. 
	 * @param value the prodPlnt
	 */
	public void setProdPlnt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODPLNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.prodPlnt</code> attribute. 
	 * @param value the prodPlnt
	 */
	public void setProdPlnt(final String value)
	{
		setProdPlnt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.products</code> attribute.
	 * @return the products
	 */
	public Set<JnJProduct> getProducts(final SessionContext ctx)
	{
		final List<JnJProduct> items = getLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			"JnJProduct",
			null,
			false,
			false
		);
		return new LinkedHashSet<JnJProduct>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductPlant.products</code> attribute.
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
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			"JnJProduct",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Set<JnJProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductPlant.products</code> attribute. 
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
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
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
			Jnjb2bCoreConstants.Relations.JNJGTPRODUCT2JNJGTPRODUCTPLANT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(JNJGTPRODUCT2JNJGTPRODUCTPLANT_MARKMODIFIED)
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
	
}
