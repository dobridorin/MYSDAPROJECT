package ro.SDA;

public class TICTAE_TOE {
    static int n = 3;
    static int[][] game = new int[n][n];

    public static String player1;
    public static String player2;

    static void printGame() {
        System.out.println(".......");
        for (int i =0; i < n; i++){
            for (int j = 0; j<n; j++){
                System.out.print("|" + game[i][j]);
            }
            System.out.println("|");
            System.out.println(".......");
        }
    }
    public static void main (String[] args){
        System.out.println("Tic Tac  Toe ");
        printGame();

    }

}
