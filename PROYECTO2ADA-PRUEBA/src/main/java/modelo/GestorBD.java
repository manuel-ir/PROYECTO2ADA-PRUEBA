package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBD {
    
        private final String URL = "jdbc:mysql://localhost:3306/mvcADA";
    private final String USER = "root"; 
    private final String PASSWORD = "1234"; 
    
    private Connection con;

    // Conexión
    public GestorBD() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e.getMessage());
        }
    }

    // Método para el LOGIN
    // Devuelve true si el usuario existe y la contraseña coincide
    public boolean validarUsuario(String email, String password) {
        String sql = "SELECT * FROM USUARIO WHERE email = ? AND password = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, email);
            pst.setString(2, password);
            
            try (ResultSet rs = pst.executeQuery()) {
                // Si rs.next() devuelve true, es que encontró al usuario
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error en login: " + e.getMessage());
            return false;
        }
    }
    
    // Método para el REGISTRO (Opcional pero útil ya que tienes el botón)
    public boolean registrarUsuario(String nombre, String email, String password) {
        String sql = "INSERT INTO USUARIO (nombre_usuario, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, email);
            pst.setString(3, password);
            
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error en registro: " + e.getMessage());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    

