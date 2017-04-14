package me.sihan;

/**
 * Created by sihanwang on 2017/4/14.
 */
public class Linked31 {
    ListNode partLink(ListNode head, int x){
        ListNode dummy = new ListNode(0);
        ListNode pivot = new ListNode(x);
        ListNode first = dummy,second = pivot, cur = head;

        while(cur != null){
            ListNode next = cur.next;
            if (cur.val < x){
                first.next = cur;
                first = cur;
            }else{
                second.next = cur;
                second = cur;
                second.next = null;
            }
            cur = next;
        }

        first.next = pivot.next;
        return dummy.next;
    }
}
