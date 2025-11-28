/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import com.jnj.core.jalo.JnjGTCpscContact;
import com.jnj.core.jalo.JnjGTCpscTestDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTProductCpscDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTProductCpscDetail extends GenericItem
{
	/** Qualifier of the <code>JnjGTProductCpscDetail.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>JnjGTProductCpscDetail.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>JnjGTProductCpscDetail.upcCode</code> attribute **/
	public static final String UPCCODE = "upcCode";
	/** Qualifier of the <code>JnjGTProductCpscDetail.lotNumber</code> attribute **/
	public static final String LOTNUMBER = "lotNumber";
	/** Qualifier of the <code>JnjGTProductCpscDetail.cpscRuleDescription</code> attribute **/
	public static final String CPSCRULEDESCRIPTION = "cpscRuleDescription";
	/** Qualifier of the <code>JnjGTProductCpscDetail.mfgCompanyCode</code> attribute **/
	public static final String MFGCOMPANYCODE = "mfgCompanyCode";
	/** Qualifier of the <code>JnjGTProductCpscDetail.cpsiComments</code> attribute **/
	public static final String CPSICOMMENTS = "cpsiComments";
	/** Qualifier of the <code>JnjGTProductCpscDetail.certificateCreateDate</code> attribute **/
	public static final String CERTIFICATECREATEDATE = "certificateCreateDate";
	/** Qualifier of the <code>JnjGTProductCpscDetail.certificateCreater</code> attribute **/
	public static final String CERTIFICATECREATER = "certificateCreater";
	/** Qualifier of the <code>JnjGTProductCpscDetail.certificateModifiedDate</code> attribute **/
	public static final String CERTIFICATEMODIFIEDDATE = "certificateModifiedDate";
	/** Qualifier of the <code>JnjGTProductCpscDetail.addressLotNumber</code> attribute **/
	public static final String ADDRESSLOTNUMBER = "addressLotNumber";
	/** Qualifier of the <code>JnjGTProductCpscDetail.mfdDate</code> attribute **/
	public static final String MFDDATE = "mfdDate";
	/** Qualifier of the <code>JnjGTProductCpscDetail.modifiedDate</code> attribute **/
	public static final String MODIFIEDDATE = "modifiedDate";
	/** Qualifier of the <code>JnjGTProductCpscDetail.modifiedBy</code> attribute **/
	public static final String MODIFIEDBY = "modifiedBy";
	/** Qualifier of the <code>JnjGTProductCpscDetail.deleted</code> attribute **/
	public static final String DELETED = "deleted";
	/** Qualifier of the <code>JnjGTProductCpscDetail.cpscContactDetails</code> attribute **/
	public static final String CPSCCONTACTDETAILS = "cpscContactDetails";
	/** Qualifier of the <code>JnjGTProductCpscDetail.cpscTestDetails</code> attribute **/
	public static final String CPSCTESTDETAILS = "cpscTestDetails";
	/** Qualifier of the <code>JnjGTProductCpscDetail.outercase</code> attribute **/
	public static final String OUTERCASE = "outercase";
	/** Qualifier of the <code>JnjGTProductCpscDetail.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTProductCpscDetail> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTProductCpscDetail>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTCPSCDETAIL,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(UPCCODE, AttributeMode.INITIAL);
		tmp.put(LOTNUMBER, AttributeMode.INITIAL);
		tmp.put(CPSCRULEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MFGCOMPANYCODE, AttributeMode.INITIAL);
		tmp.put(CPSICOMMENTS, AttributeMode.INITIAL);
		tmp.put(CERTIFICATECREATEDATE, AttributeMode.INITIAL);
		tmp.put(CERTIFICATECREATER, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEMODIFIEDDATE, AttributeMode.INITIAL);
		tmp.put(ADDRESSLOTNUMBER, AttributeMode.INITIAL);
		tmp.put(MFDDATE, AttributeMode.INITIAL);
		tmp.put(MODIFIEDDATE, AttributeMode.INITIAL);
		tmp.put(MODIFIEDBY, AttributeMode.INITIAL);
		tmp.put(DELETED, AttributeMode.INITIAL);
		tmp.put(CPSCCONTACTDETAILS, AttributeMode.INITIAL);
		tmp.put(CPSCTESTDETAILS, AttributeMode.INITIAL);
		tmp.put(OUTERCASE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.addressLotNumber</code> attribute.
	 * @return the addressLotNumber
	 */
	public String getAddressLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.addressLotNumber</code> attribute.
	 * @return the addressLotNumber
	 */
	public String getAddressLotNumber()
	{
		return getAddressLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.addressLotNumber</code> attribute. 
	 * @param value the addressLotNumber
	 */
	public void setAddressLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.addressLotNumber</code> attribute. 
	 * @param value the addressLotNumber
	 */
	public void setAddressLotNumber(final String value)
	{
		setAddressLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateCreateDate</code> attribute.
	 * @return the certificateCreateDate
	 */
	public Date getCertificateCreateDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATECREATEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateCreateDate</code> attribute.
	 * @return the certificateCreateDate
	 */
	public Date getCertificateCreateDate()
	{
		return getCertificateCreateDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateCreateDate</code> attribute. 
	 * @param value the certificateCreateDate
	 */
	public void setCertificateCreateDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATECREATEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateCreateDate</code> attribute. 
	 * @param value the certificateCreateDate
	 */
	public void setCertificateCreateDate(final Date value)
	{
		setCertificateCreateDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateCreater</code> attribute.
	 * @return the certificateCreater
	 */
	public String getCertificateCreater(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CERTIFICATECREATER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateCreater</code> attribute.
	 * @return the certificateCreater
	 */
	public String getCertificateCreater()
	{
		return getCertificateCreater( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateCreater</code> attribute. 
	 * @param value the certificateCreater
	 */
	public void setCertificateCreater(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CERTIFICATECREATER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateCreater</code> attribute. 
	 * @param value the certificateCreater
	 */
	public void setCertificateCreater(final String value)
	{
		setCertificateCreater( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateModifiedDate</code> attribute.
	 * @return the certificateModifiedDate
	 */
	public Date getCertificateModifiedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATEMODIFIEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.certificateModifiedDate</code> attribute.
	 * @return the certificateModifiedDate
	 */
	public Date getCertificateModifiedDate()
	{
		return getCertificateModifiedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateModifiedDate</code> attribute. 
	 * @param value the certificateModifiedDate
	 */
	public void setCertificateModifiedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATEMODIFIEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.certificateModifiedDate</code> attribute. 
	 * @param value the certificateModifiedDate
	 */
	public void setCertificateModifiedDate(final Date value)
	{
		setCertificateModifiedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscContactDetails</code> attribute.
	 * @return the cpscContactDetails
	 */
	public Set<JnjGTCpscContact> getCpscContactDetails(final SessionContext ctx)
	{
		Set<JnjGTCpscContact> coll = (Set<JnjGTCpscContact>)getProperty( ctx, CPSCCONTACTDETAILS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscContactDetails</code> attribute.
	 * @return the cpscContactDetails
	 */
	public Set<JnjGTCpscContact> getCpscContactDetails()
	{
		return getCpscContactDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscContactDetails</code> attribute. 
	 * @param value the cpscContactDetails
	 */
	public void setCpscContactDetails(final SessionContext ctx, final Set<JnjGTCpscContact> value)
	{
		setProperty(ctx, CPSCCONTACTDETAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscContactDetails</code> attribute. 
	 * @param value the cpscContactDetails
	 */
	public void setCpscContactDetails(final Set<JnjGTCpscContact> value)
	{
		setCpscContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscRuleDescription</code> attribute.
	 * @return the cpscRuleDescription
	 */
	public String getCpscRuleDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CPSCRULEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscRuleDescription</code> attribute.
	 * @return the cpscRuleDescription
	 */
	public String getCpscRuleDescription()
	{
		return getCpscRuleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscRuleDescription</code> attribute. 
	 * @param value the cpscRuleDescription
	 */
	public void setCpscRuleDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CPSCRULEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscRuleDescription</code> attribute. 
	 * @param value the cpscRuleDescription
	 */
	public void setCpscRuleDescription(final String value)
	{
		setCpscRuleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscTestDetails</code> attribute.
	 * @return the cpscTestDetails
	 */
	public Set<JnjGTCpscTestDetail> getCpscTestDetails(final SessionContext ctx)
	{
		Set<JnjGTCpscTestDetail> coll = (Set<JnjGTCpscTestDetail>)getProperty( ctx, CPSCTESTDETAILS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpscTestDetails</code> attribute.
	 * @return the cpscTestDetails
	 */
	public Set<JnjGTCpscTestDetail> getCpscTestDetails()
	{
		return getCpscTestDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscTestDetails</code> attribute. 
	 * @param value the cpscTestDetails
	 */
	public void setCpscTestDetails(final SessionContext ctx, final Set<JnjGTCpscTestDetail> value)
	{
		setProperty(ctx, CPSCTESTDETAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpscTestDetails</code> attribute. 
	 * @param value the cpscTestDetails
	 */
	public void setCpscTestDetails(final Set<JnjGTCpscTestDetail> value)
	{
		setCpscTestDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpsiComments</code> attribute.
	 * @return the cpsiComments
	 */
	public String getCpsiComments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CPSICOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.cpsiComments</code> attribute.
	 * @return the cpsiComments
	 */
	public String getCpsiComments()
	{
		return getCpsiComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpsiComments</code> attribute. 
	 * @param value the cpsiComments
	 */
	public void setCpsiComments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CPSICOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.cpsiComments</code> attribute. 
	 * @param value the cpsiComments
	 */
	public void setCpsiComments(final String value)
	{
		setCpsiComments( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.deleted</code> attribute.
	 * @return the deleted
	 */
	public Boolean isDeleted(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELETED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.deleted</code> attribute.
	 * @return the deleted
	 */
	public Boolean isDeleted()
	{
		return isDeleted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @return the deleted
	 */
	public boolean isDeletedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeleted( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @return the deleted
	 */
	public boolean isDeletedAsPrimitive()
	{
		return isDeletedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @param value the deleted
	 */
	public void setDeleted(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELETED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @param value the deleted
	 */
	public void setDeleted(final Boolean value)
	{
		setDeleted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @param value the deleted
	 */
	public void setDeleted(final SessionContext ctx, final boolean value)
	{
		setDeleted( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.deleted</code> attribute. 
	 * @param value the deleted
	 */
	public void setDeleted(final boolean value)
	{
		setDeleted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return getLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final String value)
	{
		setLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.mfdDate</code> attribute.
	 * @return the mfdDate
	 */
	public String getMfdDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.mfdDate</code> attribute.
	 * @return the mfdDate
	 */
	public String getMfdDate()
	{
		return getMfdDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.mfdDate</code> attribute. 
	 * @param value the mfdDate
	 */
	public void setMfdDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.mfdDate</code> attribute. 
	 * @param value the mfdDate
	 */
	public void setMfdDate(final String value)
	{
		setMfdDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.mfgCompanyCode</code> attribute.
	 * @return the mfgCompanyCode
	 */
	public String getMfgCompanyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFGCOMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.mfgCompanyCode</code> attribute.
	 * @return the mfgCompanyCode
	 */
	public String getMfgCompanyCode()
	{
		return getMfgCompanyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.mfgCompanyCode</code> attribute. 
	 * @param value the mfgCompanyCode
	 */
	public void setMfgCompanyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFGCOMPANYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.mfgCompanyCode</code> attribute. 
	 * @param value the mfgCompanyCode
	 */
	public void setMfgCompanyCode(final String value)
	{
		setMfgCompanyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy()
	{
		return getModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final String value)
	{
		setModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MODIFIEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate()
	{
		return getModifiedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MODIFIEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final Date value)
	{
		setModifiedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.outercase</code> attribute.
	 * @return the outercase - This holds the outercase value.
	 */
	public String getOutercase(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OUTERCASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.outercase</code> attribute.
	 * @return the outercase - This holds the outercase value.
	 */
	public String getOutercase()
	{
		return getOutercase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.outercase</code> attribute. 
	 * @param value the outercase - This holds the outercase value.
	 */
	public void setOutercase(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OUTERCASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.outercase</code> attribute. 
	 * @param value the outercase - This holds the outercase value.
	 */
	public void setOutercase(final String value)
	{
		setOutercase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.product</code> attribute.
	 * @return the product
	 */
	public JnJProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final JnJProduct value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final JnJProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductCpscDetail.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode()
	{
		return getUpcCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductCpscDetail.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final String value)
	{
		setUpcCode( getSession().getSessionContext(), value );
	}
	
}
