/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miservlet.persistencia;

import com.mycompany.miservlet.logica.Usuario;
import com.mycompany.miservlet.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//creo controladora para llamar a UsuarioJpaController
public class ControladoraPersistencia {
    
    
     UsuarioJpaController usuJpa=new UsuarioJpaController();
    
    
    public void crearUsuario(Usuario usu){
        
        usuJpa.create(usu);
    }
    
    public List<Usuario> traerUsuarios(){
        
        return usuJpa.findUsuarioEntities();
        
        
    }

    public void borrarUsuario(int id_eliminar) {
        
         try {
             usuJpa.destroy(id_eliminar);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    public Usuario traerUsuario(int id_editar) {
        
        return usuJpa.findUsuario(id_editar);
       
    }

    public void editarUsuario(Usuario usu){
        
        
         try {
             usuJpa.edit(usu);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
        
       
    }
    
}
