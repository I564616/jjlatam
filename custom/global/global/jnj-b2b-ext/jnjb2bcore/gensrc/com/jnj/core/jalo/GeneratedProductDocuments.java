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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ProductDocuments}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductDocuments extends GenericItem
{
	/** Qualifier of the <code>ProductDocuments.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ProductDocuments.urlLink</code> attribute **/
	public static final String URLLINK = "urlLink";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(URLLINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDocuments.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDocuments.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDocuments.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDocuments.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDocuments.urlLink</code> attribute.
	 * @return the urlLink
	 */
	public String getUrlLink(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URLLINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDocuments.urlLink</code> attribute.
	 * @return the urlLink
	 */
	public String getUrlLink()
	{
		return getUrlLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDocuments.urlLink</code> attribute. 
	 * @param value the urlLink
	 */
	public void setUrlLink(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URLLINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDocuments.urlLink</code> attribute. 
	 * @param value the urlLink
	 */
	public void setUrlLink(final String value)
	{
		setUrlLink( getSession().getSessionContext(), value );
	}
	
}
