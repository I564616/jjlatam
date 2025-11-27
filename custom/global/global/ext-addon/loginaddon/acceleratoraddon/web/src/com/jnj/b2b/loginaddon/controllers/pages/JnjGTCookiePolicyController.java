package com.jnj.b2b.loginaddon.controllers.pages;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jnj.b2b.loginaddon.constants.LoginaddonConstants;
import com.jnj.b2b.loginaddon.constants.LoginaddonConstants.Logging;
import com.jnj.b2b.loginaddon.controllers.LoginaddonControllerConstants;
import com.jnj.b2b.storefront.controllers.pages.AbstractPageController;
import com.jnj.core.constants.Jnjb2bCoreConstants;
import com.jnj.facades.policies.JnjGTPoliciesFacade;
import com.jnj.b2b.loginaddon.constants.LoginaddonConstants;
import com.jnj.services.CMSSiteService;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.contents.ContentCatalogModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.util.Config;


@Controller
public class JnjGTCookiePolicyController extends AbstractPageController
{
	private static final Logger LOGGER = Logger.getLogger(JnjGTCookiePolicyController.class);
	
	@Autowired
	private MediaService mediaService;
	
	@Autowired
	private CatalogVersionService catalogVersionService;
	
	@Autowired
	private CMSSiteService cmsSiteService;
	
	public CMSSiteService getCmsSiteService() {
		return cmsSiteService;
	}

	public void setCmsSiteService(CMSSiteService cmsSiteService) {
		this.cmsSiteService = cmsSiteService;
	}
	
	@Resource(name = "jnjPoliciesFacade")
	JnjGTPoliciesFacade jnjGTPoliciesFacade;
	 
	@RequestMapping(value = "/GTCookiePolicy", method = RequestMethod.GET)
	@ResponseBody
	public String getCookiePolicy() throws CMSItemNotFoundException
	{
		String url = jnjGTPoliciesFacade.getCookiePolicies();
		return url;
	}
	
	     
	@RequestMapping(value = "/GTTermsAndCondition", method = RequestMethod.GET)
	@ResponseBody
	public String getTermsAndCondition(final Model model) throws CMSItemNotFoundException
	{
		String url = jnjGTPoliciesFacade.getTermsAndConditionsPolicies();
		return url;
	}
	
	@RequestMapping(value = "/GTPrivacyPolicy", method = RequestMethod.GET)
	@ResponseBody
	public String getPrivacyPolicy(final Model model) throws CMSItemNotFoundException
	{
		String url = jnjGTPoliciesFacade.getPrivacyPolicies();
		return url;
	
	}
	
	@RequestMapping(value = "/GTLegalNotice", method = RequestMethod.GET)
	@ResponseBody
	public String getLegalNotice(final Model model) throws CMSItemNotFoundException
	{
		String url = jnjGTPoliciesFacade.getLegalNotices();
		return url;
	
	}
	@RequestMapping(value = "/GTUsefulLinks", method = RequestMethod.GET)
	@ResponseBody
	public String getUsefulLink(final Model model) throws CMSItemNotFoundException
	{
		String url = jnjGTPoliciesFacade.getUsefulLinks();
		return url;
	
	}
	
}
