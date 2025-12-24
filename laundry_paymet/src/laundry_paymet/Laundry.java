/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry_paymet;

/**
 *
 * @author user
 */
public  abstract class Laundry implements LaundryService{
     protected double hargaPerKilo;

    public Laundry(double hargaPerKilo) {
        this.hargaPerKilo = hargaPerKilo;
    }

    // Enkapsulasi
    public double getHargaPerKilo() {
        return hargaPerKilo;
    }

    public void setHargaPerKilo(double hargaPerKilo) {
        this.hargaPerKilo = hargaPerKilo;
    }
}
