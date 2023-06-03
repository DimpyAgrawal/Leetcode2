/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        
        ListNode temp=head;
        HashSet<Integer> map=new HashSet();
        
             for(int i=0;i<nums.length;i++){
                 
                 map.add(nums[i]);
             }
        
        int connect=0;
        int count=0;
        
    while(temp!=null){
     
            if(map.contains(temp.val)) connect++;
            else if(connect>0){   //it is break point where val is not found int the map so for new start it has to be 0.
                connect=0;
                count++;
            }
            temp=temp.next;
        
    }
        if(connect==0) return count;
        return count+1;
            
    }
}