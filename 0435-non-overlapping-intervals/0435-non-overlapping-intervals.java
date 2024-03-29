class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
        int ans=0,left=0,right=1;
        while(right<intervals.length){
            if(intervals[left][1]<=intervals[right][0]){
                left=right;  //no overlapping
                right++;
            }
            else if(intervals[left][1]<=intervals[right][1]){
                ans++;   //remove right interval
                right++;
            }
            else if(intervals[left][1]>intervals[right][1]){
                ans++;      //remove left interval
                left=right;
                right++;
            }
        }
        return ans;
        
    }
}