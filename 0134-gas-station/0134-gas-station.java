class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int si=0;
        int curr=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tc+=gas[i]-cost[i];
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                si=i+1;
            }
            
            
            
        }
        if(tc<0) return -1;
        return si;
        
        
    
		
     }
}