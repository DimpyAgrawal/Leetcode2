class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l= new ArrayList<>();
		parentheses(n,"",0,0,l);
        return l;
    }
    public static void parentheses(int n,String ans, int open ,int close,List<String> l) {
		if(open ==n && close==n) {
			//System.out.print(ans+"");
			l.add(ans);
		
		return;
		}
		if(open<n) 
			parentheses(n,ans+"(",open+1,close, l);
		if(close<open)
			parentheses(n,ans+")",open,close+1, l);
			
		
	
	}
}