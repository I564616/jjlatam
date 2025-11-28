/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntProductUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntProductUnit extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntProductUnit.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnjGTIntProductUnit.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.unitCode</code> attribute **/
	public static final String UNITCODE = "unitCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.unitName</code> attribute **/
	public static final String UNITNAME = "unitName";
	/** Qualifier of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute **/
	public static final String SHIPUNITIND = "shipUnitInd";
	/** Qualifier of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute **/
	public static final String SALESUOMIND = "salesUomInd";
	/** Qualifier of the <code>JnjGTIntProductUnit.lineUomCode</code> attribute **/
	public static final String LINEUOMCODE = "lineUomCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.lineUomName</code> attribute **/
	public static final String LINEUOMNAME = "lineUomName";
	/** Qualifier of the <code>JnjGTIntProductUnit.depth</code> attribute **/
	public static final String DEPTH = "depth";
	/** Qualifier of the <code>JnjGTIntProductUnit.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>JnjGTIntProductUnit.width</code> attribute **/
	public static final String WIDTH = "width";
	/** Qualifier of the <code>JnjGTIntProductUnit.volumeUomCode</code> attribute **/
	public static final String VOLUMEUOMCODE = "volumeUomCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.volumeQty</code> attribute **/
	public static final String VOLUMEQTY = "volumeQty";
	/** Qualifier of the <code>JnjGTIntProductUnit.weightUomCode</code> attribute **/
	public static final String WEIGHTUOMCODE = "weightUomCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.weightUomName</code> attribute **/
	public static final String WEIGHTUOMNAME = "weightUomName";
	/** Qualifier of the <code>JnjGTIntProductUnit.weightQty</code> attribute **/
	public static final String WEIGHTQTY = "weightQty";
	/** Qualifier of the <code>JnjGTIntProductUnit.gtin</code> attribute **/
	public static final String GTIN = "gtin";
	/** Qualifier of the <code>JnjGTIntProductUnit.denom</code> attribute **/
	public static final String DENOM = "denom";
	/** Qualifier of the <code>JnjGTIntProductUnit.numerator</code> attribute **/
	public static final String NUMERATOR = "numerator";
	/** Qualifier of the <code>JnjGTIntProductUnit.lwrPackagingLvlQty</code> attribute **/
	public static final String LWRPACKAGINGLVLQTY = "lwrPackagingLvlQty";
	/** Qualifier of the <code>JnjGTIntProductUnit.packagingLvlCode</code> attribute **/
	public static final String PACKAGINGLVLCODE = "packagingLvlCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.regionCode</code> attribute **/
	public static final String REGIONCODE = "regionCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.packagingLvlLabelUomCode</code> attribute **/
	public static final String PACKAGINGLVLLABELUOMCODE = "packagingLvlLabelUomCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.packagingLevelQty</code> attribute **/
	public static final String PACKAGINGLEVELQTY = "packagingLevelQty";
	/** Qualifier of the <code>JnjGTIntProductUnit.lwrPackagingLvlUomCode</code> attribute **/
	public static final String LWRPACKAGINGLVLUOMCODE = "lwrPackagingLvlUomCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.outerCaseCode</code> attribute **/
	public static final String OUTERCASECODE = "outerCaseCode";
	/** Qualifier of the <code>JnjGTIntProductUnit.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>JnjGTIntProductUnit.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute **/
	public static final String RCVUNITIND = "rcvUnitInd";
	/** Qualifier of the <code>JnjGTIntProductUnit.netWeightQty</code> attribute **/
	public static final String NETWEIGHTQTY = "netWeightQty";
	/** Qualifier of the <code>JnjGTIntProductUnit.innerPackPerCase</code> attribute **/
	public static final String INNERPACKPERCASE = "innerPackPerCase";
	/** Qualifier of the <code>JnjGTIntProductUnit.tiersPerPallet</code> attribute **/
	public static final String TIERSPERPALLET = "tiersPerPallet";
	/** Qualifier of the <code>JnjGTIntProductUnit.casesPerTier</code> attribute **/
	public static final String CASESPERTIER = "casesPerTier";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(UNITCODE, AttributeMode.INITIAL);
		tmp.put(UNITNAME, AttributeMode.INITIAL);
		tmp.put(SHIPUNITIND, AttributeMode.INITIAL);
		tmp.put(SALESUOMIND, AttributeMode.INITIAL);
		tmp.put(LINEUOMCODE, AttributeMode.INITIAL);
		tmp.put(LINEUOMNAME, AttributeMode.INITIAL);
		tmp.put(DEPTH, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(WIDTH, AttributeMode.INITIAL);
		tmp.put(VOLUMEUOMCODE, AttributeMode.INITIAL);
		tmp.put(VOLUMEQTY, AttributeMode.INITIAL);
		tmp.put(WEIGHTUOMCODE, AttributeMode.INITIAL);
		tmp.put(WEIGHTUOMNAME, AttributeMode.INITIAL);
		tmp.put(WEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(GTIN, AttributeMode.INITIAL);
		tmp.put(DENOM, AttributeMode.INITIAL);
		tmp.put(NUMERATOR, AttributeMode.INITIAL);
		tmp.put(LWRPACKAGINGLVLQTY, AttributeMode.INITIAL);
		tmp.put(PACKAGINGLVLCODE, AttributeMode.INITIAL);
		tmp.put(REGIONCODE, AttributeMode.INITIAL);
		tmp.put(PACKAGINGLVLLABELUOMCODE, AttributeMode.INITIAL);
		tmp.put(PACKAGINGLEVELQTY, AttributeMode.INITIAL);
		tmp.put(LWRPACKAGINGLVLUOMCODE, AttributeMode.INITIAL);
		tmp.put(OUTERCASECODE, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(RCVUNITIND, AttributeMode.INITIAL);
		tmp.put(NETWEIGHTQTY, AttributeMode.INITIAL);
		tmp.put(INNERPACKPERCASE, AttributeMode.INITIAL);
		tmp.put(TIERSPERPALLET, AttributeMode.INITIAL);
		tmp.put(CASESPERTIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.casesPerTier</code> attribute.
	 * @return the casesPerTier
	 */
	public String getCasesPerTier(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASESPERTIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.casesPerTier</code> attribute.
	 * @return the casesPerTier
	 */
	public String getCasesPerTier()
	{
		return getCasesPerTier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASESPERTIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.casesPerTier</code> attribute. 
	 * @param value the casesPerTier
	 */
	public void setCasesPerTier(final String value)
	{
		setCasesPerTier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.denom</code> attribute.
	 * @return the denom
	 */
	public String getDenom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DENOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.denom</code> attribute.
	 * @return the denom
	 */
	public String getDenom()
	{
		return getDenom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.denom</code> attribute. 
	 * @param value the denom
	 */
	public void setDenom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DENOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.denom</code> attribute. 
	 * @param value the denom
	 */
	public void setDenom(final String value)
	{
		setDenom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.depth</code> attribute.
	 * @return the depth
	 */
	public String getDepth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.depth</code> attribute.
	 * @return the depth
	 */
	public String getDepth()
	{
		return getDepth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.depth</code> attribute. 
	 * @param value the depth
	 */
	public void setDepth(final String value)
	{
		setDepth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GTIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.gtin</code> attribute.
	 * @return the gtin
	 */
	public String getGtin()
	{
		return getGtin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GTIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.gtin</code> attribute. 
	 * @param value the gtin
	 */
	public void setGtin(final String value)
	{
		setGtin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.height</code> attribute.
	 * @return the height
	 */
	public String getHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.height</code> attribute.
	 * @return the height
	 */
	public String getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final String value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.innerPackPerCase</code> attribute.
	 * @return the innerPackPerCase
	 */
	public String getInnerPackPerCase(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INNERPACKPERCASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.innerPackPerCase</code> attribute.
	 * @return the innerPackPerCase
	 */
	public String getInnerPackPerCase()
	{
		return getInnerPackPerCase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INNERPACKPERCASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.innerPackPerCase</code> attribute. 
	 * @param value the innerPackPerCase
	 */
	public void setInnerPackPerCase(final String value)
	{
		setInnerPackPerCase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lineUomCode</code> attribute.
	 * @return the lineUomCode
	 */
	public String getLineUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINEUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lineUomCode</code> attribute.
	 * @return the lineUomCode
	 */
	public String getLineUomCode()
	{
		return getLineUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lineUomCode</code> attribute. 
	 * @param value the lineUomCode
	 */
	public void setLineUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINEUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lineUomCode</code> attribute. 
	 * @param value the lineUomCode
	 */
	public void setLineUomCode(final String value)
	{
		setLineUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lineUomName</code> attribute.
	 * @return the lineUomName
	 */
	public String getLineUomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINEUOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lineUomName</code> attribute.
	 * @return the lineUomName
	 */
	public String getLineUomName()
	{
		return getLineUomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lineUomName</code> attribute. 
	 * @param value the lineUomName
	 */
	public void setLineUomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINEUOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lineUomName</code> attribute. 
	 * @param value the lineUomName
	 */
	public void setLineUomName(final String value)
	{
		setLineUomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lwrPackagingLvlQty</code> attribute.
	 * @return the lwrPackagingLvlQty
	 */
	public String getLwrPackagingLvlQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LWRPACKAGINGLVLQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lwrPackagingLvlQty</code> attribute.
	 * @return the lwrPackagingLvlQty
	 */
	public String getLwrPackagingLvlQty()
	{
		return getLwrPackagingLvlQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lwrPackagingLvlQty</code> attribute. 
	 * @param value the lwrPackagingLvlQty
	 */
	public void setLwrPackagingLvlQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LWRPACKAGINGLVLQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lwrPackagingLvlQty</code> attribute. 
	 * @param value the lwrPackagingLvlQty
	 */
	public void setLwrPackagingLvlQty(final String value)
	{
		setLwrPackagingLvlQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lwrPackagingLvlUomCode</code> attribute.
	 * @return the lwrPackagingLvlUomCode
	 */
	public String getLwrPackagingLvlUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LWRPACKAGINGLVLUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.lwrPackagingLvlUomCode</code> attribute.
	 * @return the lwrPackagingLvlUomCode
	 */
	public String getLwrPackagingLvlUomCode()
	{
		return getLwrPackagingLvlUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lwrPackagingLvlUomCode</code> attribute. 
	 * @param value the lwrPackagingLvlUomCode
	 */
	public void setLwrPackagingLvlUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LWRPACKAGINGLVLUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.lwrPackagingLvlUomCode</code> attribute. 
	 * @param value the lwrPackagingLvlUomCode
	 */
	public void setLwrPackagingLvlUomCode(final String value)
	{
		setLwrPackagingLvlUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.netWeightQty</code> attribute.
	 * @return the netWeightQty
	 */
	public String getNetWeightQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NETWEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.netWeightQty</code> attribute.
	 * @return the netWeightQty
	 */
	public String getNetWeightQty()
	{
		return getNetWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NETWEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.netWeightQty</code> attribute. 
	 * @param value the netWeightQty
	 */
	public void setNetWeightQty(final String value)
	{
		setNetWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.numerator</code> attribute.
	 * @return the numerator
	 */
	public Integer getNumerator(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.numerator</code> attribute.
	 * @return the numerator
	 */
	public Integer getNumerator()
	{
		return getNumerator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @return the numerator
	 */
	public int getNumeratorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumerator( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @return the numerator
	 */
	public int getNumeratorAsPrimitive()
	{
		return getNumeratorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final Integer value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final SessionContext ctx, final int value)
	{
		setNumerator( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.numerator</code> attribute. 
	 * @param value the numerator
	 */
	public void setNumerator(final int value)
	{
		setNumerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.outerCaseCode</code> attribute.
	 * @return the outerCaseCode
	 */
	public String getOuterCaseCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OUTERCASECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.outerCaseCode</code> attribute.
	 * @return the outerCaseCode
	 */
	public String getOuterCaseCode()
	{
		return getOuterCaseCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.outerCaseCode</code> attribute. 
	 * @param value the outerCaseCode
	 */
	public void setOuterCaseCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OUTERCASECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.outerCaseCode</code> attribute. 
	 * @param value the outerCaseCode
	 */
	public void setOuterCaseCode(final String value)
	{
		setOuterCaseCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLevelQty</code> attribute.
	 * @return the packagingLevelQty
	 */
	public String getPackagingLevelQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PACKAGINGLEVELQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLevelQty</code> attribute.
	 * @return the packagingLevelQty
	 */
	public String getPackagingLevelQty()
	{
		return getPackagingLevelQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty
	 */
	public void setPackagingLevelQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PACKAGINGLEVELQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLevelQty</code> attribute. 
	 * @param value the packagingLevelQty
	 */
	public void setPackagingLevelQty(final String value)
	{
		setPackagingLevelQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLvlCode</code> attribute.
	 * @return the packagingLvlCode
	 */
	public String getPackagingLvlCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PACKAGINGLVLCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLvlCode</code> attribute.
	 * @return the packagingLvlCode
	 */
	public String getPackagingLvlCode()
	{
		return getPackagingLvlCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode
	 */
	public void setPackagingLvlCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PACKAGINGLVLCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLvlCode</code> attribute. 
	 * @param value the packagingLvlCode
	 */
	public void setPackagingLvlCode(final String value)
	{
		setPackagingLvlCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLvlLabelUomCode</code> attribute.
	 * @return the packagingLvlLabelUomCode
	 */
	public String getPackagingLvlLabelUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PACKAGINGLVLLABELUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.packagingLvlLabelUomCode</code> attribute.
	 * @return the packagingLvlLabelUomCode
	 */
	public String getPackagingLvlLabelUomCode()
	{
		return getPackagingLvlLabelUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLvlLabelUomCode</code> attribute. 
	 * @param value the packagingLvlLabelUomCode
	 */
	public void setPackagingLvlLabelUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PACKAGINGLVLLABELUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.packagingLvlLabelUomCode</code> attribute. 
	 * @param value the packagingLvlLabelUomCode
	 */
	public void setPackagingLvlLabelUomCode(final String value)
	{
		setPackagingLvlLabelUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute.
	 * @return the rcvUnitInd
	 */
	public Boolean isRcvUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RCVUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute.
	 * @return the rcvUnitInd
	 */
	public Boolean isRcvUnitInd()
	{
		return isRcvUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @return the rcvUnitInd
	 */
	public boolean isRcvUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRcvUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @return the rcvUnitInd
	 */
	public boolean isRcvUnitIndAsPrimitive()
	{
		return isRcvUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RCVUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final Boolean value)
	{
		setRcvUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final SessionContext ctx, final boolean value)
	{
		setRcvUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.rcvUnitInd</code> attribute. 
	 * @param value the rcvUnitInd
	 */
	public void setRcvUnitInd(final boolean value)
	{
		setRcvUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode()
	{
		return getRegionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final String value)
	{
		setRegionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute.
	 * @return the salesUomInd
	 */
	public Boolean isSalesUomInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALESUOMIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute.
	 * @return the salesUomInd
	 */
	public Boolean isSalesUomInd()
	{
		return isSalesUomInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @return the salesUomInd
	 */
	public boolean isSalesUomIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSalesUomInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @return the salesUomInd
	 */
	public boolean isSalesUomIndAsPrimitive()
	{
		return isSalesUomIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @param value the salesUomInd
	 */
	public void setSalesUomInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALESUOMIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @param value the salesUomInd
	 */
	public void setSalesUomInd(final Boolean value)
	{
		setSalesUomInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @param value the salesUomInd
	 */
	public void setSalesUomInd(final SessionContext ctx, final boolean value)
	{
		setSalesUomInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.salesUomInd</code> attribute. 
	 * @param value the salesUomInd
	 */
	public void setSalesUomInd(final boolean value)
	{
		setSalesUomInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHIPUNITIND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute.
	 * @return the shipUnitInd
	 */
	public Boolean isShipUnitInd()
	{
		return isShipUnitInd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShipUnitInd( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @return the shipUnitInd
	 */
	public boolean isShipUnitIndAsPrimitive()
	{
		return isShipUnitIndAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHIPUNITIND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final Boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final SessionContext ctx, final boolean value)
	{
		setShipUnitInd( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.shipUnitInd</code> attribute. 
	 * @param value the shipUnitInd
	 */
	public void setShipUnitInd(final boolean value)
	{
		setShipUnitInd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.tiersPerPallet</code> attribute.
	 * @return the tiersPerPallet
	 */
	public String getTiersPerPallet(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIERSPERPALLET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.tiersPerPallet</code> attribute.
	 * @return the tiersPerPallet
	 */
	public String getTiersPerPallet()
	{
		return getTiersPerPallet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIERSPERPALLET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.tiersPerPallet</code> attribute. 
	 * @param value the tiersPerPallet
	 */
	public void setTiersPerPallet(final String value)
	{
		setTiersPerPallet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.unitCode</code> attribute.
	 * @return the unitCode
	 */
	public String getUnitCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNITCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.unitCode</code> attribute.
	 * @return the unitCode
	 */
	public String getUnitCode()
	{
		return getUnitCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.unitCode</code> attribute. 
	 * @param value the unitCode
	 */
	public void setUnitCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNITCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.unitCode</code> attribute. 
	 * @param value the unitCode
	 */
	public void setUnitCode(final String value)
	{
		setUnitCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.unitName</code> attribute.
	 * @return the unitName
	 */
	public String getUnitName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNITNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.unitName</code> attribute.
	 * @return the unitName
	 */
	public String getUnitName()
	{
		return getUnitName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.unitName</code> attribute. 
	 * @param value the unitName
	 */
	public void setUnitName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNITNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.unitName</code> attribute. 
	 * @param value the unitName
	 */
	public void setUnitName(final String value)
	{
		setUnitName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.volumeQty</code> attribute.
	 * @return the volumeQty
	 */
	public String getVolumeQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VOLUMEQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.volumeQty</code> attribute.
	 * @return the volumeQty
	 */
	public String getVolumeQty()
	{
		return getVolumeQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.volumeQty</code> attribute. 
	 * @param value the volumeQty
	 */
	public void setVolumeQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VOLUMEQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.volumeQty</code> attribute. 
	 * @param value the volumeQty
	 */
	public void setVolumeQty(final String value)
	{
		setVolumeQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.volumeUomCode</code> attribute.
	 * @return the volumeUomCode
	 */
	public String getVolumeUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VOLUMEUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.volumeUomCode</code> attribute.
	 * @return the volumeUomCode
	 */
	public String getVolumeUomCode()
	{
		return getVolumeUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.volumeUomCode</code> attribute. 
	 * @param value the volumeUomCode
	 */
	public void setVolumeUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VOLUMEUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.volumeUomCode</code> attribute. 
	 * @param value the volumeUomCode
	 */
	public void setVolumeUomCode(final String value)
	{
		setVolumeUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightQty</code> attribute.
	 * @return the weightQty
	 */
	public String getWeightQty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHTQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightQty</code> attribute.
	 * @return the weightQty
	 */
	public String getWeightQty()
	{
		return getWeightQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightQty</code> attribute. 
	 * @param value the weightQty
	 */
	public void setWeightQty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHTQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightQty</code> attribute. 
	 * @param value the weightQty
	 */
	public void setWeightQty(final String value)
	{
		setWeightQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightUomCode</code> attribute.
	 * @return the weightUomCode
	 */
	public String getWeightUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHTUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightUomCode</code> attribute.
	 * @return the weightUomCode
	 */
	public String getWeightUomCode()
	{
		return getWeightUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightUomCode</code> attribute. 
	 * @param value the weightUomCode
	 */
	public void setWeightUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHTUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightUomCode</code> attribute. 
	 * @param value the weightUomCode
	 */
	public void setWeightUomCode(final String value)
	{
		setWeightUomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightUomName</code> attribute.
	 * @return the weightUomName
	 */
	public String getWeightUomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHTUOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.weightUomName</code> attribute.
	 * @return the weightUomName
	 */
	public String getWeightUomName()
	{
		return getWeightUomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightUomName</code> attribute. 
	 * @param value the weightUomName
	 */
	public void setWeightUomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHTUOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.weightUomName</code> attribute. 
	 * @param value the weightUomName
	 */
	public void setWeightUomName(final String value)
	{
		setWeightUomName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.width</code> attribute.
	 * @return the width
	 */
	public String getWidth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WIDTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntProductUnit.width</code> attribute.
	 * @return the width
	 */
	public String getWidth()
	{
		return getWidth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WIDTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntProductUnit.width</code> attribute. 
	 * @param value the width
	 */
	public void setWidth(final String value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
}
