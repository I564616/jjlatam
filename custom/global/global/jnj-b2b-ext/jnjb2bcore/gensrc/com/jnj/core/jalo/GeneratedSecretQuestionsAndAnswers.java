/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 8:59:37 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SecretQuestionsAndAnswers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSecretQuestionsAndAnswers extends GenericItem
{
	/** Qualifier of the <code>SecretQuestionsAndAnswers.questionId</code> attribute **/
	public static final String QUESTIONID = "questionId";
	/** Qualifier of the <code>SecretQuestionsAndAnswers.answer</code> attribute **/
	public static final String ANSWER = "answer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(QUESTIONID, AttributeMode.INITIAL);
		tmp.put(ANSWER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecretQuestionsAndAnswers.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ANSWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecretQuestionsAndAnswers.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer()
	{
		return getAnswer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecretQuestionsAndAnswers.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ANSWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecretQuestionsAndAnswers.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final String value)
	{
		setAnswer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecretQuestionsAndAnswers.questionId</code> attribute.
	 * @return the questionId
	 */
	public String getQuestionId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUESTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecretQuestionsAndAnswers.questionId</code> attribute.
	 * @return the questionId
	 */
	public String getQuestionId()
	{
		return getQuestionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecretQuestionsAndAnswers.questionId</code> attribute. 
	 * @param value the questionId
	 */
	public void setQuestionId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUESTIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecretQuestionsAndAnswers.questionId</code> attribute. 
	 * @param value the questionId
	 */
	public void setQuestionId(final String value)
	{
		setQuestionId( getSession().getSessionContext(), value );
	}
	
}
