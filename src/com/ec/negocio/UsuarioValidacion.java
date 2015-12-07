/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.negocio;
import com.ec.utilidades.UtildiadesUsuario;
import javax.swing.JTextField;
import com.ec.entidades.Usuario;
import javax.swing.JOptionPane;
import com.ec.basedatos.datos.ProcedimientosBeta;
import com.ec.basedatos.datos.constantesUsuario;

/**
 *
 * @author Cchristico
 */
public class UsuarioValidacion {
    Usuario usr = new Usuario();
    
    public void  crearUsr(Usuario usuario )
    {
        if (sonCamposValidos(usuario))
        {
            JOptionPane.showMessageDialog(null, "Usuario Registrado, ya puede ingresar");
//                ProcedimientosBeta.registrar(constantesUsuario.tablaUsuario, , constantesUsuario.campos);
        }
    }
    
    /*
    public void crearConPreguntas(Usuario usuario, UsuarioPreguntaSeguridad pregunta1, UsuarioPreguntaSeguridad pregunta2) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
	        if(sonCamposValidos(usuario, pregunta1,pregunta2))
			{
				String contrasena= usuario.getPasswordUsuario();
	        	JOptionPane.showMessageDialog(null, "Usuario Registrado, ya puedes ingresar!");
	        	try {
					usuario.setPasswordUsuario(Utilidades.getPasswordHash(String.valueOf(contrasena)));
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	ProcedimientosBeta.registrar(ConstantesUsuario.campos,usuario.obtenerAtributos(),pregunta1,pregunta2);
			}
		}
    */
    private String MensajeError="";
    UtildiadesUsuario UserUtil = new UtildiadesUsuario();
    
    private boolean sonCamposValidos(Usuario usuario)
	{
          UtildiadesUsuario validacion = new UtildiadesUsuario();
validacion.validarCampoVacio(usuario.getNombre().trim(), "Nombre");
validacion.validarCampoVacio(usuario.getContrasena().trim(), "Contraseña");
validacion.validarCampoVacio(usuario.getRuc().trim(), "C.I.");
		/* Si existe mensaje de error, el metodo validacion.existeMensajeError() devolveria true (existe mensaje de error)
		 * por lo que el metodo sonCamposValidos() debe devolver false, puesto que al menos uno de los
		 * campos no es valido, lo mismo en viceversa.
		 * 
		 */
		return !validacion.existeMensajeError();		
	}
    
    
    private boolean camposValidos (JTextField txtNombre, JTextField txtContraseña, JTextField txtCedula)
    {
        UserUtil.validarCampoVacio(txtNombre.getText().trim(), "Nombre");
        UserUtil.validarCampoVacio(txtContraseña.getText().trim(), "Nombre");
        UserUtil.validarCampoVacio(txtCedula.getText().trim(), "C.I");
        return  !UserUtil.existeMensajeError();
    }
    
    
}
