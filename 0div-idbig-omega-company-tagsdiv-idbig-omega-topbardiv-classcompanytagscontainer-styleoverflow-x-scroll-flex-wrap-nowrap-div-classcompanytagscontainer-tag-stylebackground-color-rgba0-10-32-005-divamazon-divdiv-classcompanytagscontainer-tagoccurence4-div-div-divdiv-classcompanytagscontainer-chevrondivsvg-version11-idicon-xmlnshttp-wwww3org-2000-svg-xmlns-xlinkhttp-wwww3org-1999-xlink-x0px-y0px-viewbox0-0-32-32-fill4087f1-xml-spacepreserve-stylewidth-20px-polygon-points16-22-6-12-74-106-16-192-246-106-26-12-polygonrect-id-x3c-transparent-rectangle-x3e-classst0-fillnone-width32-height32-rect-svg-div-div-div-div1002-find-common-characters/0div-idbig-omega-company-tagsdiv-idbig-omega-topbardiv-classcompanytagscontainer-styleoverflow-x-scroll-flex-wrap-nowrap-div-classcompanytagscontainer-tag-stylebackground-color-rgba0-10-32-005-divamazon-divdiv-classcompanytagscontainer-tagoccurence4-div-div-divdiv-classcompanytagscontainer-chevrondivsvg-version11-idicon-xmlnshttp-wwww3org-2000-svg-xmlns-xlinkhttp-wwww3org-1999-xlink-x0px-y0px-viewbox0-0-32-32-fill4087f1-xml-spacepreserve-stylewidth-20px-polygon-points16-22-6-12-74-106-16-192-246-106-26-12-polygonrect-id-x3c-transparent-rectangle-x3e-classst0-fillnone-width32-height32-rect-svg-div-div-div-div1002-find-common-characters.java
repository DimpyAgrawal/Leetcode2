class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        if (words == null || words.length == 0) {
            return result;
        }
        
        // Count the frequency of each character in the first word
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Iterate through the remaining words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentCharCount = new HashMap<>();
            
            // Count the frequency of each character in the current word
            for (char c : words[i].toCharArray()) {
                currentCharCount.put(c, currentCharCount.getOrDefault(c, 0) + 1);
            }
            
            // Update charCount to keep only the common characters
            for (char c : charCount.keySet()) {
                if (currentCharCount.containsKey(c)) {
                    charCount.put(c, Math.min(charCount.get(c), currentCharCount.get(c)));
                } else {
                    charCount.put(c, 0);
                }
            }
        }
        
        // Add the common characters to the result list
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            for (int count = 0; count < entry.getValue(); count++) {
                result.add(String.valueOf(entry.getKey()));
            }
        }
        
        return result;
    }
}
