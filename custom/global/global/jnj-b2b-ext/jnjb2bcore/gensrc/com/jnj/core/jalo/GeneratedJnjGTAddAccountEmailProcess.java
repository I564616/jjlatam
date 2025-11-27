/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess JnjGTAddAccountEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTAddAccountEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.sector</code> attribute **/
	public static final String SECTOR = "sector";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.accountName</code> attribute **/
	public static final String ACCOUNTNAME = "accountName";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.gln</code> attribute **/
	public static final String GLN = "gln";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.typeOfBuisness</code> attribute **/
	public static final String TYPEOFBUISNESS = "typeOfBuisness";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.subsidiary</code> attribute **/
	public static final String SUBSIDIARY = "subsidiary";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute **/
	public static final String SALESANDUSETAXFLAG = "salesAndUseTaxFlag";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.initialOpeningOrderAmount</code> attribute **/
	public static final String INITIALOPENINGORDERAMOUNT = "initialOpeningOrderAmount";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.estimatedAmountPerYear</code> attribute **/
	public static final String ESTIMATEDAMOUNTPERYEAR = "estimatedAmountPerYear";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToCountry</code> attribute **/
	public static final String SHIPTOCOUNTRY = "shipToCountry";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToLine1</code> attribute **/
	public static final String SHIPTOLINE1 = "shipToLine1";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToLine2</code> attribute **/
	public static final String SHIPTOLINE2 = "shipToLine2";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToRegion</code> attribute **/
	public static final String SHIPTOREGION = "shipToRegion";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToTown</code> attribute **/
	public static final String SHIPTOTOWN = "shipToTown";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.shipToPostalCode</code> attribute **/
	public static final String SHIPTOPOSTALCODE = "shipToPostalCode";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToCountry</code> attribute **/
	public static final String BILLTOCOUNTRY = "billToCountry";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToLine1</code> attribute **/
	public static final String BILLTOLINE1 = "billToLine1";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToLine2</code> attribute **/
	public static final String BILLTOLINE2 = "billToLine2";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToRegion</code> attribute **/
	public static final String BILLTOREGION = "billToRegion";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToTown</code> attribute **/
	public static final String BILLTOTOWN = "billToTown";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.billToPostalCode</code> attribute **/
	public static final String BILLTOPOSTALCODE = "billToPostalCode";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>JnjGTAddAccountEmailProcess.productsPurchased</code> attribute **/
	public static final String PRODUCTSPURCHASED = "productsPurchased";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SECTOR, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(ACCOUNTNAME, AttributeMode.INITIAL);
		tmp.put(GLN, AttributeMode.INITIAL);
		tmp.put(TYPEOFBUISNESS, AttributeMode.INITIAL);
		tmp.put(SUBSIDIARY, AttributeMode.INITIAL);
		tmp.put(SALESANDUSETAXFLAG, AttributeMode.INITIAL);
		tmp.put(INITIALOPENINGORDERAMOUNT, AttributeMode.INITIAL);
		tmp.put(ESTIMATEDAMOUNTPERYEAR, AttributeMode.INITIAL);
		tmp.put(SHIPTOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(SHIPTOLINE1, AttributeMode.INITIAL);
		tmp.put(SHIPTOLINE2, AttributeMode.INITIAL);
		tmp.put(SHIPTOREGION, AttributeMode.INITIAL);
		tmp.put(SHIPTOTOWN, AttributeMode.INITIAL);
		tmp.put(SHIPTOPOSTALCODE, AttributeMode.INITIAL);
		tmp.put(BILLTOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(BILLTOLINE1, AttributeMode.INITIAL);
		tmp.put(BILLTOLINE2, AttributeMode.INITIAL);
		tmp.put(BILLTOREGION, AttributeMode.INITIAL);
		tmp.put(BILLTOTOWN, AttributeMode.INITIAL);
		tmp.put(BILLTOPOSTALCODE, AttributeMode.INITIAL);
		tmp.put(SUBJECT, AttributeMode.INITIAL);
		tmp.put(PRODUCTSPURCHASED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.accountName</code> attribute.
	 * @return the accountName
	 */
	public String getAccountName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.accountName</code> attribute.
	 * @return the accountName
	 */
	public String getAccountName()
	{
		return getAccountName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.accountName</code> attribute. 
	 * @param value the accountName
	 */
	public void setAccountName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.accountName</code> attribute. 
	 * @param value the accountName
	 */
	public void setAccountName(final String value)
	{
		setAccountName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToCountry</code> attribute.
	 * @return the billToCountry
	 */
	public String getBillToCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToCountry</code> attribute.
	 * @return the billToCountry
	 */
	public String getBillToCountry()
	{
		return getBillToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToCountry</code> attribute. 
	 * @param value the billToCountry
	 */
	public void setBillToCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToCountry</code> attribute. 
	 * @param value the billToCountry
	 */
	public void setBillToCountry(final String value)
	{
		setBillToCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToLine1</code> attribute.
	 * @return the billToLine1
	 */
	public String getBillToLine1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOLINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToLine1</code> attribute.
	 * @return the billToLine1
	 */
	public String getBillToLine1()
	{
		return getBillToLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToLine1</code> attribute. 
	 * @param value the billToLine1
	 */
	public void setBillToLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOLINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToLine1</code> attribute. 
	 * @param value the billToLine1
	 */
	public void setBillToLine1(final String value)
	{
		setBillToLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToLine2</code> attribute.
	 * @return the billToLine2
	 */
	public String getBillToLine2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOLINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToLine2</code> attribute.
	 * @return the billToLine2
	 */
	public String getBillToLine2()
	{
		return getBillToLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToLine2</code> attribute. 
	 * @param value the billToLine2
	 */
	public void setBillToLine2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOLINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToLine2</code> attribute. 
	 * @param value the billToLine2
	 */
	public void setBillToLine2(final String value)
	{
		setBillToLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToPostalCode</code> attribute.
	 * @return the billToPostalCode
	 */
	public String getBillToPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOPOSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToPostalCode</code> attribute.
	 * @return the billToPostalCode
	 */
	public String getBillToPostalCode()
	{
		return getBillToPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToPostalCode</code> attribute. 
	 * @param value the billToPostalCode
	 */
	public void setBillToPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOPOSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToPostalCode</code> attribute. 
	 * @param value the billToPostalCode
	 */
	public void setBillToPostalCode(final String value)
	{
		setBillToPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToRegion</code> attribute.
	 * @return the billToRegion
	 */
	public String getBillToRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOREGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToRegion</code> attribute.
	 * @return the billToRegion
	 */
	public String getBillToRegion()
	{
		return getBillToRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToRegion</code> attribute. 
	 * @param value the billToRegion
	 */
	public void setBillToRegion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOREGION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToRegion</code> attribute. 
	 * @param value the billToRegion
	 */
	public void setBillToRegion(final String value)
	{
		setBillToRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToTown</code> attribute.
	 * @return the billToTown
	 */
	public String getBillToTown(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOTOWN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.billToTown</code> attribute.
	 * @return the billToTown
	 */
	public String getBillToTown()
	{
		return getBillToTown( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToTown</code> attribute. 
	 * @param value the billToTown
	 */
	public void setBillToTown(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOTOWN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.billToTown</code> attribute. 
	 * @param value the billToTown
	 */
	public void setBillToTown(final String value)
	{
		setBillToTown( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.estimatedAmountPerYear</code> attribute.
	 * @return the estimatedAmountPerYear
	 */
	public String getEstimatedAmountPerYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ESTIMATEDAMOUNTPERYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.estimatedAmountPerYear</code> attribute.
	 * @return the estimatedAmountPerYear
	 */
	public String getEstimatedAmountPerYear()
	{
		return getEstimatedAmountPerYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.estimatedAmountPerYear</code> attribute. 
	 * @param value the estimatedAmountPerYear
	 */
	public void setEstimatedAmountPerYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ESTIMATEDAMOUNTPERYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.estimatedAmountPerYear</code> attribute. 
	 * @param value the estimatedAmountPerYear
	 */
	public void setEstimatedAmountPerYear(final String value)
	{
		setEstimatedAmountPerYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.gln</code> attribute.
	 * @return the gln
	 */
	public String getGln(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.gln</code> attribute.
	 * @return the gln
	 */
	public String getGln()
	{
		return getGln( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.gln</code> attribute. 
	 * @param value the gln
	 */
	public void setGln(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.gln</code> attribute. 
	 * @param value the gln
	 */
	public void setGln(final String value)
	{
		setGln( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.initialOpeningOrderAmount</code> attribute.
	 * @return the initialOpeningOrderAmount
	 */
	public String getInitialOpeningOrderAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INITIALOPENINGORDERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.initialOpeningOrderAmount</code> attribute.
	 * @return the initialOpeningOrderAmount
	 */
	public String getInitialOpeningOrderAmount()
	{
		return getInitialOpeningOrderAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.initialOpeningOrderAmount</code> attribute. 
	 * @param value the initialOpeningOrderAmount
	 */
	public void setInitialOpeningOrderAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INITIALOPENINGORDERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.initialOpeningOrderAmount</code> attribute. 
	 * @param value the initialOpeningOrderAmount
	 */
	public void setInitialOpeningOrderAmount(final String value)
	{
		setInitialOpeningOrderAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.productsPurchased</code> attribute.
	 * @return the productsPurchased
	 */
	public String getProductsPurchased(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSPURCHASED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.productsPurchased</code> attribute.
	 * @return the productsPurchased
	 */
	public String getProductsPurchased()
	{
		return getProductsPurchased( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.productsPurchased</code> attribute. 
	 * @param value the productsPurchased
	 */
	public void setProductsPurchased(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSPURCHASED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.productsPurchased</code> attribute. 
	 * @param value the productsPurchased
	 */
	public void setProductsPurchased(final String value)
	{
		setProductsPurchased( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute.
	 * @return the salesAndUseTaxFlag
	 */
	public Boolean isSalesAndUseTaxFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALESANDUSETAXFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute.
	 * @return the salesAndUseTaxFlag
	 */
	public Boolean isSalesAndUseTaxFlag()
	{
		return isSalesAndUseTaxFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @return the salesAndUseTaxFlag
	 */
	public boolean isSalesAndUseTaxFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSalesAndUseTaxFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @return the salesAndUseTaxFlag
	 */
	public boolean isSalesAndUseTaxFlagAsPrimitive()
	{
		return isSalesAndUseTaxFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALESANDUSETAXFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final Boolean value)
	{
		setSalesAndUseTaxFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final SessionContext ctx, final boolean value)
	{
		setSalesAndUseTaxFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.salesAndUseTaxFlag</code> attribute. 
	 * @param value the salesAndUseTaxFlag
	 */
	public void setSalesAndUseTaxFlag(final boolean value)
	{
		setSalesAndUseTaxFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.sector</code> attribute.
	 * @return the sector
	 */
	public String getSector()
	{
		return getSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.sector</code> attribute. 
	 * @param value the sector
	 */
	public void setSector(final String value)
	{
		setSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToCountry</code> attribute.
	 * @return the shipToCountry
	 */
	public String getShipToCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToCountry</code> attribute.
	 * @return the shipToCountry
	 */
	public String getShipToCountry()
	{
		return getShipToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToCountry</code> attribute. 
	 * @param value the shipToCountry
	 */
	public void setShipToCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToCountry</code> attribute. 
	 * @param value the shipToCountry
	 */
	public void setShipToCountry(final String value)
	{
		setShipToCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToLine1</code> attribute.
	 * @return the shipToLine1
	 */
	public String getShipToLine1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOLINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToLine1</code> attribute.
	 * @return the shipToLine1
	 */
	public String getShipToLine1()
	{
		return getShipToLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToLine1</code> attribute. 
	 * @param value the shipToLine1
	 */
	public void setShipToLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOLINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToLine1</code> attribute. 
	 * @param value the shipToLine1
	 */
	public void setShipToLine1(final String value)
	{
		setShipToLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToLine2</code> attribute.
	 * @return the shipToLine2
	 */
	public String getShipToLine2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOLINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToLine2</code> attribute.
	 * @return the shipToLine2
	 */
	public String getShipToLine2()
	{
		return getShipToLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToLine2</code> attribute. 
	 * @param value the shipToLine2
	 */
	public void setShipToLine2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOLINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToLine2</code> attribute. 
	 * @param value the shipToLine2
	 */
	public void setShipToLine2(final String value)
	{
		setShipToLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToPostalCode</code> attribute.
	 * @return the shipToPostalCode
	 */
	public String getShipToPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOPOSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToPostalCode</code> attribute.
	 * @return the shipToPostalCode
	 */
	public String getShipToPostalCode()
	{
		return getShipToPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToPostalCode</code> attribute. 
	 * @param value the shipToPostalCode
	 */
	public void setShipToPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOPOSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToPostalCode</code> attribute. 
	 * @param value the shipToPostalCode
	 */
	public void setShipToPostalCode(final String value)
	{
		setShipToPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToRegion</code> attribute.
	 * @return the shipToRegion
	 */
	public String getShipToRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOREGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToRegion</code> attribute.
	 * @return the shipToRegion
	 */
	public String getShipToRegion()
	{
		return getShipToRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToRegion</code> attribute. 
	 * @param value the shipToRegion
	 */
	public void setShipToRegion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOREGION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToRegion</code> attribute. 
	 * @param value the shipToRegion
	 */
	public void setShipToRegion(final String value)
	{
		setShipToRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToTown</code> attribute.
	 * @return the shipToTown
	 */
	public String getShipToTown(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOTOWN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.shipToTown</code> attribute.
	 * @return the shipToTown
	 */
	public String getShipToTown()
	{
		return getShipToTown( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToTown</code> attribute. 
	 * @param value the shipToTown
	 */
	public void setShipToTown(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOTOWN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.shipToTown</code> attribute. 
	 * @param value the shipToTown
	 */
	public void setShipToTown(final String value)
	{
		setShipToTown( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.subsidiary</code> attribute.
	 * @return the subsidiary
	 */
	public String getSubsidiary(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSIDIARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.subsidiary</code> attribute.
	 * @return the subsidiary
	 */
	public String getSubsidiary()
	{
		return getSubsidiary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.subsidiary</code> attribute. 
	 * @param value the subsidiary
	 */
	public void setSubsidiary(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSIDIARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.subsidiary</code> attribute. 
	 * @param value the subsidiary
	 */
	public void setSubsidiary(final String value)
	{
		setSubsidiary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.typeOfBuisness</code> attribute.
	 * @return the typeOfBuisness
	 */
	public String getTypeOfBuisness(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPEOFBUISNESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTAddAccountEmailProcess.typeOfBuisness</code> attribute.
	 * @return the typeOfBuisness
	 */
	public String getTypeOfBuisness()
	{
		return getTypeOfBuisness( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.typeOfBuisness</code> attribute. 
	 * @param value the typeOfBuisness
	 */
	public void setTypeOfBuisness(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPEOFBUISNESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTAddAccountEmailProcess.typeOfBuisness</code> attribute. 
	 * @param value the typeOfBuisness
	 */
	public void setTypeOfBuisness(final String value)
	{
		setTypeOfBuisness( getSession().getSessionContext(), value );
	}
	
}
