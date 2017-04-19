package me.sihan;

/**
 * Created by sihanwang on 2017/4/12.
 */
public class Linked27 {
    int detectRotate(ListNode head){
       ListNode slow = head;
       if (slow == null || slow.next == null)
           return 0;
       ListNode fast = slow.next.next;

       while (fast != null && fast.next != null){
           if (slow == fast)
               return getLength(slow);
           slow = slow.next;
           fast = fast.next.next;
       }
       return 0;
    }

    int getLength(ListNode head){
        ListNode slow = head;
        int length = 1;
        while(slow != head){
            length++;
            slow = slow.next;
        }
        return length;
    }
}
