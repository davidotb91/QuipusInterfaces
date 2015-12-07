/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 * 
 * @author OMAR S
 */
public class Conexion {
	static Connection cn;

	public Conexion() {
	}

	public static Connection enlace() throws SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			cn = DriverManager.getConnection("jdbc:sqlite:orfa_database.db");

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()
					+ ". Por favor tome nota de este mensaje y solicite ayuda a trav�s de la herramienta Tickets de SourceForge.");
		}
		return cn;
	}
}