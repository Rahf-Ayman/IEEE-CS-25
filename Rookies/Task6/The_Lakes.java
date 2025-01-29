import java.util.Scanner;
import java.util.Stack;

public class The_Lakes {
    public static boolean visited[][];
    public static int m;
    public static int n;
    public static int [][] adj;
    public static long sum;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        for(int i=0;i<t;i++){
            sum=0;
             n = input.nextInt();
             m = input.nextInt();
            visited = new boolean [n][m];
             adj = new int [n][m];
            for(int k=0;k<n;k++){
                for(int j=0;j<m;j++){
                    adj[k][j]= input.nextInt();
                }
            }
           long maxsum=0;
            for(int k=0;k<n;k++){
                for(int j=0;j<m;j++){

                    if(!visited[k][j]&& adj[k][j]!=0){
                        sum=DFS(k,j);

                        maxsum=Math.max(sum,maxsum);
                    }
                }
            }

            System.out.println(maxsum);

        }
    }

    public static int DFS(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;

        int sum = 0;

      int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!stack.isEmpty()) {
            int[] edge = stack.pop();

            int x = edge[0];
            int y = edge[1];
            sum += adj[x][y];

            for (int i1 = 0; i1 < 4; i1++) {
                int a = x + dx[i1];
                int b = y + dy[i1];

                 if (a >= 0 && a < n && b >= 0 && b < m && !visited[a][b] && adj[a][b] > 0) {
                    stack.push(new int[]{a, b});
                    visited[a][b] = true;
                }
            }
        }

        return sum;
    }

}