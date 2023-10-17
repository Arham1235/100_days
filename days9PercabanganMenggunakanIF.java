import java.util.Scanner;

public class days9PercabanganMenggunakanIF {
    
    public static void main(String[] args) {
        
         int belanja = 0;
        Scanner scan = new Scanner(System.in);

      
        System.out.print("Total Belanjaan: Rp.  ");
        belanja = scan.nextInt();

       
        if ( belanja > 200000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah !");
        }

        System.out.println("Terima kasih...");

                
    }
    
}
    

