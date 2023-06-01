class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combinationsum(1,9,ll,ans,k,n);
        
        return ans;
        
    }
    
    public static void combinationsum(int start,int end ,List<Integer> ll,List<List<Integer>> ans,int k,int target ){
        
        if(target==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        
        
        
        for(int i=start;i<=end;i++){
            ll.add(i);
            combinationsum(i+1,end,ll,ans,k,target-i);
            ll.remove(ll.size()-1);
            
        }
        
        
    }
}