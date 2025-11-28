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
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjDeliverySchedule}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjDeliverySchedule extends GenericItem
{
	/** Qualifier of the <code>JnjDeliverySchedule.lineNumber</code> attribute **/
	public static final String LINENUMBER = "lineNumber";
	/** Qualifier of the <code>JnjDeliverySchedule.deliveryDate</code> attribute **/
	public static final String DELIVERYDATE = "deliveryDate";
	/** Qualifier of the <code>JnjDeliverySchedule.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>JnjDeliverySchedule.ownerEntry</code> attribute **/
	public static final String OWNERENTRY = "ownerEntry";
	/** Qualifier of the <code>JnjDeliverySchedule.deliveryLineBlock</code> attribute **/
	public static final String DELIVERYLINEBLOCK = "deliveryLineBlock";
	/** Qualifier of the <code>JnjDeliverySchedule.scheduledLineNumber</code> attribute **/
	public static final String SCHEDULEDLINENUMBER = "scheduledLineNumber";
	/** Qualifier of the <code>JnjDeliverySchedule.materialAvailabilityDate</code> attribute **/
	public static final String MATERIALAVAILABILITYDATE = "materialAvailabilityDate";
	/** Qualifier of the <code>JnjDeliverySchedule.shipDate</code> attribute **/
	public static final String SHIPDATE = "shipDate";
	/** Qualifier of the <code>JnjDeliverySchedule.lineStatus</code> attribute **/
	public static final String LINESTATUS = "lineStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LINENUMBER, AttributeMode.INITIAL);
		tmp.put(DELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(OWNERENTRY, AttributeMode.INITIAL);
		tmp.put(DELIVERYLINEBLOCK, AttributeMode.INITIAL);
		tmp.put(SCHEDULEDLINENUMBER, AttributeMode.INITIAL);
		tmp.put(MATERIALAVAILABILITYDATE, AttributeMode.INITIAL);
		tmp.put(SHIPDATE, AttributeMode.INITIAL);
		tmp.put(LINESTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.deliveryDate</code> attribute.
	 * @return the deliveryDate
	 */
	public Date getDeliveryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.deliveryDate</code> attribute.
	 * @return the deliveryDate
	 */
	public Date getDeliveryDate()
	{
		return getDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.deliveryDate</code> attribute. 
	 * @param value the deliveryDate
	 */
	public void setDeliveryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.deliveryDate</code> attribute. 
	 * @param value the deliveryDate
	 */
	public void setDeliveryDate(final Date value)
	{
		setDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.deliveryLineBlock</code> attribute.
	 * @return the deliveryLineBlock
	 */
	public String getDeliveryLineBlock(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYLINEBLOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.deliveryLineBlock</code> attribute.
	 * @return the deliveryLineBlock
	 */
	public String getDeliveryLineBlock()
	{
		return getDeliveryLineBlock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.deliveryLineBlock</code> attribute. 
	 * @param value the deliveryLineBlock
	 */
	public void setDeliveryLineBlock(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYLINEBLOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.deliveryLineBlock</code> attribute. 
	 * @param value the deliveryLineBlock
	 */
	public void setDeliveryLineBlock(final String value)
	{
		setDeliveryLineBlock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.lineNumber</code> attribute.
	 * @return the lineNumber
	 */
	public String getLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.lineNumber</code> attribute.
	 * @return the lineNumber
	 */
	public String getLineNumber()
	{
		return getLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.lineNumber</code> attribute. 
	 * @param value the lineNumber
	 */
	public void setLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.lineNumber</code> attribute. 
	 * @param value the lineNumber
	 */
	public void setLineNumber(final String value)
	{
		setLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.lineStatus</code> attribute.
	 * @return the lineStatus
	 */
	public String getLineStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.lineStatus</code> attribute.
	 * @return the lineStatus
	 */
	public String getLineStatus()
	{
		return getLineStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.lineStatus</code> attribute. 
	 * @param value the lineStatus
	 */
	public void setLineStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.lineStatus</code> attribute. 
	 * @param value the lineStatus
	 */
	public void setLineStatus(final String value)
	{
		setLineStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.materialAvailabilityDate</code> attribute.
	 * @return the materialAvailabilityDate
	 */
	public Date getMaterialAvailabilityDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MATERIALAVAILABILITYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.materialAvailabilityDate</code> attribute.
	 * @return the materialAvailabilityDate
	 */
	public Date getMaterialAvailabilityDate()
	{
		return getMaterialAvailabilityDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.materialAvailabilityDate</code> attribute. 
	 * @param value the materialAvailabilityDate
	 */
	public void setMaterialAvailabilityDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MATERIALAVAILABILITYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.materialAvailabilityDate</code> attribute. 
	 * @param value the materialAvailabilityDate
	 */
	public void setMaterialAvailabilityDate(final Date value)
	{
		setMaterialAvailabilityDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.ownerEntry</code> attribute.
	 * @return the ownerEntry - This is used as a reference of the order / cart entry
	 */
	public AbstractOrderEntry getOwnerEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, OWNERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.ownerEntry</code> attribute.
	 * @return the ownerEntry - This is used as a reference of the order / cart entry
	 */
	public AbstractOrderEntry getOwnerEntry()
	{
		return getOwnerEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.ownerEntry</code> attribute. 
	 * @param value the ownerEntry - This is used as a reference of the order / cart entry
	 */
	public void setOwnerEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		setProperty(ctx, OWNERENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.ownerEntry</code> attribute. 
	 * @param value the ownerEntry - This is used as a reference of the order / cart entry
	 */
	public void setOwnerEntry(final AbstractOrderEntry value)
	{
		setOwnerEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.qty</code> attribute.
	 * @return the qty
	 */
	public Long getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive(final SessionContext ctx)
	{
		Long value = getQty( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @return the qty
	 */
	public long getQtyAsPrimitive()
	{
		return getQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final Long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final SessionContext ctx, final long value)
	{
		setQty( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.qty</code> attribute. 
	 * @param value the qty
	 */
	public void setQty(final long value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.scheduledLineNumber</code> attribute.
	 * @return the scheduledLineNumber
	 */
	public String getScheduledLineNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCHEDULEDLINENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.scheduledLineNumber</code> attribute.
	 * @return the scheduledLineNumber
	 */
	public String getScheduledLineNumber()
	{
		return getScheduledLineNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.scheduledLineNumber</code> attribute. 
	 * @param value the scheduledLineNumber
	 */
	public void setScheduledLineNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCHEDULEDLINENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.scheduledLineNumber</code> attribute. 
	 * @param value the scheduledLineNumber
	 */
	public void setScheduledLineNumber(final String value)
	{
		setScheduledLineNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SHIPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDeliverySchedule.shipDate</code> attribute.
	 * @return the shipDate
	 */
	public Date getShipDate()
	{
		return getShipDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SHIPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDeliverySchedule.shipDate</code> attribute. 
	 * @param value the shipDate
	 */
	public void setShipDate(final Date value)
	{
		setShipDate( getSession().getSessionContext(), value );
	}
	
}
