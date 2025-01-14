import java.util.Scanner;

public class Points_on_Line {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        long d=s.nextLong();
        long [] arr =new long[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        int k=0;
        long r=0;
        long c=0;
        for(int i=0;i<n;i++){


            while (k < n && arr[k] - arr[i] <= d) {
                k++;
            }
             c=k-i -1;
            if(c>=2){
                r +=  (c*(c-1))/2;
            }

        }

        System.out.print(r);
    }

}