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
public class Days31_InputanScanner {
    public static void main(String[] args) {
         Scanner ar = new Scanner (System.in);
        String nama, alamat;
        int umur;
        System.out.println("< =========== buat data diri anda ======= > ");
        System.out.print("Masukkan nama kamu    : ");
        nama = ar.nextLine();
        System.out.print("Masukkan alamat kamu  :");
        alamat = ar.nextLine();
        System.out.print("Masukkan umur kamu    :");
        umur = ar.nextInt();
        System.out.println("<========================================>");
        System.out.println("");
        System.out.println("");
        
        System.out.println("<====== Data diri Anda ======>");
        System.out.println("");
        System.out.println("Nama     : "+nama);
        System.out.println("Alamat   : "+ alamat);
        System.out.println("Umur     : "+umur+" Tahun");
        System.out.println("===========================>");
        
    }
    
}
