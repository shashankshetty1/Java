import java.util.Arrays;

public class linear2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13},
            {18, 12, 3, 9},
            {78, 99, 89, 80},
            {14, 12}
        };
        int target = 80;
        search(arr, target);
    }

    static void search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Found at: [" + row + ", " + col + "]");
                 return ;
                }
            }
        }
        System.out.println("Not found");
    }
}
