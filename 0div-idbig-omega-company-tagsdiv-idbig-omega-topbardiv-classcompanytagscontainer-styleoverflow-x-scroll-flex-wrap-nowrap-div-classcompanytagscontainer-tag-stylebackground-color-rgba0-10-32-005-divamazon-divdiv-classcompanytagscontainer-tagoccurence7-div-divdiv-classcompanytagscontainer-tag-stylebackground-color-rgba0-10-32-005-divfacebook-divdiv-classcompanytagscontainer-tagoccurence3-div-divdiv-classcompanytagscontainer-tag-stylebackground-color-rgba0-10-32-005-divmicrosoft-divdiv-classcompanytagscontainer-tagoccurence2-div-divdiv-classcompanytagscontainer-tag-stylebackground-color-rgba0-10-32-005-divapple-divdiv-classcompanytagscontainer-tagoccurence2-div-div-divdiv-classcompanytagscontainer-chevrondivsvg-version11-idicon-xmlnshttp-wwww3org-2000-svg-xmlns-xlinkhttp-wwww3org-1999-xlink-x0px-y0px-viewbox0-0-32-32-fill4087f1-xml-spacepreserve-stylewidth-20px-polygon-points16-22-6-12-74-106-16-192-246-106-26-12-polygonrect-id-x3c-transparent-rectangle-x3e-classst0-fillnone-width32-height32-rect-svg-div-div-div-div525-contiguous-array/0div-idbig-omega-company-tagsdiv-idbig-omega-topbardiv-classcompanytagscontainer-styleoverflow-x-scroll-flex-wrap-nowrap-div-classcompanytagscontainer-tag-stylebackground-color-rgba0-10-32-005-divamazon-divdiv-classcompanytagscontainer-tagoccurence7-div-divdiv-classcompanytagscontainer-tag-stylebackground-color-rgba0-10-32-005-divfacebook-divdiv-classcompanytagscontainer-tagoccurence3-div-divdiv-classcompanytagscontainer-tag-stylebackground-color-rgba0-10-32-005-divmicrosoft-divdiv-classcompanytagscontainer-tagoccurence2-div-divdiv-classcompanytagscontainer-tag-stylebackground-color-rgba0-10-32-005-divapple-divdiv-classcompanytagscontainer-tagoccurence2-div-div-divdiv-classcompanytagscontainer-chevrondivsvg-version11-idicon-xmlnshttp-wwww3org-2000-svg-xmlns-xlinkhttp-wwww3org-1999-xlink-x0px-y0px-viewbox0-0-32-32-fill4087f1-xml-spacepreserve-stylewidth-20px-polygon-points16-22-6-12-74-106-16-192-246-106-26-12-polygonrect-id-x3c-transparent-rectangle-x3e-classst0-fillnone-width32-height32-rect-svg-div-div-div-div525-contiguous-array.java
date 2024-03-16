class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){   
            if(nums[i]==0) sum = sum-1;
            else sum = sum+1;
            if(sum==0) max = i+1;
            else if(map.containsKey(sum))
                max = Math.max(max,i-map.get(sum));
                else 
                        map.put(sum,i);
        }
        
        return max;
    }
}