package com.jnj.hybris.storefront.renderer;

import de.hybris.platform.acceleratorcms.component.renderer.CMSComponentRenderer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import com.jnj.core.model.JnjParagraphComponentModel;


/**
 * Renderer class for JnjParagraphComponent.
 * 
 * @author abhishek.b.arora
 * @version 1.0
 */
public class JnjParagraphComponentRenderer implements CMSComponentRenderer<JnjParagraphComponentModel>
{

	@Override
	public void renderComponent(final PageContext pageContext, final JnjParagraphComponentModel component)
			throws ServletException, IOException
	{
		final JspWriter out = pageContext.getOut();
		out.write("<div class=\"content\">");
		out.write(component.getContent());
		out.write("</div>");
	}

}
