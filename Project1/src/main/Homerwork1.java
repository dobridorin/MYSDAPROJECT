package main;

public class Homerwork1 {
    static Integer a = 13;
    static Integer b = 80;
    static Integer c = 55;
    static Integer maxim;

    public static void main(String[] args) {

        Integer rezultat = calculeazaMaximulDintreNumere(a, b, c);
        System.out.println(rezultat);
    }

    static Integer calculeazaMaximulDintreDouaNumere(Integer a, Integer b, Integer c) {

        if (a > b) {
            if (a > c) {
                maxim = a;
            } else {
                maxim = c;
            }

            if (a >= b) {
                return maxim;
            }
            if (b > c) {
                maxim = b;
            } else {
                maxim = c;
            }
        }
        return maxim;
    }
}
