/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 int getLength(struct ListNode* head) {
    int length = 0;
    while (head != NULL) {
        length++;
        head = head->next;
    }
    return length;
}
struct ListNode* swapNodes(struct ListNode* head, int k) {
    int n = getLength(head);
    int frontindex = k-1;
    int backindex = n-k;

    struct ListNode* frontnode = head;
    struct ListNode* backnode = head;

    for(int i=0;i<frontindex ;i++){
        frontnode = frontnode->next;
    }

    for(int i=0;i<backindex ;i++){
        backnode = backnode->next;
    }

    int temp = frontnode->val;
    frontnode->val = backnode->val;
    backnode->val = temp; 

    return head;

}