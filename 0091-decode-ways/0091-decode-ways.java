class Solution {
    public int numDecodings(String s) {
        // if(s.length()==0) return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!='0'){
                dp[i] = dp[i+1];
                if(i<n-1 && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<'7')) 
                    dp[i]+=dp[i+2];
            }
            
            
        }
        return dp[0];
       
      // return decodeUtil(0,s);      
    }
    
    public int decodeUtil(int ind,String s){
        int n= s.length();
        if(ind==n) return 1;
        
        if(s.charAt(ind)=='0') return 0;
        int res= decodeUtil(ind+1,s);
        if(ind<n-1 && (s.charAt(ind)=='1'|| s.charAt(ind)=='2' &&  s.charAt(ind+1)<'7'))
            res+= decodeUtil(ind+2,s);
        return res;
    }
}
