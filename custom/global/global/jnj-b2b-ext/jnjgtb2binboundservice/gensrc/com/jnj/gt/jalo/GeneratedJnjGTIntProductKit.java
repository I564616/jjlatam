/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProductKit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProductKit extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntProductKit.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnjGTIntProductKit.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntProductKit.componentCode</code> attribute **/
	public static final String COMPONENTCODE = "componentCode";
	/** Qualifier of the <code>JnjGTIntProductKit.kitFeatureCode</code> attribute **/
	public static final String KITFEATURECODE = "kitFeatureCode";
	/** Qualifier of the <code>JnjGTIntProductKit.kitFeatureName</code> attribute **/
	public static final String KITFEATURENAME = "kitFeatureName";
	/** Qualifier of the <code>JnjGTIntProductKit.kitFeatureQty</code> attribute **/
	public static final String KITFEATUREQTY = "kitFeatureQty";
	/** Qualifier of the <code>JnjGTIntProductKit.componentQty</code> attribute **/
	public static final String COMPONENTQTY = "componentQty";
	/** Qualifier of the <code>JnjGTIntProductKit.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(COMPONENTCODE, AttributeMode.INITIAL);
		tmp.put(KITFEATURECODE, AttributeMode.INITIAL);
		tmp.put(KITFEATURENAME, AttributeMode.INITIAL);
		tmp.put(KITFEATUREQTY, AttributeMode.INITIAL);
		tmp.put(COMPONENTQTY, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.componentCode</code> attribute.
	 * @return the componentCode
	 */
	public String getComponentCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPONENTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.componentCode</code> attribute.
	 * @return the componentCode
	 */
	public String getComponentCode()
	{
		return getComponentCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.componentCode</code> attribute. 
	 * @param value the componentCode
	 */
	public void setComponentCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPONENTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.componentCode</code> attribute. 
	 * @param value the componentCode
	 */
	public void setComponentCode(final String value)
	{
		setComponentCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.componentQty</code> attribute.
	 * @return the componentQty
	 */
	public String getComponentQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPONENTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.componentQty</code> attribute.
	 * @return the componentQty
	 */
	public String getComponentQty()
	{
		return getComponentQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPONENTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.componentQty</code> attribute. 
	 * @param value the componentQty
	 */
	public void setComponentQty(final String value)
	{
		setComponentQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureCode</code> attribute.
	 * @return the kitFeatureCode
	 */
	public String getKitFeatureCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KITFEATURECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureCode</code> attribute.
	 * @return the kitFeatureCode
	 */
	public String getKitFeatureCode()
	{
		return getKitFeatureCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureCode</code> attribute. 
	 * @param value the kitFeatureCode
	 */
	public void setKitFeatureCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KITFEATURECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureCode</code> attribute. 
	 * @param value the kitFeatureCode
	 */
	public void setKitFeatureCode(final String value)
	{
		setKitFeatureCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureName</code> attribute.
	 * @return the kitFeatureName
	 */
	public String getKitFeatureName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KITFEATURENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureName</code> attribute.
	 * @return the kitFeatureName
	 */
	public String getKitFeatureName()
	{
		return getKitFeatureName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureName</code> attribute. 
	 * @param value the kitFeatureName
	 */
	public void setKitFeatureName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KITFEATURENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureName</code> attribute. 
	 * @param value the kitFeatureName
	 */
	public void setKitFeatureName(final String value)
	{
		setKitFeatureName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureQty</code> attribute.
	 * @return the kitFeatureQty
	 */
	public String getKitFeatureQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KITFEATUREQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.kitFeatureQty</code> attribute.
	 * @return the kitFeatureQty
	 */
	public String getKitFeatureQty()
	{
		return getKitFeatureQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureQty</code> attribute. 
	 * @param value the kitFeatureQty
	 */
	public void setKitFeatureQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KITFEATUREQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.kitFeatureQty</code> attribute. 
	 * @param value the kitFeatureQty
	 */
	public void setKitFeatureQty(final String value)
	{
		setKitFeatureQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductKit.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductKit.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
}
