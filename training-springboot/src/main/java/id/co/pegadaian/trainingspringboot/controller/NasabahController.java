/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author anggi
 */

@Controller
public class NasabahController {
    
    
    @GetMapping("/nasabah/form")
    public String formNasabah(){
        return "nasabah/form";
    }
    
}
