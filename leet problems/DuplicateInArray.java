// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.


import java.util.Arrays;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1}; 
        Solution solution = new Solution();
        System.out.println(solution.hasDuplicate(nums)); 
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
