class Solution {
 static String[] key ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
       List<String> list=new LinkedList<String>();
        if(digits.length()==0) return list;    
       fun(list,digits,"");        
        return list;
        
    }
    public static void fun(List<String> list,String ques, String ans){
        
        if(ques.length()==0){
            list.add(ans);
            return;
        }
        
        char ch=ques.charAt(0);
        String press=key[ch -'0'];
        
        for(int i=0;i<press.length();i++){
            fun(list,ques.substring(1),ans+press.charAt(i));
        }
        
    }
}

