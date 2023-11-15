class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch))  
                size *= Integer.parseInt(""+ch);
            else 
                size++;
        }
        
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            k %=size;
            
            if(k == 0 && Character.isDigit(ch) == false) 
                return "" + ch;
            
            // handle the size decrease
            if(Character.isDigit(ch)) 
                size /= Integer.parseInt(""+ch);
            else 
                size--;
        }
        return "";
    }
}
