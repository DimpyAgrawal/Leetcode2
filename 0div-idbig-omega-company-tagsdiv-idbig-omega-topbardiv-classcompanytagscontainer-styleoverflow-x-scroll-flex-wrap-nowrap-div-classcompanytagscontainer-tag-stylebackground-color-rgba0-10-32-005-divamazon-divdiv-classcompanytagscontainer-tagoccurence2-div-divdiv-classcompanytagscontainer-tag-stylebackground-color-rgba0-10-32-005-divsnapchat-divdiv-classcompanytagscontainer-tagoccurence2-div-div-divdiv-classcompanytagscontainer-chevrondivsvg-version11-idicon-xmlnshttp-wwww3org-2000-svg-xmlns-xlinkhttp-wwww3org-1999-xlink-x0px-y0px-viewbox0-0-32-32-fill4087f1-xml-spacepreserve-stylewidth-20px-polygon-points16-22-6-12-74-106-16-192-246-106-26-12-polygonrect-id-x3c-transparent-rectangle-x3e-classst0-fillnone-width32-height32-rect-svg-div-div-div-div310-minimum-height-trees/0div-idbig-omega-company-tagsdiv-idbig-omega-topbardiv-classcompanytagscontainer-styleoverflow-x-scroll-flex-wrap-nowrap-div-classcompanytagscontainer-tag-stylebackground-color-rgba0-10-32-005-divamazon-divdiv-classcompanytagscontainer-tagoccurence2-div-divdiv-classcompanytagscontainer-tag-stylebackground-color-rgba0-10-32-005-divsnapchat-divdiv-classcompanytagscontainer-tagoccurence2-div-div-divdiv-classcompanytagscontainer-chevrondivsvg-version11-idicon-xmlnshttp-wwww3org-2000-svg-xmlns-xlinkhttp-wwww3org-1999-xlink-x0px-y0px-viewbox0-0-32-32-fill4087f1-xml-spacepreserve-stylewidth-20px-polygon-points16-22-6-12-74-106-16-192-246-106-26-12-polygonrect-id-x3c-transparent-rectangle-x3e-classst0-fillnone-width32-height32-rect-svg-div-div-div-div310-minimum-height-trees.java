class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1) {
            list.add(0);
            return list;
        }
        List<Set<Integer>> adj = new ArrayList<>(n);
        for(int i=0;i<n;i++) adj.add(new HashSet<>());
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }


        List<Integer> leaf = new ArrayList<>();
        for(int i=0;i<n;i++){

            if(adj.get(i).size()==1) leaf.add(i);
        }
        while(n>2){
            n-=leaf.size();
            List<Integer> newleaf = new ArrayList<>();
            for(int i: leaf){
                int j=adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if(adj.get(j).size()==1) newleaf.add(j);
            }
            leaf=newleaf;
        }
        return leaf;
    }
}