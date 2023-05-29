class Solution {
    public int countNumbersWithUniqueDigits(int n) {
         if(n==0)
            return 1;
        
        int a=9,cur=9,ans=10;
        while(a>0 && n>1)
        {
            cur*=a;
            a--;
            ans+=cur;
            n--;
        }
        return ans; 
        
        
    }
}