
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arham
 */
public class Days26Switch_case {
    public static void main(String[] args) {
        String  seberapa_waras;
        Scanner rh = new Scanner(System.in);
        
        System.out.print("Silakan jawab.  1+1 ?  = ");
        seberapa_waras = rh.next();
            switch(seberapa_waras){
               case "2":
                System.out.println("Anda waras");
                  break;
               case "11":
                   System.out.println("IQ anda sangat luar biasa ");
                   break;
               default:
                   System.out.println("System tidak mengetahui anda waras atau tidak");
        
    }
    }
}
