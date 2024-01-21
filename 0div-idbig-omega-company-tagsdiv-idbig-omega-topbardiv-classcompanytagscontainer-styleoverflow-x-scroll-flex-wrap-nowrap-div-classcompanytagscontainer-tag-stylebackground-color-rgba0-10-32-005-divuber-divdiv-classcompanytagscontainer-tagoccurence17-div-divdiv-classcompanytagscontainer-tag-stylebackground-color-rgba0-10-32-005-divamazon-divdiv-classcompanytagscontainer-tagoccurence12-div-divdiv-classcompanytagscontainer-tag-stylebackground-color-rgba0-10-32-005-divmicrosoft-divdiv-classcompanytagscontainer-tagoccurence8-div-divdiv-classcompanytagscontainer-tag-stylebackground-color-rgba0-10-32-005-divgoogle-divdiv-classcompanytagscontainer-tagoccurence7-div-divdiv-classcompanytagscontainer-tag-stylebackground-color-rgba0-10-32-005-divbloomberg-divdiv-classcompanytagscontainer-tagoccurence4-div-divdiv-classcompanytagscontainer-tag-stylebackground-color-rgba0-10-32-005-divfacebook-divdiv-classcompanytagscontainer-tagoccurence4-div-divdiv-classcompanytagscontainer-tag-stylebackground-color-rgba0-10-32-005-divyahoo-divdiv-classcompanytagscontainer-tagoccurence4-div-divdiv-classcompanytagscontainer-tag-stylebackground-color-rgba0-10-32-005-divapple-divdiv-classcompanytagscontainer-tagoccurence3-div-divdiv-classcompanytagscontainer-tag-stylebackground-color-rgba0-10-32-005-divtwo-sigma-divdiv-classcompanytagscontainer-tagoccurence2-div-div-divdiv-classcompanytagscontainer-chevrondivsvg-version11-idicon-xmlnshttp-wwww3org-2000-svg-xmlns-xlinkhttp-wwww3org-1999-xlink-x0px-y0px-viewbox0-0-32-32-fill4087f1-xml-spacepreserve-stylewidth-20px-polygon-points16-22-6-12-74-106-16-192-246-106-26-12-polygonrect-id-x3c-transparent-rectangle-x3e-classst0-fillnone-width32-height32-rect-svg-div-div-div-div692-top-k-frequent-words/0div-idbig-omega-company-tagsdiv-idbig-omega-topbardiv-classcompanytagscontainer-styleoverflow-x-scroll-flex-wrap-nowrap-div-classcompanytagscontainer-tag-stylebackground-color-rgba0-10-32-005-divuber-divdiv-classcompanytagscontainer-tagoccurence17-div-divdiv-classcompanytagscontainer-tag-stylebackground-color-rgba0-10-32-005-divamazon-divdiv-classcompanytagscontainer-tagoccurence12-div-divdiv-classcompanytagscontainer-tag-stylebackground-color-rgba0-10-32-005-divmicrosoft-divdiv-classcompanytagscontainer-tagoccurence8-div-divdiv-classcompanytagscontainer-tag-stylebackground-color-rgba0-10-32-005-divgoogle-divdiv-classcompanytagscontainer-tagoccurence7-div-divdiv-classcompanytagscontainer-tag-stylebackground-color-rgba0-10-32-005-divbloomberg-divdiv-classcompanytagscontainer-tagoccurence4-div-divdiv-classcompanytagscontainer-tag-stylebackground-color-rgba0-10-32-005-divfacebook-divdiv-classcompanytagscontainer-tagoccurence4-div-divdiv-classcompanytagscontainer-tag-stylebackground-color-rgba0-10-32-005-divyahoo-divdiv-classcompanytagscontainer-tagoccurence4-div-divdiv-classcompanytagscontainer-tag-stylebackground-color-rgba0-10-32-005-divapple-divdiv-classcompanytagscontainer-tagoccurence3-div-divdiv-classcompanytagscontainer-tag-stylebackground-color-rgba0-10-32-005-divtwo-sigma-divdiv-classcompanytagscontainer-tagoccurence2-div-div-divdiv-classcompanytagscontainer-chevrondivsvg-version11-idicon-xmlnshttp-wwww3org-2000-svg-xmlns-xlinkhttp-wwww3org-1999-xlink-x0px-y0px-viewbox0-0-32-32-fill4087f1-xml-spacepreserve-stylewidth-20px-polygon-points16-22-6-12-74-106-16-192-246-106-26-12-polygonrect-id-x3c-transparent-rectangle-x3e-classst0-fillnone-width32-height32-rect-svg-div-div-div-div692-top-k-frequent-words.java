import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        // Create a list of Map.Entry objects and sort it based on frequency and lexicographical order
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        Collections.sort(list2, (entry1, entry2) -> {
            // If frequencies are equal, sort by lexicographical order
            if (entry1.getValue().equals(entry2.getValue())) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            // Otherwise, sort by frequency in descending order
            return entry2.getValue().compareTo(entry1.getValue());
        });

       
        for (int i = 0; i < k && i < list2.size(); i++) {
            list.add(list2.get(i).getKey());
        }

        return list;
    }
}
