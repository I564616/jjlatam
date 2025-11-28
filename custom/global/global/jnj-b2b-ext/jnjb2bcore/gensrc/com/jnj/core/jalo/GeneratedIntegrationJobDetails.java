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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IntegrationJobDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIntegrationJobDetails extends GenericItem
{
	/** Qualifier of the <code>IntegrationJobDetails.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>IntegrationJobDetails.jobCode</code> attribute **/
	public static final String JOBCODE = "jobCode";
	/** Qualifier of the <code>IntegrationJobDetails.sourceColumn</code> attribute **/
	public static final String SOURCECOLUMN = "sourceColumn";
	/** Qualifier of the <code>IntegrationJobDetails.targetModel</code> attribute **/
	public static final String TARGETMODEL = "targetModel";
	/** Qualifier of the <code>IntegrationJobDetails.targetColumn</code> attribute **/
	public static final String TARGETCOLUMN = "targetColumn";
	/** Qualifier of the <code>IntegrationJobDetails.partOfPrimary</code> attribute **/
	public static final String PARTOFPRIMARY = "partOfPrimary";
	/** Qualifier of the <code>IntegrationJobDetails.isWritable</code> attribute **/
	public static final String ISWRITABLE = "isWritable";
	/** Qualifier of the <code>IntegrationJobDetails.transType</code> attribute **/
	public static final String TRANSTYPE = "transType";
	/** Qualifier of the <code>IntegrationJobDetails.compositeType</code> attribute **/
	public static final String COMPOSITETYPE = "compositeType";
	/** Qualifier of the <code>IntegrationJobDetails.compositeTypeUID</code> attribute **/
	public static final String COMPOSITETYPEUID = "compositeTypeUID";
	/** Qualifier of the <code>IntegrationJobDetails.utilClassNamePath</code> attribute **/
	public static final String UTILCLASSNAMEPATH = "utilClassNamePath";
	/** Qualifier of the <code>IntegrationJobDetails.utilMethodName</code> attribute **/
	public static final String UTILMETHODNAME = "utilMethodName";
	/** Qualifier of the <code>IntegrationJobDetails.utilReturnType</code> attribute **/
	public static final String UTILRETURNTYPE = "utilReturnType";
	/** Qualifier of the <code>IntegrationJobDetails.utilMethodParam</code> attribute **/
	public static final String UTILMETHODPARAM = "utilMethodParam";
	/** Qualifier of the <code>IntegrationJobDetails.targetColumnFormat</code> attribute **/
	public static final String TARGETCOLUMNFORMAT = "targetColumnFormat";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(JOBCODE, AttributeMode.INITIAL);
		tmp.put(SOURCECOLUMN, AttributeMode.INITIAL);
		tmp.put(TARGETMODEL, AttributeMode.INITIAL);
		tmp.put(TARGETCOLUMN, AttributeMode.INITIAL);
		tmp.put(PARTOFPRIMARY, AttributeMode.INITIAL);
		tmp.put(ISWRITABLE, AttributeMode.INITIAL);
		tmp.put(TRANSTYPE, AttributeMode.INITIAL);
		tmp.put(COMPOSITETYPE, AttributeMode.INITIAL);
		tmp.put(COMPOSITETYPEUID, AttributeMode.INITIAL);
		tmp.put(UTILCLASSNAMEPATH, AttributeMode.INITIAL);
		tmp.put(UTILMETHODNAME, AttributeMode.INITIAL);
		tmp.put(UTILRETURNTYPE, AttributeMode.INITIAL);
		tmp.put(UTILMETHODPARAM, AttributeMode.INITIAL);
		tmp.put(TARGETCOLUMNFORMAT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.compositeType</code> attribute.
	 * @return the compositeType
	 */
	public String getCompositeType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPOSITETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.compositeType</code> attribute.
	 * @return the compositeType
	 */
	public String getCompositeType()
	{
		return getCompositeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.compositeType</code> attribute. 
	 * @param value the compositeType
	 */
	public void setCompositeType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPOSITETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.compositeType</code> attribute. 
	 * @param value the compositeType
	 */
	public void setCompositeType(final String value)
	{
		setCompositeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.compositeTypeUID</code> attribute.
	 * @return the compositeTypeUID
	 */
	public String getCompositeTypeUID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPOSITETYPEUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.compositeTypeUID</code> attribute.
	 * @return the compositeTypeUID
	 */
	public String getCompositeTypeUID()
	{
		return getCompositeTypeUID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.compositeTypeUID</code> attribute. 
	 * @param value the compositeTypeUID
	 */
	public void setCompositeTypeUID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPOSITETYPEUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.compositeTypeUID</code> attribute. 
	 * @param value the compositeTypeUID
	 */
	public void setCompositeTypeUID(final String value)
	{
		setCompositeTypeUID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.isWritable</code> attribute.
	 * @return the isWritable
	 */
	public Boolean isIsWritable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISWRITABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.isWritable</code> attribute.
	 * @return the isWritable
	 */
	public Boolean isIsWritable()
	{
		return isIsWritable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @return the isWritable
	 */
	public boolean isIsWritableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsWritable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @return the isWritable
	 */
	public boolean isIsWritableAsPrimitive()
	{
		return isIsWritableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @param value the isWritable
	 */
	public void setIsWritable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISWRITABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @param value the isWritable
	 */
	public void setIsWritable(final Boolean value)
	{
		setIsWritable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @param value the isWritable
	 */
	public void setIsWritable(final SessionContext ctx, final boolean value)
	{
		setIsWritable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.isWritable</code> attribute. 
	 * @param value the isWritable
	 */
	public void setIsWritable(final boolean value)
	{
		setIsWritable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.jobCode</code> attribute.
	 * @return the jobCode
	 */
	public String getJobCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.jobCode</code> attribute.
	 * @return the jobCode
	 */
	public String getJobCode()
	{
		return getJobCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.jobCode</code> attribute. 
	 * @param value the jobCode
	 */
	public void setJobCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.jobCode</code> attribute. 
	 * @param value the jobCode
	 */
	public void setJobCode(final String value)
	{
		setJobCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute.
	 * @return the partOfPrimary
	 */
	public Boolean isPartOfPrimary(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PARTOFPRIMARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute.
	 * @return the partOfPrimary
	 */
	public Boolean isPartOfPrimary()
	{
		return isPartOfPrimary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @return the partOfPrimary
	 */
	public boolean isPartOfPrimaryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPartOfPrimary( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @return the partOfPrimary
	 */
	public boolean isPartOfPrimaryAsPrimitive()
	{
		return isPartOfPrimaryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @param value the partOfPrimary
	 */
	public void setPartOfPrimary(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PARTOFPRIMARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @param value the partOfPrimary
	 */
	public void setPartOfPrimary(final Boolean value)
	{
		setPartOfPrimary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @param value the partOfPrimary
	 */
	public void setPartOfPrimary(final SessionContext ctx, final boolean value)
	{
		setPartOfPrimary( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.partOfPrimary</code> attribute. 
	 * @param value the partOfPrimary
	 */
	public void setPartOfPrimary(final boolean value)
	{
		setPartOfPrimary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.sourceColumn</code> attribute.
	 * @return the sourceColumn
	 */
	public String getSourceColumn(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCECOLUMN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.sourceColumn</code> attribute.
	 * @return the sourceColumn
	 */
	public String getSourceColumn()
	{
		return getSourceColumn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.sourceColumn</code> attribute. 
	 * @param value the sourceColumn
	 */
	public void setSourceColumn(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCECOLUMN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.sourceColumn</code> attribute. 
	 * @param value the sourceColumn
	 */
	public void setSourceColumn(final String value)
	{
		setSourceColumn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetColumn</code> attribute.
	 * @return the targetColumn
	 */
	public String getTargetColumn(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGETCOLUMN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetColumn</code> attribute.
	 * @return the targetColumn
	 */
	public String getTargetColumn()
	{
		return getTargetColumn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetColumn</code> attribute. 
	 * @param value the targetColumn
	 */
	public void setTargetColumn(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGETCOLUMN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetColumn</code> attribute. 
	 * @param value the targetColumn
	 */
	public void setTargetColumn(final String value)
	{
		setTargetColumn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetColumnFormat</code> attribute.
	 * @return the targetColumnFormat
	 */
	public EnumerationValue getTargetColumnFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TARGETCOLUMNFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetColumnFormat</code> attribute.
	 * @return the targetColumnFormat
	 */
	public EnumerationValue getTargetColumnFormat()
	{
		return getTargetColumnFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetColumnFormat</code> attribute. 
	 * @param value the targetColumnFormat
	 */
	public void setTargetColumnFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TARGETCOLUMNFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetColumnFormat</code> attribute. 
	 * @param value the targetColumnFormat
	 */
	public void setTargetColumnFormat(final EnumerationValue value)
	{
		setTargetColumnFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetModel</code> attribute.
	 * @return the targetModel
	 */
	public String getTargetModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGETMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.targetModel</code> attribute.
	 * @return the targetModel
	 */
	public String getTargetModel()
	{
		return getTargetModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetModel</code> attribute. 
	 * @param value the targetModel
	 */
	public void setTargetModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGETMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.targetModel</code> attribute. 
	 * @param value the targetModel
	 */
	public void setTargetModel(final String value)
	{
		setTargetModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.transType</code> attribute.
	 * @return the transType
	 */
	public EnumerationValue getTransType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.transType</code> attribute.
	 * @return the transType
	 */
	public EnumerationValue getTransType()
	{
		return getTransType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.transType</code> attribute. 
	 * @param value the transType
	 */
	public void setTransType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.transType</code> attribute. 
	 * @param value the transType
	 */
	public void setTransType(final EnumerationValue value)
	{
		setTransType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilClassNamePath</code> attribute.
	 * @return the utilClassNamePath
	 */
	public String getUtilClassNamePath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UTILCLASSNAMEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilClassNamePath</code> attribute.
	 * @return the utilClassNamePath
	 */
	public String getUtilClassNamePath()
	{
		return getUtilClassNamePath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilClassNamePath</code> attribute. 
	 * @param value the utilClassNamePath
	 */
	public void setUtilClassNamePath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UTILCLASSNAMEPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilClassNamePath</code> attribute. 
	 * @param value the utilClassNamePath
	 */
	public void setUtilClassNamePath(final String value)
	{
		setUtilClassNamePath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilMethodName</code> attribute.
	 * @return the utilMethodName
	 */
	public String getUtilMethodName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UTILMETHODNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilMethodName</code> attribute.
	 * @return the utilMethodName
	 */
	public String getUtilMethodName()
	{
		return getUtilMethodName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilMethodName</code> attribute. 
	 * @param value the utilMethodName
	 */
	public void setUtilMethodName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UTILMETHODNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilMethodName</code> attribute. 
	 * @param value the utilMethodName
	 */
	public void setUtilMethodName(final String value)
	{
		setUtilMethodName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilMethodParam</code> attribute.
	 * @return the utilMethodParam
	 */
	public String getUtilMethodParam(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UTILMETHODPARAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilMethodParam</code> attribute.
	 * @return the utilMethodParam
	 */
	public String getUtilMethodParam()
	{
		return getUtilMethodParam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilMethodParam</code> attribute. 
	 * @param value the utilMethodParam
	 */
	public void setUtilMethodParam(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UTILMETHODPARAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilMethodParam</code> attribute. 
	 * @param value the utilMethodParam
	 */
	public void setUtilMethodParam(final String value)
	{
		setUtilMethodParam( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilReturnType</code> attribute.
	 * @return the utilReturnType
	 */
	public String getUtilReturnType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UTILRETURNTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationJobDetails.utilReturnType</code> attribute.
	 * @return the utilReturnType
	 */
	public String getUtilReturnType()
	{
		return getUtilReturnType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilReturnType</code> attribute. 
	 * @param value the utilReturnType
	 */
	public void setUtilReturnType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UTILRETURNTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationJobDetails.utilReturnType</code> attribute. 
	 * @param value the utilReturnType
	 */
	public void setUtilReturnType(final String value)
	{
		setUtilReturnType( getSession().getSessionContext(), value );
	}
	
}
