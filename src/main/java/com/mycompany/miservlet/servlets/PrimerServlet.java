/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.miservlet.servlets;

import com.mycompany.miservlet.logica.Controladora;
import com.mycompany.miservlet.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "PrimerServlet", urlPatterns = {"/PrimerServlet"})
public class PrimerServlet extends HttpServlet {
    
    
    //creo instancia de la controladora
    Controladora control=new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }

    //listar usuario
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //crear lista de usuarios 
        List<Usuario> listaUsuarios=new ArrayList<>();
        listaUsuarios=control.traerUsuarios();
        
        //crear objeto sesion
        HttpSession misesion=request.getSession();
        //enviar objeto sesion con la lista de usuarios y redirigir a MostrarUsuarios.jsp
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        response.sendRedirect("MostrarUsuarios.jsp");
        
    }

    //grabar usuario
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recivo los controles de index.jsp
        String dni=request.getParameter("dni");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        
        //creo un objeto tipo usuario
        
        Usuario usu=new Usuario();
        
        //asigno el valor a cada variable de la clase
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
       
        
        //envio la clase a la controladora
        
        control.crearUsuario(usu);
        
        response.sendRedirect("index.jsp");
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
