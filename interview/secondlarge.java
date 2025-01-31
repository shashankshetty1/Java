import java.util.*;

public class secondlarge {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Sort the array using bubble sort
       
        for (int i = 0; i < arr.length-1; i++) {
          
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] < arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
         
        }

        // Print the second smallest value
       
        
    }
    System.out.println("Second largest value: " +arr[1]);
    System.out.println("Second smalest value: " +arr[3]);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
    }
    }
}
