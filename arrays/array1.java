import java.util.Arrays;
import java.util.Scanner;

public class array1{
    public static void main(String[] args) {

        //basic

        // int[] a={1,2,3,4,5};
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
      

        // first thing in array


         Scanner in = new Scanner(System.in);

        //   int[] arr= new int[5];
        //   arr[0]=12;
        //   arr[1]=13;
        //   arr[2]=14;
        //   arr[3]=15;
        //   arr[4]=16;

        //   // using for loop, size of array by user itself

        
        //   for(int i=0;i<arr.length;i++){
        //     System.out.println("enter array");
        //     arr[i]=in.nextInt();
            
        //   }
        //   for(int i=0;i<arr.length;i++){
        //     System.out.println("the output" + arr[i]);
            
        //   }



        //              array of objects

              String str[] = new String[5];
              for(int i=0; i<str.length;i++){
                str[i]= in.next();
              }
              System.out.println(Arrays.toString(str));




         
        

    }
}