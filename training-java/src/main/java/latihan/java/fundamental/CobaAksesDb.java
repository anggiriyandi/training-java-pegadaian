/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java.fundamental;

import id.co.pegadaian.training.java.NasabahDao;
import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class CobaAksesDb {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        NasabahDao nasabahDao = new NasabahDao();
        
        nasabahDao.connect();
    }
}
