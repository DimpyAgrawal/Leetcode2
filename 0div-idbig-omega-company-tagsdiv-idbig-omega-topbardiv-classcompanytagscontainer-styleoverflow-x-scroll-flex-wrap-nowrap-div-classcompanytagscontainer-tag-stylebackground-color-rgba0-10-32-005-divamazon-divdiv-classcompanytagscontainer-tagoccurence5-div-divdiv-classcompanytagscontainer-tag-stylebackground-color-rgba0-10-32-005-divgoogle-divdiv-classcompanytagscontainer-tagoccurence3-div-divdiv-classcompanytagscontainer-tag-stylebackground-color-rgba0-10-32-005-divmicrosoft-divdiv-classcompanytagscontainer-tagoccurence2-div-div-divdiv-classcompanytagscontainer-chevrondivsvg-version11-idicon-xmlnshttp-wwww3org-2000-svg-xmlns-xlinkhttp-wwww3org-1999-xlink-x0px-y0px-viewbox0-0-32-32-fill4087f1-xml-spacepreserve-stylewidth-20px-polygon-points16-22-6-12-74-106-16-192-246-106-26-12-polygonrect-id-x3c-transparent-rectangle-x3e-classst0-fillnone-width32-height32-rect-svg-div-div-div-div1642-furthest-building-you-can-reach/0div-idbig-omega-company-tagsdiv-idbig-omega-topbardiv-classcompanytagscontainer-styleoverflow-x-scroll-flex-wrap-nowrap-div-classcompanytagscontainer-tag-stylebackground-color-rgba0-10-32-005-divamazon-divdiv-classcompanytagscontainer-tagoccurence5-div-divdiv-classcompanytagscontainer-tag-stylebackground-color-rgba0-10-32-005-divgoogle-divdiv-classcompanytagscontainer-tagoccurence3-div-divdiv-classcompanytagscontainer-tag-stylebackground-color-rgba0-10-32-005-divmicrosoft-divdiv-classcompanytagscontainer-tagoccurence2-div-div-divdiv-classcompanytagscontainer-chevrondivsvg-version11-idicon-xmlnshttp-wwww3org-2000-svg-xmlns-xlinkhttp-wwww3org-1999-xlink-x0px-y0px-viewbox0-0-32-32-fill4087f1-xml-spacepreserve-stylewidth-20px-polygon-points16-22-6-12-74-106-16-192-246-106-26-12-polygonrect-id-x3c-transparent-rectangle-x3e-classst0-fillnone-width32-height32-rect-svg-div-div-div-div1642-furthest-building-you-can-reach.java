class Solution {
    public int furthestBuilding(int[] he, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<he.length-1;i++){
            if(he[i]>=he[i+1]) continue;
            int d = he[i+1]-he[i];
            if(d>0){
                pq.add(d);
                if(pq.size()>ladders) bricks-=pq.poll();
                if(bricks<0) return i;
            }
        }
        return he.length-1;
    }
}