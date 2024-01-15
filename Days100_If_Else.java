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
public class Days100_If_Else {

    public static void main(String[] args) {
        int jumlah_coding;

        Scanner ar = new Scanner(System.in);
        System.out.print("Masukkan jumlah coding :");
        jumlah_coding = ar.nextInt();
        if (jumlah_coding >= 100) {
            System.out.println("Selamat anda menjadi anggota ISC");
        } else {
            System.out.println("anda di kick dari ISC");
        }

    }
}
