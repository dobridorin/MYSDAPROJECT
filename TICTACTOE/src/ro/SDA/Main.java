package ro.SDA;

import java.util.Scanner;

public class Main {
    static int n = 3;
    static int[][] game = new int[n][n];

    public static boolean win = false;
    public static boolean finished = false;

    //Jucatorul x
    public static String player1;
    //si jucatorul 0
    public static String player2;

    public static final String SIGN_X = "X";
    public static final String SIGN_0 = "0";

    static String boxSign(int value) {
        if (2 == value) {
            return SIGN_0;
        } else if (1 == value) {
            return SIGN_X;
        } else {
            return " ";
        }
    }

    public static int boxValue(String sign) {
        if (SIGN_X == sign) {
            return 1;

        } else if (SIGN_0 == sign) {
            return 2;

        } else {
            return 0;
        }
    }

    public static String getPlayerSign(String player) {
        if (player1 == player) {
            return SIGN_X;

        } else {
            return SIGN_0;

        }
    }

    static void printGame() {
        System.out.println(".......");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sign = boxSign(game[i][j]);

                // System.out.print("|" + game[i][j]);
                System.out.print("|" + sign);
            }
            System.out.println("|");
            System.out.println(".......");
        }
    }

    public static boolean isWinLine( int lineNr, int value) {
        boolean winL = true;
        int i = 0;
        while (winL == true && i < n) {
            if (game[lineNr][i] != value) {
                winL = false;
            }
            i++;
        }
        return winL;
    }
    public static boolean isWinCol( int colNr, int value){
        boolean winC = true;
        int i = 0;
        while (winC == true && i < n){
            if (game[i][colNr] != value) {
                winC = false;
            }
            i++;
        }
        return winC;
    }

    public static boolean isWinDiag(int value) {
        //return false;
        boolean winD1 = true;
        boolean winD2 = true;

        int i = 0;
        while ((winD1 == true || winD2 == true) && i < n ) {
    if(game[i][i] != value) {
        winD1 = false;
    }
    if(game [i][n-1-i] != value){
        winD2 = false;

    }
    i++;

        }
        return ( winD1 || winD2 );
    }

    public static boolean isWin(int value) {

    //testam linii
        boolean gameWin = false;
        int i =0;
        while(i<n  && gameWin){
           gameWin =  isWinLine(i, value);
           i++;

        }
    //testam coloane
        i=0;
        while(i < n && false == gameWin){
            gameWin = isWinCol(i,value);
            i++;
        }
    // testam diagonale
        if(!gameWin){
            gameWin = isWinDiag(value);
        }
        return gameWin;
    }

    public static void main(String[] args) {
        System.out.println("Tic Tac  Toe ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele jucatorul x");
        player1 = scanner.nextLine();
        System.out.println("Numele jucatorul 0");
        player2 = scanner.nextLine();
        System.out.println("Jucatorii sunt: " + player1 + "/" + player2);

        printGame();


        String currentPlayer = player1;
        int nrofmoses = 0;
        while (!(win || finished)) {
            //play game
            System.out.println("Jucatorul " + currentPlayer + "muta ");
            //    System.out.println("Jucatorul " + currentPlayer + "muta")

            //1int mlin = scanner.nextInt();

            // jucatorul face mutarea

            System.out.println(" linia: ");
            int mLine = scanner.nextInt();
            System.out.println("coloana");
            int mCol = scanner.nextInt();

            // determinam  semnul jucatorului curent

            String currentPlayerSign = getPlayerSign(currentPlayer);
            //
            int valueofmove = boxValue(currentPlayerSign);
            //efectuam mutarea
            game[mLine][mCol] = valueofmove;
            // sa efectuat mutatrea incrementeaza numarul de mutari
            nrofmoses++;

            // win= test pentru win
            win = isWin(valueofmove);
            if (nrofmoses == (n * n)) {
                finished = true;
            }
            printGame();

            //schimbam jucatorul cand nu e finisehed sau  win
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            // win = true;

        }
        if(true == win){
            System.out.println("Jucatorul " + currentPlayer + " este castigator ");

        } else {
            if(true == finished){
                System.out.println(" Remiza ");

            }
        }
    }

}
