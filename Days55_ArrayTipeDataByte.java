/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISC_Project;

/**
 *
 * @author arham
 */
public class Days55_ArrayTipeDataByte {
    public static void main(String[] args) {
         byte[] nilai = {-127, 55, 60, 65, 70, 75, 80, 85, 90, 95, 127};
        for (byte i = 0; i < nilai.length; i++) {
            System.out.println( "  nilai : " + nilai[i]);

        }
        System.out.println(" ");
        System.out.println(" ==========================================");
        System.out.println("   Nilai minimal = " +"[ "+ Byte.MIN_VALUE+" ]" );
        System.out.println("   Nilai maksimal = "+"[ "+Byte.MAX_VALUE+" ]");
        System.out.println(" ");

    }
    
}
