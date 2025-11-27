/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjContractEntry;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjContract}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjContract extends GenericItem
{
	/** Qualifier of the <code>JnjContract.eCCContractNum</code> attribute **/
	public static final String ECCCONTRACTNUM = "eCCContractNum";
	/** Qualifier of the <code>JnjContract.cRMContractNum</code> attribute **/
	public static final String CRMCONTRACTNUM = "cRMContractNum";
	/** Qualifier of the <code>JnjContract.tenderNum</code> attribute **/
	public static final String TENDERNUM = "tenderNum";
	/** Qualifier of the <code>JnjContract.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>JnjContract.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnjContract.contractOrderReason</code> attribute **/
	public static final String CONTRACTORDERREASON = "contractOrderReason";
	/** Qualifier of the <code>JnjContract.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>JnjContract.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>JnjContract.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>JnjContract.indirectCustomer</code> attribute **/
	public static final String INDIRECTCUSTOMER = "indirectCustomer";
	/** Qualifier of the <code>JnjContract.totalAmount</code> attribute **/
	public static final String TOTALAMOUNT = "totalAmount";
	/** Qualifier of the <code>JnjContract.balanceAmount</code> attribute **/
	public static final String BALANCEAMOUNT = "balanceAmount";
	/** Qualifier of the <code>JnjContract.jnjContractEntries</code> attribute **/
	public static final String JNJCONTRACTENTRIES = "jnjContractEntries";
	/** Qualifier of the <code>JnjContract.unit</code> attribute **/
	public static final String UNIT = "unit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n UNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjContract> UNITHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjContract>(
	Jnjb2bCoreConstants.TC.JNJCONTRACT,
	false,
	"unit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ECCCONTRACTNUM, AttributeMode.INITIAL);
		tmp.put(CRMCONTRACTNUM, AttributeMode.INITIAL);
		tmp.put(TENDERNUM, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(CONTRACTORDERREASON, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(INDIRECTCUSTOMER, AttributeMode.INITIAL);
		tmp.put(TOTALAMOUNT, AttributeMode.INITIAL);
		tmp.put(BALANCEAMOUNT, AttributeMode.INITIAL);
		tmp.put(JNJCONTRACTENTRIES, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.balanceAmount</code> attribute.
	 * @return the balanceAmount
	 */
	public Double getBalanceAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BALANCEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.balanceAmount</code> attribute.
	 * @return the balanceAmount
	 */
	public Double getBalanceAmount()
	{
		return getBalanceAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @return the balanceAmount
	 */
	public double getBalanceAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getBalanceAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @return the balanceAmount
	 */
	public double getBalanceAmountAsPrimitive()
	{
		return getBalanceAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @param value the balanceAmount
	 */
	public void setBalanceAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BALANCEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @param value the balanceAmount
	 */
	public void setBalanceAmount(final Double value)
	{
		setBalanceAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @param value the balanceAmount
	 */
	public void setBalanceAmount(final SessionContext ctx, final double value)
	{
		setBalanceAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.balanceAmount</code> attribute. 
	 * @param value the balanceAmount
	 */
	public void setBalanceAmount(final double value)
	{
		setBalanceAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.contractOrderReason</code> attribute.
	 * @return the contractOrderReason
	 */
	public String getContractOrderReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTORDERREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.contractOrderReason</code> attribute.
	 * @return the contractOrderReason
	 */
	public String getContractOrderReason()
	{
		return getContractOrderReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.contractOrderReason</code> attribute. 
	 * @param value the contractOrderReason
	 */
	public void setContractOrderReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTORDERREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.contractOrderReason</code> attribute. 
	 * @param value the contractOrderReason
	 */
	public void setContractOrderReason(final String value)
	{
		setContractOrderReason( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		UNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.cRMContractNum</code> attribute.
	 * @return the cRMContractNum
	 */
	public String getCRMContractNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CRMCONTRACTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.cRMContractNum</code> attribute.
	 * @return the cRMContractNum
	 */
	public String getCRMContractNum()
	{
		return getCRMContractNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.cRMContractNum</code> attribute. 
	 * @param value the cRMContractNum
	 */
	public void setCRMContractNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CRMCONTRACTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.cRMContractNum</code> attribute. 
	 * @param value the cRMContractNum
	 */
	public void setCRMContractNum(final String value)
	{
		setCRMContractNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.eCCContractNum</code> attribute.
	 * @return the eCCContractNum
	 */
	public String getECCContractNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ECCCONTRACTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.eCCContractNum</code> attribute.
	 * @return the eCCContractNum
	 */
	public String getECCContractNum()
	{
		return getECCContractNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.eCCContractNum</code> attribute. 
	 * @param value the eCCContractNum
	 */
	public void setECCContractNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ECCCONTRACTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.eCCContractNum</code> attribute. 
	 * @param value the eCCContractNum
	 */
	public void setECCContractNum(final String value)
	{
		setECCContractNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDIRECTCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer()
	{
		return getIndirectCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDIRECTCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final String value)
	{
		setIndirectCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.jnjContractEntries</code> attribute.
	 * @return the jnjContractEntries
	 */
	public List<JnjContractEntry> getJnjContractEntries(final SessionContext ctx)
	{
		List<JnjContractEntry> coll = (List<JnjContractEntry>)getProperty( ctx, JNJCONTRACTENTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.jnjContractEntries</code> attribute.
	 * @return the jnjContractEntries
	 */
	public List<JnjContractEntry> getJnjContractEntries()
	{
		return getJnjContractEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.jnjContractEntries</code> attribute. 
	 * @param value the jnjContractEntries
	 */
	public void setJnjContractEntries(final SessionContext ctx, final List<JnjContractEntry> value)
	{
		setProperty(ctx, JNJCONTRACTENTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.jnjContractEntries</code> attribute. 
	 * @param value the jnjContractEntries
	 */
	public void setJnjContractEntries(final List<JnjContractEntry> value)
	{
		setJnjContractEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.tenderNum</code> attribute.
	 * @return the tenderNum
	 */
	public String getTenderNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TENDERNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.tenderNum</code> attribute.
	 * @return the tenderNum
	 */
	public String getTenderNum()
	{
		return getTenderNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.tenderNum</code> attribute. 
	 * @param value the tenderNum
	 */
	public void setTenderNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TENDERNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.tenderNum</code> attribute. 
	 * @param value the tenderNum
	 */
	public void setTenderNum(final String value)
	{
		setTenderNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.totalAmount</code> attribute.
	 * @return the totalAmount
	 */
	public Double getTotalAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.totalAmount</code> attribute.
	 * @return the totalAmount
	 */
	public Double getTotalAmount()
	{
		return getTotalAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @return the totalAmount
	 */
	public double getTotalAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @return the totalAmount
	 */
	public double getTotalAmountAsPrimitive()
	{
		return getTotalAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @param value the totalAmount
	 */
	public void setTotalAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @param value the totalAmount
	 */
	public void setTotalAmount(final Double value)
	{
		setTotalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @param value the totalAmount
	 */
	public void setTotalAmount(final SessionContext ctx, final double value)
	{
		setTotalAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.totalAmount</code> attribute. 
	 * @param value the totalAmount
	 */
	public void setTotalAmount(final double value)
	{
		setTotalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.unit</code> attribute.
	 * @return the unit
	 */
	public B2BUnit getUnit(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjContract.unit</code> attribute.
	 * @return the unit
	 */
	public B2BUnit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final B2BUnit value)
	{
		UNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjContract.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final B2BUnit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
