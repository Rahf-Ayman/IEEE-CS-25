import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num =s.nextInt();
        int []arr=new int[num];
        int c=0;
        int min=101;
        int max=-1;
        int imin=-1;
        int imax=-1;
        int swaps=0;

        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
            if(arr[i]>max){
                max=arr[i];
                imax=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                imin=i;
            }
        }
        swaps= imax + num-1-imin;

        if(imin < imax){
            swaps--;
        }
        System.out.println(swaps);






    }
}