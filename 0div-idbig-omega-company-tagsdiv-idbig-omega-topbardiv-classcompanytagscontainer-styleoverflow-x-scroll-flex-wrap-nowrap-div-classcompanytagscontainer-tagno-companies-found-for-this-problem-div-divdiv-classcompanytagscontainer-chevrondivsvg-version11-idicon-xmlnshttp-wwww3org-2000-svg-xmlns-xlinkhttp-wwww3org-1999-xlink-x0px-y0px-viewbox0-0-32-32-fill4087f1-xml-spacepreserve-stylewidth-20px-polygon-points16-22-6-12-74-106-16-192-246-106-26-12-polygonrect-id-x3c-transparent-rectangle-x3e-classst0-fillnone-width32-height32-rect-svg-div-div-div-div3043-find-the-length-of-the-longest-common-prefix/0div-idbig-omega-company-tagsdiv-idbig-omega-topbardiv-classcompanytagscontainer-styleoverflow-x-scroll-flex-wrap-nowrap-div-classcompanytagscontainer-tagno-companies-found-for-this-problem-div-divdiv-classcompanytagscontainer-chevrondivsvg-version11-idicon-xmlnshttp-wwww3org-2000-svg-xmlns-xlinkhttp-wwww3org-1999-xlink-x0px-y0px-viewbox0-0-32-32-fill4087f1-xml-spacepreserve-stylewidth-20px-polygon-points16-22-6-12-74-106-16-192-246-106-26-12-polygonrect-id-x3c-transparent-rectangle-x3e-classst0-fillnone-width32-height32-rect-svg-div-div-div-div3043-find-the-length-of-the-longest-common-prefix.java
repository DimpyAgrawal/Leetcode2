class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
      HashSet<String> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
          
            String s = Integer.toString(arr1[i]);
            for(int j=0;j<s.length();j++)
                set.add(s.substring(0,j+1));
        }
        int max=0;
         for(int i=0;i<arr2.length;i++){
            String s = Integer.toString(arr2[i]);
            for(int j=0;j<s.length();j++){
                if(set.contains(s.substring(0,j+1))){
                    String a = s.substring(0,j+1);
                    max = Math.max(max,a.length());
                }
                
            }
        }
        return max;
    }
}