/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.core.jalo.JnJB2BUnit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.payment.PaymentInfo JnjGTCreditCard}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTCreditCard extends PaymentInfo
{
	/** Qualifier of the <code>JnjGTCreditCard.sourceId</code> attribute **/
	public static final String SOURCEID = "sourceId";
	/** Qualifier of the <code>JnjGTCreditCard.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTCreditCard.cardSource</code> attribute **/
	public static final String CARDSOURCE = "cardSource";
	/** Qualifier of the <code>JnjGTCreditCard.account</code> attribute **/
	public static final String ACCOUNT = "account";
	/** Qualifier of the <code>JnjGTCreditCard.creditCardtoken</code> attribute **/
	public static final String CREDITCARDTOKEN = "creditCardtoken";
	/** Qualifier of the <code>JnjGTCreditCard.cardLasr4Digit</code> attribute **/
	public static final String CARDLASR4DIGIT = "cardLasr4Digit";
	/** Qualifier of the <code>JnjGTCreditCard.indicator</code> attribute **/
	public static final String INDICATOR = "indicator";
	/** Qualifier of the <code>JnjGTCreditCard.cardAddedDate</code> attribute **/
	public static final String CARDADDEDDATE = "cardAddedDate";
	/** Qualifier of the <code>JnjGTCreditCard.isRemember</code> attribute **/
	public static final String ISREMEMBER = "isRemember";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOURCEID, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(CARDSOURCE, AttributeMode.INITIAL);
		tmp.put(ACCOUNT, AttributeMode.INITIAL);
		tmp.put(CREDITCARDTOKEN, AttributeMode.INITIAL);
		tmp.put(CARDLASR4DIGIT, AttributeMode.INITIAL);
		tmp.put(INDICATOR, AttributeMode.INITIAL);
		tmp.put(CARDADDEDDATE, AttributeMode.INITIAL);
		tmp.put(ISREMEMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.account</code> attribute.
	 * @return the account
	 */
	public JnJB2BUnit getAccount(final SessionContext ctx)
	{
		return (JnJB2BUnit)getProperty( ctx, ACCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.account</code> attribute.
	 * @return the account
	 */
	public JnJB2BUnit getAccount()
	{
		return getAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.account</code> attribute. 
	 * @param value the account
	 */
	public void setAccount(final SessionContext ctx, final JnJB2BUnit value)
	{
		setProperty(ctx, ACCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.account</code> attribute. 
	 * @param value the account
	 */
	public void setAccount(final JnJB2BUnit value)
	{
		setAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardAddedDate</code> attribute.
	 * @return the cardAddedDate
	 */
	public String getCardAddedDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDADDEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardAddedDate</code> attribute.
	 * @return the cardAddedDate
	 */
	public String getCardAddedDate()
	{
		return getCardAddedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardAddedDate</code> attribute. 
	 * @param value the cardAddedDate
	 */
	public void setCardAddedDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDADDEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardAddedDate</code> attribute. 
	 * @param value the cardAddedDate
	 */
	public void setCardAddedDate(final String value)
	{
		setCardAddedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardLasr4Digit</code> attribute.
	 * @return the cardLasr4Digit
	 */
	public String getCardLasr4Digit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDLASR4DIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardLasr4Digit</code> attribute.
	 * @return the cardLasr4Digit
	 */
	public String getCardLasr4Digit()
	{
		return getCardLasr4Digit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardLasr4Digit</code> attribute. 
	 * @param value the cardLasr4Digit
	 */
	public void setCardLasr4Digit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDLASR4DIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardLasr4Digit</code> attribute. 
	 * @param value the cardLasr4Digit
	 */
	public void setCardLasr4Digit(final String value)
	{
		setCardLasr4Digit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardSource</code> attribute.
	 * @return the cardSource
	 */
	public String getCardSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDSOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.cardSource</code> attribute.
	 * @return the cardSource
	 */
	public String getCardSource()
	{
		return getCardSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardSource</code> attribute. 
	 * @param value the cardSource
	 */
	public void setCardSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDSOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.cardSource</code> attribute. 
	 * @param value the cardSource
	 */
	public void setCardSource(final String value)
	{
		setCardSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.creditCardtoken</code> attribute.
	 * @return the creditCardtoken
	 */
	public String getCreditCardtoken(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDTOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.creditCardtoken</code> attribute.
	 * @return the creditCardtoken
	 */
	public String getCreditCardtoken()
	{
		return getCreditCardtoken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.creditCardtoken</code> attribute. 
	 * @param value the creditCardtoken
	 */
	public void setCreditCardtoken(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDTOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.creditCardtoken</code> attribute. 
	 * @param value the creditCardtoken
	 */
	public void setCreditCardtoken(final String value)
	{
		setCreditCardtoken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator()
	{
		return getIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final String value)
	{
		setIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.isRemember</code> attribute.
	 * @return the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public Boolean isIsRemember(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISREMEMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.isRemember</code> attribute.
	 * @return the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public Boolean isIsRemember()
	{
		return isIsRemember( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @return the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public boolean isIsRememberAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsRemember( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @return the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public boolean isIsRememberAsPrimitive()
	{
		return isIsRememberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @param value the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public void setIsRemember(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISREMEMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @param value the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public void setIsRemember(final Boolean value)
	{
		setIsRemember( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @param value the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public void setIsRemember(final SessionContext ctx, final boolean value)
	{
		setIsRemember( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.isRemember</code> attribute. 
	 * @param value the isRemember - This field is set when your check the box from the credit card pop up.
	 */
	public void setIsRemember(final boolean value)
	{
		setIsRemember( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTCreditCard.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId()
	{
		return getSourceId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTCreditCard.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final String value)
	{
		setSourceId( getSession().getSessionContext(), value );
	}
	
}
