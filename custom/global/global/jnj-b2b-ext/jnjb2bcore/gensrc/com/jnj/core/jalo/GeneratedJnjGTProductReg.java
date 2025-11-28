/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTProductReg}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTProductReg extends GenericItem
{
	/** Qualifier of the <code>JnjGTProductReg.regionCode</code> attribute **/
	public static final String REGIONCODE = "regionCode";
	/** Qualifier of the <code>JnjGTProductReg.salesOrgCompCde</code> attribute **/
	public static final String SALESORGCOMPCDE = "salesOrgCompCde";
	/** Qualifier of the <code>JnjGTProductReg.salesOrgDivision</code> attribute **/
	public static final String SALESORGDIVISION = "salesOrgDivision";
	/** Qualifier of the <code>JnjGTProductReg.jnJProduct</code> attribute **/
	public static final String JNJPRODUCT = "jnJProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JNJPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedJnjGTProductReg> JNJPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedJnjGTProductReg>(
	Jnjb2bCoreConstants.TC.JNJGTPRODUCTREG,
	false,
	"jnJProduct",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REGIONCODE, AttributeMode.INITIAL);
		tmp.put(SALESORGCOMPCDE, AttributeMode.INITIAL);
		tmp.put(SALESORGDIVISION, AttributeMode.INITIAL);
		tmp.put(JNJPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		JNJPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.jnJProduct</code> attribute.
	 * @return the jnJProduct
	 */
	public JnJProduct getJnJProduct(final SessionContext ctx)
	{
		return (JnJProduct)getProperty( ctx, JNJPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.jnJProduct</code> attribute.
	 * @return the jnJProduct
	 */
	public JnJProduct getJnJProduct()
	{
		return getJnJProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.jnJProduct</code> attribute. 
	 * @param value the jnJProduct
	 */
	public void setJnJProduct(final SessionContext ctx, final JnJProduct value)
	{
		JNJPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.jnJProduct</code> attribute. 
	 * @param value the jnJProduct
	 */
	public void setJnJProduct(final JnJProduct value)
	{
		setJnJProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.regionCode</code> attribute.
	 * @return the regionCode
	 */
	public String getRegionCode()
	{
		return getRegionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.regionCode</code> attribute. 
	 * @param value the regionCode
	 */
	public void setRegionCode(final String value)
	{
		setRegionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.salesOrgCompCde</code> attribute.
	 * @return the salesOrgCompCde
	 */
	public String getSalesOrgCompCde(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGCOMPCDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.salesOrgCompCde</code> attribute.
	 * @return the salesOrgCompCde
	 */
	public String getSalesOrgCompCde()
	{
		return getSalesOrgCompCde( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.salesOrgCompCde</code> attribute. 
	 * @param value the salesOrgCompCde
	 */
	public void setSalesOrgCompCde(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGCOMPCDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.salesOrgCompCde</code> attribute. 
	 * @param value the salesOrgCompCde
	 */
	public void setSalesOrgCompCde(final String value)
	{
		setSalesOrgCompCde( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.salesOrgDivision</code> attribute.
	 * @return the salesOrgDivision
	 */
	public String getSalesOrgDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGDIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTProductReg.salesOrgDivision</code> attribute.
	 * @return the salesOrgDivision
	 */
	public String getSalesOrgDivision()
	{
		return getSalesOrgDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.salesOrgDivision</code> attribute. 
	 * @param value the salesOrgDivision
	 */
	public void setSalesOrgDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGDIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTProductReg.salesOrgDivision</code> attribute. 
	 * @param value the salesOrgDivision
	 */
	public void setSalesOrgDivision(final String value)
	{
		setSalesOrgDivision( getSession().getSessionContext(), value );
	}
	
}
