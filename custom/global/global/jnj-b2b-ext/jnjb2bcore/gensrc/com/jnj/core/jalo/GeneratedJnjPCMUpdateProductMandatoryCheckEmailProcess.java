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
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjPCMUpdateProductMandatoryCheckEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMUpdateProductMandatoryCheckEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.jnjUpdateProductMandatoryCheckEmailDetails</code> attribute **/
	public static final String JNJUPDATEPRODUCTMANDATORYCHECKEMAILDETAILS = "jnjUpdateProductMandatoryCheckEmailDetails";
	/** Qualifier of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.productCatalog</code> attribute **/
	public static final String PRODUCTCATALOG = "productCatalog";
	/** Qualifier of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute **/
	public static final String MISSINGATTR = "missingAttr";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JNJUPDATEPRODUCTMANDATORYCHECKEMAILDETAILS, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATALOG, AttributeMode.INITIAL);
		tmp.put(MISSINGATTR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.jnjUpdateProductMandatoryCheckEmailDetails</code> attribute.
	 * @return the jnjUpdateProductMandatoryCheckEmailDetails - This attribute contains fields of the the update Product requried for the email.
	 */
	public Map<String,String> getAllJnjUpdateProductMandatoryCheckEmailDetails(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, JNJUPDATEPRODUCTMANDATORYCHECKEMAILDETAILS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.jnjUpdateProductMandatoryCheckEmailDetails</code> attribute.
	 * @return the jnjUpdateProductMandatoryCheckEmailDetails - This attribute contains fields of the the update Product requried for the email.
	 */
	public Map<String,String> getAllJnjUpdateProductMandatoryCheckEmailDetails()
	{
		return getAllJnjUpdateProductMandatoryCheckEmailDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.jnjUpdateProductMandatoryCheckEmailDetails</code> attribute. 
	 * @param value the jnjUpdateProductMandatoryCheckEmailDetails - This attribute contains fields of the the update Product requried for the email.
	 */
	public void setAllJnjUpdateProductMandatoryCheckEmailDetails(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, JNJUPDATEPRODUCTMANDATORYCHECKEMAILDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.jnjUpdateProductMandatoryCheckEmailDetails</code> attribute. 
	 * @param value the jnjUpdateProductMandatoryCheckEmailDetails - This attribute contains fields of the the update Product requried for the email.
	 */
	public void setAllJnjUpdateProductMandatoryCheckEmailDetails(final Map<String,String> value)
	{
		setAllJnjUpdateProductMandatoryCheckEmailDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute.
	 * @return the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public Boolean isMissingAttr(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MISSINGATTR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute.
	 * @return the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public Boolean isMissingAttr()
	{
		return isMissingAttr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @return the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public boolean isMissingAttrAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMissingAttr( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @return the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public boolean isMissingAttrAsPrimitive()
	{
		return isMissingAttrAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @param value the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public void setMissingAttr(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MISSINGATTR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @param value the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public void setMissingAttr(final Boolean value)
	{
		setMissingAttr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @param value the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public void setMissingAttr(final SessionContext ctx, final boolean value)
	{
		setMissingAttr( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.missingAttr</code> attribute. 
	 * @param value the missingAttr - This attribute contains the boolean value indicating if the product has missing mandatory attributes.
	 */
	public void setMissingAttr(final boolean value)
	{
		setMissingAttr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.productCatalog</code> attribute.
	 * @return the productCatalog - This attribute contains the value of the country of the product for which this email process is triggered, based on this value we will decide the email recipient.
	 */
	public String getProductCatalog(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCATALOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.productCatalog</code> attribute.
	 * @return the productCatalog - This attribute contains the value of the country of the product for which this email process is triggered, based on this value we will decide the email recipient.
	 */
	public String getProductCatalog()
	{
		return getProductCatalog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.productCatalog</code> attribute. 
	 * @param value the productCatalog - This attribute contains the value of the country of the product for which this email process is triggered, based on this value we will decide the email recipient.
	 */
	public void setProductCatalog(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCATALOG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMUpdateProductMandatoryCheckEmailProcess.productCatalog</code> attribute. 
	 * @param value the productCatalog - This attribute contains the value of the country of the product for which this email process is triggered, based on this value we will decide the email recipient.
	 */
	public void setProductCatalog(final String value)
	{
		setProductCatalog( getSession().getSessionContext(), value );
	}
	
}
