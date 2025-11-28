/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderTemplate}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderTemplate extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntOrderTemplate.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.orderType</code> attribute **/
	public static final String ORDERTYPE = "orderType";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.soldToId</code> attribute **/
	public static final String SOLDTOID = "soldToId";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.shipToId</code> attribute **/
	public static final String SHIPTOID = "shipToId";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.userId</code> attribute **/
	public static final String USERID = "userId";
	/** Qualifier of the <code>JnjGTIntOrderTemplate.shareStatus</code> attribute **/
	public static final String SHARESTATUS = "shareStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(ORDERTYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SOLDTOID, AttributeMode.INITIAL);
		tmp.put(SHIPTOID, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		tmp.put(SHARESTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType()
	{
		return getOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final String value)
	{
		setOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.shareStatus</code> attribute.
	 * @return the shareStatus
	 */
	public String getShareStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHARESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.shareStatus</code> attribute.
	 * @return the shareStatus
	 */
	public String getShareStatus()
	{
		return getShareStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.shareStatus</code> attribute. 
	 * @param value the shareStatus
	 */
	public void setShareStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHARESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.shareStatus</code> attribute. 
	 * @param value the shareStatus
	 */
	public void setShareStatus(final String value)
	{
		setShareStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.shipToId</code> attribute.
	 * @return the shipToId
	 */
	public String getShipToId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.shipToId</code> attribute.
	 * @return the shipToId
	 */
	public String getShipToId()
	{
		return getShipToId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.shipToId</code> attribute. 
	 * @param value the shipToId
	 */
	public void setShipToId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.shipToId</code> attribute. 
	 * @param value the shipToId
	 */
	public void setShipToId(final String value)
	{
		setShipToId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.soldToId</code> attribute.
	 * @return the soldToId
	 */
	public String getSoldToId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.soldToId</code> attribute.
	 * @return the soldToId
	 */
	public String getSoldToId()
	{
		return getSoldToId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.soldToId</code> attribute. 
	 * @param value the soldToId
	 */
	public void setSoldToId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.soldToId</code> attribute. 
	 * @param value the soldToId
	 */
	public void setSoldToId(final String value)
	{
		setSoldToId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderTemplate.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId()
	{
		return getUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderTemplate.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final String value)
	{
		setUserId( getSession().getSessionContext(), value );
	}
	
}
