/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import co.edu.sena.exerciseagentea.utils.MessageUtils;

/**
 * Fecha: 25/11/26
 *
 * @author Nicolas medina Objetivo: Clase para conexion a base de datos
 */
public class DBConnection {

    public static Connection connection;
    public static Statement statement;
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "agentea_db";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE_NAME, USER, PASSWORD);
            statement = connection.createStatement();
            IO.println("Conectado...");
        } catch (ClassNotFoundException | SQLException e) {
            MessageUtils.getInstance().showError("Error de conexion  la base de datos: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error desconectándose a la base de datos: " + e.getMessage());
        }
    }
}
