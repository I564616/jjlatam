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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderLinePart}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderLinePart extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrderLinePart.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrderLinePart.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrderLinePart.sapOrderLineNumber</code> attribute **/
	public static final String SAPORDERLINENUMBER = "sapOrderLineNumber";
	/** Qualifier of the <code>JnjGTIntOrderLinePart.partFunc</code> attribute **/
	public static final String PARTFUNC = "partFunc";
	/** Qualifier of the <code>JnjGTIntOrderLinePart.customerNum</code> attribute **/
	public static final String CUSTOMERNUM = "customerNum";
	/** Qualifier of the <code>JnjGTIntOrderLinePart.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUMBER, AttributeMode.INITIAL);
		tmp.put(PARTFUNC, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNUM, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.customerNum</code> attribute.
	 * @return the customerNum
	 */
	public String getCustomerNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.customerNum</code> attribute.
	 * @return the customerNum
	 */
	public String getCustomerNum()
	{
		return getCustomerNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.customerNum</code> attribute. 
	 * @param value the customerNum
	 */
	public void setCustomerNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.customerNum</code> attribute. 
	 * @param value the customerNum
	 */
	public void setCustomerNum(final String value)
	{
		setCustomerNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.partFunc</code> attribute.
	 * @return the partFunc
	 */
	public String getPartFunc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTFUNC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.partFunc</code> attribute.
	 * @return the partFunc
	 */
	public String getPartFunc()
	{
		return getPartFunc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.partFunc</code> attribute. 
	 * @param value the partFunc
	 */
	public void setPartFunc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTFUNC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.partFunc</code> attribute. 
	 * @param value the partFunc
	 */
	public void setPartFunc(final String value)
	{
		setPartFunc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber()
	{
		return getSapOrderLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final String value)
	{
		setSapOrderLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderLinePart.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderLinePart.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
}
