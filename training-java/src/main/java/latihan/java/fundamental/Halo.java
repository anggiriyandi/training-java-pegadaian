/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java.fundamental;

import id.co.pegadaian.training.java.Nasabah;
import java.util.Date;

public class Halo {

    private String nama = "anggi";

    public Halo() {
    }

    public void greeting() {
        System.out.println();
    }

    public static void main(String[] args) {
        Nasabah n1 = new Nasabah("anggi");
        
        Nasabah n2 = new Nasabah();
        
        System.out.println("nama n1 : " + n1.getNama());
        
        System.out.println("nama n2 : " + n2.getNama());
        
        n2.setNama("rudi");
        System.out.println("nama n2 yang sudah di set : "+ n2.getNama());
    }
}
