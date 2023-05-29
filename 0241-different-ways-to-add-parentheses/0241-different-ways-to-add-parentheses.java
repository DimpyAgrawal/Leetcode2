class Solution {
    public List<Integer> diffWaysToCompute(String expr) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(ch=='-' || ch=='+' || ch=='*'){
                List<Integer> a1=diffWaysToCompute (expr.substring(0,i));
                List<Integer> b1=diffWaysToCompute(expr.substring(i+1));
                
                for(Integer a:a1){
                    for(Integer b:b1){
                        if(ch=='+') ans.add(a+b);
                        if(ch=='-') ans.add(a-b);
                        if(ch=='*') ans.add(a*b);
                    }
                }
            }
        }
        
        if(ans.size()==0) ans.add(Integer.valueOf(expr));
    
        return ans;
    }
}