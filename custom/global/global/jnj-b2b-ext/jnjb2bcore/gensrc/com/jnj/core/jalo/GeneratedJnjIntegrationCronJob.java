/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 5:16:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.core.jalo;

import com.jnj.core.constants.Jnjb2bCoreConstants;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.jnj.core.jalo.JnjIntegrationCronJob JnjIntegrationCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjIntegrationCronJob extends CronJob
{
	/** Qualifier of the <code>JnjIntegrationCronJob.jobCode</code> attribute **/
	public static final String JOBCODE = "jobCode";
	/** Qualifier of the <code>JnjIntegrationCronJob.jobDescription</code> attribute **/
	public static final String JOBDESCRIPTION = "jobDescription";
	/** Qualifier of the <code>JnjIntegrationCronJob.targetModel</code> attribute **/
	public static final String TARGETMODEL = "targetModel";
	/** Qualifier of the <code>JnjIntegrationCronJob.stagingTables</code> attribute **/
	public static final String STAGINGTABLES = "stagingTables";
	/** Qualifier of the <code>JnjIntegrationCronJob.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>JnjIntegrationCronJob.whereCondition</code> attribute **/
	public static final String WHERECONDITION = "whereCondition";
	/** Qualifier of the <code>JnjIntegrationCronJob.rootCategory</code> attribute **/
	public static final String ROOTCATEGORY = "rootCategory";
	/** Qualifier of the <code>JnjIntegrationCronJob.cronJobQuery</code> attribute **/
	public static final String CRONJOBQUERY = "cronJobQuery";
	/** Qualifier of the <code>JnjIntegrationCronJob.associatedStgTables</code> attribute **/
	public static final String ASSOCIATEDSTGTABLES = "associatedStgTables";
	/** Qualifier of the <code>JnjIntegrationCronJob.keyToCollect</code> attribute **/
	public static final String KEYTOCOLLECT = "keyToCollect";
	/** Qualifier of the <code>JnjIntegrationCronJob.postProcessingClassName</code> attribute **/
	public static final String POSTPROCESSINGCLASSNAME = "postProcessingClassName";
	/** Qualifier of the <code>JnjIntegrationCronJob.postProcessingMethodName</code> attribute **/
	public static final String POSTPROCESSINGMETHODNAME = "postProcessingMethodName";
	/** Qualifier of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute **/
	public static final String UPDATEMIGRATIONSTATUSREQUIRED = "updateMigrationStatusRequired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JOBCODE, AttributeMode.INITIAL);
		tmp.put(JOBDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(TARGETMODEL, AttributeMode.INITIAL);
		tmp.put(STAGINGTABLES, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(WHERECONDITION, AttributeMode.INITIAL);
		tmp.put(ROOTCATEGORY, AttributeMode.INITIAL);
		tmp.put(CRONJOBQUERY, AttributeMode.INITIAL);
		tmp.put(ASSOCIATEDSTGTABLES, AttributeMode.INITIAL);
		tmp.put(KEYTOCOLLECT, AttributeMode.INITIAL);
		tmp.put(POSTPROCESSINGCLASSNAME, AttributeMode.INITIAL);
		tmp.put(POSTPROCESSINGMETHODNAME, AttributeMode.INITIAL);
		tmp.put(UPDATEMIGRATIONSTATUSREQUIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.associatedStgTables</code> attribute.
	 * @return the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public List<String> getAssociatedStgTables(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, ASSOCIATEDSTGTABLES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.associatedStgTables</code> attribute.
	 * @return the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public List<String> getAssociatedStgTables()
	{
		return getAssociatedStgTables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.associatedStgTables</code> attribute. 
	 * @param value the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public void setAssociatedStgTables(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, ASSOCIATEDSTGTABLES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.associatedStgTables</code> attribute. 
	 * @param value the associatedStgTables - Read status will be updated in tables given in this colln after corresponding operation
	 */
	public void setAssociatedStgTables(final List<String> value)
	{
		setAssociatedStgTables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.cronJobQuery</code> attribute.
	 * @return the cronJobQuery
	 */
	public String getCronJobQuery(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CRONJOBQUERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.cronJobQuery</code> attribute.
	 * @return the cronJobQuery
	 */
	public String getCronJobQuery()
	{
		return getCronJobQuery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.cronJobQuery</code> attribute. 
	 * @param value the cronJobQuery
	 */
	public void setCronJobQuery(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CRONJOBQUERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.cronJobQuery</code> attribute. 
	 * @param value the cronJobQuery
	 */
	public void setCronJobQuery(final String value)
	{
		setCronJobQuery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.jobCode</code> attribute.
	 * @return the jobCode
	 */
	public String getJobCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.jobCode</code> attribute.
	 * @return the jobCode
	 */
	public String getJobCode()
	{
		return getJobCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.jobCode</code> attribute. 
	 * @param value the jobCode
	 */
	public void setJobCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.jobCode</code> attribute. 
	 * @param value the jobCode
	 */
	public void setJobCode(final String value)
	{
		setJobCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.jobDescription</code> attribute.
	 * @return the jobDescription
	 */
	public String getJobDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.jobDescription</code> attribute.
	 * @return the jobDescription
	 */
	public String getJobDescription()
	{
		return getJobDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.jobDescription</code> attribute. 
	 * @param value the jobDescription
	 */
	public void setJobDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.jobDescription</code> attribute. 
	 * @param value the jobDescription
	 */
	public void setJobDescription(final String value)
	{
		setJobDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.keyToCollect</code> attribute.
	 * @return the keyToCollect
	 */
	public String getKeyToCollect(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KEYTOCOLLECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.keyToCollect</code> attribute.
	 * @return the keyToCollect
	 */
	public String getKeyToCollect()
	{
		return getKeyToCollect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.keyToCollect</code> attribute. 
	 * @param value the keyToCollect
	 */
	public void setKeyToCollect(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KEYTOCOLLECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.keyToCollect</code> attribute. 
	 * @param value the keyToCollect
	 */
	public void setKeyToCollect(final String value)
	{
		setKeyToCollect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.postProcessingClassName</code> attribute.
	 * @return the postProcessingClassName
	 */
	public String getPostProcessingClassName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTPROCESSINGCLASSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.postProcessingClassName</code> attribute.
	 * @return the postProcessingClassName
	 */
	public String getPostProcessingClassName()
	{
		return getPostProcessingClassName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.postProcessingClassName</code> attribute. 
	 * @param value the postProcessingClassName
	 */
	public void setPostProcessingClassName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTPROCESSINGCLASSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.postProcessingClassName</code> attribute. 
	 * @param value the postProcessingClassName
	 */
	public void setPostProcessingClassName(final String value)
	{
		setPostProcessingClassName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.postProcessingMethodName</code> attribute.
	 * @return the postProcessingMethodName
	 */
	public String getPostProcessingMethodName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTPROCESSINGMETHODNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.postProcessingMethodName</code> attribute.
	 * @return the postProcessingMethodName
	 */
	public String getPostProcessingMethodName()
	{
		return getPostProcessingMethodName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.postProcessingMethodName</code> attribute. 
	 * @param value the postProcessingMethodName
	 */
	public void setPostProcessingMethodName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTPROCESSINGMETHODNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.postProcessingMethodName</code> attribute. 
	 * @param value the postProcessingMethodName
	 */
	public void setPostProcessingMethodName(final String value)
	{
		setPostProcessingMethodName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.rootCategory</code> attribute.
	 * @return the rootCategory
	 */
	public Category getRootCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, ROOTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.rootCategory</code> attribute.
	 * @return the rootCategory
	 */
	public Category getRootCategory()
	{
		return getRootCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.rootCategory</code> attribute. 
	 * @param value the rootCategory
	 */
	public void setRootCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, ROOTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.rootCategory</code> attribute. 
	 * @param value the rootCategory
	 */
	public void setRootCategory(final Category value)
	{
		setRootCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.stagingTables</code> attribute.
	 * @return the stagingTables
	 */
	public String getStagingTables(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STAGINGTABLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.stagingTables</code> attribute.
	 * @return the stagingTables
	 */
	public String getStagingTables()
	{
		return getStagingTables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.stagingTables</code> attribute. 
	 * @param value the stagingTables
	 */
	public void setStagingTables(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STAGINGTABLES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.stagingTables</code> attribute. 
	 * @param value the stagingTables
	 */
	public void setStagingTables(final String value)
	{
		setStagingTables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.targetModel</code> attribute.
	 * @return the targetModel
	 */
	public String getTargetModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGETMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.targetModel</code> attribute.
	 * @return the targetModel
	 */
	public String getTargetModel()
	{
		return getTargetModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.targetModel</code> attribute. 
	 * @param value the targetModel
	 */
	public void setTargetModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGETMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.targetModel</code> attribute. 
	 * @param value the targetModel
	 */
	public void setTargetModel(final String value)
	{
		setTargetModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute.
	 * @return the updateMigrationStatusRequired
	 */
	public Boolean isUpdateMigrationStatusRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UPDATEMIGRATIONSTATUSREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute.
	 * @return the updateMigrationStatusRequired
	 */
	public Boolean isUpdateMigrationStatusRequired()
	{
		return isUpdateMigrationStatusRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @return the updateMigrationStatusRequired
	 */
	public boolean isUpdateMigrationStatusRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUpdateMigrationStatusRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @return the updateMigrationStatusRequired
	 */
	public boolean isUpdateMigrationStatusRequiredAsPrimitive()
	{
		return isUpdateMigrationStatusRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @param value the updateMigrationStatusRequired
	 */
	public void setUpdateMigrationStatusRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UPDATEMIGRATIONSTATUSREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @param value the updateMigrationStatusRequired
	 */
	public void setUpdateMigrationStatusRequired(final Boolean value)
	{
		setUpdateMigrationStatusRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @param value the updateMigrationStatusRequired
	 */
	public void setUpdateMigrationStatusRequired(final SessionContext ctx, final boolean value)
	{
		setUpdateMigrationStatusRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.updateMigrationStatusRequired</code> attribute. 
	 * @param value the updateMigrationStatusRequired
	 */
	public void setUpdateMigrationStatusRequired(final boolean value)
	{
		setUpdateMigrationStatusRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.whereCondition</code> attribute.
	 * @return the whereCondition
	 */
	public String getWhereCondition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WHERECONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjIntegrationCronJob.whereCondition</code> attribute.
	 * @return the whereCondition
	 */
	public String getWhereCondition()
	{
		return getWhereCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.whereCondition</code> attribute. 
	 * @param value the whereCondition
	 */
	public void setWhereCondition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WHERECONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjIntegrationCronJob.whereCondition</code> attribute. 
	 * @param value the whereCondition
	 */
	public void setWhereCondition(final String value)
	{
		setWhereCondition( getSession().getSessionContext(), value );
	}
	
}
