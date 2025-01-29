import java.util.Scanner;

public class Apple_Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] w =new long[n];

        for (int i=0;i<n;i++) {
            w[i]=scanner.nextLong();
        }
        long minDifference=minDifference(w, n,0, 0, 0);

        System.out.println(minDifference);
    }
    public static long minDifference(long[] w, long n, long g1, long g2, int index) {

        if (index==n) {
            return Math.abs(g1-g2);
        }

        long group1=minDifference(w, n, g1 + w[index], g2, index + 1);
        long group2=minDifference(w, n, g1, g2 + w[index], index + 1);

        return Math.min(group1, group2);
    }
}