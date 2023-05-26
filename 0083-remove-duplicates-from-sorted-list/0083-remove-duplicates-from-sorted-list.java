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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode a= head;
        while(a.next!=null){
            if(a.val==a.next.val){
                a.next=a.next.next;
            
            }
            else{
                a=a.next;
            }
        }
        return head;
    }
}