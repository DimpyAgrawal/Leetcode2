class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 1; i <= 9; i++) {
            q.add(i);
        }
        
        while (!q.isEmpty()) {
            int num = q.poll();
            
            if (num >= low && num <= high) {
                ans.add(num);
            }
            
            if (num % 10 < 9) {
                int rem = num % 10;
                int nextNum = num * 10 + rem + 1;
                if (nextNum <= high) {
                    q.add(nextNum);
                }
            } 
        }
        
        return ans;
    }
}
