/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        Boolean isCycle = false;
        ListNode hare = head; 
        ListNode turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                isCycle = true;
                break;
            }
        }

        if(isCycle){
            ListNode extra = head;
            while(extra != turtle){
                extra = extra.next;
                turtle = turtle.next;
            }

            return extra;
        }
        else{
            return null;
        }
    }
}