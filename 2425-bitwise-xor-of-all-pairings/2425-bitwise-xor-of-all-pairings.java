class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // int l=nums1.length*nums2.length;
        // int[] nums3= new int[l];
        // int k=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         nums3[k]=nums1[i]^nums2[j];
        //         k++;
        //     }
        // }
        // // time complexity is too high
        // int ans=nums3[0];
        // for(int i=1;i<nums3.length;i++){
        //     ans^=nums3[i];
        // }
        // return ans;
//         int result=0;
//         //if(nums1.length%2==0 && nums2.length%2==0) return 0;
//         if(nums2.length!=0){
//              for(int i=0;i<nums1.length;i++){
//              result^=nums1[i];
        
//         }
        
//         }
           
//         if(nums1.length!=0){
//              for(int i=0;i<nums2.length;i++){
//              result^=nums2[i];
        
//         }   
//         }
            
       
//         return result;
        
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums2.length % 2 == 1) {
                result = result ^ nums1[i];
            } 
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums1.length % 2 == 1) {
                result = result = result ^ nums2[i];
            }
        }
        return result;
            
    }
}