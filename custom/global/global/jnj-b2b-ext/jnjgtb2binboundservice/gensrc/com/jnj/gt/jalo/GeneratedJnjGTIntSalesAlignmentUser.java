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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntSalesAlignmentUser}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntSalesAlignmentUser extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.salesOrgDivCd</code> attribute **/
	public static final String SALESORGDIVCD = "salesOrgDivCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.uniCustomerNumber</code> attribute **/
	public static final String UNICUSTOMERNUMBER = "uniCustomerNumber";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.orgId</code> attribute **/
	public static final String ORGID = "orgId";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEffectiveDate</code> attribute **/
	public static final String ALNAFFLNEFFECTIVEDATE = "alnAfflnEffectiveDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEndDate</code> attribute **/
	public static final String ALNAFFLNENDDATE = "alnAfflnEndDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.delIndiactor</code> attribute **/
	public static final String DELINDIACTOR = "delIndiactor";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.lastUpdatedDate</code> attribute **/
	public static final String LASTUPDATEDDATE = "lastUpdatedDate";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.orgTypeCd</code> attribute **/
	public static final String ORGTYPECD = "orgTypeCd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.primRepInd</code> attribute **/
	public static final String PRIMREPIND = "primRepInd";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.wwid</code> attribute **/
	public static final String WWID = "wwid";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntSalesAlignmentUser.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SALESORGDIVCD, AttributeMode.INITIAL);
		tmp.put(UNICUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(ORGID, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNENDDATE, AttributeMode.INITIAL);
		tmp.put(DELINDIACTOR, AttributeMode.INITIAL);
		tmp.put(LASTUPDATEDDATE, AttributeMode.INITIAL);
		tmp.put(ORGTYPECD, AttributeMode.INITIAL);
		tmp.put(PRIMREPIND, AttributeMode.INITIAL);
		tmp.put(WWID, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate()
	{
		return getAlnAfflnEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final Date value)
	{
		setAlnAfflnEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate()
	{
		return getAlnAfflnEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final Date value)
	{
		setAlnAfflnEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.delIndiactor</code> attribute.
	 * @return the delIndiactor
	 */
	public String getDelIndiactor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELINDIACTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.delIndiactor</code> attribute.
	 * @return the delIndiactor
	 */
	public String getDelIndiactor()
	{
		return getDelIndiactor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.delIndiactor</code> attribute. 
	 * @param value the delIndiactor
	 */
	public void setDelIndiactor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELINDIACTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.delIndiactor</code> attribute. 
	 * @param value the delIndiactor
	 */
	public void setDelIndiactor(final String value)
	{
		setDelIndiactor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTUPDATEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.lastUpdatedDate</code> attribute.
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate()
	{
		return getLastUpdatedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTUPDATEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.lastUpdatedDate</code> attribute. 
	 * @param value the lastUpdatedDate
	 */
	public void setLastUpdatedDate(final Date value)
	{
		setLastUpdatedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.orgId</code> attribute.
	 * @return the orgId
	 */
	public String getOrgId()
	{
		return getOrgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.orgId</code> attribute. 
	 * @param value the orgId
	 */
	public void setOrgId(final String value)
	{
		setOrgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.orgTypeCd</code> attribute.
	 * @return the orgTypeCd
	 */
	public String getOrgTypeCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORGTYPECD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.orgTypeCd</code> attribute.
	 * @return the orgTypeCd
	 */
	public String getOrgTypeCd()
	{
		return getOrgTypeCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd
	 */
	public void setOrgTypeCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORGTYPECD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.orgTypeCd</code> attribute. 
	 * @param value the orgTypeCd
	 */
	public void setOrgTypeCd(final String value)
	{
		setOrgTypeCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.primRepInd</code> attribute.
	 * @return the primRepInd
	 */
	public String getPrimRepInd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRIMREPIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.primRepInd</code> attribute.
	 * @return the primRepInd
	 */
	public String getPrimRepInd()
	{
		return getPrimRepInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.primRepInd</code> attribute. 
	 * @param value the primRepInd
	 */
	public void setPrimRepInd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRIMREPIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.primRepInd</code> attribute. 
	 * @param value the primRepInd
	 */
	public void setPrimRepInd(final String value)
	{
		setPrimRepInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.salesOrgDivCd</code> attribute.
	 * @return the salesOrgDivCd
	 */
	public String getSalesOrgDivCd()
	{
		return getSalesOrgDivCd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVCD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.salesOrgDivCd</code> attribute. 
	 * @param value the salesOrgDivCd
	 */
	public void setSalesOrgDivCd(final String value)
	{
		setSalesOrgDivCd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.uniCustomerNumber</code> attribute.
	 * @return the uniCustomerNumber
	 */
	public String getUniCustomerNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNICUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.uniCustomerNumber</code> attribute.
	 * @return the uniCustomerNumber
	 */
	public String getUniCustomerNumber()
	{
		return getUniCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.uniCustomerNumber</code> attribute. 
	 * @param value the uniCustomerNumber
	 */
	public void setUniCustomerNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNICUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.uniCustomerNumber</code> attribute. 
	 * @param value the uniCustomerNumber
	 */
	public void setUniCustomerNumber(final String value)
	{
		setUniCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntSalesAlignmentUser.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid()
	{
		return getWwid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntSalesAlignmentUser.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final String value)
	{
		setWwid( getSession().getSessionContext(), value );
	}
	
}
