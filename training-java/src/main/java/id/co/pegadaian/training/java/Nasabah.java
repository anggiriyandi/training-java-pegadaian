/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.java;

/**
 *
 * @author anggi
 */
public class Nasabah extends BaseEntity {

    private String nama;
    private JenisKelamin jenisKelamin;
    
    public static int jumlahNasabah = 0;

    public Nasabah() {
        
    }
    
    public Nasabah(String x) {
        nama = x;
        jumlahNasabah = jumlahNasabah + 1;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    

}
