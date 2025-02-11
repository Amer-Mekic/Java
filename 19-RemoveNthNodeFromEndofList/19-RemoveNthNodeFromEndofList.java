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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        if(len==1 && n==1){
            head=null;
            return head;
        }
        int place = 0;
        curr = head;
        ListNode prev = null;
        if((len-n)==0){
            head=head.next;
            return head;
        }
        while(place<(len-n)){
            prev=curr;
            curr=curr.next;
            place++;
        }
        prev.next=curr.next;
        return head;
    }
}