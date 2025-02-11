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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode curr = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null){ // if even # of nodes move slow & fast
        // to split list evenly
            fast=fast.next;
            slow=slow.next;
        }
        ListNode prev = null;
        ListNode nextt = slow;
        ListNode cur = slow;
        while(cur!=fast){ // reverse 2nd half of list
            nextt = cur.next;
            cur.next = prev;
            prev=cur;
            cur=nextt;
        }
        cur.next=prev;
        while(cur.next!=null){ // while 2nd half has more nodes
            nextt = cur.next; // keep reference to nodes after last
            prev=curr.next;// keep reference to nodes after first
            curr.next = cur;// connect first to last
            curr=prev;// move to next in 1st half of list
            cur.next=prev;// connect last from 2nd half to this
            cur=nextt; // move to next node in 2nd half
        }
    }
}