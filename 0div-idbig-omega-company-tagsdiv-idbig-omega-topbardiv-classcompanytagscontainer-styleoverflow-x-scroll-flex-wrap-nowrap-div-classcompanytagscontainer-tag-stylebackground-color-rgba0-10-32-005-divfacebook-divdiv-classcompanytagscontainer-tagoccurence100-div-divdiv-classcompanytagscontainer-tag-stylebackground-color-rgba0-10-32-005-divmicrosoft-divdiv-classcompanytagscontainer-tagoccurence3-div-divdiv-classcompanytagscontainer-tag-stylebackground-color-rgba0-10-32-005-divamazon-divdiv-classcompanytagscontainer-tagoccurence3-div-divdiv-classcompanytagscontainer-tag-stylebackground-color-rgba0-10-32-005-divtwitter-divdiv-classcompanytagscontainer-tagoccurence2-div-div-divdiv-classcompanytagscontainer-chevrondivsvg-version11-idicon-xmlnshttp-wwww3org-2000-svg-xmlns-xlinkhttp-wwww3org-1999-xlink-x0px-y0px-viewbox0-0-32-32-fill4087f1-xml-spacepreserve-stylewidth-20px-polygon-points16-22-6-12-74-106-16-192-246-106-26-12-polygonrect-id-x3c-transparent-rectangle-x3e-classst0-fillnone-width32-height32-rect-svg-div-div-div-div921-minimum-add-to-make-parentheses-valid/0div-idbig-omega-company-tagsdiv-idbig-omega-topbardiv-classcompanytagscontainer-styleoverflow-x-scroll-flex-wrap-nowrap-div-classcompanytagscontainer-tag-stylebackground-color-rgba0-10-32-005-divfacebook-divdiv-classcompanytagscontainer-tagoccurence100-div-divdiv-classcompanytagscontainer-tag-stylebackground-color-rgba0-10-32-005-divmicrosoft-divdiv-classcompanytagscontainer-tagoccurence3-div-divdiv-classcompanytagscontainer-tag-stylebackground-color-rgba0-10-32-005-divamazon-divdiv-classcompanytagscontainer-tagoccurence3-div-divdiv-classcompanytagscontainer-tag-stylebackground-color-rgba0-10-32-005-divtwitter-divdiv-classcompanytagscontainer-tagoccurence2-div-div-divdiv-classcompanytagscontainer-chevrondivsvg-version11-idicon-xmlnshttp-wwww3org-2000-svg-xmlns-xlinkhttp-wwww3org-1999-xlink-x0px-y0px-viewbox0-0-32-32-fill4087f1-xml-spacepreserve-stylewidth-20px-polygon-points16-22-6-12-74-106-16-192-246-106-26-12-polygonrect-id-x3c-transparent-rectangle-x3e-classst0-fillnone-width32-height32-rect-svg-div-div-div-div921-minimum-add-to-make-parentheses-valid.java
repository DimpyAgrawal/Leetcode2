class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st =  new Stack<>();
        int score=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
               st.push('(');
                score++;
            } 
            else if(c==')' && !st.isEmpty()){
               st.pop();
                score--;
            } 
            else score++;
        }
        return score;
    }
}