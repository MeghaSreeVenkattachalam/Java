You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); //creating a dummy linkedlist with initial value as 0
        ListNode temp = dummy; // we shouldn't directly give the dummy because as it only changes in the head itself 
        //doesn't moves or tracks 
        //the temp which points to the last node so don't use the head directly 
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next = list1; //adding value to the dummy at last
                list1 = list1.next; //moving the pointer in the list1
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next; //moving the temp as well because you are adding the values at the last of the temp right
        }
        temp.next = (list1!=null)?list1:list2; // this reassure because if the both list length isn't same means there remains some values which might not be traversed
        return dummy.next;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
