/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent JnjPCMEmailTopNavigationComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMEmailTopNavigationComponent extends CMSParagraphComponent
{
	/** Qualifier of the <code>JnjPCMEmailTopNavigationComponent.navigationLinkComponentList</code> attribute **/
	public static final String NAVIGATIONLINKCOMPONENTLIST = "navigationLinkComponentList";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSParagraphComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NAVIGATIONLINKCOMPONENTLIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMEmailTopNavigationComponent.navigationLinkComponentList</code> attribute.
	 * @return the navigationLinkComponentList
	 */
	public List<CMSLinkComponent> getNavigationLinkComponentList(final SessionContext ctx)
	{
		List<CMSLinkComponent> coll = (List<CMSLinkComponent>)getProperty( ctx, NAVIGATIONLINKCOMPONENTLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMEmailTopNavigationComponent.navigationLinkComponentList</code> attribute.
	 * @return the navigationLinkComponentList
	 */
	public List<CMSLinkComponent> getNavigationLinkComponentList()
	{
		return getNavigationLinkComponentList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMEmailTopNavigationComponent.navigationLinkComponentList</code> attribute. 
	 * @param value the navigationLinkComponentList
	 */
	public void setNavigationLinkComponentList(final SessionContext ctx, final List<CMSLinkComponent> value)
	{
		setProperty(ctx, NAVIGATIONLINKCOMPONENTLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMEmailTopNavigationComponent.navigationLinkComponentList</code> attribute. 
	 * @param value the navigationLinkComponentList
	 */
	public void setNavigationLinkComponentList(final List<CMSLinkComponent> value)
	{
		setNavigationLinkComponentList( getSession().getSessionContext(), value );
	}
	
}
