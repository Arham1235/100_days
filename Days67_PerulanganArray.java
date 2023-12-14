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
public class Days67_PerulanganArray {
    public static void main(String[] args) {

       
        String[] nama = new String[5];

       
        Scanner ar = new Scanner(System.in);

       
        for( int i = 0; i < nama.length; i++ ){
            System.out.print("Nama ke-" + i + ": ");
            nama[i] = ar.nextLine();
        }

        System.out.println("---------------------------");

       
        for( String b : nama ){
            System.out.println(b);
        }

    }

    
}
