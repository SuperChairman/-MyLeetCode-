package org.pipixia.exercise2.answer1;

import org.pipixia.exercise2.AbstractSolution;
import org.pipixia.exercise2.ListNode;

/**
 * Created by xiaoxuwang on 2019/4/12.
 */
public class Solution implements AbstractSolution{

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flagl1 = null!=l1;
        boolean flagl2 = null!=l2;
        int rem = 0;
        ListNode result = new ListNode(-1);
        ListNode point = result;
        while(flagl1||flagl2||rem>0){
            int curl1 = 0;
            int curl2 = 0;
            if(flagl1){
                curl1 = l1.val;
                l1 = l1.next;
                flagl1 = null!=l1;
            }
            if(flagl2){
                curl2 = l2.val;
                l2 = l2.next;
                flagl2 = null!=l2;
            }
            int total = curl1 + curl2 + rem;
            rem = total/10;
            point.next = new ListNode(total%10);
            point = point.next;
        }
        return result.next;
    }
}
