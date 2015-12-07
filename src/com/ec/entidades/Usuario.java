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
    private String nick="";
    private String nombre="";
    private String apellido="";
    private String contrasena="";
    private Double salario= Double.parseDouble("0");
    private String correo="";
    private String pregunta="";
    private String respuesta="";

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String ruc, String nick, String nombre, String apellido, String contrasena, Double salario, String correo, String pregunta, String respuesta) {
        this.id_usuario = id_usuario;
        this.ruc = ruc;
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.salario = salario;
        this.correo = correo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

        public Usuario( String ruc, String nick, String nombre, String apellido, String contrasena, Double salario, String correo, String pregunta, String respuesta) {
        this.ruc = ruc;
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.salario = salario;
        this.correo = correo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
}
