import java.util.Scanner;
public class shetty{
    public static void main(String[] args) {
        
        // int[] arr=new int[5];
        // arr[0]=102;
        // arr[1]=103;
        // arr[2]=130;
        // arr[3]=20;
        // arr[4]=1770;
        
        // System.out.println(arr[3]);
       

        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
          

        // }
       
        Scanner in =new Scanner(System.in);


        String[] arr=new String[3];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=in.next();
        }
        System.out.println(arr[2]);
        
        

        
    }
}