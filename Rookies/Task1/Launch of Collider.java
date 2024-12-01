import java.util.Scanner;

public class Launch of Collider {
    static boolean flag=false;
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String hh =new String();
        long [] arr =new long [n];
        hh=s.next();


        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        long k= exp(hh, arr);

        if(!flag){

            System.out.print(-1);

        }else{
            System.out.print(k/2);
        }

    }
    public static long exp(String s, long []a){
        long c= 10000000000L;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='R' && s.charAt(i+1)=='L'){
                flag =true;
                c=Math.min(c,a[i+1]-a[i]);

            }
        }
        return c ;
    }
}
