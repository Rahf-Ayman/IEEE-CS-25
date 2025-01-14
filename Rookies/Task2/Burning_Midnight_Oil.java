import java.util.Scanner;

public class Burning_Midnight_Oil {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        long n = s.nextInt();
        int k= s.nextInt();
        long l=0;
        long r=n;
        while(l<r){
            long mid =(l+r)/2;
            if(gg(mid , k ,n)){
                r=mid;
            }else{
                l = mid+1;
            }
        }
        System.out.print(l);
    }
    public static boolean gg(long x, long k , long n){
        long sum =x;

        while(x!=0){
            x/=k;
            sum+=x;
        }
//        System.out.print(sum);
        if(sum>=n){
            return true;
        }else{
            return false;
        }
    }
}