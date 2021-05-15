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
public class Kuda {
    public String jenis;
    public String warna;
    public String mata;
    public String mulut;
    public String kaki;

    public void bersuara(){
        this.mulut="bersuara";
        System.out.println("mulutnya sedang = "+mulut);
    }
    
    
    public void berlari(){
        this.kaki="berlari";
        System.out.println("kakinya sedang = "+kaki);
    }
    
    
    public void berjalan(){
        this.kaki="berjalan";
        System.out.println("kakinya sedang = "+kaki);
    }
    
}


