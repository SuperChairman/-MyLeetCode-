package org.pipixia.exercise3.answer1;

import org.pipixia.exercise3.AbstractSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoxuwang on 2019/4/12.
 */
public class Solution implements AbstractSolution{

    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int sLength = array.length;
        int point1 = 0;
        int point2 = point1;
        int bigSize = 0;
        Map<String, Integer> filter = new HashMap<>();
        for(; point1<sLength; point1++){
            Integer index = filter.get(String.valueOf(array[point1]));
            if(null == index) filter.put(String.valueOf(array[point1]), point1);
            else{
                int tempSize = point1-point2;
                bigSize = bigSize>tempSize?bigSize:tempSize;
                point1=index;
                point2=point1+1;
                filter.clear();
            }
        }
        int tempSize = point1-point2;
        return bigSize>tempSize?bigSize:tempSize;
    }
}
