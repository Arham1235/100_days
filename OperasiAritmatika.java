
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arham
 */
public class OperasiAritmatika {
    public static void main(String[] args) {
         String nama, alamat, status;
         int umur;
         
        System.out.println("================  pendaftaran kerja  ===================== ");
       Scanner ar = new Scanner(System.in);
       
        System.out.print("nama :");
        nama = ar.nextLine();
        
        System.out.print("Status : ");
        status = ar.nextLine();
        
        System.out.print("alamat :");
        alamat = ar.nextLine();
        
        System.out.print("umur : ");
        umur = ar.nextInt();
         
       
        if (umur <= 18){
            System.out.println( "Maaf data anda ditolak oleh system !");
        }
        if (umur >=22){
            System.out.println("Selamat anda di terima kerja ");
        }else{
            System.out.println("Silakan konsultasi ke admin");
        }
    }
    
}
