
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arham
 */
public class days17_If_Scanner {
    public static void main(String[] args) {
        Scanner ktp = new Scanner(System.in);
        int umur;
        int nim;
        long nik;
        int rt_rw;
        String  tempat_tgl_Lahir;
        String jenis_kelamin ;
        String alamat;
        String kel_desa;
        String kecamatan;
        String status_perkawinan;
        String pekerjaan;
        String kewarganegaraan;
        String berlaku_hingga;
        String nama;
        String agama;
        System.out.println("               PROVENSI SULAWESI BARAT    ");
         System.out.println("             KABUPATEN POLEWALI MANDAR    ");
         System.out.println("");
         
        System.out.print("NIK : ");
        nik = ktp.nextLong();
         
        System.out.print("Nama : ");
        nama = ktp.next();
         
        System.out.print("Tempat/Tgl lahir : ");
        tempat_tgl_Lahir = ktp.next();
         
        System.out.print("Jenis Kelamin : ");
        jenis_kelamin = ktp.next();
  
        System.out.print("Alamat : ");
        alamat = ktp.next();
         
        System.out.print("RT/RW : ");
        rt_rw = ktp.nextInt();
         
        System.out.print("Kel/Desa : ");
        kel_desa = ktp.next();
         
        System.out.print("Kecamatan : ");
        kecamatan = ktp.next();
         
        System.out.print("Agama : ");
        agama = ktp.next();
           
        System.out.print("Status perkawinan : ");
        status_perkawinan = ktp.next();
           
           
        System.out.print("Pekerjaan : ");
        pekerjaan = ktp.next();
           
        System.out.print("Kewarganegaraan : ");
        kewarganegaraan = ktp.next();
           
        System.out.print("Berlaku Hingga : ");
        berlaku_hingga = ktp.next();
           System.out.println("");
           System.out.println("");
           System.out.println("=================================================");
           System.out.println("              PROVENSI SULAWESI BARAT    ");
           System.out.println("              KABUPATEN POLEWALI MANDAR    ");
           System.out.println("");
           System.out.println("NIK : "+nik);
           System.out.println("NAMA : "+nama);
           System.out.println("Tempat tanggal lahir :"+tempat_tgl_Lahir);
           System.out.println("Jenis Kelamin : "+jenis_kelamin);
           System.out.println("Alamat : "+alamat);
           System.out.println("RT/RW : "+rt_rw);
           System.out.println("Kel/Desa :" +kel_desa);
           System.out.println("Kecamatan : "+kecamatan);
           System.out.println("Agama : "+agama);
           System.out.println("Status Perkawinan : "+status_perkawinan);
           System.out.println("Pekerjaan : "+pekerjaan);
           System.out.println("kewarganegaraan : "+kewarganegaraan);
           System.out.println("Berlaku Hingga : "+berlaku_hingga);
           System.out.println("===============================================");
           
           
         
         
         
        
         
        
    }
    
}
