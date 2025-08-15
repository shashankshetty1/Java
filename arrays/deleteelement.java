import java.util.Scanner;

public class deleteelement {
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,7,8};
         

         System.out.println("enter the value to be deleted");
         Scanner sc=new Scanner(System.in);
         int delete=sc.nextInt();

         int n=arr.length;
         System.out.println(n);
        

        

         for(int i=0;i<n;i++){
            if(arr[i]==delete){

                for(int j=i;j<n-1;j++){

                arr[j]=arr[j+1];
                }
               n--;
               i--;

            }
         }
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println(n);


    }

}
