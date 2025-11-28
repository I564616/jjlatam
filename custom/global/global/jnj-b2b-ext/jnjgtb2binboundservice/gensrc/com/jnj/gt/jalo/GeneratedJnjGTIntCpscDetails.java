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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntCpscDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntCpscDetails extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntCpscDetails.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntCpscDetails.lotNumber</code> attribute **/
	public static final String LOTNUMBER = "lotNumber";
	/** Qualifier of the <code>JnjGTIntCpscDetails.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnjGTIntCpscDetails.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>JnjGTIntCpscDetails.upcCode</code> attribute **/
	public static final String UPCCODE = "upcCode";
	/** Qualifier of the <code>JnjGTIntCpscDetails.cpscRuleDescription</code> attribute **/
	public static final String CPSCRULEDESCRIPTION = "cpscRuleDescription";
	/** Qualifier of the <code>JnjGTIntCpscDetails.mfgCompanyCode</code> attribute **/
	public static final String MFGCOMPANYCODE = "mfgCompanyCode";
	/** Qualifier of the <code>JnjGTIntCpscDetails.cpsiComments</code> attribute **/
	public static final String CPSICOMMENTS = "cpsiComments";
	/** Qualifier of the <code>JnjGTIntCpscDetails.certificateCreateDate</code> attribute **/
	public static final String CERTIFICATECREATEDATE = "certificateCreateDate";
	/** Qualifier of the <code>JnjGTIntCpscDetails.certificateCreater</code> attribute **/
	public static final String CERTIFICATECREATER = "certificateCreater";
	/** Qualifier of the <code>JnjGTIntCpscDetails.certificateModifiedDate</code> attribute **/
	public static final String CERTIFICATEMODIFIEDDATE = "certificateModifiedDate";
	/** Qualifier of the <code>JnjGTIntCpscDetails.addressLotNumber</code> attribute **/
	public static final String ADDRESSLOTNUMBER = "addressLotNumber";
	/** Qualifier of the <code>JnjGTIntCpscDetails.mfdDate</code> attribute **/
	public static final String MFDDATE = "mfdDate";
	/** Qualifier of the <code>JnjGTIntCpscDetails.modifiedDate</code> attribute **/
	public static final String MODIFIEDDATE = "modifiedDate";
	/** Qualifier of the <code>JnjGTIntCpscDetails.modifiedBy</code> attribute **/
	public static final String MODIFIEDBY = "modifiedBy";
	/** Qualifier of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute **/
	public static final String DELETEINDICATORCPSIA = "deleteIndicatorCPSIA";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(LOTNUMBER, AttributeMode.INITIAL);
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(UPCCODE, AttributeMode.INITIAL);
		tmp.put(CPSCRULEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MFGCOMPANYCODE, AttributeMode.INITIAL);
		tmp.put(CPSICOMMENTS, AttributeMode.INITIAL);
		tmp.put(CERTIFICATECREATEDATE, AttributeMode.INITIAL);
		tmp.put(CERTIFICATECREATER, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEMODIFIEDDATE, AttributeMode.INITIAL);
		tmp.put(ADDRESSLOTNUMBER, AttributeMode.INITIAL);
		tmp.put(MFDDATE, AttributeMode.INITIAL);
		tmp.put(MODIFIEDDATE, AttributeMode.INITIAL);
		tmp.put(MODIFIEDBY, AttributeMode.INITIAL);
		tmp.put(DELETEINDICATORCPSIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.addressLotNumber</code> attribute.
	 * @return the addressLotNumber
	 */
	public String getAddressLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSLOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.addressLotNumber</code> attribute.
	 * @return the addressLotNumber
	 */
	public String getAddressLotNumber()
	{
		return getAddressLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.addressLotNumber</code> attribute. 
	 * @param value the addressLotNumber
	 */
	public void setAddressLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSLOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.addressLotNumber</code> attribute. 
	 * @param value the addressLotNumber
	 */
	public void setAddressLotNumber(final String value)
	{
		setAddressLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateCreateDate</code> attribute.
	 * @return the certificateCreateDate
	 */
	public Date getCertificateCreateDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATECREATEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateCreateDate</code> attribute.
	 * @return the certificateCreateDate
	 */
	public Date getCertificateCreateDate()
	{
		return getCertificateCreateDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateCreateDate</code> attribute. 
	 * @param value the certificateCreateDate
	 */
	public void setCertificateCreateDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATECREATEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateCreateDate</code> attribute. 
	 * @param value the certificateCreateDate
	 */
	public void setCertificateCreateDate(final Date value)
	{
		setCertificateCreateDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateCreater</code> attribute.
	 * @return the certificateCreater
	 */
	public String getCertificateCreater(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CERTIFICATECREATER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateCreater</code> attribute.
	 * @return the certificateCreater
	 */
	public String getCertificateCreater()
	{
		return getCertificateCreater( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateCreater</code> attribute. 
	 * @param value the certificateCreater
	 */
	public void setCertificateCreater(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CERTIFICATECREATER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateCreater</code> attribute. 
	 * @param value the certificateCreater
	 */
	public void setCertificateCreater(final String value)
	{
		setCertificateCreater( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateModifiedDate</code> attribute.
	 * @return the certificateModifiedDate
	 */
	public Date getCertificateModifiedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATEMODIFIEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.certificateModifiedDate</code> attribute.
	 * @return the certificateModifiedDate
	 */
	public Date getCertificateModifiedDate()
	{
		return getCertificateModifiedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateModifiedDate</code> attribute. 
	 * @param value the certificateModifiedDate
	 */
	public void setCertificateModifiedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATEMODIFIEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.certificateModifiedDate</code> attribute. 
	 * @param value the certificateModifiedDate
	 */
	public void setCertificateModifiedDate(final Date value)
	{
		setCertificateModifiedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.cpscRuleDescription</code> attribute.
	 * @return the cpscRuleDescription
	 */
	public String getCpscRuleDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CPSCRULEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.cpscRuleDescription</code> attribute.
	 * @return the cpscRuleDescription
	 */
	public String getCpscRuleDescription()
	{
		return getCpscRuleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.cpscRuleDescription</code> attribute. 
	 * @param value the cpscRuleDescription
	 */
	public void setCpscRuleDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CPSCRULEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.cpscRuleDescription</code> attribute. 
	 * @param value the cpscRuleDescription
	 */
	public void setCpscRuleDescription(final String value)
	{
		setCpscRuleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.cpsiComments</code> attribute.
	 * @return the cpsiComments
	 */
	public String getCpsiComments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CPSICOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.cpsiComments</code> attribute.
	 * @return the cpsiComments
	 */
	public String getCpsiComments()
	{
		return getCpsiComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.cpsiComments</code> attribute. 
	 * @param value the cpsiComments
	 */
	public void setCpsiComments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CPSICOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.cpsiComments</code> attribute. 
	 * @param value the cpsiComments
	 */
	public void setCpsiComments(final String value)
	{
		setCpsiComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute.
	 * @return the deleteIndicatorCPSIA
	 */
	public Boolean isDeleteIndicatorCPSIA(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELETEINDICATORCPSIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute.
	 * @return the deleteIndicatorCPSIA
	 */
	public Boolean isDeleteIndicatorCPSIA()
	{
		return isDeleteIndicatorCPSIA( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @return the deleteIndicatorCPSIA
	 */
	public boolean isDeleteIndicatorCPSIAAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeleteIndicatorCPSIA( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @return the deleteIndicatorCPSIA
	 */
	public boolean isDeleteIndicatorCPSIAAsPrimitive()
	{
		return isDeleteIndicatorCPSIAAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @param value the deleteIndicatorCPSIA
	 */
	public void setDeleteIndicatorCPSIA(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELETEINDICATORCPSIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @param value the deleteIndicatorCPSIA
	 */
	public void setDeleteIndicatorCPSIA(final Boolean value)
	{
		setDeleteIndicatorCPSIA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @param value the deleteIndicatorCPSIA
	 */
	public void setDeleteIndicatorCPSIA(final SessionContext ctx, final boolean value)
	{
		setDeleteIndicatorCPSIA( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.deleteIndicatorCPSIA</code> attribute. 
	 * @param value the deleteIndicatorCPSIA
	 */
	public void setDeleteIndicatorCPSIA(final boolean value)
	{
		setDeleteIndicatorCPSIA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.lotNumber</code> attribute.
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return getLotNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.lotNumber</code> attribute. 
	 * @param value the lotNumber
	 */
	public void setLotNumber(final String value)
	{
		setLotNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.mfdDate</code> attribute.
	 * @return the mfdDate
	 */
	public String getMfdDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.mfdDate</code> attribute.
	 * @return the mfdDate
	 */
	public String getMfdDate()
	{
		return getMfdDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.mfdDate</code> attribute. 
	 * @param value the mfdDate
	 */
	public void setMfdDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.mfdDate</code> attribute. 
	 * @param value the mfdDate
	 */
	public void setMfdDate(final String value)
	{
		setMfdDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.mfgCompanyCode</code> attribute.
	 * @return the mfgCompanyCode
	 */
	public String getMfgCompanyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFGCOMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.mfgCompanyCode</code> attribute.
	 * @return the mfgCompanyCode
	 */
	public String getMfgCompanyCode()
	{
		return getMfgCompanyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.mfgCompanyCode</code> attribute. 
	 * @param value the mfgCompanyCode
	 */
	public void setMfgCompanyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFGCOMPANYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.mfgCompanyCode</code> attribute. 
	 * @param value the mfgCompanyCode
	 */
	public void setMfgCompanyCode(final String value)
	{
		setMfgCompanyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy()
	{
		return getModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final String value)
	{
		setModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MODIFIEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate()
	{
		return getModifiedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MODIFIEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final Date value)
	{
		setModifiedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UPCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCpscDetails.upcCode</code> attribute.
	 * @return the upcCode
	 */
	public String getUpcCode()
	{
		return getUpcCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UPCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCpscDetails.upcCode</code> attribute. 
	 * @param value the upcCode
	 */
	public void setUpcCode(final String value)
	{
		setUpcCode( getSession().getSessionContext(), value );
	}
	
}
