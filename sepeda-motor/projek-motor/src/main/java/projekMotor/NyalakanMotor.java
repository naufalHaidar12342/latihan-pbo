/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekMotor;

/**
 *
 * @author GIGABYTE
 */
public class NyalakanMotor {
    public static void main(String[] args) {
        Motor spm_1 = new Motor();
        spm_1.nama = "Honda CBR600";
        spm_1.keluaran = "2018";
        spm_1.kapasitasMesin = "599cc";
        spm_1.kecepatan = "500 km/jam";

        System.out.println("nama motor =  " + spm_1.nama);
        System.out.println("keluaran = " + spm_1.keluaran);
        System.out.println("kapasitas = " + spm_1.kapasitasMesin);
        System.out.println("kecepatan = " + spm_1.kecepatan);

        spm_1.akselerasi();
        spm_1.pabrikan();

        System.out.println("");

        Motor spm_2 = new Motor();
        spm_2.nama = "Honda 125";
        spm_2.keluaran = "2010";
        spm_2.kapasitasMesin = "125cc";
        spm_2.kecepatan = "120 km/jam";

        System.out.println("nama motor =  " + spm_2.nama);
        System.out.println("keluaran = " + spm_2.keluaran);
        System.out.println("kapasitas = " + spm_2.kapasitasMesin);
        System.out.println("kecepatan = " + spm_2.kecepatan);

        System.out.println("");

        spm_1.akselerasiMatic();
        spm_1.pabrikanLama();
        System.out.println("");
    }
}
