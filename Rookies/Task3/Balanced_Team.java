import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Team {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int l=0;
        int u=0;
        int maxnum=1;
        while(l<=u){


            while(u<n&&arr[u]-arr[l]<=5){

                maxnum=Math.max(maxnum,u-l+1);
                u++;
            }
            l++;
        }
        System.out.print(maxnum);
    }
}