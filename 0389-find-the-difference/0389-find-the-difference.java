class Solution {
    public char findTheDifference(String s, String t) {
        short[] arr= new short[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:t.toCharArray()){
            arr[c-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return (char)(i+'a');
        
        }
        return 'a';
    }
    
    
}