/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class SoalUKL3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int n = input.nextInt();

        long faktorial = + 1;

        // Menghitung faktorial
        for (int i = 1; i <=n; i++) {
            faktorial *= i;
            System.out.print(i);
            if(i<n){
                System.out.print("*");
            }
        }

        System.out.println(" bilangan faktorial " + faktorial);
    }
}
