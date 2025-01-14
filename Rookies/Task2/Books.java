import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        int t = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }


        int l = 0, c = 0, mb = 0;

        for (int r = 0; r < n; r++) {
            c += a[r];


            while (c > t) {
                c -= a[l];
                l++;
            }


            mb = Math.max(mb, r - l + 1);
        }


        System.out.println(mb);
    }
}