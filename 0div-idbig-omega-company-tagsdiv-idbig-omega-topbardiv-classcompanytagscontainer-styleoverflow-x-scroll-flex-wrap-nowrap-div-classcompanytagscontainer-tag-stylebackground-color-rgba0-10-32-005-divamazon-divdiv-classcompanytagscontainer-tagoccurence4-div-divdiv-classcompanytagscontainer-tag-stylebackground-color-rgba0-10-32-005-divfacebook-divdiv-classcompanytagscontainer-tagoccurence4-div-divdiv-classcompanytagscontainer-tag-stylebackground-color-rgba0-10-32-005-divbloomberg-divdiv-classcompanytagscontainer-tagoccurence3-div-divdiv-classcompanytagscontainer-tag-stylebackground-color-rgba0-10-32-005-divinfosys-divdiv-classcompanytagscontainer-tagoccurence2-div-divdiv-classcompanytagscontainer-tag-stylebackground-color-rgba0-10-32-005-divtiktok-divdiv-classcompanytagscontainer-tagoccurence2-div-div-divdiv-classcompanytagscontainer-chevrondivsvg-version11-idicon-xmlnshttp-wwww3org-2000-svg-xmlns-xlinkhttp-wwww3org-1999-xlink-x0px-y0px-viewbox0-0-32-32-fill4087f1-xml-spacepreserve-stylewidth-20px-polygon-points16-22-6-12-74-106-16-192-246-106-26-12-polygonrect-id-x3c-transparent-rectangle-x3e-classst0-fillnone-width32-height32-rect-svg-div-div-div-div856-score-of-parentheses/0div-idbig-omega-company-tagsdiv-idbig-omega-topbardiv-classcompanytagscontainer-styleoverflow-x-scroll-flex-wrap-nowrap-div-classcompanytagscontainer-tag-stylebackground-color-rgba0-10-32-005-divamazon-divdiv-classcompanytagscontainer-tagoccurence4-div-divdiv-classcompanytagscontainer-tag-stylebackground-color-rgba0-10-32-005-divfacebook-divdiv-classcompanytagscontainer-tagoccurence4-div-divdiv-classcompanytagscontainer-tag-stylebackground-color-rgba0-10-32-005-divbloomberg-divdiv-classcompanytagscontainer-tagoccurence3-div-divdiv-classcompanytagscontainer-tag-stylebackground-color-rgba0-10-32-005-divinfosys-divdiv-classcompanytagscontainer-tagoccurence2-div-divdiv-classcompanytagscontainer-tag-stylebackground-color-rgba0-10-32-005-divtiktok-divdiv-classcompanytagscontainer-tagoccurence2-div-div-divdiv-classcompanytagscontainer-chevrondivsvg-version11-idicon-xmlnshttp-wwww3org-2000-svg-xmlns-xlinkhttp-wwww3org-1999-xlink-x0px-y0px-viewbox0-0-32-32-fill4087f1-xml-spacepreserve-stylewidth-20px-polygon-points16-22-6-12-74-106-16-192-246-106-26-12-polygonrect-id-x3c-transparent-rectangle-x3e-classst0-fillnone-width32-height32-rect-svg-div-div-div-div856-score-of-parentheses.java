// class Solution {
//     public int scoreOfParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         int score=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='(') st.push('(');
//             else if(!st.isEmpty() && s.charAt(i)==')'){
//                 score++;
//                 st.pop();
            
//             }
//         }
//         return score;
//     }
// }


import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            if (c == '(') {
                stack.push(score);
                score = 0;  // Reset score for the new level of parentheses
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }

        return score;
    }
}
