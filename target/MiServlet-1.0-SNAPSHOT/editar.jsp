<%-- 
    Document   : editar
    Created on : 22-06-2024, 20:47:21
    Author     : el_pulento
--%>

<%@page import="com.mycompany.miservlet.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        
        <!<!-- recivo usuario encontrado en SvEditar -->
        
        <% Usuario usu=(Usuario)request.getSession().getAttribute("usuEditar"); %>
         
        
         <h1>Datos del usuario</h1>

        <form action="SvEditar" method="POST">
            
            <!<!-- asigno valor de los usuarios a los controles del funcionario y envio SvEditar servlet para editar -->


            <p><label>Dni: </label><input type="text" name="dni" value="<%=usu.getDni()%>"></p>
            <p><label>Nombre: </label><input type="text" name="nombre" value="<%=usu.getNombre()%>"></p>
            <p><label>Apellido: </label><input type="text" name="apellido" value="<%=usu.getApellido()%>"></p>
            <p><label>Telefono: </label><input type="text" name="telefono" value="<%=usu.getTelefono()%>"></p>
            <button type="submit">Guardar</button>
	

        </form>
         
         
    </body>
</html>
