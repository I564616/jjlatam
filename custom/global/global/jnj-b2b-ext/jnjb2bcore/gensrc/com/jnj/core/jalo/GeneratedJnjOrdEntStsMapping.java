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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjOrdEntStsMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjOrdEntStsMapping extends GenericItem
{
	/** Qualifier of the <code>JnjOrdEntStsMapping.overAllStatus</code> attribute **/
	public static final String OVERALLSTATUS = "overAllStatus";
	/** Qualifier of the <code>JnjOrdEntStsMapping.rejectionStatus</code> attribute **/
	public static final String REJECTIONSTATUS = "rejectionStatus";
	/** Qualifier of the <code>JnjOrdEntStsMapping.deliveryStatus</code> attribute **/
	public static final String DELIVERYSTATUS = "deliveryStatus";
	/** Qualifier of the <code>JnjOrdEntStsMapping.invoiceStatus</code> attribute **/
	public static final String INVOICESTATUS = "invoiceStatus";
	/** Qualifier of the <code>JnjOrdEntStsMapping.orderEntryStatus</code> attribute **/
	public static final String ORDERENTRYSTATUS = "orderEntryStatus";
	/** Qualifier of the <code>JnjOrdEntStsMapping.GTSHold</code> attribute **/
	public static final String GTSHOLD = "GTSHold";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OVERALLSTATUS, AttributeMode.INITIAL);
		tmp.put(REJECTIONSTATUS, AttributeMode.INITIAL);
		tmp.put(DELIVERYSTATUS, AttributeMode.INITIAL);
		tmp.put(INVOICESTATUS, AttributeMode.INITIAL);
		tmp.put(ORDERENTRYSTATUS, AttributeMode.INITIAL);
		tmp.put(GTSHOLD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.deliveryStatus</code> attribute.
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus()
	{
		return getDeliveryStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.deliveryStatus</code> attribute. 
	 * @param value the deliveryStatus
	 */
	public void setDeliveryStatus(final String value)
	{
		setDeliveryStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.GTSHold</code> attribute.
	 * @return the GTSHold
	 */
	public String getGTSHold(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTSHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.GTSHold</code> attribute.
	 * @return the GTSHold
	 */
	public String getGTSHold()
	{
		return getGTSHold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.GTSHold</code> attribute. 
	 * @param value the GTSHold
	 */
	public void setGTSHold(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTSHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.GTSHold</code> attribute. 
	 * @param value the GTSHold
	 */
	public void setGTSHold(final String value)
	{
		setGTSHold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.invoiceStatus</code> attribute.
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus()
	{
		return getInvoiceStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.invoiceStatus</code> attribute. 
	 * @param value the invoiceStatus
	 */
	public void setInvoiceStatus(final String value)
	{
		setInvoiceStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.orderEntryStatus</code> attribute.
	 * @return the orderEntryStatus
	 */
	public EnumerationValue getOrderEntryStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ORDERENTRYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.orderEntryStatus</code> attribute.
	 * @return the orderEntryStatus
	 */
	public EnumerationValue getOrderEntryStatus()
	{
		return getOrderEntryStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.orderEntryStatus</code> attribute. 
	 * @param value the orderEntryStatus
	 */
	public void setOrderEntryStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ORDERENTRYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.orderEntryStatus</code> attribute. 
	 * @param value the orderEntryStatus
	 */
	public void setOrderEntryStatus(final EnumerationValue value)
	{
		setOrderEntryStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERALLSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.overAllStatus</code> attribute.
	 * @return the overAllStatus
	 */
	public String getOverAllStatus()
	{
		return getOverAllStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERALLSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.overAllStatus</code> attribute. 
	 * @param value the overAllStatus
	 */
	public void setOverAllStatus(final String value)
	{
		setOverAllStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.rejectionStatus</code> attribute.
	 * @return the rejectionStatus
	 */
	public String getRejectionStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REJECTIONSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjOrdEntStsMapping.rejectionStatus</code> attribute.
	 * @return the rejectionStatus
	 */
	public String getRejectionStatus()
	{
		return getRejectionStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.rejectionStatus</code> attribute. 
	 * @param value the rejectionStatus
	 */
	public void setRejectionStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REJECTIONSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjOrdEntStsMapping.rejectionStatus</code> attribute. 
	 * @param value the rejectionStatus
	 */
	public void setRejectionStatus(final String value)
	{
		setRejectionStatus( getSession().getSessionContext(), value );
	}
	
}
