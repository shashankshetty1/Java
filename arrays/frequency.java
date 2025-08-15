import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

       System.out.print("Enetr the emelent to check :");
       Scanner sc=new Scanner(System.in);
       int target=sc.nextInt();
       int count =0;

       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count ++;

        }
       }
       System.out.println("THe target element " + target + " has occoured " + count + " times");
       allfreq(arr);      
}
public static void allfreq(int arr[]){

    for(int i=0;i<arr.length;i++){
        int count =0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        System.out.println(arr[i]+ " Appears " + count+" Times");
    }

}
 
}
