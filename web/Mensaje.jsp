<%-- 
    Document   : Mensaje
    Created on : 09/11/2020, 08:12:15 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String msg=(String)session.getAttribute("msg"); %>
        <h1>Mensaje</h1>
        <h3> <%= msg %></h3>
        <h4><a href="Contact.jsp">volver al menu</a></h4>
    </body>
</html>
