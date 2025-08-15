public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Selection sort
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
