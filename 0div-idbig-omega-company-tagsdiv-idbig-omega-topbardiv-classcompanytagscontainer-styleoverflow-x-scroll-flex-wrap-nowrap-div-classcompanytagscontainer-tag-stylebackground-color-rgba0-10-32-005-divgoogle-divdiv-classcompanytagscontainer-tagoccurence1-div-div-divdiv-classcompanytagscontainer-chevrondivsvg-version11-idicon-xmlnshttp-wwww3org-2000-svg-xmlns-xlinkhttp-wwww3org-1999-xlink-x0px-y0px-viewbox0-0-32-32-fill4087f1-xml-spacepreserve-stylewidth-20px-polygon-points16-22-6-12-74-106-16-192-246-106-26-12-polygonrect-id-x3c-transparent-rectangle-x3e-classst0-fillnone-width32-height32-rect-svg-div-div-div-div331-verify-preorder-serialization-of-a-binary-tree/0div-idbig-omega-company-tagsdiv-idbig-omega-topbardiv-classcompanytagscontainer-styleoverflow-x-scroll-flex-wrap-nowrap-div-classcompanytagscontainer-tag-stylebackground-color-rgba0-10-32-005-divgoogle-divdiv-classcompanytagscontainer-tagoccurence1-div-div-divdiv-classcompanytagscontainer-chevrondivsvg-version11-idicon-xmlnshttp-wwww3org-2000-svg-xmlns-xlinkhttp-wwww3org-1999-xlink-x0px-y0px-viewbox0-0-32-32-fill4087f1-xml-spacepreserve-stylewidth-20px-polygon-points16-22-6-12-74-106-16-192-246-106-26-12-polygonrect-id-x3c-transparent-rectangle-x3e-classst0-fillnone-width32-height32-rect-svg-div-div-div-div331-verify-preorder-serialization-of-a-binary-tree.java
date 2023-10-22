class Solution {
    public boolean isValidSerialization(String p) {
         String[] s = p.split(",");
        int diff = 1;
        for(String a : s){
            diff=diff-1;
           if( diff<0) return false;
           if(!a.equals("#")) diff+=2;
            
        }
        return diff==0;
        
       
    }
}
