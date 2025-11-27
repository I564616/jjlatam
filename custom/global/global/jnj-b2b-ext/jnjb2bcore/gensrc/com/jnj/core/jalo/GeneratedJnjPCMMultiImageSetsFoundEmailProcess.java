/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMMultiImageSetsFoundEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMMultiImageSetsFoundEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMMultiImageSetsFoundEmailProcess.upc</code> attribute **/
	public static final String UPC = "upc";
	/** Qualifier of the <code>JnjPCMMultiImageSetsFoundEmailProcess.summaryList</code> attribute **/
	public static final String SUMMARYLIST = "summaryList";
	/** Qualifier of the <code>JnjPCMMultiImageSetsFoundEmailProcess.country</code> attribute **/
	public static final String COUNTRY = "country";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(UPC, AttributeMode.INITIAL);
		tmp.put(SUMMARYLIST, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.country</code> attribute.
	 * @return the country - This attribute contains the value of the country.
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.country</code> attribute.
	 * @return the country - This attribute contains the value of the country.
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.country</code> attribute. 
	 * @param value the country - This attribute contains the value of the country.
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.country</code> attribute. 
	 * @param value the country - This attribute contains the value of the country.
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.summaryList</code> attribute.
	 * @return the summaryList - This attribute contains list of summary for products
	 */
	public List<String> getSummaryList(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, SUMMARYLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.summaryList</code> attribute.
	 * @return the summaryList - This attribute contains list of summary for products
	 */
	public List<String> getSummaryList()
	{
		return getSummaryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.summaryList</code> attribute. 
	 * @param value the summaryList - This attribute contains list of summary for products
	 */
	public void setSummaryList(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, SUMMARYLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.summaryList</code> attribute. 
	 * @param value the summaryList - This attribute contains list of summary for products
	 */
	public void setSummaryList(final List<String> value)
	{
		setSummaryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.upc</code> attribute.
	 * @return the upc - This attribute contains the value of the upc code.
	 */
	public String getUpc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.upc</code> attribute.
	 * @return the upc - This attribute contains the value of the upc code.
	 */
	public String getUpc()
	{
		return getUpc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.upc</code> attribute. 
	 * @param value the upc - This attribute contains the value of the upc code.
	 */
	public void setUpc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMMultiImageSetsFoundEmailProcess.upc</code> attribute. 
	 * @param value the upc - This attribute contains the value of the upc code.
	 */
	public void setUpc(final String value)
	{
		setUpc( getSession().getSessionContext(), value );
	}
	
}
