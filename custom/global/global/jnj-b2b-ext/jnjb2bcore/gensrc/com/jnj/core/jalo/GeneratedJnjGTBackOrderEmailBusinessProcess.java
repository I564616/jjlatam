/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTBackOrderEmailBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTBackOrderEmailBusinessProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTBackOrderEmailBusinessProcess.backOrderEmailData</code> attribute **/
	public static final String BACKORDEREMAILDATA = "backOrderEmailData";
	/** Qualifier of the <code>JnjGTBackOrderEmailBusinessProcess.openlineBackorderCheck</code> attribute **/
	public static final String OPENLINEBACKORDERCHECK = "openlineBackorderCheck";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BACKORDEREMAILDATA, AttributeMode.INITIAL);
		tmp.put(OPENLINEBACKORDERCHECK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTBackOrderEmailBusinessProcess.backOrderEmailData</code> attribute.
	 * @return the backOrderEmailData - List containing elements representing concatenated data for backorder email.
	 */
	public List<String> getBackOrderEmailData(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, BACKORDEREMAILDATA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTBackOrderEmailBusinessProcess.backOrderEmailData</code> attribute.
	 * @return the backOrderEmailData - List containing elements representing concatenated data for backorder email.
	 */
	public List<String> getBackOrderEmailData()
	{
		return getBackOrderEmailData( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTBackOrderEmailBusinessProcess.backOrderEmailData</code> attribute. 
	 * @param value the backOrderEmailData - List containing elements representing concatenated data for backorder email.
	 */
	public void setBackOrderEmailData(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, BACKORDEREMAILDATA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTBackOrderEmailBusinessProcess.backOrderEmailData</code> attribute. 
	 * @param value the backOrderEmailData - List containing elements representing concatenated data for backorder email.
	 */
	public void setBackOrderEmailData(final List<String> value)
	{
		setBackOrderEmailData( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTBackOrderEmailBusinessProcess.openlineBackorderCheck</code> attribute.
	 * @return the openlineBackorderCheck
	 */
	public String getOpenlineBackorderCheck(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OPENLINEBACKORDERCHECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTBackOrderEmailBusinessProcess.openlineBackorderCheck</code> attribute.
	 * @return the openlineBackorderCheck
	 */
	public String getOpenlineBackorderCheck()
	{
		return getOpenlineBackorderCheck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTBackOrderEmailBusinessProcess.openlineBackorderCheck</code> attribute. 
	 * @param value the openlineBackorderCheck
	 */
	public void setOpenlineBackorderCheck(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OPENLINEBACKORDERCHECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTBackOrderEmailBusinessProcess.openlineBackorderCheck</code> attribute. 
	 * @param value the openlineBackorderCheck
	 */
	public void setOpenlineBackorderCheck(final String value)
	{
		setOpenlineBackorderCheck( getSession().getSessionContext(), value );
	}
	
}
