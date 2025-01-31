public class InsertionSort {
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 1, 7, 9, 8};

            // Start from the second element and move backwards to place it in the correct position
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }

            // Print the sorted array
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
