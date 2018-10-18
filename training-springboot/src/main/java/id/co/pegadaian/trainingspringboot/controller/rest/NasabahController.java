/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.controller.rest;

import id.co.pegadaian.trainingspringboot.dao.NasabahDao;
import id.co.pegadaian.trainingspringboot.entity.Nasabah;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anggi
 */

@RestController
public class NasabahController {
    
    @Autowired
    private NasabahDao nasabahDao;
    
    @PostMapping("/nasabah/simpan")
    public void simpanNasabah(@RequestBody Nasabah n){
        
        System.out.println("masuk ke simpan");
        System.out.println("id "+n.getId());
        System.out.println("nama "+n.getNama());
        System.out.println("alamat "+n.getAlamat());
        
        nasabahDao.save(n);
    } 
    
    @GetMapping("/nasabah/cariSemuaNasabah")
    public List<Nasabah> cariSemuaNasabah(){
        List<Nasabah> semuaNasabah = (List<Nasabah>) nasabahDao.findAll();
        return semuaNasabah;
    }
    
    @GetMapping("/nasabah")
    public List<Nasabah> cariNasabahByNama(@RequestParam(name = "namaNasabah") String nama){
        
        List<Nasabah> list = nasabahDao.findByNama(nama);
        return list;
    }
    
    public Nasabah cariNasabahById(String id){
        Nasabah nasabah = nasabahDao.findById(id).get();
        return nasabah;
    }
    
    
    public void deleteNasabah(){
    
    }
    
}
