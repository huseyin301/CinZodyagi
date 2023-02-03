package Zodyagi;

import java.util.Scanner;

public class ZodyagiHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year, zod;
        String zodYagi = "";

        System.out.print("Lütfen doğduğunuz yılı giriniz : ");
        year = sc.nextInt();

        zod = year % 12;

        switch (zod) {

            case 0:
                zodYagi = "Maymun";
                break;
            case 1:
                zodYagi = "Horoz";
                break;
            case 2:
                zodYagi = "Köpek";
                break;
            case 3:
                zodYagi = "Domuz";
                break;
            case 4:
                zodYagi = "Fare";
                break;
            case 5:
                zodYagi = "Öküz";
                break;
            case 6:
                zodYagi = "Kaplan";
                break;
            case 7:
                zodYagi = "Tavşan";
                break;
            case 8:
                zodYagi = "Ejderha";
                break;
            case 9:
                zodYagi = "Yılan";
                break;
            case 10:
                zodYagi = "At";
                break;
            case 11:
                zodYagi = "Koyun";
                break;

        }

            System.out.print("Çin Zodyağı Burcunuz : " + zodYagi);

    }
}
