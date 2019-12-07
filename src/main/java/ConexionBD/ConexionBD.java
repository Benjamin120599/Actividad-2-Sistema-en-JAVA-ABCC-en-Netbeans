package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private Connection conexion;
    private Statement stm;
    private PreparedStatement pstm; // Para proyecto final con objetivo de evitar SQL Injection
    ResultSet rs = null;

    public ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/BD_Escuela?serverTimezone=UTC";
            conexion = DriverManager.getConnection(url, "root", "password");

            //System.out.println("Magia magia con BD, ya casi soy ISC");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el controlador.");
        } catch (SQLException e) {
            System.out.println("No se pudo conectar al servidor.");
            e.printStackTrace();
        } finally {
            
        }
    }

    public void cerrarConexion() {
        try {
            stm.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ejecutarInstruccion(String sql) {
        try {
            stm = conexion.prepareStatement(sql);
            int ejecucion;
            ejecucion = stm.executeUpdate(sql);
            return ejecucion == 1 ? true : false;
        } catch (SQLException e) {
            System.out.println("No se pudo ejecutar la instrucci�n SQL");
            return false;
        }
    }

    public ResultSet ejecutarConsultaRegistros(String sql) {

        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("No se pudo ejecutar la consulta SQL");
        }

        return rs;
    }

    public static void main(String[] args) {
        new ConexionBD();
    }

}
