/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess JnjGTExportCatalogEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTExportCatalogEmailProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>JnjGTExportCatalogEmailProcess.exportCatalogData</code> attribute **/
	public static final String EXPORTCATALOGDATA = "exportCatalogData";
	/** Qualifier of the <code>JnjGTExportCatalogEmailProcess.currentB2bUnit</code> attribute **/
	public static final String CURRENTB2BUNIT = "currentB2bUnit";
	/** Qualifier of the <code>JnjGTExportCatalogEmailProcess.currentSite</code> attribute **/
	public static final String CURRENTSITE = "currentSite";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXPORTCATALOGDATA, AttributeMode.INITIAL);
		tmp.put(CURRENTB2BUNIT, AttributeMode.INITIAL);
		tmp.put(CURRENTSITE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.currentB2bUnit</code> attribute.
	 * @return the currentB2bUnit
	 */
	public JnJB2BUnit getCurrentB2bUnit(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, CURRENTB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.currentB2bUnit</code> attribute.
	 * @return the currentB2bUnit
	 */
	public JnJB2BUnit getCurrentB2bUnit()
	{
		return getCurrentB2bUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.currentB2bUnit</code> attribute. 
	 * @param value the currentB2bUnit
	 */
	public void setCurrentB2bUnit(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, CURRENTB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.currentB2bUnit</code> attribute. 
	 * @param value the currentB2bUnit
	 */
	public void setCurrentB2bUnit(final JnJB2BUnit value)
	{
		setCurrentB2bUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.currentSite</code> attribute.
	 * @return the currentSite
	 */
	public String getCurrentSite(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENTSITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.currentSite</code> attribute.
	 * @return the currentSite
	 */
	public String getCurrentSite()
	{
		return getCurrentSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.currentSite</code> attribute. 
	 * @param value the currentSite
	 */
	public void setCurrentSite(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENTSITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.currentSite</code> attribute. 
	 * @param value the currentSite
	 */
	public void setCurrentSite(final String value)
	{
		setCurrentSite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.exportCatalogData</code> attribute.
	 * @return the exportCatalogData
	 */
	public Map getExportCatalogData(final SessionContext ctx)
	{
		return (Map)getProperty( ctx, EXPORTCATALOGDATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTExportCatalogEmailProcess.exportCatalogData</code> attribute.
	 * @return the exportCatalogData
	 */
	public Map getExportCatalogData()
	{
		return getExportCatalogData( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.exportCatalogData</code> attribute. 
	 * @param value the exportCatalogData
	 */
	public void setExportCatalogData(final SessionContext ctx, final Map value)
	{
		setProperty(ctx, EXPORTCATALOGDATA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTExportCatalogEmailProcess.exportCatalogData</code> attribute. 
	 * @param value the exportCatalogData
	 */
	public void setExportCatalogData(final Map value)
	{
		setExportCatalogData( getSession().getSessionContext(), value );
	}
	
}
