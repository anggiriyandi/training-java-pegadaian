/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.jdbc;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author anggi
 */

@Transactional
@Service
public class TransactionalService {
    
    @Autowired 
    private NasabahDao nasabahDao;
    
    
    public void simpanTransactional(Nasabah nasabah1, Nasabah nasabah2) throws SQLException, ClassNotFoundException{
        
        // logger
        
        nasabahDao.simpan(nasabah1);   // rekeninig     
        nasabahDao.simpan(nasabah2);    // mutasi
        
//        logger
        
        throw new IllegalStateException("sengaja di buat error");
        
    }
    
}
