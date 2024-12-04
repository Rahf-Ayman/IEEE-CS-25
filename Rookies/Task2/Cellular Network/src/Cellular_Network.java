import java.util.Arrays;
import java.util.Scanner;

public class Cellular_Network {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        long []c =new long[n];
        long []t =new long[m];

        for(int i=0;i<n;i++){
            c[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            t[i]=s.nextInt();
        }
        Arrays.sort(c);
        Arrays.sort(t);

        long l=0 ,r = (long)1e9;
//        long k=(long)1e9;
        while(l<r){
            long mi = (l+r)/2;
            if(check(mi ,c,t)){

               r =mi;
            }else{
                l=mi+1;
            }
        }
        System.out.print(l);

    }
    public static boolean check(long x , long []c , long []t){
        int i = 0, j = 0;
        while (i < c.length) {

            while (j < t.length && t[j] < c[i] - x) {
                j++;
            }

            if (j < t.length && Math.abs(t[j] - c[i]) <= x) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

}