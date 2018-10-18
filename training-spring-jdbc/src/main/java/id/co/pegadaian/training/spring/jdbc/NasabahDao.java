/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author anggi
 */

@Service
public class NasabahDao {
    
    @Autowired
    private DataSource dataSource;
    
    
    private final String SQL_INSERT = "insert into nasabah (id,nama,jenis_kelamin) values (?,?,?)";
    
    public void simpan(Nasabah nasabah) throws SQLException, ClassNotFoundException {
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        
        jdbcTemplate.update("insert into nasabah (id,nama,jenis_kelamin) values (?,?,?)", 
                nasabah.getId(),
                nasabah.getNama(),
                nasabah.getJenisKelamin().toString());
        
    }
}
