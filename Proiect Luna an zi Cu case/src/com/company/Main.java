package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti anul dorit:  ");
        Integer an = scanner.nextInt();
        System.out.print("Introduceti luna:  ");
        Integer month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            System.out.println("Luna are 31 zile");

        } else if (month == 4 || month == 6 || month == 9 || month == 11)

        {
            System.out.println("Luna are 30 zile");
        } else if (month == 2) {

        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Luna are 31 zile");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("Luna are 31 zile");
                break;
            case 2:
                // compute if leap year
                if ((an % 4) != 0) {
                    System.out.println("Luna are 28 zile ");
                } else if ((an % 100) != 0) {
                    System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
                } else if ((an % 400) != 0) {
                    System.out.println("Luna are 28 zile ");
                } else {
                    System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
                }
                break;

        }
    }
}



