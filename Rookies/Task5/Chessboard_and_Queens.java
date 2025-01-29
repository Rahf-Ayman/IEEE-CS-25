import java.util.Scanner;

public class Chessboard_and_Queens {
    public static int c =0;
    public static char[][]board=new char[8][8];
    public static boolean[]columns=new boolean[8];
    public static boolean[]diag1=new boolean[15];
    public static boolean[]diag2=new boolean[15];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<8;i++) {
            board[i]=scanner.next().toCharArray();
        }

        placeQueens(0);
        System.out.println(c);
    }
    public static void placeQueens(int r) {
        if (r == 8) {
            c++;
            return;
        }

         for (int j = 0; j < 8; j++) {

            if (board[r][j]=='.' && !columns[j] && !diag1[r-j+7] && !diag2[r+j]) {

                columns[j]=true;
                diag1[r-j+7]=true;
                diag2[r+j]=true;
                placeQueens(r+1);
                columns[j]=false;
                diag1[r-j+7]=false;
                diag2[r+j]=false;
            }
        }
    }
}