/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntermediateMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntermediateMaster extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntermediateMaster.recordStatus</code> attribute **/
	public static final String RECORDSTATUS = "recordStatus";
	/** Qualifier of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute **/
	public static final String WRITEATTEMPTS = "writeAttempts";
	/** Qualifier of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute **/
	public static final String SENTTODASHBOARD = "sentToDashboard";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RECORDSTATUS, AttributeMode.INITIAL);
		tmp.put(WRITEATTEMPTS, AttributeMode.INITIAL);
		tmp.put(SENTTODASHBOARD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.recordStatus</code> attribute.
	 * @return the recordStatus
	 */
	public EnumerationValue getRecordStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECORDSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.recordStatus</code> attribute.
	 * @return the recordStatus
	 */
	public EnumerationValue getRecordStatus()
	{
		return getRecordStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.recordStatus</code> attribute. 
	 * @param value the recordStatus
	 */
	public void setRecordStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECORDSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.recordStatus</code> attribute. 
	 * @param value the recordStatus
	 */
	public void setRecordStatus(final EnumerationValue value)
	{
		setRecordStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute.
	 * @return the sentToDashboard
	 */
	public Boolean isSentToDashboard(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENTTODASHBOARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute.
	 * @return the sentToDashboard
	 */
	public Boolean isSentToDashboard()
	{
		return isSentToDashboard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @return the sentToDashboard
	 */
	public boolean isSentToDashboardAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSentToDashboard( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @return the sentToDashboard
	 */
	public boolean isSentToDashboardAsPrimitive()
	{
		return isSentToDashboardAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENTTODASHBOARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final Boolean value)
	{
		setSentToDashboard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final SessionContext ctx, final boolean value)
	{
		setSentToDashboard( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final boolean value)
	{
		setSentToDashboard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute.
	 * @return the writeAttempts
	 */
	public Integer getWriteAttempts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WRITEATTEMPTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute.
	 * @return the writeAttempts
	 */
	public Integer getWriteAttempts()
	{
		return getWriteAttempts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @return the writeAttempts
	 */
	public int getWriteAttemptsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWriteAttempts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @return the writeAttempts
	 */
	public int getWriteAttemptsAsPrimitive()
	{
		return getWriteAttemptsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WRITEATTEMPTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final Integer value)
	{
		setWriteAttempts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final SessionContext ctx, final int value)
	{
		setWriteAttempts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntermediateMaster.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final int value)
	{
		setWriteAttempts( getSession().getSessionContext(), value );
	}
	
}
