package me.sihan;

/**
 * Created by sihanwang on 2017/4/12.
 */
public class Linked282 {
    ListNode reserveNode(ListNode head,int m,int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode mNode = new ListNode(0);
        ListNode cur = head;
        ListNode pre = dummy,next;
        for (int i = 0; i < n; i++) {
            if (i == m){
                mNode = cur;
            }
            if (i < m){
                pre = pre.next;
            }
            next = cur.next;
            if (i > m && i <= n){
                mNode.next = next;
                cur.next = pre.next;
                pre.next = cur;
            }
            cur = next;
        }

        return dummy.next;
    }
}
