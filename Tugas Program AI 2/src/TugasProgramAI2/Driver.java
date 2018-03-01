/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgramAI2;

import java.util.ArrayList;

/**
 *
 * @author Kukuh Rahingga P
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GraphFK FKEmosi = new GraphFK();
        GraphFK FKProvokasi = new GraphFK();
        GraphKelayakan GraphKelayakan = new GraphKelayakan();
        Aplikasi app = new Aplikasi(FKEmosi, FKProvokasi, GraphKelayakan);
        app.addBerita();
        boolean cekPerulangan = true, cekHoax = true;
        ArrayList<Berita> daftarBeritaSampel, daftarBeritaDicari;
        daftarBeritaSampel = app.getListBeritaSampel();
        daftarBeritaDicari = app.getListBeritaDicari();
        
        while (cekPerulangan == true) {
            app.inputNilaiGraphFK(FKEmosi);
            app.inputNilaiGraphFK(FKProvokasi);
            cekHoax = true;
            daftarBeritaSampel.removeAll(daftarBeritaDicari);
            daftarBeritaSampel = app.getListBeritaSampel();
            //System.out.println("FK emosi : " + app.getFKEmosi());
            //System.out.println("FK provokasi : " + app.getFKProvokasi());
            for (Berita berita : daftarBeritaSampel) {
                if (cekHoax == true) {
                    app.setFuzzification(berita);
                    app.hitungFuzzification(berita);
                    cekHoax = app.hitungNilaiKelayakanSampel(berita);
                    //System.out.println(berita.toString());
                    //System.out.println("");
                }
            }
            if (cekHoax == true) {
                cekPerulangan = false;
            }
        } // end while
        
        for (Berita berita : daftarBeritaDicari) {
            app.setFuzzification(berita);
            app.hitungFuzzification(berita);
            app.hitungNilaiKelayakanDicari(berita);
            System.out.println(berita.toString());
            System.out.println("");
        }
        
        System.out.println("Berita sampel");
        for (Berita berita : daftarBeritaSampel) {
            System.out.println(berita.toStringSampel());
        }
        System.out.println("");
        System.out.println("Emosi " + app.getFKEmosi());
        System.out.println("Provokasi " + app.getFKProvokasi());
        System.out.println("Berita Dicari");
        for (Berita berita : daftarBeritaDicari) {
            System.out.println(berita.toStringDicari());
        }
    } // end psvm
}
