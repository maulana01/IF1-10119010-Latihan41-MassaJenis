/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan41.massajenis;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan massa jenis
 *                     dengan konsep OOP
 */
public class IF110119010Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        int sisi = kubus.getSisi();
        int massa = kubus.getMassa();
        int volume = kubus.hitungVolume(sisi);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + sisi);
        System.out.println("Massa : " + massa);
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(massa, volume));
    }
    
}
