package org.example.demo.SimpleRequestDispatcher;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "WelcomeServlet", value = "/Welcome-servlet")
public class Welcome extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // example of senRedirect method

        response.sendRedirect("https://www.google.com/");
        //  PrintWriter out = response.getWriter();
       // String userName=request.getParameter("UserName");
        //out.println("<h1>"+"Welcome "+userName+"</h1>");
    }


}