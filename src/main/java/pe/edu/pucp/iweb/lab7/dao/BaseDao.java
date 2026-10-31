package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Ejercicio 2a: DAO base.
 *
 *  - Esta clase debe ser ABSTRACTA.
 *  - SedeDao y EquipoDao deben heredar de ella y obtener la conexión
 *    únicamente con getConnection().
 */
public abstract class BaseDao { // TODO 2a: convertir en clase abstracta

    public Connection getConnection() throws SQLException {
        // TODO 2a: cargar el driver (com.mysql.cj.jdbc.Driver) y retornar la conexión

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/telecom_andina";
        return DriverManager.getConnection(url,user,pass);

    }

}
