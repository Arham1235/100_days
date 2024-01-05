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
public class Days89_Scanner_pembagian_Byte {

    public static void main(String[] args) {
        byte a, b;
        Scanner ar = new Scanner(System.in);
        System.out.print("masukkan nilai A : ");
        a = ar.nextByte();
        System.out.print("masukkan nilai B : ");
        b = ar.nextByte();
        System.out.println("hasil = " + (a / b));
    }

}
