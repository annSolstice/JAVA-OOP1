/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_Sem2;

/**
 *
 * @author Resiana Kinanti
 */
public class DataLayanan {
    public static final int max_Pesan = 50;
    private String namaGojek;
    private String noTelepon;
    private DataPemesan[] pesanan;
    private int jumlahP;

    public DataLayanan() {
        pesanan = new DataPemesan[max_Pesan];
        jumlahP = 0;
    }

//    public DataLayanan(String namaGojek, String noTelepon) {
//        this.namaGojek = namaGojek;
//        this.noTelepon = noTelepon;
//    }

    public String getNamaGojek() {
        return namaGojek;
    }

    public void setNamaGojek(String namaGojek) {
        this.namaGojek = namaGojek;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public int getJumlahP() {
        return jumlahP;
    }
    
    public DataPemesan[] getPesanan() {
        return pesanan;
    }

    public DataPemesan getPesanan(int index) {
        return pesanan[index];
    }
    
    public void setPesanan(DataPemesan pesanan) {
        this.pesanan[this.jumlahP] = pesanan;
        this.jumlahP++;
    }

//    public void setPesanan(DataPemesan[] pesanan) {
//        this.pesanan = pesanan;
//    }

}
