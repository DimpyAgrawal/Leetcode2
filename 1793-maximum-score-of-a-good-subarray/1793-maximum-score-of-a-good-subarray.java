class Solution {
    public int maximumScore(int[] nums, int k) {
        return (Area(nums,k));
    }
    public static int Area(int[] arr,int k) {
		Stack<Integer> st= new Stack<>();
		long ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int r=i;
				int h=arr[st.pop()];
				if(st.isEmpty()) {
                    if(r-1>=k){
					long a=h*r;
					ans=Math.max(ans,a);
                    }
				}
				else {
					int l=st.peek();
					if((l+1)<=k && (r-1)>=k) {
						int a=h*(r-l-1);
						ans=Math.max(ans,a);
					}
					
				}
				
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
                if(r-1>=k){
                int a=h*r;
				ans=Math.max(ans, a);
                }
			}
			else {
					int l=st.peek();
					if((l+1)<=k && (r-1)>=k) {
						int a=h*(r-l-1);
						ans=Math.max(ans,a);
					}
					
				}
        
			
		}
		
	        return (int)ans;

		
	}
    
}