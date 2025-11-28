/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 28, 2025, 7:28:04 PM                    ---
 * ----------------------------------------------------------------
 */
package com.jnj.gt.jalo;

import com.jnj.core.jalo.JnjGTIntermediateMaster;
import com.jnj.gt.constants.Jnjgtb2binboundserviceConstants;
import com.jnj.gt.jalo.JnJGTIntProductLocal;
import com.jnj.gt.jalo.JnJGTIntProductLocalPlant;
import com.jnj.gt.jalo.JnJGTIntProductPlant;
import com.jnj.gt.jalo.JnjGTIntAffiliation;
import com.jnj.gt.jalo.JnjGTIntB2BUnitLocal;
import com.jnj.gt.jalo.JnjGTIntB2bCustomer;
import com.jnj.gt.jalo.JnjGTIntCpscContactDetail;
import com.jnj.gt.jalo.JnjGTIntCpscDetails;
import com.jnj.gt.jalo.JnjGTIntCpscTestDetail;
import com.jnj.gt.jalo.JnjGTIntCreditCard;
import com.jnj.gt.jalo.JnjGTIntInvoice;
import com.jnj.gt.jalo.JnjGTIntInvoiceEntry;
import com.jnj.gt.jalo.JnjGTIntInvoiceEntryLot;
import com.jnj.gt.jalo.JnjGTIntInvoicePrice;
import com.jnj.gt.jalo.JnjGTIntListPrice;
import com.jnj.gt.jalo.JnjGTIntListPriceAmt;
import com.jnj.gt.jalo.JnjGTIntOrdHdrNote;
import com.jnj.gt.jalo.JnjGTIntOrdLineHoldLocal;
import com.jnj.gt.jalo.JnjGTIntOrdLinePriceLocal;
import com.jnj.gt.jalo.JnjGTIntOrderHeader;
import com.jnj.gt.jalo.JnjGTIntOrderLine;
import com.jnj.gt.jalo.JnjGTIntOrderLinePart;
import com.jnj.gt.jalo.JnjGTIntOrderLineTxt;
import com.jnj.gt.jalo.JnjGTIntOrderSchLine;
import com.jnj.gt.jalo.JnjGTIntOrderTemplate;
import com.jnj.gt.jalo.JnjGTIntOrderTemplateEntry;
import com.jnj.gt.jalo.JnjGTIntPartnerFunc;
import com.jnj.gt.jalo.JnjGTIntProduct;
import com.jnj.gt.jalo.JnjGTIntProductDesc;
import com.jnj.gt.jalo.JnjGTIntProductExclusion;
import com.jnj.gt.jalo.JnjGTIntProductKit;
import com.jnj.gt.jalo.JnjGTIntProductLotMaster;
import com.jnj.gt.jalo.JnjGTIntProductReg;
import com.jnj.gt.jalo.JnjGTIntProductSalesOrg;
import com.jnj.gt.jalo.JnjGTIntProductUnit;
import com.jnj.gt.jalo.JnjGTIntSalesAlignmentCust;
import com.jnj.gt.jalo.JnjGTIntSalesAlignmentOrg;
import com.jnj.gt.jalo.JnjGTIntSalesAlignmentProduct;
import com.jnj.gt.jalo.JnjGTIntSalesAlignmentUser;
import com.jnj.gt.jalo.JnjGTIntSalesOrg;
import com.jnj.gt.jalo.JnjGTIntShipTrckHdr;
import com.jnj.gt.jalo.JnjGTIntShipTrckLine;
import com.jnj.gt.jalo.JnjGTIntSurgeon;
import com.jnj.gt.jalo.JnjGTIntTerritory;
import com.jnj.gt.jalo.JnjGTIntUserB2bUnit;
import com.jnj.gt.jalo.JnjGTIntUserPermission;
import com.jnj.gt.jalo.JnjGTIntUserSalesOrg;
import com.jnj.gt.jalo.JnjGTTanOrdEntStsMapping;
import com.jnj.gt.jalo.JnjIntB2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Jnjgtb2binboundserviceManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJnjgtb2binboundserviceManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("operationArchModel", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
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
	
	public JnjGTIntAffiliation createJnjGTIntAffiliation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTAFFILIATION );
			return (JnjGTIntAffiliation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntAffiliation : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntAffiliation createJnjGTIntAffiliation(final Map attributeValues)
	{
		return createJnjGTIntAffiliation( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntB2bCustomer createJnjGTIntB2bCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTB2BCUSTOMER );
			return (JnjGTIntB2bCustomer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntB2bCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntB2bCustomer createJnjGTIntB2bCustomer(final Map attributeValues)
	{
		return createJnjGTIntB2bCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjIntB2BUnit createJnjGTIntB2BUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTB2BUNIT );
			return (JnjIntB2BUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntB2BUnit : "+e.getMessage(), 0 );
		}
	}
	
	public JnjIntB2BUnit createJnjGTIntB2BUnit(final Map attributeValues)
	{
		return createJnjGTIntB2BUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntB2BUnitLocal createJnjGTIntB2BUnitLocal(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTB2BUNITLOCAL );
			return (JnjGTIntB2BUnitLocal)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntB2BUnitLocal : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntB2BUnitLocal createJnjGTIntB2BUnitLocal(final Map attributeValues)
	{
		return createJnjGTIntB2BUnitLocal( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntCpscContactDetail createJnjGTIntCpscContactDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTCPSCCONTACTDETAIL );
			return (JnjGTIntCpscContactDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntCpscContactDetail : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntCpscContactDetail createJnjGTIntCpscContactDetail(final Map attributeValues)
	{
		return createJnjGTIntCpscContactDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntCpscDetails createJnjGTIntCpscDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTCPSCDETAILS );
			return (JnjGTIntCpscDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntCpscDetails : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntCpscDetails createJnjGTIntCpscDetails(final Map attributeValues)
	{
		return createJnjGTIntCpscDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntCpscTestDetail createJnjGTIntCpscTestDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTCPSCTESTDETAIL );
			return (JnjGTIntCpscTestDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntCpscTestDetail : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntCpscTestDetail createJnjGTIntCpscTestDetail(final Map attributeValues)
	{
		return createJnjGTIntCpscTestDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntCreditCard createJnjGTIntCreditCard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTCREDITCARD );
			return (JnjGTIntCreditCard)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntCreditCard : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntCreditCard createJnjGTIntCreditCard(final Map attributeValues)
	{
		return createJnjGTIntCreditCard( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntInvoice createJnjGTIntInvoice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTINVOICE );
			return (JnjGTIntInvoice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntInvoice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntInvoice createJnjGTIntInvoice(final Map attributeValues)
	{
		return createJnjGTIntInvoice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntInvoiceEntry createJnjGTIntInvoiceEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTINVOICEENTRY );
			return (JnjGTIntInvoiceEntry)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntInvoiceEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntInvoiceEntry createJnjGTIntInvoiceEntry(final Map attributeValues)
	{
		return createJnjGTIntInvoiceEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntInvoiceEntryLot createJnjGTIntInvoiceEntryLot(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTINVOICEENTRYLOT );
			return (JnjGTIntInvoiceEntryLot)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntInvoiceEntryLot : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntInvoiceEntryLot createJnjGTIntInvoiceEntryLot(final Map attributeValues)
	{
		return createJnjGTIntInvoiceEntryLot( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntInvoicePrice createJnjGTIntInvoicePrice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTINVOICEPRICE );
			return (JnjGTIntInvoicePrice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntInvoicePrice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntInvoicePrice createJnjGTIntInvoicePrice(final Map attributeValues)
	{
		return createJnjGTIntInvoicePrice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntListPrice createJnjGTIntListPrice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTLISTPRICE );
			return (JnjGTIntListPrice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntListPrice : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntListPrice createJnjGTIntListPrice(final Map attributeValues)
	{
		return createJnjGTIntListPrice( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntListPriceAmt createJnjGTIntListPriceAmt(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTLISTPRICEAMT );
			return (JnjGTIntListPriceAmt)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntListPriceAmt : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntListPriceAmt createJnjGTIntListPriceAmt(final Map attributeValues)
	{
		return createJnjGTIntListPriceAmt( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderHeader createJnjGTIntOrderHeader(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERHEADER );
			return (JnjGTIntOrderHeader)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderHeader : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderHeader createJnjGTIntOrderHeader(final Map attributeValues)
	{
		return createJnjGTIntOrderHeader( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderLine createJnjGTIntOrderLine(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERLINE );
			return (JnjGTIntOrderLine)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderLine : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderLine createJnjGTIntOrderLine(final Map attributeValues)
	{
		return createJnjGTIntOrderLine( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderLinePart createJnjGTIntOrderLinePart(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERLINEPART );
			return (JnjGTIntOrderLinePart)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderLinePart : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderLinePart createJnjGTIntOrderLinePart(final Map attributeValues)
	{
		return createJnjGTIntOrderLinePart( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderLineTxt createJnjGTIntOrderLineTxt(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERLINETXT );
			return (JnjGTIntOrderLineTxt)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderLineTxt : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderLineTxt createJnjGTIntOrderLineTxt(final Map attributeValues)
	{
		return createJnjGTIntOrderLineTxt( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderSchLine createJnjGTIntOrderSchLine(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERSCHLINE );
			return (JnjGTIntOrderSchLine)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderSchLine : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderSchLine createJnjGTIntOrderSchLine(final Map attributeValues)
	{
		return createJnjGTIntOrderSchLine( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderTemplate createJnjGTIntOrderTemplate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERTEMPLATE );
			return (JnjGTIntOrderTemplate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderTemplate : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderTemplate createJnjGTIntOrderTemplate(final Map attributeValues)
	{
		return createJnjGTIntOrderTemplate( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrderTemplateEntry createJnjGTIntOrderTemplateEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDERTEMPLATEENTRY );
			return (JnjGTIntOrderTemplateEntry)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrderTemplateEntry : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrderTemplateEntry createJnjGTIntOrderTemplateEntry(final Map attributeValues)
	{
		return createJnjGTIntOrderTemplateEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrdHdrNote createJnjGTIntOrdHdrNote(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDHDRNOTE );
			return (JnjGTIntOrdHdrNote)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrdHdrNote : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrdHdrNote createJnjGTIntOrdHdrNote(final Map attributeValues)
	{
		return createJnjGTIntOrdHdrNote( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrdLineHoldLocal createJnjGTIntOrdLineHoldLocal(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDLINEHOLDLOCAL );
			return (JnjGTIntOrdLineHoldLocal)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrdLineHoldLocal : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrdLineHoldLocal createJnjGTIntOrdLineHoldLocal(final Map attributeValues)
	{
		return createJnjGTIntOrdLineHoldLocal( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntOrdLinePriceLocal createJnjGTIntOrdLinePriceLocal(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTORDLINEPRICELOCAL );
			return (JnjGTIntOrdLinePriceLocal)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntOrdLinePriceLocal : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntOrdLinePriceLocal createJnjGTIntOrdLinePriceLocal(final Map attributeValues)
	{
		return createJnjGTIntOrdLinePriceLocal( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntPartnerFunc createJnjGTIntPartnerFunc(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPARTNERFUNC );
			return (JnjGTIntPartnerFunc)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntPartnerFunc : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntPartnerFunc createJnjGTIntPartnerFunc(final Map attributeValues)
	{
		return createJnjGTIntPartnerFunc( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProduct createJnjGTIntProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCT );
			return (JnjGTIntProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProduct : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProduct createJnjGTIntProduct(final Map attributeValues)
	{
		return createJnjGTIntProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductDesc createJnjGTIntProductDesc(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTDESC );
			return (JnjGTIntProductDesc)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductDesc : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductDesc createJnjGTIntProductDesc(final Map attributeValues)
	{
		return createJnjGTIntProductDesc( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductExclusion createJnjGTIntProductExclusion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTEXCLUSION );
			return (JnjGTIntProductExclusion)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductExclusion : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductExclusion createJnjGTIntProductExclusion(final Map attributeValues)
	{
		return createJnjGTIntProductExclusion( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductKit createJnjGTIntProductKit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTKIT );
			return (JnjGTIntProductKit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductKit : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductKit createJnjGTIntProductKit(final Map attributeValues)
	{
		return createJnjGTIntProductKit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTIntProductLocal createJnJGTIntProductLocal(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTLOCAL );
			return (JnJGTIntProductLocal)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnJGTIntProductLocal : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTIntProductLocal createJnJGTIntProductLocal(final Map attributeValues)
	{
		return createJnJGTIntProductLocal( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTIntProductLocalPlant createJnJGTIntProductLocalPlant(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTLOCALPLANT );
			return (JnJGTIntProductLocalPlant)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnJGTIntProductLocalPlant : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTIntProductLocalPlant createJnJGTIntProductLocalPlant(final Map attributeValues)
	{
		return createJnJGTIntProductLocalPlant( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductLotMaster createJnjGTIntProductLotMaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTLOTMASTER );
			return (JnjGTIntProductLotMaster)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductLotMaster : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductLotMaster createJnjGTIntProductLotMaster(final Map attributeValues)
	{
		return createJnjGTIntProductLotMaster( getSession().getSessionContext(), attributeValues );
	}
	
	public JnJGTIntProductPlant createJnJGTIntProductPlant(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTPLANT );
			return (JnJGTIntProductPlant)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnJGTIntProductPlant : "+e.getMessage(), 0 );
		}
	}
	
	public JnJGTIntProductPlant createJnJGTIntProductPlant(final Map attributeValues)
	{
		return createJnJGTIntProductPlant( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductReg createJnjGTIntProductReg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTREG );
			return (JnjGTIntProductReg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductReg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductReg createJnjGTIntProductReg(final Map attributeValues)
	{
		return createJnjGTIntProductReg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductSalesOrg createJnjGTIntProductSalesOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTSALESORG );
			return (JnjGTIntProductSalesOrg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductSalesOrg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductSalesOrg createJnjGTIntProductSalesOrg(final Map attributeValues)
	{
		return createJnjGTIntProductSalesOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntProductUnit createJnjGTIntProductUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTPRODUCTUNIT );
			return (JnjGTIntProductUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntProductUnit : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntProductUnit createJnjGTIntProductUnit(final Map attributeValues)
	{
		return createJnjGTIntProductUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSalesAlignmentCust createJnjGTIntSalesAlignmentCust(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSALESALIGNMENTCUST );
			return (JnjGTIntSalesAlignmentCust)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSalesAlignmentCust : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSalesAlignmentCust createJnjGTIntSalesAlignmentCust(final Map attributeValues)
	{
		return createJnjGTIntSalesAlignmentCust( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSalesAlignmentOrg createJnjGTIntSalesAlignmentOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSALESALIGNMENTORG );
			return (JnjGTIntSalesAlignmentOrg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSalesAlignmentOrg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSalesAlignmentOrg createJnjGTIntSalesAlignmentOrg(final Map attributeValues)
	{
		return createJnjGTIntSalesAlignmentOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSalesAlignmentProduct createJnjGTIntSalesAlignmentProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSALESALIGNMENTPRODUCT );
			return (JnjGTIntSalesAlignmentProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSalesAlignmentProduct : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSalesAlignmentProduct createJnjGTIntSalesAlignmentProduct(final Map attributeValues)
	{
		return createJnjGTIntSalesAlignmentProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSalesAlignmentUser createJnjGTIntSalesAlignmentUser(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSALESALIGNMENTUSER );
			return (JnjGTIntSalesAlignmentUser)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSalesAlignmentUser : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSalesAlignmentUser createJnjGTIntSalesAlignmentUser(final Map attributeValues)
	{
		return createJnjGTIntSalesAlignmentUser( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSalesOrg createJnjGTIntSalesOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSALESORG );
			return (JnjGTIntSalesOrg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSalesOrg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSalesOrg createJnjGTIntSalesOrg(final Map attributeValues)
	{
		return createJnjGTIntSalesOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntShipTrckHdr createJnjGTIntShipTrckHdr(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSHIPTRCKHDR );
			return (JnjGTIntShipTrckHdr)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntShipTrckHdr : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntShipTrckHdr createJnjGTIntShipTrckHdr(final Map attributeValues)
	{
		return createJnjGTIntShipTrckHdr( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntShipTrckLine createJnjGTIntShipTrckLine(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSHIPTRCKLINE );
			return (JnjGTIntShipTrckLine)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntShipTrckLine : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntShipTrckLine createJnjGTIntShipTrckLine(final Map attributeValues)
	{
		return createJnjGTIntShipTrckLine( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntSurgeon createJnjGTIntSurgeon(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTSURGEON );
			return (JnjGTIntSurgeon)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntSurgeon : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntSurgeon createJnjGTIntSurgeon(final Map attributeValues)
	{
		return createJnjGTIntSurgeon( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntTerritory createJnjGTIntTerritory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTTERRITORY );
			return (JnjGTIntTerritory)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntTerritory : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntTerritory createJnjGTIntTerritory(final Map attributeValues)
	{
		return createJnjGTIntTerritory( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntUserB2bUnit createJnjGTIntUserB2bUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTUSERB2BUNIT );
			return (JnjGTIntUserB2bUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntUserB2bUnit : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntUserB2bUnit createJnjGTIntUserB2bUnit(final Map attributeValues)
	{
		return createJnjGTIntUserB2bUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntUserPermission createJnjGTIntUserPermission(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTUSERPERMISSION );
			return (JnjGTIntUserPermission)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntUserPermission : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntUserPermission createJnjGTIntUserPermission(final Map attributeValues)
	{
		return createJnjGTIntUserPermission( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTIntUserSalesOrg createJnjGTIntUserSalesOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTINTUSERSALESORG );
			return (JnjGTIntUserSalesOrg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTIntUserSalesOrg : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTIntUserSalesOrg createJnjGTIntUserSalesOrg(final Map attributeValues)
	{
		return createJnjGTIntUserSalesOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public JnjGTTanOrdEntStsMapping createJnjGTTanOrdEntStsMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Jnjgtb2binboundserviceConstants.TC.JNJGTTANORDENTSTSMAPPING );
			return (JnjGTTanOrdEntStsMapping)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating JnjGTTanOrdEntStsMapping : "+e.getMessage(), 0 );
		}
	}
	
	public JnjGTTanOrdEntStsMapping createJnjGTTanOrdEntStsMapping(final Map attributeValues)
	{
		return createJnjGTTanOrdEntStsMapping( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Jnjgtb2binboundserviceConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.operationArchModel</code> attribute.
	 * @return the operationArchModel
	 */
	public JnjGTIntermediateMaster getOperationArchModel(final SessionContext ctx, final AbstractOrder item)
	{
		return (JnjGTIntermediateMaster)item.getProperty( ctx, Jnjgtb2binboundserviceConstants.Attributes.AbstractOrder.OPERATIONARCHMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.operationArchModel</code> attribute.
	 * @return the operationArchModel
	 */
	public JnjGTIntermediateMaster getOperationArchModel(final AbstractOrder item)
	{
		return getOperationArchModel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.operationArchModel</code> attribute. 
	 * @param value the operationArchModel
	 */
	public void setOperationArchModel(final SessionContext ctx, final AbstractOrder item, final JnjGTIntermediateMaster value)
	{
		item.setProperty(ctx, Jnjgtb2binboundserviceConstants.Attributes.AbstractOrder.OPERATIONARCHMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.operationArchModel</code> attribute. 
	 * @param value the operationArchModel
	 */
	public void setOperationArchModel(final AbstractOrder item, final JnjGTIntermediateMaster value)
	{
		setOperationArchModel( getSession().getSessionContext(), item, value );
	}
	
}
