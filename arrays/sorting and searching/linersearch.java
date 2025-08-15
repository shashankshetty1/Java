
import java.util.Scanner;

public class linersearch {
    
    public static void main(String[] args) {
        System.out.print("enter the array size --");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter key element to search ");
        int key=sc.nextInt();

        System.out.println("Array length is "+arr.length);
        int ans=-1; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               ans=i;
            }
            

        }
        if(ans==-1){
            System.out.println("Not found");
        }else{
        System.out.println("The elementh is found at index "+ans);
        }

        
    }
}
