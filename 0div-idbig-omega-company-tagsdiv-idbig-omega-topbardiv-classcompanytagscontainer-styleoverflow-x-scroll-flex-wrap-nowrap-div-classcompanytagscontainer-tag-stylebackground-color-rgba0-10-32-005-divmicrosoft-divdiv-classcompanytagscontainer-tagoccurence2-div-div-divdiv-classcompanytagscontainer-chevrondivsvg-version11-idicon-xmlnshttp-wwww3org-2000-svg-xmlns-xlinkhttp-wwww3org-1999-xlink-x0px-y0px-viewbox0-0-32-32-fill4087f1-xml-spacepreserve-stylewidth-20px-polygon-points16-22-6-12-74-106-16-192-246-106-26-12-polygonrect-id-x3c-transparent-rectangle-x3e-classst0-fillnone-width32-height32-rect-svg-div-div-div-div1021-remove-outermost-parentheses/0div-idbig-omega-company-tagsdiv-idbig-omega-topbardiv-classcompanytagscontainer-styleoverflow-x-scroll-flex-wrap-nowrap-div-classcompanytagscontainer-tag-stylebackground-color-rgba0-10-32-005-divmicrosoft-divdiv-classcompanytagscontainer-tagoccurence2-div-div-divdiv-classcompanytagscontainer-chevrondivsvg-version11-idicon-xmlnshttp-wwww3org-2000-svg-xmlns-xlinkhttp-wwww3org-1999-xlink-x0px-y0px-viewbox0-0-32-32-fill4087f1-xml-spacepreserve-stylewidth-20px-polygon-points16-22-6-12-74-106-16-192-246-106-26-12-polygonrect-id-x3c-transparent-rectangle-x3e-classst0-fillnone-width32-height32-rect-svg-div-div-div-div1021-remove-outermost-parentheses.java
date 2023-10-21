class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int open=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                open++;
                if(open>1)  str+="(";
            }
            else{
                if(open>1) str+=")";
                open--;
            }
        }
        return str;
    }
}