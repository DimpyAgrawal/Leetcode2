class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        TreeSet<Integer> map = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int c=1;
        Integer prev = null;
        int max = Integer.MIN_VALUE;
        for(int num : map){
            if(prev!=null && num==prev+1) c++;
            else c=1;
            prev=num;
            max = Math.max(max,c);
        }
        return max;
    }
}