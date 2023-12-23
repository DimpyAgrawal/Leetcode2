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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int bucketsofnodes = n/k;
        int extranodes = n%k;
        ListNode curr=head;
        ListNode prev=null;
        ListNode[] arr = new ListNode[k];
        
        for(int i=0;i<k&&curr!=null;i++){
            arr[i]=curr;
            for(int count=1;count<=bucketsofnodes + (extranodes>0?1:0)&&curr!=null;count++){
                prev=curr;
                curr=curr.next;
            }
            prev.next = null;
            extranodes--;
            
        }
        return arr;
    }
    
}