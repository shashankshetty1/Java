import java.util.Arrays; // Import required for Arrays.toString()

public class Sortedroated {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        // Calling the 'roated' method
        roated(nums);
    }

    // This method checks all possible rotations of the array
    public static void roated(int nums[]) {
        int[] arr = new int[nums.length];

        // Loop through the array and check every rotation
        for (int i = 0; i < nums.length; i++) {

            // Rotate the array and store it in arr[]
            for (int j = 0; j < nums.length; j++) {
                arr[j] = nums[(i + j) % nums.length];
            }

            // Check if the rotated array is sorted
            if (sorted(arr)) {
                System.out.println("Sorted Rotation: " + Arrays.toString(arr));
            }
        }
        System.out.println("UNSorted Rotation: " + Arrays.toString(arr));
    }

    // Method that checks if the array is sorted
    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // If any element is greater than the next one, the array is not sorted
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true; // If no violations, the array is sorted
    }
}
