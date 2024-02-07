class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>>  list = new ArrayList<>(map.entrySet());
            list.sort((a,b)-> b.getValue().compareTo(a.getValue()));

        StringBuilder str= new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            int count = entry.getValue();
            char ch = entry.getKey();
            while(count-->0){
                str.append(ch);
            }
        }
        return str.toString();
    }
}