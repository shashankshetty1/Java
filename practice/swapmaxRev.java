import java.util.Arrays;


public class swapmaxRev {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};


        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));




    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;


    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static void reverse(int [] arr){

        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }


    
}
