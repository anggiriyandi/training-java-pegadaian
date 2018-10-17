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
public class CobaSpringJdbc {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        
        NasabahDao nasabahDao = context.getBean("nasabahDao",NasabahDao.class);
        
        Nasabah nasabah = new Nasabah();
        nasabah.setId("00123");
        nasabah.setNama("Rudi");
        nasabah.setJenisKelamin(JenisKelamin.PRIA);
        
        nasabahDao.simpan(nasabah);
    }
    
}
