
import java.util.Scanner;


public class Days19Scanner {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
         String n,i,a;
         int ag;
         
         System.out.print("masukkan nama anda : ");
         n = ar.nextLine();
         System.out.print("Masukkan nim anda : ");
         i = ar.nextLine();
         System.out.print("Masukkan alamat anda :");
         a = ar.nextLine();
         System.out.print("Masukkan kapan anda masuk  :");
         ag = ar.nextInt();
         System.out.println("================================================");
         System.out.println("");
         System.out.println("");
         System.out.println("=================================================");
         System.out.println("");
         System.out.println("           KARTU MAHASISWA                     ");
         System.out.println("");
         System.out.println("NAMA     : " +n);
         System.out.println("NIM      : " +i);
         System.out.println("Alamat   : " +a);
         System.out.println("Angkatan : " +ag);
         System.out.println("");
         System.out.println("            FAKULTAS TEKNIK       ");
         System.out.println("           PRODI INFORMATIKA       ");
         System.out.println("       UNIVERSITAS SULAWESI BARAT       ");
         System.out.println("");
         System.out.println("");
         System.out.println("=================================================");
         
    }
    
}
