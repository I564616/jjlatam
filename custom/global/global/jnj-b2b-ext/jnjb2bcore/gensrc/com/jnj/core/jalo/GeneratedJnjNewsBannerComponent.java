/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.cms2lib.components.BannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2lib.components.BannerComponent JnjNewsBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjNewsBannerComponent extends BannerComponent
{
	/** Qualifier of the <code>JnjNewsBannerComponent.thumbnail</code> attribute **/
	public static final String THUMBNAIL = "thumbnail";
	/** Qualifier of the <code>JnjNewsBannerComponent.newsPublishDate</code> attribute **/
	public static final String NEWSPUBLISHDATE = "newsPublishDate";
	/** Qualifier of the <code>JnjNewsBannerComponent.businessCenter</code> attribute **/
	public static final String BUSINESSCENTER = "businessCenter";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(THUMBNAIL, AttributeMode.INITIAL);
		tmp.put(NEWSPUBLISHDATE, AttributeMode.INITIAL);
		tmp.put(BUSINESSCENTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.businessCenter</code> attribute.
	 * @return the businessCenter
	 */
	public EnumerationValue getBusinessCenter(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BUSINESSCENTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.businessCenter</code> attribute.
	 * @return the businessCenter
	 */
	public EnumerationValue getBusinessCenter()
	{
		return getBusinessCenter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.businessCenter</code> attribute. 
	 * @param value the businessCenter
	 */
	public void setBusinessCenter(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BUSINESSCENTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.businessCenter</code> attribute. 
	 * @param value the businessCenter
	 */
	public void setBusinessCenter(final EnumerationValue value)
	{
		setBusinessCenter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.newsPublishDate</code> attribute.
	 * @return the newsPublishDate
	 */
	public Date getNewsPublishDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, NEWSPUBLISHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.newsPublishDate</code> attribute.
	 * @return the newsPublishDate
	 */
	public Date getNewsPublishDate()
	{
		return getNewsPublishDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.newsPublishDate</code> attribute. 
	 * @param value the newsPublishDate
	 */
	public void setNewsPublishDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, NEWSPUBLISHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.newsPublishDate</code> attribute. 
	 * @param value the newsPublishDate
	 */
	public void setNewsPublishDate(final Date value)
	{
		setNewsPublishDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute.
	 * @return the thumbnail
	 */
	public Media getThumbnail(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjNewsBannerComponent.getThumbnail requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, THUMBNAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute.
	 * @return the thumbnail
	 */
	public Media getThumbnail()
	{
		return getThumbnail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @return the localized thumbnail
	 */
	public Map<Language,Media> getAllThumbnail(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,THUMBNAIL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @return the localized thumbnail
	 */
	public Map<Language,Media> getAllThumbnail()
	{
		return getAllThumbnail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @param value the thumbnail
	 */
	public void setThumbnail(final SessionContext ctx, final Media value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedJnjNewsBannerComponent.setThumbnail requires a session language", 0 );
		}
		setLocalizedProperty(ctx, THUMBNAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @param value the thumbnail
	 */
	public void setThumbnail(final Media value)
	{
		setThumbnail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @param value the thumbnail
	 */
	public void setAllThumbnail(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,THUMBNAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjNewsBannerComponent.thumbnail</code> attribute. 
	 * @param value the thumbnail
	 */
	public void setAllThumbnail(final Map<Language,Media> value)
	{
		setAllThumbnail( getSession().getSessionContext(), value );
	}
	
}
