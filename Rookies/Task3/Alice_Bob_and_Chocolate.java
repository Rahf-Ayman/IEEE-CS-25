import java.util.Scanner;

public class Alice_Bob_and_Chocolate {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int arr [] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int a=0;
        int b=n-1;
        int salice=0;
        int sbob =0;
        int c=0;


            while(a<=b){
                if (salice <= sbob) {

                    salice += arr[a];
                    a++;
                } else  {

                    sbob += arr[b];
                    b--;
                    c++;
                }
            }
            System.out.print(a+" "+c);




    }
}