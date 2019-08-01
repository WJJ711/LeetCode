import java.util.List;

//Definition for singly-linked list.
/*
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

*/
/**
 * 反转前半部分,中点开始往两边对比，不一样则返回
 *//*

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=null,pre=null;
       while (fast!=null&&fast.next!=null){
           p=slow;
           slow=slow.next;
           fast=fast.next.next;
           p.next=pre;
           pre=p;
       }
       if(fast!=null){
           slow=slow.next;
       }
       while (slow!=null&&p!=null){
           if(p.val!=slow.val){
               return false;
           }
           p=p.next;
           slow=slow.next;
       }
       return true;
    }
}*/
