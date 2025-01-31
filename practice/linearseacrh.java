import java.util.Scanner;

public class linearseacrh {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an element to search:");
        int target = in.nextInt();

        linearsearch(arr, target);
    }

    static void linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            boolean found = false;
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    System.out.println("Element is found at index " + index);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Element not found");
            }
        }
    }
}
