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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode slow = null;
        ListNode fast = head;
        ListNode fastest = fast.next;
        while(fast!=null){
            fast.next = slow;
            slow = fast;
            fast = fastest;
            if(fastest!=null) fastest = fastest.next;

        }
        return slow;
    }
}