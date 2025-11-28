/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.core.jalo;

import com.jnj.gt.constants.Jnjgtb2bcronjobConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.gt.core.jalo.JnjInterfaceCronJob JnjInterfaceCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjInterfaceCronJob extends CronJob
{
	/** Qualifier of the <code>JnjInterfaceCronJob.impexFile</code> attribute **/
	public static final String IMPEXFILE = "impexFile";
	/** Qualifier of the <code>JnjInterfaceCronJob.facadeBean</code> attribute **/
	public static final String FACADEBEAN = "facadeBean";
	/** Qualifier of the <code>JnjInterfaceCronJob.recordsLoadingStatus</code> attribute **/
	public static final String RECORDSLOADINGSTATUS = "recordsLoadingStatus";
	/** Qualifier of the <code>JnjInterfaceCronJob.associatedStgTables</code> attribute **/
	public static final String ASSOCIATEDSTGTABLES = "associatedStgTables";
	/** Qualifier of the <code>JnjInterfaceCronJob.sourceSysIds</code> attribute **/
	public static final String SOURCESYSIDS = "sourceSysIds";
	/** Qualifier of the <code>JnjInterfaceCronJob.impexFiles</code> attribute **/
	public static final String IMPEXFILES = "impexFiles";
	/** Qualifier of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute **/
	public static final String NUMBEROFTHREADS = "numberOfThreads";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(IMPEXFILE, AttributeMode.INITIAL);
		tmp.put(FACADEBEAN, AttributeMode.INITIAL);
		tmp.put(RECORDSLOADINGSTATUS, AttributeMode.INITIAL);
		tmp.put(ASSOCIATEDSTGTABLES, AttributeMode.INITIAL);
		tmp.put(SOURCESYSIDS, AttributeMode.INITIAL);
		tmp.put(IMPEXFILES, AttributeMode.INITIAL);
		tmp.put(NUMBEROFTHREADS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.associatedStgTables</code> attribute.
	 * @return the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public List<String> getAssociatedStgTables(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, ASSOCIATEDSTGTABLES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.associatedStgTables</code> attribute.
	 * @return the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public List<String> getAssociatedStgTables()
	{
		return getAssociatedStgTables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.associatedStgTables</code> attribute. 
	 * @param value the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public void setAssociatedStgTables(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, ASSOCIATEDSTGTABLES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.associatedStgTables</code> attribute. 
	 * @param value the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public void setAssociatedStgTables(final List<String> value)
	{
		setAssociatedStgTables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.facadeBean</code> attribute.
	 * @return the facadeBean
	 */
	public String getFacadeBean(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FACADEBEAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.facadeBean</code> attribute.
	 * @return the facadeBean
	 */
	public String getFacadeBean()
	{
		return getFacadeBean( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.facadeBean</code> attribute. 
	 * @param value the facadeBean
	 */
	public void setFacadeBean(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FACADEBEAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.facadeBean</code> attribute. 
	 * @param value the facadeBean
	 */
	public void setFacadeBean(final String value)
	{
		setFacadeBean( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.impexFile</code> attribute.
	 * @return the impexFile
	 */
	public String getImpexFile(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IMPEXFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.impexFile</code> attribute.
	 * @return the impexFile
	 */
	public String getImpexFile()
	{
		return getImpexFile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.impexFile</code> attribute. 
	 * @param value the impexFile
	 */
	public void setImpexFile(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IMPEXFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.impexFile</code> attribute. 
	 * @param value the impexFile
	 */
	public void setImpexFile(final String value)
	{
		setImpexFile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.impexFiles</code> attribute.
	 * @return the impexFiles - This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public List<String> getImpexFiles(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, IMPEXFILES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.impexFiles</code> attribute.
	 * @return the impexFiles - This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public List<String> getImpexFiles()
	{
		return getImpexFiles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.impexFiles</code> attribute. 
	 * @param value the impexFiles - This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public void setImpexFiles(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, IMPEXFILES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.impexFiles</code> attribute. 
	 * @param value the impexFiles - This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public void setImpexFiles(final List<String> value)
	{
		setImpexFiles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute.
	 * @return the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public Integer getNumberOfThreads(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFTHREADS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute.
	 * @return the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public Integer getNumberOfThreads()
	{
		return getNumberOfThreads( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @return the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public int getNumberOfThreadsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfThreads( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @return the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public int getNumberOfThreadsAsPrimitive()
	{
		return getNumberOfThreadsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @param value the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public void setNumberOfThreads(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFTHREADS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @param value the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public void setNumberOfThreads(final Integer value)
	{
		setNumberOfThreads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @param value the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public void setNumberOfThreads(final SessionContext ctx, final int value)
	{
		setNumberOfThreads( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.numberOfThreads</code> attribute. 
	 * @param value the numberOfThreads - This parameter is only applicable for the Jobs that run multi-threaded Order Processing Facade JnjGTIntMultiThreadFacade
	 */
	public void setNumberOfThreads(final int value)
	{
		setNumberOfThreads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.recordsLoadingStatus</code> attribute.
	 * @return the recordsLoadingStatus
	 */
	public EnumerationValue getRecordsLoadingStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECORDSLOADINGSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.recordsLoadingStatus</code> attribute.
	 * @return the recordsLoadingStatus
	 */
	public EnumerationValue getRecordsLoadingStatus()
	{
		return getRecordsLoadingStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.recordsLoadingStatus</code> attribute. 
	 * @param value the recordsLoadingStatus
	 */
	public void setRecordsLoadingStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECORDSLOADINGSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.recordsLoadingStatus</code> attribute. 
	 * @param value the recordsLoadingStatus
	 */
	public void setRecordsLoadingStatus(final EnumerationValue value)
	{
		setRecordsLoadingStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.sourceSysIds</code> attribute.
	 * @return the sourceSysIds - Job will process only the orders for given source system id. This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public List<String> getSourceSysIds(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, SOURCESYSIDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjInterfaceCronJob.sourceSysIds</code> attribute.
	 * @return the sourceSysIds - Job will process only the orders for given source system id. This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public List<String> getSourceSysIds()
	{
		return getSourceSysIds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.sourceSysIds</code> attribute. 
	 * @param value the sourceSysIds - Job will process only the orders for given source system id. This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public void setSourceSysIds(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, SOURCESYSIDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjInterfaceCronJob.sourceSysIds</code> attribute. 
	 * @param value the sourceSysIds - Job will process only the orders for given source system id. This parameter is only applicable for the JnjGTFeedMultiThreadMDDJob Job
	 */
	public void setSourceSysIds(final List<String> value)
	{
		setSourceSysIds( getSession().getSessionContext(), value );
	}
	
}
