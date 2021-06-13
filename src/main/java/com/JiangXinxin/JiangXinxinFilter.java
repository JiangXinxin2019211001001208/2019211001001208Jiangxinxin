package com.JiangXinxin.lab2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "JMYFilter")
public class JiangXinxinFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("JiangXinxinFilter -- before chain");
        chain.doFilter(req, resp);
        System.out.println("JiangXinxinFilter -- after chain");
    }
    public void init(FilterConfig config) throws ServletException {

    }

}
