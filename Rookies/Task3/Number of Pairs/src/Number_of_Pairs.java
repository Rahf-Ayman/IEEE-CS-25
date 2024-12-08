import java.util.Arrays;
import java.util.Scanner;

public class Number_of_Pairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();

            long l=s.nextLong();
            long r=s.nextLong();
            long arr [] =new long[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextLong();
            }
            Arrays.sort(arr);
            int k=0;
            int c=0;
            int u=0;
            long sum=0;
            for(int j=0;j<n-1;j++){

                k=lowerBound(arr ,j+1 ,l-arr[j]);
                u=upperBound(arr ,j+1 , r-arr[j]);
                if (k <= u) {
                    sum+=u-k+1;
                }


            }
            System.out.println(sum);
        }

    }
    public static int lowerBound(long [] arr , int start , long x){
        int l=start;
        int u=arr.length-1;
        int a=arr.length;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(arr[mid]>=x){
                a=mid;
                u=mid-1;
            }else{
                l=mid+1;
            }
        }
        return a;
    }
    public static int upperBound(long [] arr , int start , long x){
        int l=start;
        int u=arr.length-1;
        int a=start-1;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(arr[mid]<=x){
                a=mid;

                l=mid+1;
            }else{
                u=mid-1;
            }
        }
        return a;
    }


}