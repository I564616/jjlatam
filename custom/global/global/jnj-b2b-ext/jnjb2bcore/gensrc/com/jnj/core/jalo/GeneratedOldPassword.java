/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-Oct-2025, 12:25:16 pm                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2bCustomer;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OldPassword}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedOldPassword extends GenericItem
{
	/** Qualifier of the <code>OldPassword.oldPassword</code> attribute **/
	public static final String OLDPASSWORD = "oldPassword";
	/** Qualifier of the <code>OldPassword.modifiedDate</code> attribute **/
	public static final String MODIFIEDDATE = "modifiedDate";
	/** Qualifier of the <code>OldPassword.jnjCustomer</code> attribute **/
	public static final String JNJCUSTOMER = "jnjCustomer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JNJCUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOldPassword> JNJCUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedOldPassword>(
	Jnjb2bCoreConstants.TC.OLDPASSWORD,
	false,
	"jnjCustomer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OLDPASSWORD, AttributeMode.INITIAL);
		tmp.put(MODIFIEDDATE, AttributeMode.INITIAL);
		tmp.put(JNJCUSTOMER, AttributeMode.INITIAL);
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
		JNJCUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.jnjCustomer</code> attribute.
	 * @return the jnjCustomer
	 */
	public JnJB2bCustomer getJnjCustomer(final SessionContext ctx)
	{
		return (JnJB2bCustomer)getProperty( ctx, JNJCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.jnjCustomer</code> attribute.
	 * @return the jnjCustomer
	 */
	public JnJB2bCustomer getJnjCustomer()
	{
		return getJnjCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.jnjCustomer</code> attribute. 
	 * @param value the jnjCustomer
	 */
	public void setJnjCustomer(final SessionContext ctx, final JnJB2bCustomer value)
	{
		JNJCUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.jnjCustomer</code> attribute. 
	 * @param value the jnjCustomer
	 */
	public void setJnjCustomer(final JnJB2bCustomer value)
	{
		setJnjCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MODIFIEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.modifiedDate</code> attribute.
	 * @return the modifiedDate
	 */
	public Date getModifiedDate()
	{
		return getModifiedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MODIFIEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.modifiedDate</code> attribute. 
	 * @param value the modifiedDate
	 */
	public void setModifiedDate(final Date value)
	{
		setModifiedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.oldPassword</code> attribute.
	 * @return the oldPassword
	 */
	public String getOldPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OLDPASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OldPassword.oldPassword</code> attribute.
	 * @return the oldPassword
	 */
	public String getOldPassword()
	{
		return getOldPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.oldPassword</code> attribute. 
	 * @param value the oldPassword
	 */
	public void setOldPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OLDPASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OldPassword.oldPassword</code> attribute. 
	 * @param value the oldPassword
	 */
	public void setOldPassword(final String value)
	{
		setOldPassword( getSession().getSessionContext(), value );
	}
	
}
