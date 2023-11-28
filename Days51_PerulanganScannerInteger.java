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
public class Days51_PerulanganScannerInteger {
    public static void main(String[] args) {
        Scanner ar = new Scanner (System.in);
        int a;
        int b;
        System.out.print("masukkan nilai A : ");
        a = ar.nextInt();
        System.out.print("masukkan nilai B : ");
        b = ar.nextInt();
        for (int i = a; i < b; i++) {
            System.out.println(i);
            
        }
    }
    
}
