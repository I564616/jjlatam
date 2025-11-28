/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct JnjGTVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute **/
	public static final String DELIVERYGTININD = "deliveryGtinInd";
	/** Qualifier of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute **/
	public static final String SALESGTININD = "salesGtinInd";
	/** Qualifier of the <code>JnjGTVariantProduct.linearUom</code> attribute **/
	public static final String LINEARUOM = "linearUom";
	/** Qualifier of the <code>JnjGTVariantProduct.depth</code> attribute **/
	public static final String DEPTH = "depth";
	/** Qualifier of the <code>JnjGTVariantProduct.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>JnjGTVariantProduct.width</code> attribute **/
	public static final String WIDTH = "width";
	/** Qualifier of the <code>JnjGTVariantProduct.volumeUom</code> attribute **/
	public static final String VOLUMEUOM = "volumeUom";
	/** Qualifier of the <code>JnjGTVariantProduct.weightUom</code> attribute **/
	public static final String WEIGHTUOM = "weightUom";
	/** Qualifier of the <code>JnjGTVariantProduct.volumeQty</code> attribute **/
	public static final String VOLUMEQTY = "volumeQty";
	/** Qualifier of the <code>JnjGTVariantProduct.weightQty</code> attribute **/
	public static final String WEIGHTQTY = "weightQty";
	/** Qualifier of the <code>JnjGTVariantProduct.numerator</code> attribute **/
	public static final String NUMERATOR = "numerator";
	/** Qualifier of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute **/
	public static final String PACKAGINGLVLCODE = "packagingLvlCode";
	/** Qualifier of the <code>JnjGTVariantProduct.regionCode</code> attribute **/
	public static final String REGIONCODE = "regionCode";
	/** Qualifier of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute **/
	public static final String PACKAGINGLEVELQTY = "packagingLevelQty";
	/** Qualifier of the <code>JnjGTVariantProduct.lwrPackagingLvlUom</code> attribute **/
	public static final String LWRPACKAGINGLVLUOM = "lwrPackagingLvlUom";
	/** Qualifier of the <code>JnjGTVariantProduct.upc</code> attribute **/
	public static final String UPC = "upc";
	/** Qualifier of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute **/
	public static final String SELLUNITIND = "sellUnitInd";
	/** Qualifier of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute **/
	public static final String SHIPUNITIND = "shipUnitInd";
	/** Qualifier of the <code>JnjGTVariantProduct.netWeightQty</code> attribute **/
	public static final String NETWEIGHTQTY = "netWeightQty";
	/** Qualifier of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute **/
	public static final String INNERPACKPERCASE = "innerPackPerCase";
	/** Qualifier of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute **/
	public static final String TIERSPERPALLET = "tiersPerPallet";
	/** Qualifier of the <code>JnjGTVariantProduct.casesPerTier</code> attribute **/
	public static final String CASESPERTIER = "casesPerTier";
	/** Qualifier of the <code>JnjGTVariantProduct.outerCaseCode</code> attribute **/
	public static final String OUTERCASECODE = "outerCaseCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DELIVERYGTININD, AttributeMode.INITIAL);
		tmp.put(SALESGTININD, AttributeMode.INITIAL);
		tmp.put(LINEARUOM, AttributeMode.INITIAL);
		tmp.put(DEPTH, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(WIDTH, AttributeMode.INITIAL);
		tmp.put(VOLUMEUOM, AttributeMode.INITIAL);
		tmp.put(WEIGHTUOM, AttributeMode.INITIAL);
		tmp.put(VOLUMEQTY, AttributeMode.INITIAL);
		tmp.put(WEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(NUMERATOR, AttributeMode.INITIAL);
		tmp.put(PACKAGINGLVLCODE, AttributeMode.INITIAL);
		tmp.put(REGIONCODE, AttributeMode.INITIAL);
		tmp.put(PACKAGINGLEVELQTY, AttributeMode.INITIAL);
		tmp.put(LWRPACKAGINGLVLUOM, AttributeMode.INITIAL);
		tmp.put(UPC, AttributeMode.INITIAL);
		tmp.put(SELLUNITIND, AttributeMode.INITIAL);
		tmp.put(SHIPUNITIND, AttributeMode.INITIAL);
		tmp.put(NETWEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(INNERPACKPERCASE, AttributeMode.INITIAL);
		tmp.put(TIERSPERPALLET, AttributeMode.INITIAL);
		tmp.put(CASESPERTIER, AttributeMode.INITIAL);
		tmp.put(OUTERCASECODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute.
	 * @return the casesPerTier
	 */
	public Double getCasesPerTier(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CASESPERTIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute.
	 * @return the casesPerTier
	 */
	public Double getCasesPerTier()
	{
		return getCasesPerTier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @return the casesPerTier
	 */
	public double getCasesPerTierAsPrimitive(final SessionContext ctx)
	{
		Double value = getCasesPerTier( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @return the casesPerTier
	 */
	public double getCasesPerTierAsPrimitive()
	{
		return getCasesPerTierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CASESPERTIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final Double value)
	{
		setCasesPerTier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final SessionContext ctx, final double value)
	{
		setCasesPerTier( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final double value)
	{
		setCasesPerTier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute.
	 * @return the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public Boolean isDeliveryGtinInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELIVERYGTININD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute.
	 * @return the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public Boolean isDeliveryGtinInd()
	{
		return isDeliveryGtinInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @return the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public boolean isDeliveryGtinIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeliveryGtinInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @return the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public boolean isDeliveryGtinIndAsPrimitive()
	{
		return isDeliveryGtinIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @param value the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public void setDeliveryGtinInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELIVERYGTININD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @param value the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public void setDeliveryGtinInd(final Boolean value)
	{
		setDeliveryGtinInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @param value the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public void setDeliveryGtinInd(final SessionContext ctx, final boolean value)
	{
		setDeliveryGtinInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.deliveryGtinInd</code> attribute. 
	 * @param value the deliveryGtinInd - Indicates if the variant has the default UOM for the product.
	 */
	public void setDeliveryGtinInd(final boolean value)
	{
		setDeliveryGtinInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.depth</code> attribute.
	 * @return the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public Double getDepth(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DEPTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.depth</code> attribute.
	 * @return the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public Double getDepth()
	{
		return getDepth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @return the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public double getDepthAsPrimitive(final SessionContext ctx)
	{
		Double value = getDepth( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @return the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public double getDepthAsPrimitive()
	{
		return getDepthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @param value the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public void setDepth(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DEPTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @param value the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public void setDepth(final Double value)
	{
		setDepth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @param value the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public void setDepth(final SessionContext ctx, final double value)
	{
		setDepth( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.depth</code> attribute. 
	 * @param value the depth - This field contains the physical depth measurement associated with the Linear UOM Code.
	 */
	public void setDepth(final double value)
	{
		setDepth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.height</code> attribute.
	 * @return the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public Double getHeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.height</code> attribute.
	 * @return the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public Double getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @return the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public double getHeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getHeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @return the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public double getHeightAsPrimitive()
	{
		return getHeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @param value the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public void setHeight(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @param value the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public void setHeight(final Double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @param value the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public void setHeight(final SessionContext ctx, final double value)
	{
		setHeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.height</code> attribute. 
	 * @param value the height - This field contains the physical height measurement associated with the Linear UOM Code.
	 */
	public void setHeight(final double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute.
	 * @return the innerPackPerCase
	 */
	public Double getInnerPackPerCase(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INNERPACKPERCASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute.
	 * @return the innerPackPerCase
	 */
	public Double getInnerPackPerCase()
	{
		return getInnerPackPerCase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @return the innerPackPerCase
	 */
	public double getInnerPackPerCaseAsPrimitive(final SessionContext ctx)
	{
		Double value = getInnerPackPerCase( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @return the innerPackPerCase
	 */
	public double getInnerPackPerCaseAsPrimitive()
	{
		return getInnerPackPerCaseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INNERPACKPERCASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final Double value)
	{
		setInnerPackPerCase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final SessionContext ctx, final double value)
	{
		setInnerPackPerCase( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final double value)
	{
		setInnerPackPerCase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.linearUom</code> attribute.
	 * @return the linearUom - This field contains the UOM code associated with the physical measurements (height, width and depth)
	 */
	public Unit getLinearUom(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, LINEARUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.linearUom</code> attribute.
	 * @return the linearUom - This field contains the UOM code associated with the physical measurements (height, width and depth)
	 */
	public Unit getLinearUom()
	{
		return getLinearUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.linearUom</code> attribute. 
	 * @param value the linearUom - This field contains the UOM code associated with the physical measurements (height, width and depth)
	 */
	public void setLinearUom(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, LINEARUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.linearUom</code> attribute. 
	 * @param value the linearUom - This field contains the UOM code associated with the physical measurements (height, width and depth)
	 */
	public void setLinearUom(final Unit value)
	{
		setLinearUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.lwrPackagingLvlUom</code> attribute.
	 * @return the lwrPackagingLvlUom - This will be the 'label' applied to the lower packaging level.
	 */
	public Unit getLwrPackagingLvlUom(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, LWRPACKAGINGLVLUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.lwrPackagingLvlUom</code> attribute.
	 * @return the lwrPackagingLvlUom - This will be the 'label' applied to the lower packaging level.
	 */
	public Unit getLwrPackagingLvlUom()
	{
		return getLwrPackagingLvlUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.lwrPackagingLvlUom</code> attribute. 
	 * @param value the lwrPackagingLvlUom - This will be the 'label' applied to the lower packaging level.
	 */
	public void setLwrPackagingLvlUom(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, LWRPACKAGINGLVLUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.lwrPackagingLvlUom</code> attribute. 
	 * @param value the lwrPackagingLvlUom - This will be the 'label' applied to the lower packaging level.
	 */
	public void setLwrPackagingLvlUom(final Unit value)
	{
		setLwrPackagingLvlUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute.
	 * @return the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public Double getNetWeightQty(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETWEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute.
	 * @return the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public Double getNetWeightQty()
	{
		return getNetWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @return the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public double getNetWeightQtyAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetWeightQty( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @return the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public double getNetWeightQtyAsPrimitive()
	{
		return getNetWeightQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @param value the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public void setNetWeightQty(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETWEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @param value the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public void setNetWeightQty(final Double value)
	{
		setNetWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @param value the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public void setNetWeightQty(final SessionContext ctx, final double value)
	{
		setNetWeightQty( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.netWeightQty</code> attribute. 
	 * @param value the netWeightQty - The net weight of an object disregards the weight (mass) of any element not intrinsic to the object itself.
	 */
	public void setNetWeightQty(final double value)
	{
		setNetWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.numerator</code> attribute.
	 * @return the numerator - Numerator used with Denominator for calculations.
	 */
	public Integer getNumerator(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.numerator</code> attribute.
	 * @return the numerator - Numerator used with Denominator for calculations.
	 */
	public Integer getNumerator()
	{
		return getNumerator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @return the numerator - Numerator used with Denominator for calculations.
	 */
	public int getNumeratorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumerator( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @return the numerator - Numerator used with Denominator for calculations.
	 */
	public int getNumeratorAsPrimitive()
	{
		return getNumeratorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @param value the numerator - Numerator used with Denominator for calculations.
	 */
	public void setNumerator(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @param value the numerator - Numerator used with Denominator for calculations.
	 */
	public void setNumerator(final Integer value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @param value the numerator - Numerator used with Denominator for calculations.
	 */
	public void setNumerator(final SessionContext ctx, final int value)
	{
		setNumerator( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.numerator</code> attribute. 
	 * @param value the numerator - Numerator used with Denominator for calculations.
	 */
	public void setNumerator(final int value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.outerCaseCode</code> attribute.
	 * @return the outerCaseCode - The Value coprresponds to EAN_UPC_NF from STG_PRODUCT_UNIT source stage table.
	 */
	public String getOuterCaseCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OUTERCASECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.outerCaseCode</code> attribute.
	 * @return the outerCaseCode - The Value coprresponds to EAN_UPC_NF from STG_PRODUCT_UNIT source stage table.
	 */
	public String getOuterCaseCode()
	{
		return getOuterCaseCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.outerCaseCode</code> attribute. 
	 * @param value the outerCaseCode - The Value coprresponds to EAN_UPC_NF from STG_PRODUCT_UNIT source stage table.
	 */
	public void setOuterCaseCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OUTERCASECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.outerCaseCode</code> attribute. 
	 * @param value the outerCaseCode - The Value coprresponds to EAN_UPC_NF from STG_PRODUCT_UNIT source stage table.
	 */
	public void setOuterCaseCode(final String value)
	{
		setOuterCaseCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute.
	 * @return the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public Integer getPackagingLevelQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PACKAGINGLEVELQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute.
	 * @return the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public Integer getPackagingLevelQty()
	{
		return getPackagingLevelQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @return the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public int getPackagingLevelQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPackagingLevelQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @return the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public int getPackagingLevelQtyAsPrimitive()
	{
		return getPackagingLevelQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public void setPackagingLevelQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PACKAGINGLEVELQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public void setPackagingLevelQty(final Integer value)
	{
		setPackagingLevelQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public void setPackagingLevelQty(final SessionContext ctx, final int value)
	{
		setPackagingLevelQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty - The number of eaches (as defined by packaging level 1) in this packaging level.
	 */
	public void setPackagingLevelQty(final int value)
	{
		setPackagingLevelQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute.
	 * @return the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public Integer getPackagingLvlCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PACKAGINGLVLCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute.
	 * @return the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public Integer getPackagingLvlCode()
	{
		return getPackagingLvlCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @return the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public int getPackagingLvlCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPackagingLvlCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @return the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public int getPackagingLvlCodeAsPrimitive()
	{
		return getPackagingLvlCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public void setPackagingLvlCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PACKAGINGLVLCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public void setPackagingLvlCode(final Integer value)
	{
		setPackagingLvlCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public void setPackagingLvlCode(final SessionContext ctx, final int value)
	{
		setPackagingLvlCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode - This code defines the packaging levels of a product code.
	 */
	public void setPackagingLvlCode(final int value)
	{
		setPackagingLvlCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.regionCode</code> attribute.
	 * @return the regionCode - This is used to indicate in which regions for which the UOM is applicable.
	 */
	public String getRegionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.regionCode</code> attribute.
	 * @return the regionCode - This is used to indicate in which regions for which the UOM is applicable.
	 */
	public String getRegionCode()
	{
		return getRegionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.regionCode</code> attribute. 
	 * @param value the regionCode - This is used to indicate in which regions for which the UOM is applicable.
	 */
	public void setRegionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.regionCode</code> attribute. 
	 * @param value the regionCode - This is used to indicate in which regions for which the UOM is applicable.
	 */
	public void setRegionCode(final String value)
	{
		setRegionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute.
	 * @return the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public Boolean isSalesGtinInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALESGTININD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute.
	 * @return the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public Boolean isSalesGtinInd()
	{
		return isSalesGtinInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @return the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public boolean isSalesGtinIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSalesGtinInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @return the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public boolean isSalesGtinIndAsPrimitive()
	{
		return isSalesGtinIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @param value the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public void setSalesGtinInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALESGTININD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @param value the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public void setSalesGtinInd(final Boolean value)
	{
		setSalesGtinInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @param value the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public void setSalesGtinInd(final SessionContext ctx, final boolean value)
	{
		setSalesGtinInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.salesGtinInd</code> attribute. 
	 * @param value the salesGtinInd - Defines if the UOM is the shipping unit of measure or not.
	 */
	public void setSalesGtinInd(final boolean value)
	{
		setSalesGtinInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute.
	 * @return the sellUnitInd
	 */
	public Boolean isSellUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELLUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute.
	 * @return the sellUnitInd
	 */
	public Boolean isSellUnitInd()
	{
		return isSellUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @return the sellUnitInd
	 */
	public boolean isSellUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSellUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @return the sellUnitInd
	 */
	public boolean isSellUnitIndAsPrimitive()
	{
		return isSellUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELLUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final Boolean value)
	{
		setSellUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final SessionContext ctx, final boolean value)
	{
		setSellUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final boolean value)
	{
		setSellUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHIPUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd()
	{
		return isShipUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShipUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive()
	{
		return isShipUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHIPUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final Boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final boolean value)
	{
		setShipUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute.
	 * @return the tiersPerPallet
	 */
	public Double getTiersPerPallet(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TIERSPERPALLET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute.
	 * @return the tiersPerPallet
	 */
	public Double getTiersPerPallet()
	{
		return getTiersPerPallet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @return the tiersPerPallet
	 */
	public double getTiersPerPalletAsPrimitive(final SessionContext ctx)
	{
		Double value = getTiersPerPallet( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @return the tiersPerPallet
	 */
	public double getTiersPerPalletAsPrimitive()
	{
		return getTiersPerPalletAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TIERSPERPALLET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final Double value)
	{
		setTiersPerPallet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final SessionContext ctx, final double value)
	{
		setTiersPerPallet( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final double value)
	{
		setTiersPerPallet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.upc</code> attribute.
	 * @return the upc - Non-formatted UPC code - Each = UPC, Case = Outer Case Code.
	 */
	public String getUpc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.upc</code> attribute.
	 * @return the upc - Non-formatted UPC code - Each = UPC, Case = Outer Case Code.
	 */
	public String getUpc()
	{
		return getUpc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.upc</code> attribute. 
	 * @param value the upc - Non-formatted UPC code - Each = UPC, Case = Outer Case Code.
	 */
	public void setUpc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.upc</code> attribute. 
	 * @param value the upc - Non-formatted UPC code - Each = UPC, Case = Outer Case Code.
	 */
	public void setUpc(final String value)
	{
		setUpc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeQty</code> attribute.
	 * @return the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public Double getVolumeQty(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VOLUMEQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeQty</code> attribute.
	 * @return the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public Double getVolumeQty()
	{
		return getVolumeQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @return the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public double getVolumeQtyAsPrimitive(final SessionContext ctx)
	{
		Double value = getVolumeQty( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @return the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public double getVolumeQtyAsPrimitive()
	{
		return getVolumeQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @param value the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public void setVolumeQty(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VOLUMEQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @param value the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public void setVolumeQty(final Double value)
	{
		setVolumeQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @param value the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public void setVolumeQty(final SessionContext ctx, final double value)
	{
		setVolumeQty( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeQty</code> attribute. 
	 * @param value the volumeQty - This field contains the physical volume measurement associated with the Volume UOM Code.
	 */
	public void setVolumeQty(final double value)
	{
		setVolumeQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeUom</code> attribute.
	 * @return the volumeUom - This field contains the UOM code associated with the physical volume measurement.
	 */
	public Unit getVolumeUom(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, VOLUMEUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.volumeUom</code> attribute.
	 * @return the volumeUom - This field contains the UOM code associated with the physical volume measurement.
	 */
	public Unit getVolumeUom()
	{
		return getVolumeUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeUom</code> attribute. 
	 * @param value the volumeUom - This field contains the UOM code associated with the physical volume measurement.
	 */
	public void setVolumeUom(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, VOLUMEUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.volumeUom</code> attribute. 
	 * @param value the volumeUom - This field contains the UOM code associated with the physical volume measurement.
	 */
	public void setVolumeUom(final Unit value)
	{
		setVolumeUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightQty</code> attribute.
	 * @return the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public Double getWeightQty(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightQty</code> attribute.
	 * @return the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public Double getWeightQty()
	{
		return getWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @return the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public double getWeightQtyAsPrimitive(final SessionContext ctx)
	{
		Double value = getWeightQty( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @return the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public double getWeightQtyAsPrimitive()
	{
		return getWeightQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @param value the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public void setWeightQty(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, WEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @param value the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public void setWeightQty(final Double value)
	{
		setWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @param value the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public void setWeightQty(final SessionContext ctx, final double value)
	{
		setWeightQty( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightQty</code> attribute. 
	 * @param value the weightQty - Gross Weight is the total weight of something, when combined with something else.
	 */
	public void setWeightQty(final double value)
	{
		setWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightUom</code> attribute.
	 * @return the weightUom - This field contains UOM Code associated with the weight measurement.
	 */
	public Unit getWeightUom(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, WEIGHTUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.weightUom</code> attribute.
	 * @return the weightUom - This field contains UOM Code associated with the weight measurement.
	 */
	public Unit getWeightUom()
	{
		return getWeightUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightUom</code> attribute. 
	 * @param value the weightUom - This field contains UOM Code associated with the weight measurement.
	 */
	public void setWeightUom(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, WEIGHTUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.weightUom</code> attribute. 
	 * @param value the weightUom - This field contains UOM Code associated with the weight measurement.
	 */
	public void setWeightUom(final Unit value)
	{
		setWeightUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.width</code> attribute.
	 * @return the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public Double getWidth(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WIDTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.width</code> attribute.
	 * @return the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public Double getWidth()
	{
		return getWidth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @return the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public double getWidthAsPrimitive(final SessionContext ctx)
	{
		Double value = getWidth( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @return the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public double getWidthAsPrimitive()
	{
		return getWidthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @param value the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public void setWidth(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, WIDTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @param value the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public void setWidth(final Double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @param value the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public void setWidth(final SessionContext ctx, final double value)
	{
		setWidth( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTVariantProduct.width</code> attribute. 
	 * @param value the width - This field contains the physical width measurement associated with the Width UOM Code.
	 */
	public void setWidth(final double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
}
