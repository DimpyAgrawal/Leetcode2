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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp =head;
        for(int i=0;i<k;i++){
            if(temp==null) return head;
            temp = temp.next;
        }
        
      ListNode sp =  reverseKGroup(temp,k);
    
       
        ListNode slow = null;
        ListNode fast = head;
        ListNode fastest = head.next;
      
        for(int i=0;i<k;i++){
            fast.next =slow;
            slow = fast;
            fast = fastest;
            
            if(fastest!=null){
                fastest = fastest.next;
            }
        }
        head.next=sp;
        return slow;
        
    }
}