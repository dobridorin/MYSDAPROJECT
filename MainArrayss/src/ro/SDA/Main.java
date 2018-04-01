package ro.sda;
import java.util.Scanner;

class MainArrayss {

    public static void printArray(int [] myArray) {
        for (int i = 0; i< myArray.length; i++){
            System.out.println(myArray[i] + "  ");
        }
    }
    public static int pozitionOfElementInArray(int[] a, int n, int e) {
        //presupunem initial ca acesta nu exista in array
        int pozitie = -1;
        //  parcurgem array si cautam elementul
        //  for (int i = 0; i < n; i++) {
        //  if ( pozitie < 0   &&  a[i] == e ) {
        //  pozitie = i;
        // }
        // }
        // varianta cu while
        int i = 0;
        while (pozitie < 0  && i<n) {
            System.out.println("   testam  pozitia " + i + "  din array  ");
            if (a[i] == e) {
                pozitie = i;
            }
            i++;
        }
        return pozitie;
    }
    public static int[] removeDuplicates (int[] myArray, int n) {
        int[] myUnique = new int[n];
        // numarul de elemente unice gasite
        int nrOfUniqyeElementsFound = 0;

        for (int i = 0; i< n; i++) {
            // elementul pe care vreau sa-l caut
            int e = myArray[i];
            int position = pozitionOfElementInArray(myArray, n, myArray[i]);
            if (position == i) {
                myUnique[i- nrOfUniqyeElementsFound] = e;
                //nrOfUniqyeElementsFound++;
            }  else  {
                nrOfUniqyeElementsFound++;
            }
        }
        return myUnique;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //citim n
        System.out.println(" Cititi n:");
        int n = scanner.nextInt();
        //citim array[n]
        System.out.println(" Cititi  " + n +  "  elemente ");
        int[] a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        // afisam array[n]
        for (int i = 0; i<n; i++) {
            System.out.println(a[i] + "   ");
        }
        System.out.println();
        // citim elementul cautat
        System.out.print("  Cititi elementul cautat:  ");
        int e = scanner.nextInt();
        int pozitie = pozitionOfElementInArray(a, n, e);
        // afisam rezultatul cautarii
        if (pozitie >= 0) {
            System.out.print("  Pozitia lui " + e + " este " + pozitie);
        }  else  {
            System.out.println("  Elementul nu exista in array.  ");
        }
        int [] aUnique = removeDuplicates(a, n) ;
        printArray(aUnique);
    }
}