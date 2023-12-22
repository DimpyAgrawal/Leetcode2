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
    public ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {
        ListNode l1 = reverse(ll1);
        ListNode l2 = reverse(ll2);
        int c=0;
        ListNode ans = new ListNode();
        ListNode res = ans;
        
        while(l1!=null || l2!=null){
            int s =0;
            if(l1!=null){
                s+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2 = l2.next;
            }
            s+=c;
            ans.next = new ListNode(s%10);
            ans = ans.next;
            c = s/10;
            
            
        }
        if(c>0)
            ans.next = new ListNode(c);
    
        return reverse(res.next);
        
    }
    public static ListNode reverse(ListNode a){
        if(a==null) return a;
        ListNode slow = null;
        ListNode fast = a;
        ListNode fastest = a.next;
        while(fast!=null){
            fast.next = slow;
            slow = fast;
            fast = fastest;
            if(fastest!=null) fastest = fastest.next;
        }
        return slow;
    }
}