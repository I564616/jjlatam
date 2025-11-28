/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.accenture.jalo;

import com.jnj.constants.JnjutilConstants;
import de.hybris.platform.cms2.jalo.contents.CMSItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.accenture.jalo.Message MessageItem}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMessage extends CMSItem
{
	/** Qualifier of the <code>MessageItem.messageText</code> attribute **/
	public static final String MESSAGETEXT = "messageText";
	/** Qualifier of the <code>MessageItem.messageCategory</code> attribute **/
	public static final String MESSAGECATEGORY = "messageCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MESSAGETEXT, AttributeMode.INITIAL);
		tmp.put(MESSAGECATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageCategory</code> attribute.
	 * @return the messageCategory - The text of a message
	 */
	public EnumerationValue getMessageCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MESSAGECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageCategory</code> attribute.
	 * @return the messageCategory - The text of a message
	 */
	public EnumerationValue getMessageCategory()
	{
		return getMessageCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageCategory</code> attribute. 
	 * @param value the messageCategory - The text of a message
	 */
	public void setMessageCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MESSAGECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageCategory</code> attribute. 
	 * @param value the messageCategory - The text of a message
	 */
	public void setMessageCategory(final EnumerationValue value)
	{
		setMessageCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageText</code> attribute.
	 * @return the messageText - The text of a message
	 */
	public String getMessageText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMessage.getMessageText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGETEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageText</code> attribute.
	 * @return the messageText - The text of a message
	 */
	public String getMessageText()
	{
		return getMessageText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageText</code> attribute. 
	 * @return the localized messageText - The text of a message
	 */
	public Map<Language,String> getAllMessageText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGETEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MessageItem.messageText</code> attribute. 
	 * @return the localized messageText - The text of a message
	 */
	public Map<Language,String> getAllMessageText()
	{
		return getAllMessageText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageText</code> attribute. 
	 * @param value the messageText - The text of a message
	 */
	public void setMessageText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMessage.setMessageText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGETEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageText</code> attribute. 
	 * @param value the messageText - The text of a message
	 */
	public void setMessageText(final String value)
	{
		setMessageText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageText</code> attribute. 
	 * @param value the messageText - The text of a message
	 */
	public void setAllMessageText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGETEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MessageItem.messageText</code> attribute. 
	 * @param value the messageText - The text of a message
	 */
	public void setAllMessageText(final Map<Language,String> value)
	{
		setAllMessageText( getSession().getSessionContext(), value );
	}
	
}
