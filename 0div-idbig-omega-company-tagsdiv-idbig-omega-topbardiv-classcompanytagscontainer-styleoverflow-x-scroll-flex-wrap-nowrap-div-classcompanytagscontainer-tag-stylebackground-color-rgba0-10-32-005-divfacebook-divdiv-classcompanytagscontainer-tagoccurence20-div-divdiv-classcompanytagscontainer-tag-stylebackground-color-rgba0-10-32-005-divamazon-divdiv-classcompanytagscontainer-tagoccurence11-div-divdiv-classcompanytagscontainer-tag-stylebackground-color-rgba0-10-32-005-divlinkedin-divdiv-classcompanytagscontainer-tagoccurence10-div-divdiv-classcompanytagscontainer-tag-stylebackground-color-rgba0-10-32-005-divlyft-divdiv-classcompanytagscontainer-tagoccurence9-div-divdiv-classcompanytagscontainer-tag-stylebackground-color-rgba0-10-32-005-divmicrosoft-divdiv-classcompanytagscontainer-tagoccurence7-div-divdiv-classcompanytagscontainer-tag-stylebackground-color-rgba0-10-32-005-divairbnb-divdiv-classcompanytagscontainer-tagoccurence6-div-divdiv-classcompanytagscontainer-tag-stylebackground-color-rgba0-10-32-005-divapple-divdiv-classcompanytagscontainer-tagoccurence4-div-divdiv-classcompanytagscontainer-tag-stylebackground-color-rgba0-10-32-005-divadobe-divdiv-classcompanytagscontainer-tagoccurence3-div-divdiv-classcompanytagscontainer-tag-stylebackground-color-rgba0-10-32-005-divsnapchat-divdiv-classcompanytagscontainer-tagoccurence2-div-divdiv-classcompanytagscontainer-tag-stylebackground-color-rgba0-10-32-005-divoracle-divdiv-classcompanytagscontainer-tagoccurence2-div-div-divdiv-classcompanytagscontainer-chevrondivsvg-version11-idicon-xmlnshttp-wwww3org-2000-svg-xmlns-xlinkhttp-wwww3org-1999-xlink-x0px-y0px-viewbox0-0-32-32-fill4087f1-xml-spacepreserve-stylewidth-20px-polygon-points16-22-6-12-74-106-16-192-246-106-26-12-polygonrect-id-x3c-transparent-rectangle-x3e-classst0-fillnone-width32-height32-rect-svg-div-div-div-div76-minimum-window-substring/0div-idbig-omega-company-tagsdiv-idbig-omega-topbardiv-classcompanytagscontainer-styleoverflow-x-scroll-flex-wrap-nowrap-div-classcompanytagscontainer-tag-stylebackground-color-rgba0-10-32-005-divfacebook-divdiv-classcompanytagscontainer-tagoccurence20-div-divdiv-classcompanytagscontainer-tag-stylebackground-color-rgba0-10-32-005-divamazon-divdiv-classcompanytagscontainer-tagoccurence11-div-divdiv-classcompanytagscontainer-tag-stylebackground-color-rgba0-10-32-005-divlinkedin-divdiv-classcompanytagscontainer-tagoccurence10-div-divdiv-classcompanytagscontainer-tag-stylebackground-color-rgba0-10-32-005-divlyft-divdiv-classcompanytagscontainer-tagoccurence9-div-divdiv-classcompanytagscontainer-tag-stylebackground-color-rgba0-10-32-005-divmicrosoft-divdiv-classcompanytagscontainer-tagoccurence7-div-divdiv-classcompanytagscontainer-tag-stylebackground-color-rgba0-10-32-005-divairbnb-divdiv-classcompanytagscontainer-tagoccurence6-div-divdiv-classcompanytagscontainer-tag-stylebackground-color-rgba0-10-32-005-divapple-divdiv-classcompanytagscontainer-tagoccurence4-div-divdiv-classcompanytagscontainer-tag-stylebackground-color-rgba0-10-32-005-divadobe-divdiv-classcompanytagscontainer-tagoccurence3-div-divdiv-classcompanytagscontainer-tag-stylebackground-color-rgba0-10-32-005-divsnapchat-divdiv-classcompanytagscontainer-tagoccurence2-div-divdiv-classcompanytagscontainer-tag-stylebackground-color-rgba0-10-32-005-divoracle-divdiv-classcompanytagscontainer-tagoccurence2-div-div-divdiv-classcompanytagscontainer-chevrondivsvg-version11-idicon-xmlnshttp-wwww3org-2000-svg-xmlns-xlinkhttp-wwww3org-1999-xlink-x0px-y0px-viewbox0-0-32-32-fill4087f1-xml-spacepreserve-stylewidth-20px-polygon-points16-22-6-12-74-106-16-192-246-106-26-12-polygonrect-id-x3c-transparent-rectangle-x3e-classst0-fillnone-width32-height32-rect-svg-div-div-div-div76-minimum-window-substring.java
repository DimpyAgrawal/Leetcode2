class Solution {
    public String minWindow(String s1, String s2) {
        if(s1.length()==0 || s2.length()==0 || s1.length()<s2.length()) return "";
      int leftcount = s2.length();
        int minlength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int minstart=0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)+1);
        }
        
        while(end<s1.length()){
            char ch= s1.charAt(end);    
            if(map.containsKey(ch)){
                 int count = map.get(ch); 
                if(count>0) 
                    leftcount--;
                
                map.put(ch,count-1);
            }
                 
            end++;
        
        while(leftcount==0){
            if(minlength>end-start){
                minlength = end-start;
                minstart = start;
            }
            char sch = s1.charAt(start);
            if(map.containsKey(sch)){
                 int count = map.get(sch);
                if(count==0)
                    leftcount++;
                
                 map.put(sch,count+1);
            }
            start++;
        }
    
        }
    return minlength==Integer.MAX_VALUE?"": s1.substring(minstart,minlength+minstart);

        }
		
}