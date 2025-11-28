/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTShippingMethod}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTShippingMethod extends GenericItem
{
	/** Qualifier of the <code>JnjGTShippingMethod.route</code> attribute **/
	public static final String ROUTE = "route";
	/** Qualifier of the <code>JnjGTShippingMethod.expidateRoute</code> attribute **/
	public static final String EXPIDATEROUTE = "expidateRoute";
	/** Qualifier of the <code>JnjGTShippingMethod.dispName</code> attribute **/
	public static final String DISPNAME = "dispName";
	/** Qualifier of the <code>JnjGTShippingMethod.rank</code> attribute **/
	public static final String RANK = "rank";
	/** Qualifier of the <code>JnjGTShippingMethod.sortBy</code> attribute **/
	public static final String SORTBY = "sortBy";
	/** Qualifier of the <code>JnjGTShippingMethod.selectable</code> attribute **/
	public static final String SELECTABLE = "selectable";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROUTE, AttributeMode.INITIAL);
		tmp.put(EXPIDATEROUTE, AttributeMode.INITIAL);
		tmp.put(DISPNAME, AttributeMode.INITIAL);
		tmp.put(RANK, AttributeMode.INITIAL);
		tmp.put(SORTBY, AttributeMode.INITIAL);
		tmp.put(SELECTABLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.dispName</code> attribute.
	 * @return the dispName
	 */
	public String getDispName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.dispName</code> attribute.
	 * @return the dispName
	 */
	public String getDispName()
	{
		return getDispName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.dispName</code> attribute. 
	 * @param value the dispName
	 */
	public void setDispName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.dispName</code> attribute. 
	 * @param value the dispName
	 */
	public void setDispName(final String value)
	{
		setDispName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.expidateRoute</code> attribute.
	 * @return the expidateRoute
	 */
	public String getExpidateRoute(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXPIDATEROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.expidateRoute</code> attribute.
	 * @return the expidateRoute
	 */
	public String getExpidateRoute()
	{
		return getExpidateRoute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.expidateRoute</code> attribute. 
	 * @param value the expidateRoute
	 */
	public void setExpidateRoute(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXPIDATEROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.expidateRoute</code> attribute. 
	 * @param value the expidateRoute
	 */
	public void setExpidateRoute(final String value)
	{
		setExpidateRoute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.rank</code> attribute.
	 * @return the rank
	 */
	public Integer getRank(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.rank</code> attribute.
	 * @return the rank
	 */
	public Integer getRank()
	{
		return getRank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @return the rank
	 */
	public int getRankAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRank( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @return the rank
	 */
	public int getRankAsPrimitive()
	{
		return getRankAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @param value the rank
	 */
	public void setRank(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @param value the rank
	 */
	public void setRank(final Integer value)
	{
		setRank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @param value the rank
	 */
	public void setRank(final SessionContext ctx, final int value)
	{
		setRank( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.rank</code> attribute. 
	 * @param value the rank
	 */
	public void setRank(final int value)
	{
		setRank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.route</code> attribute.
	 * @return the route
	 */
	public String getRoute(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.route</code> attribute.
	 * @return the route
	 */
	public String getRoute()
	{
		return getRoute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.route</code> attribute. 
	 * @param value the route
	 */
	public void setRoute(final String value)
	{
		setRoute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.selectable</code> attribute.
	 * @return the selectable
	 */
	public Boolean isSelectable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELECTABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.selectable</code> attribute.
	 * @return the selectable
	 */
	public Boolean isSelectable()
	{
		return isSelectable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @return the selectable
	 */
	public boolean isSelectableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSelectable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @return the selectable
	 */
	public boolean isSelectableAsPrimitive()
	{
		return isSelectableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @param value the selectable
	 */
	public void setSelectable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELECTABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @param value the selectable
	 */
	public void setSelectable(final Boolean value)
	{
		setSelectable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @param value the selectable
	 */
	public void setSelectable(final SessionContext ctx, final boolean value)
	{
		setSelectable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.selectable</code> attribute. 
	 * @param value the selectable
	 */
	public void setSelectable(final boolean value)
	{
		setSelectable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.sortBy</code> attribute.
	 * @return the sortBy
	 */
	public String getSortBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SORTBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTShippingMethod.sortBy</code> attribute.
	 * @return the sortBy
	 */
	public String getSortBy()
	{
		return getSortBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.sortBy</code> attribute. 
	 * @param value the sortBy
	 */
	public void setSortBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SORTBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTShippingMethod.sortBy</code> attribute. 
	 * @param value the sortBy
	 */
	public void setSortBy(final String value)
	{
		setSortBy( getSession().getSessionContext(), value );
	}
	
}
