package ro.SDA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[]  monthNames = {
                "January",
                "February",
                "Martch",
                "April",
                "May",
                "June",
                "JuLy",
                "August",
                "September",
                "Octomber",
                "November",
                "December"
        };
        System.out.println("Imput your month number:  ");
        Scanner scanner = new Scanner (System.in);
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("The month number is invalid");

        } else {
                String monthName = monthNames [monthNumber-1];
                System.out.println("The month names is:  " + monthName);
        }

        }

    }
