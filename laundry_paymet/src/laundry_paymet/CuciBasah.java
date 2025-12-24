/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry_paymet;

/**
 *
 * @author user
 */
public class CuciBasah extends Laundry {
    public CuciBasah(double hargaPerKilo) {
        super(hargaPerKilo);
    }

   
    public double hitungTotal(double berat) {
        return berat * hargaPerKilo;
    }

    @Override
    public String getJenis() {
        return "Cuci Basah";
    }
}
