
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        System.out.print("Enter a number to check :");
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();

        int temp=no;
        int rem=0;
        int rev=0;

        while(temp!=0){

            rem = temp%10;
            rev= rev*10 + rem; 
            temp=temp/10;
            
        }
                if(no==rev){
            System.out.println(no+ " is palindrome");

        }else{
            System.out.println(no+ "  Not Plaindrome");
        }
        System.out.print(rev);


      
    }
    
}
