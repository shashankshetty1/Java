import java.util.*;
public class Reversarray {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        int min=0;
        int max=arr.length-1;

        while (min<max){
            swap(arr,min,max);
            min++;
            max--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }       
    }
    public static void swap(int arr[],int a,int b){

        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
