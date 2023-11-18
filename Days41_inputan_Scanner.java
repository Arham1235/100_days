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
public class Days41_inputan_Scanner {
    public static void main(String[] args) {
        System.out.println("======= mencari umur ========");
        int ts,tl;
        String nama;
        Scanner ar = new Scanner (System.in);
        System.out.print("Masukkan nama : ");
        nama = ar.nextLine();
        System.out.print("Tahun Sekarang : ");
        ts = ar.nextInt();
        System.out.print("Tahun lahir : ");
        tl = ar.nextInt();
        int uk = ts-tl;
        int ub = uk*12;
        int uh = ub*30;
        System.out.println(" ");
        System.out.println("<============= hasil ===============>");
        System.out.println("Nama                : "+nama );
        System.out.println("Umur dalam tahun    : "+uk +" tahun");
        System.out.println("umur dalam bulan    : "+ub +" bulan");
        System.out.println("umur dalam hari     : "+uh +" hari");
        System.out.println(" ");
       
        
        
        
    }
    
}
