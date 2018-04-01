package ro.SDA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrie numarul:  ");
        Integer number1 = scanner.nextInt();
        int div = number1 %2;
        switch (div){
      case 0:
     System.out.println(number1 + " Numar este par");
      break;

    case 1:
        System.out.println(number1 + " Numar este impar");
        break;
        }

    }
}
