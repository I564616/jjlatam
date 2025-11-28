/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrder;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTSurgeryInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTSurgeryInfo extends GenericItem
{
	/** Qualifier of the <code>JnjGTSurgeryInfo.surgerySpecialty</code> attribute **/
	public static final String SURGERYSPECIALTY = "surgerySpecialty";
	/** Qualifier of the <code>JnjGTSurgeryInfo.orthobiologics</code> attribute **/
	public static final String ORTHOBIOLOGICS = "orthobiologics";
	/** Qualifier of the <code>JnjGTSurgeryInfo.surgicalApproach</code> attribute **/
	public static final String SURGICALAPPROACH = "surgicalApproach";
	/** Qualifier of the <code>JnjGTSurgeryInfo.interbody</code> attribute **/
	public static final String INTERBODY = "interbody";
	/** Qualifier of the <code>JnjGTSurgeryInfo.interbodyFusion</code> attribute **/
	public static final String INTERBODYFUSION = "interbodyFusion";
	/** Qualifier of the <code>JnjGTSurgeryInfo.caseDate</code> attribute **/
	public static final String CASEDATE = "caseDate";
	/** Qualifier of the <code>JnjGTSurgeryInfo.levelsInstrumented</code> attribute **/
	public static final String LEVELSINSTRUMENTED = "levelsInstrumented";
	/** Qualifier of the <code>JnjGTSurgeryInfo.pathology</code> attribute **/
	public static final String PATHOLOGY = "pathology";
	/** Qualifier of the <code>JnjGTSurgeryInfo.zone</code> attribute **/
	public static final String ZONE = "zone";
	/** Qualifier of the <code>JnjGTSurgeryInfo.caseNumber</code> attribute **/
	public static final String CASENUMBER = "caseNumber";
	/** Qualifier of the <code>JnjGTSurgeryInfo.procedureType</code> attribute **/
	public static final String PROCEDURETYPE = "procedureType";
	/** Qualifier of the <code>JnjGTSurgeryInfo.cas</code> attribute **/
	public static final String CAS = "cas";
	/** Qualifier of the <code>JnjGTSurgeryInfo.ownerDetail</code> attribute **/
	public static final String OWNERDETAIL = "ownerDetail";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SURGERYSPECIALTY, AttributeMode.INITIAL);
		tmp.put(ORTHOBIOLOGICS, AttributeMode.INITIAL);
		tmp.put(SURGICALAPPROACH, AttributeMode.INITIAL);
		tmp.put(INTERBODY, AttributeMode.INITIAL);
		tmp.put(INTERBODYFUSION, AttributeMode.INITIAL);
		tmp.put(CASEDATE, AttributeMode.INITIAL);
		tmp.put(LEVELSINSTRUMENTED, AttributeMode.INITIAL);
		tmp.put(PATHOLOGY, AttributeMode.INITIAL);
		tmp.put(ZONE, AttributeMode.INITIAL);
		tmp.put(CASENUMBER, AttributeMode.INITIAL);
		tmp.put(PROCEDURETYPE, AttributeMode.INITIAL);
		tmp.put(CAS, AttributeMode.INITIAL);
		tmp.put(OWNERDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.cas</code> attribute.
	 * @return the cas
	 */
	public String getCas(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.cas</code> attribute.
	 * @return the cas
	 */
	public String getCas()
	{
		return getCas( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.cas</code> attribute. 
	 * @param value the cas
	 */
	public void setCas(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.cas</code> attribute. 
	 * @param value the cas
	 */
	public void setCas(final String value)
	{
		setCas( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public Date getCaseDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CASEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.caseDate</code> attribute.
	 * @return the caseDate
	 */
	public Date getCaseDate()
	{
		return getCaseDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CASEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.caseDate</code> attribute. 
	 * @param value the caseDate
	 */
	public void setCaseDate(final Date value)
	{
		setCaseDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.caseNumber</code> attribute.
	 * @return the caseNumber
	 */
	public String getCaseNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.caseNumber</code> attribute.
	 * @return the caseNumber
	 */
	public String getCaseNumber()
	{
		return getCaseNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.caseNumber</code> attribute. 
	 * @param value the caseNumber
	 */
	public void setCaseNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.caseNumber</code> attribute. 
	 * @param value the caseNumber
	 */
	public void setCaseNumber(final String value)
	{
		setCaseNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.interbody</code> attribute.
	 * @return the interbody
	 */
	public String getInterbody(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERBODY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.interbody</code> attribute.
	 * @return the interbody
	 */
	public String getInterbody()
	{
		return getInterbody( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.interbody</code> attribute. 
	 * @param value the interbody
	 */
	public void setInterbody(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERBODY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.interbody</code> attribute. 
	 * @param value the interbody
	 */
	public void setInterbody(final String value)
	{
		setInterbody( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.interbodyFusion</code> attribute.
	 * @return the interbodyFusion
	 */
	public String getInterbodyFusion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERBODYFUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.interbodyFusion</code> attribute.
	 * @return the interbodyFusion
	 */
	public String getInterbodyFusion()
	{
		return getInterbodyFusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.interbodyFusion</code> attribute. 
	 * @param value the interbodyFusion
	 */
	public void setInterbodyFusion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERBODYFUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.interbodyFusion</code> attribute. 
	 * @param value the interbodyFusion
	 */
	public void setInterbodyFusion(final String value)
	{
		setInterbodyFusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.levelsInstrumented</code> attribute.
	 * @return the levelsInstrumented
	 */
	public String getLevelsInstrumented(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEVELSINSTRUMENTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.levelsInstrumented</code> attribute.
	 * @return the levelsInstrumented
	 */
	public String getLevelsInstrumented()
	{
		return getLevelsInstrumented( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.levelsInstrumented</code> attribute. 
	 * @param value the levelsInstrumented
	 */
	public void setLevelsInstrumented(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEVELSINSTRUMENTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.levelsInstrumented</code> attribute. 
	 * @param value the levelsInstrumented
	 */
	public void setLevelsInstrumented(final String value)
	{
		setLevelsInstrumented( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.orthobiologics</code> attribute.
	 * @return the orthobiologics
	 */
	public String getOrthobiologics(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORTHOBIOLOGICS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.orthobiologics</code> attribute.
	 * @return the orthobiologics
	 */
	public String getOrthobiologics()
	{
		return getOrthobiologics( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.orthobiologics</code> attribute. 
	 * @param value the orthobiologics
	 */
	public void setOrthobiologics(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORTHOBIOLOGICS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.orthobiologics</code> attribute. 
	 * @param value the orthobiologics
	 */
	public void setOrthobiologics(final String value)
	{
		setOrthobiologics( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.ownerDetail</code> attribute.
	 * @return the ownerDetail
	 */
	public AbstractOrder getOwnerDetail(final SessionContext ctx)
	{
		return (AbstractOrder)getProperty( ctx, OWNERDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.ownerDetail</code> attribute.
	 * @return the ownerDetail
	 */
	public AbstractOrder getOwnerDetail()
	{
		return getOwnerDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.ownerDetail</code> attribute. 
	 * @param value the ownerDetail
	 */
	public void setOwnerDetail(final SessionContext ctx, final AbstractOrder value)
	{
		setProperty(ctx, OWNERDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.ownerDetail</code> attribute. 
	 * @param value the ownerDetail
	 */
	public void setOwnerDetail(final AbstractOrder value)
	{
		setOwnerDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.pathology</code> attribute.
	 * @return the pathology
	 */
	public String getPathology(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PATHOLOGY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.pathology</code> attribute.
	 * @return the pathology
	 */
	public String getPathology()
	{
		return getPathology( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.pathology</code> attribute. 
	 * @param value the pathology
	 */
	public void setPathology(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PATHOLOGY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.pathology</code> attribute. 
	 * @param value the pathology
	 */
	public void setPathology(final String value)
	{
		setPathology( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.procedureType</code> attribute.
	 * @return the procedureType
	 */
	public String getProcedureType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROCEDURETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.procedureType</code> attribute.
	 * @return the procedureType
	 */
	public String getProcedureType()
	{
		return getProcedureType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.procedureType</code> attribute. 
	 * @param value the procedureType
	 */
	public void setProcedureType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROCEDURETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.procedureType</code> attribute. 
	 * @param value the procedureType
	 */
	public void setProcedureType(final String value)
	{
		setProcedureType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.surgerySpecialty</code> attribute.
	 * @return the surgerySpecialty
	 */
	public String getSurgerySpecialty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGERYSPECIALTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.surgerySpecialty</code> attribute.
	 * @return the surgerySpecialty
	 */
	public String getSurgerySpecialty()
	{
		return getSurgerySpecialty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.surgerySpecialty</code> attribute. 
	 * @param value the surgerySpecialty
	 */
	public void setSurgerySpecialty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGERYSPECIALTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.surgerySpecialty</code> attribute. 
	 * @param value the surgerySpecialty
	 */
	public void setSurgerySpecialty(final String value)
	{
		setSurgerySpecialty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.surgicalApproach</code> attribute.
	 * @return the surgicalApproach
	 */
	public String getSurgicalApproach(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURGICALAPPROACH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.surgicalApproach</code> attribute.
	 * @return the surgicalApproach
	 */
	public String getSurgicalApproach()
	{
		return getSurgicalApproach( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.surgicalApproach</code> attribute. 
	 * @param value the surgicalApproach
	 */
	public void setSurgicalApproach(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURGICALAPPROACH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.surgicalApproach</code> attribute. 
	 * @param value the surgicalApproach
	 */
	public void setSurgicalApproach(final String value)
	{
		setSurgicalApproach( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.zone</code> attribute.
	 * @return the zone
	 */
	public String getZone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ZONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTSurgeryInfo.zone</code> attribute.
	 * @return the zone
	 */
	public String getZone()
	{
		return getZone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.zone</code> attribute. 
	 * @param value the zone
	 */
	public void setZone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ZONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTSurgeryInfo.zone</code> attribute. 
	 * @param value the zone
	 */
	public void setZone(final String value)
	{
		setZone( getSession().getSessionContext(), value );
	}
	
}
