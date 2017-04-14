package me.sihan;

/**
 * Created by sihanwang on 2017/4/12.
 */
public class Linked28 {
    ListNode reverseLink(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head.next;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = next;
        }
        return dummy.next;
    }
}


