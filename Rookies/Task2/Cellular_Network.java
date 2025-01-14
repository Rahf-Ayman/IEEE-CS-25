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
            c[i]=s.nextLong();
        }
        for(int i=0;i<m;i++){
            t[i]=s.nextLong();
        }
        long r=0;
        int j=0;
        for(int i=0;i<n;i++){
            while(j<m-1 && Math.abs(t[j+1]-c[i])<=Math.abs(t[j]-c[i])){
                j++;
            }
            long dd = Math.abs(t[j]-c[i]);
            r=Math.max(dd,r);
        }
        System.out.print(r);

    }


}