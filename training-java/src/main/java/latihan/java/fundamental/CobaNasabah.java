/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java.fundamental;

import id.co.pegadaian.training.java.JenisKelamin;
import id.co.pegadaian.training.java.Nasabah;

public class CobaNasabah {

    public static void main(String[] args) {
        
        Nasabah n1 = new Nasabah("anggi");
        n1.setJenisKelamin(JenisKelamin.PRIA);
        
        System.out.println("Nama nasabah n1 : " + n1.getNama());
        System.out.println("jenis kelamin nasabah n1 : " + n1.getJenisKelamin());
        System.out.println("Nasabah Ke : " + Nasabah.jumlahNasabah);

        Nasabah n2 = new Nasabah("rudi");
        System.out.println("Nama nasabah n2 : " + n2.getNama());
        System.out.println("Nasabah Ke : " + Nasabah.jumlahNasabah);

        Nasabah n3 = new Nasabah("budi");
        System.out.println("Nama nasabah n3 : " + n3.getNama());
        System.out.println("Nasabah Ke : " + Nasabah.jumlahNasabah);

        n3.setNama("randi");
        n3.jumlahNasabah = 10;

        System.out.println("Nama nasabah n1 : " + n1.getNama());
        System.out.println("Nama nasabah n2 : " + n2.getNama());
        System.out.println("Nama nasabah n3 baru : " + n3.getNama());

        System.out.println("Jumlah nasabah baru n1 : " + Nasabah.jumlahNasabah);
        System.out.println("Jumlah nasabah baru n2 : " + Nasabah.jumlahNasabah);

    }

}
