package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public boolean agregarUsuario(Usuario u) {

        String sql3 = "INSERT INTO Usuarios VALUES('"+u.getUsuario()+"', '"+u.getContraseña()+"')";
        ConexionBD conexion = new ConexionBD();
        return conexion.ejecutarInstruccion(sql3);
    }

    public Usuario buscarUsuario(String dato) {
        Usuario user = new Usuario();
        String sql = "SELECT * FROM Usuarios WHERE Usuario = '"+dato+"';";
        ConexionBD conexion = new ConexionBD();
        ResultSet rs = conexion.ejecutarConsultaRegistros(sql);

        try {
            rs.last();
            user.setUsuario(rs.getString(1));
            user.setContraseña(rs.getString(2));
        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        }
        return user;
    }
    
}
