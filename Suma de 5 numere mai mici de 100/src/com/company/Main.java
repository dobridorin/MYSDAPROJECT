package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your number1:  ");
        int number1 = scanner.nextInt();

        System.out.print("Type your number2:  ");
        int number2 = scanner.nextInt();

        System.out.print("Type your number3:  ");
        int number3 = scanner.nextInt();

        System.out.print("Type your number4:  ");
        int number4 = scanner.nextInt();

        System.out.print("Type your number5:  ");
        int number5 = scanner.nextInt();

        if (number1 < 100) {
            System.out.print(number1 + ",    ");
        }
        if (number2 < 100) {
            System.out.print(number2 + ",    ");
        }
        if (number3 < 100) {
            System.out.print(number3 + ",    ");
        }
        if (number4 < 100) {
            System.out.print(number4 + ",    ");
        }
        if (number5 < 100) {
            System.out.print(number5);
        }
        System.out.println();
        System.out.println();
        int sum = number1 + number2 + number3 + number4 + number5;

        if (sum > 100) {
            System.out.println("Suma este mai mare de 100");
        } else if (sum < 100) {
            System.out.println("Suma este mai mica ca 100");
        } else {
            System.out.println("Suma este 100");
        }

    }
}