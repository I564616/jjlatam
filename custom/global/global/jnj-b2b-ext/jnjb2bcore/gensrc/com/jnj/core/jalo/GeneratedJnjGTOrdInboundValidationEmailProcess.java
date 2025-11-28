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
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTOrdInboundValidationEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTOrdInboundValidationEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTOrdInboundValidationEmailProcess.fileNames</code> attribute **/
	public static final String FILENAMES = "fileNames";
	/** Qualifier of the <code>JnjGTOrdInboundValidationEmailProcess.fileNameAndCount</code> attribute **/
	public static final String FILENAMEANDCOUNT = "fileNameAndCount";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FILENAMES, AttributeMode.INITIAL);
		tmp.put(FILENAMEANDCOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNameAndCount</code> attribute.
	 * @return the fileNameAndCount
	 */
	public Map<String,String> getAllFileNameAndCount(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, FILENAMEANDCOUNT);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNameAndCount</code> attribute.
	 * @return the fileNameAndCount
	 */
	public Map<String,String> getAllFileNameAndCount()
	{
		return getAllFileNameAndCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNameAndCount</code> attribute. 
	 * @param value the fileNameAndCount
	 */
	public void setAllFileNameAndCount(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, FILENAMEANDCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNameAndCount</code> attribute. 
	 * @param value the fileNameAndCount
	 */
	public void setAllFileNameAndCount(final Map<String,String> value)
	{
		setAllFileNameAndCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNames</code> attribute.
	 * @return the fileNames
	 */
	public List<String> getFileNames(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, FILENAMES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNames</code> attribute.
	 * @return the fileNames
	 */
	public List<String> getFileNames()
	{
		return getFileNames( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNames</code> attribute. 
	 * @param value the fileNames
	 */
	public void setFileNames(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, FILENAMES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdInboundValidationEmailProcess.fileNames</code> attribute. 
	 * @param value the fileNames
	 */
	public void setFileNames(final List<String> value)
	{
		setFileNames( getSession().getSessionContext(), value );
	}
	
}
