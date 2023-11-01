
import java.util.Scanner;


public class Days24_Percabangan_SWITCH_CASE {
    
     public static void main(String[] args) {
         
        String perasaanya;
        Scanner scan = new Scanner(System.in);

     
        System.out.print("Perasaannya ke kamu : ");
        perasaanya = scan.nextLine();

        switch(perasaanya){
            case "suka":
                System.out.println("Ungkapkan perasaan mu segera, sebelu di tikung rossi");
                break;
            case "ragu":
                System.out.println("coba tanyakan apaka dia menyukaimu");
                break;
            case "tidak suka":
                System.out.println("mundur lah , sebab anda buka tipenya");
                break;
            default:
                System.out.println("anda salah orang, dia istri orang");
        }
    }
    
}
