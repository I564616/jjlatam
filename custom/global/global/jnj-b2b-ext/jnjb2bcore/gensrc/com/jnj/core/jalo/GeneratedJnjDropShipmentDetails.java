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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjDropShipmentDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjDropShipmentDetails extends GenericItem
{
	/** Qualifier of the <code>JnjDropShipmentDetails.materialId</code> attribute **/
	public static final String MATERIALID = "materialId";
	/** Qualifier of the <code>JnjDropShipmentDetails.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>JnjDropShipmentDetails.destinationCountry</code> attribute **/
	public static final String DESTINATIONCOUNTRY = "destinationCountry";
	/** Qualifier of the <code>JnjDropShipmentDetails.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>JnjDropShipmentDetails.soldTo</code> attribute **/
	public static final String SOLDTO = "soldTo";
	/** Qualifier of the <code>JnjDropShipmentDetails.shipTo</code> attribute **/
	public static final String SHIPTO = "shipTo";
	/** Qualifier of the <code>JnjDropShipmentDetails.timeCreated</code> attribute **/
	public static final String TIMECREATED = "timeCreated";
	/** Qualifier of the <code>JnjDropShipmentDetails.timeModified</code> attribute **/
	public static final String TIMEMODIFIED = "timeModified";
	/** Qualifier of the <code>JnjDropShipmentDetails.salesOrganization</code> attribute **/
	public static final String SALESORGANIZATION = "salesOrganization";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MATERIALID, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(DESTINATIONCOUNTRY, AttributeMode.INITIAL);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(SOLDTO, AttributeMode.INITIAL);
		tmp.put(SHIPTO, AttributeMode.INITIAL);
		tmp.put(TIMECREATED, AttributeMode.INITIAL);
		tmp.put(TIMEMODIFIED, AttributeMode.INITIAL);
		tmp.put(SALESORGANIZATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public String getDestinationCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESTINATIONCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public String getDestinationCountry()
	{
		return getDestinationCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESTINATIONCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final String value)
	{
		setDestinationCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final String value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.materialId</code> attribute.
	 * @return the materialId
	 */
	public String getMaterialId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.materialId</code> attribute.
	 * @return the materialId
	 */
	public String getMaterialId()
	{
		return getMaterialId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.materialId</code> attribute. 
	 * @param value the materialId
	 */
	public void setMaterialId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.materialId</code> attribute. 
	 * @param value the materialId
	 */
	public void setMaterialId(final String value)
	{
		setMaterialId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.salesOrganization</code> attribute.
	 * @return the salesOrganization
	 */
	public String getSalesOrganization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.salesOrganization</code> attribute.
	 * @return the salesOrganization
	 */
	public String getSalesOrganization()
	{
		return getSalesOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.salesOrganization</code> attribute. 
	 * @param value the salesOrganization
	 */
	public void setSalesOrganization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.salesOrganization</code> attribute. 
	 * @param value the salesOrganization
	 */
	public void setSalesOrganization(final String value)
	{
		setSalesOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.shipTo</code> attribute.
	 * @return the shipTo
	 */
	public String getShipTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.shipTo</code> attribute.
	 * @return the shipTo
	 */
	public String getShipTo()
	{
		return getShipTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.shipTo</code> attribute. 
	 * @param value the shipTo
	 */
	public void setShipTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.shipTo</code> attribute. 
	 * @param value the shipTo
	 */
	public void setShipTo(final String value)
	{
		setShipTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.soldTo</code> attribute.
	 * @return the soldTo
	 */
	public String getSoldTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOLDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.soldTo</code> attribute.
	 * @return the soldTo
	 */
	public String getSoldTo()
	{
		return getSoldTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.soldTo</code> attribute. 
	 * @param value the soldTo
	 */
	public void setSoldTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOLDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.soldTo</code> attribute. 
	 * @param value the soldTo
	 */
	public void setSoldTo(final String value)
	{
		setSoldTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.timeCreated</code> attribute.
	 * @return the timeCreated
	 */
	public Date getTimeCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMECREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.timeCreated</code> attribute.
	 * @return the timeCreated
	 */
	public Date getTimeCreated()
	{
		return getTimeCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.timeCreated</code> attribute. 
	 * @param value the timeCreated
	 */
	public void setTimeCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMECREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.timeCreated</code> attribute. 
	 * @param value the timeCreated
	 */
	public void setTimeCreated(final Date value)
	{
		setTimeCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.timeModified</code> attribute.
	 * @return the timeModified
	 */
	public Date getTimeModified(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMEMODIFIED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjDropShipmentDetails.timeModified</code> attribute.
	 * @return the timeModified
	 */
	public Date getTimeModified()
	{
		return getTimeModified( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.timeModified</code> attribute. 
	 * @param value the timeModified
	 */
	public void setTimeModified(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMEMODIFIED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjDropShipmentDetails.timeModified</code> attribute. 
	 * @param value the timeModified
	 */
	public void setTimeModified(final Date value)
	{
		setTimeModified( getSession().getSessionContext(), value );
	}
	
}
