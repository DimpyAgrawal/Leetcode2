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
    public ListNode removeNthFromEnd(ListNode head, int n) {  
        
        ListNode dummy=head;
        ListNode temp=head;
        if(head==null) return null;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        
        for(int i=1;i<c-n;i++){
            dummy=dummy.next;
        }
        
        if(c==n)
            return head.next;
        if(dummy.next!=null){
            dummy.next=dummy.next.next;
        }
        else{
            dummy.next=null;
        }
        
        return head;
    }
  
}
