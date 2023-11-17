class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign =1;
        int temp=0;
        Stack<Integer> st  = new Stack<>();
        st.push(1);
        
        for(char x : s.toCharArray()){
            if(x=='+' || x=='-'){
                result+=(sign*temp);
                sign = st.peek()*(x=='+'? 1:-1);
                temp=0;
            }
            else if(x>='0' && x<='9') temp= 10*temp+(x-'0');
            else if(x=='(') st.push(sign);
            else if(x==')') st.pop();
        }
        result+=(sign*temp);
        return result;
    }
}