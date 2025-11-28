/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjSalesOrgAndSplProdMap}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjSalesOrgAndSplProdMap extends GenericItem
{
	/** Qualifier of the <code>JnjSalesOrgAndSplProdMap.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute **/
	public static final String HANDLECOLDCHAIN = "handleColdChain";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(HANDLECOLDCHAIN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute.
	 * @return the handleColdChain
	 */
	public Boolean isHandleColdChain(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HANDLECOLDCHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute.
	 * @return the handleColdChain
	 */
	public Boolean isHandleColdChain()
	{
		return isHandleColdChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @return the handleColdChain
	 */
	public boolean isHandleColdChainAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHandleColdChain( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @return the handleColdChain
	 */
	public boolean isHandleColdChainAsPrimitive()
	{
		return isHandleColdChainAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @param value the handleColdChain
	 */
	public void setHandleColdChain(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HANDLECOLDCHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @param value the handleColdChain
	 */
	public void setHandleColdChain(final Boolean value)
	{
		setHandleColdChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @param value the handleColdChain
	 */
	public void setHandleColdChain(final SessionContext ctx, final boolean value)
	{
		setHandleColdChain( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.handleColdChain</code> attribute. 
	 * @param value the handleColdChain
	 */
	public void setHandleColdChain(final boolean value)
	{
		setHandleColdChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjSalesOrgAndSplProdMap.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjSalesOrgAndSplProdMap.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
}
