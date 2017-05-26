/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author KEVIN_E15
 */
public class Karyawan {

    static int execute(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String Nama;
    public int Umur;
    public int Gaji;
    private Karyawan[] k;
    public Karyawan(String Nama, int Umur, int Gaji){
        this.Nama = Nama;
        this.Umur = Umur;
        this.Gaji = Gaji;
    }
    public static void main(String[] args) {
        new Tampilan().show();
    }

    /**
     * @param args the command line arguments
     */
    
    
}
