class Solution {
    public boolean isBipartite(int[][] arr) {
        int n=arr.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(check(i,color,arr)==false) return false;
            }
        }
       return true;
    }
    static boolean check(int start,int[] color,int[][] arr){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        color[start]=0;
        
        while(!q.isEmpty()){
            int node =  q.remove();
            for(int it: arr[node]){
                if(color[it]==color[node]) return false;
                else if(color[it]==-1){
                    color[it]=1-color[node];
                    q.add(it);
                }
            }
        }
        return true;
    }
}