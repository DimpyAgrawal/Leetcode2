class Solution {
    public boolean checkStrings(String s1, String s2) {
//         char[] arr = s1.toCharArray();
//         char[] arr2 = s2.toCharArray();
//         int n= s1.length();
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i<j && ((j-i)%2==0) && arr[i]!=arr2[i]){
//                     char temp = arr[i];
//                     arr[i] =arr[j];
//                     arr[j] =temp;
                    
//                 }
//             }
//         }
        
//         String modifieds1 = new String(arr);
//         if(modifieds1.compareTo(s2)==0) return true;
//         return false;
     
       
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();
        List<Character> list4 = new ArrayList<>();
        
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                list1.add(s1.charAt(i));
                list3.add(s2.charAt(i));
            }
            else{
                list2.add(s1.charAt(i));
                list4.add(s2.charAt(i));
            }
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);
        
        for(int i=0;i<list1.size();i++){
            if(list1.get(i) != list3.get(i)){
                return false;
            }
        }
        
        for(int i = 0; i<list2.size();i++){
            if(list2.get(i) != list4.get(i)){
                return false;
            }
        }
        
        return true; 
        
    }
}





