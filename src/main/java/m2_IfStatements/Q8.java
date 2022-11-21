package m2_IfStatements;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

      /*
      Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
      olup olmadigini yazdirin.
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char karakter = input.next().charAt(0);

        if (karakter>='A' && karakter<='Z'){
            System.out.println("Karakter buyuk harftir ==> " + karakter);
        }else {
            System.out.println("Karakter buyuk harf degildir ==> " + karakter);
        }
    }
}
