package Percabangan1;
import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====== Indeks Berat Barang Bawaan Tasku ======");
        double laptop, buku, kotak, hp, blaptop, bbuku, bkotak, bhp, total;
        System.out.print("Berat Laptop \t\t: ");
        laptop=input.nextDouble();
        System.out.print("Berat Buku Tulis \t: ");
        buku=input.nextDouble();
        System.out.print("Berat Kotak Pensil \t: ");
        kotak=input.nextDouble();
        System.out.print("Berat smartphone \t: ");
        hp=input.nextDouble();
        
        blaptop = laptop*850.56;
        bbuku = buku*250.11;
        bkotak = kotak*2.31;
        bhp = hp*200.00;
        total = blaptop + bbuku + bkotak + bkotak + bhp;
        
        int barang = 0;
        if (total > 2000){
          barang = 5;
        } else if (total >= 1500 && total <= 2000){
            barang = 4;
        } else if (total >= 1000 && total < 1500){
            barang = 3;
        } else if (total >= 500 && total < 1000){
            barang = 2;
        } else if (total > 0 && total < 500){
            barang = 1;
        } else if (total == 0){
            barang = 0;
        }
        
        System.out.println("==============================================");
        System.out.println("Indeks berat barang \t: " + barang);
        
        if (blaptop < 0 || bbuku < 0 || bkotak < 0 || bhp < 0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        } else if (barang == 0|| barang == 1 || barang == 2 || barang == 3 || barang == 4){
            System.out.println("Bawaan barang tidak melebihi ketentuan, santuyyyy");
        } else if (barang == 5){
            System.out.println("Berat barang melebihi ketentuan");  
        } 
    }
}
