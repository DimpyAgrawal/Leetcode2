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
    public ListNode partition(ListNode head, int x) {
        ListNode firsthead = new ListNode(0);
        ListNode first = firsthead;
        ListNode secondhead  = new ListNode(0);
        ListNode second = secondhead;
        
        ListNode curr = head;
        
        while(curr!=null){
            if(curr.val<x){
                first.next = curr;
            first = first.next;
            }
            else {
                
                second.next  = curr;
               second = second.next;
            }
             curr = curr.next;
        }
        second.next =null;
            first.next = secondhead.next;
       
        return firsthead.next;
    }
}