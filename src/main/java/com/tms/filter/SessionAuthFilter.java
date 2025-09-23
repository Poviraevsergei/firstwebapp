package com.tms.filter;

import com.tms.repository.UserRepository;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/todo", "/about-me"})
public class SessionAuthFilter implements Filter {
    private UserRepository userRepository;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        userRepository = new UserRepository();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();
        Object username = session.getAttribute("username");
        if (username != null) {
            if (userRepository.isUserContains(String.valueOf(username))) {
                chain.doFilter(request, response);
            }
        }
        request.getRequestDispatcher("/WEB-INF/pages/login.html").forward(request, response);
    }
}
