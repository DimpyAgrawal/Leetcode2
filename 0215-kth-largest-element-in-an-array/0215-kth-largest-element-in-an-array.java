class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new  PriorityQueue<Integer>();
        
        for(int i=0;i<k;i++){
            q.add(nums[i]);
            
        }
        
        for(int i=k;i<nums.length;i++){
            if(nums[i]>q.peek()){
                q.remove();
                q.add(nums[i]);
            }
        }
        return q.peek();
        
    }
}