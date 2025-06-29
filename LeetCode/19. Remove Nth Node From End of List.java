Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 



CODE:

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
        ListNode temp = head;
        ListNode nxt = null;
        ListNode prev = null;
        while(temp!=null){
            nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        head = prev;
        ListNode rev = head;
        if(n==1){
            head = head.next;
        }else{
        for(int i=1;i<n-1;i++){
            rev = rev.next;
        }
        rev.next = rev.next.next;
        }

        temp = head;
        prev = null;
        while(temp!=null){
            nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        head = prev;


        return head;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
