/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntTerritory}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntTerritory extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntTerritory.territoryCode</code> attribute **/
	public static final String TERRITORYCODE = "territoryCode";
	/** Qualifier of the <code>JnjGTIntTerritory.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntTerritory.wwid</code> attribute **/
	public static final String WWID = "wwid";
	/** Qualifier of the <code>JnjGTIntTerritory.shipToNumber</code> attribute **/
	public static final String SHIPTONUMBER = "shipToNumber";
	/** Qualifier of the <code>JnjGTIntTerritory.billToNumber</code> attribute **/
	public static final String BILLTONUMBER = "billToNumber";
	/** Qualifier of the <code>JnjGTIntTerritory.soldToNumber</code> attribute **/
	public static final String SOLDTONUMBER = "soldToNumber";
	/** Qualifier of the <code>JnjGTIntTerritory.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TERRITORYCODE, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(WWID, AttributeMode.INITIAL);
		tmp.put(SHIPTONUMBER, AttributeMode.INITIAL);
		tmp.put(BILLTONUMBER, AttributeMode.INITIAL);
		tmp.put(SOLDTONUMBER, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.billToNumber</code> attribute.
	 * @return the billToNumber
	 */
	public String getBillToNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLTONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.billToNumber</code> attribute.
	 * @return the billToNumber
	 */
	public String getBillToNumber()
	{
		return getBillToNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.billToNumber</code> attribute. 
	 * @param value the billToNumber
	 */
	public void setBillToNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLTONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.billToNumber</code> attribute. 
	 * @param value the billToNumber
	 */
	public void setBillToNumber(final String value)
	{
		setBillToNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.shipToNumber</code> attribute.
	 * @return the shipToNumber
	 */
	public String getShipToNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.shipToNumber</code> attribute.
	 * @return the shipToNumber
	 */
	public String getShipToNumber()
	{
		return getShipToNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.shipToNumber</code> attribute. 
	 * @param value the shipToNumber
	 */
	public void setShipToNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.shipToNumber</code> attribute. 
	 * @param value the shipToNumber
	 */
	public void setShipToNumber(final String value)
	{
		setShipToNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.soldToNumber</code> attribute.
	 * @return the soldToNumber
	 */
	public String getSoldToNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.soldToNumber</code> attribute.
	 * @return the soldToNumber
	 */
	public String getSoldToNumber()
	{
		return getSoldToNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.soldToNumber</code> attribute. 
	 * @param value the soldToNumber
	 */
	public void setSoldToNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.soldToNumber</code> attribute. 
	 * @param value the soldToNumber
	 */
	public void setSoldToNumber(final String value)
	{
		setSoldToNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.territoryCode</code> attribute.
	 * @return the territoryCode
	 */
	public String getTerritoryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TERRITORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.territoryCode</code> attribute.
	 * @return the territoryCode
	 */
	public String getTerritoryCode()
	{
		return getTerritoryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.territoryCode</code> attribute. 
	 * @param value the territoryCode
	 */
	public void setTerritoryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TERRITORYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.territoryCode</code> attribute. 
	 * @param value the territoryCode
	 */
	public void setTerritoryCode(final String value)
	{
		setTerritoryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntTerritory.wwid</code> attribute.
	 * @return the wwid
	 */
	public String getWwid()
	{
		return getWwid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntTerritory.wwid</code> attribute. 
	 * @param value the wwid
	 */
	public void setWwid(final String value)
	{
		setWwid( getSession().getSessionContext(), value );
	}
	
}
