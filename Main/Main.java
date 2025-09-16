/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author ISRINA LUTHFIAH
 */

import Model.Konsultasi;
import Service.KonsultasiService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        KonsultasiService service = new KonsultasiService();
        Scanner scan = new Scanner(System.in);
        int pilih = 0;

        while (true) {
            System.out.println("\n=== SISTEM LAYANAN KONSULTASI PSIKOLOG ===");
            System.out.println("1. Tambah Data Konsutasi");
            System.out.println("2. Tampilkan Data Konsultasi");
            System.out.println("3. Perbarui Data Konsultasi");
            System.out.println("4. Hapus Data Konsultasi");
            System.out.println("5. Cari Data Konsultasi");
            System.out.println("6. Keluar");
            System.out.print("Silahkan pilih menu diatas (1-6): ");

            if (!scan.hasNextInt()) {
                System.out.println("Input harus  berupa angka");
                scan.nextLine();
                continue;
            }

            pilih = scan.nextInt();
            scan.nextLine();

            if (pilih == 1) service.tambahData();
            else if (pilih == 2) service.tampilData();
            else if (pilih == 3) service.updateData();
            else if (pilih == 4) service.hapusData();
            else if (pilih == 5) service.searchData();
            else if (pilih == 6) {
                System.out.println("Terima kasih telah menggunakan Layanan Konsultasi Psikolog ini.");
                break;
            }
            else System.out.println("Pilihan tidak ada, coba lagi!");
        }

        scan.close();
    }
}