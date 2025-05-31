package org.example.demo.SimpleRequestDispatcher;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "WelcomeServlet", value = "/WelcomeServlet")
public class Welcome extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //region Example of senRedirect method
        /*response.setContentType("text/html");
        // example of senRedirect method
        response.sendRedirect("Https://www.google.com/");
        PrintWriter out = response.getWriter();
       String userName=request.getParameter("UserName");
        out.println("<h1>"+"Welcome "+userName+"</h1>");*/
        //endregion

        //region example of Http Session
        /*HttpSession session=request.getSession();
        String str=session.getAttribute("UserName").toString();
        PrintWriter out=response.getWriter();
        out.println("<h1>Hello "+str+"</h1>");*/
        //endregion

        //region CookiesTracker
        /*Cookie cookies[] =request.getCookies();
        String firstName=null;
        String lastName=null;

        for(Cookie cookie:cookies){
            if(cookie.getName().equals("FirstName")){
                firstName=cookie.getValue().toString();
            }

            if(cookie.getName().equals("LastName")) {
                lastName = cookie.getValue().toString();
            }
        }*/
        //endregion

        String firstName=request.getParameter("FirstName");
        String lastName=request.getParameter("LastName");

        PrintWriter out=response.getWriter();
        out.println("<h1> Hello "+firstName+" "+lastName+"</h1>");
    }


}