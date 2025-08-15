
import java.util.*;

public class secondlarge {
    public static void main(String[] args) {
        int [] arr={1,2,32,12,4,5,6,7,8,10,67,90,88,8};

        int largest=0;
        int secondlargest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){


            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
        }
    }
    System.out.println("is " +secondlargest);

       
       
       }
       
    
}
