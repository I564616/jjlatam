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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTSurgeon}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTSurgeon extends GenericItem
{
	/** Qualifier of the <code>JnjGTSurgeon.surgeonId</code> attribute **/
	public static final String SURGEONID = "surgeonId";
	/** Qualifier of the <code>JnjGTSurgeon.hospitalId</code> attribute **/
	public static final String HOSPITALID = "hospitalId";
	/** Qualifier of the <code>JnjGTSurgeon.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>JnjGTSurgeon.middleName</code> attribute **/
	public static final String MIDDLENAME = "middleName";
	/** Qualifier of the <code>JnjGTSurgeon.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>JnjGTSurgeon.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>JnjGTSurgeon.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>JnjGTSurgeon.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>JnjGTSurgeon.postalCode</code> attribute **/
	public static final String POSTALCODE = "postalCode";
	/** Qualifier of the <code>JnjGTSurgeon.recType</code> attribute **/
	public static final String RECTYPE = "recType";
	/** Qualifier of the <code>JnjGTSurgeon.recNumber</code> attribute **/
	public static final String RECNUMBER = "recNumber";
	/** Qualifier of the <code>JnjGTSurgeon.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	/** Qualifier of the <code>JnjGTSurgeon.caseDate</code> attribute **/
	public static final String CASEDATE = "caseDate";
	/** Qualifier of the <code>JnjGTSurgeon.interBody</code> attribute **/
	public static final String INTERBODY = "interBody";
	/** Qualifier of the <code>JnjGTSurgeon.levelsInstrumented</code> attribute **/
	public static final String LEVELSINSTRUMENTED = "levelsInstrumented";
	/** Qualifier of the <code>JnjGTSurgeon.orthoBio</code> attribute **/
	public static final String ORTHOBIO = "orthoBio";
	/** Qualifier of the <code>JnjGTSurgeon.pathology</code> attribute **/
	public static final String PATHOLOGY = "pathology";
	/** Qualifier of the <code>JnjGTSurgeon.speciality</code> attribute **/
	public static final String SPECIALITY = "speciality";
	/** Qualifier of the <code>JnjGTSurgeon.approach</code> attribute **/
	public static final String APPROACH = "approach";
	/** Qualifier of the <code>JnjGTSurgeon.emailAddress</code> attribute **/
	public static final String EMAILADDRESS = "emailAddress";
	/** Qualifier of the <code>JnjGTSurgeon.caseNumber</code> attribute **/
	public static final String CASENUMBER = "caseNumber";
	/** Qualifier of the <code>JnjGTSurgeon.zone</code> attribute **/
	public static final String ZONE = "zone";
	/** Qualifier of the <code>JnjGTSurgeon.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SURGEONID, AttributeMode.INITIAL);
		tmp.put(HOSPITALID, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(MIDDLENAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(POSTALCODE, AttributeMode.INITIAL);
		tmp.put(RECTYPE, AttributeMode.INITIAL);
		tmp.put(RECNUMBER, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		tmp.put(CASEDATE, AttributeMode.INITIAL);
		tmp.put(INTERBODY, AttributeMode.INITIAL);
		tmp.put(LEVELSINSTRUMENTED, AttributeMode.INITIAL);
		tmp.put(ORTHOBIO, AttributeMode.INITIAL);
		tmp.put(PATHOLOGY, AttributeMode.INITIAL);
		tmp.put(SPECIALITY, AttributeMode.INITIAL);
		tmp.put(APPROACH, AttributeMode.INITIAL);
		tmp.put(EMAILADDRESS, AttributeMode.INITIAL);
		tmp.put(CASENUMBER, AttributeMode.INITIAL);
		tmp.put(ZONE, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.approach</code> attribute.
	 * @return the approach
	 */
	public String getApproach(final SessionContext ctx)
	{
		return (String)getProperty( ctx, APPROACH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.approach</code> attribute.
	 * @return the approach
	 */
	public String getApproach()
	{
		return getApproach( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.approach</code> attribute. 
	 * @param value the approach
	 */
	public void setApproach(final SessionContext ctx, final String value)
	{
		setProperty(ctx, APPROACH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.approach</code> attribute. 
	 * @param value the approach
	 */
	public void setApproach(final String value)
	{
		setApproach( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public String getCaseDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public String getCaseDate()
	{
		return getCaseDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final String value)
	{
		setCaseDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.caseNumber</code> attribute.
	 * @return the caseNumber
	 */
	public String getCaseNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.caseNumber</code> attribute.
	 * @return the caseNumber
	 */
	public String getCaseNumber()
	{
		return getCaseNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.caseNumber</code> attribute. 
	 * @param value the caseNumber
	 */
	public void setCaseNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.caseNumber</code> attribute. 
	 * @param value the caseNumber
	 */
	public void setCaseNumber(final String value)
	{
		setCaseNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress()
	{
		return getEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final String value)
	{
		setEmailAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.hospitalId</code> attribute.
	 * @return the hospitalId
	 */
	public String getHospitalId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOSPITALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.hospitalId</code> attribute.
	 * @return the hospitalId
	 */
	public String getHospitalId()
	{
		return getHospitalId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.hospitalId</code> attribute. 
	 * @param value the hospitalId
	 */
	public void setHospitalId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOSPITALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.hospitalId</code> attribute. 
	 * @param value the hospitalId
	 */
	public void setHospitalId(final String value)
	{
		setHospitalId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.interBody</code> attribute.
	 * @return the interBody
	 */
	public String getInterBody(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERBODY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.interBody</code> attribute.
	 * @return the interBody
	 */
	public String getInterBody()
	{
		return getInterBody( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.interBody</code> attribute. 
	 * @param value the interBody
	 */
	public void setInterBody(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERBODY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.interBody</code> attribute. 
	 * @param value the interBody
	 */
	public void setInterBody(final String value)
	{
		setInterBody( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.levelsInstrumented</code> attribute.
	 * @return the levelsInstrumented
	 */
	public String getLevelsInstrumented(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEVELSINSTRUMENTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.levelsInstrumented</code> attribute.
	 * @return the levelsInstrumented
	 */
	public String getLevelsInstrumented()
	{
		return getLevelsInstrumented( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.levelsInstrumented</code> attribute. 
	 * @param value the levelsInstrumented
	 */
	public void setLevelsInstrumented(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEVELSINSTRUMENTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.levelsInstrumented</code> attribute. 
	 * @param value the levelsInstrumented
	 */
	public void setLevelsInstrumented(final String value)
	{
		setLevelsInstrumented( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return getMiddleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final String value)
	{
		setMiddleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.orthoBio</code> attribute.
	 * @return the orthoBio
	 */
	public String getOrthoBio(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORTHOBIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.orthoBio</code> attribute.
	 * @return the orthoBio
	 */
	public String getOrthoBio()
	{
		return getOrthoBio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.orthoBio</code> attribute. 
	 * @param value the orthoBio
	 */
	public void setOrthoBio(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORTHOBIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.orthoBio</code> attribute. 
	 * @param value the orthoBio
	 */
	public void setOrthoBio(final String value)
	{
		setOrthoBio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.pathology</code> attribute.
	 * @return the pathology
	 */
	public String getPathology(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PATHOLOGY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.pathology</code> attribute.
	 * @return the pathology
	 */
	public String getPathology()
	{
		return getPathology( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.pathology</code> attribute. 
	 * @param value the pathology
	 */
	public void setPathology(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PATHOLOGY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.pathology</code> attribute. 
	 * @param value the pathology
	 */
	public void setPathology(final String value)
	{
		setPathology( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return getPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final String value)
	{
		setPostalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.recNumber</code> attribute.
	 * @return the recNumber
	 */
	public String getRecNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.recNumber</code> attribute.
	 * @return the recNumber
	 */
	public String getRecNumber()
	{
		return getRecNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.recNumber</code> attribute. 
	 * @param value the recNumber
	 */
	public void setRecNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.recNumber</code> attribute. 
	 * @param value the recNumber
	 */
	public void setRecNumber(final String value)
	{
		setRecNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.recType</code> attribute.
	 * @return the recType
	 */
	public String getRecType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.recType</code> attribute.
	 * @return the recType
	 */
	public String getRecType()
	{
		return getRecType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.recType</code> attribute. 
	 * @param value the recType
	 */
	public void setRecType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.recType</code> attribute. 
	 * @param value the recType
	 */
	public void setRecType(final String value)
	{
		setRecType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.speciality</code> attribute.
	 * @return the speciality
	 */
	public String getSpeciality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPECIALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.speciality</code> attribute.
	 * @return the speciality
	 */
	public String getSpeciality()
	{
		return getSpeciality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.speciality</code> attribute. 
	 * @param value the speciality
	 */
	public void setSpeciality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPECIALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.speciality</code> attribute. 
	 * @param value the speciality
	 */
	public void setSpeciality(final String value)
	{
		setSpeciality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.surgeonId</code> attribute.
	 * @return the surgeonId
	 */
	public String getSurgeonId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGEONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.surgeonId</code> attribute.
	 * @return the surgeonId
	 */
	public String getSurgeonId()
	{
		return getSurgeonId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.surgeonId</code> attribute. 
	 * @param value the surgeonId
	 */
	public void setSurgeonId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGEONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.surgeonId</code> attribute. 
	 * @param value the surgeonId
	 */
	public void setSurgeonId(final String value)
	{
		setSurgeonId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.zone</code> attribute.
	 * @return the zone
	 */
	public String getZone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ZONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeon.zone</code> attribute.
	 * @return the zone
	 */
	public String getZone()
	{
		return getZone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.zone</code> attribute. 
	 * @param value the zone
	 */
	public void setZone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ZONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeon.zone</code> attribute. 
	 * @param value the zone
	 */
	public void setZone(final String value)
	{
		setZone( getSession().getSessionContext(), value );
	}
	
}
