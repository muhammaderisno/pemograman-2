/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry_paymet;

/**
 *
 * @author user
 */
public class CuciKering extends Laundry {

    public CuciKering(double hargaPerKilo) {
        super(hargaPerKilo);
    }

    @Override
    public double hitungTotal(double berat) {
        return berat * hargaPerKilo + 2000; // biaya tambahan
    }

    @Override
    public String getJenis() {
        return "Cuci Kering";
    }
}

