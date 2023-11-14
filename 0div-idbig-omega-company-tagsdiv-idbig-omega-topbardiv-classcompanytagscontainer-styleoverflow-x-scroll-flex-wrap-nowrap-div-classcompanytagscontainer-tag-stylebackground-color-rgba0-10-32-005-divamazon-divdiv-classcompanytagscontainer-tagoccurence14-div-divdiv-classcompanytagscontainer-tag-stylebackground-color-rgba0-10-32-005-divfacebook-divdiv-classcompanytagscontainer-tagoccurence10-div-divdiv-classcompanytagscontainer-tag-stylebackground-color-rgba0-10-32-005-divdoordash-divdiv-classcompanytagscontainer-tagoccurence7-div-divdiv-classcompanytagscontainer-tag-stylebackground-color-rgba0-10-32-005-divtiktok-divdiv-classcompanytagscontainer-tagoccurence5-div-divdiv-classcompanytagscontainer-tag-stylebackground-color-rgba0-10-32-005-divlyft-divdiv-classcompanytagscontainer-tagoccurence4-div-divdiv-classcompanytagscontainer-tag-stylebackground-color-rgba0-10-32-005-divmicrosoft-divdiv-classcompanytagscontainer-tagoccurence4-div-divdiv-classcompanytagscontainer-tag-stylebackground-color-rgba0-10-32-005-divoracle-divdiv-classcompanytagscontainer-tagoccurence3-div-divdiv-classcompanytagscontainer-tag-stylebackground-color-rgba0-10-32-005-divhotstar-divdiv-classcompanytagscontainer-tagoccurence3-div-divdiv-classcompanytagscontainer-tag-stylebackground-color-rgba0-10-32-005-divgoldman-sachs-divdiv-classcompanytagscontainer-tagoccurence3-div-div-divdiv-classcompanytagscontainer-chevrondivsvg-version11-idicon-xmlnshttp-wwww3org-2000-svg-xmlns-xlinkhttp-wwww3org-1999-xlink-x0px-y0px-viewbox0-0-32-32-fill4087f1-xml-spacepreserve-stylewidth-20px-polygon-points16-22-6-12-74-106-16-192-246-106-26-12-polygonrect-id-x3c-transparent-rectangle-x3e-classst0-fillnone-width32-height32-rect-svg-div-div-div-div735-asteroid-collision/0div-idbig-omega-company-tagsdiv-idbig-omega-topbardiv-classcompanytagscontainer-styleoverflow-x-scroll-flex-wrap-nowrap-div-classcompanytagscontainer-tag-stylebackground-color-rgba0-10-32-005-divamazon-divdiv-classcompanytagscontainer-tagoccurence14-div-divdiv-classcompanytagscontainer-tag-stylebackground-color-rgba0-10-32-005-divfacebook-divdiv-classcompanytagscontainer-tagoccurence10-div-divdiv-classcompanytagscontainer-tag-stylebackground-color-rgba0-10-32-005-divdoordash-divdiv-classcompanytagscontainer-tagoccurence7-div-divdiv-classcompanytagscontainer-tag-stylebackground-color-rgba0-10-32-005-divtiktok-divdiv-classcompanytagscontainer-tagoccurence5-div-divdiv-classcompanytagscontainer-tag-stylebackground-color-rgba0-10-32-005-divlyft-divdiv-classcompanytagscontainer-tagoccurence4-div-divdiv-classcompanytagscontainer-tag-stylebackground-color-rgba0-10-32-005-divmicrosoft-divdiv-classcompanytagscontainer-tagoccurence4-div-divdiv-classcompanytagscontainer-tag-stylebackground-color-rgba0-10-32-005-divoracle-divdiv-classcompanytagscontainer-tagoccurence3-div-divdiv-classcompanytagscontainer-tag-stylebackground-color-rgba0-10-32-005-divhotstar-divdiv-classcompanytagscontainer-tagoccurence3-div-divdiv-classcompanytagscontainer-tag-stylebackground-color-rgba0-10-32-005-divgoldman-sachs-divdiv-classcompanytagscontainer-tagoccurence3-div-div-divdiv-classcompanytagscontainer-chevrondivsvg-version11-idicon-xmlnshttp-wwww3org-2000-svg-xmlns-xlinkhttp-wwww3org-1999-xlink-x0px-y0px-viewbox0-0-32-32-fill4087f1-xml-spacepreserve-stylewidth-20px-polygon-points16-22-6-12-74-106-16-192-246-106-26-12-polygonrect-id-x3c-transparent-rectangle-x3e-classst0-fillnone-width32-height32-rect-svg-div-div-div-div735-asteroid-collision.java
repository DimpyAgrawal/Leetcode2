// class Solution {
//     public int[] asteroidCollision(int[] as) {
//         Stack<Integer> st  =  new Stack<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<as.length;i++){
//             st.push(as[i]);            
//         }
//         while(!st.isEmpty()){
//             int ele = st.pop();
//             int ele2  = st.peek();
//             if(ele>0 && ele2 >0 || ele<0 && ele2<0){
//                 list.add(ele);
//             } 
//             else {
//                 int a = Math.abs(ele);
//                 int b = Math.abs(ele2);
//                 if(ele==ele2) st.pop();
//                 else{
//                     if(ele>ele2){
//                         st.pop();
//                         st.push(ele);
//                     }
                    
//                 }
//             }
//         }
        
        
//         while(!st.isEmpty()){
//             list.add(st.pop());
//         }
        
//          Collections.reverse(list);

//         // Convert the list to an array
//         int[] result = list.stream().mapToInt(Integer::intValue).toArray();

//         return result;
//     }
// }


import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < as.length; i++) {
            int ele = as[i];

            if (st.isEmpty() || ele > 0) {
                st.push(ele);
            } else {
                while (!st.isEmpty() && st.peek() > 0) {
                    int prev = st.pop();
                    if (prev == Math.abs(ele)) {
                        ele = 0;  // Both asteroids annihilate each other
                        break;
                    } else if (prev > Math.abs(ele)) {
                        st.push(prev);  // The current asteroid is destroyed
                        ele = 0;
                        break;
                    }
                }
                if (ele != 0) {
                    st.push(ele);
                }
            }
        }

        // Convert the stack to an array list
        while (!st.isEmpty()) {
            list.add(st.pop());
        }

        // Reverse the list to maintain the correct order
        Collections.reverse(list);

        // Convert the list to an array
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
