class Solution {
    public int lengthOfLongestSubstring(String s) {
    int right=0;
    int left= 0;
        int max=0;
        int n= s.length();
        
        Map<Character,Integer> map = new HashMap<>();
        
        while(right<n){
          
            if(map.containsKey(s.charAt(right))){
              left  = Math.max(map.get(s.charAt(right))+1,left);  
            }
              map.put(s.charAt(right),right);
            max = Math.max(right-left+1,max);
            
            
            right++;
        }
        return max;
    }
}