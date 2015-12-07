/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entidades;

/**
 *
 * @author Cchristico
 */

public class Proveedor {
    private Integer idProveedor;
    private String rucProveedor="999999999";
    private String nombreProveedor="";
    private String ciudadProveedor="";
    private String direccionProveedor="";
    private Integer telefonoProveedor;

    
    public Proveedor() {
    }
    
    public Proveedor(Integer idProveedor,String rucProveedor,String nombreProveedor,String ciudadProveedor,String direccionProveedor,Integer telefonoProveedor )
    {
        this.idProveedor=idProveedor;
        this.rucProveedor=rucProveedor;
        this.ciudadProveedor=ciudadProveedor;
        this.direccionProveedor=direccionProveedor;
        this.telefonoProveedor=telefonoProveedor;
        
    }

     public Proveedor(String rucProveedor,String nombreProveedor,String ciudadProveedor,String direccionProveedor,Integer telefonoProveedor )
    {
        this.rucProveedor=rucProveedor;
        this.nombreProveedor=nombreProveedor;
        this.ciudadProveedor=ciudadProveedor;
        this.direccionProveedor=direccionProveedor;
        this.telefonoProveedor=telefonoProveedor;
        
    }
    
    
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCiudadProveedor() {
        return ciudadProveedor;
    }

    public void setCiudadProveedor(String ciudadProveedor) {
        this.ciudadProveedor = ciudadProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public Integer getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(Integer telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
    
   
  
    
    
}
