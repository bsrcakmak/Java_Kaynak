package m2_IfStatements;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen ikizkenar ise “Ikizkenar ucgen” yazdirin, degilse “Ikizkenar degil” yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double kenar1= input.nextDouble();
        double kenar2= input.nextDouble();
        double kenar3= input.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3 ) ||
                (kenar2==kenar3 && kenar2!=kenar1 ) ||
                (kenar3==kenar1 && kenar3!=kenar2 )){
            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("Ikizkenar degil");
        }
    }
}
