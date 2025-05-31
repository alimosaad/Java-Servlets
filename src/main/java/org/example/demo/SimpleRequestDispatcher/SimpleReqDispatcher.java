package org.example.demo.SimpleRequestDispatcher;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "SimpleReqDispatcherServlet", value = "/SimpleReqDispatcher-servlet")
public class SimpleReqDispatcher extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        //region simple reqDispatcher method
        /*PrintWriter out = response.getWriter();
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
        }*/
        //endregion


        //region Http session
        // http session
        /*HttpSession session = request.getSession();
        String str = request.getParameter("UserName");
        session.setAttribute("UserName", str);
        response.sendRedirect("WelcomeServlet");*/
        //endregion

        // way for session tracking and the most used for tracking
        //region Cookies tracking
        /*Cookie firstName=new Cookie("FirstName",request.getParameter("FirstName"));
        Cookie lastName=new Cookie("LastName",request.getParameter("LastName"));
        firstName.setMaxAge(60*60*24);
        lastName.setMaxAge(60*60*24);
        response.setContentType("text/html");
        response.addCookie(firstName);
        response.addCookie(lastName);
        response.sendRedirect("Welcome");*/
        //endregion

        // another way for session tracking
        //region URL Rewriting
        /*String firstName=request.getParameter("FirstName");
        String lastName=request.getParameter("LastName");
        response.sendRedirect("Welcome?FirstName="+firstName+"&LastName="+lastName);*/
        //endregion

    }
}