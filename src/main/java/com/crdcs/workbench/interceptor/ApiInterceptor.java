package com.crdcs.workbench.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
public class ApiInterceptor extends HandlerInterceptorAdapter {
    /**
     * This implementation always returns {@code true}.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (request.getAttribute("__request_url") == null) {
            request.setAttribute("__request_url", request.getRequestURI());
        }
        if (!response.containsHeader("Access-Control-Allow-Origin")) {
            response.addHeader("Access-Control-Allow-Origin", "*");
        }
        if (!response.containsHeader("Access-Control-Allow-Credentials")) {
            response.addHeader("Access-Control-Allow-Credentials", "true");
        }
        if (!response.containsHeader("Access-Control-Allow-Methods")) {
            response.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
        }
        boolean b = response.containsHeader("Access-Control-Allow-Headers");
        String header = response.getHeader("Access-Control-Allow-Headers");
        response.addHeader("Access-Control-Allow-Headers","*");
        log.info("path info,{}",request.getPathInfo());
        return true;
    }

}
