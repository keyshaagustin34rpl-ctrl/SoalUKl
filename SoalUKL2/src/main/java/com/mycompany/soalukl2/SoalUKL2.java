/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl2;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class SoalUKL2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        for (int d=50; d>=39; d--){
         if (d % 3 == 0){
            System.out.println(d + ".saya angkatan 34");
         } else if (d % 2 == 0){
         System.out.println(d +".Saya anak moklet");
         }else{
         System.out.println(d +".Saya anak wikusama");
         }
        }System.out.println("1. Saya senang");
    }
}
    

