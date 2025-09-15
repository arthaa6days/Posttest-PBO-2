/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import model.Tiket;
import service.TiketService;
/**
 *
 * @author Tuf Gaming
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TiketService service = new TiketService();
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Penjualan Tiket Konser ===");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Tiket");
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Cari Tiket");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) { // Validasi input angka
                System.out.println("❌ Input harus berupa angka!");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama konser: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan tanggal konser (dd-mm-yyyy): ");
                    String tanggal = input.nextLine();
                    System.out.print("Masukkan harga tiket: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("❌ Harga harus berupa angka!");
                        input.next();
                    }
                    double harga = input.nextDouble();
                    input.nextLine();
                    service.tambahTiket(new Tiket(nama, tanggal, harga));
                    break;

                case 2:
                    service.tampilkanTiket();
                    break;

                case 3:
                    service.tampilkanTiket();
                    System.out.print("Pilih nomor tiket yang ingin diupdate: ");
                    int idxUpdate = input.nextInt() - 1;
                    input.nextLine();
                    System.out.print("Masukkan nama konser baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan tanggal konser baru: ");
                    String tanggalBaru = input.nextLine();
                    System.out.print("Masukkan harga tiket baru: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("❌ Harga harus berupa angka!");
                        input.next();
                    }
                    double hargaBaru = input.nextDouble();
                    input.nextLine();
                    service.updateTiket(idxUpdate, new Tiket(namaBaru, tanggalBaru, hargaBaru));
                    break;

                case 4:
                    service.tampilkanTiket();
                    System.out.print("Pilih nomor tiket yang ingin dihapus: ");
                    int idxHapus = input.nextInt() - 1;
                    input.nextLine();
                    service.hapusTiket(idxHapus);
                    break;

                case 5:
                    System.out.print("Masukkan keyword nama konser: ");
                    String keyword = input.nextLine();
                    service.cariTiket(keyword);
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    break;

                default:
                    System.out.println("❌ Menu tidak valid.");
            }
        } while (pilihan != 6);

        input.close();
    }
}
