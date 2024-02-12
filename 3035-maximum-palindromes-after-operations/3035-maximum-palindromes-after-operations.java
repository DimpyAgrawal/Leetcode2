class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] arr = new int[words.length];
        int n = words.length;
        for (int i = 0; i < n; ++i)
            arr[i] = words[i].length();
        Arrays.sort(arr);
        
        // Counting character occurrences
        for (String w : words)
            for (char c : w.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);

        // Counting pairs of characters
        int pairs = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
            pairs += entry.getValue() / 2;
        
        // Adjusting pairs based on word lengths
        for (int i = 0; i < n; i++)
            if ((pairs -= arr[i] / 2) < 0)
                return i;
        return n;
    }
}
