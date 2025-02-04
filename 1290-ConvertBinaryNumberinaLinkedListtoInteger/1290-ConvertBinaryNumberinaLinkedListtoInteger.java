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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> bin = new ArrayList<>();
        ListNode curr = head;
        int dec = 0;
        while(curr!=null){
            bin.add(curr.val);
            curr = curr.next;
        }
        int exp = 0;
        for(int i = bin.size()-1;i>=0;i--){
            dec+=bin.get(i)*Math.pow(2, exp++);
        }
        return dec;
    }
}