class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int val : nums){
            set.add(val);
        } 
            
        
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) list.add(i);
        }
       
        return list;
    }
}