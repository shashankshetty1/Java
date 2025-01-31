
import java.util.Scanner;

public class multiDarray {
    public static void main(String[] args) {


        
        int[][] arr= new int[3][3];  
        Scanner in = new Scanner(System.in);


        // int[][] arr2= {
        //     {1,2,3},
        //     {3,4},
        //     {5,6,7},
        // };
       


        //input in 2d array

        for(int row=0;row<arr.length;row++){
            for( int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
               
            }
            System.out.println(" ");
        }

        //output

        for(int row=0;row<arr.length;row++){
            for( int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");

               
            }
            System.out.println(" ");
        }









       
    
}
}
