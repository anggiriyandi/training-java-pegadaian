/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author anggi
 */

@Entity
@Table
public class Nasabah {
    
//    @GeneratedValue(generator = "system-uuid2")
//    @GenericGenerator(name = "system-uuid2", strategy = "uuid2")
//    @Column(columnDefinition = "varchar(36)")
    
    
    @Id
    private String id;
    
    @NotEmpty(message =  "Nama Tidak Boleh Kosong")
    private String nama;
    
    @NotEmpty(message = "Nama Tidak Boleh Kosong")
    private String alamat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
