/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTIntProductLocal}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTIntProductLocal extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnJGTIntProductLocal.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnJGTIntProductLocal.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute **/
	public static final String INFIELDIND = "inFieldInd";
	/** Qualifier of the <code>JnJGTIntProductLocal.dChainStatusEffectiveDate</code> attribute **/
	public static final String DCHAINSTATUSEFFECTIVEDATE = "dChainStatusEffectiveDate";
	/** Qualifier of the <code>JnJGTIntProductLocal.dChainSpecStatus</code> attribute **/
	public static final String DCHAINSPECSTATUS = "dChainSpecStatus";
	/** Qualifier of the <code>JnJGTIntProductLocal.productSubType</code> attribute **/
	public static final String PRODUCTSUBTYPE = "productSubType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(INFIELDIND, AttributeMode.INITIAL);
		tmp.put(DCHAINSTATUSEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(DCHAINSPECSTATUS, AttributeMode.INITIAL);
		tmp.put(PRODUCTSUBTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.dChainSpecStatus</code> attribute.
	 * @return the dChainSpecStatus
	 */
	public String getDChainSpecStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DCHAINSPECSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.dChainSpecStatus</code> attribute.
	 * @return the dChainSpecStatus
	 */
	public String getDChainSpecStatus()
	{
		return getDChainSpecStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.dChainSpecStatus</code> attribute. 
	 * @param value the dChainSpecStatus
	 */
	public void setDChainSpecStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DCHAINSPECSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.dChainSpecStatus</code> attribute. 
	 * @param value the dChainSpecStatus
	 */
	public void setDChainSpecStatus(final String value)
	{
		setDChainSpecStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.dChainStatusEffectiveDate</code> attribute.
	 * @return the dChainStatusEffectiveDate
	 */
	public Date getDChainStatusEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DCHAINSTATUSEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.dChainStatusEffectiveDate</code> attribute.
	 * @return the dChainStatusEffectiveDate
	 */
	public Date getDChainStatusEffectiveDate()
	{
		return getDChainStatusEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.dChainStatusEffectiveDate</code> attribute. 
	 * @param value the dChainStatusEffectiveDate
	 */
	public void setDChainStatusEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DCHAINSTATUSEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.dChainStatusEffectiveDate</code> attribute. 
	 * @param value the dChainStatusEffectiveDate
	 */
	public void setDChainStatusEffectiveDate(final Date value)
	{
		setDChainStatusEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute.
	 * @return the inFieldInd
	 */
	public Boolean isInFieldInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INFIELDIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute.
	 * @return the inFieldInd
	 */
	public Boolean isInFieldInd()
	{
		return isInFieldInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @return the inFieldInd
	 */
	public boolean isInFieldIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInFieldInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @return the inFieldInd
	 */
	public boolean isInFieldIndAsPrimitive()
	{
		return isInFieldIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INFIELDIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final Boolean value)
	{
		setInFieldInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final SessionContext ctx, final boolean value)
	{
		setInFieldInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.inFieldInd</code> attribute. 
	 * @param value the inFieldInd
	 */
	public void setInFieldInd(final boolean value)
	{
		setInFieldInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.productSubType</code> attribute.
	 * @return the productSubType
	 */
	public String getProductSubType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.productSubType</code> attribute.
	 * @return the productSubType
	 */
	public String getProductSubType()
	{
		return getProductSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.productSubType</code> attribute. 
	 * @param value the productSubType
	 */
	public void setProductSubType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.productSubType</code> attribute. 
	 * @param value the productSubType
	 */
	public void setProductSubType(final String value)
	{
		setProductSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocal.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocal.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
}
