/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package com.jnj.core.jalo;

import org.apache.log4j.Logger;

import com.jnj.b2b.core.jalo.GeneratedMultipleCatalogsSyncCronJob;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.Item.ItemAttributeMap;
import de.hybris.platform.jalo.type.ComposedType;


public class MultipleCatalogsSyncCronJob extends GeneratedMultipleCatalogsSyncCronJob
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger( OldPassword.class.getName() );
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem( ctx, type, allAttributes );
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}
}
	