import java.util.*;


public class Kefa_and_Park {
    static int c=0;
    static int minCat;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> adj= new ArrayList<>();
        int vertices = input.nextInt();
        minCat = input.nextInt();
        int [] cat = new int [vertices];
        boolean visited [] = new boolean[vertices ];
        for(int i=0; i<vertices ;i++){
            cat[i]= input.nextInt();
        }
        for(int i=0 ;i<vertices ;i++){
            adj.add(new ArrayList<>());
        }

            for (int i = 0; i < vertices - 1; i++) {

                int v = input.nextInt() - 1;
                int n = input.nextInt() - 1;

                if (v != n) {
                    adj.get(v).add(n);
                    adj.get(n).add(v);
                }

            }
            DFS(0, visited, adj, cat, cat[0]);
            System.out.print(c);

    }
    public static void DFS(int v ,boolean  [] visited , List<List<Integer>> adj , int [] cat ,int sum){
        visited[v] = true;
        if(v!=0 && adj.get(v).size() == 1 && sum<=minCat){
            c++;
        }

        for( int i : adj.get(v) ){
            if( !visited[i] && sum <= minCat){
                if(cat[i]==0){
                    DFS(i,visited ,adj ,cat , 0);
                }else{
                    DFS(i,visited ,adj ,cat , sum+cat[i]);
                }


            }
        }

    }
}