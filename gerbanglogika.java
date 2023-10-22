
import java.util.Scanner;


public class gerbanglogika {
    public static void main(String[] args) {
        
        int umur;
        String nama;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("nama :");
        nama = scan.nextLine();
        System.out.print("umur  : ");
        umur = scan.nextInt();
        
        if(umur <=19){
            System.out.print( nama + " kamu belum bisa pacaran  ");
        }
        if (umur >23 ){
            System.out.println(nama +" silakan pacaran jika ada yang mau");
        }else{
            System.out.println("ingat tugas kuliah kamu banyak");
        }
        
        
        }
           
    }
    
    
