package me.sihan;

/**
 * Created by sihanwang on 2017/4/14.
 */
public class Linked32 {
    ListNode delDup(ListNode l1){
        if (l1 == null){
            return l1;
        }
        ListNode pre = l1;
        ListNode cur = pre.next;
        while(cur != null){
            if (cur.val != pre.val)
                pre = pre.next;
            cur = cur.next;
            pre.next = cur;
        }
        return pre;
    }

}
