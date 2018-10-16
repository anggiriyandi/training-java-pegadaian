/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author anggi
 */
public class MainRekeningSpring {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        
        RekeningDao rekeningDao = (RekeningDao) context.getBean("rekeningDao");
        rekeningDao.simpanRekening("123");
    
    }
}
