/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrderSchLine}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrderSchLine extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrderSchLine.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.sapOrderLineNumber</code> attribute **/
	public static final String SAPORDERLINENUMBER = "sapOrderLineNumber";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.schLineNumber</code> attribute **/
	public static final String SCHLINENUMBER = "schLineNumber";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.deliveryDate</code> attribute **/
	public static final String DELIVERYDATE = "deliveryDate";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.lineStatus</code> attribute **/
	public static final String LINESTATUS = "lineStatus";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.confirmedQty</code> attribute **/
	public static final String CONFIRMEDQTY = "confirmedQty";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.schedShipDate</code> attribute **/
	public static final String SCHEDSHIPDATE = "schedShipDate";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.deliveryLineBlock</code> attribute **/
	public static final String DELIVERYLINEBLOCK = "deliveryLineBlock";
	/** Qualifier of the <code>JnjGTIntOrderSchLine.recordTimeStamp</code> attribute **/
	public static final String RECORDTIMESTAMP = "recordTimeStamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SAPORDERLINENUMBER, AttributeMode.INITIAL);
		tmp.put(SCHLINENUMBER, AttributeMode.INITIAL);
		tmp.put(DELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(LINESTATUS, AttributeMode.INITIAL);
		tmp.put(CONFIRMEDQTY, AttributeMode.INITIAL);
		tmp.put(SCHEDSHIPDATE, AttributeMode.INITIAL);
		tmp.put(DELIVERYLINEBLOCK, AttributeMode.INITIAL);
		tmp.put(RECORDTIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.confirmedQty</code> attribute.
	 * @return the confirmedQty
	 */
	public String getConfirmedQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONFIRMEDQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.confirmedQty</code> attribute.
	 * @return the confirmedQty
	 */
	public String getConfirmedQty()
	{
		return getConfirmedQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.confirmedQty</code> attribute. 
	 * @param value the confirmedQty
	 */
	public void setConfirmedQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONFIRMEDQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.confirmedQty</code> attribute. 
	 * @param value the confirmedQty
	 */
	public void setConfirmedQty(final String value)
	{
		setConfirmedQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.deliveryDate</code> attribute.
	 * @return the deliveryDate
	 */
	public String getDeliveryDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.deliveryDate</code> attribute.
	 * @return the deliveryDate
	 */
	public String getDeliveryDate()
	{
		return getDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.deliveryDate</code> attribute. 
	 * @param value the deliveryDate
	 */
	public void setDeliveryDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.deliveryDate</code> attribute. 
	 * @param value the deliveryDate
	 */
	public void setDeliveryDate(final String value)
	{
		setDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.deliveryLineBlock</code> attribute.
	 * @return the deliveryLineBlock
	 */
	public String getDeliveryLineBlock(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYLINEBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.deliveryLineBlock</code> attribute.
	 * @return the deliveryLineBlock
	 */
	public String getDeliveryLineBlock()
	{
		return getDeliveryLineBlock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.deliveryLineBlock</code> attribute. 
	 * @param value the deliveryLineBlock
	 */
	public void setDeliveryLineBlock(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYLINEBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.deliveryLineBlock</code> attribute. 
	 * @param value the deliveryLineBlock
	 */
	public void setDeliveryLineBlock(final String value)
	{
		setDeliveryLineBlock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.lineStatus</code> attribute.
	 * @return the lineStatus
	 */
	public String getLineStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.lineStatus</code> attribute.
	 * @return the lineStatus
	 */
	public String getLineStatus()
	{
		return getLineStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.lineStatus</code> attribute. 
	 * @param value the lineStatus
	 */
	public void setLineStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.lineStatus</code> attribute. 
	 * @param value the lineStatus
	 */
	public void setLineStatus(final String value)
	{
		setLineStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECORDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.recordTimeStamp</code> attribute.
	 * @return the recordTimeStamp
	 */
	public Date getRecordTimeStamp()
	{
		return getRecordTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECORDTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.recordTimeStamp</code> attribute. 
	 * @param value the recordTimeStamp
	 */
	public void setRecordTimeStamp(final Date value)
	{
		setRecordTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sapOrderLineNumber</code> attribute.
	 * @return the sapOrderLineNumber
	 */
	public String getSapOrderLineNumber()
	{
		return getSapOrderLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sapOrderLineNumber</code> attribute. 
	 * @param value the sapOrderLineNumber
	 */
	public void setSapOrderLineNumber(final String value)
	{
		setSapOrderLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.schedShipDate</code> attribute.
	 * @return the schedShipDate
	 */
	public String getSchedShipDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCHEDSHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.schedShipDate</code> attribute.
	 * @return the schedShipDate
	 */
	public String getSchedShipDate()
	{
		return getSchedShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.schedShipDate</code> attribute. 
	 * @param value the schedShipDate
	 */
	public void setSchedShipDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCHEDSHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.schedShipDate</code> attribute. 
	 * @param value the schedShipDate
	 */
	public void setSchedShipDate(final String value)
	{
		setSchedShipDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.schLineNumber</code> attribute.
	 * @return the schLineNumber
	 */
	public String getSchLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCHLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.schLineNumber</code> attribute.
	 * @return the schLineNumber
	 */
	public String getSchLineNumber()
	{
		return getSchLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.schLineNumber</code> attribute. 
	 * @param value the schLineNumber
	 */
	public void setSchLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCHLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.schLineNumber</code> attribute. 
	 * @param value the schLineNumber
	 */
	public void setSchLineNumber(final String value)
	{
		setSchLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrderSchLine.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrderSchLine.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
}
