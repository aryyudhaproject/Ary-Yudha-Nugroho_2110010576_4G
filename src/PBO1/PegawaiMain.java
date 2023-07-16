
package PBO1;

import java.util.Scanner;


public class PegawaiMain  {
    public static void main(String[] args) {
        
    //Erorr Handling
    try{
    //import(I/O Sederhana)
    Scanner scanner = new Scanner(System.in);
    
    //Aray
    DataPegawai[] pgw = new DataPegawai[3];
        
    //Perulangan
    for(int i=0; i<pgw.length; i++) {
        System.out.println("MASUKKAN NAMA DATA PEGAWAI BERIKUT!!!...");
        System.out.print("Nama Pegawai " +(i+1)+":");
        String nama = scanner.nextLine();
        System.out.print("NIP Pegawai "+(i+1)+":");
        String nip = scanner.nextLine();
        System.out.print("Jabatan Pegawai "+(i+1)+":");
        String jabatan = scanner.nextLine();
        System.out.print("Tempat Lahir "+(i+1)+":");
        String lahir = scanner.nextLine();
        System.out.print("Nomor Telpon "+(i+1)+":");
        String telp = scanner.nextLine();
        
        //objek
        pgw[i] = new DataPegawai(nama, nip, jabatan, lahir, telp);
    }
    
    for(DataPegawai data: pgw) {
        System.out.println("--------------------------");
        System.out.println("Data Pegawai");
        System.out.println(data.displayInfo());
        }
    
    } catch (NumberFormatException e) {
            System.out.println("Kesalahan Nomor: Mohon Dicek Kembali..."
                    +e.getMessage());
    } catch (StringIndexOutOfBoundsException e){
            System.out.println("Format NIP Salah: Mohon Dicek Kembali...."
                    +e.getMessage());
    } catch (Exception e) {
            System.out.println("Kesalahan Umum : Silahkan Dicek Kembali..."
                    +e.getMessage());
            }   
}
}
