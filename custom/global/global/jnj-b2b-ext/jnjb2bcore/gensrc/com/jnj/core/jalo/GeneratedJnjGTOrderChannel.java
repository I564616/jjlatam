/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTOrderChannel}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTOrderChannel extends GenericItem
{
	/** Qualifier of the <code>JnjGTOrderChannel.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>JnjGTOrderChannel.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>JnjGTOrderChannel.sapChannel</code> attribute **/
	public static final String SAPCHANNEL = "sapChannel";
	/** Qualifier of the <code>JnjGTOrderChannel.hybrisChannel</code> attribute **/
	public static final String HYBRISCHANNEL = "hybrisChannel";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(SAPCHANNEL, AttributeMode.INITIAL);
		tmp.put(HYBRISCHANNEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.code</code> attribute.
	 * @return the code - This is the unique code for the combination of SAP Channel value and Hybris Channel Value
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.code</code> attribute.
	 * @return the code - This is the unique code for the combination of SAP Channel value and Hybris Channel Value
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.code</code> attribute. 
	 * @param value the code - This is the unique code for the combination of SAP Channel value and Hybris Channel Value
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.code</code> attribute. 
	 * @param value the code - This is the unique code for the combination of SAP Channel value and Hybris Channel Value
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.hybrisChannel</code> attribute.
	 * @return the hybrisChannel - This holds the channel value represented in Hybris
	 */
	public String getHybrisChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HYBRISCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.hybrisChannel</code> attribute.
	 * @return the hybrisChannel - This holds the channel value represented in Hybris
	 */
	public String getHybrisChannel()
	{
		return getHybrisChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.hybrisChannel</code> attribute. 
	 * @param value the hybrisChannel - This holds the channel value represented in Hybris
	 */
	public void setHybrisChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HYBRISCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.hybrisChannel</code> attribute. 
	 * @param value the hybrisChannel - This holds the channel value represented in Hybris
	 */
	public void setHybrisChannel(final String value)
	{
		setHybrisChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.sapChannel</code> attribute.
	 * @return the sapChannel - This holds the channel value coming from SAP
	 */
	public String getSapChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.sapChannel</code> attribute.
	 * @return the sapChannel - This holds the channel value coming from SAP
	 */
	public String getSapChannel()
	{
		return getSapChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.sapChannel</code> attribute. 
	 * @param value the sapChannel - This holds the channel value coming from SAP
	 */
	public void setSapChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.sapChannel</code> attribute. 
	 * @param value the sapChannel - This holds the channel value coming from SAP
	 */
	public void setSapChannel(final String value)
	{
		setSapChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.type</code> attribute.
	 * @return the type - This holds the type - Electronic / Other
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrderChannel.type</code> attribute.
	 * @return the type - This holds the type - Electronic / Other
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.type</code> attribute. 
	 * @param value the type - This holds the type - Electronic / Other
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrderChannel.type</code> attribute. 
	 * @param value the type - This holds the type - Electronic / Other
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
