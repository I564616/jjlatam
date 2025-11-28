/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjContractEntryPrice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjContractEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjContractEntry extends GenericItem
{
	/** Qualifier of the <code>JnjContractEntry.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>JnjContractEntry.contractPrice</code> attribute **/
	public static final String CONTRACTPRICE = "contractPrice";
	/** Qualifier of the <code>JnjContractEntry.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnjContractEntry.tenderLineNum</code> attribute **/
	public static final String TENDERLINENUM = "tenderLineNum";
	/** Qualifier of the <code>JnjContractEntry.lineNum</code> attribute **/
	public static final String LINENUM = "lineNum";
	/** Qualifier of the <code>JnjContractEntry.contractQty</code> attribute **/
	public static final String CONTRACTQTY = "contractQty";
	/** Qualifier of the <code>JnjContractEntry.contractBalanceQty</code> attribute **/
	public static final String CONTRACTBALANCEQTY = "contractBalanceQty";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(CONTRACTPRICE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(TENDERLINENUM, AttributeMode.INITIAL);
		tmp.put(LINENUM, AttributeMode.INITIAL);
		tmp.put(CONTRACTQTY, AttributeMode.INITIAL);
		tmp.put(CONTRACTBALANCEQTY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractBalanceQty</code> attribute.
	 * @return the contractBalanceQty
	 */
	public Integer getContractBalanceQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CONTRACTBALANCEQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractBalanceQty</code> attribute.
	 * @return the contractBalanceQty
	 */
	public Integer getContractBalanceQty()
	{
		return getContractBalanceQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @return the contractBalanceQty
	 */
	public int getContractBalanceQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getContractBalanceQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @return the contractBalanceQty
	 */
	public int getContractBalanceQtyAsPrimitive()
	{
		return getContractBalanceQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @param value the contractBalanceQty
	 */
	public void setContractBalanceQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CONTRACTBALANCEQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @param value the contractBalanceQty
	 */
	public void setContractBalanceQty(final Integer value)
	{
		setContractBalanceQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @param value the contractBalanceQty
	 */
	public void setContractBalanceQty(final SessionContext ctx, final int value)
	{
		setContractBalanceQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractBalanceQty</code> attribute. 
	 * @param value the contractBalanceQty
	 */
	public void setContractBalanceQty(final int value)
	{
		setContractBalanceQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractPrice</code> attribute.
	 * @return the contractPrice
	 */
	public JnjContractEntryPrice getContractPrice(final SessionContext ctx)
	{
		return (JnjContractEntryPrice)getProperty( ctx, CONTRACTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractPrice</code> attribute.
	 * @return the contractPrice
	 */
	public JnjContractEntryPrice getContractPrice()
	{
		return getContractPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractPrice</code> attribute. 
	 * @param value the contractPrice
	 */
	public void setContractPrice(final SessionContext ctx, final JnjContractEntryPrice value)
	{
		setProperty(ctx, CONTRACTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractPrice</code> attribute. 
	 * @param value the contractPrice
	 */
	public void setContractPrice(final JnjContractEntryPrice value)
	{
		setContractPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractQty</code> attribute.
	 * @return the contractQty
	 */
	public Integer getContractQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CONTRACTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractQty</code> attribute.
	 * @return the contractQty
	 */
	public Integer getContractQty()
	{
		return getContractQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @return the contractQty
	 */
	public int getContractQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getContractQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @return the contractQty
	 */
	public int getContractQtyAsPrimitive()
	{
		return getContractQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CONTRACTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final Integer value)
	{
		setContractQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final SessionContext ctx, final int value)
	{
		setContractQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final int value)
	{
		setContractQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public Integer getLineNum(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.lineNum</code> attribute.
	 * @return the lineNum
	 */
	public Integer getLineNum()
	{
		return getLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @return the lineNum
	 */
	public int getLineNumAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLineNum( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @return the lineNum
	 */
	public int getLineNumAsPrimitive()
	{
		return getLineNumAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final Integer value)
	{
		setLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final SessionContext ctx, final int value)
	{
		setLineNum( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.lineNum</code> attribute. 
	 * @param value the lineNum
	 */
	public void setLineNum(final int value)
	{
		setLineNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final JnJProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final JnJProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.tenderLineNum</code> attribute.
	 * @return the tenderLineNum
	 */
	public String getTenderLineNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TENDERLINENUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContractEntry.tenderLineNum</code> attribute.
	 * @return the tenderLineNum
	 */
	public String getTenderLineNum()
	{
		return getTenderLineNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.tenderLineNum</code> attribute. 
	 * @param value the tenderLineNum
	 */
	public void setTenderLineNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TENDERLINENUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContractEntry.tenderLineNum</code> attribute. 
	 * @param value the tenderLineNum
	 */
	public void setTenderLineNum(final String value)
	{
		setTenderLineNum( getSession().getSessionContext(), value );
	}
	
}
