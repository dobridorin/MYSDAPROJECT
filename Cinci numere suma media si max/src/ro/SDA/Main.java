package ro.SDA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Declarare variabila
        int suma=0;


        // citire de la tastatura
        Scanner scanner = new Scanner(System.in);
        Integer[]numbers = new Integer[5];
        // Bloc de calcul suma
        // Introducerea fiecarui nr in parte
        System.out.println("Type name number " );
        for (int i = 0; i < 5; i++) {
            System.out.print("Type name number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int i=0; i <5; i++){
            if(max < numbers[i]){
                max=numbers[i];
            }

            if(min > numbers[i]){
                min= numbers[i];
            }
        }
        System.out.println("Max este :  " + max );
        System.out.println ("Minumul este: " + min );
        // Calculul sumei
        for (int i= 0; i < 5; i++) {
            suma=suma+numbers[i];
        }
        int mediaNumerelor = suma/5;
        //Afisarea sumei

        System.out.println("Suma numerelor este: " + suma);
        System.out.println("Media numerelor este: " + mediaNumerelor);
        }
}


