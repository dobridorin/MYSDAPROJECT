package ro.SDA;

import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static void printArray(int[] myArray) {
        for (int i = 0; i<n; i++) {
            System.out.print(myArray[i] + "\t");
        }
    }
    static boolean testPrim(int x) {
        boolean prim = false;
        int i = 2;
        int contorDiv = 0;
        while ((i <= x/2) && (contorDiv==0)){
            prim = true;
            if (x%i==0) {
                contorDiv++;
                prim = false;
            }
            i++;
        }
        return prim;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Introduceti numarul n: ");
        n = scanner.nextInt();
        System.out.print(" Introduceti numarul m: ");
        m = scanner.nextInt();
        int [] a = new int[n];
        int contorPrim = 0;
        int i = m;
        while (contorPrim<n) {
            if (testPrim(i)) {
                a[contorPrim] = i;
                contorPrim++;
            }
            i++;
        }
        System.out.println(" Primele  " + n + " numere prime mai mari decat " + m + "  sunt:  ");
        // testPrim(n);
        printArray(a);
    }
}

