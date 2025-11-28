/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMAmazonEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMAmazonEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMAmazonEmailProcess.amazonUploadDataMap</code> attribute **/
	public static final String AMAZONUPLOADDATAMAP = "amazonUploadDataMap";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AMAZONUPLOADDATAMAP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMAmazonEmailProcess.amazonUploadDataMap</code> attribute.
	 * @return the amazonUploadDataMap
	 */
	public Map getAmazonUploadDataMap(final SessionContext ctx)
	{
		return (Map)getProperty( ctx, AMAZONUPLOADDATAMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMAmazonEmailProcess.amazonUploadDataMap</code> attribute.
	 * @return the amazonUploadDataMap
	 */
	public Map getAmazonUploadDataMap()
	{
		return getAmazonUploadDataMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMAmazonEmailProcess.amazonUploadDataMap</code> attribute. 
	 * @param value the amazonUploadDataMap
	 */
	public void setAmazonUploadDataMap(final SessionContext ctx, final Map value)
	{
		setProperty(ctx, AMAZONUPLOADDATAMAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMAmazonEmailProcess.amazonUploadDataMap</code> attribute. 
	 * @param value the amazonUploadDataMap
	 */
	public void setAmazonUploadDataMap(final Map value)
	{
		setAmazonUploadDataMap( getSession().getSessionContext(), value );
	}
	
}
