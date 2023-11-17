import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        
        while (i < pushed.length) {
            stack.push(pushed[i]);
            
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
            
            i++;
        }
        
        return stack.isEmpty();
    }
}
