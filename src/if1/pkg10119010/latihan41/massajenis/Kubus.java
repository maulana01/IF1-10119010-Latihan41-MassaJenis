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
public class Kubus {
    private int sisi, massa;
    
    public int getSisi() {
        return this.sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getMassa() {
        return this.massa;
    }
    
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi) {
        return parSisi * parSisi * parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }
}
