/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.aop;

import id.co.pegadaian.training.spring.ioc.KoneksiDatabase;
import id.co.pegadaian.training.spring.ioc.NasabahDao;
import id.co.pegadaian.training.spring.ioc.RekeningDao;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author anggi
 */
public class CobaAop {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");

        KoneksiDatabase koneksiDatabase = (KoneksiDatabase) context.getBean("koneksiDatabaseAop");
        koneksiDatabase.connect();
        
        System.out.println("");
        System.out.println("");
        
        koneksiDatabase.disconnect();
        
        
        
        
        

    }
}
