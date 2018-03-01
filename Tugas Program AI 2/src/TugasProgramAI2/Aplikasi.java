/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgramAI2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kukuh Rahingga P
 */
public class Aplikasi {
    private ArrayList<Berita> daftarBeritaSampel, daftarBeritaDicari;
    private GraphFK FKEmosi;
    private GraphFK FKPRovokasi;
    private GraphKelayakan GraphKelayakan;
    
    // Constructor Apkikasi yang menginstansiasi list dan memasukkan graph
    public Aplikasi(GraphFK FKEmosi, GraphFK FKPRovokasi, GraphKelayakan GraphKelayakan) {
        daftarBeritaSampel = new ArrayList();
        daftarBeritaDicari = new ArrayList();
        this.FKEmosi = FKEmosi;
        this.FKPRovokasi = FKPRovokasi;
        this.GraphKelayakan = GraphKelayakan;
    }
   
    // Input berita ke dalam list
    public void addBerita(){
        // input berita sampel
        daftarBeritaSampel.add(new Berita("B01", 97, 74, true));
        daftarBeritaSampel.add(new Berita("B02", 36, 85, true));
        daftarBeritaSampel.add(new Berita("B03", 63, 43, false));
        daftarBeritaSampel.add(new Berita("B04", 82, 90, true));
        daftarBeritaSampel.add(new Berita("B05", 71, 25, false));
        daftarBeritaSampel.add(new Berita("B06", 79, 81, true));
        daftarBeritaSampel.add(new Berita("B07", 55, 62, false));
        daftarBeritaSampel.add(new Berita("B08", 57, 45, false));
        daftarBeritaSampel.add(new Berita("B09", 40, 65, false));
        daftarBeritaSampel.add(new Berita("B10", 57, 45, false));
        daftarBeritaSampel.add(new Berita("B11", 77, 70, true));
        daftarBeritaSampel.add(new Berita("B12", 68, 75, true));
        daftarBeritaSampel.add(new Berita("B13", 60, 70, false));
        daftarBeritaSampel.add(new Berita("B14", 82, 90, true));
        daftarBeritaSampel.add(new Berita("B15", 40, 85, false));
        daftarBeritaSampel.add(new Berita("B16", 80, 68, true));
        daftarBeritaSampel.add(new Berita("B17", 60, 72, false));
        daftarBeritaSampel.add(new Berita("B18", 50, 95, true));
        daftarBeritaSampel.add(new Berita("B19", 100, 18, false));
        daftarBeritaSampel.add(new Berita("B20", 11, 99, true));
        
        // input berita dicari
        daftarBeritaDicari.add(new Berita("B21", 58, 63));
        daftarBeritaDicari.add(new Berita("B22", 68, 70));
        daftarBeritaDicari.add(new Berita("B23", 64, 66));
        daftarBeritaDicari.add(new Berita("B24", 57, 77));
        daftarBeritaDicari.add(new Berita("B25", 77, 55));
        daftarBeritaDicari.add(new Berita("B26", 98, 64));
        daftarBeritaDicari.add(new Berita("B27", 91, 59));
        daftarBeritaDicari.add(new Berita("B28", 50, 95));
        daftarBeritaDicari.add(new Berita("B29", 95, 55));
        daftarBeritaDicari.add(new Berita("B30", 27, 79));
    }
    
