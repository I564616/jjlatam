/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.europe1.jalo.PriceRow JnJGTPriceRow}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnJGTPriceRow extends PriceRow
{
	/** Qualifier of the <code>JnJGTPriceRow.priceUomCode</code> attribute **/
	public static final String PRICEUOMCODE = "priceUomCode";
	/** Qualifier of the <code>JnJGTPriceRow.condRecNum</code> attribute **/
	public static final String CONDRECNUM = "condRecNum";
	/** Qualifier of the <code>JnJGTPriceRow.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>JnJGTPriceRow.listPriceId</code> attribute **/
	public static final String LISTPRICEID = "listPriceId";
	/** Qualifier of the <code>JnJGTPriceRow.priceTypeCode</code> attribute **/
	public static final String PRICETYPECODE = "priceTypeCode";
	/** Qualifier of the <code>JnJGTPriceRow.priceBook</code> attribute **/
	public static final String PRICEBOOK = "priceBook";
	/** Qualifier of the <code>JnJGTPriceRow.mdmCustomerGroup</code> attribute **/
	public static final String MDMCUSTOMERGROUP = "mdmCustomerGroup";
	/** Qualifier of the <code>JnJGTPriceRow.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PriceRow.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICEUOMCODE, AttributeMode.INITIAL);
		tmp.put(CONDRECNUM, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(LISTPRICEID, AttributeMode.INITIAL);
		tmp.put(PRICETYPECODE, AttributeMode.INITIAL);
		tmp.put(PRICEBOOK, AttributeMode.INITIAL);
		tmp.put(MDMCUSTOMERGROUP, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.condRecNum</code> attribute.
	 * @return the condRecNum
	 */
	public String getCondRecNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDRECNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.condRecNum</code> attribute.
	 * @return the condRecNum
	 */
	public String getCondRecNum()
	{
		return getCondRecNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.condRecNum</code> attribute. 
	 * @param value the condRecNum
	 */
	public void setCondRecNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDRECNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.condRecNum</code> attribute. 
	 * @param value the condRecNum
	 */
	public void setCondRecNum(final String value)
	{
		setCondRecNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.listPriceId</code> attribute.
	 * @return the listPriceId
	 */
	public String getListPriceId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LISTPRICEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.listPriceId</code> attribute.
	 * @return the listPriceId
	 */
	public String getListPriceId()
	{
		return getListPriceId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.listPriceId</code> attribute. 
	 * @param value the listPriceId
	 */
	public void setListPriceId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LISTPRICEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.listPriceId</code> attribute. 
	 * @param value the listPriceId
	 */
	public void setListPriceId(final String value)
	{
		setListPriceId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.mdmCustomerGroup</code> attribute.
	 * @return the mdmCustomerGroup
	 */
	public String getMdmCustomerGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MDMCUSTOMERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.mdmCustomerGroup</code> attribute.
	 * @return the mdmCustomerGroup
	 */
	public String getMdmCustomerGroup()
	{
		return getMdmCustomerGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.mdmCustomerGroup</code> attribute. 
	 * @param value the mdmCustomerGroup
	 */
	public void setMdmCustomerGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MDMCUSTOMERGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.mdmCustomerGroup</code> attribute. 
	 * @param value the mdmCustomerGroup
	 */
	public void setMdmCustomerGroup(final String value)
	{
		setMdmCustomerGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEBOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceBook</code> attribute.
	 * @return the priceBook
	 */
	public String getPriceBook()
	{
		return getPriceBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEBOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceBook</code> attribute. 
	 * @param value the priceBook
	 */
	public void setPriceBook(final String value)
	{
		setPriceBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceTypeCode</code> attribute.
	 * @return the priceTypeCode
	 */
	public String getPriceTypeCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICETYPECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceTypeCode</code> attribute.
	 * @return the priceTypeCode
	 */
	public String getPriceTypeCode()
	{
		return getPriceTypeCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceTypeCode</code> attribute. 
	 * @param value the priceTypeCode
	 */
	public void setPriceTypeCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICETYPECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceTypeCode</code> attribute. 
	 * @param value the priceTypeCode
	 */
	public void setPriceTypeCode(final String value)
	{
		setPriceTypeCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceUomCode</code> attribute.
	 * @return the priceUomCode
	 */
	public String getPriceUomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICEUOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnJGTPriceRow.priceUomCode</code> attribute.
	 * @return the priceUomCode
	 */
	public String getPriceUomCode()
	{
		return getPriceUomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceUomCode</code> attribute. 
	 * @param value the priceUomCode
	 */
	public void setPriceUomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICEUOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnJGTPriceRow.priceUomCode</code> attribute. 
	 * @param value the priceUomCode
	 */
	public void setPriceUomCode(final String value)
	{
		setPriceUomCode( getSession().getSessionContext(), value );
	}
	
}
