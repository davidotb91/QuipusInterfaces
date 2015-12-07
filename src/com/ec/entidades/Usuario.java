/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entidades;

import java.math.BigDecimal;

/**
 *
 * @author gato
 */
public class Usuario {
    private Integer id_usuario;
    private String ruc="999999999";
    private String nombre="";
    private String contrasena="";
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public Usuario() {
    }
    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public Usuario(Integer id_usuario, String ruc, String nombre, String contrasena) {
        this.id_usuario = id_usuario;
        this.ruc = ruc;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

        public Usuario( String ruc, String nombre,String contrasena) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
        
    
}
