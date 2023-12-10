
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head; // Return head for empty or single-node list
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = dummy;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current = current.next; // Skip duplicates
            }

            if (prev.next == current) {
                prev = prev.next; // Move prev only if no duplicate is found
            } else {
                prev.next = current.next; // Skip the duplicates
            }
            current = current.next; // Move to the next node
        }
        
        return dummy.next;
    }
}
