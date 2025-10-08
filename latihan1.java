import java.util.Scanner;

public class latihan1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Data Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        // Array untuk menyimpan data
        String[] nama = new String[n];
        String[] nim = new String[n];
        String[] prodi = new String[n];
        int[] nilai = new int[n];
        int[] umur =new int[n];

        // Input data mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i+1));
            
            System.out.print("Nama   : ");
            nama[i] = input.next();

            System.out.print("NIM    : ");
            nim[i] = input.next();

            System.out.print("Prodi  : ");
            prodi[i] = input.next();

            System.out.print("Nilai  : ");
            nilai[i] = input.nextInt();
            System.out.print("umur   :");
            umur [i] = input.nextInt();
        }

        // Menampilkan hasil data mahasiswa
        System.out.println("\n=== DATA MAHASISWA ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama   : " + nama[i]);  
            System.out.println("NIM    : " + nim[i]);
            System.out.println("Prodi  : " + prodi[i]);
            System.out.println("Nilai  : " + nilai[i]);

            // Percabangan if
            if (nilai[i] >= 60) {
                System.out.println("Keterangan: Lulus");
            } else {
                System.out.println("Keterangan: Tidak Lulus");
            }
            System.out.println("-------------------------");
        }

        input.close();
    }
}
