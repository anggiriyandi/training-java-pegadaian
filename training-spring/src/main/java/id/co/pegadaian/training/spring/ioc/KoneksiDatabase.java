/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class KoneksiDatabase {

    private String dbDriver; 
    private String dbUrl ;
    private String dbUsername ;
    private String dbPassword ;

    Connection connection;

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(dbDriver);
        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Koneksi Berhasil");
    }

    public void disconnect() throws SQLException {
        System.out.println("menjalankan method disconnect");
        if (connection != null) {
            connection.close();
        }
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
}
