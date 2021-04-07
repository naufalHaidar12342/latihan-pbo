/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiNilai_Mhs;

/**
 *
 * @author GIGABYTE(github : naufalHaidar12342)
 */
public class Nilai {
    /*
     * inisiasi variabel yang digunakan. nilaiTugas, nilaiUTS, nilaiUAS akan diisi
     * dari inputan user. nilaiAkhir akan digunakan untuk menampung hasil konversi
     * dari totalNilai yang bertipe double.
     */
    int nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    // totalNilai akan menampung hasil perhitungan
    Double totalNilai;

    // dari 'nilaiAkhir' akan ditentukan 'nilaiHuruf' yang sesuai.
    // 'nilaiHuruf' akan menentukan 'predikat'
    // rumusNilaiTugas hingga rumusNilaiUAS hanya saya gunakan
    // sebagai pengingat saja. sifatnya opsional
    String predikat, nama, nim, nilaiHuruf, rumusNilaiTugas, rumusNilaiUTS, rumusNilaiUAS;

    public int hitungNilaiAkhir() {
        // rumusNilaiTugas, rumusNilaiUTS, dan rumusNilaiUAS
        // memiliki formula yang beda. sekali lagi, ini tidak wajib
        // ada.
        rumusNilaiTugas = "15 % dari nilaiTugas";
        rumusNilaiUTS = "35 % dari nilaiUTS";
        rumusNilaiUAS = "50 % dari nilaiUAS";

        // perhitungan totalNilai dari rumus yang sebelumnya
        // sudah diberikan
        totalNilai = (0.15 * nilaiTugas) + (0.35 * nilaiUTS) + (0.50 * nilaiUAS);

        // nilaiAkhir akan mengambil hasil konversi isi variabel
        // totalNilai ke dalam bentuk integer
        nilaiAkhir = totalNilai.intValue();
        return nilaiAkhir;
    }

    public String getNilaiHuruf() {

        // menggunakan if-else, karena switch
        // hanya cocok untuk int yang bersifat konstan.
        // sedangkan nilaiAkhir memiliki range tertentu
        // misal dari 55 sampai 85
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }

    public String getPredikat() {

        // karena pada fungsi getNilaiHuruf sudah dilakukan
        // asignment/ pemberian isi ke variabel nilaiHuruf,
        // selanjutnya nilaiHuruf akan dibandingkan dengan switch.
        // (cocok dengan switch karena nilaiHuruf bertipe string
        // yang isinya konstan)
        switch (nilaiHuruf) {
        case "A":
            predikat = "Sempurna";
            break;
        case "B":
            predikat = "Bagus";
            break;
        case "C":
            predikat = "Cukup";
            break;
        case "D":
            predikat = "Kurang";
            break;
        case "E":
            predikat = "Sangat Kurang";
            break;
        default:
            break;
        }
        return predikat;
    }

    //
    void cetakNilai() {

        // fungsi untuk menampilkan hasil inputan user
        // sekaligus pengolahan nilai
        System.out.println("=======CETAK DATA=======");
        System.out.println("NIM                     :" + nim);
        System.out.println("NAMA                    :" + nama);
        System.out.println("NILAI TUGAS             :" + nilaiTugas);
        System.out.println("NILAI UTS               :" + nilaiUTS);
        System.out.println("NILAI UAS               :" + nilaiUAS);
        System.out.println("NILAI AKHIR             :" + nilaiAkhir);
        System.out.println("NILAI HURUF             :" + getNilaiHuruf());
        System.out.println("KET. NILAI HURUF        :" + getPredikat());
    }
}
