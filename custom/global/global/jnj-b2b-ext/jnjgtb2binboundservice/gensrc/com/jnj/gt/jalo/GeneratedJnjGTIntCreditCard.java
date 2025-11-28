/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntCreditCard}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntCreditCard extends JnjGTIntermediateMaster
{
	/** Qualifier of the <code>JnjGTIntCreditCard.sourceId</code> attribute **/
	public static final String SOURCEID = "sourceId";
	/** Qualifier of the <code>JnjGTIntCreditCard.buisnessSector</code> attribute **/
	public static final String BUISNESSSECTOR = "buisnessSector";
	/** Qualifier of the <code>JnjGTIntCreditCard.recTimeStamp</code> attribute **/
	public static final String RECTIMESTAMP = "recTimeStamp";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardSource</code> attribute **/
	public static final String CARDSOURCE = "cardSource";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardSequenceNumber</code> attribute **/
	public static final String CARDSEQUENCENUMBER = "cardSequenceNumber";
	/** Qualifier of the <code>JnjGTIntCreditCard.shipToAccountNumer</code> attribute **/
	public static final String SHIPTOACCOUNTNUMER = "shipToAccountNumer";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardNumber</code> attribute **/
	public static final String CARDNUMBER = "cardNumber";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardLasr4Digit</code> attribute **/
	public static final String CARDLASR4DIGIT = "cardLasr4Digit";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardExpiryMonth</code> attribute **/
	public static final String CARDEXPIRYMONTH = "cardExpiryMonth";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardExpiryYear</code> attribute **/
	public static final String CARDEXPIRYYEAR = "cardExpiryYear";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>JnjGTIntCreditCard.userId</code> attribute **/
	public static final String USERID = "userId";
	/** Qualifier of the <code>JnjGTIntCreditCard.indicator</code> attribute **/
	public static final String INDICATOR = "indicator";
	/** Qualifier of the <code>JnjGTIntCreditCard.cardAddedDate</code> attribute **/
	public static final String CARDADDEDDATE = "cardAddedDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JnjGTIntermediateMaster.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOURCEID, AttributeMode.INITIAL);
		tmp.put(BUISNESSSECTOR, AttributeMode.INITIAL);
		tmp.put(RECTIMESTAMP, AttributeMode.INITIAL);
		tmp.put(CARDSOURCE, AttributeMode.INITIAL);
		tmp.put(CARDSEQUENCENUMBER, AttributeMode.INITIAL);
		tmp.put(SHIPTOACCOUNTNUMER, AttributeMode.INITIAL);
		tmp.put(CARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDLASR4DIGIT, AttributeMode.INITIAL);
		tmp.put(CARDEXPIRYMONTH, AttributeMode.INITIAL);
		tmp.put(CARDEXPIRYYEAR, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		tmp.put(INDICATOR, AttributeMode.INITIAL);
		tmp.put(CARDADDEDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUISNESSSECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.buisnessSector</code> attribute.
	 * @return the buisnessSector
	 */
	public String getBuisnessSector()
	{
		return getBuisnessSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUISNESSSECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.buisnessSector</code> attribute. 
	 * @param value the buisnessSector
	 */
	public void setBuisnessSector(final String value)
	{
		setBuisnessSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardAddedDate</code> attribute.
	 * @return the cardAddedDate
	 */
	public String getCardAddedDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDADDEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardAddedDate</code> attribute.
	 * @return the cardAddedDate
	 */
	public String getCardAddedDate()
	{
		return getCardAddedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardAddedDate</code> attribute. 
	 * @param value the cardAddedDate
	 */
	public void setCardAddedDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDADDEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardAddedDate</code> attribute. 
	 * @param value the cardAddedDate
	 */
	public void setCardAddedDate(final String value)
	{
		setCardAddedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardExpiryMonth</code> attribute.
	 * @return the cardExpiryMonth
	 */
	public String getCardExpiryMonth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDEXPIRYMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardExpiryMonth</code> attribute.
	 * @return the cardExpiryMonth
	 */
	public String getCardExpiryMonth()
	{
		return getCardExpiryMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardExpiryMonth</code> attribute. 
	 * @param value the cardExpiryMonth
	 */
	public void setCardExpiryMonth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDEXPIRYMONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardExpiryMonth</code> attribute. 
	 * @param value the cardExpiryMonth
	 */
	public void setCardExpiryMonth(final String value)
	{
		setCardExpiryMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardExpiryYear</code> attribute.
	 * @return the cardExpiryYear
	 */
	public String getCardExpiryYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDEXPIRYYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardExpiryYear</code> attribute.
	 * @return the cardExpiryYear
	 */
	public String getCardExpiryYear()
	{
		return getCardExpiryYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardExpiryYear</code> attribute. 
	 * @param value the cardExpiryYear
	 */
	public void setCardExpiryYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDEXPIRYYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardExpiryYear</code> attribute. 
	 * @param value the cardExpiryYear
	 */
	public void setCardExpiryYear(final String value)
	{
		setCardExpiryYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardLasr4Digit</code> attribute.
	 * @return the cardLasr4Digit
	 */
	public String getCardLasr4Digit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDLASR4DIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardLasr4Digit</code> attribute.
	 * @return the cardLasr4Digit
	 */
	public String getCardLasr4Digit()
	{
		return getCardLasr4Digit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardLasr4Digit</code> attribute. 
	 * @param value the cardLasr4Digit
	 */
	public void setCardLasr4Digit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDLASR4DIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardLasr4Digit</code> attribute. 
	 * @param value the cardLasr4Digit
	 */
	public void setCardLasr4Digit(final String value)
	{
		setCardLasr4Digit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return getCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final String value)
	{
		setCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardSequenceNumber</code> attribute.
	 * @return the cardSequenceNumber
	 */
	public String getCardSequenceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDSEQUENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardSequenceNumber</code> attribute.
	 * @return the cardSequenceNumber
	 */
	public String getCardSequenceNumber()
	{
		return getCardSequenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardSequenceNumber</code> attribute. 
	 * @param value the cardSequenceNumber
	 */
	public void setCardSequenceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDSEQUENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardSequenceNumber</code> attribute. 
	 * @param value the cardSequenceNumber
	 */
	public void setCardSequenceNumber(final String value)
	{
		setCardSequenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardSource</code> attribute.
	 * @return the cardSource
	 */
	public String getCardSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDSOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardSource</code> attribute.
	 * @return the cardSource
	 */
	public String getCardSource()
	{
		return getCardSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardSource</code> attribute. 
	 * @param value the cardSource
	 */
	public void setCardSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDSOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardSource</code> attribute. 
	 * @param value the cardSource
	 */
	public void setCardSource(final String value)
	{
		setCardSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardType</code> attribute.
	 * @return the cardType
	 */
	public String getCardType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.cardType</code> attribute.
	 * @return the cardType
	 */
	public String getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final String value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.indicator</code> attribute.
	 * @return the indicator
	 */
	public String getIndicator()
	{
		return getIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.indicator</code> attribute. 
	 * @param value the indicator
	 */
	public void setIndicator(final String value)
	{
		setIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RECTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.recTimeStamp</code> attribute.
	 * @return the recTimeStamp
	 */
	public Date getRecTimeStamp()
	{
		return getRecTimeStamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RECTIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.recTimeStamp</code> attribute. 
	 * @param value the recTimeStamp
	 */
	public void setRecTimeStamp(final Date value)
	{
		setRecTimeStamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.shipToAccountNumer</code> attribute.
	 * @return the shipToAccountNumer
	 */
	public String getShipToAccountNumer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTOACCOUNTNUMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.shipToAccountNumer</code> attribute.
	 * @return the shipToAccountNumer
	 */
	public String getShipToAccountNumer()
	{
		return getShipToAccountNumer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.shipToAccountNumer</code> attribute. 
	 * @param value the shipToAccountNumer
	 */
	public void setShipToAccountNumer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTOACCOUNTNUMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.shipToAccountNumer</code> attribute. 
	 * @param value the shipToAccountNumer
	 */
	public void setShipToAccountNumer(final String value)
	{
		setShipToAccountNumer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.sourceId</code> attribute.
	 * @return the sourceId
	 */
	public String getSourceId()
	{
		return getSourceId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.sourceId</code> attribute. 
	 * @param value the sourceId
	 */
	public void setSourceId(final String value)
	{
		setSourceId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntCreditCard.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId()
	{
		return getUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntCreditCard.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final String value)
	{
		setUserId( getSession().getSessionContext(), value );
	}
	
}
