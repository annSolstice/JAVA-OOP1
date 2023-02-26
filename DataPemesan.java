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
public class DataPemesan implements Payment{
    private String nama;
    private String alamat;
    private String tujuan;
    private String noTelepon;
    private int jenisLayanan;
    private double jarak;
    protected double harga;

    public DataPemesan() {
    }

    public DataPemesan(String nama, String alamat, String tujuan, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tujuan = tujuan;
        this.noTelepon = noTelepon;
//        this.jenisLayanan = jenisLayanan;
//        this.harga = harga;
    }

    @Override
    public double totalPembayaran() {
        return 0;
    }
    
    public void tentukanJenis() {
        //untuk membuat output jenisLayanan menampilkan berupa tulisan (String)
        //karena tipe data jenisLayanan integer
        if (jenisLayanan == 1) {
            System.out.println("    Jenis Layanan : GoRide");
        } else if (jenisLayanan == 2) {
            System.out.println("    Jenis Layanan : GoFood");
        } else if (jenisLayanan == 3) {
            System.out.println("    Jenis Layanan : GoSend");
        }
    }
    
    public void tentukanJarak() {
        //diasumsikan titik awal (alamat) adlh Titik 0 KM YOGYA dan sekitarnya
        //dengan satuan km
        switch (tujuan) {
            case "KERATON":
                jarak = 0.5;
                break;
            case "MALIOBORO":
                jarak = 2;
                break;
            case "COLOMBO":
                jarak = 4;
                break;
            case "KOTAGEDE":
                jarak = 5;
                break;
            case "AMPLAZ":
                jarak = 6;
                break;
            case "MAGUWOHARJO":
                jarak = 10;
                break;
            case "PAINGAN":
                jarak = 12;
                break;
        }
        tentukanHarga();
    }
    
    public double tentukanHarga() {
        if (jenisLayanan == 1) { //GoRide
            if (jarak > 0 && jarak <= 1) {
                harga = 10000;
            } else if (jarak > 1 && jarak <= 5) {
                harga = 13000;
            } else if (jarak > 5 && jarak <= 10) {
                harga = 18000;
            } else if (jarak > 10) {
                harga = 25000;
            }
        } else if (jenisLayanan == 2) { //GoFood
            //harga dikalikan 2 karena dihitung titik awal-resto-tujuan
            if (jarak > 0 && jarak <= 1) {
                harga = 7000*2;
            } else if (jarak > 1 && jarak <= 5) {
                harga = 10000*2;
            } else if (jarak > 5 && jarak <= 10) {
                harga = 13000*2;
            } else if (jarak > 10) {
                harga = 16000*2;
            }
        } else if (jenisLayanan == 3) { //GoSend
            if (jarak > 0 && jarak <= 1) {
                harga = 10000;
            } else if (jarak > 1 && jarak <= 5) {
                harga = 15000;
            } else if (jarak > 5 && jarak <= 10) {
                harga = 20000;
            } else if (jarak > 10) {
                harga = 25000;
            }
        }
        return harga;
    }
    
    //method set get
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public int getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(int jenis) {
        this.jenisLayanan = jenis;
    }
    
}
