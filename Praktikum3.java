package Percabangan1;
import java.util.Scanner;
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double barang, cashback = 0, bonus = 0;
        System.out.println("====== Selamat Datang di Toko Charlie ======");
        System.out.print("Banyak pembelian barang : "); barang=input.nextDouble();
        System.out.println("============================================");
        
        
        if (barang >= 3) {
            bonus = (barang/3);
        }
        if (barang >= 7) {
            cashback = (barang/7)*5500;
        }
        if (barang <= 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
            return;
        }
        System.out.println("Cashback : Rp" +(int)cashback);
        System.out.println("Tambahan Barang: "+ (int)bonus);
        System.out.println("Jumlah Barang: "+(int)(barang+bonus));
    }
}
