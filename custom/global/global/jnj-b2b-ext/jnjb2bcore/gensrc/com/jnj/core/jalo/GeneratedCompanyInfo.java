/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CompanyInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCompanyInfo extends GenericItem
{
	/** Qualifier of the <code>CompanyInfo.accountName</code> attribute **/
	public static final String ACCOUNTNAME = "accountName";
	/** Qualifier of the <code>CompanyInfo.gln</code> attribute **/
	public static final String GLN = "gln";
	/** Qualifier of the <code>CompanyInfo.typeOfBusiness</code> attribute **/
	public static final String TYPEOFBUSINESS = "typeOfBusiness";
	/** Qualifier of the <code>CompanyInfo.subsidaryOf</code> attribute **/
	public static final String SUBSIDARYOF = "subsidaryOf";
	/** Qualifier of the <code>CompanyInfo.billToAddress</code> attribute **/
	public static final String BILLTOADDRESS = "billToAddress";
	/** Qualifier of the <code>CompanyInfo.shipToAddress</code> attribute **/
	public static final String SHIPTOADDRESS = "shipToAddress";
	/** Qualifier of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute **/
	public static final String SALESANDUSETAXFLAG = "salesAndUseTaxFlag";
	/** Qualifier of the <code>CompanyInfo.initialOpeningOrderAmount</code> attribute **/
	public static final String INITIALOPENINGORDERAMOUNT = "initialOpeningOrderAmount";
	/** Qualifier of the <code>CompanyInfo.estimatedAmountPerYear</code> attribute **/
	public static final String ESTIMATEDAMOUNTPERYEAR = "estimatedAmountPerYear";
	/** Qualifier of the <code>CompanyInfo.medicalProductsPurchase</code> attribute **/
	public static final String MEDICALPRODUCTSPURCHASE = "medicalProductsPurchase";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ACCOUNTNAME, AttributeMode.INITIAL);
		tmp.put(GLN, AttributeMode.INITIAL);
		tmp.put(TYPEOFBUSINESS, AttributeMode.INITIAL);
		tmp.put(SUBSIDARYOF, AttributeMode.INITIAL);
		tmp.put(BILLTOADDRESS, AttributeMode.INITIAL);
		tmp.put(SHIPTOADDRESS, AttributeMode.INITIAL);
		tmp.put(SALESANDUSETAXFLAG, AttributeMode.INITIAL);
		tmp.put(INITIALOPENINGORDERAMOUNT, AttributeMode.INITIAL);
		tmp.put(ESTIMATEDAMOUNTPERYEAR, AttributeMode.INITIAL);
		tmp.put(MEDICALPRODUCTSPURCHASE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.accountName</code> attribute.
	 * @return the accountName
	 */
	public String getAccountName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.accountName</code> attribute.
	 * @return the accountName
	 */
	public String getAccountName()
	{
		return getAccountName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.accountName</code> attribute. 
	 * @param value the accountName
	 */
	public void setAccountName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.accountName</code> attribute. 
	 * @param value the accountName
	 */
	public void setAccountName(final String value)
	{
		setAccountName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.billToAddress</code> attribute.
	 * @return the billToAddress
	 */
	public Address getBillToAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, BILLTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.billToAddress</code> attribute.
	 * @return the billToAddress
	 */
	public Address getBillToAddress()
	{
		return getBillToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, BILLTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final Address value)
	{
		setBillToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.estimatedAmountPerYear</code> attribute.
	 * @return the estimatedAmountPerYear
	 */
	public String getEstimatedAmountPerYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ESTIMATEDAMOUNTPERYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.estimatedAmountPerYear</code> attribute.
	 * @return the estimatedAmountPerYear
	 */
	public String getEstimatedAmountPerYear()
	{
		return getEstimatedAmountPerYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.estimatedAmountPerYear</code> attribute. 
	 * @param value the estimatedAmountPerYear
	 */
	public void setEstimatedAmountPerYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ESTIMATEDAMOUNTPERYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.estimatedAmountPerYear</code> attribute. 
	 * @param value the estimatedAmountPerYear
	 */
	public void setEstimatedAmountPerYear(final String value)
	{
		setEstimatedAmountPerYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.gln</code> attribute.
	 * @return the gln
	 */
	public String getGln(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.gln</code> attribute.
	 * @return the gln
	 */
	public String getGln()
	{
		return getGln( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.gln</code> attribute. 
	 * @param value the gln
	 */
	public void setGln(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.gln</code> attribute. 
	 * @param value the gln
	 */
	public void setGln(final String value)
	{
		setGln( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.initialOpeningOrderAmount</code> attribute.
	 * @return the initialOpeningOrderAmount
	 */
	public String getInitialOpeningOrderAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INITIALOPENINGORDERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.initialOpeningOrderAmount</code> attribute.
	 * @return the initialOpeningOrderAmount
	 */
	public String getInitialOpeningOrderAmount()
	{
		return getInitialOpeningOrderAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.initialOpeningOrderAmount</code> attribute. 
	 * @param value the initialOpeningOrderAmount
	 */
	public void setInitialOpeningOrderAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INITIALOPENINGORDERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.initialOpeningOrderAmount</code> attribute. 
	 * @param value the initialOpeningOrderAmount
	 */
	public void setInitialOpeningOrderAmount(final String value)
	{
		setInitialOpeningOrderAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.medicalProductsPurchase</code> attribute.
	 * @return the medicalProductsPurchase
	 */
	public List<String> getMedicalProductsPurchase(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, MEDICALPRODUCTSPURCHASE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.medicalProductsPurchase</code> attribute.
	 * @return the medicalProductsPurchase
	 */
	public List<String> getMedicalProductsPurchase()
	{
		return getMedicalProductsPurchase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.medicalProductsPurchase</code> attribute. 
	 * @param value the medicalProductsPurchase
	 */
	public void setMedicalProductsPurchase(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, MEDICALPRODUCTSPURCHASE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.medicalProductsPurchase</code> attribute. 
	 * @param value the medicalProductsPurchase
	 */
	public void setMedicalProductsPurchase(final List<String> value)
	{
		setMedicalProductsPurchase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute.
	 * @return the salesAndUseTaxFlag
	 */
	public Boolean isSalesAndUseTaxFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALESANDUSETAXFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute.
	 * @return the salesAndUseTaxFlag
	 */
	public Boolean isSalesAndUseTaxFlag()
	{
		return isSalesAndUseTaxFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @return the salesAndUseTaxFlag
	 */
	public boolean isSalesAndUseTaxFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSalesAndUseTaxFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @return the salesAndUseTaxFlag
	 */
	public boolean isSalesAndUseTaxFlagAsPrimitive()
	{
		return isSalesAndUseTaxFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALESANDUSETAXFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final Boolean value)
	{
		setSalesAndUseTaxFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final SessionContext ctx, final boolean value)
	{
		setSalesAndUseTaxFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final boolean value)
	{
		setSalesAndUseTaxFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, SHIPTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Address getShipToAddress()
	{
		return getShipToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, SHIPTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final Address value)
	{
		setShipToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.subsidaryOf</code> attribute.
	 * @return the subsidaryOf
	 */
	public String getSubsidaryOf(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSIDARYOF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.subsidaryOf</code> attribute.
	 * @return the subsidaryOf
	 */
	public String getSubsidaryOf()
	{
		return getSubsidaryOf( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.subsidaryOf</code> attribute. 
	 * @param value the subsidaryOf
	 */
	public void setSubsidaryOf(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSIDARYOF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.subsidaryOf</code> attribute. 
	 * @param value the subsidaryOf
	 */
	public void setSubsidaryOf(final String value)
	{
		setSubsidaryOf( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.typeOfBusiness</code> attribute.
	 * @return the typeOfBusiness
	 */
	public String getTypeOfBusiness(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPEOFBUSINESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInfo.typeOfBusiness</code> attribute.
	 * @return the typeOfBusiness
	 */
	public String getTypeOfBusiness()
	{
		return getTypeOfBusiness( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.typeOfBusiness</code> attribute. 
	 * @param value the typeOfBusiness
	 */
	public void setTypeOfBusiness(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPEOFBUSINESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInfo.typeOfBusiness</code> attribute. 
	 * @param value the typeOfBusiness
	 */
	public void setTypeOfBusiness(final String value)
	{
		setTypeOfBusiness( getSession().getSessionContext(), value );
	}
	
}
