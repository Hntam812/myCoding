package com.cybersoft.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="loginPage", urlPatterns = {"/login"})

public class LoginPage extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/webapp/login_page.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println();
        if (username.equals("admin") && password.equals("123456")) {
            resp.sendRedirect(req.getContextPath() + "/home-page");
        } else {
            req.getRequestDispatcher("/webapp/login_page.jsp").forward(req, resp);
        }
    }

}
