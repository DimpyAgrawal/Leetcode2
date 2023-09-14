class Solution {
     static int mod = (int)1e9+7;
    public int numWays(String s) {
        int n= s.length();
        int c1=0;
        int c2=0;
        char[] arr = s.toCharArray();
       int total_ones = 0;
        
        
        int ones = 0;
        for(char a: arr){
            ones+=a-'0';
        }
        if(ones%3!=0) return 0;
        if(ones==0) return (int)((((long)(n-1)*(n-2))/2)%mod);
        int div = ones/3;
        
        for(char a:arr){
            total_ones+=a-'0';
            if(total_ones==div)c1++;
            if(total_ones==2*div)c2++;
            
        }
        
        return (int) (((long)c1*c2)%mod);
    }
}