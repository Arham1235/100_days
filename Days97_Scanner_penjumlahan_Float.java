/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISC_Project;

import java.util.Scanner;

/**
 *
 * @author arham
 */
public class Days97_Scanner_penjumlahan_Float {

    public static void main(String[] args) {

        double a, b;
        Scanner ar = new Scanner(System.in);
        System.out.print("masukkan nilai A : ");
        a = ar.nextFloat();
        System.out.print("masukkan nilai B : ");
        b = ar.nextFloat();
        System.out.println("hasil = " + (a % b));
    }
}
