package me.sihan;

/**
 * Created by sihanwang on 2017/4/14.
 */
public class Linked30 {
    ListNode addNum(ListNode l1,ListNode l2){
        ListNode iter1 = l1, iter2 = l2;
        int carry = 0;
        ListNode list = null, tail = null;
        while(iter1 != null || iter2 != null || carry != 0){
            int num1 = iter1 == null ? 0 : iter1.val;
            int num2 = iter2 == null ? 0 : iter2.val;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            if (list == null){
                list = new ListNode(sum);
                tail = list;
            }else{
                tail.next = new ListNode(sum);
                tail = tail.next;
            }
            iter1 = iter1 == null ? null : iter1.next;
            iter2 = iter2 == null ? null : iter2.next;
        }

        return list;
    }
}
