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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode l = head;
        int n=0;
        while(l!=null){
            l=l.next;
            n++;
            
        }
        
        k = k%n;
        
        for(int i=0;i<k;i++){
            ListNode dum = head;
            ListNode prev= null;
            while(dum.next!=null){
                prev= dum;
                dum = dum.next;
            }
            if(prev!=null){
                prev.next = null;
                dum.next = head;
                head = dum;
            }
        }
        return head;
        
    }
}