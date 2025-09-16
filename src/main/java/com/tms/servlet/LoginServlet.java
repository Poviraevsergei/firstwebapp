package com.tms.servlet;

import com.tms.service.Validator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private Validator validator;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userLogin = req.getParameter("login");
        String userPassword = req.getParameter("password");

        if (validator.validateLoginPassword(userLogin, userPassword)) {
            req.getSession().setAttribute("userLogin", userLogin);
            getServletContext().getRequestDispatcher("/todolist.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/login.html").forward(req, resp);
        }
        super.doPost(req, resp);
    }

    @Override
    public void init() {
        validator = new Validator();
    }
}
