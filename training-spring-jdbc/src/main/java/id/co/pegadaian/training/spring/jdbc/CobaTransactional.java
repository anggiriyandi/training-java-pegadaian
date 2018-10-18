/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.jdbc;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author anggi
 */
public class CobaTransactional {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        
        TransactionalService transactionalService = context.getBean("transactionalService", TransactionalService.class);
        
        Nasabah nasabah1 = new Nasabah();
        nasabah1.setNama("anggi");
        nasabah1.setId("01");
        nasabah1.setJenisKelamin(JenisKelamin.PRIA);
        
        
        Nasabah nasabah2 = new Nasabah();
        nasabah2.setNama("wahyu");
        nasabah2.setId("002");
        nasabah2.setJenisKelamin(JenisKelamin.PRIA);
        
        
        transactionalService.simpanTransactional(nasabah1, nasabah2);
    }
    
}
