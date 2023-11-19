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
public class Days42_perulangan {
    public static void main(String[] args) {
        Scanner ar = new Scanner (System.in);
        int n;
        int m;
        System.out.print("masukkan nilai n : ");
        n = ar.nextInt();
        System.out.print("masukkan nilai m : ");
        m = ar.nextInt();
        int k,l ;
        if (n>m){
            k=m;
            l=n;
           
        }else{
            k=n;
            l=m;
        }
     
        for (int i = k + 1; i < l; i++) {
           
            
            System.out.print(i);
            if (i!=l-1){
                System.out.print(", ");
                
            }
            
            
        }
        
        System.out.println("");
            
        }
    }
    

