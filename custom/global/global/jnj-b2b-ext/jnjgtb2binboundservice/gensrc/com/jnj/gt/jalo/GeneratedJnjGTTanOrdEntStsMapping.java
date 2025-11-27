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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTTanOrdEntStsMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTTanOrdEntStsMapping extends GenericItem
{
	/** Qualifier of the <code>JnjGTTanOrdEntStsMapping.firstTanOrderLineStatus</code> attribute **/
	public static final String FIRSTTANORDERLINESTATUS = "firstTanOrderLineStatus";
	/** Qualifier of the <code>JnjGTTanOrdEntStsMapping.secondTanOrderLineStatus</code> attribute **/
	public static final String SECONDTANORDERLINESTATUS = "secondTanOrderLineStatus";
	/** Qualifier of the <code>JnjGTTanOrdEntStsMapping.finalStatus</code> attribute **/
	public static final String FINALSTATUS = "finalStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTTANORDERLINESTATUS, AttributeMode.INITIAL);
		tmp.put(SECONDTANORDERLINESTATUS, AttributeMode.INITIAL);
		tmp.put(FINALSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.finalStatus</code> attribute.
	 * @return the finalStatus
	 */
	public EnumerationValue getFinalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FINALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.finalStatus</code> attribute.
	 * @return the finalStatus
	 */
	public EnumerationValue getFinalStatus()
	{
		return getFinalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.finalStatus</code> attribute. 
	 * @param value the finalStatus
	 */
	public void setFinalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FINALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.finalStatus</code> attribute. 
	 * @param value the finalStatus
	 */
	public void setFinalStatus(final EnumerationValue value)
	{
		setFinalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.firstTanOrderLineStatus</code> attribute.
	 * @return the firstTanOrderLineStatus
	 */
	public String getFirstTanOrderLineStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTTANORDERLINESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.firstTanOrderLineStatus</code> attribute.
	 * @return the firstTanOrderLineStatus
	 */
	public String getFirstTanOrderLineStatus()
	{
		return getFirstTanOrderLineStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.firstTanOrderLineStatus</code> attribute. 
	 * @param value the firstTanOrderLineStatus
	 */
	public void setFirstTanOrderLineStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTTANORDERLINESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.firstTanOrderLineStatus</code> attribute. 
	 * @param value the firstTanOrderLineStatus
	 */
	public void setFirstTanOrderLineStatus(final String value)
	{
		setFirstTanOrderLineStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.secondTanOrderLineStatus</code> attribute.
	 * @return the secondTanOrderLineStatus
	 */
	public String getSecondTanOrderLineStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECONDTANORDERLINESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTanOrdEntStsMapping.secondTanOrderLineStatus</code> attribute.
	 * @return the secondTanOrderLineStatus
	 */
	public String getSecondTanOrderLineStatus()
	{
		return getSecondTanOrderLineStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.secondTanOrderLineStatus</code> attribute. 
	 * @param value the secondTanOrderLineStatus
	 */
	public void setSecondTanOrderLineStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECONDTANORDERLINESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTanOrdEntStsMapping.secondTanOrderLineStatus</code> attribute. 
	 * @param value the secondTanOrderLineStatus
	 */
	public void setSecondTanOrderLineStatus(final String value)
	{
		setSecondTanOrderLineStatus( getSession().getSessionContext(), value );
	}
	
}
