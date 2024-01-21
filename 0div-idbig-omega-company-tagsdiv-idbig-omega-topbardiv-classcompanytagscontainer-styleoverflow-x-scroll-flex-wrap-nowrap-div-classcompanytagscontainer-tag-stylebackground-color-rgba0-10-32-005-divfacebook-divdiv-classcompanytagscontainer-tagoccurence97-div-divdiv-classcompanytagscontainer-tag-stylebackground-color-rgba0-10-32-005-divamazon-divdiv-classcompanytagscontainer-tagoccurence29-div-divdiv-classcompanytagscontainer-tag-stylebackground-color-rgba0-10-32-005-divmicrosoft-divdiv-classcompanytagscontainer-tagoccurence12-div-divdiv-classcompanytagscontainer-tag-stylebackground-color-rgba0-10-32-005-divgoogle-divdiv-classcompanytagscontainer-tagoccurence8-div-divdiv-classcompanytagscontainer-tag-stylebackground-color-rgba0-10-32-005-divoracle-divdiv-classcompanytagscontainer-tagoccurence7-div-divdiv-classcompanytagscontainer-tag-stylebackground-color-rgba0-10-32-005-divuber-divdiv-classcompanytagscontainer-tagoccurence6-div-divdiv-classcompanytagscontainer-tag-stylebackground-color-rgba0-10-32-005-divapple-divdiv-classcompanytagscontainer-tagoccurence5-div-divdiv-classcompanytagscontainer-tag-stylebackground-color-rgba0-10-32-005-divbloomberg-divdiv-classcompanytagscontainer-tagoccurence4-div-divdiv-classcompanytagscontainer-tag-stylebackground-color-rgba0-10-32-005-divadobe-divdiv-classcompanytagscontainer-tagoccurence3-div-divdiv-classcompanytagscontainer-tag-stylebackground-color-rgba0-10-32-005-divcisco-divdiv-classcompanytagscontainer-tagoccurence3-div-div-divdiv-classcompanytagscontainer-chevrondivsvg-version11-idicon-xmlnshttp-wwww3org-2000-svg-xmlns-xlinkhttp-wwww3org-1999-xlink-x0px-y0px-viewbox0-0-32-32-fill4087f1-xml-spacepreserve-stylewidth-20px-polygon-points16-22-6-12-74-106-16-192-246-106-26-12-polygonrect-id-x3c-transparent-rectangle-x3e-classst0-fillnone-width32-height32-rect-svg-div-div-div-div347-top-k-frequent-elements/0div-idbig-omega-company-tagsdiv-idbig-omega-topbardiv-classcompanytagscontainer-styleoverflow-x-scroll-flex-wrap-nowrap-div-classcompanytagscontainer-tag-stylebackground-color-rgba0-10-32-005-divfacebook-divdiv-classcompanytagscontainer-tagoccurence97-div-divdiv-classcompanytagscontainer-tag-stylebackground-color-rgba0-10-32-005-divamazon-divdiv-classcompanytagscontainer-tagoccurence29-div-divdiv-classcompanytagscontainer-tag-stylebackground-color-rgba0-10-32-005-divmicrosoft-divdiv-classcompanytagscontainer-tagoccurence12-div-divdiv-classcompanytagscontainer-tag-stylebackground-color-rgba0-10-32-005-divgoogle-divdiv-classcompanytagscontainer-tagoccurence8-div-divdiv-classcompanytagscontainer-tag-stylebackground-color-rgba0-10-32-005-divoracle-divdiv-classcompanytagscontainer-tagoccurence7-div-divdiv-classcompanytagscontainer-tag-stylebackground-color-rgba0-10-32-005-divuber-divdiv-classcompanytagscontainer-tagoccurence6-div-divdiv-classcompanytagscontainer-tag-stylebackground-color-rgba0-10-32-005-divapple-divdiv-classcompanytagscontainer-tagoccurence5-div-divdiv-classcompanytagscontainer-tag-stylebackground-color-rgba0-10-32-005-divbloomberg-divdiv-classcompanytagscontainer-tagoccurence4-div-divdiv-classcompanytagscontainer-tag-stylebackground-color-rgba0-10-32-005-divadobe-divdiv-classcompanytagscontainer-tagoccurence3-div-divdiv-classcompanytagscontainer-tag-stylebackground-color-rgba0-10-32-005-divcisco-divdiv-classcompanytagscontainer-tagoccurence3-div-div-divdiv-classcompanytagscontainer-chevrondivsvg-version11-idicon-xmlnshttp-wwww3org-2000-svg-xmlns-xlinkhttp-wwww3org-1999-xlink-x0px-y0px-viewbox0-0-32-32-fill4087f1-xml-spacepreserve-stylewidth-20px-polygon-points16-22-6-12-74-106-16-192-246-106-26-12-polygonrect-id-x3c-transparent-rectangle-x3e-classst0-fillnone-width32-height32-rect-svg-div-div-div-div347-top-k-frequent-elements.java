class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map.entrySet());
        Collections.sort(list2,(Entry1,Entry2)->{
            return Entry2.getValue().compareTo(Entry1.getValue());
        });
        for(int i=0;i<k && i<list2.size();i++){
            ans[i] = list2.get(i).getKey();
        }
        return ans;
        
    }
}