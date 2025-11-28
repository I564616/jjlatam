/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.jalo.JnjIntB2BUnit JnjGTIntB2BUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjIntB2BUnit extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntB2BUnit.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>JnjGTIntB2BUnit.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntB2BUnit.custName1</code> attribute **/
	public static final String CUSTNAME1 = "custName1";
	/** Qualifier of the <code>JnjGTIntB2BUnit.custName2</code> attribute **/
	public static final String CUSTNAME2 = "custName2";
	/** Qualifier of the <code>JnjGTIntB2BUnit.shortCustName1</code> attribute **/
	public static final String SHORTCUSTNAME1 = "shortCustName1";
	/** Qualifier of the <code>JnjGTIntB2BUnit.shortCustName2</code> attribute **/
	public static final String SHORTCUSTNAME2 = "shortCustName2";
	/** Qualifier of the <code>JnjGTIntB2BUnit.custStatusCde</code> attribute **/
	public static final String CUSTSTATUSCDE = "custStatusCde";
	/** Qualifier of the <code>JnjGTIntB2BUnit.tradeCode</code> attribute **/
	public static final String TRADECODE = "tradeCode";
	/** Qualifier of the <code>JnjGTIntB2BUnit.tradeName</code> attribute **/
	public static final String TRADENAME = "tradeName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.salesRepLocNo</code> attribute **/
	public static final String SALESREPLOCNO = "salesRepLocNo";
	/** Qualifier of the <code>JnjGTIntB2BUnit.addressLine1</code> attribute **/
	public static final String ADDRESSLINE1 = "addressLine1";
	/** Qualifier of the <code>JnjGTIntB2BUnit.addressLine2</code> attribute **/
	public static final String ADDRESSLINE2 = "addressLine2";
	/** Qualifier of the <code>JnjGTIntB2BUnit.addressLine3</code> attribute **/
	public static final String ADDRESSLINE3 = "addressLine3";
	/** Qualifier of the <code>JnjGTIntB2BUnit.addressLine4</code> attribute **/
	public static final String ADDRESSLINE4 = "addressLine4";
	/** Qualifier of the <code>JnjGTIntB2BUnit.poBoxNumber</code> attribute **/
	public static final String POBOXNUMBER = "poBoxNumber";
	/** Qualifier of the <code>JnjGTIntB2BUnit.town</code> attribute **/
	public static final String TOWN = "town";
	/** Qualifier of the <code>JnjGTIntB2BUnit.countyName</code> attribute **/
	public static final String COUNTYNAME = "countyName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.region</code> attribute **/
	public static final String REGION = "region";
	/** Qualifier of the <code>JnjGTIntB2BUnit.stateName</code> attribute **/
	public static final String STATENAME = "stateName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.postalCode</code> attribute **/
	public static final String POSTALCODE = "postalCode";
	/** Qualifier of the <code>JnjGTIntB2BUnit.postalExtCode</code> attribute **/
	public static final String POSTALEXTCODE = "postalExtCode";
	/** Qualifier of the <code>JnjGTIntB2BUnit.poBoxPostalCode</code> attribute **/
	public static final String POBOXPOSTALCODE = "poBoxPostalCode";
	/** Qualifier of the <code>JnjGTIntB2BUnit.isoCode</code> attribute **/
	public static final String ISOCODE = "isoCode";
	/** Qualifier of the <code>JnjGTIntB2BUnit.countryName</code> attribute **/
	public static final String COUNTRYNAME = "countryName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>JnjGTIntB2BUnit.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.middleName</code> attribute **/
	public static final String MIDDLENAME = "middleName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute **/
	public static final String PAYFROMADDRESS = "payFromAddress";
	/** Qualifier of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute **/
	public static final String SHIPTOADDRESS = "shipToAddress";
	/** Qualifier of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute **/
	public static final String BILLTOADDRESS = "billToAddress";
	/** Qualifier of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute **/
	public static final String SOLDTOADDRESS = "soldToAddress";
	/** Qualifier of the <code>JnjGTIntB2BUnit.globalLocNo</code> attribute **/
	public static final String GLOBALLOCNO = "globalLocNo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(CUSTNAME1, AttributeMode.INITIAL);
		tmp.put(CUSTNAME2, AttributeMode.INITIAL);
		tmp.put(SHORTCUSTNAME1, AttributeMode.INITIAL);
		tmp.put(SHORTCUSTNAME2, AttributeMode.INITIAL);
		tmp.put(CUSTSTATUSCDE, AttributeMode.INITIAL);
		tmp.put(TRADECODE, AttributeMode.INITIAL);
		tmp.put(TRADENAME, AttributeMode.INITIAL);
		tmp.put(SALESREPLOCNO, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE1, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE2, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE3, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE4, AttributeMode.INITIAL);
		tmp.put(POBOXNUMBER, AttributeMode.INITIAL);
		tmp.put(TOWN, AttributeMode.INITIAL);
		tmp.put(COUNTYNAME, AttributeMode.INITIAL);
		tmp.put(REGION, AttributeMode.INITIAL);
		tmp.put(STATENAME, AttributeMode.INITIAL);
		tmp.put(POSTALCODE, AttributeMode.INITIAL);
		tmp.put(POSTALEXTCODE, AttributeMode.INITIAL);
		tmp.put(POBOXPOSTALCODE, AttributeMode.INITIAL);
		tmp.put(ISOCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYNAME, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(MIDDLENAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(PAYFROMADDRESS, AttributeMode.INITIAL);
		tmp.put(SHIPTOADDRESS, AttributeMode.INITIAL);
		tmp.put(BILLTOADDRESS, AttributeMode.INITIAL);
		tmp.put(SOLDTOADDRESS, AttributeMode.INITIAL);
		tmp.put(GLOBALLOCNO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine1</code> attribute.
	 * @return the addressLine1
	 */
	public String getAddressLine1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine1</code> attribute.
	 * @return the addressLine1
	 */
	public String getAddressLine1()
	{
		return getAddressLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine1</code> attribute. 
	 * @param value the addressLine1
	 */
	public void setAddressLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine1</code> attribute. 
	 * @param value the addressLine1
	 */
	public void setAddressLine1(final String value)
	{
		setAddressLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine2</code> attribute.
	 * @return the addressLine2
	 */
	public String getAddressLine2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine2</code> attribute.
	 * @return the addressLine2
	 */
	public String getAddressLine2()
	{
		return getAddressLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine2</code> attribute. 
	 * @param value the addressLine2
	 */
	public void setAddressLine2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine2</code> attribute. 
	 * @param value the addressLine2
	 */
	public void setAddressLine2(final String value)
	{
		setAddressLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine3</code> attribute.
	 * @return the addressLine3
	 */
	public String getAddressLine3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine3</code> attribute.
	 * @return the addressLine3
	 */
	public String getAddressLine3()
	{
		return getAddressLine3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine3</code> attribute. 
	 * @param value the addressLine3
	 */
	public void setAddressLine3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine3</code> attribute. 
	 * @param value the addressLine3
	 */
	public void setAddressLine3(final String value)
	{
		setAddressLine3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine4</code> attribute.
	 * @return the addressLine4
	 */
	public String getAddressLine4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.addressLine4</code> attribute.
	 * @return the addressLine4
	 */
	public String getAddressLine4()
	{
		return getAddressLine4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine4</code> attribute. 
	 * @param value the addressLine4
	 */
	public void setAddressLine4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.addressLine4</code> attribute. 
	 * @param value the addressLine4
	 */
	public void setAddressLine4(final String value)
	{
		setAddressLine4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute.
	 * @return the billToAddress
	 */
	public Boolean isBillToAddress(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BILLTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute.
	 * @return the billToAddress
	 */
	public Boolean isBillToAddress()
	{
		return isBillToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @return the billToAddress
	 */
	public boolean isBillToAddressAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBillToAddress( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @return the billToAddress
	 */
	public boolean isBillToAddressAsPrimitive()
	{
		return isBillToAddressAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BILLTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final Boolean value)
	{
		setBillToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final SessionContext ctx, final boolean value)
	{
		setBillToAddress( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.billToAddress</code> attribute. 
	 * @param value the billToAddress
	 */
	public void setBillToAddress(final boolean value)
	{
		setBillToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.countryName</code> attribute.
	 * @return the countryName
	 */
	public String getCountryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.countryName</code> attribute.
	 * @return the countryName
	 */
	public String getCountryName()
	{
		return getCountryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.countryName</code> attribute. 
	 * @param value the countryName
	 */
	public void setCountryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.countryName</code> attribute. 
	 * @param value the countryName
	 */
	public void setCountryName(final String value)
	{
		setCountryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.countyName</code> attribute.
	 * @return the countyName
	 */
	public String getCountyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.countyName</code> attribute.
	 * @return the countyName
	 */
	public String getCountyName()
	{
		return getCountyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.countyName</code> attribute. 
	 * @param value the countyName
	 */
	public void setCountyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.countyName</code> attribute. 
	 * @param value the countyName
	 */
	public void setCountyName(final String value)
	{
		setCountyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custName1</code> attribute.
	 * @return the custName1
	 */
	public String getCustName1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTNAME1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custName1</code> attribute.
	 * @return the custName1
	 */
	public String getCustName1()
	{
		return getCustName1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custName1</code> attribute. 
	 * @param value the custName1
	 */
	public void setCustName1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTNAME1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custName1</code> attribute. 
	 * @param value the custName1
	 */
	public void setCustName1(final String value)
	{
		setCustName1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custName2</code> attribute.
	 * @return the custName2
	 */
	public String getCustName2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTNAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custName2</code> attribute.
	 * @return the custName2
	 */
	public String getCustName2()
	{
		return getCustName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custName2</code> attribute. 
	 * @param value the custName2
	 */
	public void setCustName2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTNAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custName2</code> attribute. 
	 * @param value the custName2
	 */
	public void setCustName2(final String value)
	{
		setCustName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custStatusCde</code> attribute.
	 * @return the custStatusCde
	 */
	public String getCustStatusCde(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTSTATUSCDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.custStatusCde</code> attribute.
	 * @return the custStatusCde
	 */
	public String getCustStatusCde()
	{
		return getCustStatusCde( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custStatusCde</code> attribute. 
	 * @param value the custStatusCde
	 */
	public void setCustStatusCde(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTSTATUSCDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.custStatusCde</code> attribute. 
	 * @param value the custStatusCde
	 */
	public void setCustStatusCde(final String value)
	{
		setCustStatusCde( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GLOBALLOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.globalLocNo</code> attribute.
	 * @return the globalLocNo
	 */
	public String getGlobalLocNo()
	{
		return getGlobalLocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GLOBALLOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.globalLocNo</code> attribute. 
	 * @param value the globalLocNo
	 */
	public void setGlobalLocNo(final String value)
	{
		setGlobalLocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.isoCode</code> attribute.
	 * @return the isoCode
	 */
	public String getIsoCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.isoCode</code> attribute.
	 * @return the isoCode
	 */
	public String getIsoCode()
	{
		return getIsoCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.isoCode</code> attribute. 
	 * @param value the isoCode
	 */
	public void setIsoCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISOCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.isoCode</code> attribute. 
	 * @param value the isoCode
	 */
	public void setIsoCode(final String value)
	{
		setIsoCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return getMiddleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final String value)
	{
		setMiddleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute.
	 * @return the payFromAddress
	 */
	public Boolean isPayFromAddress(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYFROMADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute.
	 * @return the payFromAddress
	 */
	public Boolean isPayFromAddress()
	{
		return isPayFromAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @return the payFromAddress
	 */
	public boolean isPayFromAddressAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayFromAddress( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @return the payFromAddress
	 */
	public boolean isPayFromAddressAsPrimitive()
	{
		return isPayFromAddressAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYFROMADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final Boolean value)
	{
		setPayFromAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final SessionContext ctx, final boolean value)
	{
		setPayFromAddress( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.payFromAddress</code> attribute. 
	 * @param value the payFromAddress
	 */
	public void setPayFromAddress(final boolean value)
	{
		setPayFromAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.poBoxNumber</code> attribute.
	 * @return the poBoxNumber
	 */
	public String getPoBoxNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POBOXNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.poBoxNumber</code> attribute.
	 * @return the poBoxNumber
	 */
	public String getPoBoxNumber()
	{
		return getPoBoxNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.poBoxNumber</code> attribute. 
	 * @param value the poBoxNumber
	 */
	public void setPoBoxNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POBOXNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.poBoxNumber</code> attribute. 
	 * @param value the poBoxNumber
	 */
	public void setPoBoxNumber(final String value)
	{
		setPoBoxNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.poBoxPostalCode</code> attribute.
	 * @return the poBoxPostalCode
	 */
	public String getPoBoxPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POBOXPOSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.poBoxPostalCode</code> attribute.
	 * @return the poBoxPostalCode
	 */
	public String getPoBoxPostalCode()
	{
		return getPoBoxPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.poBoxPostalCode</code> attribute. 
	 * @param value the poBoxPostalCode
	 */
	public void setPoBoxPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POBOXPOSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.poBoxPostalCode</code> attribute. 
	 * @param value the poBoxPostalCode
	 */
	public void setPoBoxPostalCode(final String value)
	{
		setPoBoxPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return getPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final String value)
	{
		setPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.postalExtCode</code> attribute.
	 * @return the postalExtCode
	 */
	public String getPostalExtCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALEXTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.postalExtCode</code> attribute.
	 * @return the postalExtCode
	 */
	public String getPostalExtCode()
	{
		return getPostalExtCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.postalExtCode</code> attribute. 
	 * @param value the postalExtCode
	 */
	public void setPostalExtCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALEXTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.postalExtCode</code> attribute. 
	 * @param value the postalExtCode
	 */
	public void setPostalExtCode(final String value)
	{
		setPostalExtCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.region</code> attribute.
	 * @return the region
	 */
	public String getRegion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.region</code> attribute.
	 * @return the region
	 */
	public String getRegion()
	{
		return getRegion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.region</code> attribute. 
	 * @param value the region
	 */
	public void setRegion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.region</code> attribute. 
	 * @param value the region
	 */
	public void setRegion(final String value)
	{
		setRegion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.salesRepLocNo</code> attribute.
	 * @return the salesRepLocNo
	 */
	public String getSalesRepLocNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESREPLOCNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.salesRepLocNo</code> attribute.
	 * @return the salesRepLocNo
	 */
	public String getSalesRepLocNo()
	{
		return getSalesRepLocNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.salesRepLocNo</code> attribute. 
	 * @param value the salesRepLocNo
	 */
	public void setSalesRepLocNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESREPLOCNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.salesRepLocNo</code> attribute. 
	 * @param value the salesRepLocNo
	 */
	public void setSalesRepLocNo(final String value)
	{
		setSalesRepLocNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Boolean isShipToAddress(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHIPTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute.
	 * @return the shipToAddress
	 */
	public Boolean isShipToAddress()
	{
		return isShipToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @return the shipToAddress
	 */
	public boolean isShipToAddressAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShipToAddress( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @return the shipToAddress
	 */
	public boolean isShipToAddressAsPrimitive()
	{
		return isShipToAddressAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHIPTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final Boolean value)
	{
		setShipToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final SessionContext ctx, final boolean value)
	{
		setShipToAddress( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shipToAddress</code> attribute. 
	 * @param value the shipToAddress
	 */
	public void setShipToAddress(final boolean value)
	{
		setShipToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shortCustName1</code> attribute.
	 * @return the shortCustName1
	 */
	public String getShortCustName1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTCUSTNAME1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shortCustName1</code> attribute.
	 * @return the shortCustName1
	 */
	public String getShortCustName1()
	{
		return getShortCustName1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shortCustName1</code> attribute. 
	 * @param value the shortCustName1
	 */
	public void setShortCustName1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTCUSTNAME1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shortCustName1</code> attribute. 
	 * @param value the shortCustName1
	 */
	public void setShortCustName1(final String value)
	{
		setShortCustName1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shortCustName2</code> attribute.
	 * @return the shortCustName2
	 */
	public String getShortCustName2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTCUSTNAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.shortCustName2</code> attribute.
	 * @return the shortCustName2
	 */
	public String getShortCustName2()
	{
		return getShortCustName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shortCustName2</code> attribute. 
	 * @param value the shortCustName2
	 */
	public void setShortCustName2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTCUSTNAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.shortCustName2</code> attribute. 
	 * @param value the shortCustName2
	 */
	public void setShortCustName2(final String value)
	{
		setShortCustName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute.
	 * @return the soldToAddress
	 */
	public Boolean isSoldToAddress(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SOLDTOADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute.
	 * @return the soldToAddress
	 */
	public Boolean isSoldToAddress()
	{
		return isSoldToAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @return the soldToAddress
	 */
	public boolean isSoldToAddressAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSoldToAddress( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @return the soldToAddress
	 */
	public boolean isSoldToAddressAsPrimitive()
	{
		return isSoldToAddressAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @param value the soldToAddress
	 */
	public void setSoldToAddress(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SOLDTOADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @param value the soldToAddress
	 */
	public void setSoldToAddress(final Boolean value)
	{
		setSoldToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @param value the soldToAddress
	 */
	public void setSoldToAddress(final SessionContext ctx, final boolean value)
	{
		setSoldToAddress( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.soldToAddress</code> attribute. 
	 * @param value the soldToAddress
	 */
	public void setSoldToAddress(final boolean value)
	{
		setSoldToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.stateName</code> attribute.
	 * @return the stateName
	 */
	public String getStateName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.stateName</code> attribute.
	 * @return the stateName
	 */
	public String getStateName()
	{
		return getStateName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.stateName</code> attribute. 
	 * @param value the stateName
	 */
	public void setStateName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.stateName</code> attribute. 
	 * @param value the stateName
	 */
	public void setStateName(final String value)
	{
		setStateName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.town</code> attribute.
	 * @return the town
	 */
	public String getTown(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOWN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.town</code> attribute.
	 * @return the town
	 */
	public String getTown()
	{
		return getTown( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.town</code> attribute. 
	 * @param value the town
	 */
	public void setTown(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOWN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.town</code> attribute. 
	 * @param value the town
	 */
	public void setTown(final String value)
	{
		setTown( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.tradeCode</code> attribute.
	 * @return the tradeCode
	 */
	public String getTradeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRADECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.tradeCode</code> attribute.
	 * @return the tradeCode
	 */
	public String getTradeCode()
	{
		return getTradeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.tradeCode</code> attribute. 
	 * @param value the tradeCode
	 */
	public void setTradeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRADECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.tradeCode</code> attribute. 
	 * @param value the tradeCode
	 */
	public void setTradeCode(final String value)
	{
		setTradeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.tradeName</code> attribute.
	 * @return the tradeName
	 */
	public String getTradeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRADENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.tradeName</code> attribute.
	 * @return the tradeName
	 */
	public String getTradeName()
	{
		return getTradeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.tradeName</code> attribute. 
	 * @param value the tradeName
	 */
	public void setTradeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRADENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.tradeName</code> attribute. 
	 * @param value the tradeName
	 */
	public void setTradeName(final String value)
	{
		setTradeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2BUnit.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2BUnit.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
