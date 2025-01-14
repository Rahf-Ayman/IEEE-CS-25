import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        Arrays.sort(arr);
        int q=s.nextInt();
        long [] a =new long [q];

        for(int i=0;i<q;i++){
            a[i]=s.nextLong();

        }
        for(int i=0;i<q;i++){
           System.out.println(BinarySearch(a[i] ,arr));
        }




    }
    public static int BinarySearch(long x ,int []a){
        int l=0 ,r=a.length;
        while(l<r){
            int n = (r+l)/2;
            if(x>= a[n]){
                l=n+1;
            }else if(x<a[n]){
                r=n;
            }
        }
        return l;
    }
}
