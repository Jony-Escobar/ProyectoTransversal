package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    //Metodo constructor
    private Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Setup the connection with the DB
                connection = DriverManager.getConnection(
                        URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC", USUARIO, PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD" + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers" + ex.getMessage());
            }
        }
        return connection;
    }
}
