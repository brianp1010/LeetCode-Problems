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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //intiialize current node to dummy head.
        ListNode dummyhead = new ListNode(0);
        ListNode curr = dummyhead;
        ListNode p = l1, q = l2;    
        
        //initialize the carry to 0
        int carry = 0;
        
        //loop through lists l1 and l2 until you reach null
        while(p != null || q != null)
        {
            //set x to node p's value. If p has reached the end of l1 set to 0
            int x = (p != null) ? p.val : 0;
            //set y to node q's value. If p has reached the end of l2 set to 0
            int y = (q != null) ? q.val : 0;
            //set sum = x + y + carry
            int sum = x + y + carry;
            //update carry = sum/10
            carry = sum/10;
            //Create a new node with the digit value of (sum mod 10) and set it to current node's next, then advance current node to next.
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            //advance both p and q
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        
        }
        
        //check if carry = 1, if so append a new node with digit 1 to the returning list.
        if( carry > 0 )
        {
            curr.next = new ListNode(carry);
        }
        //return dummyhead's next node
        return dummyhead.next;
        
    }
}