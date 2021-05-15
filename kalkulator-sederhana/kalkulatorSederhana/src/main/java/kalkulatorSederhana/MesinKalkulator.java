/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorSederhana;

// import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */

/*
 * sumber : kaweesa rodney https://www.youtube.com/watch?v=2KzwAT6Ku44
 */

public class MesinKalkulator {
    public int jalankanPenjumlahan(int angka1, int angka2) {
        int hasil;
        hasil = angka1 + angka2;
        return hasil;

    }

    public int jalankanPengurangan(int angka1, int angka2) {
        int hasil;
        hasil = angka1 - angka2;
        return hasil;
    }

    public int jalankanPerkalian(int angka1, int angka2) {
        int hasil;
        hasil = angka1 * angka2;
        return hasil;
    }

    public int jalankanPembagian(int angka1, int angka2) {
        int hasil;
        hasil = angka1 / angka2;
        return hasil;
    }

    public int jalankanSisaBagi(int angka1, int angka2) {
        int hasil;
        hasil = angka1 % angka2;
        return hasil;
    }
}
