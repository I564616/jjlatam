/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProductExclusion}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProductExclusion extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntProductExclusion.materialCustNumber</code> attribute **/
	public static final String MATERIALCUSTNUMBER = "materialCustNumber";
	/** Qualifier of the <code>JnjGTIntProductExclusion.classificationType</code> attribute **/
	public static final String CLASSIFICATIONTYPE = "classificationType";
	/** Qualifier of the <code>JnjGTIntProductExclusion.characteristic</code> attribute **/
	public static final String CHARACTERISTIC = "characteristic";
	/** Qualifier of the <code>JnjGTIntProductExclusion.materialCustInd</code> attribute **/
	public static final String MATERIALCUSTIND = "materialCustInd";
	/** Qualifier of the <code>JnjGTIntProductExclusion.systemId</code> attribute **/
	public static final String SYSTEMID = "systemId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MATERIALCUSTNUMBER, AttributeMode.INITIAL);
		tmp.put(CLASSIFICATIONTYPE, AttributeMode.INITIAL);
		tmp.put(CHARACTERISTIC, AttributeMode.INITIAL);
		tmp.put(MATERIALCUSTIND, AttributeMode.INITIAL);
		tmp.put(SYSTEMID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.characteristic</code> attribute.
	 * @return the characteristic
	 */
	public String getCharacteristic(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHARACTERISTIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.characteristic</code> attribute.
	 * @return the characteristic
	 */
	public String getCharacteristic()
	{
		return getCharacteristic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.characteristic</code> attribute. 
	 * @param value the characteristic
	 */
	public void setCharacteristic(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHARACTERISTIC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.characteristic</code> attribute. 
	 * @param value the characteristic
	 */
	public void setCharacteristic(final String value)
	{
		setCharacteristic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.classificationType</code> attribute.
	 * @return the classificationType
	 */
	public String getClassificationType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLASSIFICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.classificationType</code> attribute.
	 * @return the classificationType
	 */
	public String getClassificationType()
	{
		return getClassificationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.classificationType</code> attribute. 
	 * @param value the classificationType
	 */
	public void setClassificationType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLASSIFICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.classificationType</code> attribute. 
	 * @param value the classificationType
	 */
	public void setClassificationType(final String value)
	{
		setClassificationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.materialCustInd</code> attribute.
	 * @return the materialCustInd
	 */
	public String getMaterialCustInd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALCUSTIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.materialCustInd</code> attribute.
	 * @return the materialCustInd
	 */
	public String getMaterialCustInd()
	{
		return getMaterialCustInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.materialCustInd</code> attribute. 
	 * @param value the materialCustInd
	 */
	public void setMaterialCustInd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALCUSTIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.materialCustInd</code> attribute. 
	 * @param value the materialCustInd
	 */
	public void setMaterialCustInd(final String value)
	{
		setMaterialCustInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.materialCustNumber</code> attribute.
	 * @return the materialCustNumber
	 */
	public String getMaterialCustNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALCUSTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.materialCustNumber</code> attribute.
	 * @return the materialCustNumber
	 */
	public String getMaterialCustNumber()
	{
		return getMaterialCustNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.materialCustNumber</code> attribute. 
	 * @param value the materialCustNumber
	 */
	public void setMaterialCustNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALCUSTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.materialCustNumber</code> attribute. 
	 * @param value the materialCustNumber
	 */
	public void setMaterialCustNumber(final String value)
	{
		setMaterialCustNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.systemId</code> attribute.
	 * @return the systemId
	 */
	public String getSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductExclusion.systemId</code> attribute.
	 * @return the systemId
	 */
	public String getSystemId()
	{
		return getSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.systemId</code> attribute. 
	 * @param value the systemId
	 */
	public void setSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductExclusion.systemId</code> attribute. 
	 * @param value the systemId
	 */
	public void setSystemId(final String value)
	{
		setSystemId( getSession().getSessionContext(), value );
	}
	
}
