/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry_paymet;

/**
 *
 * @author user
 */
public class Transaksi {

    private LaundryService laundry;
    private double berat;
    private double bayar;

    public Transaksi(LaundryService laundry, double berat, double bayar) {
        this.laundry = laundry;
        this.berat = berat;
        this.bayar = bayar;
    }

    public double getTotal() {
        return laundry.hitungTotal(berat);
    }

    public double getKembalian() {
        return bayar - getTotal();
    }

    public String getDetail() {
        return "=== DETAIL TRANSAKSI ===\n" +
               "Jenis Cuci     : " + laundry.getJenis() + "\n" +
               "Berat          : " + berat + " Kg\n" +
               "Harga / Kg     : Rp " + ((Laundry) laundry).getHargaPerKilo() + "\n" +
               "Total Harga    : Rp " + getTotal() + "\n" +
               "Bayar          : Rp " + bayar + "\n" +
               "Kembalian      : Rp " + getKembalian();
    }
}

