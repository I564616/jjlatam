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
 * Generated class for type {@link com.jnj.gt.jalo.JnjGTIntPartnerFunc JnjGTIntPartnerFunc}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntPartnerFunc extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntPartnerFunc.partFuncCode</code> attribute **/
	public static final String PARTFUNCCODE = "partFuncCode";
	/** Qualifier of the <code>JnjGTIntPartnerFunc.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntPartnerFunc.customerNumber</code> attribute **/
	public static final String CUSTOMERNUMBER = "customerNumber";
	/** Qualifier of the <code>JnjGTIntPartnerFunc.partFuncName</code> attribute **/
	public static final String PARTFUNCNAME = "partFuncName";
	/** Qualifier of the <code>JnjGTIntPartnerFunc.partCustNo</code> attribute **/
	public static final String PARTCUSTNO = "partCustNo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PARTFUNCCODE, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(PARTFUNCNAME, AttributeMode.INITIAL);
		tmp.put(PARTCUSTNO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public String getCustomerNumber()
	{
		return getCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final String value)
	{
		setCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partCustNo</code> attribute.
	 * @return the partCustNo
	 */
	public String getPartCustNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTCUSTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partCustNo</code> attribute.
	 * @return the partCustNo
	 */
	public String getPartCustNo()
	{
		return getPartCustNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partCustNo</code> attribute. 
	 * @param value the partCustNo
	 */
	public void setPartCustNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTCUSTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partCustNo</code> attribute. 
	 * @param value the partCustNo
	 */
	public void setPartCustNo(final String value)
	{
		setPartCustNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partFuncCode</code> attribute.
	 * @return the partFuncCode
	 */
	public String getPartFuncCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTFUNCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partFuncCode</code> attribute.
	 * @return the partFuncCode
	 */
	public String getPartFuncCode()
	{
		return getPartFuncCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partFuncCode</code> attribute. 
	 * @param value the partFuncCode
	 */
	public void setPartFuncCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTFUNCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partFuncCode</code> attribute. 
	 * @param value the partFuncCode
	 */
	public void setPartFuncCode(final String value)
	{
		setPartFuncCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partFuncName</code> attribute.
	 * @return the partFuncName
	 */
	public String getPartFuncName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTFUNCNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.partFuncName</code> attribute.
	 * @return the partFuncName
	 */
	public String getPartFuncName()
	{
		return getPartFuncName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partFuncName</code> attribute. 
	 * @param value the partFuncName
	 */
	public void setPartFuncName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTFUNCNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.partFuncName</code> attribute. 
	 * @param value the partFuncName
	 */
	public void setPartFuncName(final String value)
	{
		setPartFuncName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntPartnerFunc.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntPartnerFunc.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
