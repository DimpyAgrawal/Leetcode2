class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[nums2.length];
 
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() &&nums2[st.peek()]<nums2[i]){
                    ans[st.pop()] = nums2[i];
                    
            }
            st.push(i);
            
        }
        while(!st.isEmpty()){
            ans[st.pop()] =-1;
        }
        int[] ans2 = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ans[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            ans2[i] = map.get(nums1[i]);
        }
        return ans2;
        
    }
}