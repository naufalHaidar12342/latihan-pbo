/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaScanner;

/**
 *
 * @author GIGABYTE
 */
public class JalankanScanner {
    public static void main(String[] args){
        WadahScanner ambilKelas=new WadahScanner();
        
        ambilKelas.ambilNama();
        System.out.println(ambilKelas.nama);

    }
}
