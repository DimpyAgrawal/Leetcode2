class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int ele : arr1){
            String s = ele+"";
            for(int i=0;i<s.length();i++)
                set.add(s.substring(0,i+1));
        }
        int max = 0;
        for(int ele : arr2){
            String s = ele+"";
            for(int i=0;i<s.length();i++){
                String str = s.substring(0,i+1);
                if(set.contains(str))
                    max = Math.max(max,str.length());
            }
        }
        return max;
    }
}