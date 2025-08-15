
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        System.out.print("Enter a number to check :");
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();

        int temp=no;
        int rev=0;

        while(no!=0){

            rev = temp%10;
            System.out.println(rev);
            temp=temp/10;
        }
      
    }
    
}
