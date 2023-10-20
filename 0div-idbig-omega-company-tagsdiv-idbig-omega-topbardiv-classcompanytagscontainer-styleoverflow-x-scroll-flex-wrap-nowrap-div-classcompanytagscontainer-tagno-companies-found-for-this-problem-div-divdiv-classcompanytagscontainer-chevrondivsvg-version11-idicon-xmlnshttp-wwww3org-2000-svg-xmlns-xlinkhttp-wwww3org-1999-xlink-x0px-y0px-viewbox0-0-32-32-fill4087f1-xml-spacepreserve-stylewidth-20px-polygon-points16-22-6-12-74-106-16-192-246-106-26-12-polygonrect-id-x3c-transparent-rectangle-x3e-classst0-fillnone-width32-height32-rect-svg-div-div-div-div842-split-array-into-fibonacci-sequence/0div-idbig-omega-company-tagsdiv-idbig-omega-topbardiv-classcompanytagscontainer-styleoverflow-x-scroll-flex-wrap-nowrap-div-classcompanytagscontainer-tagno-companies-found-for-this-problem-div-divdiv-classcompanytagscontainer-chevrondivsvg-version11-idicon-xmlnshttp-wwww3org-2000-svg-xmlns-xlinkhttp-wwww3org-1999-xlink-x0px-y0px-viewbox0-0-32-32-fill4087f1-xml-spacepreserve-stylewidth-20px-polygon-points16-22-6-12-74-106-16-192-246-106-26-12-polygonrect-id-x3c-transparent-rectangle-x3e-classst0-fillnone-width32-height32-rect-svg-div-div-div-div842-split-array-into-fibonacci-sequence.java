class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> list = new ArrayList<>();
        util(0,num,list);
        return list;
    }
    public boolean util(int ind,String s,List<Integer> list){
        if(s.length()==ind) return list.size()>2;
        
        int num=0;
        
        for(int i=ind;i<s.length();i++){
            num = (num*10)+(s.charAt(i)-'0');
            if(num<0) return false;
            
            if(list.size()<2 || list.get(list.size()-1)+list.get(list.size()-2)==num){
                 list.add(num);
                if(util(i+1,s,list)) return true;
                list.remove(list.size()-1);
            }
               if(i==ind && s.charAt(i)=='0') return false;
        }
               return false;
    }
}