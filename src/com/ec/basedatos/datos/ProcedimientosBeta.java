    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.basedatos.datos;

import com.ec.basedatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cchristico
 */
public class ProcedimientosBeta {
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    public static void registrar ( String tabla ,String [] campos, String [] Atributos)
    {
        try{
        cn = Conexion.enlace();
            Statement s = cn.createStatement();
           String call = "insert into "+tabla+"(";
           for (int i =0; i<campos.length-1;i++)
           {
               call += campos[i]+",";
           }
           call += campos[campos.length-1]+") values (";
           for (int i =0 ; i< Atributos.length-1;i++)
           {
               call += Atributos[i]+",";
           }
        call += Atributos[Atributos.length-1]+")";
        
        System.out.println("Insert "+call);
            s.executeUpdate(call);
            s.close();
            cn.close();
    }
    catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
    
}
