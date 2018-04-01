package ro.SDA;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Type your first name1: ");
        String name1 = scanner.nextLine();
        System.out.print("Type your second name2: ");
        String name2 = scanner.nextLine();
        System.out.print("Type your third name3: ");
        String name3 = scanner.nextLine();
        System.out.print("Type your forth name4: ");
        String name4 = scanner.nextLine();
        System.out.print("Type your fith name5 : ");
        String name5 = scanner.nextLine();
        System.out.println( "Hey " + name1 + "," + name2 + "," + name3 + "," + name4 + "," + name5 + "," + "Welcom to SDA! " );

    }
}
