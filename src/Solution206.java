import java.util.List;

//Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/

/**
 * 递归
 */
/*
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode listNode = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return listNode;
    }
}
*/

/**
 * 迭代
 */
/*
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}*/
