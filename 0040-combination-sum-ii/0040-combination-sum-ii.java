class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ll= new ArrayList<>();
		List<List<Integer>> ans= new ArrayList<>();
		
		combination_sum( candidates,target,ll,ans,0 );
        return ans;
    }
 	public static void combination_sum(int[] arr,int target,List<Integer> ll,List<List<Integer>> ans,int sum ) {
			if(target==0) {
				//System.out.println(ans);
				ans.add(new ArrayList<>(ll));
				return;
			}
			for(int i=sum;i<arr.length;i++) {
				if(i==sum || arr[i]!=arr[i-1]) {
				if(target>=arr[i]) {
					ll.add(arr[i]);
					combination_sum( arr,target-arr[i],ll,ans,i+1 );
					ll.remove(ll.size()-1);
				}
				}
					
			}
				
		}
}