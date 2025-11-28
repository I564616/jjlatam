/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTExProductAttribute}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTExProductAttribute extends GenericItem
{
	/** Qualifier of the <code>JnjGTExProductAttribute.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnjGTExProductAttribute.characteristicValue</code> attribute **/
	public static final String CHARACTERISTICVALUE = "characteristicValue";
	/** Qualifier of the <code>JnjGTExProductAttribute.classType</code> attribute **/
	public static final String CLASSTYPE = "classType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CHARACTERISTICVALUE, AttributeMode.INITIAL);
		tmp.put(CLASSTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.characteristicValue</code> attribute.
	 * @return the characteristicValue
	 */
	public String getCharacteristicValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHARACTERISTICVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.characteristicValue</code> attribute.
	 * @return the characteristicValue
	 */
	public String getCharacteristicValue()
	{
		return getCharacteristicValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.characteristicValue</code> attribute. 
	 * @param value the characteristicValue
	 */
	public void setCharacteristicValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHARACTERISTICVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.characteristicValue</code> attribute. 
	 * @param value the characteristicValue
	 */
	public void setCharacteristicValue(final String value)
	{
		setCharacteristicValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.classType</code> attribute.
	 * @return the classType
	 */
	public String getClassType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLASSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.classType</code> attribute.
	 * @return the classType
	 */
	public String getClassType()
	{
		return getClassType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.classType</code> attribute. 
	 * @param value the classType
	 */
	public void setClassType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLASSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.classType</code> attribute. 
	 * @param value the classType
	 */
	public void setClassType(final String value)
	{
		setClassType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExProductAttribute.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExProductAttribute.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
}
