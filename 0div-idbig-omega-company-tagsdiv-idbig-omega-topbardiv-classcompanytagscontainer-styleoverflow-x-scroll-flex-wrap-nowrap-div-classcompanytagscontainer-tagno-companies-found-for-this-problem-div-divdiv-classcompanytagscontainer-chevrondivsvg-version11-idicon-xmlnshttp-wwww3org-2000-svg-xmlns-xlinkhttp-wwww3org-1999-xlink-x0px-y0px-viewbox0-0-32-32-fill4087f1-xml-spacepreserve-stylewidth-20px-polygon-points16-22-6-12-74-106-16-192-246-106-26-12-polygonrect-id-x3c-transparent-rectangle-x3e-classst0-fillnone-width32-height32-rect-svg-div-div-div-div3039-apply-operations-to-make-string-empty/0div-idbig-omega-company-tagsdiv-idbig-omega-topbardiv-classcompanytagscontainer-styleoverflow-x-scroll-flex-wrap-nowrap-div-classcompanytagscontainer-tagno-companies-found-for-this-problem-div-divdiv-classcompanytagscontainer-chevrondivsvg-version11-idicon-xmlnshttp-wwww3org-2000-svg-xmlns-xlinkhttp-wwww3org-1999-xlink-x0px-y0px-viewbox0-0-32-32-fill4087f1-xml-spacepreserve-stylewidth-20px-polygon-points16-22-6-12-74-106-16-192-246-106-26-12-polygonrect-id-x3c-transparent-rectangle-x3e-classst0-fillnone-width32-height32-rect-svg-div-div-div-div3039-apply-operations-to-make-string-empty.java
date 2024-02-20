
class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
         int maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));
        }
    
        StringBuilder ans = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){ 
            int val = map.get(s.charAt(i));
            if (val == maxFreq && ans.indexOf(String.valueOf(s.charAt(i)))==-1)
                ans.append(s.charAt(i));        
        }
       
        return ans.reverse().toString();
    }
}
