class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int[] arr=new int[matrix[0].length];
		int n=matrix.length;
		int ans=0;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<arr.length;j++) {
				if(matrix[i][j]=='1') {
					arr[j]=arr[j]+1;
				}
				else {
					arr[j]=0;
				}
			}
			int area=maximal_rectangle(arr);
			 ans=Math.max(ans, area);
		}
		
		return ans;
    }
    	
    public static int maximal_rectangle(int[] arr) {
		Stack<Integer> st= new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int r=i;
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					int a=h*r;
					ans=Math.max(ans,a);
				}
				else {
					int l=st.peek();
					int a=h*(r-l-1);
					ans=Math.max(ans,a);
				}
				
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				ans=Math.max(ans,h*(r-l-1));
			}
			
		}
		
	return ans;
	}
}