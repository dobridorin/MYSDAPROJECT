package main;

public class Test1 {
    static Integer a = 13;
    static Integer b = 80;


    public static void main(String[] args) {
        Integer rezultat = calculeazaMaximulDintreDouaNumere(a,b);
        System.out.println(rezultat);
    }
        static Integer calculeazaMaximulDintreDouaNumere(Integer a, Integer b){
            if(a > b) {
                return a;
            }else{
                return b;
            }
        }
}
