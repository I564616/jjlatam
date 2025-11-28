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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntSalesAlignmentProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntSalesAlignmentProduct extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.salesOrgDivCd</code> attribute **/
	public static final String SALESORGDIVCD = "salesOrgDivCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.orgId</code> attribute **/
	public static final String ORGID = "orgId";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEffectiveDate</code> attribute **/
	public static final String ALNAFFLNEFFECTIVEDATE = "alnAfflnEffectiveDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEndDate</code> attribute **/
	public static final String ALNAFFLNENDDATE = "alnAfflnEndDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.delIndiactor</code> attribute **/
	public static final String DELINDIACTOR = "delIndiactor";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.lastUpdatedDate</code> attribute **/
	public static final String LASTUPDATEDDATE = "lastUpdatedDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.sourceSysId</code> attribute **/
	public static final String SOURCESYSID = "sourceSysId";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentProduct.franMajorProdGrpCd</code> attribute **/
	public static final String FRANMAJORPRODGRPCD = "franMajorProdGrpCd";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SALESORGDIVCD, AttributeMode.INITIAL);
		tmp.put(ORGID, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNENDDATE, AttributeMode.INITIAL);
		tmp.put(DELINDIACTOR, AttributeMode.INITIAL);
		tmp.put(LASTUPDATEDDATE, AttributeMode.INITIAL);
		tmp.put(SOURCESYSID, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(FRANMAJORPRODGRPCD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate()
	{
		return getAlnAfflnEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final Date value)
	{
		setAlnAfflnEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate()
	{
		return getAlnAfflnEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final Date value)
	{
		setAlnAfflnEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.delIndiactor</code> attribute.
	 * @return the delIndiactor
	 */
	public String getDelIndiactor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELINDIACTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.delIndiactor</code> attribute.
	 * @return the delIndiactor
	 */
	public String getDelIndiactor()
	{
		return getDelIndiactor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.delIndiactor</code> attribute. 
	 * @param value the delIndiactor
	 */
	public void setDelIndiactor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELINDIACTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.delIndiactor</code> attribute. 
	 * @param value the delIndiactor
	 */
	public void setDelIndiactor(final String value)
	{
		setDelIndiactor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.franMajorProdGrpCd</code> attribute.
	 * @return the franMajorProdGrpCd
	 */
	public String getFranMajorProdGrpCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRANMAJORPRODGRPCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.franMajorProdGrpCd</code> attribute.
	 * @return the franMajorProdGrpCd
	 */
	public String getFranMajorProdGrpCd()
	{
		return getFranMajorProdGrpCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.franMajorProdGrpCd</code> attribute. 
	 * @param value the franMajorProdGrpCd
	 */
	public void setFranMajorProdGrpCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRANMAJORPRODGRPCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.franMajorProdGrpCd</code> attribute. 
	 * @param value the franMajorProdGrpCd
	 */
	public void setFranMajorProdGrpCd(final String value)
	{
		setFranMajorProdGrpCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTUPDATEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate()
	{
		return getLastUpdatedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTUPDATEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final Date value)
	{
		setLastUpdatedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId()
	{
		return getOrgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final String value)
	{
		setOrgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd()
	{
		return getSalesOrgDivCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final String value)
	{
		setSalesOrgDivCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentProduct.sourceSysId</code> attribute.
	 * @return the sourceSysId
	 */
	public String getSourceSysId()
	{
		return getSourceSysId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentProduct.sourceSysId</code> attribute. 
	 * @param value the sourceSysId
	 */
	public void setSourceSysId(final String value)
	{
		setSourceSysId( getSession().getSessionContext(), value );
	}
	
}
