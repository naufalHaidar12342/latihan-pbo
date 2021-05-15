/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkuda;

/**
 *
 * @author GIGABYTE
 */
public class RunKuda {
    public static void main(String[] args){
        Kuda kuda_1=new Kuda();
        kuda_1.jenis="australia";
        kuda_1.warna="coklat";
        kuda_1.mata="hitam";
        
        
        System.out.println("kuda jenis = "+kuda_1.jenis);
        System.out.println("warnanya = "+kuda_1.warna);
        System.out.println("bermata = "+kuda_1.mata);
        
        kuda_1.bersuara();
        kuda_1.berjalan();
        
        System.out.println("");
        Kuda kuda_2=new Kuda();
        kuda_2.jenis="jerman";
        kuda_2.warna="putih";
        kuda_2.mata="coklat";
        
        System.out.println("kuda jenis = "+kuda_2.jenis);
        System.out.println("warnanya = "+kuda_2.warna);
        System.out.println("bermata = "+kuda_2.mata);
        
        kuda_1.bersuara();
        kuda_1.berlari();
    }
}
