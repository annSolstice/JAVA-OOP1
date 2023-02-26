/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_Sem2;

import java.util.Scanner;

/**
 *
 * @author Resiana Kinanti
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPemesan person = new DataPemesan();
        DataLayanan gojek = new DataLayanan();
        gojek.setNamaGojek("HERU");
        gojek.setNoTelepon("08512345678");
        
        System.out.print("Masukkan jumlah pemesan : ");
        int jumlah = sc.nextInt();
        DataLayanan[] data = new DataLayanan[jumlah];
        for (int i = 0; i < jumlah; i++) {
            data[i] = new DataLayanan();
            String nama, alamat, tujuan, noTelp;    int jenis;
            String[] nLayanan= {"GoRide", "GoFood", "GoSend"};
            
            System.out.print("Masukkan Nama Pemesan \t: " );
            nama = sc.next();
            System.out.print("Masukkan Alamat \t: ");
            alamat = sc.next();
            System.out.print("Masukkan Tujuan \t: ");
            tujuan = sc.next();
            System.out.print("Masukkan No. Telepon \t: ");
            noTelp = sc.next();
            System.out.println("1. "+nLayanan[0]+" \n2. "+nLayanan[1]+" \n3. "+nLayanan[2]+" ");
            System.out.print("Masukkan Jenis Layanan \t: ");
            jenis = sc.nextInt();
//-----------------
            switch (jenis) {
                case 1:
                    person = new GoRide(nama, alamat, tujuan, noTelp);
	            System.out.print("Besar uang bensin \t: ");
                    double uBensin = sc.nextDouble();
                    ((GoRide) person).setUangBensin(uBensin);
                    break;
                case 2:
                    person = new GoFood(nama, alamat, tujuan, noTelp);
                    System.out.print("Besarnya Ongkos Kirim \t: ");
                    double ongkir = sc.nextDouble();
                    ((GoFood) person).setOngKir(ongkir);
                    break;
                case 3:
                    person = new GoSend(nama, alamat, tujuan, noTelp);
                    System.out.print("Besarnya Bonus \t\t: ");
                    double bonus = sc.nextDouble();
                    ((GoSend) person).setBonus(bonus);
                    break;
            }
            person.tentukanJarak();
            person.tentukanHarga();
            person.setJenisLayanan(jenis);
            data[i].setPesanan(person);
        }
//-----------------
        System.out.println("---------------------------------------------------------------");
        System.out.println("Hasil Rekap");
        System.out.println("Gojek : " +gojek.getNamaGojek());
        System.out.println("No.Telepon : " +gojek.getNoTelepon());
        System.out.println("Jumlah pemesan : " +jumlah);
        double total = 0;
        for (int j = 0; j < data.length; j++) {
            for (int k = 0; k < data[j].getJumlahP(); k++) {
                System.out.println("    Nama\t: " + data[j].getPesanan(k).getNama());
                System.out.println("    Alamat\t: " +data[j].getPesanan(k).getAlamat());
                System.out.println("    Tujuan\t: " +data[j].getPesanan(k).getTujuan());
                System.out.println("    No. Telepon : " +data[j].getPesanan(k).getNoTelepon());
                data[j].getPesanan(k).tentukanJenis();
                System.out.println("    Harga \t: "+data[j].getPesanan(k).tentukanHarga());
//-----------------
                if (data[j].getPesanan(k) instanceof GoRide) {
                        System.out.println("    Besar uang bensin: " + ((GoRide) data[j].getPesanan(k)).getUangBensin());
                } else if (data[j].getPesanan(k) instanceof GoFood) {
                        System.out.println("    Besar ongkos kirim: " + ((GoFood) data[j].getPesanan(k)).getOngKir());
                } else if (data[j].getPesanan(k) instanceof GoSend) {
                        System.out.println("    Besar bonus: " + ((GoSend) data[j].getPesanan(k)).getBonus());
                }
                System.out.println("    Besar total pembayaran: " +data[j].getPesanan(k).totalPembayaran());
                total = total + data[j].getPesanan(k).totalPembayaran();
            }
        }
        System.out.println("Besar Pendapatan Kotor : " +total);
        //dalam satu hari
        //program gojek untuk driver ojek online kota Yogyakarta
    }
}