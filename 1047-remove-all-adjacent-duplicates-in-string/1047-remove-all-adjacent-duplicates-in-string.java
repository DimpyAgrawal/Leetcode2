class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
       // String str = "";
        
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
        }
        // while(!st.isEmpty()){
        //    // str=st.pop()+str;
        //     str.append(st.pop());
        // }
        for(char c: st) str.append(c);
        return str.toString();
    }
}

