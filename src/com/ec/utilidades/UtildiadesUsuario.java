/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Cchristico
 */
public class UtildiadesUsuario {
	private String mensajeError = "";
        /**
	 * Método para validar el contenido de campos de tipo JTextField
	 * 
	 * @param textoDeCampo
	 *            un objeto de tipo JFormattedTextField
	 * @param nombreDeCampo
	 *            dato de tipo String referencial al contenido del objeto
	 */
	public void validarCampoVacio(String textoDeCampo, String nombreDeCampo) {

		if (textoDeCampo.trim().equals("-1") || textoDeCampo.trim().equals("")
				|| textoDeCampo.trim().equals("null")
				|| textoDeCampo.trim().replaceAll("\\s", "").trim().equals("")) {
			mensajeError += "Campo '" + nombreDeCampo + "' esta vacio \n";
		}
	}
	/**
	 * Método para validar si el campo de cédula o ruc está correctamente
	 * llenado
	 * 
	 * @author Wilmer Valdiviezo
	 * 
	 * @param cedula
	 * @param nombreDeCampo
	 */
	public void validarCedula(String cedula, String nombreDeCampo) {

		int NUMERO_DE_PROVINCIAS = 24;// 22;

		// verifica que tenga 10 dígitos y que contenga solo valores numéricos
		if (cedula == null
				|| (cedula.trim().replaceAll("\\s", "").length() != 10 || cedula
						.trim().equals(""))) {
			mensajeError += "Campo '" + nombreDeCampo + "' no es correcto \n";
			return;
		}
		if (!((cedula.length() == 10) && cedula.matches("^[0-9]{10}$"))) {
			mensajeError += "Campo '" + nombreDeCampo + "' no es correcto \n";
			return;
		}

		// verifica que los dos primeros dígitos correspondan a un valor entre 1
		// y NUMERO_DE_PROVINCIAS
		int prov = Integer.parseInt(cedula.substring(0, 2));

		if (!((prov > 0) && (prov <= NUMERO_DE_PROVINCIAS))) {
			mensajeError += "Campo '" + nombreDeCampo + "' no es correcto \n";
			return;
		}

		// Aplicar el algoritmo de validacion de cedula
		if (!esCedulaValida(cedula)) {
			mensajeError += "Campo '" + nombreDeCampo + "' no es correcto \n";
		}
        }
                
                public boolean esCedulaValida(String cedula) {

		// verifica que el último dígito de la cédula sea válido
		int[] d = new int[10];

		// Asignamos el string a un array
		for (int i = 0; i < d.length; i++) {
			d[i] = Integer.parseInt(cedula.charAt(i) + "");
		}

		int imp = 0;
		int par = 0;

		// sumamos los duplos de posición impar
		for (int i = 0; i < d.length; i += 2) {
			d[i] = ((d[i] * 2) > 9) ? ((d[i] * 2) - 9) : (d[i] * 2);
			imp += d[i];
		}

		// sumamos los digitos de posición par
		for (int i = 1; i < (d.length - 1); i += 2) {
			par += d[i];
		}

		// Sumamos los dos resultados
		int suma = imp + par;

		// Restamos de la decena superior
		int d10 = Integer.parseInt(String.valueOf(suma + 10).substring(0, 1)
				+ "0")
				- suma;

		// Si es diez el décimo dígito es cero
		d10 = (d10 == 10) ? 0 : d10;

		// si el décimo dígito calculado es igual al digitado la cédula es
		// correcta

		return (d10 == d[9]);
                
	}
         
             public boolean existeMensajeError() {
		if (!mensajeError.equals("")) {
			JOptionPane.showMessageDialog(null, mensajeError, "Error",
					JOptionPane.ERROR_MESSAGE);
			mensajeError = "";
			return true;
		} else {
			mensajeError = "";
			return false;
		}
	}
             
                
	}
