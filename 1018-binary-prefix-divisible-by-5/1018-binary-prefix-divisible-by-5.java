class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        
        List<Boolean> list =  new ArrayList<Boolean>();
        int sum=0;
        
        for(int x : nums){
            sum=(sum*2+x)%5;
            if(sum==0) list.add(true);
            else list.add(false);
        }
        return list;
    }
}