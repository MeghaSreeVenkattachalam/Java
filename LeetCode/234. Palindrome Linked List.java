Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


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
    public boolean isPalindrome(ListNode head) {
        //Copy of the original list
         if (head == null || head.next == null) return true;
        ListNode dup = new ListNode(head.val);
        ListNode old = head.next;
        ListNode new1 = dup;
        while(old!=null){
            new1.next = new ListNode(old.val);
            old = old.next;
            new1 = new1.next;
        }
        
        //Reverse of the original list
        ListNode temp = head;
        ListNode next = null;
        ListNode prev = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        //Comparison
        ListNode l1 = head;
        ListNode l2 = dup;
        while(l1!=null && l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}

OUTPUT:

Runtime
6
ms
Beats
47.77%
