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
public class Motor {
    public String nama;
    public String keluaran;
    public String kapasitasMesin;
    public String kecepatan;

    public void akselerasi() {
        this.kecepatan = "0-70km/h";
        System.out.println("Motor ini dapat melaju dari " + kecepatan + " dalam waktu 7 detik");
    }

    public void pabrikan() {
        this.keluaran = "tahun 2017";
        System.out.println("Motor pabrikan asal Honda ini diluncurkan pada " + keluaran);
    }

    public void pabrikanLama() {
        this.keluaran = "tahun 2010";
        System.out.println("Motor pabrikan asal Honda ini diluncurkan pada " + keluaran);
    }
    
    public void akselerasiMatic() {
        this.kecepatan = "0-10km/h";
        System.out.println("Motor ini dapat melaju dari " + kecepatan + " dalam waktu 7 detik");
    }
}
