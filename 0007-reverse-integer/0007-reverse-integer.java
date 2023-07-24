class Solution {
    public int reverse(int x) {
        long a=0;
        int m=x;
        while(x!=0){
            int rem=x%10;
            x/=10;
            // if (a > 2147483647/10 || (a == 2147483647/10 && rem > 7)) return 0;
            // if(a<Integer.MIN_VALUE || a>Integer.MAX_VALUE) return 0;
            //if (a <-2147483648/10 || (a == -2147483648/10 && rem < -8)) return 0;
            // if(a<-2147483648/10 || a>2147483647/10)return 0;
            a=a*10+rem;
        }
    if (a > Math.pow(2, 31)-1 || a < -(Math.pow(2, 31))) return 0;
    int b=(int)a;
    return b;
       
       
    }
}