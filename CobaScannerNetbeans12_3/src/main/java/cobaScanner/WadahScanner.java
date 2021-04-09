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
import java.util.Scanner;
public class WadahScanner {
    Scanner wadahInput=new Scanner (System.in);
    
    String nama;
    
    public String ambilNama(){
        System.out.print("masukkan nama = ");
        nama=wadahInput.nextLine();
        return nama;
    }
    
}
