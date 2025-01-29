import java.util.*;
import java.lang.*;
public class Weird_Algorithm {
    static StringBuilder ss =new StringBuilder("");

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        long n=s.nextLong();
        weirdAl(n);
        System.out.print(ss);

    }
    public static void weirdAl(long n){

        ss.append(n+" ");


        if(n==1){

            return ;
        }
        if(n%2==0){

             weirdAl(n/2);
        }else{

             weirdAl(n*3+1);
        }

    }
}