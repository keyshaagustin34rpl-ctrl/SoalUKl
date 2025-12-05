/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl5;

/**
 *
 * @author USER
 */
import java.util.HashMap;

public class SoalUKL5 {

    public static void main(String[] args) {

        // Array berisi elemen
        int[] array = {1, 1, 2, 2, 2, 3, 4};

        // HashMap untuk menyimpan frekuensi kemunculan setiap elemen
        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        // Loop setiap elemen pada array
        for (int i = 0; i < array.length; i++) {
            int nilai = array[i];

            // Jika angka sudah ada → tambahkan 1
            if (frekuensi.containsKey(nilai)) {
                frekuensi.put(nilai, frekuensi.get(nilai) + 1);
            } else {
                // Jika belum ada → set 1
                frekuensi.put(nilai, 1);
            }
        }

        // Output hasil
        System.out.println("=== Hasil Frekuensi Kemunculan Elemen ===");
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }
    }
}
