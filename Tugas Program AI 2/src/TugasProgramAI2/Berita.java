/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgramAI2;

/**
 *
 * @author Kukuh Rahingga P
 */
public class Berita {
    private String berita;
    private int emosi, provokasi;
    private boolean hoax;
    private boolean status;
    private String levelEmosi1, levelEmosi2, levelProvokasi1, levelProvokasi2;
    private double nilaiEmosi1, nilaiEmosi2, nilaiProvokasi1, nilaiProvokasi2;
    private boolean levelNKTrue, levelNKFalse;
    private double nilaiNKTrue, nilaiNKFalse;
    private double nilaiKebenaran;

    @Override
    public String toString() {
        return  "berita = " + berita + ", emosi = " + emosi + ", provokasi = " + provokasi + ", hoax = " + hoax + "\n" +
                "level Emosi = " + levelEmosi1 + "  nilai emosi = " + nilaiEmosi1 + "\n" + 
                "level Emosi = " + levelEmosi2 + "  nilai emosi = " + nilaiEmosi2 + "\n" + 
                "level provokasi = " + levelProvokasi1 + "  nilai provokasi = " + nilaiProvokasi1 + "\n" + 
                "level provokasi = " + levelProvokasi2 + "  nilai provokasi = " + nilaiProvokasi2 + "\n" +
                "nilai NK True = " + nilaiNKTrue + "\n" +
                "nilai NK False = " + nilaiNKFalse + "\n" +
                "nilai kebenaran : "+ nilaiKebenaran;
    }

    public String toStringSampel() {
        return "berita = " + berita + ", emosi = " + emosi + ", provokasi = " + provokasi + ", hoax = " + hoax + ", Status = " + status;
    }
    
    public String toStringDicari() {
        return "berita = " + berita + ", emosi = " + emosi + ", provokasi = " + provokasi + ", hoax = " + hoax;
    }
    
    public Berita(String berita, int emosi, int provokasi) {
        this.berita = berita;
        this.emosi = emosi;
        this.provokasi = provokasi;
    }

    public Berita(String berita, int emosi, int provokasi, boolean hoax) {
        this.berita = berita;
        this.emosi = emosi;
        this.provokasi = provokasi;
        this.hoax = hoax;
    }

    public String getBerita() {
        return berita;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }

    public int getEmosi() {
        return emosi;
    }

    public void setEmosi(int emosi) {
        this.emosi = emosi;
    }

    public int getProvokasi() {
        return provokasi;
    }

    public void setProvokasi(int provokasi) {
        this.provokasi = provokasi;
    }

    public boolean isHoax() {
        return hoax;
    }

    public void setHoax(boolean hoax) {
        this.hoax = hoax;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLevelEmosi1() {
        return levelEmosi1;
    }

    public void setLevelEmosi1(String levelEmosi1) {
        this.levelEmosi1 = levelEmosi1;
    }

    public String getLevelEmosi2() {
        return levelEmosi2;
    }

    public void setLevelEmosi2(String levelEmosi2) {
        this.levelEmosi2 = levelEmosi2;
    }

    public String getLevelProvokasi1() {
        return levelProvokasi1;
    }

    public void setLevelProvokasi1(String levelProvokasi1) {
        this.levelProvokasi1 = levelProvokasi1;
    }

    public String getLevelProvokasi2() {
        return levelProvokasi2;
    }

    public void setLevelProvokasi2(String levelProvokasi2) {
        this.levelProvokasi2 = levelProvokasi2;
    }

    public double getNilaiEmosi1() {
        return nilaiEmosi1;
    }

    public void setNilaiEmosi1(double nilaiEmosi1) {
        this.nilaiEmosi1 = nilaiEmosi1;
    }

    public double getNilaiEmosi2() {
        return nilaiEmosi2;
    }

    public void setNilaiEmosi2(double nilaiEmosi2) {
        this.nilaiEmosi2 = nilaiEmosi2;
    }

    public double getNilaiProvokasi2() {
        return nilaiProvokasi2;
    }

    public void setNilaiProvokasi2(double nilaiPProvokasi2) {
        this.nilaiProvokasi2 = nilaiPProvokasi2;
    } 

    public double getNilaiProvokasi1() {
        return nilaiProvokasi1;
    }

    public void setNilaiProvokasi1(double nilaiProvokasi1) {
        this.nilaiProvokasi1 = nilaiProvokasi1;
    }

    public boolean isLevelNKTrue() {
        return levelNKTrue;
    }

    public void setLevelNKTrue(boolean levelNKTrue) {
        this.levelNKTrue = levelNKTrue;
    }

    public boolean isLevelNKFalse() {
        return levelNKFalse;
    }

    public void setLevelNKFalse(boolean levelNKFalse) {
        this.levelNKFalse = levelNKFalse;
    }

    public double getNilaiNKTrue() {
        return nilaiNKTrue;
    }

    public void setNilaiNKTrue(double nilaiNKTrue) {
        this.nilaiNKTrue = nilaiNKTrue;
    }

    public double getNilaiNKFalse() {
        return nilaiNKFalse;
    }

    public void setNilaiNKFalse(double nilaiNKFalse) {
        this.nilaiNKFalse = nilaiNKFalse;
    }

    public double getNilaiKebenaran() {
        return nilaiKebenaran;
    }

    public void setNilaiKebenaran(double nilaiKebenaran) {
        this.nilaiKebenaran = nilaiKebenaran;
    }
    
    
}
