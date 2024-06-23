<%-- 
    Document   : index
    Created on : 19-06-2024, 21:21:32
    Author     : el_pulento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <!-- crear usuario enviando al servlet PrimerServlet-->
        
         <h1>Datos del usuario</h1>

        <form action="PrimerServlet" method="POST">


            <p><label>Dni: </label><input type="text" name="dni"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type="submit">ENVIAR</button>
	

        </form>
        
          <!-- listar usuarios servlet PrimerServlet-->
        
        <h1>Ver lista de Usuarios</h1>
        <p>Para ver los datos de los usuarios cargados haga click en el siguiente boton</p>
        
        <form action="PrimerServlet" method="GET">
            
        
            <button type="submit">Mostrar usuarios</button>
            
        </form>
        
        
         <!-- eliminar usuarios servlet SvEliminar-->
          
        <h1>Eliminar Usuario</h1>
        <p>Ingrese el id del usuario que quiere eliminar</p>
        
        <form action="SvEliminar" method="POST">
            
            <p><label>Id: </label><input type="text" name="id_usuario"></p>
        
            <button type="submit">Eliminar Usuario</button>
            
        </form>
        
        
         <!-- editar usuarios servlet SvEditar-->
         
        <h1>Editar Usuario</h1>
        <p>Ingrese el id del usuario que quiere modificar</p>
        
        <form action="SvEditar" method="GET">
            
            <p><label>Id: </label><input type="text" name="id_usuarioEdit"></p>
        
            <button type="submit">Editar Usuario</button>
            
        </form>
        
        
        
        
    </body>
</html>
