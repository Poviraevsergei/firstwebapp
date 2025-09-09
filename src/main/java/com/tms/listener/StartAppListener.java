package com.tms.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;

import java.time.LocalDateTime;

@WebListener
public class StartAppListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("App started at " + LocalDateTime.now());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("App stopped at " + LocalDateTime.now());
    }
}
