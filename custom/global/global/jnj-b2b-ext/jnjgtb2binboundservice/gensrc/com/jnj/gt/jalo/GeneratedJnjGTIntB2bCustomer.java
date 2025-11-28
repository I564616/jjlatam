/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntB2bCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntB2bCustomer extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntB2bCustomer.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.registrationDate</code> attribute **/
	public static final String REGISTRATIONDATE = "registrationDate";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.wwid</code> attribute **/
	public static final String WWID = "wwid";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.billToId</code> attribute **/
	public static final String BILLTOID = "billToId";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.userType</code> attribute **/
	public static final String USERTYPE = "userType";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.phoneType1</code> attribute **/
	public static final String PHONETYPE1 = "phoneType1";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.phoneType2</code> attribute **/
	public static final String PHONETYPE2 = "phoneType2";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.phoneType3</code> attribute **/
	public static final String PHONETYPE3 = "phoneType3";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.fax</code> attribute **/
	public static final String FAX = "fax";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.mobile</code> attribute **/
	public static final String MOBILE = "mobile";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.superVisorFirstName</code> attribute **/
	public static final String SUPERVISORFIRSTNAME = "superVisorFirstName";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.superVisorLastName</code> attribute **/
	public static final String SUPERVISORLASTNAME = "superVisorLastName";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute **/
	public static final String AUTHORIZEDBUYER = "authorizedBuyer";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.suuperVisorNumber</code> attribute **/
	public static final String SUUPERVISORNUMBER = "suuperVisorNumber";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.gateWayAccessCode</code> attribute **/
	public static final String GATEWAYACCESSCODE = "gateWayAccessCode";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.address1</code> attribute **/
	public static final String ADDRESS1 = "address1";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.address2</code> attribute **/
	public static final String ADDRESS2 = "address2";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.postalCode</code> attribute **/
	public static final String POSTALCODE = "postalCode";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.companyName</code> attribute **/
	public static final String COMPANYNAME = "companyName";
	/** Qualifier of the <code>JnjGTIntB2bCustomer.status</code> attribute **/
	public static final String STATUS = "status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONDATE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(WWID, AttributeMode.INITIAL);
		tmp.put(BILLTOID, AttributeMode.INITIAL);
		tmp.put(USERTYPE, AttributeMode.INITIAL);
		tmp.put(PHONETYPE1, AttributeMode.INITIAL);
		tmp.put(PHONETYPE2, AttributeMode.INITIAL);
		tmp.put(PHONETYPE3, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(FAX, AttributeMode.INITIAL);
		tmp.put(MOBILE, AttributeMode.INITIAL);
		tmp.put(SUPERVISORFIRSTNAME, AttributeMode.INITIAL);
		tmp.put(SUPERVISORLASTNAME, AttributeMode.INITIAL);
		tmp.put(AUTHORIZEDBUYER, AttributeMode.INITIAL);
		tmp.put(SUUPERVISORNUMBER, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(GATEWAYACCESSCODE, AttributeMode.INITIAL);
		tmp.put(ADDRESS1, AttributeMode.INITIAL);
		tmp.put(ADDRESS2, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(POSTALCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(COMPANYNAME, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.address1</code> attribute.
	 * @return the address1
	 */
	public String getAddress1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.address1</code> attribute.
	 * @return the address1
	 */
	public String getAddress1()
	{
		return getAddress1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.address1</code> attribute. 
	 * @param value the address1
	 */
	public void setAddress1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.address1</code> attribute. 
	 * @param value the address1
	 */
	public void setAddress1(final String value)
	{
		setAddress1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.address2</code> attribute.
	 * @return the address2
	 */
	public String getAddress2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.address2</code> attribute.
	 * @return the address2
	 */
	public String getAddress2()
	{
		return getAddress2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.address2</code> attribute. 
	 * @param value the address2
	 */
	public void setAddress2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.address2</code> attribute. 
	 * @param value the address2
	 */
	public void setAddress2(final String value)
	{
		setAddress2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute.
	 * @return the authorizedBuyer
	 */
	public Boolean isAuthorizedBuyer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTHORIZEDBUYER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute.
	 * @return the authorizedBuyer
	 */
	public Boolean isAuthorizedBuyer()
	{
		return isAuthorizedBuyer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @return the authorizedBuyer
	 */
	public boolean isAuthorizedBuyerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAuthorizedBuyer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @return the authorizedBuyer
	 */
	public boolean isAuthorizedBuyerAsPrimitive()
	{
		return isAuthorizedBuyerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer
	 */
	public void setAuthorizedBuyer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTHORIZEDBUYER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer
	 */
	public void setAuthorizedBuyer(final Boolean value)
	{
		setAuthorizedBuyer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer
	 */
	public void setAuthorizedBuyer(final SessionContext ctx, final boolean value)
	{
		setAuthorizedBuyer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.authorizedBuyer</code> attribute. 
	 * @param value the authorizedBuyer
	 */
	public void setAuthorizedBuyer(final boolean value)
	{
		setAuthorizedBuyer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.billToId</code> attribute.
	 * @return the billToId
	 */
	public String getBillToId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.billToId</code> attribute.
	 * @return the billToId
	 */
	public String getBillToId()
	{
		return getBillToId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.billToId</code> attribute. 
	 * @param value the billToId
	 */
	public void setBillToId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.billToId</code> attribute. 
	 * @param value the billToId
	 */
	public void setBillToId(final String value)
	{
		setBillToId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.companyName</code> attribute.
	 * @return the companyName
	 */
	public String getCompanyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.companyName</code> attribute.
	 * @return the companyName
	 */
	public String getCompanyName()
	{
		return getCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.companyName</code> attribute. 
	 * @param value the companyName
	 */
	public void setCompanyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.companyName</code> attribute. 
	 * @param value the companyName
	 */
	public void setCompanyName(final String value)
	{
		setCompanyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax()
	{
		return getFax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final String value)
	{
		setFax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.gateWayAccessCode</code> attribute.
	 * @return the gateWayAccessCode
	 */
	public String getGateWayAccessCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GATEWAYACCESSCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.gateWayAccessCode</code> attribute.
	 * @return the gateWayAccessCode
	 */
	public String getGateWayAccessCode()
	{
		return getGateWayAccessCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.gateWayAccessCode</code> attribute. 
	 * @param value the gateWayAccessCode
	 */
	public void setGateWayAccessCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GATEWAYACCESSCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.gateWayAccessCode</code> attribute. 
	 * @param value the gateWayAccessCode
	 */
	public void setGateWayAccessCode(final String value)
	{
		setGateWayAccessCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.mobile</code> attribute.
	 * @return the mobile
	 */
	public String getMobile(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.mobile</code> attribute.
	 * @return the mobile
	 */
	public String getMobile()
	{
		return getMobile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.mobile</code> attribute. 
	 * @param value the mobile
	 */
	public void setMobile(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.mobile</code> attribute. 
	 * @param value the mobile
	 */
	public void setMobile(final String value)
	{
		setMobile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType1</code> attribute.
	 * @return the phoneType1
	 */
	public String getPhoneType1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONETYPE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType1</code> attribute.
	 * @return the phoneType1
	 */
	public String getPhoneType1()
	{
		return getPhoneType1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType1</code> attribute. 
	 * @param value the phoneType1
	 */
	public void setPhoneType1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONETYPE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType1</code> attribute. 
	 * @param value the phoneType1
	 */
	public void setPhoneType1(final String value)
	{
		setPhoneType1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType2</code> attribute.
	 * @return the phoneType2
	 */
	public String getPhoneType2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONETYPE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType2</code> attribute.
	 * @return the phoneType2
	 */
	public String getPhoneType2()
	{
		return getPhoneType2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType2</code> attribute. 
	 * @param value the phoneType2
	 */
	public void setPhoneType2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONETYPE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType2</code> attribute. 
	 * @param value the phoneType2
	 */
	public void setPhoneType2(final String value)
	{
		setPhoneType2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType3</code> attribute.
	 * @return the phoneType3
	 */
	public String getPhoneType3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONETYPE3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.phoneType3</code> attribute.
	 * @return the phoneType3
	 */
	public String getPhoneType3()
	{
		return getPhoneType3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType3</code> attribute. 
	 * @param value the phoneType3
	 */
	public void setPhoneType3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONETYPE3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.phoneType3</code> attribute. 
	 * @param value the phoneType3
	 */
	public void setPhoneType3(final String value)
	{
		setPhoneType3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return getPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final String value)
	{
		setPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public String getRecTimeStamp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public String getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final String value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.registrationDate</code> attribute.
	 * @return the registrationDate
	 */
	public Date getRegistrationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REGISTRATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.registrationDate</code> attribute.
	 * @return the registrationDate
	 */
	public Date getRegistrationDate()
	{
		return getRegistrationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.registrationDate</code> attribute. 
	 * @param value the registrationDate
	 */
	public void setRegistrationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REGISTRATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.registrationDate</code> attribute. 
	 * @param value the registrationDate
	 */
	public void setRegistrationDate(final Date value)
	{
		setRegistrationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.status</code> attribute.
	 * @return the status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.superVisorFirstName</code> attribute.
	 * @return the superVisorFirstName
	 */
	public String getSuperVisorFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERVISORFIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.superVisorFirstName</code> attribute.
	 * @return the superVisorFirstName
	 */
	public String getSuperVisorFirstName()
	{
		return getSuperVisorFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.superVisorFirstName</code> attribute. 
	 * @param value the superVisorFirstName
	 */
	public void setSuperVisorFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERVISORFIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.superVisorFirstName</code> attribute. 
	 * @param value the superVisorFirstName
	 */
	public void setSuperVisorFirstName(final String value)
	{
		setSuperVisorFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.superVisorLastName</code> attribute.
	 * @return the superVisorLastName
	 */
	public String getSuperVisorLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERVISORLASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.superVisorLastName</code> attribute.
	 * @return the superVisorLastName
	 */
	public String getSuperVisorLastName()
	{
		return getSuperVisorLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.superVisorLastName</code> attribute. 
	 * @param value the superVisorLastName
	 */
	public void setSuperVisorLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERVISORLASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.superVisorLastName</code> attribute. 
	 * @param value the superVisorLastName
	 */
	public void setSuperVisorLastName(final String value)
	{
		setSuperVisorLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.suuperVisorNumber</code> attribute.
	 * @return the suuperVisorNumber
	 */
	public String getSuuperVisorNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUUPERVISORNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.suuperVisorNumber</code> attribute.
	 * @return the suuperVisorNumber
	 */
	public String getSuuperVisorNumber()
	{
		return getSuuperVisorNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.suuperVisorNumber</code> attribute. 
	 * @param value the suuperVisorNumber
	 */
	public void setSuuperVisorNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUUPERVISORNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.suuperVisorNumber</code> attribute. 
	 * @param value the suuperVisorNumber
	 */
	public void setSuuperVisorNumber(final String value)
	{
		setSuuperVisorNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.userType</code> attribute.
	 * @return the userType
	 */
	public String getUserType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.userType</code> attribute.
	 * @return the userType
	 */
	public String getUserType()
	{
		return getUserType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.userType</code> attribute. 
	 * @param value the userType
	 */
	public void setUserType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.userType</code> attribute. 
	 * @param value the userType
	 */
	public void setUserType(final String value)
	{
		setUserType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntB2bCustomer.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid()
	{
		return getWwid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntB2bCustomer.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final String value)
	{
		setWwid( getSession().getSessionContext(), value );
	}
	
}
