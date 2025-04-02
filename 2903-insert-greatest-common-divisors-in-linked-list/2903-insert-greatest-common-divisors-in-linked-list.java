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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null && temp != null){
            int cur = temp.val;
            int next = temp.next.val;
            int gcd = gcd(cur,next);
            ListNode pre = temp.next.next;
            insert(temp,gcd);
            temp= temp.next.next;
        }
        return head;
    }
    public void insert( ListNode head,int gcd){
        ListNode newnode = new ListNode(gcd);
        newnode.next = head.next;
        head.next = newnode;
        
    }
    public int gcd(int a,int b){
   if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}