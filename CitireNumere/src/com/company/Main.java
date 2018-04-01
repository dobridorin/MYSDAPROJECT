package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number1 = 1234;
        int number2 = 55;
        System.out.print( "Type your third number: ");
        int number3 = scanner.nextInt();
        System.out.print( "Type your forth number: ");
        int number4 = scanner.nextInt();
        System.out.print( "Type your fith number: ");
        int number5 = scanner.nextInt();
        System.out.println(" Hey, here are your numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 );
    }
}
