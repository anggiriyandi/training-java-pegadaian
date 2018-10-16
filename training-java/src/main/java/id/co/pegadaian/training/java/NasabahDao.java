/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    private final String SQL_INSERT = "insert into nasabah (id,nama,jenis_kelamin) values (?,?,?)";
    
    
    public void connect() throws ClassNotFoundException, SQLException{
        Class.forName(dbDriver);
        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Koneksi Berhasil");
    }
    
    public void disconnect() throws SQLException{
        if(connection != null){
            connection.close();
        }
    }
    
    public void simpan(Nasabah nasabah) throws SQLException{
        
        PreparedStatement ps = connection.prepareStatement(SQL_INSERT);
        ps.setString(1, nasabah.getId());
        ps.setString(2, nasabah.getNama());
        ps.setString(3, nasabah.getJenisKelamin().toString());
        ps.executeUpdate();
    }
    
}
