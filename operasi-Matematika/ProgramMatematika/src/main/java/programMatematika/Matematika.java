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
class Matematika {
    int penjumlahan=0;
    int pengurangan=0;
    int perkalian=0;
    int pembagian=0;
    
    //method atau fungsi tanpa return
    
    void jalankanPenjumlahan(int bil_1, int bil_2){
        int penjumlahan=bil_1+bil_2;
        System.out.println("Hasil penjumlahan "+bil_1+ "+"+bil_2+"="+penjumlahan);
    }
    
    void jalankanPengurangan(int bil_1, int bil_2){
        int pengurangan=bil_1-bil_2;
        System.out.println("Hasil pengurangan "+bil_1+ "-"+bil_2+"="+pengurangan);
    }
    
    void jalankanPerkalian(int bil_1, int bil_2){
        int perkalian=bil_1*bil_2;
        System.out.println("Hasil perkalian "+bil_1+ "x"+bil_2+"="+perkalian);
    }
    
    void jalankanPembagian(int bil_1, int bil_2){
        int pembagian=bil_1/bil_2;
        System.out.println("Hasil pembagian "+bil_1+ "÷"+bil_2+"="+pembagian);
    }
    
    
}


