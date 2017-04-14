package me.sihan;

import java.util.List;

/**
 * Created by sihanwang on 2017/4/14.
 */
public class Linked322 {
    ListNode delDup2(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = head;
        slow.next = fast;

        while (fast != null){
            while(fast.val == fast.next.val && fast.next != null){
                fast = fast.next;
            }
            if (slow.next != fast){
                slow.next = fast.next;
                fast = fast.next;
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
