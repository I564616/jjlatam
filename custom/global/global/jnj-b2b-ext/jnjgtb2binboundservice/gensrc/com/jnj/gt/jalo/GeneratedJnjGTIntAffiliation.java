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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntAffiliation JnjGTIntAffiliation}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntAffiliation extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntAffiliation.parentCustNo</code> attribute **/
	public static final String PARENTCUSTNO = "parentCustNo";
	/** Qualifier of the <code>JnjGTIntAffiliation.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntAffiliation.childCustNo</code> attribute **/
	public static final String CHILDCUSTNO = "childCustNo";
	/** Qualifier of the <code>JnjGTIntAffiliation.partnerTypeCode</code> attribute **/
	public static final String PARTNERTYPECODE = "partnerTypeCode";
	/** Qualifier of the <code>JnjGTIntAffiliation.partnerTypeName</code> attribute **/
	public static final String PARTNERTYPENAME = "partnerTypeName";
	/** Qualifier of the <code>JnjGTIntAffiliation.delIndicator</code> attribute **/
	public static final String DELINDICATOR = "delIndicator";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PARENTCUSTNO, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(CHILDCUSTNO, AttributeMode.INITIAL);
		tmp.put(PARTNERTYPECODE, AttributeMode.INITIAL);
		tmp.put(PARTNERTYPENAME, AttributeMode.INITIAL);
		tmp.put(DELINDICATOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.childCustNo</code> attribute.
	 * @return the childCustNo
	 */
	public String getChildCustNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHILDCUSTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.childCustNo</code> attribute.
	 * @return the childCustNo
	 */
	public String getChildCustNo()
	{
		return getChildCustNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.childCustNo</code> attribute. 
	 * @param value the childCustNo
	 */
	public void setChildCustNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHILDCUSTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.childCustNo</code> attribute. 
	 * @param value the childCustNo
	 */
	public void setChildCustNo(final String value)
	{
		setChildCustNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute.
	 * @return the delIndicator
	 */
	public Boolean isDelIndicator(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute.
	 * @return the delIndicator
	 */
	public Boolean isDelIndicator()
	{
		return isDelIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @return the delIndicator
	 */
	public boolean isDelIndicatorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDelIndicator( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @return the delIndicator
	 */
	public boolean isDelIndicatorAsPrimitive()
	{
		return isDelIndicatorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final Boolean value)
	{
		setDelIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final SessionContext ctx, final boolean value)
	{
		setDelIndicator( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final boolean value)
	{
		setDelIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.parentCustNo</code> attribute.
	 * @return the parentCustNo
	 */
	public String getParentCustNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARENTCUSTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.parentCustNo</code> attribute.
	 * @return the parentCustNo
	 */
	public String getParentCustNo()
	{
		return getParentCustNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.parentCustNo</code> attribute. 
	 * @param value the parentCustNo
	 */
	public void setParentCustNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARENTCUSTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.parentCustNo</code> attribute. 
	 * @param value the parentCustNo
	 */
	public void setParentCustNo(final String value)
	{
		setParentCustNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.partnerTypeCode</code> attribute.
	 * @return the partnerTypeCode
	 */
	public String getPartnerTypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTNERTYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.partnerTypeCode</code> attribute.
	 * @return the partnerTypeCode
	 */
	public String getPartnerTypeCode()
	{
		return getPartnerTypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.partnerTypeCode</code> attribute. 
	 * @param value the partnerTypeCode
	 */
	public void setPartnerTypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTNERTYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.partnerTypeCode</code> attribute. 
	 * @param value the partnerTypeCode
	 */
	public void setPartnerTypeCode(final String value)
	{
		setPartnerTypeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.partnerTypeName</code> attribute.
	 * @return the partnerTypeName
	 */
	public String getPartnerTypeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTNERTYPENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.partnerTypeName</code> attribute.
	 * @return the partnerTypeName
	 */
	public String getPartnerTypeName()
	{
		return getPartnerTypeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.partnerTypeName</code> attribute. 
	 * @param value the partnerTypeName
	 */
	public void setPartnerTypeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTNERTYPENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.partnerTypeName</code> attribute. 
	 * @param value the partnerTypeName
	 */
	public void setPartnerTypeName(final String value)
	{
		setPartnerTypeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntAffiliation.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntAffiliation.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
