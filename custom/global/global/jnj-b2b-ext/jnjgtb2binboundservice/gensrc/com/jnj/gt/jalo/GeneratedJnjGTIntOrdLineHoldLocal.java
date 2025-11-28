/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrdLineHoldLocal}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrdLineHoldLocal extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.sapOrderLineNumber</code> attribute **/
	public static final String SAPORDERLINENUMBER = "sapOrderLineNumber";
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.holdCode</code> attribute **/
	public static final String HOLDCODE = "holdCode";
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.reasonForRejection</code> attribute **/
	public static final String REASONFORREJECTION = "reasonForRejection";
	/** Qualifier of the <code>JnjGTIntOrdLineHoldLocal.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUMBER, AttributeMode.INITIAL);
		tmp.put(HOLDCODE, AttributeMode.INITIAL);
		tmp.put(REASONFORREJECTION, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.holdCode</code> attribute.
	 * @return the holdCode
	 */
	public String getHoldCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOLDCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.holdCode</code> attribute.
	 * @return the holdCode
	 */
	public String getHoldCode()
	{
		return getHoldCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.holdCode</code> attribute. 
	 * @param value the holdCode
	 */
	public void setHoldCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOLDCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.holdCode</code> attribute. 
	 * @param value the holdCode
	 */
	public void setHoldCode(final String value)
	{
		setHoldCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASONFORREJECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.reasonForRejection</code> attribute.
	 * @return the reasonForRejection
	 */
	public String getReasonForRejection()
	{
		return getReasonForRejection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASONFORREJECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.reasonForRejection</code> attribute. 
	 * @param value the reasonForRejection
	 */
	public void setReasonForRejection(final String value)
	{
		setReasonForRejection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber()
	{
		return getSapOrderLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final String value)
	{
		setSapOrderLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdLineHoldLocal.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdLineHoldLocal.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
}
