/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjImtContractEntry;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjImtContract}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjImtContract extends GenericItem
{
	/** Qualifier of the <code>JnjImtContract.contractNoEcc</code> attribute **/
	public static final String CONTRACTNOECC = "contractNoEcc";
	/** Qualifier of the <code>JnjImtContract.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>JnjImtContract.tenderNo</code> attribute **/
	public static final String TENDERNO = "tenderNo";
	/** Qualifier of the <code>JnjImtContract.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>JnjImtContract.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnjImtContract.statusH</code> attribute **/
	public static final String STATUSH = "statusH";
	/** Qualifier of the <code>JnjImtContract.orderReason</code> attribute **/
	public static final String ORDERREASON = "orderReason";
	/** Qualifier of the <code>JnjImtContract.docType</code> attribute **/
	public static final String DOCTYPE = "docType";
	/** Qualifier of the <code>JnjImtContract.indirectCustomer</code> attribute **/
	public static final String INDIRECTCUSTOMER = "indirectCustomer";
	/** Qualifier of the <code>JnjImtContract.totalAmt</code> attribute **/
	public static final String TOTALAMT = "totalAmt";
	/** Qualifier of the <code>JnjImtContract.balanceAmt</code> attribute **/
	public static final String BALANCEAMT = "balanceAmt";
	/** Qualifier of the <code>JnjImtContract.jnjImtContractEntries</code> attribute **/
	public static final String JNJIMTCONTRACTENTRIES = "jnjImtContractEntries";
	/** Qualifier of the <code>JnjImtContract.fileName</code> attribute **/
	public static final String FILENAME = "fileName";
	/** Qualifier of the <code>JnjImtContract.recordStatus</code> attribute **/
	public static final String RECORDSTATUS = "recordStatus";
	/** Qualifier of the <code>JnjImtContract.writeAttempts</code> attribute **/
	public static final String WRITEATTEMPTS = "writeAttempts";
	/** Qualifier of the <code>JnjImtContract.sentToDashboard</code> attribute **/
	public static final String SENTTODASHBOARD = "sentToDashboard";
	/** Qualifier of the <code>JnjImtContract.idocNumber</code> attribute **/
	public static final String IDOCNUMBER = "idocNumber";
	/** Qualifier of the <code>JnjImtContract.activation</code> attribute **/
	public static final String ACTIVATION = "activation";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONTRACTNOECC, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		tmp.put(TENDERNO, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(STATUSH, AttributeMode.INITIAL);
		tmp.put(ORDERREASON, AttributeMode.INITIAL);
		tmp.put(DOCTYPE, AttributeMode.INITIAL);
		tmp.put(INDIRECTCUSTOMER, AttributeMode.INITIAL);
		tmp.put(TOTALAMT, AttributeMode.INITIAL);
		tmp.put(BALANCEAMT, AttributeMode.INITIAL);
		tmp.put(JNJIMTCONTRACTENTRIES, AttributeMode.INITIAL);
		tmp.put(FILENAME, AttributeMode.INITIAL);
		tmp.put(RECORDSTATUS, AttributeMode.INITIAL);
		tmp.put(WRITEATTEMPTS, AttributeMode.INITIAL);
		tmp.put(SENTTODASHBOARD, AttributeMode.INITIAL);
		tmp.put(IDOCNUMBER, AttributeMode.INITIAL);
		tmp.put(ACTIVATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.activation</code> attribute.
	 * @return the activation
	 */
	public Boolean isActivation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.activation</code> attribute.
	 * @return the activation
	 */
	public Boolean isActivation()
	{
		return isActivation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.activation</code> attribute. 
	 * @return the activation
	 */
	public boolean isActivationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActivation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.activation</code> attribute. 
	 * @return the activation
	 */
	public boolean isActivationAsPrimitive()
	{
		return isActivationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.activation</code> attribute. 
	 * @param value the activation
	 */
	public void setActivation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.activation</code> attribute. 
	 * @param value the activation
	 */
	public void setActivation(final Boolean value)
	{
		setActivation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.activation</code> attribute. 
	 * @param value the activation
	 */
	public void setActivation(final SessionContext ctx, final boolean value)
	{
		setActivation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.activation</code> attribute. 
	 * @param value the activation
	 */
	public void setActivation(final boolean value)
	{
		setActivation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.balanceAmt</code> attribute.
	 * @return the balanceAmt
	 */
	public String getBalanceAmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BALANCEAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.balanceAmt</code> attribute.
	 * @return the balanceAmt
	 */
	public String getBalanceAmt()
	{
		return getBalanceAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.balanceAmt</code> attribute. 
	 * @param value the balanceAmt
	 */
	public void setBalanceAmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BALANCEAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.balanceAmt</code> attribute. 
	 * @param value the balanceAmt
	 */
	public void setBalanceAmt(final String value)
	{
		setBalanceAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.contractNoEcc</code> attribute.
	 * @return the contractNoEcc
	 */
	public String getContractNoEcc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTNOECC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.contractNoEcc</code> attribute.
	 * @return the contractNoEcc
	 */
	public String getContractNoEcc()
	{
		return getContractNoEcc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.contractNoEcc</code> attribute. 
	 * @param value the contractNoEcc
	 */
	public void setContractNoEcc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTNOECC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.contractNoEcc</code> attribute. 
	 * @param value the contractNoEcc
	 */
	public void setContractNoEcc(final String value)
	{
		setContractNoEcc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.customer</code> attribute.
	 * @return the customer
	 */
	public String getCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.customer</code> attribute.
	 * @return the customer
	 */
	public String getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final String value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.docType</code> attribute.
	 * @return the docType
	 */
	public String getDocType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.docType</code> attribute.
	 * @return the docType
	 */
	public String getDocType()
	{
		return getDocType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.docType</code> attribute. 
	 * @param value the docType
	 */
	public void setDocType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.docType</code> attribute. 
	 * @param value the docType
	 */
	public void setDocType(final String value)
	{
		setDocType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.endDate</code> attribute.
	 * @return the endDate
	 */
	public String getEndDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.endDate</code> attribute.
	 * @return the endDate
	 */
	public String getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final String value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.fileName</code> attribute.
	 * @return the fileName
	 */
	public String getFileName()
	{
		return getFileName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.fileName</code> attribute. 
	 * @param value the fileName
	 */
	public void setFileName(final String value)
	{
		setFileName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.idocNumber</code> attribute.
	 * @return the idocNumber
	 */
	public String getIdocNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IDOCNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.idocNumber</code> attribute.
	 * @return the idocNumber
	 */
	public String getIdocNumber()
	{
		return getIdocNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.idocNumber</code> attribute. 
	 * @param value the idocNumber
	 */
	public void setIdocNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IDOCNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.idocNumber</code> attribute. 
	 * @param value the idocNumber
	 */
	public void setIdocNumber(final String value)
	{
		setIdocNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDIRECTCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.indirectCustomer</code> attribute.
	 * @return the indirectCustomer
	 */
	public String getIndirectCustomer()
	{
		return getIndirectCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDIRECTCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.indirectCustomer</code> attribute. 
	 * @param value the indirectCustomer
	 */
	public void setIndirectCustomer(final String value)
	{
		setIndirectCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.jnjImtContractEntries</code> attribute.
	 * @return the jnjImtContractEntries - This attribute is of CLOB type and can store large datas.
	 */
	public List<JnjImtContractEntry> getJnjImtContractEntries(final SessionContext ctx)
	{
		List<JnjImtContractEntry> coll = (List<JnjImtContractEntry>)getProperty( ctx, JNJIMTCONTRACTENTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.jnjImtContractEntries</code> attribute.
	 * @return the jnjImtContractEntries - This attribute is of CLOB type and can store large datas.
	 */
	public List<JnjImtContractEntry> getJnjImtContractEntries()
	{
		return getJnjImtContractEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.jnjImtContractEntries</code> attribute. 
	 * @param value the jnjImtContractEntries - This attribute is of CLOB type and can store large datas.
	 */
	public void setJnjImtContractEntries(final SessionContext ctx, final List<JnjImtContractEntry> value)
	{
		setProperty(ctx, JNJIMTCONTRACTENTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.jnjImtContractEntries</code> attribute. 
	 * @param value the jnjImtContractEntries - This attribute is of CLOB type and can store large datas.
	 */
	public void setJnjImtContractEntries(final List<JnjImtContractEntry> value)
	{
		setJnjImtContractEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.orderReason</code> attribute.
	 * @return the orderReason
	 */
	public String getOrderReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.orderReason</code> attribute.
	 * @return the orderReason
	 */
	public String getOrderReason()
	{
		return getOrderReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.orderReason</code> attribute. 
	 * @param value the orderReason
	 */
	public void setOrderReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.orderReason</code> attribute. 
	 * @param value the orderReason
	 */
	public void setOrderReason(final String value)
	{
		setOrderReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.recordStatus</code> attribute.
	 * @return the recordStatus
	 */
	public EnumerationValue getRecordStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECORDSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.recordStatus</code> attribute.
	 * @return the recordStatus
	 */
	public EnumerationValue getRecordStatus()
	{
		return getRecordStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.recordStatus</code> attribute. 
	 * @param value the recordStatus
	 */
	public void setRecordStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECORDSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.recordStatus</code> attribute. 
	 * @param value the recordStatus
	 */
	public void setRecordStatus(final EnumerationValue value)
	{
		setRecordStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.sentToDashboard</code> attribute.
	 * @return the sentToDashboard
	 */
	public Boolean isSentToDashboard(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENTTODASHBOARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.sentToDashboard</code> attribute.
	 * @return the sentToDashboard
	 */
	public Boolean isSentToDashboard()
	{
		return isSentToDashboard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @return the sentToDashboard
	 */
	public boolean isSentToDashboardAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSentToDashboard( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @return the sentToDashboard
	 */
	public boolean isSentToDashboardAsPrimitive()
	{
		return isSentToDashboardAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENTTODASHBOARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final Boolean value)
	{
		setSentToDashboard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final SessionContext ctx, final boolean value)
	{
		setSentToDashboard( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.sentToDashboard</code> attribute. 
	 * @param value the sentToDashboard
	 */
	public void setSentToDashboard(final boolean value)
	{
		setSentToDashboard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.startDate</code> attribute.
	 * @return the startDate
	 */
	public String getStartDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.startDate</code> attribute.
	 * @return the startDate
	 */
	public String getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final String value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.statusH</code> attribute.
	 * @return the statusH
	 */
	public String getStatusH(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUSH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.statusH</code> attribute.
	 * @return the statusH
	 */
	public String getStatusH()
	{
		return getStatusH( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.statusH</code> attribute. 
	 * @param value the statusH
	 */
	public void setStatusH(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUSH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.statusH</code> attribute. 
	 * @param value the statusH
	 */
	public void setStatusH(final String value)
	{
		setStatusH( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.tenderNo</code> attribute.
	 * @return the tenderNo
	 */
	public String getTenderNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TENDERNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.tenderNo</code> attribute.
	 * @return the tenderNo
	 */
	public String getTenderNo()
	{
		return getTenderNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.tenderNo</code> attribute. 
	 * @param value the tenderNo
	 */
	public void setTenderNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TENDERNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.tenderNo</code> attribute. 
	 * @param value the tenderNo
	 */
	public void setTenderNo(final String value)
	{
		setTenderNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.totalAmt</code> attribute.
	 * @return the totalAmt
	 */
	public String getTotalAmt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.totalAmt</code> attribute.
	 * @return the totalAmt
	 */
	public String getTotalAmt()
	{
		return getTotalAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.totalAmt</code> attribute. 
	 * @param value the totalAmt
	 */
	public void setTotalAmt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.totalAmt</code> attribute. 
	 * @param value the totalAmt
	 */
	public void setTotalAmt(final String value)
	{
		setTotalAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.writeAttempts</code> attribute.
	 * @return the writeAttempts
	 */
	public Integer getWriteAttempts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WRITEATTEMPTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.writeAttempts</code> attribute.
	 * @return the writeAttempts
	 */
	public Integer getWriteAttempts()
	{
		return getWriteAttempts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @return the writeAttempts
	 */
	public int getWriteAttemptsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWriteAttempts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @return the writeAttempts
	 */
	public int getWriteAttemptsAsPrimitive()
	{
		return getWriteAttemptsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WRITEATTEMPTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final Integer value)
	{
		setWriteAttempts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final SessionContext ctx, final int value)
	{
		setWriteAttempts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjImtContract.writeAttempts</code> attribute. 
	 * @param value the writeAttempts
	 */
	public void setWriteAttempts(final int value)
	{
		setWriteAttempts( getSession().getSessionContext(), value );
	}
	
}
