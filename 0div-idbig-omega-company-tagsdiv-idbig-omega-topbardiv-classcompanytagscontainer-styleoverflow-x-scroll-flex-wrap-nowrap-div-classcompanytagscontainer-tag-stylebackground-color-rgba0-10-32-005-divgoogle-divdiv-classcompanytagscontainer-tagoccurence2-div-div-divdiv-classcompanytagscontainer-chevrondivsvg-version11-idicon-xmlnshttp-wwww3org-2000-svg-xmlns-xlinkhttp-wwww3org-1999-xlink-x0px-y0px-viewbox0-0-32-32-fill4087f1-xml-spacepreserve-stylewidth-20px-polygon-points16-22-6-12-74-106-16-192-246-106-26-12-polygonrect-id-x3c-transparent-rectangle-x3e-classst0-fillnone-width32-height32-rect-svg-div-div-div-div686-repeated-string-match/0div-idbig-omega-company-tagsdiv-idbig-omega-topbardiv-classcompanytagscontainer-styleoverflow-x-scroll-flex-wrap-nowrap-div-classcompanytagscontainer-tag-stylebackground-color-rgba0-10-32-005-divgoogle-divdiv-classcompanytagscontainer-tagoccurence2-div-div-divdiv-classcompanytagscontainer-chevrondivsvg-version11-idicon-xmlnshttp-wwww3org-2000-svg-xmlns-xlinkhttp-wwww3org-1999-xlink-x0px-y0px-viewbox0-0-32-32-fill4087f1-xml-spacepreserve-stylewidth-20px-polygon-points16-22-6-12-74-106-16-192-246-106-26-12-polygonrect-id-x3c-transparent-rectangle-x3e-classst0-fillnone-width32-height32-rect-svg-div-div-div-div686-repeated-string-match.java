class Solution {
    public int repeatedStringMatch(String a, String b) {
       int n = b.length()/a.length();
       int c=1;
       String str = a;
       for(int i=0;i<n+2;i++){
           if(a.contains(b)) return c;
           else{
               a+=str;
               c++;
           }
       }
        return -1;
    }
}