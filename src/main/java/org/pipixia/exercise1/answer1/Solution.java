package org.pipixia.exercise1.answer1;

import org.pipixia.exercise1.AbstractSolution;

/**
 * Created by xiaoxuwang on 2019/3/29.
 */
public class Solution implements AbstractSolution{

    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i=0; i<size; i++){
            int result = target - nums[i];
            for(int j=i+1; j<size; j++){
                if(result == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
