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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        
        // finding middle of the limkedlist
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reversing the second half of the list
        
        ListNode newNode = reverseList(slow.next);
        
        slow.next = null;
        //merging both list
            //first half list 
            ListNode curr = head;
            ListNode dummy = newNode;
            while(head!=null && dummy!=null){
                ListNode temp = curr.next;
                ListNode temp2 = dummy.next;
                curr.next = dummy;
                dummy.next = temp;
                
                curr = temp;
                dummy = temp2;
            }
        
        
        
        
    }
    //reversing the linkedlist
   
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
        ListNode nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    }

    return prev; // 'prev' will be the new head after reversal
}

}