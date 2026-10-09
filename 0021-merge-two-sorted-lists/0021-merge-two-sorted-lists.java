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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                dummy.next = head1;
                head1 = head1.next;
            }
            else if(head1.val > head2.val){
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }
        if(head1 == null){
            dummy.next = head2;
        }
        else{
            dummy.next = head1;
        }

        return head.next;

    }
}