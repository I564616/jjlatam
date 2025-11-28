/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjPCMProductDetailsEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMProductDetailsEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjPCMProductDetailsEmailProcess.jnjPCMProductDetails</code> attribute **/
	public static final String JNJPCMPRODUCTDETAILS = "jnjPCMProductDetails";
	/** Qualifier of the <code>JnjPCMProductDetailsEmailProcess.toEmailAddress</code> attribute **/
	public static final String TOEMAILADDRESS = "toEmailAddress";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJPCMPRODUCTDETAILS, AttributeMode.INITIAL);
		tmp.put(TOEMAILADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMProductDetailsEmailProcess.jnjPCMProductDetails</code> attribute.
	 * @return the jnjPCMProductDetails - This attribute contains product data for the PCM product details email.
	 */
	public Object getJnjPCMProductDetails(final SessionContext ctx)
	{
		return getProperty( ctx, JNJPCMPRODUCTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMProductDetailsEmailProcess.jnjPCMProductDetails</code> attribute.
	 * @return the jnjPCMProductDetails - This attribute contains product data for the PCM product details email.
	 */
	public Object getJnjPCMProductDetails()
	{
		return getJnjPCMProductDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMProductDetailsEmailProcess.jnjPCMProductDetails</code> attribute. 
	 * @param value the jnjPCMProductDetails - This attribute contains product data for the PCM product details email.
	 */
	public void setJnjPCMProductDetails(final SessionContext ctx, final Object value)
	{
		setProperty(ctx, JNJPCMPRODUCTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMProductDetailsEmailProcess.jnjPCMProductDetails</code> attribute. 
	 * @param value the jnjPCMProductDetails - This attribute contains product data for the PCM product details email.
	 */
	public void setJnjPCMProductDetails(final Object value)
	{
		setJnjPCMProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMProductDetailsEmailProcess.toEmailAddress</code> attribute.
	 * @return the toEmailAddress - This attribute contains recipient's email address.
	 */
	public String getToEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOEMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMProductDetailsEmailProcess.toEmailAddress</code> attribute.
	 * @return the toEmailAddress - This attribute contains recipient's email address.
	 */
	public String getToEmailAddress()
	{
		return getToEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMProductDetailsEmailProcess.toEmailAddress</code> attribute. 
	 * @param value the toEmailAddress - This attribute contains recipient's email address.
	 */
	public void setToEmailAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOEMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMProductDetailsEmailProcess.toEmailAddress</code> attribute. 
	 * @param value the toEmailAddress - This attribute contains recipient's email address.
	 */
	public void setToEmailAddress(final String value)
	{
		setToEmailAddress( getSession().getSessionContext(), value );
	}
	
}
