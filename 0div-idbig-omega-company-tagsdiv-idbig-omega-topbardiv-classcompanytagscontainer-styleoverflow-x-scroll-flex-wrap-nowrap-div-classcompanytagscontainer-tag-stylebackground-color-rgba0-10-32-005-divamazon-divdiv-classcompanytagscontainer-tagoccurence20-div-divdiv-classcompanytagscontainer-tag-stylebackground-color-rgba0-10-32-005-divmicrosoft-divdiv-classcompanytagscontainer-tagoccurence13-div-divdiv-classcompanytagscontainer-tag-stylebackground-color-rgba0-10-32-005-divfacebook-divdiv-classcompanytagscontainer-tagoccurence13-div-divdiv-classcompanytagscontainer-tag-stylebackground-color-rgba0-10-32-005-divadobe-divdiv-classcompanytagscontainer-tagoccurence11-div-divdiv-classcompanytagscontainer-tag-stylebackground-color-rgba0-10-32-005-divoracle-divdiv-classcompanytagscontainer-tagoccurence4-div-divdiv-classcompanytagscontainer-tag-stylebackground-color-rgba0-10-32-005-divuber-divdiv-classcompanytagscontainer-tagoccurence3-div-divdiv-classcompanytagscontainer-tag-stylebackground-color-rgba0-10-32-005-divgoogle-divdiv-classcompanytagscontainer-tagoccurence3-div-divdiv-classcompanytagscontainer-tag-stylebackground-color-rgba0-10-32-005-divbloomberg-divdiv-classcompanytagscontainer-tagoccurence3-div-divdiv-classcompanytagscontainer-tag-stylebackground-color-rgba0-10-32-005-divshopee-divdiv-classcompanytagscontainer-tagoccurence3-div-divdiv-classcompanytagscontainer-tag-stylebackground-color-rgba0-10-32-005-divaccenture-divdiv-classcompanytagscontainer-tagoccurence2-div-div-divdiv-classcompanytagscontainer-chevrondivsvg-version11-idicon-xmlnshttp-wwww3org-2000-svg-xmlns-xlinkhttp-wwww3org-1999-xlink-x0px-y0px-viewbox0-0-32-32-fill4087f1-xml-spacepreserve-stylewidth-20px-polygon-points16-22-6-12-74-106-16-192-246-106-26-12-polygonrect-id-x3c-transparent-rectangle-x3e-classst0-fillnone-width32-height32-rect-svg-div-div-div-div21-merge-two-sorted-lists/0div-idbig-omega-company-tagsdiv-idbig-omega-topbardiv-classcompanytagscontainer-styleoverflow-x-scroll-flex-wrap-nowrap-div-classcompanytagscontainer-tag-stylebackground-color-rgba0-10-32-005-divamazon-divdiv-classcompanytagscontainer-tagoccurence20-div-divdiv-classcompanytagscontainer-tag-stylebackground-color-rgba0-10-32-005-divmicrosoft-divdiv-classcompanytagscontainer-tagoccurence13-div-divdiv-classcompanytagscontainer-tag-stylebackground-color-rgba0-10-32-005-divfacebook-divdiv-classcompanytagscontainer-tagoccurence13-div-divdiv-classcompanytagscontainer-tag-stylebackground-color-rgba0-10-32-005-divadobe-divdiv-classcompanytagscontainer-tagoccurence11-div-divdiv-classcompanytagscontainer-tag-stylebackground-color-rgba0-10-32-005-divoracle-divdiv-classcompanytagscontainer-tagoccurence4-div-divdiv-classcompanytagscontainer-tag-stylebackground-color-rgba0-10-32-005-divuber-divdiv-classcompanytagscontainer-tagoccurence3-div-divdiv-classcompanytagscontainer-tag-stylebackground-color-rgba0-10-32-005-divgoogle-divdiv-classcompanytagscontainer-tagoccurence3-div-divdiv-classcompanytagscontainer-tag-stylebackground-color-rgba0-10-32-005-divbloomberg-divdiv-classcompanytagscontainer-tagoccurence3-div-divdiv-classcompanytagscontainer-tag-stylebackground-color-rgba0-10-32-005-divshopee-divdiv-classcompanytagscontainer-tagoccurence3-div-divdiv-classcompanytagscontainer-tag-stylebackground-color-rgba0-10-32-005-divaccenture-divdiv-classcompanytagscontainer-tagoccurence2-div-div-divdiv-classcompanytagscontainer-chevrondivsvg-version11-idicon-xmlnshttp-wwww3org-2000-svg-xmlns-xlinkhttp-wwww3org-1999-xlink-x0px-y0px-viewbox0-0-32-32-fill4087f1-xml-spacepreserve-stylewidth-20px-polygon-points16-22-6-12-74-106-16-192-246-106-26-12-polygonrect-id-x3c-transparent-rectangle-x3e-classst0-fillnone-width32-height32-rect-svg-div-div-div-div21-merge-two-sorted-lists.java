class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;

        ListNode dummy = new ListNode(); // dummy node to build the merged list
        ListNode temp = dummy; // pointer to the dummy node

        while (i != null && j != null) {
            if (i.val < j.val) {
                dummy.next = i;
                i = i.next;
            } else {
                dummy.next = j;
                j = j.next;
            }
            dummy = dummy.next; // move the dummy pointer forward
        }

        // Add remaining nodes if any from list1 or list2
        if (i != null) {
            dummy.next = i;
        } else {
            dummy.next = j;
        }

        return temp.next; // return the merged list starting from the next of the dummy node
    }
}
