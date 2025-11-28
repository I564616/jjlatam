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
import de.hybris.platform.jalo.product.Unit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjUomConversion}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjUomConversion extends GenericItem
{
	/** Qualifier of the <code>JnjUomConversion.uOM</code> attribute **/
	public static final String UOM = "uOM";
	/** Qualifier of the <code>JnjUomConversion.numerator</code> attribute **/
	public static final String NUMERATOR = "numerator";
	/** Qualifier of the <code>JnjUomConversion.denominator</code> attribute **/
	public static final String DENOMINATOR = "denominator";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UOM, AttributeMode.INITIAL);
		tmp.put(NUMERATOR, AttributeMode.INITIAL);
		tmp.put(DENOMINATOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.denominator</code> attribute.
	 * @return the denominator
	 */
	public Integer getDenominator(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DENOMINATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.denominator</code> attribute.
	 * @return the denominator
	 */
	public Integer getDenominator()
	{
		return getDenominator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @return the denominator
	 */
	public int getDenominatorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDenominator( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @return the denominator
	 */
	public int getDenominatorAsPrimitive()
	{
		return getDenominatorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @param value the denominator
	 */
	public void setDenominator(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DENOMINATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @param value the denominator
	 */
	public void setDenominator(final Integer value)
	{
		setDenominator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @param value the denominator
	 */
	public void setDenominator(final SessionContext ctx, final int value)
	{
		setDenominator( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.denominator</code> attribute. 
	 * @param value the denominator
	 */
	public void setDenominator(final int value)
	{
		setDenominator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.numerator</code> attribute.
	 * @return the numerator
	 */
	public Integer getNumerator(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.numerator</code> attribute.
	 * @return the numerator
	 */
	public Integer getNumerator()
	{
		return getNumerator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @return the numerator
	 */
	public int getNumeratorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumerator( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @return the numerator
	 */
	public int getNumeratorAsPrimitive()
	{
		return getNumeratorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final Integer value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final SessionContext ctx, final int value)
	{
		setNumerator( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final int value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.uOM</code> attribute.
	 * @return the uOM
	 */
	public Unit getUOM(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjUomConversion.uOM</code> attribute.
	 * @return the uOM
	 */
	public Unit getUOM()
	{
		return getUOM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.uOM</code> attribute. 
	 * @param value the uOM
	 */
	public void setUOM(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjUomConversion.uOM</code> attribute. 
	 * @param value the uOM
	 */
	public void setUOM(final Unit value)
	{
		setUOM( getSession().getSessionContext(), value );
	}
	
}
