class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        if (num.length() <= k) return "0";
        int i = 0;
        
        while (i < num.length()) {
            while (k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        
        // Handle the case where we have to remove more digits
        while (k > 0) {
            st.pop();
            k--;
        }
        
        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        
        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}
