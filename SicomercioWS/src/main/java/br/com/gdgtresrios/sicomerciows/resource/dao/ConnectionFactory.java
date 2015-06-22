/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Wanderlei
 */
public class ConnectionFactory {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/gdg_centrosul";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "12345678";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    public static final Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn, PreparedStatement pstm, ResultSet rs) {
        try {

            if (conn != null) {
                conn.close();
            }

            if (pstm != null) {
                pstm.close();
            }

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
