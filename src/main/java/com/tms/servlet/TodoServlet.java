package com.tms.servlet;

import com.tms.repository.TaskRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Set;

@WebServlet("/todo")
public class TodoServlet extends HttpServlet {
    private TaskRepository taskRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<String> userTasks = getUserTasks(req);
        req.setAttribute("tasks", userTasks);
        req.getRequestDispatcher("/WEB-INF/pages/todolist.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<String> userTasks = getUserTasks(req);
        String username = String.valueOf(req.getSession().getAttribute("username"));
        String task = req.getParameter("task");
        String deleteTask = req.getParameter("deleteTask");

        if (task != null) {
            userTasks.add(task);
            taskRepository.getTaskList().put(username, userTasks);
        }

        if (deleteTask != null) {
            userTasks.remove(deleteTask);
            taskRepository.getTaskList().put(username, userTasks);
        }

        if (!userTasks.isEmpty()) {
            req.setAttribute("tasks", userTasks);
        }
        req.getRequestDispatcher("/WEB-INF/pages/todolist.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        taskRepository = new TaskRepository();
    }

    private Set<String> getUserTasks(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String username = String.valueOf(session.getAttribute("username"));
        return taskRepository.getTasksByUsername(username);
    }
}
