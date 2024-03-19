class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26];
        for(char task:tasks){
            f[task-'A']++; 
        } 
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<26;i++){
            if(f[i]>0) pq.add(f[i]);
        }
        
        int time = 0;
        while(!pq.isEmpty()){
            
            int cycle = n+1;
            int taskCount = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while(cycle-->0 && !pq.isEmpty()){
                int currfreq = pq.poll();
                if(currfreq>1)list.add(currfreq-1);
                taskCount++;
                
            }
            list.forEach(pq::offer); //list ele goes into the heap;
            time+=(pq.isEmpty()? taskCount:n+1);
        }
        return time;
        
    }
}