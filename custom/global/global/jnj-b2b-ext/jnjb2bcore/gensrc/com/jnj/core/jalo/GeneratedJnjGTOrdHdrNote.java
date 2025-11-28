/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem JnjGTOrdHdrNote}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjGTOrdHdrNote extends GenericItem
{
	/** Qualifier of the <code>JnjGTOrdHdrNote.hdrNoteCode</code> attribute **/
	public static final String HDRNOTECODE = "hdrNoteCode";
	/** Qualifier of the <code>JnjGTOrdHdrNote.hdrNotes</code> attribute **/
	public static final String HDRNOTES = "hdrNotes";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
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
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdHdrNote.hdrNoteCode</code> attribute.
	 * @return the hdrNoteCode
	 */
	public String getHdrNoteCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HDRNOTECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdHdrNote.hdrNoteCode</code> attribute.
	 * @return the hdrNoteCode
	 */
	public String getHdrNoteCode()
	{
		return getHdrNoteCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdHdrNote.hdrNoteCode</code> attribute. 
	 * @param value the hdrNoteCode
	 */
	public void setHdrNoteCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HDRNOTECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdHdrNote.hdrNoteCode</code> attribute. 
	 * @param value the hdrNoteCode
	 */
	public void setHdrNoteCode(final String value)
	{
		setHdrNoteCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdHdrNote.hdrNotes</code> attribute.
	 * @return the hdrNotes
	 */
	public String getHdrNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HDRNOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JnjGTOrdHdrNote.hdrNotes</code> attribute.
	 * @return the hdrNotes
	 */
	public String getHdrNotes()
	{
		return getHdrNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdHdrNote.hdrNotes</code> attribute. 
	 * @param value the hdrNotes
	 */
	public void setHdrNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HDRNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JnjGTOrdHdrNote.hdrNotes</code> attribute. 
	 * @param value the hdrNotes
	 */
	public void setHdrNotes(final String value)
	{
		setHdrNotes( getSession().getSessionContext(), value );
	}
	
}
