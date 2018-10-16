/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author anggi
 */

@Service
public class RekeningDao {
    
    @Autowired
    @Qualifier("koneksiDatabaseBean")
    private KoneksiDatabase koneksiDatabase;
    
    public void simpanRekening(String norek) throws ClassNotFoundException, SQLException{
        koneksiDatabase.connect();
        System.out.println("db url : "+ koneksiDatabase.getDbUrl());
        System.out.println("db username : "+ koneksiDatabase.getDbUsername());
        
        System.out.println("Menyimpan Data norek : "+norek);
    }
}
