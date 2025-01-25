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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextt = curr;
        if(head==null)
            return head;
        while(nextt.next!=null){
            nextt = curr.next;
            curr.next=prev;
            prev=curr; 
            curr=nextt;
        }
        curr.next=prev;
        return nextt;
    }
}