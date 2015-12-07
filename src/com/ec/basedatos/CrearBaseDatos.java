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
            String sqlTablaUsuario = "CREATE TABLE IF NOT EXISTS IF NOT EXISTS Usuario (" +
"	id_usuario INTEGER NOT NULL," +
"	nombre_usuario CHARACTER(25) NOT NULL ," +
"	contraseña_usuario CHARACTER(10) NOT NULL ," +
"	cedula_usuario CHARACTER(13) NOT NULL ," +
"	PRIMARY KEY(id_usuario asc));";
            
            String sqlTablaDetalle="CREATE TABLE IF NOT EXISTS IF NOT EXISTS Detalle "
                    + "( id_detalle INTEGER NOT NULL , "
                    + "usuario_id_usuario INTEGER NOT NULL "
                    + ",factura_id_factura INTEGER NOT NULL ,	"
                    + "proveedor_id_proveedor INTEGER NOT NULL , "
                    + "FOREIGN KEY (usuario_id_usuario) "
                    + "REFERENCES Usuario(id_usuario), "
                    + "FOREIGN KEY (factura_id_factura) "
                    + "REFERENCES Factura(id_factura), "
                    + "FOREIGN KEY (proveedor_id_proveedor) "
                    + "REFERENCES Proveedor(id_proveedor), "
                    + "PRIMARY KEY (id_detalle) );";

            String sqlTablaFactura = "CREATE TABLE IF NOT EXISTS Factura (" +
            "id_factura INTEGER NOT NULL ," +
            "fecha  NOT NULL ," +
            "PRIMARY KEY(id_factura asc));";

            String sqlTablaProveedor = "CREATE TABLE IF NOT EXISTS Proveedor "
                    + "(id_proveedor INTEGER NOT NULL ,"
                    + "nombre_proveedor CHARACTER(20) NOT NULL ,"
                    + "rol CHARACTER(20) NOT NULL ,"
                    + "PRIMARY KEY(id_proveedor asc));";
            String sqlTablaRubro="CREATE TABLE IF NOT EXISTS Rubro "
                    + "( id_rubro INTEGER NOT NULL , "
                    + "valor_actual DECIMAL(6,3) NOT NULL , "
                    + "detalle_rubro_id_detalle_rubro INTEGER NOT NULL , "
                    + "FOREIGN KEY (detalle_rubro_id_detalle_rubro) "
                    + "REFERENCES Detalle_Rubro(id_detalle_rubro), "
                    + "PRIMARY KEY(id_rubro asc));";
            
            String sqlTablaDetalloRubro = "CREATE TABLE IF NOT EXISTS Detalle_Rubro "
                    + "( id_detalle_rubro INTEGER NOT NULL , "
                    + "nombre_rubro CHARACTER(20) NOT NULL , "
                    + "valor_máximo DECIMAL(6,3) NOT NULL , "
                    + "tipo  NOT NULL , PRIMARY KEY(id_detalle_rubro asc));";
            String sqlTablaRubroFactura ="CREATE TABLE IF NOT EXISTS Rubro_Factura ("
                    + " rubro_id_rubro INTEGER NOT NULL , "
                    + "factura_id_factura INTEGER NOT NULL , "
                    + "FOREIGN KEY (rubro_id_rubro) "
                    + "REFERENCES Rubro(id_rubro), "
                    + "FOREIGN KEY (factura_id_factura) "
                    + "REFERENCES Factura(id_factura);";
            stmt.executeUpdate(sqlTablaUsuario);
            stmt.executeUpdate(sqlTablaFactura);
            stmt.executeUpdate(sqlTablaProveedor);
            stmt.executeUpdate(sqlTablaDetalloRubro);
            stmt.executeUpdate(sqlTablaRubro);
            stmt.executeUpdate(sqlTablaDetalle);
            stmt.executeUpdate(sqlTablaRubroFactura);
            
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
