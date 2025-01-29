import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolandBall_and_Forest {
    static int c=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> adj= new ArrayList<>();

        int n= in.nextInt();
        boolean visited [] = new boolean[n];
        if(n==1){
            System.out.print(1);
        }else{
            for(int i=0;i<n ;i++){
                adj.add(new ArrayList<>());


            }
            for(int i=0;i<n;i++){
                int pp= in.nextInt() -1;
                if (pp != i) {
                    adj.get(i).add(pp);
                    adj.get(pp).add(i);
                }






            }
            for(int i=0;i< visited.length;i++){
                if(visited[i]== false){
                    c++;
                    DFS(i, visited, adj);
                }
            }

            System.out.print(c);
        }


    }
    public static void DFS(int v ,boolean  [] visited , List<List<Integer>> adj){
        visited[v] = true;

        for( int i : adj.get(v) ){
            if( !visited[i]){

                DFS(i,visited ,adj);
            }
        }

    }
}