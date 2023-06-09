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
       
        
        ListNode l1=new ListNode(0);
        ListNode l2= new ListNode(0);
        
        ListNode ans=l1;
        ListNode ans2=l2;
        
        
        while(head!=null){
            if(head.val<x){
                ans.next=head;
                    ans=ans.next;
                
            }
            else{
                ans2.next=head;
                ans2=ans2.next;
            }
            head=head.next;
        }
       
        ans2.next=null;
        ans.next=l2.next;
        
        return l1.next;
        
        

        
    
    }
}