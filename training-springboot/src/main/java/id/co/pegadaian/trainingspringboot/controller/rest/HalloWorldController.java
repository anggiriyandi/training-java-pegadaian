/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.controller.rest;

import id.co.pegadaian.trainingspringboot.entity.Nasabah;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anggi
 */

@RestController
public class HalloWorldController {
    
    @RequestMapping(method = RequestMethod.GET, value = "/halo")
    public String salam(){
        return "Selamat datang anggi !!";
    }
    
    
    @GetMapping("/getNasabah")
    public Nasabah getNasabah(){
        Nasabah nasabah = new Nasabah();
        nasabah.setId("01");
        nasabah.setAlamat("jakarta");
        nasabah.setNama("anggi");
        
        return nasabah;
    }
    
}
