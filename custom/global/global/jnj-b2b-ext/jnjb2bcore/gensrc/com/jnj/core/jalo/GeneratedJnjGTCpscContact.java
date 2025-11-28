/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTCpscContact}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTCpscContact extends GenericItem
{
	/** Qualifier of the <code>JnjGTCpscContact.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>JnjGTCpscContact.addressType</code> attribute **/
	public static final String ADDRESSTYPE = "addressType";
	/** Qualifier of the <code>JnjGTCpscContact.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>JnjGTCpscContact.addressline1</code> attribute **/
	public static final String ADDRESSLINE1 = "addressline1";
	/** Qualifier of the <code>JnjGTCpscContact.addressline2</code> attribute **/
	public static final String ADDRESSLINE2 = "addressline2";
	/** Qualifier of the <code>JnjGTCpscContact.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>JnjGTCpscContact.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>JnjGTCpscContact.zipCode</code> attribute **/
	public static final String ZIPCODE = "zipCode";
	/** Qualifier of the <code>JnjGTCpscContact.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjGTCpscContact.phoneNumber</code> attribute **/
	public static final String PHONENUMBER = "phoneNumber";
	/** Qualifier of the <code>JnjGTCpscContact.emailId</code> attribute **/
	public static final String EMAILID = "emailId";
	/** Qualifier of the <code>JnjGTCpscContact.addressAdditionalInfo</code> attribute **/
	public static final String ADDRESSADDITIONALINFO = "addressAdditionalInfo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(ADDRESSTYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE1, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE2, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(ZIPCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PHONENUMBER, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(ADDRESSADDITIONALINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressAdditionalInfo</code> attribute.
	 * @return the addressAdditionalInfo
	 */
	public String getAddressAdditionalInfo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSADDITIONALINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressAdditionalInfo</code> attribute.
	 * @return the addressAdditionalInfo
	 */
	public String getAddressAdditionalInfo()
	{
		return getAddressAdditionalInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressAdditionalInfo</code> attribute. 
	 * @param value the addressAdditionalInfo
	 */
	public void setAddressAdditionalInfo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSADDITIONALINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressAdditionalInfo</code> attribute. 
	 * @param value the addressAdditionalInfo
	 */
	public void setAddressAdditionalInfo(final String value)
	{
		setAddressAdditionalInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressline1</code> attribute.
	 * @return the addressline1
	 */
	public String getAddressline1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressline1</code> attribute.
	 * @return the addressline1
	 */
	public String getAddressline1()
	{
		return getAddressline1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressline1</code> attribute. 
	 * @param value the addressline1
	 */
	public void setAddressline1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressline1</code> attribute. 
	 * @param value the addressline1
	 */
	public void setAddressline1(final String value)
	{
		setAddressline1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressline2</code> attribute.
	 * @return the addressline2
	 */
	public String getAddressline2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressline2</code> attribute.
	 * @return the addressline2
	 */
	public String getAddressline2()
	{
		return getAddressline2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressline2</code> attribute. 
	 * @param value the addressline2
	 */
	public void setAddressline2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressline2</code> attribute. 
	 * @param value the addressline2
	 */
	public void setAddressline2(final String value)
	{
		setAddressline2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressType</code> attribute.
	 * @return the addressType
	 */
	public String getAddressType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.addressType</code> attribute.
	 * @return the addressType
	 */
	public String getAddressType()
	{
		return getAddressType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final String value)
	{
		setAddressType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId()
	{
		return getEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final String value)
	{
		setEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return getPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ZIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCpscContact.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode()
	{
		return getZipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCpscContact.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final String value)
	{
		setZipCode( getSession().getSessionContext(), value );
	}
	
}
