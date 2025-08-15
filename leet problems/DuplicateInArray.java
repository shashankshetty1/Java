// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.


import java.util.Arrays;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {4,2,3,3,1}; 
        hasDuplicate(nums); 
       
    }



    static void hasDuplicate(int[] nums) {
        Arrays.sort(nums);   // function to sort
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                 System.out.println(nums[i]);
                 return;
            }
        }
        System.out.println("false");
        System.out.println(Arrays.toString(nums)); 
    }
}
