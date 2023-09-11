class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return Util(s,i+1,j) || Util(s,i,j-1);
            }
          
        }
        return true;
    }
        public  boolean Util(String str,int i,int j){
            while(i<=j){
                if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
            }
            
            
            return true;
        
    }
}
