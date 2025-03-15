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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k<2) return head;
        ListNode last =null;
        ListNode output = reverseNextk(head,k);
        if(output==head) return head;
        last = head;
        while(true){
            head = last.next;
            if (head == null) {
                return output;
            } else {
                last.next = reverseNextk(head, k);
                if (last.next == head) {
                    return output;
                }
                last = head;
            }
        }
    }
    public ListNode reverseNextk(ListNode head, int k ){
        ListNode currenthead= head;
        for(int i=0;i<k-1;i++){
            if(head.next != null){
                ListNode temp = head.next;
                head.next = temp.next;
                temp.next = currenthead;
                currenthead = temp;
            }
            else{
                return reverseNextk(currenthead,i+1);
            }
        }
        return currenthead;
    }
}