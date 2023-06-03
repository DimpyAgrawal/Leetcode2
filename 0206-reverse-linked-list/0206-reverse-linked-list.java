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
//         ListNode curr=head;
//          ListNode prev=null;
//         while(curr!=null){
//              ListNode ahead=curr.next;
//             curr.next=prev;
//              prev=curr;
//              curr=ahead;
           
//         }
//         return prev;
        
        
        
        if(head==null){
            return head;
        }
        ListNode slow = null;
        ListNode fast = head;
        ListNode fastest = head.next;
        
        while(fast != null){
            fast.next = slow;
            slow = fast;
            fast = fastest;
            if(fastest != null){
                fastest = fastest.next;
            }
        }
        return slow;
    }
}