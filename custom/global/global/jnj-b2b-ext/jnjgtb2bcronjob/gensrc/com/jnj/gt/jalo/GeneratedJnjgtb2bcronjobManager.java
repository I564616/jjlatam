/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTShipmentConfirmationEmailCronJob;
import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import com.jnj.gt.core.jalo.JnjInterfaceCronJob;
import com.jnj.gt.core.jalo.JnjInterfaceIntermediateCleanupCronJob;
import com.jnj.gt.job.JnjGTUserResetPwdCronJob;
import com.jnj.pcm.core.jalo.JnjPCMFullCatalogUploadCronJob;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Jnjgtb2bcronjobManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjgtb2bcronjobManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public JnjGTShipmentConfirmationEmailCronJob createJnjGTShipmentConfirmationEmailCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJGTSHIPMENTCONFIRMATIONEMAILCRONJOB );
			return (JnjGTShipmentConfirmationEmailCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTShipmentConfirmationEmailCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTShipmentConfirmationEmailCronJob createJnjGTShipmentConfirmationEmailCronJob(final Map attributeValues)
	{
		return createJnjGTShipmentConfirmationEmailCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTUserResetPwdCronJob createJnjGTUserResetPwdCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJGTUSERRESETPWDCRONJOB );
			return (JnjGTUserResetPwdCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjGTUserResetPwdCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTUserResetPwdCronJob createJnjGTUserResetPwdCronJob(final Map attributeValues)
	{
		return createJnjGTUserResetPwdCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjInterfaceCronJob createJnjInterfaceCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJINTERFACECRONJOB );
			return (JnjInterfaceCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjInterfaceCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjInterfaceCronJob createJnjInterfaceCronJob(final Map attributeValues)
	{
		return createJnjInterfaceCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjInterfaceIntermediateCleanupCronJob createJnjInterfaceIntermediateCleanupCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJINTERFACEINTERMEDIATECLEANUPCRONJOB );
			return (JnjInterfaceIntermediateCleanupCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjInterfaceIntermediateCleanupCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjInterfaceIntermediateCleanupCronJob createJnjInterfaceIntermediateCleanupCronJob(final Map attributeValues)
	{
		return createJnjInterfaceIntermediateCleanupCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjInterfaceIntermediateCleanupCronJob createJnjInterfaceStageCleanupCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJINTERFACESTAGECLEANUPCRONJOB );
			return (JnjInterfaceIntermediateCleanupCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjInterfaceStageCleanupCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjInterfaceIntermediateCleanupCronJob createJnjInterfaceStageCleanupCronJob(final Map attributeValues)
	{
		return createJnjInterfaceStageCleanupCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjPCMFullCatalogUploadCronJob createJnjPCMFullCatalogUploadCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2bcronjobConstants.TC.JNJPCMFULLCATALOGUPLOADCRONJOB );
			return (JnjPCMFullCatalogUploadCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating JnjPCMFullCatalogUploadCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public JnjPCMFullCatalogUploadCronJob createJnjPCMFullCatalogUploadCronJob(final Map attributeValues)
	{
		return createJnjPCMFullCatalogUploadCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Jnjgtb2bcronjobConstants.EXTENSIONNAME;
	}
	
}
