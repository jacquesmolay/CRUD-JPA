/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.miservlet.servlets;

import com.mycompany.miservlet.logica.Controladora;
import com.mycompany.miservlet.logica.Usuario;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    Controladora control=new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
       
    }

    //recivo id para modificar desde el index.jsp
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recivo id
        int  id_editar=  Integer.parseInt(request.getParameter("id_usuarioEdit"));
        
        //envio el dato para buscar usuarios
        Usuario usu= control.traerUsuario(id_editar);
        
        //creo sesion par enviar usuario encontrado a editar.jsp
        HttpSession misesion=request.getSession();
        misesion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("editar.jsp");
        
        
    }

    //modificar usurio
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //guardo valores enviados por editar.jsp
        String dni=request.getParameter("dni");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        
        
        //asigno usuEditar enviado desde editar.jsp a una clase usuario
        Usuario usu=(Usuario)request.getSession().getAttribute("usuEditar");
        
        //asigno valor a la clase
        
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        
        //modifico y envio a index.jsp
        control.editarUsuario(usu);
        
         response.sendRedirect("index.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
