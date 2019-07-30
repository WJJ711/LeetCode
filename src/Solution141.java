import java.util.HashMap;

//Definition for singly-linked list.
/*
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/

/**
 * 法一，hash法
 */
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        while (head!=null){
            Integer integer = map.get(head);
            if(integer!=null){
                return true;
            }else{
                integer=1;
            }
            map.put(head,integer);
            head=head.next;
        }
        return false;
    }
}*/

/**
 * 法二，快慢指针法
 */
/*
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
*/
