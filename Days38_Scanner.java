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
public class Days38_Scanner {
    public static void main(String[] args) {
        String a,b;
        Scanner ar = new Scanner (System.in);
         System.out.println("1. Ikan apa yang punya kaki ? ");
         System.out.print("     Masukkan jawaban : ");
         a = ar.nextLine();
         System.out.println(" ");
        
         System.out.println("2. Tulikan tiga nama buah awalan N? ");
         System.out.print("     Masukkan jawaban : Contoh (Nanas), ");
         b = ar.nextLine();
         System.out.println(" ");
         System.out.println("Jawaban Anda ");
         System.out.println("1. "+a);
         System.out.println("2. Nanas "+b);
         System.out.println("Jawaban yang benar ");
         System.out.println("1. Ikan kodok ");
         System.out.println("2. Nanas, Nangka, Nambutan ");
    }
    
}
