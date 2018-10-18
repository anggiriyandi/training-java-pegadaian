/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.dao;

import id.co.pegadaian.trainingspringboot.entity.Nasabah;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author anggi
 */
public interface NasabahDao extends PagingAndSortingRepository<Nasabah, String>{
    
    public List<Nasabah> findByNama(String namaKirim);
    public List<Nasabah> findByNamaAndId(String namaKirim, String id);
}
