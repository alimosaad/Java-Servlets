package org.example.demo;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/addTest"})
public class addTest extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ProcessRequest(req,res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req,res);
    }
    public  void ProcessRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int i =Integer.parseInt(req.getParameter("num1"));
        int i2 =Integer.parseInt(req.getParameter("num2"));
        int k=i+i2;
        PrintWriter out = res.getWriter();
        out.println(k);
    }

}