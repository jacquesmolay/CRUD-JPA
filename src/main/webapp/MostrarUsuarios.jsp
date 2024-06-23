<%-- 
    Document   : MostrarUsuarios
    Created on : 19-06-2024, 21:24:45
    Author     : el_pulento
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.miservlet.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <h1>lista de Usuarios Registrados</h1>
        <% 
        
             //recivo datos del servlet
            List<Usuario>listaUsuarios=(List)request.getSession().getAttribute("listaUsuarios");
            int cont=1;
            for(Usuario usu:listaUsuarios){ 
                      
        %>
        <!-- asigno el valor de la lista  listaUsuarios para mostrarlos en la pagina-->
                <p><b>Usuario N° <%=cont%></b></p>
                <p>Id: <%=usu.getId()%></p>
                <p>DNI: <%=usu.getDni()%></p>
                <p>Nombre: <%=usu.getNombre()%></p>
                <p>Apellido: <%=usu.getApellido()%></p>
                <p>Telefono: <%=usu.getTelefono()%></p>
                
                <p>-------------------------------------</p>
                
                <% cont=cont+1;%>
        
        <%}%>
        
        
    </body>
</html>
