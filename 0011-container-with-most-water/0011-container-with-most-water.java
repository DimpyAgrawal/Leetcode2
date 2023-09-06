class Solution {
    public int maxArea(int[] arr) {
        int start =  0;
        int end = arr.length-1;
        
        int maxarea = 0;
        int area = 0;
        
        while(start<end){
            area = Math.min(arr[start],arr[end])*(end-start);
            if(area>maxarea) maxarea = area;
            
            if(Math.min(arr[start],arr[end])==arr[start]) start++;
            else end--;
        }
        
        return maxarea;
    }
}