/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herda
 */
public class no2 {
    double IPK = 2.5;
    
    public no2(double IPK){
       this.IPK = IPK;
    }
    
    public static void main(String[] args){
        no2 data_void = new no2(3.5);
        
        no2 data_return = new  no2(4.0);
        
        data_void.identitas1("ade", 19);
        System.out.println("Nilai IPK Saya: "+data_void.IPK);
        System.out.println("====================");
        identitas2("wawan", 23);
        System.out.println("====================");
        System.out.println("Nama Saya: "+data_return.nama("ihsan"));
        System.out.println("Nama Saya: "+data_return.umur(24));
        System.out.println("Nilai IPK Saya: "+ data_return.IPK);
    }
    
    
    void identitas1(String nama, int umur){
        System.out.println("Nama Saya: "+nama);
        System.out.println("Usia Saya Saya: "+umur+" Tahun");
    }
    

    static void identitas2(String nama, int umur){
        System.out.println("Nama Saya: "+nama);
        System.out.println("Usia Saya Saya: "+umur+" Tahun");
    }
    
    
    String nama(String nama){
        return nama;
    }
    int umur(int umur){
        return umur;
    }
}
