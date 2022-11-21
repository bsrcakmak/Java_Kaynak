package m2_IfStatements;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        /*
           Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
           olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ");
        char harf = input.next().charAt(0);

        // 1. yol;
        if (harf>='a' && harf<='z'){
            System.out.println((char)(harf-32));
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }


        // 2. yol;
        char karakter=input.next().charAt(0);
        if (Character.isUpperCase(karakter)){
            System.out.println(karakter);
        }
        else {
            System.out.println((Character.toUpperCase(karakter)));
        }







    }
}
