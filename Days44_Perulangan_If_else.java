
package ISC_Project;

import java.util.Scanner;
public class Days44_Perulangan_If_else {
    public static void main(String[] args) {
           int a,r;
        java.util.Scanner ar = new java.util.Scanner (System.in);
        System.out.print("Masukkan nilai awal : ");
        a = ar.nextInt();
        System.out.print("masukkan nilai akhir : ");
        r = ar.nextInt();
        for (int i = a; i < r; i++) {
            System.out.print(i);
            if (i<=50){
                System.out.print(", ");
                
            }else if(i >=51){
                System.out.print(" ");
            }
            
        }
        System.out.println("");
    
        
    }
    
}
