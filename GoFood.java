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
public class GoFood extends DataPemesan{
    private double ongKir;

    public GoFood() {
    }

    public GoFood(String nama, String alamat, String tujuan, String noTelepon) {
        super(nama, alamat, tujuan, noTelepon);
    }

    @Override
    public double totalPembayaran() {
        return harga + getOngKir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //method set get
    public double getOngKir() {
        return ongKir;
    }

    public void setOngKir(double ongKir) {
        this.ongKir = ongKir;
    }

}
