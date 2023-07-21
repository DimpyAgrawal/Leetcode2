class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<deck.length;i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int ans=0;
       for(int val : map.values()){
           ans=gcd(ans,val);
           
       } 
        return ans>=2;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

