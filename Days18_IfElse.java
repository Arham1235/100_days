
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arham
 */
public class Days18_IfElse {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
       
        String nm;
        int ts;
        int  tl;
        System.out.println("====================================================");
        System.out.print("Nama : ");
        nm = ar.next();
        
        System.out.print("Tahun Sekarang : ");
        ts = ar.nextInt();
        System.out.print("Tahun lahir : ");
        tl = ar.nextInt();
        
        System.out.print(" Umur anda : ");
        System.out.print(ts-tl+ " Tahun ");
        
        
        if(tl>2007){
            System.out.println(" ( Gologan bocill ) ");
        }
        if(tl<=2000){
            System.out.println(" ( Gologan dewasa )");
           
        }else{
            System.out.println(" ( Golongan remaja )");
        }
    }
    
}
