package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/visitCounter")
public  class VisitCounter extends HttpServlet {
    // do initialization
    int i=0;
    public void init() throws ServletException {
        i=1;
    }
    // perform actual task

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter outPut=response.getWriter();
        outPut.println("<h1>"+i+"</h1>");
        i++;
    }

    // terminate servlet

}