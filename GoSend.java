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
public class GoSend extends DataPemesan{
    private double bonus;

    public GoSend() {
    }

    public GoSend(String nama, String alamat, String tujuan, String noTelepon) {
        super(nama, alamat, tujuan, noTelepon);
    }
    
    @Override
    public double totalPembayaran() {
        return harga + getBonus(); //To change body of generated methods, choose Tools | Templates.
    }

    //method set get
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
