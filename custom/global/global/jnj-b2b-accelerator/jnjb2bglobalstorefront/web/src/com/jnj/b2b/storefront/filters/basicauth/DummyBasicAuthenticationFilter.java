package com.jnj.b2b.storefront.filters.basicauth;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class DummyBasicAuthenticationFilter  extends BasicAuthenticationFilter{

    private static final String DUMMY_FILTER = "dummy";

    public DummyBasicAuthenticationFilter() {
        super(DUMMY_FILTER, DUMMY_FILTER);
    }

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException
    {
        chain.doFilter(request, response);
    }
}
