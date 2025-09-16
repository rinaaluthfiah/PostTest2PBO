/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Konsultasi;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ISRINA LUTHFIAH
 */
public class KonsultasiService {
    private ArrayList<Konsultasi> daftar = new ArrayList<>();
    private int nextId = 1;
    private Scanner scan = new Scanner(System.in);

    public void tambahData() {
        System.out.print("Masukkan Nama pasien      : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Keluhan pasien   : ");
        String keluhan = scan.nextLine();
        System.out.print("Masukkan Jadwal konsultasi: ");
        String jadwal = scan.nextLine();

        daftar.add(new Konsultasi(nextId++, nama, keluhan, jadwal));
        System.out.println("Data berhasil ditambahkan\n");
    }

    public void tampilData() {
        if (daftar.size() == 0) {
            System.out.println("Belum ada data\n");
        } else {
            System.out.println("=== DAFTAR KONSULTASI ===");
            for (Konsultasi k : daftar) {
                System.out.println("-------------------------------");
                System.out.println("ID     : " + String.format("%03d", k.id));
                System.out.println("Nama   : " + k.nama);
                System.out.println("Keluhan: " + k.keluhan);
                System.out.println("Jadwal : " + k.jadwal);
            }
        }
    }

    public void updateData() {
        System.out.print("Masukkan ID yang akan diubah: ");
        int id = scan.nextInt();
        scan.nextLine();
        Konsultasi k = cariId(id);
        if (k != null) {
            System.out.print("Nama baru      : ");
            k.nama = scan.nextLine();
            System.out.print("Keluhan baru   : ");
            k.keluhan = scan.nextLine();
            System.out.print("Jadwal baru    : ");
            k.jadwal = scan.nextLine();
            System.out.println("Data berhasil diubah!");
        } else {
            System.out.println("ID tidak ditemukan.");
        }
    }

    public void hapusData() {
        System.out.print("Masukkan ID yang ingin dihapus: ");
        int id = scan.nextInt();
        scan.nextLine();
        Konsultasi k = cariId(id);
        if (k != null) {
            daftar.remove(k);
            System.out.println("Data berhasil dihapus\n");
        } else {
            System.out.println("ID tidak ditemukan\n");
        }
    }

    public void searchData() {
        System.out.print("Masukkan nama pasien yang dicari: ");
        String keyword = scan.nextLine();
        boolean found = false;
        System.out.println("=== HASIL PENCARIAN ===");
        for (Konsultasi k : daftar) {
            if (k.nama.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("-------------------------------");
                System.out.println("ID     : " + String.format("%03d", k.id));
                System.out.println("Nama   : " + k.nama);
                System.out.println("Keluhan: " + k.keluhan);
                System.out.println("Jadwal : " + k.jadwal);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan\n");
        }
    }

    private Konsultasi cariId(int id) {
        for (Konsultasi k : daftar) {
            if (k.id == id) return k;
        }
        return null;
    }
}