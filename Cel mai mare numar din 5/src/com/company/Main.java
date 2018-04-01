package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your number1:  ");
        int number1 = scanner.nextInt();

        int max = number1;

        System.out.print("Type your number2:  ");
        int number2 = scanner.nextInt();

        System.out.print("Type your number3:  ");
        int number3 = scanner.nextInt();

        System.out.print("Type your number4:  ");
        int number4 = scanner.nextInt();

        System.out.print("Type your number5:  ");
        int number5 = scanner.nextInt();

        if (number1 > max ) {
            number1 = max;
        }

        if (number2 > max ) {
            number2 = max;
        }
        if (number3 > max ) {
            number3 = max;
        }
        if (number4 > max ) {
            number4 = max;
        }
        if (number5 > max ) {
            number5 = max;
        }

        System.out.println("Cel mai mare numar este:  " + max);


        {
            System.out.print(number1 + ",    ");

        }
        System.out.println();
        System.out.println();
        int sum = number1 + number2 + number3 + number4 + number5;
        int mediaNumere = sum/5;
        System.out.println("Media numerelor este: " + mediaNumere);
        if (sum > 100) {
            System.out.println("Suma este mai mare de 100");
        } else if (sum < 100) {
            System.out.println("Suma este mai mica ca 100");
        } else {
            System.out.println("Suma este 100");
        }

    }
}