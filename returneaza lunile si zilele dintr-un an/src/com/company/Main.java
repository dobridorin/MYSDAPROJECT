package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti anul dorit:  ");
        Integer an = scanner.nextInt();
        System.out.print("Introduceti luna:  ");
        Integer luna = scanner.nextInt();

        if (luna == 4 || luna == 6 || luna == 9 || luna == 11 )
        {
            System.out.print("Luna are 30 zile");
        } else if (luna == 1 || luna == 3 || luna == 5 || luna ==7 || luna == 8 || luna == 10 || luna == 12)
        {
            System.out.println("Luna are 31 zile");
        }

        if (luna ==2)
            //boolean bisect = false;
            if ((an % 4) != 0) {
                System.out.println("Luna are 28 zile ");
            } else if ((an % 100) != 0) {
                System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
            } else if ((an % 400) != 0) {
                System.out.println("Luna are 28 zile ");
            }  else {
                System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
            }

    }
// w............................
    int month = 2;
    if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12 ) {

        dayCount = 31;

    }else if ( month == 4 ||month == 6 || month == 9 || month == 11)

    {
        dayCount = 30;
    } else if (month == 2)  {
        check if is a leap year

}

switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: daycount = 31;
        break;
        case 4:
        case 6:
        case 11:
        daycount = 30;
        break;
        case 2;
        // compute if leap year
            break;
            default

    }
}







