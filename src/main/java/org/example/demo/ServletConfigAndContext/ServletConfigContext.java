package org.example.demo.ServletConfigAndContext;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ServletConfigContextServlet", value = "/ServletConfigContext-servlet")
public class ServletConfigContext extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1>Hello "+getServletContext().getInitParameter("adminEmail")+"</h1>");
    }


}