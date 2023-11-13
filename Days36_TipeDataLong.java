/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISC_Project;

/**
 *
 * @author arham
 */
public class Days36_TipeDataLong {
    public static void main(String[] args) {
        long a,b,c,d;
        
        a = 1232333323 ;
        b = 213214124;
        c = 142523521;
        d = 16363565;
        
        long  ab = a+b;
        long  bc = b-c;
        long  cd = c*d;
        long  ad = a/d;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println(" ");
        System.out.println("a + b = "+ab);
        System.out.println("b - c = "+bc);
        System.out.println("c * d = "+cd);
        System.out.println("a / d = "+ad);
        System.out.println(" ");
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
    
    }
    
}
