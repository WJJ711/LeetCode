
// Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}*/
/**
 * 迭代，不设置头结点
 */
/*
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode p = head;
        while (head != null && head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return p;
    }
}*/

/**
 * 递归
 */
/*
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        head.next=removeElements(head.next,val);
        if(head.val==val){
            return head.next;
        }else{
            return head;
        }
    }
}*/
