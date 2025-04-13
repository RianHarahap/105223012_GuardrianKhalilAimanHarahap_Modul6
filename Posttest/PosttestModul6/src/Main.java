import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemenmhs = new ManajemenMahasiswa();
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK : ");
                    double ipk = input.nextDouble();
                    input.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemenmhs.tambahMahasiswa(mhs);
                    break;

                case 2:
                    manajemenmhs.tampilkanSemua();
                    break;

                case 3:
                    manajemenmhs.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 4);

        input.close();
    }
}
