class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3) return false;
        Stack<Integer> st = new Stack<>();
        int thirdele = Integer.MIN_VALUE;
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<thirdele) return true;
            while(!st.isEmpty() && st.peek()<nums[i]){
                thirdele = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
           
    }
}