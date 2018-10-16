/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java.fundamental;

import id.co.pegadaian.training.java.BacaFileHelper;
import id.co.pegadaian.training.java.Nasabah;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anggi
 */
public class CobaBacaFIle {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, SQLDataException {
        BacaFileHelper helper = new BacaFileHelper("src/main/resources/data_nasabah.txt");
       
            helper.bukaFile();
//            helper.bacaSemuaDataFile();
            
            List<Nasabah> dataNasabah = helper.cariSemuaNasabah();
            
            for (Nasabah nasabah : dataNasabah) {
                System.out.println("Nasabah dengan id : " + nasabah.getId());
                System.out.println("nama : " + nasabah.getNama());
                System.out.println("jenis kelamin : " + nasabah.getJenisKelamin());
            }
            
            helper.tutupFile();
        
//        catch (FileNotFoundException e) {
//            System.out.println("Terjadi error saat buka file");
//            e.printStackTrace();
//        } catch (IOException ex) {
//            System.out.println("terjadi error saat baca");
//            ex.printStackTrace();
//        } catch (SQLDataException ex) {
//            System.out.println("terjadi error saat simpan data");
//        }
        
//        try {
//            helper.bukaFile();
//        } catch (Exception ex) {
//            System.out.println("error file tidak ditemukan");
//            ex.printStackTrace();
//        }
//        
//        try {
//            helper.bacaSemuaDataFile();
//        } catch (IOException ex) {
//            System.out.println("error baca file");
//            ex.printStackTrace();
//        }
//        
//        try {
//            helper.tutupFile();
//        } catch (IOException ex) {
//            System.out.println("error tutup file");
//            ex.printStackTrace();
//        }
    }
}
