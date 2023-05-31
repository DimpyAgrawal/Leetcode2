class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        ArrayList<Integer> ds= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        
         combinations(n, k, 1, ds, ans); 
        return ans;
       
        
    }
    
    public static void combinations(int n,int k,int start, ArrayList<Integer> ds,List<List<Integer>> ans)      {
         if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=start;i<=n;i++){
            ds.add(i);
            combinations(n,k,i+1,ds,ans);
            ds.remove(ds.size()-1);
            
        }
    }
}