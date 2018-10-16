/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class NasabahDao {
    
    private KoneksiDatabase koneksiDatabase;
    
    public NasabahDao(KoneksiDatabase koneksiDatabase) {
        this.koneksiDatabase = koneksiDatabase;
    }
    
    private final String SQL_INSERT = "insert into nasabah (id,nama,jenis_kelamin) values (?,?,?)";
    
    public void simpan(Nasabah nasabah) throws SQLException, ClassNotFoundException {
        koneksiDatabase.connect();
        
        PreparedStatement ps = koneksiDatabase.connection.prepareStatement(SQL_INSERT);
        ps.setString(1, nasabah.getId());
        ps.setString(2, nasabah.getNama());
        ps.setString(3, nasabah.getJenisKelamin().toString());
        ps.executeUpdate();
        
        koneksiDatabase.disconnect();
    }
}
