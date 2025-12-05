/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class SoalUKL1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        System.out.println("Deret Fibonacci:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Hitung ganjil / genap
            if (a % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }

            // Generate angka berikutnya
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\n-----------------------------");
        System.out.println("Jumlah bilangan genap : " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}