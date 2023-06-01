class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer> ll= new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		subset(nums,0,ll,ans);
		return ans; 
    }
    public static void subset(int[] arr, int i,List<Integer> ll,List<List<Integer>> ans) {
		if(i==arr.length) {
			ans.add(new ArrayList<Integer>(ll));
			//System.out.println(ll);
			return;
		}
		subset(arr,i+1,ll,ans);
		ll.add(arr[i]);
		subset(arr,i+1,ll,ans);
		ll.remove(ll.size()-1);
	}
}