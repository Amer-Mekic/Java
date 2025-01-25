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
    public ListNode mergeTwoLists(ListNode f, ListNode l) {
    if (f == null) return l;
    if (l == null) return f;
    ListNode dummy = new ListNode();
    ListNode current = dummy;
    while (f != null && l != null) {
        if (f.val <= l.val) {
            current.next = f;
            f = f.next;
        } else {
            current.next = l;
            l = l.next;
        }
        current = current.next;
    }
    if (f != null) {
        current.next = f;
    } else {
        current.next = l;
    }

    return dummy.next;
}
}