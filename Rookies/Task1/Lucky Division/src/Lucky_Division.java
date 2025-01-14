import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();



        if(lucky(n)){
            System.out.print("YES");
        }else{
            if(almostLucky(n)){
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }

        }


    }
    public static boolean lucky(int n){
        while(n!=0){
            if(n%10==7 || n%10==4){

            }else{
                return false;

            }
            n/=10;
        }
        return true;
    }
    public static boolean almostLucky(int n){
        for(int i=4;i<n;i++){
            if(lucky(i)&&n%i==0){
                return true;
            }
        }
        return false;
    }
}