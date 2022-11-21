package m2_IfStatements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double kenar1= input.nextDouble();
        double kenar2= input.nextDouble();
        double kenar3= input.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        } else{
            System.out.println("Eskenar degil");
        }

        /*
           If ile baslayan bir kod else ile bitiyorsa
           input'un tum degerlerini kapsar
           Yani her deger icin mutlaka kodumuzda bir body calisir
         */
    }
}
