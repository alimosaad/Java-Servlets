<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Date" info="This Page Is Created By Ali Mosaad" %>
<%@include file="login.jsp"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <title>Jsp</title>
    </head>
    <body>
    <!--html comment-->
    <%-- jsp comment jsp comment is like java comment--%>
    <%! int counter=0;%>
    Current Date Is:<%= new Date()%>
    </body>
</html>