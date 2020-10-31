package pbo2.pkg10116147.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan perbandingan dua nilai.
 */

public class PBO210116147Latihan24PerbandinganDuaBuahNilai {

    static void perbandinganNilai(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nMasukkan nilai pertama\t: ");
        int nilaiPertama = scan.nextInt();
        System.out.print("Masukkan nilai kedua\t: ");
        int nilaiKedua = scan.nextInt();        
        
        int hasil;
        System.out.print("Hasil Perbandingan\t: ");
        if(nilaiPertama > nilaiKedua)
            System.out.println(nilaiPertama +" lebih besar dari " +nilaiKedua);
        else if(nilaiPertama < nilaiKedua)
            System.out.println(nilaiPertama +" lebih kecil dari " +nilaiKedua);
        else if(nilaiPertama == nilaiKedua)
            System.out.println(nilaiPertama +" sama dengan " +nilaiKedua);
        else
            System.out.println("Pastikan nilai yang anda masukkan adalah angka!");
    }
    
        public static String opsiPengguna(){           
            Scanner scan = new Scanner(System.in);
            System.out.print("\nUlangi aktivitas? (Ya/Tidak)\t: ");          
            String getOpsi = scan.next();
            return getOpsi;        
        }
        
    public static void main(String[] args) {
        System.out.println("======= PROGRAM PERBANDINGAN NILAI =======");
        System.out.println("Developed by Garry Prang");
        perbandinganNilai();
        String getOpsi = opsiPengguna();
        
        while(getOpsi.equals("ya") || getOpsi.equals("Ya")){
            perbandinganNilai();
            getOpsi = null;
            getOpsi = opsiPengguna();
        }                
    }
}
