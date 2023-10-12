import java.util.Scanner;


public class Days4_Percabangan {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
         
        System.out.print("nama : ");
        nama = scan.nextLine();
        System.out.print("nilai : ");
        nilai = scan.nextInt();
        
        if(nilai >= 70){
            System.out.println("selamat" + nama + ",anda lulus");
            
            
        } else {
            System.out.println("maaf" + nama + ",anda tidak lulus");
         
    }
    }
    
}
