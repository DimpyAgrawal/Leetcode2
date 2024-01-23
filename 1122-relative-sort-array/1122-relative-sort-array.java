class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int c=0;
        for(int i : arr2){
            for(int j=0;j<map.get(i);j++){
                arr1[c++] =i;
            }
            map.remove(i);
        }
        
        for(int i: map.keySet()){
            for(int j=0;j<map.get(i);j++){
                arr1[c++] = i;
            }
            
        }
        return arr1;
    }
}
