import java.util.Scanner;

public class insertelement{
    
    public static void main(String[] args) {
         int arr[]={1,3,4,5,6,7,8};

         System.out.println("enter the value to be insert");
         Scanner sc=new Scanner(System.in);
         int insert =sc.nextInt();
         System.out.println("enter pos to insert");
         int pos=sc.nextInt();
          for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }


         int arr2[]= new int[arr.length+1];

         for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
         }

         arr2[pos]=insert;

         for(int i=pos;i<arr2.length-1;i++){
            arr2[i+1]=arr[i];
         }
         System.out.println("  ");
         System.out.println("The array after adding is");

        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
