package problems.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public TwoSums() {
    }
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    //brute force
    //Time: O(n²) as we have two loops one insider other
    public int[] brutalForce(int[] nums, int target) {
        int listSize = nums.length;
        for (int i = 0; i < listSize; i++) {
            for (int j = listSize - 1; j > i; j--) {
                var fistValue = nums[i];
                var lastValue = nums[j];
                if(fistValue + lastValue == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    //One-pass Hash Table
    // O(n)
    public int[] OnePassHash(int[] nums, int target) {
        // cur + x = target
        // x = target - cur
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
