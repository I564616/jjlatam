/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntUserSalesOrg}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntUserSalesOrg extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.salesOrgDivCdId</code> attribute **/
	public static final String SALESORGDIVCDID = "salesOrgDivCdId";
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.orgId</code> attribute **/
	public static final String ORGID = "orgId";
	/** Qualifier of the <code>JnjGTIntUserSalesOrg.userId</code> attribute **/
	public static final String USERID = "userId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(SALESORGDIVCDID, AttributeMode.INITIAL);
		tmp.put(ORGID, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId()
	{
		return getOrgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final String value)
	{
		setOrgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.salesOrgDivCdId</code> attribute.
	 * @return the salesOrgDivCdId
	 */
	public String getSalesOrgDivCdId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCDID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.salesOrgDivCdId</code> attribute.
	 * @return the salesOrgDivCdId
	 */
	public String getSalesOrgDivCdId()
	{
		return getSalesOrgDivCdId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.salesOrgDivCdId</code> attribute. 
	 * @param value the salesOrgDivCdId
	 */
	public void setSalesOrgDivCdId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCDID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.salesOrgDivCdId</code> attribute. 
	 * @param value the salesOrgDivCdId
	 */
	public void setSalesOrgDivCdId(final String value)
	{
		setSalesOrgDivCdId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntUserSalesOrg.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId()
	{
		return getUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntUserSalesOrg.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final String value)
	{
		setUserId( getSession().getSessionContext(), value );
	}
	
}
