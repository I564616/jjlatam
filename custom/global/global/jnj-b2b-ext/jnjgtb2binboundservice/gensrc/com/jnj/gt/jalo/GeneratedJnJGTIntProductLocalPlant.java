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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTIntProductLocalPlant}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTIntProductLocalPlant extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnJGTIntProductLocalPlant.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnJGTIntProductLocalPlant.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnJGTIntProductLocalPlant.plantCode</code> attribute **/
	public static final String PLANTCODE = "plantCode";
	/** Qualifier of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute **/
	public static final String BATCHMGMT = "batchMgmt";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(PLANTCODE, AttributeMode.INITIAL);
		tmp.put(BATCHMGMT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public Boolean isBatchMgmt(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BATCHMGMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute.
	 * @return the batchMgmt
	 */
	public Boolean isBatchMgmt()
	{
		return isBatchMgmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @return the batchMgmt
	 */
	public boolean isBatchMgmtAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBatchMgmt( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @return the batchMgmt
	 */
	public boolean isBatchMgmtAsPrimitive()
	{
		return isBatchMgmtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BATCHMGMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final Boolean value)
	{
		setBatchMgmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final SessionContext ctx, final boolean value)
	{
		setBatchMgmt( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.batchMgmt</code> attribute. 
	 * @param value the batchMgmt
	 */
	public void setBatchMgmt(final boolean value)
	{
		setBatchMgmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.plantCode</code> attribute.
	 * @return the plantCode
	 */
	public String getPlantCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.plantCode</code> attribute.
	 * @return the plantCode
	 */
	public String getPlantCode()
	{
		return getPlantCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.plantCode</code> attribute. 
	 * @param value the plantCode
	 */
	public void setPlantCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.plantCode</code> attribute. 
	 * @param value the plantCode
	 */
	public void setPlantCode(final String value)
	{
		setPlantCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductLocalPlant.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductLocalPlant.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
}
