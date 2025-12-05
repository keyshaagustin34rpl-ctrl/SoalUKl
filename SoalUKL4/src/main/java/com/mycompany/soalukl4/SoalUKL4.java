/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl4;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SoalUKL4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100) + 1; // random 1-100
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        System.out.println("=== Permainan Tebak Angka 1-100 ===");

        int tebakan = 0;
        while (tebakan != angkaBenar) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            // Simpan ke arraylist
            riwayatTebakan.add(tebakan);

            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
            }
        }

        // Menampilkan seluruh tebakan
        System.out.println("\nRiwayat tebakan Anda:");
        for (int i = 0; i < riwayatTebakan.size(); i++) {
            System.out.println((i+1) + ". " + riwayatTebakan.get(i));
        }

        System.out.println("\nTerima kasih telah bermain!");
    }
}