    // Menghitung Fuzzification yang menghasilkan nilai untuk graph FK
    public void hitungFuzzification(Berita berita) {
        double nilaiNKTrue = 0, nilaiNKFalse = 0;
        double temp = 0;
        String[] lingEmosi = {berita.getLevelEmosi1(), berita.getLevelEmosi2()};
        String[] lingProvokasi = {berita.getLevelProvokasi1(), berita.getLevelProvokasi2()};
        double[] nilaiEmosi = {berita.getNilaiEmosi1(), berita.getNilaiEmosi2()};
        double[] nilaiProvokasi = {berita.getNilaiProvokasi1(), berita.getNilaiProvokasi2()};
        
        for (int emo = 0; emo < 2; emo++) {
            for (int pro = 0; pro < 2; pro++) {
                // IF emosi = level 1 and provokasi = level 1 then NK = false
                if (lingEmosi[emo] == "level 1" && lingProvokasi[pro] == "level 1") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 1 and provokasi = level 2 then NK = false
                if (lingEmosi[emo] == "level 1" && lingProvokasi[pro] == "level 2") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 1 and provokasi = level 3 then NK = false
                if (lingEmosi[emo] == "level 1" && lingProvokasi[pro] == "level 3") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 1 and provokasi = level 4 then NK = false
                if (lingEmosi[emo] == "level 1" && lingProvokasi[pro] == "level 4") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 1 and provokasi = level 5 then NK = True
                if (lingEmosi[emo] == "level 1" && lingProvokasi[pro] == "level 5") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                //-------------------------------------------------------------------------------
                // IF emosi = level 2 and provokasi = level 1 then NK = false
                if (lingEmosi[emo] == "level 2" && lingProvokasi[pro] == "level 1") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 2 and provokasi = level 2 then NK = false
                if (lingEmosi[emo] == "level 2" && lingProvokasi[pro] == "level 2") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 2 and provokasi = level 3 then NK = false
                if (lingEmosi[emo] == "level 2" && lingProvokasi[pro] == "level 3") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 2 and provokasi = level 4 then NK = false
                if (lingEmosi[emo] == "level 2" && lingProvokasi[pro] == "level 4") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 2 and provokasi = level 5 then NK = True
                if (lingEmosi[emo] == "level 2" && lingProvokasi[pro] == "level 5") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                //-------------------------------------------------------------------------------
                // IF emosi = level 3 and provokasi = level 1 then NK = false
                if (lingEmosi[emo] == "level 3" && lingProvokasi[pro] == "level 1") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 3 and provokasi = level 2 then NK = false
                if (lingEmosi[emo] == "level 3" && lingProvokasi[pro] == "level 2") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 3 and provokasi = level 3 then NK = false
                if (lingEmosi[emo] == "level 3" && lingProvokasi[pro] == "level 3") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 3 and provokasi = level 4 then NK = false
                if (lingEmosi[emo] == "level 3" && lingProvokasi[pro] == "level 4") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 3 and provokasi = level 5 then NK = True
                if (lingEmosi[emo] == "level 3" && lingProvokasi[pro] == "level 5") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                //-------------------------------------------------------------------------------
                // IF emosi = level 4 and provokasi = level 1 then NK = false
                if (lingEmosi[emo] == "level 4" && lingProvokasi[pro] == "level 1") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 4 and provokasi = level 2 then NK = false
                if (lingEmosi[emo] == "level 4" && lingProvokasi[pro] == "level 2") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 4 and provokasi = level 3 then NK = false
                if (lingEmosi[emo] == "level 4" && lingProvokasi[pro] == "level 3") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                // IF emosi = level 4 and provokasi = level 4 then NK = false
                if (lingEmosi[emo] == "level 4" && lingProvokasi[pro] == "level 4") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                // IF emosi = level 4 and provokasi = level 5 then NK = True
                if (lingEmosi[emo] == "level 4" && lingProvokasi[pro] == "level 5") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                //-------------------------------------------------------------------------------
                // IF emosi = level 5 and provokasi = level 1 then NK = false
                if (lingEmosi[emo] == "level 5" && lingProvokasi[pro] == "level 1") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 5 and provokasi = level 2 then NK = false
                if (lingEmosi[emo] == "level 5" && lingProvokasi[pro] == "level 2") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKFalse < temp) {
                        nilaiNKFalse = temp;
                    }
                }
                // IF emosi = level 5 and provokasi = level 3 then NK = True
                if (lingEmosi[emo] == "level 5" && lingProvokasi[pro] == "level 3") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                // IF emosi = level 5 and provokasi = level 4 then NK = True
                if (lingEmosi[emo] == "level 5" && lingProvokasi[pro] == "level 4") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
                // IF emosi = level 5 and provokasi = level 5 then NK = True
                if (lingEmosi[emo] == "level 5" && lingProvokasi[pro] == "level 5") {
                    if (nilaiEmosi[emo] < nilaiProvokasi[pro]) {
                        temp = nilaiEmosi[emo];
                    } else
                        temp = nilaiProvokasi[pro];
                    if (nilaiNKTrue < temp) {
                        nilaiNKTrue = temp;
                    }
                }
            }
        }
        
        // Masukkan nilai yang di dapat ke Objek berita
        berita.setNilaiNKTrue(nilaiNKTrue);
        berita.setNilaiNKFalse(nilaiNKFalse);
        
    }

    // Mengeset level dari berita pada graf yang telah dibuat.
    public void setFuzzification(Berita berita) {
        int emosi = berita.getEmosi();
        int provokasi = berita.getProvokasi();
        
        if (emosi >= FKEmosi.getA() && emosi < FKEmosi.getB()) {
            berita.setLevelEmosi1("level 1");
            berita.setLevelEmosi2("level 2");
            berita.setNilaiEmosi1(hitungTurun(berita.getEmosi(), FKEmosi.getA(), FKEmosi.getB()));
            berita.setNilaiEmosi2(hitungNaik(berita.getEmosi(), FKEmosi.getA(), FKEmosi.getB()));
        } else if (emosi >= FKEmosi.getB() && emosi < FKEmosi.getC()) {
            berita.setLevelEmosi1("level 2");
            berita.setLevelEmosi2("level 3");
            berita.setNilaiEmosi1(hitungTurun(berita.getEmosi(), FKEmosi.getB(), FKEmosi.getC()));
            berita.setNilaiEmosi2(hitungNaik(berita.getEmosi(), FKEmosi.getB(), FKEmosi.getC()));
        } else if (emosi >= FKEmosi.getC() && emosi < FKEmosi.getD()) {
            berita.setLevelEmosi1("level 3");
            berita.setLevelEmosi2("level 4");
            berita.setNilaiEmosi1(hitungTurun(berita.getEmosi(), FKEmosi.getC(), FKEmosi.getD()));
            berita.setNilaiEmosi2(hitungNaik(berita.getEmosi(), FKEmosi.getC(), FKEmosi.getD()));
        } else if (emosi >= FKEmosi.getD() && emosi <= FKEmosi.getE()) {
            berita.setLevelEmosi1("level 4");
            berita.setLevelEmosi2("level 5");
            berita.setNilaiEmosi1(hitungTurun(berita.getEmosi(), FKEmosi.getD(), FKEmosi.getE()));
            berita.setNilaiEmosi2(hitungNaik(berita.getEmosi(), FKEmosi.getD(), FKEmosi.getE()));
        } 
        
        if (provokasi >= FKPRovokasi.getA() && provokasi < FKPRovokasi.getB()) {
            berita.setLevelProvokasi1("level 1");
            berita.setLevelProvokasi2("level 2");
            berita.setNilaiProvokasi1(hitungTurun(berita.getProvokasi(), FKPRovokasi.getA(), FKPRovokasi.getB()));
            berita.setNilaiProvokasi2(hitungNaik(berita.getProvokasi(), FKPRovokasi.getA(), FKPRovokasi.getB()));
        } else if (provokasi >= FKPRovokasi.getB() && provokasi < FKPRovokasi.getC()) {
            berita.setLevelProvokasi1("level 2");
            berita.setLevelProvokasi2("level 3");
            berita.setNilaiProvokasi1(hitungTurun(berita.getProvokasi(), FKPRovokasi.getB(), FKPRovokasi.getC()));
            berita.setNilaiProvokasi2(hitungNaik(berita.getProvokasi(), FKPRovokasi.getB(), FKPRovokasi.getC()));
        } else if (provokasi >= FKPRovokasi.getC() && provokasi < FKPRovokasi.getD()) {
            berita.setLevelProvokasi1("level 3");
            berita.setLevelProvokasi2("level 4");
            berita.setNilaiProvokasi1(hitungTurun(berita.getProvokasi(), FKPRovokasi.getC(), FKPRovokasi.getD()));
            berita.setNilaiProvokasi2(hitungNaik(berita.getProvokasi(), FKPRovokasi.getC(), FKPRovokasi.getD()));
        } else if (provokasi >= FKPRovokasi.getD() && provokasi <= FKPRovokasi.getE()) {
            berita.setLevelProvokasi1("level 4");
            berita.setLevelProvokasi2("level 5");
            berita.setNilaiProvokasi1(hitungTurun(berita.getProvokasi(), FKPRovokasi.getD(), FKPRovokasi.getE()));
            berita.setNilaiProvokasi2(hitungNaik(berita.getProvokasi(), FKPRovokasi.getD(), FKPRovokasi.getE()));
        }
    }
    
    // Menghitung nilai kelayakan sampel
    public boolean hitungNilaiKelayakanSampel(Berita berita) {
        double nilaiNKTrue = berita.getNilaiNKTrue();
        double nilaiNKFalse = berita.getNilaiNKFalse();
        double tidak = 45, ya = 95, nilaiKelayakan;
        boolean temp = false, nilai = false;
        
        nilaiKelayakan  = (tidak*nilaiNKFalse + ya*nilaiNKTrue)/(nilaiNKFalse + nilaiNKTrue);
        if (nilaiKelayakan <= 50) {
            temp = false;
        } else if (nilaiKelayakan > 50) {
            temp = true;
        }
        
        if (temp == berita.isHoax()) {
            nilai = true;
        } else 
            nilai = false;
        berita.setNilaiKebenaran(nilaiKelayakan);
        berita.setStatus(nilai);
        return nilai;
    }
    
    // hitung nilai kelayakan yang dicari
    public void hitungNilaiKelayakanDicari(Berita berita) {
        double nilaiNKTrue = berita.getNilaiNKTrue();
        double nilaiNKFalse = berita.getNilaiNKFalse();
        double tidak = 45, ya = 95, nilaiKelayakan;
        
        nilaiKelayakan  = (tidak*nilaiNKFalse + ya*nilaiNKTrue)/(nilaiNKFalse + nilaiNKTrue);
        if (nilaiKelayakan <= 50) {
            berita.setHoax(false);
        } else if (nilaiKelayakan > 50) {
            berita.setHoax(true);
        }
        berita.setNilaiKebenaran(nilaiKelayakan);
    }
    
    // Menghitung jika titik berada di posisi garis naik
    public double hitungNaik (double x, double a, double b) {
        double nilai = 0;
        nilai = (x-a)/(b-a);
        return nilai;
    }
    
    // Menghitung jika titik berada di posisi garis turun
    public double hitungTurun (double x, double b, double c) {
        double nilai = 0;
        nilai = (-1*(x-c))/(c-b);
        return nilai;
    }
    
    // Menginputkan nilai batas braph FK
    public void inputNilaiGraphFK(GraphFK FK) {
        FK.setC(ranGen());
        FK.setA(1);
        FK.setE(100);
        FK.setB(ranGenBatas(FK.getC(), 1));
        FK.setD(ranGenBatas(100, FK.getC()));
    }
    
    // Menginputkan nilai batas braph Nilai Kelayakan
    public void inputNilaiGraphKelayakan(GraphKelayakan GK) {
        GK.setA(0);
        GK.setB(50);
        GK.setC(100);
    }
    
    // Generate nilai random untuk batas FK
    public int ranGen(){
        Random rand = new Random();
        int number = rand.nextInt(99) + (1);
        return  number;
    }
    
    // Generate nilai random untuk FK dengan batasan yang sudah ada
    public int ranGenBatas(int atas, int bawah){
        Random rand = new Random();
        int number = rand.nextInt((atas - bawah) + 1) + bawah;
        return  number;
    }
    
    // Mengoutputkan graf fungsi keanggotaan dari emosi
    public GraphFK getFKEmosi(){
        return FKEmosi;
    }
    
    // Mengoutputkan graf fungsi keanggotaan dari provokasi
    public GraphFK getFKProvokasi(){
        return FKPRovokasi;
    }
    
    // Menampilkan daftar berita di list sampel
    public ArrayList getListBeritaSampel(){
        return daftarBeritaSampel;
    }
    
    // Menampilkan daftar berita di list dicari
    public ArrayList getListBeritaDicari(){
        return daftarBeritaDicari;
    }  
}
