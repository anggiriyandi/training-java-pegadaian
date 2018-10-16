/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class NasabahDao {
    
    private String dbDriver = "com.mysql.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost/latihan_java";
    private String dbUsername = "root";
    private String dbPassword = "admin";
    
    Connection connection;
    
    
    public void connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Koneksi Berhasil");
    }
    
    public void disconnect() throws SQLException{
        if(connection != null){
            connection.close();
        }
    }
    
    public void simpan(Nasabah nasabah){}
    
}
