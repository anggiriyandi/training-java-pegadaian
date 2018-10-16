/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.ioc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author anggi
 */
@Controller
public class RekeningController {
    
    @Autowired
    private RekeningDao rekeningDao;
    
    public void simpanRekening(String norek){
        try {
            rekeningDao.simpanRekening(norek);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RekeningController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RekeningController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
