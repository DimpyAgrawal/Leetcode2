class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if(points==null) return null;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int[] p1,int[] p2){
                return ((p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]));
            }
        });
        
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if(pq.size()>k) pq.remove();
        }
        
        int[][] ans = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            ans[i] = pq.remove();
            i++;
        }
        return ans;
        
    }
}