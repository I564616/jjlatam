/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJInvoiceOrder;
import com.jnj.core.jalo.JnJProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJInvoiceEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJInvoiceEntry extends GenericItem
{
	/** Qualifier of the <code>JnJInvoiceEntry.material</code> attribute **/
	public static final String MATERIAL = "material";
	/** Qualifier of the <code>JnJInvoiceEntry.itemNo</code> attribute **/
	public static final String ITEMNO = "itemNo";
	/** Qualifier of the <code>JnJInvoiceEntry.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnJInvoiceEntry.lotNo</code> attribute **/
	public static final String LOTNO = "lotNo";
	/** Qualifier of the <code>JnJInvoiceEntry.orderReason</code> attribute **/
	public static final String ORDERREASON = "orderReason";
	/** Qualifier of the <code>JnJInvoiceEntry.salesOrderItemNo</code> attribute **/
	public static final String SALESORDERITEMNO = "salesOrderItemNo";
	/** Qualifier of the <code>JnJInvoiceEntry.entries</code> attribute **/
	public static final String ENTRIES = "entries";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MATERIAL, AttributeMode.INITIAL);
		tmp.put(ITEMNO, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(LOTNO, AttributeMode.INITIAL);
		tmp.put(ORDERREASON, AttributeMode.INITIAL);
		tmp.put(SALESORDERITEMNO, AttributeMode.INITIAL);
		tmp.put(ENTRIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.entries</code> attribute.
	 * @return the entries
	 */
	public JnJInvoiceOrder getEntries(final SessionContext ctx)
	{
		return (JnJInvoiceOrder)getProperty( ctx, ENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.entries</code> attribute.
	 * @return the entries
	 */
	public JnJInvoiceOrder getEntries()
	{
		return getEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final SessionContext ctx, final JnJInvoiceOrder value)
	{
		setProperty(ctx, ENTRIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.entries</code> attribute. 
	 * @param value the entries
	 */
	public void setEntries(final JnJInvoiceOrder value)
	{
		setEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.itemNo</code> attribute.
	 * @return the itemNo
	 */
	public String getItemNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.itemNo</code> attribute.
	 * @return the itemNo
	 */
	public String getItemNo()
	{
		return getItemNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.itemNo</code> attribute. 
	 * @param value the itemNo
	 */
	public void setItemNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.itemNo</code> attribute. 
	 * @param value the itemNo
	 */
	public void setItemNo(final String value)
	{
		setItemNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.lotNo</code> attribute.
	 * @return the lotNo
	 */
	public String getLotNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.lotNo</code> attribute.
	 * @return the lotNo
	 */
	public String getLotNo()
	{
		return getLotNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.lotNo</code> attribute. 
	 * @param value the lotNo
	 */
	public void setLotNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.lotNo</code> attribute. 
	 * @param value the lotNo
	 */
	public void setLotNo(final String value)
	{
		setLotNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.material</code> attribute.
	 * @return the material
	 */
	public JnJProduct getMaterial(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, MATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.material</code> attribute.
	 * @return the material
	 */
	public JnJProduct getMaterial()
	{
		return getMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final SessionContext ctx, final JnJProduct value)
	{
		setProperty(ctx, MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final JnJProduct value)
	{
		setMaterial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.orderReason</code> attribute.
	 * @return the orderReason
	 */
	public String getOrderReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.orderReason</code> attribute.
	 * @return the orderReason
	 */
	public String getOrderReason()
	{
		return getOrderReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.orderReason</code> attribute. 
	 * @param value the orderReason
	 */
	public void setOrderReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.orderReason</code> attribute. 
	 * @param value the orderReason
	 */
	public void setOrderReason(final String value)
	{
		setOrderReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Integer getQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.qty</code> attribute.
	 * @return the qty
	 */
	public Integer getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public int getQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @return the qty
	 */
	public int getQtyAsPrimitive()
	{
		return getQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final Integer value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final int value)
	{
		setQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final int value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.salesOrderItemNo</code> attribute.
	 * @return the salesOrderItemNo
	 */
	public String getSalesOrderItemNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORDERITEMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJInvoiceEntry.salesOrderItemNo</code> attribute.
	 * @return the salesOrderItemNo
	 */
	public String getSalesOrderItemNo()
	{
		return getSalesOrderItemNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.salesOrderItemNo</code> attribute. 
	 * @param value the salesOrderItemNo
	 */
	public void setSalesOrderItemNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORDERITEMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJInvoiceEntry.salesOrderItemNo</code> attribute. 
	 * @param value the salesOrderItemNo
	 */
	public void setSalesOrderItemNo(final String value)
	{
		setSalesOrderItemNo( getSession().getSessionContext(), value );
	}
	
}
