package com.jnj.la.b2b.cartandcheckoutaddon.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jnj.b2b.storefront.controllers.pages.AbstractPageController;


@Controller
@Scope("tenant")
@RequestMapping("/mockorderinvoice")
public class JnjMockInvoiceController extends AbstractPageController
{

	private static final Logger LOG = Logger.getLogger(JnjMockInvoiceController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String loadMockOrderSimulatePage(final Model model) throws CMSItemNotFoundException
	{
		return "pages/test/mockInvoiceFile";
	}

}
