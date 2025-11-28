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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTProductUnitLocal}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTProductUnitLocal extends GenericItem
{
	/** Qualifier of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute **/
	public static final String PCKGLVLQTY = "pckgLvlQty";
	/** Qualifier of the <code>JnJGTProductUnitLocal.lwrPckgLvlUomCode</code> attribute **/
	public static final String LWRPCKGLVLUOMCODE = "lwrPckgLvlUomCode";
	/** Qualifier of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute **/
	public static final String LWRPCKGLVLQTY = "lwrPckgLvlQty";
	/** Qualifier of the <code>JnJGTProductUnitLocal.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>JnJGTProductUnitLocal.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute **/
	public static final String SELLUNITIND = "sellUnitInd";
	/** Qualifier of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute **/
	public static final String SHIPUNITIND = "shipUnitInd";
	/** Qualifier of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute **/
	public static final String RCVUNITIND = "rcvUnitInd";
	/** Qualifier of the <code>JnJGTProductUnitLocal.linerUomCode</code> attribute **/
	public static final String LINERUOMCODE = "linerUomCode";
	/** Qualifier of the <code>JnJGTProductUnitLocal.linerUomName</code> attribute **/
	public static final String LINERUOMNAME = "linerUomName";
	/** Qualifier of the <code>JnJGTProductUnitLocal.depth</code> attribute **/
	public static final String DEPTH = "depth";
	/** Qualifier of the <code>JnJGTProductUnitLocal.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>JnJGTProductUnitLocal.width</code> attribute **/
	public static final String WIDTH = "width";
	/** Qualifier of the <code>JnJGTProductUnitLocal.volumeUomCode</code> attribute **/
	public static final String VOLUMEUOMCODE = "volumeUomCode";
	/** Qualifier of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute **/
	public static final String VOLUMEUOMQTY = "volumeUomQty";
	/** Qualifier of the <code>JnJGTProductUnitLocal.weightUomCode</code> attribute **/
	public static final String WEIGHTUOMCODE = "weightUomCode";
	/** Qualifier of the <code>JnJGTProductUnitLocal.weightUomName</code> attribute **/
	public static final String WEIGHTUOMNAME = "weightUomName";
	/** Qualifier of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute **/
	public static final String GROSSWEIGHTQTY = "grossWeightQty";
	/** Qualifier of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute **/
	public static final String NETWEIGHTQTY = "netWeightQty";
	/** Qualifier of the <code>JnJGTProductUnitLocal.gtin</code> attribute **/
	public static final String GTIN = "gtin";
	/** Qualifier of the <code>JnJGTProductUnitLocal.jnJProduct</code> attribute **/
	public static final String JNJPRODUCT = "jnJProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JNJPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnJGTProductUnitLocal> JNJPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedJnJGTProductUnitLocal>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTUNITLOCAL,
	false,
	"jnJProduct",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PCKGLVLQTY, AttributeMode.INITIAL);
		tmp.put(LWRPCKGLVLUOMCODE, AttributeMode.INITIAL);
		tmp.put(LWRPCKGLVLQTY, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(SELLUNITIND, AttributeMode.INITIAL);
		tmp.put(SHIPUNITIND, AttributeMode.INITIAL);
		tmp.put(RCVUNITIND, AttributeMode.INITIAL);
		tmp.put(LINERUOMCODE, AttributeMode.INITIAL);
		tmp.put(LINERUOMNAME, AttributeMode.INITIAL);
		tmp.put(DEPTH, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(WIDTH, AttributeMode.INITIAL);
		tmp.put(VOLUMEUOMCODE, AttributeMode.INITIAL);
		tmp.put(VOLUMEUOMQTY, AttributeMode.INITIAL);
		tmp.put(WEIGHTUOMCODE, AttributeMode.INITIAL);
		tmp.put(WEIGHTUOMNAME, AttributeMode.INITIAL);
		tmp.put(GROSSWEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(NETWEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(GTIN, AttributeMode.INITIAL);
		tmp.put(JNJPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		JNJPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.depth</code> attribute.
	 * @return the depth
	 */
	public Integer getDepth(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DEPTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.depth</code> attribute.
	 * @return the depth
	 */
	public Integer getDepth()
	{
		return getDepth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @return the depth
	 */
	public int getDepthAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDepth( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @return the depth
	 */
	public int getDepthAsPrimitive()
	{
		return getDepthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DEPTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final Integer value)
	{
		setDepth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final SessionContext ctx, final int value)
	{
		setDepth( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final int value)
	{
		setDepth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute.
	 * @return the grossWeightQty
	 */
	public Integer getGrossWeightQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, GROSSWEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute.
	 * @return the grossWeightQty
	 */
	public Integer getGrossWeightQty()
	{
		return getGrossWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @return the grossWeightQty
	 */
	public int getGrossWeightQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getGrossWeightQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @return the grossWeightQty
	 */
	public int getGrossWeightQtyAsPrimitive()
	{
		return getGrossWeightQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @param value the grossWeightQty
	 */
	public void setGrossWeightQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, GROSSWEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @param value the grossWeightQty
	 */
	public void setGrossWeightQty(final Integer value)
	{
		setGrossWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @param value the grossWeightQty
	 */
	public void setGrossWeightQty(final SessionContext ctx, final int value)
	{
		setGrossWeightQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.grossWeightQty</code> attribute. 
	 * @param value the grossWeightQty
	 */
	public void setGrossWeightQty(final int value)
	{
		setGrossWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin()
	{
		return getGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final String value)
	{
		setGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.height</code> attribute.
	 * @return the height
	 */
	public Integer getHeight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.height</code> attribute.
	 * @return the height
	 */
	public Integer getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @return the height
	 */
	public int getHeightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHeight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @return the height
	 */
	public int getHeightAsPrimitive()
	{
		return getHeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final Integer value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final int value)
	{
		setHeight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final int value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.jnJProduct</code> attribute.
	 * @return the jnJProduct
	 */
	public JnJProduct getJnJProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, JNJPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.jnJProduct</code> attribute.
	 * @return the jnJProduct
	 */
	public JnJProduct getJnJProduct()
	{
		return getJnJProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.jnJProduct</code> attribute. 
	 * @param value the jnJProduct
	 */
	public void setJnJProduct(final SessionContext ctx, final JnJProduct value)
	{
		JNJPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.jnJProduct</code> attribute. 
	 * @param value the jnJProduct
	 */
	public void setJnJProduct(final JnJProduct value)
	{
		setJnJProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.linerUomCode</code> attribute.
	 * @return the linerUomCode
	 */
	public String getLinerUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINERUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.linerUomCode</code> attribute.
	 * @return the linerUomCode
	 */
	public String getLinerUomCode()
	{
		return getLinerUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.linerUomCode</code> attribute. 
	 * @param value the linerUomCode
	 */
	public void setLinerUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINERUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.linerUomCode</code> attribute. 
	 * @param value the linerUomCode
	 */
	public void setLinerUomCode(final String value)
	{
		setLinerUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.linerUomName</code> attribute.
	 * @return the linerUomName
	 */
	public String getLinerUomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINERUOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.linerUomName</code> attribute.
	 * @return the linerUomName
	 */
	public String getLinerUomName()
	{
		return getLinerUomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.linerUomName</code> attribute. 
	 * @param value the linerUomName
	 */
	public void setLinerUomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINERUOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.linerUomName</code> attribute. 
	 * @param value the linerUomName
	 */
	public void setLinerUomName(final String value)
	{
		setLinerUomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute.
	 * @return the lwrPckgLvlQty
	 */
	public Integer getLwrPckgLvlQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LWRPCKGLVLQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute.
	 * @return the lwrPckgLvlQty
	 */
	public Integer getLwrPckgLvlQty()
	{
		return getLwrPckgLvlQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @return the lwrPckgLvlQty
	 */
	public int getLwrPckgLvlQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLwrPckgLvlQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @return the lwrPckgLvlQty
	 */
	public int getLwrPckgLvlQtyAsPrimitive()
	{
		return getLwrPckgLvlQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @param value the lwrPckgLvlQty
	 */
	public void setLwrPckgLvlQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LWRPCKGLVLQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @param value the lwrPckgLvlQty
	 */
	public void setLwrPckgLvlQty(final Integer value)
	{
		setLwrPckgLvlQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @param value the lwrPckgLvlQty
	 */
	public void setLwrPckgLvlQty(final SessionContext ctx, final int value)
	{
		setLwrPckgLvlQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlQty</code> attribute. 
	 * @param value the lwrPckgLvlQty
	 */
	public void setLwrPckgLvlQty(final int value)
	{
		setLwrPckgLvlQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlUomCode</code> attribute.
	 * @return the lwrPckgLvlUomCode
	 */
	public String getLwrPckgLvlUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LWRPCKGLVLUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.lwrPckgLvlUomCode</code> attribute.
	 * @return the lwrPckgLvlUomCode
	 */
	public String getLwrPckgLvlUomCode()
	{
		return getLwrPckgLvlUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlUomCode</code> attribute. 
	 * @param value the lwrPckgLvlUomCode
	 */
	public void setLwrPckgLvlUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LWRPCKGLVLUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.lwrPckgLvlUomCode</code> attribute. 
	 * @param value the lwrPckgLvlUomCode
	 */
	public void setLwrPckgLvlUomCode(final String value)
	{
		setLwrPckgLvlUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute.
	 * @return the netWeightQty
	 */
	public Integer getNetWeightQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NETWEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute.
	 * @return the netWeightQty
	 */
	public Integer getNetWeightQty()
	{
		return getNetWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @return the netWeightQty
	 */
	public int getNetWeightQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNetWeightQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @return the netWeightQty
	 */
	public int getNetWeightQtyAsPrimitive()
	{
		return getNetWeightQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NETWEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final Integer value)
	{
		setNetWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final SessionContext ctx, final int value)
	{
		setNetWeightQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final int value)
	{
		setNetWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute.
	 * @return the pckgLvlQty
	 */
	public Integer getPckgLvlQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PCKGLVLQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute.
	 * @return the pckgLvlQty
	 */
	public Integer getPckgLvlQty()
	{
		return getPckgLvlQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @return the pckgLvlQty
	 */
	public int getPckgLvlQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPckgLvlQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @return the pckgLvlQty
	 */
	public int getPckgLvlQtyAsPrimitive()
	{
		return getPckgLvlQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @param value the pckgLvlQty
	 */
	public void setPckgLvlQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PCKGLVLQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @param value the pckgLvlQty
	 */
	public void setPckgLvlQty(final Integer value)
	{
		setPckgLvlQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @param value the pckgLvlQty
	 */
	public void setPckgLvlQty(final SessionContext ctx, final int value)
	{
		setPckgLvlQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.pckgLvlQty</code> attribute. 
	 * @param value the pckgLvlQty
	 */
	public void setPckgLvlQty(final int value)
	{
		setPckgLvlQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute.
	 * @return the rcvUnitInd
	 */
	public Boolean isRcvUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RCVUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute.
	 * @return the rcvUnitInd
	 */
	public Boolean isRcvUnitInd()
	{
		return isRcvUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @return the rcvUnitInd
	 */
	public boolean isRcvUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRcvUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @return the rcvUnitInd
	 */
	public boolean isRcvUnitIndAsPrimitive()
	{
		return isRcvUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RCVUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final Boolean value)
	{
		setRcvUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final SessionContext ctx, final boolean value)
	{
		setRcvUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final boolean value)
	{
		setRcvUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute.
	 * @return the sellUnitInd
	 */
	public Boolean isSellUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELLUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute.
	 * @return the sellUnitInd
	 */
	public Boolean isSellUnitInd()
	{
		return isSellUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @return the sellUnitInd
	 */
	public boolean isSellUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSellUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @return the sellUnitInd
	 */
	public boolean isSellUnitIndAsPrimitive()
	{
		return isSellUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELLUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final Boolean value)
	{
		setSellUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final SessionContext ctx, final boolean value)
	{
		setSellUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.sellUnitInd</code> attribute. 
	 * @param value the sellUnitInd
	 */
	public void setSellUnitInd(final boolean value)
	{
		setSellUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHIPUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd()
	{
		return isShipUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShipUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive()
	{
		return isShipUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHIPUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final Boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final boolean value)
	{
		setShipUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomCode</code> attribute.
	 * @return the volumeUomCode
	 */
	public String getVolumeUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VOLUMEUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomCode</code> attribute.
	 * @return the volumeUomCode
	 */
	public String getVolumeUomCode()
	{
		return getVolumeUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomCode</code> attribute. 
	 * @param value the volumeUomCode
	 */
	public void setVolumeUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VOLUMEUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomCode</code> attribute. 
	 * @param value the volumeUomCode
	 */
	public void setVolumeUomCode(final String value)
	{
		setVolumeUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute.
	 * @return the volumeUomQty
	 */
	public Integer getVolumeUomQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VOLUMEUOMQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute.
	 * @return the volumeUomQty
	 */
	public Integer getVolumeUomQty()
	{
		return getVolumeUomQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @return the volumeUomQty
	 */
	public int getVolumeUomQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getVolumeUomQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @return the volumeUomQty
	 */
	public int getVolumeUomQtyAsPrimitive()
	{
		return getVolumeUomQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @param value the volumeUomQty
	 */
	public void setVolumeUomQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VOLUMEUOMQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @param value the volumeUomQty
	 */
	public void setVolumeUomQty(final Integer value)
	{
		setVolumeUomQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @param value the volumeUomQty
	 */
	public void setVolumeUomQty(final SessionContext ctx, final int value)
	{
		setVolumeUomQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.volumeUomQty</code> attribute. 
	 * @param value the volumeUomQty
	 */
	public void setVolumeUomQty(final int value)
	{
		setVolumeUomQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.weightUomCode</code> attribute.
	 * @return the weightUomCode
	 */
	public String getWeightUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHTUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.weightUomCode</code> attribute.
	 * @return the weightUomCode
	 */
	public String getWeightUomCode()
	{
		return getWeightUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.weightUomCode</code> attribute. 
	 * @param value the weightUomCode
	 */
	public void setWeightUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHTUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.weightUomCode</code> attribute. 
	 * @param value the weightUomCode
	 */
	public void setWeightUomCode(final String value)
	{
		setWeightUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.weightUomName</code> attribute.
	 * @return the weightUomName
	 */
	public String getWeightUomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHTUOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.weightUomName</code> attribute.
	 * @return the weightUomName
	 */
	public String getWeightUomName()
	{
		return getWeightUomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.weightUomName</code> attribute. 
	 * @param value the weightUomName
	 */
	public void setWeightUomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHTUOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.weightUomName</code> attribute. 
	 * @param value the weightUomName
	 */
	public void setWeightUomName(final String value)
	{
		setWeightUomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.width</code> attribute.
	 * @return the width
	 */
	public Integer getWidth(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WIDTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.width</code> attribute.
	 * @return the width
	 */
	public Integer getWidth()
	{
		return getWidth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @return the width
	 */
	public int getWidthAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWidth( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @return the width
	 */
	public int getWidthAsPrimitive()
	{
		return getWidthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WIDTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final Integer value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final SessionContext ctx, final int value)
	{
		setWidth( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTProductUnitLocal.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final int value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
}
