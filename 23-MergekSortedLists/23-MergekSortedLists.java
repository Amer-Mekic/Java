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
    // Already did mergeTwoSortedLists problem, do that k times here.
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        for(int i = 1; i<lists.length;i++){
            lists[i]=mergeTwoLists(lists[i-1], lists[i]);
        }
        return lists[lists.length-1];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null && l2 != null)
            return l2;
        if(l1 != null && l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null)
            curr.next=l1;
        else if(l2!=null)
            curr.next=l2;
        return dummy.next;
    }
}