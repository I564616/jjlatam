/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnJGTIntProductPlant}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTIntProductPlant extends GenericItem
{
	/** Qualifier of the <code>JnJGTIntProductPlant.srcSystem</code> attribute **/
	public static final String SRCSYSTEM = "srcSystem";
	/** Qualifier of the <code>JnJGTIntProductPlant.productSkuCode</code> attribute **/
	public static final String PRODUCTSKUCODE = "productSkuCode";
	/** Qualifier of the <code>JnJGTIntProductPlant.countryOriginCode</code> attribute **/
	public static final String COUNTRYORIGINCODE = "countryOriginCode";
	/** Qualifier of the <code>JnJGTIntProductPlant.countryAssemblyCode</code> attribute **/
	public static final String COUNTRYASSEMBLYCODE = "countryAssemblyCode";
	/** Qualifier of the <code>JnJGTIntProductPlant.countryOriginName</code> attribute **/
	public static final String COUNTRYORIGINNAME = "countryOriginName";
	/** Qualifier of the <code>JnJGTIntProductPlant.countryAssemblyName</code> attribute **/
	public static final String COUNTRYASSEMBLYNAME = "countryAssemblyName";
	/** Qualifier of the <code>JnJGTIntProductPlant.prodPlnt</code> attribute **/
	public static final String PRODPLNT = "prodPlnt";
	/** Qualifier of the <code>JnJGTIntProductPlant.businessSector</code> attribute **/
	public static final String BUSINESSSECTOR = "businessSector";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SRCSYSTEM, AttributeMode.INITIAL);
		tmp.put(PRODUCTSKUCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYORIGINCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYASSEMBLYCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYORIGINNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRYASSEMBLYNAME, AttributeMode.INITIAL);
		tmp.put(PRODPLNT, AttributeMode.INITIAL);
		tmp.put(BUSINESSSECTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.businessSector</code> attribute.
	 * @return the businessSector
	 */
	public String getBusinessSector()
	{
		return getBusinessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.businessSector</code> attribute. 
	 * @param value the businessSector
	 */
	public void setBusinessSector(final String value)
	{
		setBusinessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryAssemblyCode</code> attribute.
	 * @return the countryAssemblyCode
	 */
	public String getCountryAssemblyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYASSEMBLYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryAssemblyCode</code> attribute.
	 * @return the countryAssemblyCode
	 */
	public String getCountryAssemblyCode()
	{
		return getCountryAssemblyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryAssemblyCode</code> attribute. 
	 * @param value the countryAssemblyCode
	 */
	public void setCountryAssemblyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYASSEMBLYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryAssemblyCode</code> attribute. 
	 * @param value the countryAssemblyCode
	 */
	public void setCountryAssemblyCode(final String value)
	{
		setCountryAssemblyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryAssemblyName</code> attribute.
	 * @return the countryAssemblyName
	 */
	public String getCountryAssemblyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYASSEMBLYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryAssemblyName</code> attribute.
	 * @return the countryAssemblyName
	 */
	public String getCountryAssemblyName()
	{
		return getCountryAssemblyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryAssemblyName</code> attribute. 
	 * @param value the countryAssemblyName
	 */
	public void setCountryAssemblyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYASSEMBLYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryAssemblyName</code> attribute. 
	 * @param value the countryAssemblyName
	 */
	public void setCountryAssemblyName(final String value)
	{
		setCountryAssemblyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryOriginCode</code> attribute.
	 * @return the countryOriginCode
	 */
	public String getCountryOriginCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYORIGINCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryOriginCode</code> attribute.
	 * @return the countryOriginCode
	 */
	public String getCountryOriginCode()
	{
		return getCountryOriginCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryOriginCode</code> attribute. 
	 * @param value the countryOriginCode
	 */
	public void setCountryOriginCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYORIGINCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryOriginCode</code> attribute. 
	 * @param value the countryOriginCode
	 */
	public void setCountryOriginCode(final String value)
	{
		setCountryOriginCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryOriginName</code> attribute.
	 * @return the countryOriginName
	 */
	public String getCountryOriginName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYORIGINNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.countryOriginName</code> attribute.
	 * @return the countryOriginName
	 */
	public String getCountryOriginName()
	{
		return getCountryOriginName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryOriginName</code> attribute. 
	 * @param value the countryOriginName
	 */
	public void setCountryOriginName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYORIGINNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.countryOriginName</code> attribute. 
	 * @param value the countryOriginName
	 */
	public void setCountryOriginName(final String value)
	{
		setCountryOriginName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.prodPlnt</code> attribute.
	 * @return the prodPlnt
	 */
	public String getProdPlnt(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODPLNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.prodPlnt</code> attribute.
	 * @return the prodPlnt
	 */
	public String getProdPlnt()
	{
		return getProdPlnt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.prodPlnt</code> attribute. 
	 * @param value the prodPlnt
	 */
	public void setProdPlnt(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODPLNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.prodPlnt</code> attribute. 
	 * @param value the prodPlnt
	 */
	public void setProdPlnt(final String value)
	{
		setProdPlnt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTSKUCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.productSkuCode</code> attribute.
	 * @return the productSkuCode
	 */
	public String getProductSkuCode()
	{
		return getProductSkuCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTSKUCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.productSkuCode</code> attribute. 
	 * @param value the productSkuCode
	 */
	public void setProductSkuCode(final String value)
	{
		setProductSkuCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SRCSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTIntProductPlant.srcSystem</code> attribute.
	 * @return the srcSystem
	 */
	public String getSrcSystem()
	{
		return getSrcSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SRCSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTIntProductPlant.srcSystem</code> attribute. 
	 * @param value the srcSystem
	 */
	public void setSrcSystem(final String value)
	{
		setSrcSystem( getSession().getSessionContext(), value );
	}
	
}
