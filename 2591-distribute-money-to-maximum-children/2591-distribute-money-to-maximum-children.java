class Solution {
    public int distMoney(int money, int children) {
        if(children>money) return -1;
      if(money<8) return 0;
        
        int d=money/8;
        int rem=money%8;
        if(rem==0 && d== children) return  children;
        if(d>= children) return  children-1;
        if(rem==4 &&( children-d)==1) return  children-2;
        if(rem>= (children-d)) return d;
        int left= children-d;
        while(rem<left){
            left++;
            rem+=8;
            d--;
        }
        return d;
        
        
    }
    
}