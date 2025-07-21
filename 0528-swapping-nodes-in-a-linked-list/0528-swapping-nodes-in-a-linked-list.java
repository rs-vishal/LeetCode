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
    public ListNode swapNodes(ListNode head, int k) {
         int n = getLength(head);
        int frontIndex = k - 1;
        int backIndex = n - k;
        
        ListNode frontNode = head;
        ListNode backNode = head;
        
        for (int i = 0; i < frontIndex; i++) {
            frontNode = frontNode.next;
        }
        
        for (int i = 0; i < backIndex; i++) {
            backNode = backNode.next;
        }
        
        int temp = frontNode.val;
        frontNode.val = backNode.val;
        backNode.val = temp;
        
        return head;
    }
    public static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}