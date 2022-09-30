package com.cybersoft.controller;
//Add servlet lib : maven repository where contains all java-lib https://mvnrepository.com/

//Annotaition(Tên định danh , kí hiệu @)

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//urlPatterns : định nghĩa đường dẫn,như định nghĩa.

@WebServlet(name="homepage", urlPatterns = {"/home-page"})
public class HomePage extends HttpServlet {

 // Method :
    // GET : nhập đường dẫn vào browser Enter
    // - truyền tham số : ?ten_tham_so=giatri&ten_tham_so=giatri
    // POST : gọi đường dẫn không thông qua giao diện(gọi ngầm)

    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do get");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
        req.getRequestDispatcher("/webapp/home_page.jsp").forward(req,resp); //load nội dung home_page.jsp
      //  resp.getWriter().println("Hello Demi "+hoten +"-matkhau : "+matkhau);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
