package org.pipixia.exercise1;

import java.util.Arrays;

/**
 * Created by xiaoxuwang on 2019/3/29.
 */
public class TestMain {

    public static void main(String[] args){
        AbstractSolution solution = new org.pipixia.exercise1.answer1.Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,3,4,7,12,12,45,13,6}, 18)));
        solution = new org.pipixia.exercise1.answer2.Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,3,4,7,12,12,45,13,6}, 18)));
    }

}
