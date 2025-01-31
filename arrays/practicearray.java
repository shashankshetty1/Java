
import java.util.Scanner;

public class practicearray{
    public static void main(String[] args) {

// Scanner in = new Scanner(System.in);

// System.out.print("Enter the number of rows: ");
// int row = in.nextInt();
// System.out.print("Enter the number of columns: ");
// int col = in.nextInt();

int[][] arr = {
    {1,2,3},
    {2,2},
    {3,3,3},
};



for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
 }
    
}
}