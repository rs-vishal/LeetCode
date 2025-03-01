/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *dummy = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->next=head;
    struct ListNode *first=dummy;
    struct ListNode *secound=dummy;
    for(int i=0;i<=n;i++)
    {
        secound=secound->next;
    }
    while(secound!=NULL)
    {
        first=first->next;
        secound=secound->next;
    }
    struct ListNode *temp=first->next;
    first->next=temp->next;
    free(temp);

    return dummy->next;
    
}