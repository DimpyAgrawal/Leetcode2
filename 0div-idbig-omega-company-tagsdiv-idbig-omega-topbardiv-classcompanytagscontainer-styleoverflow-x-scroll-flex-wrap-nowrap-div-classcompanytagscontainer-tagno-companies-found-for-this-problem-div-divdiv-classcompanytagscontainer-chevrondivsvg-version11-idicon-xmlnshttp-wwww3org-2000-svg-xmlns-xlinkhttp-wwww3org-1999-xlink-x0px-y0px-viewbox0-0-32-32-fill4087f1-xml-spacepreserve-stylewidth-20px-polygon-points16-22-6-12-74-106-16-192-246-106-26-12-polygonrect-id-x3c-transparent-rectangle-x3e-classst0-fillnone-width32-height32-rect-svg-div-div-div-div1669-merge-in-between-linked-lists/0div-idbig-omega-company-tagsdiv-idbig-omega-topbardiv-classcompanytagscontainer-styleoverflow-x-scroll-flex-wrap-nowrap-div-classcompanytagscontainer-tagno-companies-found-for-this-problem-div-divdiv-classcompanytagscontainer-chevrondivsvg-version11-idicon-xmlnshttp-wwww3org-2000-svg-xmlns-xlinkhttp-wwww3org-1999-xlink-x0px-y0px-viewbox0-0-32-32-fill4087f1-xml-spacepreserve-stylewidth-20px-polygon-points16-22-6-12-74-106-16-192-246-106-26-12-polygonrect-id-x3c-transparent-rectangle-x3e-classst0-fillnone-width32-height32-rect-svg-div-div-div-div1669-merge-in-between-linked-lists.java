class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currNode = list1;
        int c=0;
        while(c<a-1){
            currNode = currNode.next;
            c++;
        }
        ListNode front  = currNode;
        while(c<b+1){
            currNode = currNode.next;
            c++;
        }
        ListNode rear = currNode;
        ListNode list2head = list2;
        ListNode list2tail = list2;
        while(list2tail.next!=null){
            list2tail = list2tail.next;
        }
        front.next = list2head;
        list2tail.next = rear;

        return list1;
        
    }
}