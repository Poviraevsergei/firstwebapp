package com.tms.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.time.LocalTime;

/**
 * Регистрация фильтра через аннотацию
 */
@WebFilter(value = "/firstservlet")
public class PrintRequestFilter implements Filter {
    private HttpServletRequest httpServletRequest = null;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("PrintRequestFilter working ...");
        if (request instanceof HttpServletRequest) {
            httpServletRequest = (HttpServletRequest) request;
            System.out.println("URI:" + httpServletRequest.getRequestURI() + " Time: " + LocalTime.now());
        }

        chain.doFilter(request, response);
    }
}
