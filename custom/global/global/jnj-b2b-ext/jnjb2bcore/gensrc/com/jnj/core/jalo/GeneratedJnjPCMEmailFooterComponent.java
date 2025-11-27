/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
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
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent JnjPCMEmailFooterComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjPCMEmailFooterComponent extends CMSParagraphComponent
{
	/** Qualifier of the <code>JnjPCMEmailFooterComponent.footerLinkComponentList</code> attribute **/
	public static final String FOOTERLINKCOMPONENTLIST = "footerLinkComponentList";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSParagraphComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FOOTERLINKCOMPONENTLIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMEmailFooterComponent.footerLinkComponentList</code> attribute.
	 * @return the footerLinkComponentList
	 */
	public List<CMSLinkComponent> getFooterLinkComponentList(final SessionContext ctx)
	{
		List<CMSLinkComponent> coll = (List<CMSLinkComponent>)getProperty( ctx, FOOTERLINKCOMPONENTLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjPCMEmailFooterComponent.footerLinkComponentList</code> attribute.
	 * @return the footerLinkComponentList
	 */
	public List<CMSLinkComponent> getFooterLinkComponentList()
	{
		return getFooterLinkComponentList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMEmailFooterComponent.footerLinkComponentList</code> attribute. 
	 * @param value the footerLinkComponentList
	 */
	public void setFooterLinkComponentList(final SessionContext ctx, final List<CMSLinkComponent> value)
	{
		setProperty(ctx, FOOTERLINKCOMPONENTLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjPCMEmailFooterComponent.footerLinkComponentList</code> attribute. 
	 * @param value the footerLinkComponentList
	 */
	public void setFooterLinkComponentList(final List<CMSLinkComponent> value)
	{
		setFooterLinkComponentList( getSession().getSessionContext(), value );
	}
	
}
