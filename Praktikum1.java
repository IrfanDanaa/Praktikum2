package Percabangan1;
import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.print("Masukkan nilai : "); 
        nilai=input.nextInt();
        
        if (nilai % 5 == 0 && nilai % 2 != 0){
            System.out.println("Program Started");
        } else {
            System.out.println("Program Halted");
        }
   }    
}