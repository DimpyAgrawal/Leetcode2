class RecentCounter {
   ArrayList<Integer> list;
    public RecentCounter() {
       list = new ArrayList<>();
        
    }
    
    public int ping(int t) {
      list.add(t);
      int min = t-3000;
      int max = t;
      int count =list.size();
      for(int i=0;i<list.size();i++){
          if(list.get(i)<min || list.get(i)>max) count--;
          
      }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */