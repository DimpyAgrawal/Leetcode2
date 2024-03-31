class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int ans = 0;
        for(int i=0;i<=num;i++){
            int a = i;
            int revN = reverse(a);
            if(a+revN==num) return true;
        }
        return false;
    }
    public int reverse(int n){
        int ans = 0;
        while(n>0){
            ans = ans*10+n%10;
            n/=10;
        }
        return ans;
    }
}