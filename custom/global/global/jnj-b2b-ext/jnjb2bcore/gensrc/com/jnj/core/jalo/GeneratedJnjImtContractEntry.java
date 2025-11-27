/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjImtContractEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjImtContractEntry extends GenericItem
{
	/** Qualifier of the <code>JnjImtContractEntry.materialNo</code> attribute **/
	public static final String MATERIALNO = "materialNo";
	/** Qualifier of the <code>JnjImtContractEntry.statusL</code> attribute **/
	public static final String STATUSL = "statusL";
	/** Qualifier of the <code>JnjImtContractEntry.tenderLineNo</code> attribute **/
	public static final String TENDERLINENO = "tenderLineNo";
	/** Qualifier of the <code>JnjImtContractEntry.netPrice</code> attribute **/
	public static final String NETPRICE = "netPrice";
	/** Qualifier of the <code>JnjImtContractEntry.lineNo</code> attribute **/
	public static final String LINENO = "lineNo";
	/** Qualifier of the <code>JnjImtContractEntry.contractQty</code> attribute **/
	public static final String CONTRACTQTY = "contractQty";
	/** Qualifier of the <code>JnjImtContractEntry.balanceQty</code> attribute **/
	public static final String BALANCEQTY = "balanceQty";
	/** Qualifier of the <code>JnjImtContractEntry.contractUom</code> attribute **/
	public static final String CONTRACTUOM = "contractUom";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MATERIALNO, AttributeMode.INITIAL);
		tmp.put(STATUSL, AttributeMode.INITIAL);
		tmp.put(TENDERLINENO, AttributeMode.INITIAL);
		tmp.put(NETPRICE, AttributeMode.INITIAL);
		tmp.put(LINENO, AttributeMode.INITIAL);
		tmp.put(CONTRACTQTY, AttributeMode.INITIAL);
		tmp.put(BALANCEQTY, AttributeMode.INITIAL);
		tmp.put(CONTRACTUOM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.balanceQty</code> attribute.
	 * @return the balanceQty
	 */
	public String getBalanceQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BALANCEQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.balanceQty</code> attribute.
	 * @return the balanceQty
	 */
	public String getBalanceQty()
	{
		return getBalanceQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.balanceQty</code> attribute. 
	 * @param value the balanceQty
	 */
	public void setBalanceQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BALANCEQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.balanceQty</code> attribute. 
	 * @param value the balanceQty
	 */
	public void setBalanceQty(final String value)
	{
		setBalanceQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.contractQty</code> attribute.
	 * @return the contractQty
	 */
	public String getContractQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.contractQty</code> attribute.
	 * @return the contractQty
	 */
	public String getContractQty()
	{
		return getContractQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.contractQty</code> attribute. 
	 * @param value the contractQty
	 */
	public void setContractQty(final String value)
	{
		setContractQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.contractUom</code> attribute.
	 * @return the contractUom
	 */
	public String getContractUom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTUOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.contractUom</code> attribute.
	 * @return the contractUom
	 */
	public String getContractUom()
	{
		return getContractUom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.contractUom</code> attribute. 
	 * @param value the contractUom
	 */
	public void setContractUom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTUOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.contractUom</code> attribute. 
	 * @param value the contractUom
	 */
	public void setContractUom(final String value)
	{
		setContractUom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.lineNo</code> attribute.
	 * @return the lineNo
	 */
	public String getLineNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.lineNo</code> attribute.
	 * @return the lineNo
	 */
	public String getLineNo()
	{
		return getLineNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.lineNo</code> attribute. 
	 * @param value the lineNo
	 */
	public void setLineNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.lineNo</code> attribute. 
	 * @param value the lineNo
	 */
	public void setLineNo(final String value)
	{
		setLineNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.materialNo</code> attribute.
	 * @return the materialNo
	 */
	public String getMaterialNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.materialNo</code> attribute.
	 * @return the materialNo
	 */
	public String getMaterialNo()
	{
		return getMaterialNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.materialNo</code> attribute. 
	 * @param value the materialNo
	 */
	public void setMaterialNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.materialNo</code> attribute. 
	 * @param value the materialNo
	 */
	public void setMaterialNo(final String value)
	{
		setMaterialNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public String getNetPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public String getNetPrice()
	{
		return getNetPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final String value)
	{
		setNetPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.statusL</code> attribute.
	 * @return the statusL
	 */
	public String getStatusL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUSL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.statusL</code> attribute.
	 * @return the statusL
	 */
	public String getStatusL()
	{
		return getStatusL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.statusL</code> attribute. 
	 * @param value the statusL
	 */
	public void setStatusL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUSL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.statusL</code> attribute. 
	 * @param value the statusL
	 */
	public void setStatusL(final String value)
	{
		setStatusL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.tenderLineNo</code> attribute.
	 * @return the tenderLineNo
	 */
	public String getTenderLineNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TENDERLINENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContractEntry.tenderLineNo</code> attribute.
	 * @return the tenderLineNo
	 */
	public String getTenderLineNo()
	{
		return getTenderLineNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.tenderLineNo</code> attribute. 
	 * @param value the tenderLineNo
	 */
	public void setTenderLineNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TENDERLINENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContractEntry.tenderLineNo</code> attribute. 
	 * @param value the tenderLineNo
	 */
	public void setTenderLineNo(final String value)
	{
		setTenderLineNo( getSession().getSessionContext(), value );
	}
	
}
