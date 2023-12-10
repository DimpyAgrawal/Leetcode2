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
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null) return head;
        ListNode l = head;
        int n=0;
        while(l!=null){
            n++;
            l = l.next;
        }
        k = k%n;
        
        
        if(k==0 || n==0 || n==1 || k==n) return head;
        n = n-k-1;
         l = head;
        
        for(int i=0;i<n;i++){
            l = l.next;
            
        }
        
        ListNode j = l.next;
        ListNode o = l.next;
        l.next = null;
        k--;
        while(k-->0 && j.next!=null){
            j = j.next;
            
        }
        j.next = head;
        return o;
    }
}