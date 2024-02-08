class Solution {
    public int minimumTimeToInitialState(String word, int k) {
      int c=1; int i=-1;
      for(i=k;i<word.length();i+=k){
          if(word.startsWith(word.substring(i)))
            break;
          c++;
      }
      return c;
    }
}