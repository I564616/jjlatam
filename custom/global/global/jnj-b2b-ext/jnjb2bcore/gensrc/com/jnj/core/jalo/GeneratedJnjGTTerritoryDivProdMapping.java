/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnjGTTerritoryDivison;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTTerritoryDivProdMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTTerritoryDivProdMapping extends GenericItem
{
	/** Qualifier of the <code>JnjGTTerritoryDivProdMapping.territoryDivison</code> attribute **/
	public static final String TERRITORYDIVISON = "territoryDivison";
	/** Qualifier of the <code>JnjGTTerritoryDivProdMapping.majorGroupCode</code> attribute **/
	public static final String MAJORGROUPCODE = "majorGroupCode";
	/** Qualifier of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEffectiveDate</code> attribute **/
	public static final String ALNAFFLNEFFECTIVEDATE = "alnAfflnEffectiveDate";
	/** Qualifier of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEndDate</code> attribute **/
	public static final String ALNAFFLNENDDATE = "alnAfflnEndDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TERRITORYDIVISON, AttributeMode.INITIAL);
		tmp.put(MAJORGROUPCODE, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNEFFECTIVEDATE, AttributeMode.INITIAL);
		tmp.put(ALNAFFLNENDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNEFFECTIVEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEffectiveDate</code> attribute.
	 * @return the alnAfflnEffectiveDate
	 */
	public Date getAlnAfflnEffectiveDate()
	{
		return getAlnAfflnEffectiveDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNEFFECTIVEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEffectiveDate</code> attribute. 
	 * @param value the alnAfflnEffectiveDate
	 */
	public void setAlnAfflnEffectiveDate(final Date value)
	{
		setAlnAfflnEffectiveDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ALNAFFLNENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEndDate</code> attribute.
	 * @return the alnAfflnEndDate
	 */
	public Date getAlnAfflnEndDate()
	{
		return getAlnAfflnEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ALNAFFLNENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.alnAfflnEndDate</code> attribute. 
	 * @param value the alnAfflnEndDate
	 */
	public void setAlnAfflnEndDate(final Date value)
	{
		setAlnAfflnEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.majorGroupCode</code> attribute.
	 * @return the majorGroupCode
	 */
	public String getMajorGroupCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAJORGROUPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.majorGroupCode</code> attribute.
	 * @return the majorGroupCode
	 */
	public String getMajorGroupCode()
	{
		return getMajorGroupCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.majorGroupCode</code> attribute. 
	 * @param value the majorGroupCode
	 */
	public void setMajorGroupCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAJORGROUPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.majorGroupCode</code> attribute. 
	 * @param value the majorGroupCode
	 */
	public void setMajorGroupCode(final String value)
	{
		setMajorGroupCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.territoryDivison</code> attribute.
	 * @return the territoryDivison
	 */
	public JnjGTTerritoryDivison getTerritoryDivison(final SessionContext ctx)
	{
		return (JnjGTTerritoryDivison)getProperty( ctx, TERRITORYDIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTTerritoryDivProdMapping.territoryDivison</code> attribute.
	 * @return the territoryDivison
	 */
	public JnjGTTerritoryDivison getTerritoryDivison()
	{
		return getTerritoryDivison( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.territoryDivison</code> attribute. 
	 * @param value the territoryDivison
	 */
	public void setTerritoryDivison(final SessionContext ctx, final JnjGTTerritoryDivison value)
	{
		setProperty(ctx, TERRITORYDIVISON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTTerritoryDivProdMapping.territoryDivison</code> attribute. 
	 * @param value the territoryDivison
	 */
	public void setTerritoryDivison(final JnjGTTerritoryDivison value)
	{
		setTerritoryDivison( getSession().getSessionContext(), value );
	}
	
}
