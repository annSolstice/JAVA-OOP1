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
public class GoRide extends DataPemesan{
    private double uangBensin;
    public GoRide() {
    }

    public GoRide(String nama, String alamat, String tujuan, String noTelepon) {
        super(nama, alamat, tujuan, noTelepon);
    }
    
    @Override
    public double totalPembayaran() {
        return harga + getUangBensin(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //method set get
    public double getUangBensin() {
        return uangBensin;
    }

    public void setUangBensin(double uangBensin) {
        this.uangBensin = uangBensin;
    }
}
