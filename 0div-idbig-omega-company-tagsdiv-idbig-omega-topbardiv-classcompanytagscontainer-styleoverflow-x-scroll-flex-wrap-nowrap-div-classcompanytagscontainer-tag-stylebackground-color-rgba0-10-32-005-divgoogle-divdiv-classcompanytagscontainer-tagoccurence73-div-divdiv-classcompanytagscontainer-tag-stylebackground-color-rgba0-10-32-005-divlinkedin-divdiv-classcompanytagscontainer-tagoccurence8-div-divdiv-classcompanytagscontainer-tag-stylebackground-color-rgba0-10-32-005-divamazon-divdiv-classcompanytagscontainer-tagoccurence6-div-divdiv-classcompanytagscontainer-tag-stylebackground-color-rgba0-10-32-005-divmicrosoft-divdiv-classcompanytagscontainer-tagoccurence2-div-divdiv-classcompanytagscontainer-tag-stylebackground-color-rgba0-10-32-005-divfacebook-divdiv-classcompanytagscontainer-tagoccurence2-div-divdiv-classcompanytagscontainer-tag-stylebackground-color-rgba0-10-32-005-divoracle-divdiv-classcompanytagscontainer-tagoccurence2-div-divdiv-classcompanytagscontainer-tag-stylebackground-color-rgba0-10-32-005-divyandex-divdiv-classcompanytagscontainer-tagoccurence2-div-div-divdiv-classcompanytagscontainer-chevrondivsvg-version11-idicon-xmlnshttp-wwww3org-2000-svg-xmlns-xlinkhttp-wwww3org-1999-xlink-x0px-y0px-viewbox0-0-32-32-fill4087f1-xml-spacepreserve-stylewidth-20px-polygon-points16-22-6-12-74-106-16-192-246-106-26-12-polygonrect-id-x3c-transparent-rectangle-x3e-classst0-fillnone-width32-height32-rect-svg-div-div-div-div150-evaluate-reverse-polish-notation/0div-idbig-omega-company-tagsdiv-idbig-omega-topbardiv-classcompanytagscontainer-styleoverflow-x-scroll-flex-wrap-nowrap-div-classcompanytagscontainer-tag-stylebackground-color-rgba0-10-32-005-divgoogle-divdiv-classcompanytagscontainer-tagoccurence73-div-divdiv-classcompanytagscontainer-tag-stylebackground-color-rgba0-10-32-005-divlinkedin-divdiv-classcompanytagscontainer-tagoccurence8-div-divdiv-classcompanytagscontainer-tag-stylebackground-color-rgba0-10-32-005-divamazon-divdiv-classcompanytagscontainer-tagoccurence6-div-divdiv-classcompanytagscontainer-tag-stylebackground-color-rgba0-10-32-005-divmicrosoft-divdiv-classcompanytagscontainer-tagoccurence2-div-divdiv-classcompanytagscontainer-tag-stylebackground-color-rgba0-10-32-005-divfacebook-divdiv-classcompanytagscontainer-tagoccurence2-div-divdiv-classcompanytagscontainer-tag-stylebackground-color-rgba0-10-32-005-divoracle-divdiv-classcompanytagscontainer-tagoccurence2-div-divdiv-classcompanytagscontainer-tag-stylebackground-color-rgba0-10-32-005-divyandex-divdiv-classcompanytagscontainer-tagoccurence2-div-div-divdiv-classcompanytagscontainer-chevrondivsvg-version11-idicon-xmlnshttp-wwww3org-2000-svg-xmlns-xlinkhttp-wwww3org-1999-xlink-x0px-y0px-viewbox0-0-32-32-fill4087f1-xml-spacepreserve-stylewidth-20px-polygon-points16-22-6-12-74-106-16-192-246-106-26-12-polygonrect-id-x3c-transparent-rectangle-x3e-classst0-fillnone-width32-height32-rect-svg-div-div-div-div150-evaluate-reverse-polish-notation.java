class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st  =  new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int add1=st.pop();
                int add2=st.pop();
                st.push(add1+add2);  
            }
           else if(tokens[i].equals("-")){
                int add1=st.pop();
                int add2=st.pop();
                st.push(add2-add1);  
            }
            else if(tokens[i].equals("*")){
                int add1=st.pop();
                int add2=st.pop();
                st.push(add1*add2);  
            }
            else if(tokens[i].equals("/")){
                int add1=st.pop();
                int add2=st.pop();
                st.push(add2/add1);  
            }
            
            
            else {
                int c = Integer.parseInt(tokens[i]);
                st.push(c);
            }
        }
        return st.isEmpty() ?-1: st.pop();
    }
}


