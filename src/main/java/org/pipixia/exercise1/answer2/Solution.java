package org.pipixia.exercise1.answer2;

import org.pipixia.exercise1.AbstractSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoxuwang on 2019/3/29.
 */
public class Solution implements AbstractSolution{

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i=0; i<size; i++){
            Integer j = map.get(target - nums[i]);
            if(null != j){
                return new int[]{j, i};
            }
            if(null != map.get(nums[i])){
                continue;
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
