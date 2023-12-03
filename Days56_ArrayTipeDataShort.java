/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISC_Project;

/**
 *
 * @author arham
 */
public class Days56_ArrayTipeDataShort {
    public static void main(String[] args) {
        short [] nilai = { -32768 , 55, 60, 65, 70, 75, 80, 85, 90, 95, 32767};
        for (short i = 0; i < nilai.length; i++) {
            System.out.println( "  nilai : " + nilai[i]);

        }
        System.out.println("");
        System.out.println("    Nilai minimal = " + Short.MIN_VALUE );
        System.out.println("    Nilai maxsimun = "+ Short.MAX_VALUE);
    }
    
}
