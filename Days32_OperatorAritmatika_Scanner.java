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
public class Days32_OperatorAritmatika_Scanner {
    public static void main(String[] args) {
        Scanner ar = new Scanner (System.in);
         System.out.println("===== Mencari Umur ===== ");
         int ts, tl;
         System.out.print("tahun sekarang : ");
         ts = ar.nextInt();
         System.out.print("tahun lahir : ");
         tl = ar.nextInt();
         
        int ut= ts-tl;
        int ub= ut*12;
        int up = ub*4;
        int uh = up*7;
       
        System.out.println("Umur Dalam Tahun : "+ut);
        System.out.println("Umur Dalam Bulan : " +ub);
        System.out.println("Umur Dalam Pekan : " +up);
        System.out.println("umur dalam hari : "+uh);
    }
    
}
