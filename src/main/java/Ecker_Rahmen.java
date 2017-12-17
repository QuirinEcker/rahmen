/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: Rahmen
 * Autoren:     Ecker Quirin
 * Version:     1.0
 * Datum:       17.12.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Rahmen um eine Zahl.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Anzahl der Ziffern ausrechnen und Sterne ausgeben.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Rahmen {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number;
        int digitCount = 0;
        int numberToDivide;

        System.out.print("Zahl: ");
        number = scanner.nextInt();

        numberToDivide = number;

        //DigitCount Calculate
        for (digitCount = 0; numberToDivide > 0; digitCount++){
            numberToDivide /= 10;
        }

        //Border-Top
        for (int i = digitCount + 4;i != 0;i--){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("**");
        for (int i = digitCount; i > 0; i--){
            System.out.print(" ");
        }
        System.out.print("**");
        System.out.println();


        //Border Mid
        System.out.println("* " + number + " *");

        //Border Buttom
        System.out.print("**");
        for (int i = digitCount; i > 0; i--){
            System.out.print(" ");
        }
        System.out.println("**");
        for (int i = digitCount + 4;i != 0;i--){
        System.out.print("*");
        }
    }
}
