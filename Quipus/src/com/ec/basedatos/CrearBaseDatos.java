/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.basedatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gato
 */
public class CrearBaseDatos {

    public void crearBD() {
        Connection cn = null;
        Statement stmt = null;
        try {
            cn = Conexion.enlace();
            stmt = cn.createStatement();
            String sqlTablaUsuario = "CREATE TABLE IF NOT EXISTS usuario  ("
                    + "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT   NOT NULL ,"
                    + "ruc_usuario CHARACTER(15) NOT NULL ,"
                    + "nick_usuario CHARACTER(20) NOT NULL ,"
                    + "nombre_usuario CHARACTER(50) NOT NULL ,"
                    + "apellido_usuario CHARACTER(50) NOT NULL ,"
                    + "password_usuario CHARACTER(20) NOT NULL ,"
                    + "salario_usuario DOUBLE NOT NULL ,"
                    + "correo_usuario CHARACTER(150) NOT NULL ,"
                    + "pregunta_usuario CHARACTER(100) NULL ,"
                    + "respuesta_usuario CHARACTER(100) NULL);";

            String sqlTablaFactura = "CREATE TABLE IF NOT EXISTS factura ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT   NOT NULL ,"
                    + "numero_factura CHARACTER(20) NOT NULL ,"
                    + "dia_factura INTEGER NOT NULL ,"
                    + "mes_factura INTEGER NOT NULL ,"
                    + "alimentacion FLOAT NULL ,"
                    + "vestimenta FLOAT NULL ,"
                    + "salud FLOAT NULL ,"
                    + "educacion FLOAT NULL ,"
                    + "vivienda FLOAT NULL ,"
                    + "otros FLOAT NULL ,"
                    + "subtotal FLOAT NOT NULL ,"
                    + "valor_iva FLOAT NOT NULL ,"
                    + "valor_total FLOAT NOT NULL ,"
                    + "nombre_proveedor VARCHAR(50) NOT NULL ,"
                    + "proveedor_id_proveedor INTEGER NOT NULL ,"
                    + "configuracion_anio_conf INTEGER NOT NULL ,"
                    + "usuario_id_usuario INTEGER NOT NULL ,"
                    + "usuario_nick_usuario CHARACTER(20) NOT NULL ,"
                    + "usuario_correo_usuario CHARACTER(150) NOT NULL ,"
                    + "FOREIGN KEY (usuario_id_usuario) REFERENCES usuario(id_usuario),"
                    + "FOREIGN KEY (usuario_nick_usuario) REFERENCES usuario(nick_usuario),"
                    + "FOREIGN KEY (usuario_correo_usuario) REFERENCES usuario(correo_usuario),"
                    + "FOREIGN KEY (proveedor_id_proveedor) REFERENCES proveedor(id_proveedor),"
                    + "FOREIGN KEY (configuracion_anio_conf) REFERENCES configuracion(anio_conf))";

            String sqlTablaProveedor = "CREATE TABLE IF NOT EXISTS proveedor ("
                    + "id_proveedor INTEGER PRIMARY KEY AUTOINCREMENT   NOT NULL ,"
                    + "ruc_proveedor CHARACTER(15) NOT NULL ,"
                    + "nombre_proveedor CHARACTER(50) NOT NULL ,"
                    + "ciudad_proveedor CHARACTER(30)  NULL ,"
                    + "direccion_proveedor CHARACTER(150) NULL ,"
                    + "telefono_proveedor INTEGER  NULL)";

            String sqlTablaConfiguracion = "CREATE TABLE IF NOT EXISTS configuracion ("
                    + "anio_conf INTEGER PRIMARY KEY NOT NULL ,"
                    + "limite_alimentacion FLOAT NOT NULL ,"
                    + "limite_salud FLOAT NOT NULL ,"
                    + "limite_vivienda FLOAT NOT NULL ,"
                    + "limite_vestimenta FLOAT NOT NULL ,"
                    + "limite_eduacion FLOAT NOT NULL)";

            stmt.executeUpdate(sqlTablaUsuario);
            stmt.executeUpdate(sqlTablaFactura);
            stmt.executeUpdate(sqlTablaProveedor);
            stmt.executeUpdate(sqlTablaConfiguracion);
            stmt.close();
            cn.close();
            //System.out.println("La tablas han sido creadas exitosamente.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            JOptionPane
                    .showMessageDialog(
                    null,
                    "Error: "
                    + e.getMessage()
                    + ". Por favor tome nota de este mensaje y solicite ayuda a trav�s de la herramienta Tickets de SourceForge.");

        }
    }
}
