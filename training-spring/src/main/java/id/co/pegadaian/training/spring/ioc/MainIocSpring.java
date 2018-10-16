/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import com.sun.jmx.snmp.SnmpDataTypeEnums;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author anggi
 */
public class MainIocSpring {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        
        KoneksiDatabase koneksiDatabase = (KoneksiDatabase) context.getBean("koneksiDatabaseBean");
        NasabahDao nasabahDao = (NasabahDao) context.getBean("nasabahDao");
        
//        System.out.println("driver name : " + koneksiDatabase.getDbDriver());
//        System.out.println("db username : " + koneksiDatabase.getDbUsername());
//        System.out.println("db password : " + koneksiDatabase.getDbPassword());
//        
//        NasabahDao nasabahDao = new NasabahDao(koneksiDatabase);
        
        nasabahDao.testKoneksi();
    }
}
