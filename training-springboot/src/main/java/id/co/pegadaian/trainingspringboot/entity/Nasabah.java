/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author anggi
 */
@Entity
@Table
public class Nasabah extends BaseEntity {

    @NotEmpty(message = "Nama Tidak Boleh Kosong")
    private String nama;
    
    @Column(unique = true)
    private String noKtp;

    @NotEmpty(message = "Nama Tidak Boleh Kosong")
    private String alamat;
    
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

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }
}
