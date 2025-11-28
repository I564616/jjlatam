/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntCpscTestDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntCpscTestDetail extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.studyNumber</code> attribute **/
	public static final String STUDYNUMBER = "studyNumber";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.testingDate</code> attribute **/
	public static final String TESTINGDATE = "testingDate";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.thirdPartyName</code> attribute **/
	public static final String THIRDPARTYNAME = "thirdPartyName";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.addressLine1</code> attribute **/
	public static final String ADDRESSLINE1 = "addressLine1";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.addressLine2</code> attribute **/
	public static final String ADDRESSLINE2 = "addressLine2";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.zipCode</code> attribute **/
	public static final String ZIPCODE = "zipCode";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.phoneNumber</code> attribute **/
	public static final String PHONENUMBER = "phoneNumber";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.studyComments</code> attribute **/
	public static final String STUDYCOMMENTS = "studyComments";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute **/
	public static final String DELETEINDICATORTEST = "deleteIndicatorTest";
	/** Qualifier of the <code>JnjGTIntCpscTestDetail.lotNumber</code> attribute **/
	public static final String LOTNUMBER = "lotNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(STUDYNUMBER, AttributeMode.INITIAL);
		tmp.put(TESTINGDATE, AttributeMode.INITIAL);
		tmp.put(THIRDPARTYNAME, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE1, AttributeMode.INITIAL);
		tmp.put(ADDRESSLINE2, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(ZIPCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PHONENUMBER, AttributeMode.INITIAL);
		tmp.put(STUDYCOMMENTS, AttributeMode.INITIAL);
		tmp.put(DELETEINDICATORTEST, AttributeMode.INITIAL);
		tmp.put(LOTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.addressLine1</code> attribute.
	 * @return the addressLine1
	 */
	public String getAddressLine1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.addressLine1</code> attribute.
	 * @return the addressLine1
	 */
	public String getAddressLine1()
	{
		return getAddressLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.addressLine1</code> attribute. 
	 * @param value the addressLine1
	 */
	public void setAddressLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.addressLine1</code> attribute. 
	 * @param value the addressLine1
	 */
	public void setAddressLine1(final String value)
	{
		setAddressLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.addressLine2</code> attribute.
	 * @return the addressLine2
	 */
	public String getAddressLine2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.addressLine2</code> attribute.
	 * @return the addressLine2
	 */
	public String getAddressLine2()
	{
		return getAddressLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.addressLine2</code> attribute. 
	 * @param value the addressLine2
	 */
	public void setAddressLine2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.addressLine2</code> attribute. 
	 * @param value the addressLine2
	 */
	public void setAddressLine2(final String value)
	{
		setAddressLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute.
	 * @return the deleteIndicatorTest
	 */
	public Boolean isDeleteIndicatorTest(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELETEINDICATORTEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute.
	 * @return the deleteIndicatorTest
	 */
	public Boolean isDeleteIndicatorTest()
	{
		return isDeleteIndicatorTest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @return the deleteIndicatorTest
	 */
	public boolean isDeleteIndicatorTestAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeleteIndicatorTest( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @return the deleteIndicatorTest
	 */
	public boolean isDeleteIndicatorTestAsPrimitive()
	{
		return isDeleteIndicatorTestAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @param value the deleteIndicatorTest
	 */
	public void setDeleteIndicatorTest(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELETEINDICATORTEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @param value the deleteIndicatorTest
	 */
	public void setDeleteIndicatorTest(final Boolean value)
	{
		setDeleteIndicatorTest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @param value the deleteIndicatorTest
	 */
	public void setDeleteIndicatorTest(final SessionContext ctx, final boolean value)
	{
		setDeleteIndicatorTest( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.deleteIndicatorTest</code> attribute. 
	 * @param value the deleteIndicatorTest
	 */
	public void setDeleteIndicatorTest(final boolean value)
	{
		setDeleteIndicatorTest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return getLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final String value)
	{
		setLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return getPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.studyComments</code> attribute.
	 * @return the studyComments
	 */
	public String getStudyComments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STUDYCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.studyComments</code> attribute.
	 * @return the studyComments
	 */
	public String getStudyComments()
	{
		return getStudyComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.studyComments</code> attribute. 
	 * @param value the studyComments
	 */
	public void setStudyComments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STUDYCOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.studyComments</code> attribute. 
	 * @param value the studyComments
	 */
	public void setStudyComments(final String value)
	{
		setStudyComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.studyNumber</code> attribute.
	 * @return the studyNumber
	 */
	public String getStudyNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STUDYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.studyNumber</code> attribute.
	 * @return the studyNumber
	 */
	public String getStudyNumber()
	{
		return getStudyNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.studyNumber</code> attribute. 
	 * @param value the studyNumber
	 */
	public void setStudyNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STUDYNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.studyNumber</code> attribute. 
	 * @param value the studyNumber
	 */
	public void setStudyNumber(final String value)
	{
		setStudyNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.testingDate</code> attribute.
	 * @return the testingDate
	 */
	public Date getTestingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TESTINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.testingDate</code> attribute.
	 * @return the testingDate
	 */
	public Date getTestingDate()
	{
		return getTestingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.testingDate</code> attribute. 
	 * @param value the testingDate
	 */
	public void setTestingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TESTINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.testingDate</code> attribute. 
	 * @param value the testingDate
	 */
	public void setTestingDate(final Date value)
	{
		setTestingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.thirdPartyName</code> attribute.
	 * @return the thirdPartyName
	 */
	public String getThirdPartyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THIRDPARTYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.thirdPartyName</code> attribute.
	 * @return the thirdPartyName
	 */
	public String getThirdPartyName()
	{
		return getThirdPartyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.thirdPartyName</code> attribute. 
	 * @param value the thirdPartyName
	 */
	public void setThirdPartyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THIRDPARTYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.thirdPartyName</code> attribute. 
	 * @param value the thirdPartyName
	 */
	public void setThirdPartyName(final String value)
	{
		setThirdPartyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ZIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscTestDetail.zipCode</code> attribute.
	 * @return the zipCode
	 */
	public String getZipCode()
	{
		return getZipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscTestDetail.zipCode</code> attribute. 
	 * @param value the zipCode
	 */
	public void setZipCode(final String value)
	{
		setZipCode( getSession().getSessionContext(), value );
	}
	
}
