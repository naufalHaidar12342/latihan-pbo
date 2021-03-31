/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiWaktu;

/**
 *
 * @author GIGABYTE(github.com/naufalHaidar12342)
 * 
 */
public class KonversiDetik {
    //inisiasi/ membuat variabel
    //detik, menit, jam, dan hari
    int hari,jam,menit,detik;
    
    //konstruktor untuk class 'KonversiDetik'
    public KonversiDetik(int detik){
        this.detik=detik; 
    }


    //method/fungsi untuk mencetak
    //hasil inputan user nanti
    public void Cetak(){
        
        //mengubah detik ke hari
        hari=detik/86400;
        System.out.println("Hari :"+hari);
        
        //mengubah detik ke jam
        jam=detik%86400/3600;
        System.out.println("jam: "+jam);
        
        //mengubah detik ke menit
        menit=detik%86400%3600/60;
        System.out.println("menit: "+menit);
        
        //mengubah detik ke detik?
        detik=detik%86400%3600%60;
        System.out.println("detik :"+detik);
    
    
    }
}
