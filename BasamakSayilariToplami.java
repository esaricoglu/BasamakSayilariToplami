package Donguler;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();
        int saveNumber = number;
        int digitValue;
        int result = 0;

        while (saveNumber != 0) {
            digitValue = saveNumber%10;
            saveNumber/=10;
            result += digitValue;
        }
        System.out.println(result);
    }
}

