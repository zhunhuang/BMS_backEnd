package com.learn.nolan.interceptor;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description:
 *
 * @author zhun.huang 2018-12-18
 */
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("访问host:" + servletRequest.getRemoteHost());
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        // 添加参数，允许任意domain访问
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Headers", "accept,content-type,x-requested-with");
        resp.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
        // 设置preflight request  （预检请求）的返回结果可以被缓存多久。
        resp.setHeader("Access-Control-Max-Age", "3600");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
