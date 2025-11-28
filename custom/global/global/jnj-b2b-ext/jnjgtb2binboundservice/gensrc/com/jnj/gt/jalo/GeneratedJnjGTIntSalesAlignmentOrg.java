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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntSalesAlignmentOrg}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntSalesAlignmentOrg extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.salesOrgDivCd</code> attribute **/
	public static final String SALESORGDIVCD = "salesOrgDivCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.orgId</code> attribute **/
	public static final String ORGID = "orgId";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.delIndicator</code> attribute **/
	public static final String DELINDICATOR = "delIndicator";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.lastUpdatedDate</code> attribute **/
	public static final String LASTUPDATEDDATE = "lastUpdatedDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.parntOrgId</code> attribute **/
	public static final String PARNTORGID = "parntOrgId";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.parntOrgTypeCd</code> attribute **/
	public static final String PARNTORGTYPECD = "parntOrgTypeCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.orgTypeCd</code> attribute **/
	public static final String ORGTYPECD = "orgTypeCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.orgEffectiveDate</code> attribute **/
	public static final String ORGEFFECTIVEDATE = "orgEffectiveDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.orgEndDate</code> attribute **/
	public static final String ORGENDDATE = "orgEndDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentOrg.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SALESORGDIVCD, AttributeMode.INITIAL);
		tmp.put(ORGID, AttributeMode.INITIAL);
		tmp.put(DELINDICATOR, AttributeMode.INITIAL);
		tmp.put(LASTUPDATEDDATE, AttributeMode.INITIAL);
		tmp.put(PARNTORGID, AttributeMode.INITIAL);
		tmp.put(PARNTORGTYPECD, AttributeMode.INITIAL);
		tmp.put(ORGTYPECD, AttributeMode.INITIAL);
		tmp.put(ORGEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ORGENDDATE, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.delIndicator</code> attribute.
	 * @return the delIndicator
	 */
	public String getDelIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.delIndicator</code> attribute.
	 * @return the delIndicator
	 */
	public String getDelIndicator()
	{
		return getDelIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.delIndicator</code> attribute. 
	 * @param value the delIndicator
	 */
	public void setDelIndicator(final String value)
	{
		setDelIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTUPDATEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate()
	{
		return getLastUpdatedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTUPDATEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final Date value)
	{
		setLastUpdatedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgEffectiveDate</code> attribute.
	 * @return the orgEffectiveDate
	 */
	public Date getOrgEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ORGEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgEffectiveDate</code> attribute.
	 * @return the orgEffectiveDate
	 */
	public Date getOrgEffectiveDate()
	{
		return getOrgEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgEffectiveDate</code> attribute. 
	 * @param value the orgEffectiveDate
	 */
	public void setOrgEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ORGEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgEffectiveDate</code> attribute. 
	 * @param value the orgEffectiveDate
	 */
	public void setOrgEffectiveDate(final Date value)
	{
		setOrgEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgEndDate</code> attribute.
	 * @return the orgEndDate
	 */
	public Date getOrgEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ORGENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgEndDate</code> attribute.
	 * @return the orgEndDate
	 */
	public Date getOrgEndDate()
	{
		return getOrgEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgEndDate</code> attribute. 
	 * @param value the orgEndDate
	 */
	public void setOrgEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ORGENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgEndDate</code> attribute. 
	 * @param value the orgEndDate
	 */
	public void setOrgEndDate(final Date value)
	{
		setOrgEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId()
	{
		return getOrgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final String value)
	{
		setOrgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgTypeCd</code> attribute.
	 * @return the orgTypeCd
	 */
	public String getOrgTypeCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGTYPECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.orgTypeCd</code> attribute.
	 * @return the orgTypeCd
	 */
	public String getOrgTypeCd()
	{
		return getOrgTypeCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd
	 */
	public void setOrgTypeCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGTYPECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd
	 */
	public void setOrgTypeCd(final String value)
	{
		setOrgTypeCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgId</code> attribute.
	 * @return the parntOrgId
	 */
	public String getParntOrgId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARNTORGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgId</code> attribute.
	 * @return the parntOrgId
	 */
	public String getParntOrgId()
	{
		return getParntOrgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgId</code> attribute. 
	 * @param value the parntOrgId
	 */
	public void setParntOrgId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARNTORGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgId</code> attribute. 
	 * @param value the parntOrgId
	 */
	public void setParntOrgId(final String value)
	{
		setParntOrgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgTypeCd</code> attribute.
	 * @return the parntOrgTypeCd
	 */
	public String getParntOrgTypeCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARNTORGTYPECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgTypeCd</code> attribute.
	 * @return the parntOrgTypeCd
	 */
	public String getParntOrgTypeCd()
	{
		return getParntOrgTypeCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgTypeCd</code> attribute. 
	 * @param value the parntOrgTypeCd
	 */
	public void setParntOrgTypeCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARNTORGTYPECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.parntOrgTypeCd</code> attribute. 
	 * @param value the parntOrgTypeCd
	 */
	public void setParntOrgTypeCd(final String value)
	{
		setParntOrgTypeCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd()
	{
		return getSalesOrgDivCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final String value)
	{
		setSalesOrgDivCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentOrg.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentOrg.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
}
