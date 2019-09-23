/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan4.kambing;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Pada latihan ini yaitu membuat program membuat method
 * dengan aksi untuk menambahkan nilai pada variable dan menampilkannya ke
 * konsol
 */
public class PBO210118068Latihan4Kambing {

    public void tambahKambing() {
        // deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118068Latihan4Kambing kambingJantan = 
                new PBO210118068Latihan4Kambing();
        
        kambingJantan.tambahKambing();
    }
    
}
