package com.tms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalTime;

@WebServlet("/firstservlet")
public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        // Получаем параметры из запроса
        String nameValue = req.getParameter("name");

        Writer writer = resp.getWriter();
        writer.append("<html> Hello <h1>" + nameValue + "</h1> :)</html>");
        writer.append("<html> This is my first servlet!!!</html>");
        writer.close();
    }

    //Жизненный цикл сервлетов
    //1. init() - при создании
    //2. service() - отрабатывыает на каждом запросе
    //3. destroy() - при удалении сервлета

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("MyFirstServlet init() -> " + LocalTime.now());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyFirstServlet service() -> " + LocalTime.now());
        System.out.println("MyFirstServlet service() name parameter -> " + req.getParameter("name"));
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("MyFirstServlet destroy() -> " + LocalTime.now());
    }
}

//TODO: Filter, Listener, session, redirect
