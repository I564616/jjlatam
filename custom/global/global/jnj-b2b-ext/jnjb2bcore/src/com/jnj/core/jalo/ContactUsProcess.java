package com.jnj.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;

import org.apache.log4j.Logger;


public class ContactUsProcess extends GeneratedContactUsProcess
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger(ContactUsProcess.class.getName());

	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes)
			throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem(ctx, type, allAttributes);
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#getEmailBody(de.hybris.platform.jalo.SessionContext)
	 */
	@Override
	public String getEmailBody(final SessionContext ctx)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#setEmailBody(de.hybris.platform.jalo.SessionContext,
	 * java.lang.String)
	 */
	@Override
	public void setEmailBody(final SessionContext ctx, final String value)
	{
		// YTODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#getEmailSubject(de.hybris.platform.jalo.SessionContext)
	 */
	@Override
	public String getEmailSubject(final SessionContext ctx)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#setEmailSubject(de.hybris.platform.jalo.SessionContext,
	 * java.lang.String)
	 */
	@Override
	public void setEmailSubject(final SessionContext ctx, final String value)
	{
		// YTODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#getToEmailAddress(de.hybris.platform.jalo.SessionContext)
	 */
	@Override
	public String getToEmailAddress(final SessionContext ctx)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#setToEmailAddress(de.hybris.platform.jalo.SessionContext,
	 * java.lang.String)
	 */
	@Override
	public void setToEmailAddress(final SessionContext ctx, final String value)
	{
		// YTODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#getEmailOrderId(de.hybris.platform.jalo.SessionContext)
	 */
	@Override
	public String getEmailOrderId(final SessionContext ctx)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jnj.core.jalo.GeneratedContactUsProcess#setEmailOrderId(de.hybris.platform.jalo.SessionContext,
	 * java.lang.String)
	 */
	@Override
	public void setEmailOrderId(final SessionContext ctx, final String value)
	{
		// YTODO Auto-generated method stub

	}

}
