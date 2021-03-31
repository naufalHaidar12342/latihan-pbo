/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiWaktu;

import java.util.Scanner;
/**
 *
 * @author GIGABYTE(github.com/naufalHaidar12342)
 */
public class KonversiWaktu {
   public static void main (String[] args){
       
        //memanggil fungsi scanner lewat variabel 'inputan'
      Scanner inputan = new Scanner(System.in);
      
      //untuk menutup variabel 'inputan'
      try{
         //meminta inputan detik dari user
         System.out.println("masukkan detik :");
         int hasilInputan=inputan.nextInt();
        
         //memanggil class 'KonversiDetik' lewat 
         //variabel 'konversiInput'
         KonversiDetik konversiInput = new KonversiDetik(hasilInputan);
         konversiInput.Cetak();
      }finally{
         inputan.close();
      }
        
        
   
   }
}
