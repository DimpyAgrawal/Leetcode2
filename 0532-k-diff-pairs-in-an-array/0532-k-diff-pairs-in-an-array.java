class Solution {
    public int findPairs(int[] nums, int k) {
      
//         int pairs = 0, n = nums.length;
        
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> repeatedElements = new HashSet<>();
        
//         for(int ele : nums){
//             if(set.contains(ele)) repeatedElements.add(ele);
//             set.add(ele);
//         }
        
//         // SPECIAL CASE [K == 0]
//         if(k == 0) return repeatedElements.size();
        
//         // Traversing the SET not the array.
//         for(int elementInSet : set)
//             if(set.contains(elementInSet + k)) pairs++;
       
//         return pairs;
//     }
// }
        
        
        Set<Integer> set= new HashSet<>();
        Set<Integer> repeatedele= new HashSet<>();
        int c=0;
        
        for(int ele : nums){
            if(set.contains(ele)) repeatedele.add(ele);
            set.add(ele);
        }
        
        if(k==0) return repeatedele.size();
        
        for(int ele:set)
            if(set.contains(ele+k)) c++;
        
        return c;
    }
}