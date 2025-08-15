import java.util.Arrays;
import java.util.Scanner;
public class maxarray {

    public static void main(String[] args) {
        

        int[] arr=new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The array elemets are "+ Arrays.toString(arr));
        System.out.println(arr.length);

        max(arr);
        min(arr);

    }

        public static void max(int arr1[]){
          

        int max=arr1[0];

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("the maximum value is "+max);     
    
    }
    public static void min(int arr2[]){
        int min=arr2[0];
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min){
                min=arr2[i];
            }

        }
        System.out.println("the minimum element is "+min);
    }

}
