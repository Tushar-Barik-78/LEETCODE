/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int m = 0,n=0;
        while(temp1 != null){
            m++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            n++;
            temp2 = temp2.next;
        }

        ListNode t1 = headA;
        ListNode t2 = headB;

        if(m>n){
            for(int i=1;i<=(m-n);i++){
                t1 = t1.next;
            }
        }else{
            for(int i=1;i<=(n-m);i++){
                t2 = t2.next;
            }
        }

        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;


    }
}