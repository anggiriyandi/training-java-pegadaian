/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggi
 */


public class BacaFileHelper {
    
    File file;
    BufferedReader bufferedReader;

    public BacaFileHelper(String inputFile) {
        file = new File(inputFile);
    }
    public void bukaFile() throws FileNotFoundException, SQLDataException{
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
    }
    
    public void tutupFile() throws IOException{
        if(bufferedReader != null){
            bufferedReader.close();
        }
    }
    
    public void bacaSemuaDataFile() throws IOException {
        String data = bufferedReader.readLine();
        System.out.println("Header : " + data);
        data = bufferedReader.readLine();
        while (data != null) {
            System.out.println("data : "+ data);
            data = bufferedReader.readLine();
        }
    }
    
    public List<Nasabah> cariSemuaNasabah() throws IOException{
        
        List<Nasabah> result = new ArrayList<>();
        
        String data = bufferedReader.readLine();
        System.out.println("Header : " + data);
        data = bufferedReader.readLine();
        
        while (data != null) {
            String[] dataAry = data.split(",");
            
            Nasabah n = new Nasabah();
            n.setId(dataAry[0]);
            n.setNama(dataAry[1]);
            
            if(dataAry[2].equalsIgnoreCase("pria")){
                n.setJenisKelamin(JenisKelamin.PRIA);
            } else if(dataAry[2].equalsIgnoreCase("wanita")) {
                n.setJenisKelamin(JenisKelamin.WANITA);
            }
            
            result.add(n);
            data = bufferedReader.readLine();
        }
        
        return result;
    }
}
