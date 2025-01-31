import java.util.Arrays;
import java.util.Scanner;

public class array1{
    public static void main(String[] args) {

        //basic
        
        // int[] ros=new int[5];
        // System.out.println(ros[0]);


        // first thing in array


         Scanner in = new Scanner(System.in);

        //   int[] arr= new int[5];
        //   arr[0]=12;
        //   arr[1]=13;
        //   arr[2]=14;
        //   arr[3]=15;
        //   arr[4]=16;
        //   System.out.println(arr[3]);

        //   // using for loop, size of array by user itself

        
        //   for(int i=0;i<arr.length;i++){
        //     arr[i]=in.nextInt();
        //   }
        //   for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        //   }



        //              array of objects

              String[] str = new String[5];
              for(int i=0; i<str.length;i++){
                str[i]= in.next();
              }
              System.out.println(Arrays.toString(str));




         
        

    }
}