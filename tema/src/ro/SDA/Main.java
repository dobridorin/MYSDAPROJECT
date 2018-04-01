package ro.SDA;

import java.util.Scanner;

public class MainArrays {

    public static int positionOfElementInArray (int[] a, int n, int e) {


        //presupunem ca aceaesta nu exista in array
        int pozitie = -1;

        // varianta cu while
        int i =0;
        while (pozitie < 0 && i<n) {
            System.out.println("  testam pozitia " + i + "din array");
            if (a[i] == e) {
                pozitie = i;
            }
            i++;
        }
        return pozitie;

    }
    public static int[] removeDuplicates(int[] myArray, int n){
        int[] myUnique =  new int[n];
        // numarul de elemente unice gasite
        //
        int newuniqueelementsFound = 0;

        for(int i = 0; i <n; i++){
            //element pe care vreau sa il caut
            int e =
        }
    }

    public static void main (String[] args) {
        // gasirea pozitiei pentru  element pt array
        Scanner scanner = new Scanner(System.in);
        // citiren

        System.out.println("Cititi n: ");
        int n = scanner.nextInt();
        // citim array(n)
        System.out.println("Cititi " + n + "elemen: ");
        int[] a = new int [n];

        for (int i=0; i<n; i++){
            a[i]= scanner.nextInt();
        }
        // afisam array
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // )citim elementul cautat
        System.out.println(" Citim elementul cautat: ");
        int e = scanner.nextInt();

        // propunem ca initial nu exista array


        // pacurgem array si cautam elementl
        // parcurgem array si cautam elementul
        // forr.int (i=0; i<n; i++);
        //

        int i =0;
        while(pozitie < 0 && i < n ){
            System.out.println("testam pozitia " + i + "din array");
            if(a[i] == e){
                pozitie = i;
            }
            i++;
        }
        // afisam rezultatul cautari
        int pozitie = positionOfElementInArray( a, n, e);

        if(pozitie >=0) {
            System.out.println("Pozitia lui " + e + "este " + pozitie);
        }else{
            System.out.println(" Pozitia lui " + e + " este ");
        }

    }


}
