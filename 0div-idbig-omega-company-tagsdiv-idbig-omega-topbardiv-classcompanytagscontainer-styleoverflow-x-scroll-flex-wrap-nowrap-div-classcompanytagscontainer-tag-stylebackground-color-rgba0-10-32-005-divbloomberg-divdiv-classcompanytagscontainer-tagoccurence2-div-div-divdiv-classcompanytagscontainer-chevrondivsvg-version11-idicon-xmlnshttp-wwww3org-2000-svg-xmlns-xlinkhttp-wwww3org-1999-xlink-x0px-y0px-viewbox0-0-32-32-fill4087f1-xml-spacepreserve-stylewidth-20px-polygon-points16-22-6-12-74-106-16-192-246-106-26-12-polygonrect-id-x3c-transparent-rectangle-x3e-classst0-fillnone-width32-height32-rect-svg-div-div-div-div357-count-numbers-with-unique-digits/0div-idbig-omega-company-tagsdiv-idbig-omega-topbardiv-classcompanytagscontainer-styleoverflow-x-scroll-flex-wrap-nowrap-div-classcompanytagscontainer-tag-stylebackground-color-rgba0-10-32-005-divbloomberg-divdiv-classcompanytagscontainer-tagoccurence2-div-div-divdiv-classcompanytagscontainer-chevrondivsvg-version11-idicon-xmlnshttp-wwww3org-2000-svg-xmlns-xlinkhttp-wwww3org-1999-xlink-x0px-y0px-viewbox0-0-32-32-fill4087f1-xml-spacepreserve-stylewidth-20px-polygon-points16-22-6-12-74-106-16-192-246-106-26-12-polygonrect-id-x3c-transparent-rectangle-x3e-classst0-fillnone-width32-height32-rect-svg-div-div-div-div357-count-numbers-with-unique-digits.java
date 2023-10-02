class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       if(n==0) return 1;
        
        int ans=10,curr=9,a=9;
        while(n>1 && a>0){
            
            curr*=a;
            a--;
            ans+=curr;
            n--;
        }
        return ans;
        
    }
}