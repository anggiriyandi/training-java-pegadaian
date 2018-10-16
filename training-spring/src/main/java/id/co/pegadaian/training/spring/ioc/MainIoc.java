/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class MainIoc {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        koneksiDatabase.setDbDriver("com.mysql.jdbc.Driver");
        koneksiDatabase.setDbUrl("jdbc:mysql://localhost/latihan_java");
        koneksiDatabase.setDbUsername("root");
        koneksiDatabase.setDbPassword("admin");
        
        NasabahDao nasabahDao = new NasabahDao(koneksiDatabase);
        
        Nasabah nasabah = new Nasabah();
        nasabah.setId("2");
        nasabah.setNama("wahyu");
        nasabah.setJenisKelamin(JenisKelamin.PRIA);
        
        nasabahDao.simpan(nasabah);
    }
    
}
