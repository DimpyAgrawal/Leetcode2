class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list =  new ArrayList<>();
        IP(0,0,"",s,list);
        return list;
    }
    
    public void IP(int i,int part, String data,String s,List<String> list){
        if(i==s.length() && part==4)
            list.add(data.substring(0,data.length()-1));
        
        if(i+1<=s.length())
            IP(i+1,part+1,data+s.substring(i,i+1)+".",s,list);
        
        if(i+2<=s.length() && isValid(s.substring(i,i+2)))
            IP(i+2,part+1,data+s.substring(i,i+2)+".",s,list);
        
         if(i+3<=s.length() && isValid(s.substring(i,i+3)))
            IP(i+3,part+1,data+s.substring(i,i+3)+".",s,list);
    }
    
    public boolean isValid(String s1){
        if(s1.charAt(0)=='0') return false;
        int val = Integer.parseInt(s1);
        return val<=255;
    }
}