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

    static ListNode reverseLL(ListNode head){
        ListNode p = null;
        ListNode c = head;
        ListNode n = head.next;
           while(n != null){
            c.next = p;
            p = c;
            c = n;
            n = n.next;
        }
        c.next = p;
        return c;
    }
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        // Find the Left Mid Node 
        while(f.next.next != null){
            s = s.next;
            f = f.next.next;
        }

        ListNode t1 = head;
        ListNode t2 = reverseLL(s.next);

        int max = Integer.MIN_VALUE;
        while(t1 != null && t2!=null){
            max = Math.max(max,(t1.val+t2.val));
            t1 = t1.next;
            t2 = t2.next;

        }

        return max;
    }
}