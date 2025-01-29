import java.util.*;

public class Send_the_Fool_Further {
    static List<List<Node>> adj =new ArrayList<>();
    static boolean visited[];
    static int cost =0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vertices = input.nextInt();
        visited =new boolean[vertices];

        for(int i=0;i<vertices ;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<vertices-1 ;i++){
            int u =input.nextInt();
            int v=input.nextInt();
            int c=input.nextInt();
            if(u!=v){
                adj.get(u).add(new Node(v, c));
                adj.get(v).add(new Node(u, c));
            }

        }
        DFS(0,0);
        System.out.println(cost);

    }
    public static void DFS(int n , int c){
        visited[n]=true;
        boolean allvisited = true;



        for(Node i: adj.get(n)){

            if( !visited[i.nighbour]) {

                allvisited = false;
                DFS(i.nighbour, c+i.wieght);


            }
        }
        if (allvisited) {
            cost = Math.max(cost, c);
        }
        visited[n]=false;

    }
}
 class Node{
    int nighbour;
    int wieght;
    public Node(int x , int y){
        nighbour = x;
        wieght = y;
    }
}