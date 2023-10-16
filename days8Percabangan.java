import java.util.Scanner;

public class days8Percabangan {
    public static void main(String[] args) {
        int jumlahTidakCoding;
        String nama;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("nama :");
        nama = scan.nextLine();
        System.out.print("Jumlah tidak Coding : ");
        jumlahTidakCoding = scan.nextInt();
        
        if(jumlahTidakCoding <= 3){
            System.out.println("selamat " + nama + " anda di terima di ISC");
             }else{
             System.out.println("maaf " + nama + " anda di kick oleh mentor");
        }
        
       
        
    }
    
}
