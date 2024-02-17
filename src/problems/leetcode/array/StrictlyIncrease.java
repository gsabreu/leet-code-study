package problems.leetcode.array;

import java.util.HashMap;

public class StrictlyIncrease {

    public StrictlyIncrease() {
    }
    //[1,2,10,5,7] -> true ok
    //[2,3,1,2] -> false
    //[1,1,1] -> false ok
    public boolean canBeIncreasing(int[] nums) {
        int violationCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                violationCount++;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return violationCount <= 1;
    }
}
