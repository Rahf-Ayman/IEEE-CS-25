import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num =s.nextInt();
        int []arr=new int[num];
        int c=0;
        int b=0;

        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
            if(arr[i]>0&&c<0){
                c=0;
            }
            c+=arr[i];
            if(c<0&&arr[i]<0){
                b++;

            }else if(c<0&&arr[i]>0){
                c=arr[i];
            }

        }
        System.out.println(b);
    }
}