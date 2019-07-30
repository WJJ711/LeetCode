/**
 * Definition for singly-linked list.
 */
/*class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}*/
/**
 * 使用递归
 */
/*public class Solution21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //递归头
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if (l1.val<l2.val){
           l1.next=mergeTwoLists(l1.next,l2);
           return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}*/

/**
 * 法二，使用头结点，迭代
 */

/*class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode pre=head;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }else{
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        pre.next=l1==null?l2:l1;
        return head.next;
    }
}*/
/**
 * 法一，不使用头结点，迭代
 */
/*
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val>l2.val){
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode pre = l1, p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                pre = p1;
                p1 = p1.next;
            } else {
                pre.next = p2;
                pre = p2;
                p2 = p2.next;
                pre.next = p1;
            }
        }
        if (pre != null) {

            pre.next = p1 == null ? p2 : p1;
        }

        return l1;
    }
}*/
