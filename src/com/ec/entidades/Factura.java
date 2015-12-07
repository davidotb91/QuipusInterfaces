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
public class Factura {
    private Integer id_Factura;
    private String numeroFactura;
    private Integer diaFactura;
    private Integer mesFactura;
    private Float alimentacion;
    private Float vestiemnta;
    private Float salud;
    private Float educacion;
    private Float vivienda;
    private Float otros;
    private Float subtotal;
    private Float valorIva;
    private Float valorTotal;
    private String nombreProveedor;
    private Integer proveedor_id_Proveedor;
    private Integer configuracion_anio_conf;

    public Factura() {
        
        
    }

    public Factura(Integer id_Factura, String numeroFactura, Integer diaFactura, Integer mesFactura,Float alimentacion,Float vestimenta,Float salud, Float educacion, Float vivienda,Float otros,Float subtotal,Float valorIva,Float valorTotal, String nombreProveedor,Integer proveedor_id_Proveedor,Integer configuracion_anio_conf )
    {
        this.id_Factura=id_Factura;
        this.numeroFactura=numeroFactura;
        this.diaFactura=diaFactura;
        this.mesFactura=mesFactura;
        this.alimentacion=alimentacion;
        this.vestiemnta=vestimenta;
        this.salud = salud;
        this.educacion=educacion;
        this.vivienda=vivienda;
        this.otros=otros;
        this.subtotal=subtotal;
        this.valorIva=valorIva;
        this.valorTotal=valorTotal;
        this.nombreProveedor=nombreProveedor;
        this.proveedor_id_Proveedor=proveedor_id_Proveedor;
        this.configuracion_anio_conf=configuracion_anio_conf;
                
        
    }
    
      public Factura(String numeroFactura, Integer diaFactura, Integer mesFactura,Float alimentacion,Float vestimenta,Float salud, Float educacion, Float vivienda,Float otros,Float subtotal,Float valorIva,Float valorTotal, String nombreProveedor,Integer proveedor_id_Proveedor,Integer configuracion_anio_conf )
    {
        this.numeroFactura=numeroFactura;
        this.diaFactura=diaFactura;
        this.mesFactura=mesFactura;
        this.alimentacion=alimentacion;
        this.vestiemnta=vestimenta;
        this.salud = salud;
        this.educacion=educacion;
        this.vivienda=vivienda;
        this.otros=otros;
        this.subtotal=subtotal;
        this.valorIva=valorIva;
        this.valorTotal=valorTotal;
        this.nombreProveedor=nombreProveedor;
        this.proveedor_id_Proveedor=proveedor_id_Proveedor;
        this.configuracion_anio_conf=configuracion_anio_conf;
                
        
    }
    
    public Integer getId_Factura() {
        return id_Factura;
    }

    public void setId_Factura(Integer id_Factura) {
        this.id_Factura = id_Factura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getDiaFactura() {
        return diaFactura;
    }

    public void setDiaFactura(Integer diaFactura) {
        this.diaFactura = diaFactura;
    }

    public Integer getMesFactura() {
        return mesFactura;
    }

    public void setMesFactura(Integer mesFactura) {
        this.mesFactura = mesFactura;
    }

    public Float getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Float alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Float getVestiemnta() {
        return vestiemnta;
    }

    public void setVestiemnta(Float vestiemnta) {
        this.vestiemnta = vestiemnta;
    }

    public Float getSalud() {
        return salud;
    }

    public void setSalud(Float salud) {
        this.salud = salud;
    }

    public Float getEducacion() {
        return educacion;
    }

    public void setEducacion(Float educacion) {
        this.educacion = educacion;
    }

    public Float getVivienda() {
        return vivienda;
    }

    public void setVivienda(Float vivienda) {
        this.vivienda = vivienda;
    }

    public Float getOtros() {
        return otros;
    }

    public void setOtros(Float otros) {
        this.otros = otros;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public void setValorIva(Float valorIva) {
        this.valorIva = valorIva;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getProveedor_id_Proveedor() {
        return proveedor_id_Proveedor;
    }

    public void setProveedor_id_Proveedor(Integer proveedor_id_Proveedor) {
        this.proveedor_id_Proveedor = proveedor_id_Proveedor;
    }

    public Integer getConfiguracion_anio_conf() {
        return configuracion_anio_conf;
    }

    public void setConfiguracion_anio_conf(Integer configuracion_anio_conf) {
        this.configuracion_anio_conf = configuracion_anio_conf;
    }
    
    
    
    
}
