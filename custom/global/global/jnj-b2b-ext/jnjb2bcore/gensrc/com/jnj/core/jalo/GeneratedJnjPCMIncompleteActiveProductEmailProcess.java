/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMIncompleteActiveProductEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMIncompleteActiveProductEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMIncompleteActiveProductEmailProcess.missingDataProductList</code> attribute **/
	public static final String MISSINGDATAPRODUCTLIST = "missingDataProductList";
	/** Qualifier of the <code>JnjPCMIncompleteActiveProductEmailProcess.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MISSINGDATAPRODUCTLIST, AttributeMode.INITIAL);
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMIncompleteActiveProductEmailProcess.countryCode</code> attribute.
	 * @return the countryCode - This attribute contains the value of the country code for which the incomplete products list is generated.
	 */
	public String getCountryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMIncompleteActiveProductEmailProcess.countryCode</code> attribute.
	 * @return the countryCode - This attribute contains the value of the country code for which the incomplete products list is generated.
	 */
	public String getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMIncompleteActiveProductEmailProcess.countryCode</code> attribute. 
	 * @param value the countryCode - This attribute contains the value of the country code for which the incomplete products list is generated.
	 */
	public void setCountryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMIncompleteActiveProductEmailProcess.countryCode</code> attribute. 
	 * @param value the countryCode - This attribute contains the value of the country code for which the incomplete products list is generated.
	 */
	public void setCountryCode(final String value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMIncompleteActiveProductEmailProcess.missingDataProductList</code> attribute.
	 * @return the missingDataProductList - This attribute contains the list of POJOs which contain the values for the products with missing attributes.
	 */
	public Object getMissingDataProductList(final SessionContext ctx)
	{
		return getProperty( ctx, MISSINGDATAPRODUCTLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMIncompleteActiveProductEmailProcess.missingDataProductList</code> attribute.
	 * @return the missingDataProductList - This attribute contains the list of POJOs which contain the values for the products with missing attributes.
	 */
	public Object getMissingDataProductList()
	{
		return getMissingDataProductList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMIncompleteActiveProductEmailProcess.missingDataProductList</code> attribute. 
	 * @param value the missingDataProductList - This attribute contains the list of POJOs which contain the values for the products with missing attributes.
	 */
	public void setMissingDataProductList(final SessionContext ctx, final Object value)
	{
		setProperty(ctx, MISSINGDATAPRODUCTLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMIncompleteActiveProductEmailProcess.missingDataProductList</code> attribute. 
	 * @param value the missingDataProductList - This attribute contains the list of POJOs which contain the values for the products with missing attributes.
	 */
	public void setMissingDataProductList(final Object value)
	{
		setMissingDataProductList( getSession().getSessionContext(), value );
	}
	
}
