
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre = head, p = head.next;
        while (p != null) {
            if (pre.val == p.val) {
                pre.next = p.next;
                p=p.next;
            }else{

                pre=p;
                p = p.next;
            }
        }
        return head;
    }
}