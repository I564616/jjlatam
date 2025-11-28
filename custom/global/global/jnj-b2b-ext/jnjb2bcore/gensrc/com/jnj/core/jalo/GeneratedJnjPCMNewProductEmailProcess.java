/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMNewProductEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMNewProductEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMNewProductEmailProcess.productDatas</code> attribute **/
	public static final String PRODUCTDATAS = "productDatas";
	/** Qualifier of the <code>JnjPCMNewProductEmailProcess.currentCountry</code> attribute **/
	public static final String CURRENTCOUNTRY = "currentCountry";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTDATAS, AttributeMode.INITIAL);
		tmp.put(CURRENTCOUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMNewProductEmailProcess.currentCountry</code> attribute.
	 * @return the currentCountry - This attribute contains the current country of the catalog that is being processed.
	 */
	public String getCurrentCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENTCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMNewProductEmailProcess.currentCountry</code> attribute.
	 * @return the currentCountry - This attribute contains the current country of the catalog that is being processed.
	 */
	public String getCurrentCountry()
	{
		return getCurrentCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMNewProductEmailProcess.currentCountry</code> attribute. 
	 * @param value the currentCountry - This attribute contains the current country of the catalog that is being processed.
	 */
	public void setCurrentCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENTCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMNewProductEmailProcess.currentCountry</code> attribute. 
	 * @param value the currentCountry - This attribute contains the current country of the catalog that is being processed.
	 */
	public void setCurrentCountry(final String value)
	{
		setCurrentCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMNewProductEmailProcess.productDatas</code> attribute.
	 * @return the productDatas - This attribute contains the product data POJO which will be used to display data in the New Product Email.
	 */
	public Object getProductDatas(final SessionContext ctx)
	{
		return getProperty( ctx, PRODUCTDATAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMNewProductEmailProcess.productDatas</code> attribute.
	 * @return the productDatas - This attribute contains the product data POJO which will be used to display data in the New Product Email.
	 */
	public Object getProductDatas()
	{
		return getProductDatas( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMNewProductEmailProcess.productDatas</code> attribute. 
	 * @param value the productDatas - This attribute contains the product data POJO which will be used to display data in the New Product Email.
	 */
	public void setProductDatas(final SessionContext ctx, final Object value)
	{
		setProperty(ctx, PRODUCTDATAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMNewProductEmailProcess.productDatas</code> attribute. 
	 * @param value the productDatas - This attribute contains the product data POJO which will be used to display data in the New Product Email.
	 */
	public void setProductDatas(final Object value)
	{
		setProductDatas( getSession().getSessionContext(), value );
	}
	
}
