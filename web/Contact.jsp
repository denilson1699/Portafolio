<%-- 
    Document   : Contact
    Created on : 02/03/2021, 11:57:40 PM
    Author     : jaram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contacto</title>     
        <style >@import"css/StylesContact.css"</style>
    <body>  
        <header>
            <ul>
            <li id="logo"><a href="#" > DJC</a></li>
            <li><a href="Abaut.jsp"> Sobre Mi</a></li>
            <li><a href="Projects.jsp"> Proyectos</a></li>
            <li><a href="Contact.jsp"> Contacto</a></li>
            </ul>
        </header>
        <div id="content">
            <div id="title">
                <h2 id="titleProject">Contacto</h2>
                <div id="cajaContacto">
                    <html:form  action="/GrabarMessageAction" styleId="formMessage" ><br><br>
                        <label >Date:</label>
                        <html:text   property="fechaPubl"  style="background: rgb(10,10,10,0);"/> <br><br>
                            
                        <label >Name:</label>
                            <html:text     property="nameUsu"/><br><br>
                             
                        <label>Email:</label>
                            <html:text    property="correoUsu"/><br><br>
                            
                        <label id="labelMessgage"> Message:</label><br>
                        <html:textarea   property="message"></html:textarea><br>
                            
                            
                            <html:submit styleId="botonEnviar"  value="Enviar"/>
                    </html:form>
                    
                </div>
                
            </div>
        </div>
        <footer id="footerContact">
            Mi Portafolio Presonal - Denilson Jaramillo ©
        </footer>
</html>
