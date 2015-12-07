/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;


/**
 *
 * @author gato
 */
public class ServicioUsuario {
    
    


}

/*
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    */

    /*public void Crear(Usuario usuario) {
        try {
            cn = Conexion.enlace();
            Statement s = cn.createStatement();
            String query = "INSERT INTO usuario(id_usuario,"
                    + " ruc_usuario,"
                    + " nick_usuario,"
                    + "nombre_usuario,"
                    + "apellido_usuario,"
                    + "password_usuario,"
                    + "salario_usuario, "
                    + "correo_usuario,"
                    + "pregunta_usuario,"
                    + "respuesta_usuario)values ("
                    + "(select (id_usuario+1) from usuario order by id_usuario desc  LIMIT 1)  "
                    + ",'"
                    + usuario.getRuc()
                    + "','"
                    + "','"
                    + usuario.getNombre()
                    + "','"
                    + "','"
                    + usuario.getContrasena()
                    + "','"
                    + "','"
                    +usuario.getCorreo()
                    + "','"
                    +usuario.getPregunta()
                    + "','"
                    + usuario.getRespuesta()
                    + "')";
            System.out.println("Consulta usuario "+query);
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "El registro ha sido creado exit�samente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ResultSet findUsuario(String ruc) {


        try {
            // Conectar a la base de datos
              cn = Conexion.enlace();
            // preparamos la sentencia
            Statement stmt =cn.createStatement();

            String sql = "select * from usuario u where u.ruc_usuario like  '%"+ruc+"%'";
            ResultSet resultado = stmt.executeQuery(sql);

            return resultado;

        } catch (Exception ex) {
            System.out.println("Error en la consulta");
        }


        return null;
    }
    
    public static boolean valUserLog (String Nick, String passw)
    {
        boolean existe=false;
        try{
        cn = Conexion.enlace();
        Statement stmt = cn.createStatement();
        String sql="select *from usuario u where u.nick_usuario =  '%"+Nick+"%'&&password_usuario='%"+passw+"%'";
       
        ResultSet resultado = stmt.executeQuery(sql);
       
       if (resultado.first());
                {
                    existe=true;
                    
                }
        }
        
        catch(Exception ex){
        System.out.println("Error en la consulta NikPass");
        }
    return existe; 
    }
*/

