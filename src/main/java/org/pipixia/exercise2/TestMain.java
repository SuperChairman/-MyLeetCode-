package org.pipixia.exercise2;

/**
 * Created by xiaoxuwang on 2019/3/29.
 */
public class TestMain {

    public static void main(String[] args){
        int l1[] = {2};
        int l2[] = {9,6,4};
        ListNode ln1 = new ListNode(-1);
        ListNode point = ln1;
        for(int i=0; i<l1.length; i++){
            point.next = new ListNode(l1[i]);
            point = point.next;
        }
        ListNode ln2 = new ListNode(-1);
        point = ln2;
        for(int i=0; i<l2.length; i++){
            point.next = new ListNode(l2[i]);
            point = point.next;
        }
        AbstractSolution solution = new org.pipixia.exercise2.answer1.Solution();
        ListNode result = solution.addTwoNumbers(ln1.next, ln2.next);
        while(null!=result){
            System.out.print(result.val);
            result = result.next;
            if(null!=result){
                System.out.print(" -> ");
            }
        }
    }

}
