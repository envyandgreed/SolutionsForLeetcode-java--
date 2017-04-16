package me.sihan;

/**
 * Created by sihanwang on 2017/4/11.
 */
public class Linked26 {
    ListNode theWay(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }

        if (l1 != null){
            cur.next = l1;
        }else if (l2 != null){
            cur.next = l2;
        }

        //why?
        return dummy.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}