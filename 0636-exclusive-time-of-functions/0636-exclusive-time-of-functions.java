public class Solution {
    public int[] exclusiveTime(int n, List<String> list) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        String[] s = list.get(0).split(":");
        st.push(Integer.parseInt(s[0]));
        int i = 1, prev = Integer.parseInt(s[2]);
        while (i < list.size()) {
            s = list.get(i).split(":");
            if (s[1].equals("start")) {
                if (!st.isEmpty())
                    ans[st.peek()] += Integer.parseInt(s[2]) - prev;
                st.push(Integer.parseInt(s[0]));
                prev = Integer.parseInt(s[2]);
            } else {
                ans[st.peek()] += Integer.parseInt(s[2]) - prev + 1;
                st.pop();
                prev = Integer.parseInt(s[2]) + 1;
            }
            i++;
        }
        return ans;
    }
}
