/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl6;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class SoalUKL6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan listrik (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int pemakaian = input.nextInt();

        int tarifPerKwh = 0;

        // Menentukan tarif berdasarkan golongan
        switch (golongan) {
            case "A":
                tarifPerKwh = 1200;
                break;
            case "B":
                tarifPerKwh = 1500;
                break;
            case "C":
                tarifPerKwh = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid! Program dihentikan.");
                return;
        }

        // Menghitung total awal
        double totalAwal = pemakaian * tarifPerKwh;
        double tambahan = 0;

        // Jika pemakaian > 500 kWh ada tambahan biaya 10%
        if (pemakaian > 500) {
            tambahan = totalAwal * 0.10;
        }

        // Total akhir
        double totalAkhir = totalAwal + tambahan;

        // Output
        System.out.println("\n===== RINCIAN TAGIHAN =====");
        System.out.println("Nama Pelanggan      : " + nama);
        System.out.println("Golongan Listrik    : " + golongan);
        System.out.println("Pemakaian Listrik   : " + pemakaian + " kWh");
        System.out.println("Total Sebelum Tambahan : Rp " + (int)totalAwal);
        System.out.println("Total Tagihan Akhir    : Rp " + (int)totalAkhir);
    }
}

    

