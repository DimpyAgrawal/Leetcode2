// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n= nums.length;
//         int[] ans= new int[n-k+1];
//         int y=0;
//         Deque<Integer> q= new LinkedList<>();
//         int i;
//         for(i=0;i<k;i++){
            
//             while((!q.isEmpty()) && nums[i]>=nums[q.peekLast()]){
//                 q.removeLast();
//                 q.addLast(i);
//             }
//         }
        
//         for(i=k;i<nums.length;i++){
//              ans[y++] = nums[q.peek()];
//             while((!q.isEmpty()) && q.peek()<=i-k){
//                 q.removeFirst();
//                 while((!q.isEmpty()) && nums[i]>=nums[q.peekLast()]){
//                     q.removeLast();
//                 }
//                  q.addLast(i);
                
                
//             }      
//         }
//         ans[y++]=nums[q.peek()];
//       return ans;  
//     }
// }

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int y = 0;
        Deque<Integer> q = new LinkedList<>();
        
        // Initialize the first 'k' elements in the queue
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        // Process the remaining elements
        for (int i = k; i < n; i++) {
            ans[y++] = nums[q.peek()]; // Store the maximum element of the current window
            
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.removeFirst(); // Remove elements that are out of the current window
            }

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast(); // Remove elements that are less than the current element
            }

            q.addLast(i); // Add the current element's index to the queue
        }

        ans[y++] = nums[q.peek()]; // Store the maximum element of the last window

        return ans;
    }
}
