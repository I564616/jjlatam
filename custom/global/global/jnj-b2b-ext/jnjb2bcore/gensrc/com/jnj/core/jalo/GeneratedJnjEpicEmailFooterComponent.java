/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjPCMEmailFooterComponent;
import de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent JnjEpicEmailFooterComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjEpicEmailFooterComponent extends JnjPCMEmailFooterComponent
{
	/** Qualifier of the <code>JnjEpicEmailFooterComponent.footerParagraph</code> attribute **/
	public static final String FOOTERPARAGRAPH = "footerParagraph";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjPCMEmailFooterComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FOOTERPARAGRAPH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjEpicEmailFooterComponent.footerParagraph</code> attribute.
	 * @return the footerParagraph
	 */
	public CMSParagraphComponent getFooterParagraph(final SessionContext ctx)
	{
		return (CMSParagraphComponent)getProperty( ctx, FOOTERPARAGRAPH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjEpicEmailFooterComponent.footerParagraph</code> attribute.
	 * @return the footerParagraph
	 */
	public CMSParagraphComponent getFooterParagraph()
	{
		return getFooterParagraph( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjEpicEmailFooterComponent.footerParagraph</code> attribute. 
	 * @param value the footerParagraph
	 */
	public void setFooterParagraph(final SessionContext ctx, final CMSParagraphComponent value)
	{
		setProperty(ctx, FOOTERPARAGRAPH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjEpicEmailFooterComponent.footerParagraph</code> attribute. 
	 * @param value the footerParagraph
	 */
	public void setFooterParagraph(final CMSParagraphComponent value)
	{
		setFooterParagraph( getSession().getSessionContext(), value );
	}
	
}
