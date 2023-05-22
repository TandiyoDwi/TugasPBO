/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LiveCoding;

import java.util.*;



/**
 *
 * @author Tandiyo Dwi Oktavian
 * Teknik Informatika - 22104410017
 * 2022-2023
 */
public class MainKinetic {
    public double masa,kecepatan;
    
    public void setMasa(double masa) {
        this.masa = masa;
    }
 
    public double getMasa() {
        return masa;
    }
 
    void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
 
    public double getKecepatan() {
        return kecepatan;
    }
 
    public double EK() {
        double hasil = 0.5 * masa * Math.pow(kecepatan, 2);
        return hasil;
    }

    
    public static void main(String[] args) {
        MainKinetic energi = new MainKinetic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan masa :");
        energi.setMasa(scanner.nextDouble());
        System.out.println("Masukkan Kecepatan : ");
        energi.setKecepatan(scanner.nextDouble());
        energi.getMasa();
        energi.getKecepatan();
        System.out.println("Masa adalah ;"+energi.getMasa());
        System.out.println("Kecepatan adalah "+energi.getKecepatan());
        System.out.println("Hasil adalah"+energi.EK());
             
    }

    
    
}

    
    
  


