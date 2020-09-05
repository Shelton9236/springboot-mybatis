package com.atguigu.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns ="/*")
public class HelloFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("HelloFilter - doFilter - before");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("HelloFilter - doFilter - after");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("HelloFilter - init");
    }

    @Override
    public void destroy() {
        System.out.println("HelloFilter - destroy");
    }
}
