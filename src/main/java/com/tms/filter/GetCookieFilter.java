package com.tms.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Регистрация фильтра в web.xml файле
 */

public class GetCookieFilter implements Filter {
    private HttpServletRequest httpRequest = null;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("GetCookieFilter working ....");


        request.setAttribute("group",36);
        if (request instanceof HttpServletRequest) {
            httpRequest = (HttpServletRequest) request;
            httpRequest.getCookies();
            for (Cookie cookie : httpRequest.getCookies()) {
                System.out.println(cookie.getName() + ": " + cookie.getValue());
            }

            //The most important!!!!!
            chain.doFilter(request, response);
        }
    }
}
