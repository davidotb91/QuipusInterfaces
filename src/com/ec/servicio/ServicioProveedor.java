/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.basedatos.Conexion;
import com.ec.entidades.Proveedor;
import com.ec.entidades.Usuario;
//import static com.ec.servicio.ServicioUsuario.cn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cchristico
 */
public class ServicioProveedor {
    
     static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    public void Crear(Proveedor proveedor) {
        try {
            cn = Conexion.enlace();
            Statement s = cn.createStatement();
            String query = "INSERT INTO proveedor("
                    + " ruc_proveedor,"
                    + " nombre_proveedor,"
                    + "ciudad_proveedor,"
                    + "direccion_proveedor,"
                    + "telefono_proveedor)values ("
                    +"'"
                    + proveedor.getRucProveedor()
                    + "','"
                    + proveedor.getNombreProveedor()
                    + "','"
                    + proveedor.getCiudadProveedor()
                    + "','"
                    + proveedor.getDireccionProveedor()
                    + "','"
                    + proveedor.getTelefonoProveedor()
                    + "')";
            System.out.println("Consulta proveedor "+query);
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "El registro ha sido creado exitósamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ResultSet findProveedor(String ruc) {


        try {
            // Conectar a la base de datos
              cn = Conexion.enlace();
            // preparamos la sentencia
            Statement stmt =cn.createStatement();

            String sql = "select * from proveedor u where ruc_proveedor like  '%"+ruc+"%'";
            ResultSet resultado = stmt.executeQuery(sql);

            return resultado;

        } catch (Exception ex) {
            System.out.println("Error en la consulta");
        }


        return null;
    }
    
    public static ResultSet consultacmb() throws SQLException {

        String seleccion ="Select nombre_proveedor from proveedor";
        
         try {
            // Conectar a la base de datos
              cn = Conexion.enlace();
            // preparamos la sentencia
            Statement stmt =cn.createStatement();

            ResultSet resultado = stmt.executeQuery(seleccion);

            return resultado;

        } catch (Exception ex) {
            System.out.println("Error en la consulta");
        }


        return null;
    }


}

