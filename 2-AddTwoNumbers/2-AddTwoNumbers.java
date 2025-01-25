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
 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;

        // Use BigInteger for large numbers
        BigInteger nr1 = BigInteger.ZERO;
        BigInteger nr2 = BigInteger.ZERO;
        BigInteger i = BigInteger.ONE;
        BigInteger j = BigInteger.ONE;

        // Build the first number from the list
        while (a != null) {
            nr1 = nr1.add(BigInteger.valueOf(a.val).multiply(i));
            i = i.multiply(BigInteger.TEN);
            a = a.next;
        }

        // Build the second number from the list
        while (b != null) {
            nr2 = nr2.add(BigInteger.valueOf(b.val).multiply(j));
            j = j.multiply(BigInteger.TEN);
            b = b.next;
        }

        // Calculate the sum of the two numbers
        BigInteger sum = nr1.add(nr2);

        // Create a dummy node for the result
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        // Handle the sum digit by digit
        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0); // Special case for sum = 0
        }

        while (!sum.equals(BigInteger.ZERO)) {
            // Extract the last digit
            int digit = sum.mod(BigInteger.TEN).intValue();

            // Create a new node for the digit
            ListNode nn = new ListNode(digit);
            prev.next = nn;
            prev = nn;

            // Remove the last digit from sum
            sum = sum.divide(BigInteger.TEN);
        }

        // Return the resulting linked list
        return dummy.next;
    }
}