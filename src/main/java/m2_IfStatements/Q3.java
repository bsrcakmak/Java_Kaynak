package m2_IfStatements;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        /*
         Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= input.nextInt();

        if (girilenSayi%3==0) System.out.println("Uc ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("Bes ile bolunebilen sayi");
    }
}
