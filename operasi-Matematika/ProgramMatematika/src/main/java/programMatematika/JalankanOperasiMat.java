/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programMatematika;

/**
 *
 * @author GIGABYTE
 */
public class JalankanOperasiMat {
    public static void main (String [] args){
        Matematika operasi_1=new Matematika();
        
        operasi_1.jalankanPenjumlahan(20, 20);
        operasi_1.jalankanPengurangan(10, 5);
        operasi_1.jalankanPerkalian(10, 20);
        operasi_1.jalankanPembagian(20, 2);
    }
}
