class Solution {
    public boolean isBipartite(int[][] arr) {
        HashMap<Integer,Integer> visited = new HashMap<>();
        Queue<BipertitePair> q = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(visited.containsKey(i)) continue;
            q.add(new BipertitePair(i,0));
            while(!q.isEmpty()){
                BipertitePair rp = q.poll();
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx)!=rp.des) return false;
                    continue;
                }
                visited.put(rp.vtx,rp.des);
                for(int nbrs: arr[rp.vtx]){
                    if(!visited.containsKey(nbrs))
                        q.add(new BipertitePair(nbrs,rp.des+1));
                }
            }
        }
        return true;
    }

    class BipertitePair{
        int vtx;
        int des;
        public BipertitePair(int vtx,int des){
            this.vtx = vtx;
            this.des = des;
        }
    }
}