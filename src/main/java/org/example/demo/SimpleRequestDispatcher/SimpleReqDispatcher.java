package org.example.demo.SimpleRequestDispatcher;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "SimpleReqDispatcherServlet", value = "/SimpleReqDispatcher-servlet")
public class SimpleReqDispatcher extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("UserName");
        String password = request.getParameter("Password");
        // Check if the password is "servlet"
        if(password.equals("servlet")) {
            // Forward the request to WelcomeServlet
            RequestDispatcher rd = request.getRequestDispatcher("Welcome");
            rd.forward(request, response);
        } else {
            // Display error message and include the original form (index.html)
            out.print("Sorry, username or password error!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);
        }
    }

}