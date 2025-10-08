// Program: DataPegawai.java
// Fokus: Penerapan Class dan Object dalam PBO

public class pertemuan2 {   
    public static void main(String[] args) {
        // Membuat objek dari class Pegawai
        Pegawai pegawai1 = new Pegawai("Andi", "PG001", "Keuangan", 5000000);
        Pegawai pegawai2 = new Pegawai("Budi", "PG002", "HRD", 4500000);
        Pegawai pegawai3 = new Pegawai("Citra", "PG003", "IT", 6000000);

        // Menampilkan data masing-masing pegawai
        System.out.println("=== DATA PEGAWAI ===");
        pegawai1.tampilkanData();
        pegawai2.tampilkanData();
        pegawai3.tampilkanData();

        // Mengubah gaji pegawai
        pegawai2.setGaji(4800000);
        System.out.println("\nSetelah perubahan gaji Budi:");
        pegawai2.tampilkanData();
 
   }
}

// ==========================
// CLASS PEGAWAI
// ==========================
class Pegawai {
    // Atribut (variabel anggota)
    private String nama;
    private String idPegawai;
    private String jabatan;
    private double gaji;

    // Constructor (digunakan untuk inisialisasi objek)
    public Pegawai(String nama, String idPegawai, String jabatan, double gaji) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Method setter dan getter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    // Method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("ID Pegawai   : " + idPegawai);
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("Gaji         : Rp " + gaji);
        System.out.println("-----------------------------");
    }
}
