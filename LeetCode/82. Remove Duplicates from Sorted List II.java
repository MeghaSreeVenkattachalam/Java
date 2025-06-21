Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        ListNode temp = head;
        while(temp!=null){
            if(temp.next!=null && temp.val == temp.next.val){
                int duplicate = temp.val;
                while(temp!=null && temp.val == duplicate){
                    temp = temp.next;
                }
                //result.next = new ListNode(temp.val);
            }else{
                result.next = temp;
                result = result.next;
                temp = temp.next;
                result.next = null;
            }
        }
        return dummy.next;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
