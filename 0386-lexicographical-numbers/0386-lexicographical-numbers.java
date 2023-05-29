class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> t= new ArrayList<Integer>();
        lexicoCounting(0,n,t);   
        return t;
    }
    	    	
	
	public static void lexicoCounting(int curr,int n,ArrayList<Integer> t) {
		int i=0;
        if(curr>n)
			return;
		if(curr!=0)
            t.add(curr);
        
		// int i=0;
		if(curr==0)
			i= 1;
		
		for(;i<=9;i++) {
			lexicoCounting(10*curr+i,n,t);
		}
		
}
}