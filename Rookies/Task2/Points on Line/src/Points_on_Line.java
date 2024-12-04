import java.util.Scanner;

public class Points_on_Line {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
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