import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        System.out.println("enter size of an array ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter"+n+"array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter key to find");
        int key=sc.nextInt();
        System.out.println(arr.length);

       int low=0;
       int high=arr.length-1;
       int mid=(low+high)/2;
       
       while(low<=high){
        if(arr[mid]==key){
            System.out.print("Element is in"+arr[mid]+"position");
            break;
        }
        else if(arr[mid]<key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        mid=(high+low)/2;
       }
       if(low>high){
        System.out.println("element "+key+" not found");
       }


       
    }
}
