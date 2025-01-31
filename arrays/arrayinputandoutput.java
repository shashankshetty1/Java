import java.util.Scanner;

public class arrayinputandoutput{
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // // Prompting the user for the size of the 2D array
        // System.out.print("Enter the number of rows: ");
        // int rows = scanner.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int columns = scanner.nextInt();

        // // Declaring the 2D array
        // int[][] array = new int[rows][columns];

        // // Reading input values for the 2D array
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         System.out.print("Element at [" + i + "][" + j + "]: ");
        //         array[i][j] = scanner.nextInt();
        //     }
        // }

        // // Printing the 2D array
        // System.out.println("The 2D array is:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }

// my own thing



        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("enter array elements");

        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
         }

         // printing the output

         System.out.println("the output looks like this");

         for(int i=0;i<row;i++){
             for(int j=0;j<arr[i].length;j++){
                 
                System.out.print(arr[i][j] + " ");
             }
             System.out.println();
          }







      
    }
}
