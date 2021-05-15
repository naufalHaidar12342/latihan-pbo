/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiNilai_Mhs;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE(github : naufalHaidar12342)
 */
public class DemoNilai {
    public static void main(String[] args) {

        // memanggil fungsi scanner
        // dengan variabel 'mintaInput'
        Scanner mintaInput = new Scanner(System.in);

        // memanggil kelas 'Nilai'
        // lewat variabel 'aksesKelasNilai'
        Nilai aksesKelasNilai = new Nilai();

        // meminta input nim (nomor induk mahasiswa)
        System.out.println("=======INPUT DATA=======");
        System.out.print("NIM :");
        aksesKelasNilai.nim = mintaInput.next();

        // meminta input nama
        System.out.print("Nama :");
        mintaInput.nextLine();
        aksesKelasNilai.nama = mintaInput.nextLine();

        // meminta input nilai tugas
        System.out.print("Nilai Tugas :");
        aksesKelasNilai.nilaiTugas = mintaInput.nextInt();

        //
        System.out.print("Nilai UTS :");
        aksesKelasNilai.nilaiUTS = mintaInput.nextInt();

        //
        System.out.print("Nilai UAS :");
        aksesKelasNilai.nilaiUAS = mintaInput.nextInt();
        System.out.println();

        // mengakses method/function
        aksesKelasNilai.hitungNilaiAkhir();
        aksesKelasNilai.getNilaiHuruf();
        aksesKelasNilai.getPredikat();

        // mengakses method "cetakNilai"
        aksesKelasNilai.cetakNilai();

        // menutup input
        // mintaInput.close();

    }
}
