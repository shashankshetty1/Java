import java.util.Scanner;

public class arrayinputandoutput{
    public static void main(String[] args) {
        
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
            System.out.print("");
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
