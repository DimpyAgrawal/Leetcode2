//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here
        ArrayList<ArrayList<Integer>> adjls= new ArrayList<>();
        
        for(int i=0;i<v;i++){
            adjls.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                     adjls.get(i).add(j);
                     adjls.get(j).add(i);
                }
               
            }
        }
        
        int vis[] = new int[v];
        int cnt=0;
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,adjls,vis);
            }
        }
        return cnt;
    }
    
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adjls, int vis[] ){
        vis[node]=1;
        
        for(int it : adjls.get(node)){
            if(vis[it]==0){
                dfs(it,adjls,vis);
            }
        }
    }
};