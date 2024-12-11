import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Counting_Rooms {
    public static int[] dx={-1, 1, 0, 0};
    public static int[] dy={0, 0, -1, 1};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        boolean[][] v= new boolean[n][m];
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
        int roomc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.' && !v[i][j]) {
                   bfs(i, j, v, grid, n, m);
                    roomc++;
                }
            }
        }

       System.out.println(roomc);
    }
    static void bfs(int startX, int startY, boolean[][] v, char[][] grid, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        v[startX][startY] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            for (int i = 0; i < 4; i++) {
                int nx= x+dx[i];
                int ny= y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && !v[nx][ny] && grid[nx][ny]=='.') {
                    v[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }
}