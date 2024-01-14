class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> ans = new ArrayList<>();
        // String[] ans = new String[2];
        String[] words = text.split("\\s+");
        int k=0;
        for(int i=0;i<words.length-2;i++){
            if(first.equals(words[i]) && second.equals(words[i+1])){
                ans.add(words[i+2]); 
            }
        }
        String[] ans2 = new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans2[i] = ans.get(i);
        }
        return ans2;
    }
}