/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorSederhana;

/**
 *
 * @author GIGABYTE
 */

import java.util.Scanner;

public class JalankanKalkulator {
    public static void main(String[] args) {
        Scanner tampungPilihan = new Scanner(System.in);

        int angka1, angka2, operasi;

        System.out.println("masukkan angka pertama =");
        angka1 = tampungPilihan.nextInt();
        System.out.println("masukkan angka kedua =");
        angka2 = tampungPilihan.nextInt();
        System.out.println("pilih operasi =");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. sisa bagi");

        System.out.println("pilih operasi (1/2/3/4/5) :");
        operasi = tampungPilihan.nextInt();
        MesinKalkulator wadah = new MesinKalkulator();

        try {
            switch (operasi) {
            case 1:
                int hasilPenjumlahan;
                hasilPenjumlahan = wadah.jalankanPenjumlahan(angka1, angka2);
                System.out.println("Penjumlahan dengan switch =" + hasilPenjumlahan);
                break;
            case 2:
                int hasilPengurangan;
                hasilPengurangan = wadah.jalankanPengurangan(angka1, angka2);
                System.out.println("Pengurangan dengan switch =" + hasilPengurangan);
                break;
            case 3:
                int hasilPerkalian;
                hasilPerkalian = wadah.jalankanPerkalian(angka1, angka2);
                System.out.println("Perkalian dengan switch =" + hasilPerkalian);
                break;
            case 4:
                int hasilPembagian;
                hasilPembagian = wadah.jalankanPembagian(angka1, angka2);
                System.out.println("Pembagian dengan switch =" + hasilPembagian);
                break;
            case 5:
                int hasilModulo;
                hasilModulo = wadah.jalankanSisaBagi(angka1, angka2);
                System.out.println("Modulo dengan switch =" + hasilModulo);
                break;
            default:
                break;
            }

        } finally {
            tampungPilihan.close();
        }

    }
}
