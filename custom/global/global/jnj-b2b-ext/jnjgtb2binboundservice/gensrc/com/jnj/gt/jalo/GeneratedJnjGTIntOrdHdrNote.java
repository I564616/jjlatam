/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTIntOrdHdrNote}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTIntOrdHdrNote extends GenericItem
{
	/** Qualifier of the <code>JnjGTIntOrdHdrNote.sapOrderNumber</code> attribute **/
	public static final String SAPORDERNUMBER = "sapOrderNumber";
	/** Qualifier of the <code>JnjGTIntOrdHdrNote.sourceSystemId</code> attribute **/
	public static final String SOURCESYSTEMID = "sourceSystemId";
	/** Qualifier of the <code>JnjGTIntOrdHdrNote.hdrNoteCode</code> attribute **/
	public static final String HDRNOTECODE = "hdrNoteCode";
	/** Qualifier of the <code>JnjGTIntOrdHdrNote.hdrNotes</code> attribute **/
	public static final String HDRNOTES = "hdrNotes";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SAPORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(SOURCESYSTEMID, AttributeMode.INITIAL);
		tmp.put(HDRNOTECODE, AttributeMode.INITIAL);
		tmp.put(HDRNOTES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.hdrNoteCode</code> attribute.
	 * @return the hdrNoteCode
	 */
	public String getHdrNoteCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HDRNOTECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.hdrNoteCode</code> attribute.
	 * @return the hdrNoteCode
	 */
	public String getHdrNoteCode()
	{
		return getHdrNoteCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.hdrNoteCode</code> attribute. 
	 * @param value the hdrNoteCode
	 */
	public void setHdrNoteCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HDRNOTECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.hdrNoteCode</code> attribute. 
	 * @param value the hdrNoteCode
	 */
	public void setHdrNoteCode(final String value)
	{
		setHdrNoteCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.hdrNotes</code> attribute.
	 * @return the hdrNotes
	 */
	public String getHdrNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HDRNOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.hdrNotes</code> attribute.
	 * @return the hdrNotes
	 */
	public String getHdrNotes()
	{
		return getHdrNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.hdrNotes</code> attribute. 
	 * @param value the hdrNotes
	 */
	public void setHdrNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HDRNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.hdrNotes</code> attribute. 
	 * @param value the hdrNotes
	 */
	public void setHdrNotes(final String value)
	{
		setHdrNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.sapOrderNumber</code> attribute.
	 * @return the sapOrderNumber
	 */
	public String getSapOrderNumber()
	{
		return getSapOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.sapOrderNumber</code> attribute. 
	 * @param value the sapOrderNumber
	 */
	public void setSapOrderNumber(final String value)
	{
		setSapOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCESYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTIntOrdHdrNote.sourceSystemId</code> attribute.
	 * @return the sourceSystemId
	 */
	public String getSourceSystemId()
	{
		return getSourceSystemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCESYSTEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTIntOrdHdrNote.sourceSystemId</code> attribute. 
	 * @param value the sourceSystemId
	 */
	public void setSourceSystemId(final String value)
	{
		setSourceSystemId( getSession().getSessionContext(), value );
	}
	
}
