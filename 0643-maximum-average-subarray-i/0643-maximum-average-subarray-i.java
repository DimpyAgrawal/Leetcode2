class Solution {
    public double findMaxAverage(int[] nums, int k) {
            double sum=0;
        double avg=0;
        double max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            
        }
        avg=sum/k;
        max=Math.max(avg,max);
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg=sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}